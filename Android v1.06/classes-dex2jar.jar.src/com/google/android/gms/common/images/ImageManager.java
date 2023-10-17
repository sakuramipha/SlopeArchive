package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager
{
  private static final Object zaa = new Object();
  private static HashSet<Uri> zab = new HashSet();
  private static ImageManager zac;
  private final Context zad;
  private final Handler zae;
  private final ExecutorService zaf;
  private final zak zag;
  private final Map<zag, ImageReceiver> zah;
  private final Map<Uri, ImageReceiver> zai;
  private final Map<Uri, Long> zaj;
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.zad = paramContext.getApplicationContext();
    this.zae = new zaq(Looper.getMainLooper());
    this.zaf = zap.zaa().zab(4, 2);
    this.zag = new zak();
    this.zah = new HashMap();
    this.zai = new HashMap();
    this.zaj = new HashMap();
  }
  
  public static ImageManager create(Context paramContext)
  {
    if (zac == null) {
      zac = new ImageManager(paramContext, false);
    }
    return zac;
  }
  
  public void loadImage(ImageView paramImageView, int paramInt)
  {
    zaj(new zae(paramImageView, paramInt));
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri)
  {
    zaj(new zae(paramImageView, paramUri));
  }
  
  public void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    paramImageView = new zae(paramImageView, paramUri);
    paramImageView.zab = paramInt;
    zaj(paramImageView);
  }
  
  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    zaj(new zaf(paramOnImageLoadedListener, paramUri));
  }
  
  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    paramOnImageLoadedListener = new zaf(paramOnImageLoadedListener, paramUri);
    paramOnImageLoadedListener.zab = paramInt;
    zaj(paramOnImageLoadedListener);
  }
  
  public final void zaj(zag paramzag)
  {
    Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
    new zab(this, paramzag).run();
  }
  
  private final class ImageReceiver
    extends ResultReceiver
  {
    private final Uri zab;
    private final ArrayList<zag> zac;
    
    ImageReceiver(Uri paramUri)
    {
      super();
      this.zab = paramUri;
      this.zac = new ArrayList();
    }
    
    public final void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      paramBundle = ImageManager.this;
      ImageManager.zai(paramBundle).execute(new zaa(paramBundle, this.zab, localParcelFileDescriptor));
    }
    
    public final void zab(zag paramzag)
    {
      Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
      this.zac.add(paramzag);
    }
    
    public final void zac(zag paramzag)
    {
      Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
      this.zac.remove(paramzag);
    }
    
    public final void zad()
    {
      Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
      localIntent.setPackage("com.google.android.gms");
      localIntent.putExtra("com.google.android.gms.extras.uri", this.zab);
      localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
      localIntent.putExtra("com.google.android.gms.extras.priority", 3);
      ImageManager.zaa(ImageManager.this).sendBroadcast(localIntent);
    }
  }
  
  public static abstract interface OnImageLoadedListener
  {
    public abstract void onImageLoaded(Uri paramUri, Drawable paramDrawable, boolean paramBoolean);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */