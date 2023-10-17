package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;

public final class zae
  extends zag
{
  private final WeakReference<ImageView> zac;
  
  public zae(ImageView paramImageView, int paramInt)
  {
    super(Uri.EMPTY, paramInt);
    Asserts.checkNotNull(paramImageView);
    this.zac = new WeakReference(paramImageView);
  }
  
  public zae(ImageView paramImageView, Uri paramUri)
  {
    super(paramUri, 0);
    Asserts.checkNotNull(paramImageView);
    this.zac = new WeakReference(paramImageView);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zae)) {
      return false;
    }
    Object localObject = (zae)paramObject;
    paramObject = (ImageView)this.zac.get();
    localObject = (ImageView)((zae)localObject).zac.get();
    return (localObject != null) && (paramObject != null) && (Objects.equal(localObject, paramObject));
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  protected final void zaa(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    ImageView localImageView = (ImageView)this.zac.get();
    if (localImageView != null)
    {
      if ((!paramBoolean2) && (!paramBoolean3) && ((localImageView instanceof zaj)))
      {
        paramDrawable = (zaj)localImageView;
        throw null;
      }
      int j = 0;
      int i = j;
      if (!paramBoolean2) {
        if (paramBoolean1) {
          i = j;
        } else {
          i = 1;
        }
      }
      Object localObject = paramDrawable;
      if (i != 0)
      {
        Drawable localDrawable = localImageView.getDrawable();
        if (localDrawable != null)
        {
          localObject = localDrawable;
          if ((localDrawable instanceof zai)) {
            localObject = ((zai)localDrawable).zaa();
          }
        }
        else
        {
          localObject = null;
        }
        localObject = new zai((Drawable)localObject, paramDrawable);
      }
      localImageView.setImageDrawable((Drawable)localObject);
      if (!(localImageView instanceof zaj))
      {
        if ((localObject != null) && (i != 0)) {
          ((zai)localObject).zab(250);
        }
      }
      else
      {
        paramDrawable = (zaj)localImageView;
        throw null;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */