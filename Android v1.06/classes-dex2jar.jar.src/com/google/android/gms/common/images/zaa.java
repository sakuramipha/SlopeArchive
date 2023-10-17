package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class zaa
  implements Runnable
{
  final ImageManager zaa;
  private final Uri zab;
  private final ParcelFileDescriptor zac;
  
  public zaa(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zab = paramUri;
    this.zac = paramParcelFileDescriptor;
  }
  
  public final void run()
  {
    Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    Object localObject2 = this.zac;
    Object localObject1 = null;
    boolean bool = false;
    if (localObject2 != null)
    {
      try
      {
        localObject2 = BitmapFactory.decodeFileDescriptor(((ParcelFileDescriptor)localObject2).getFileDescriptor());
        localObject1 = localObject2;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localObject3 = String.valueOf(this.zab);
        String.valueOf(localObject3).length();
        Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(localObject3)), localOutOfMemoryError);
        bool = true;
      }
      try
      {
        this.zac.close();
      }
      catch (IOException localIOException)
      {
        Log.e("ImageManager", "closed failed", localIOException);
      }
    }
    else
    {
      localObject1 = null;
      bool = false;
    }
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    Object localObject3 = this.zaa;
    ImageManager.zab((ImageManager)localObject3).post(new zac((ImageManager)localObject3, this.zab, (Bitmap)localObject1, bool, localCountDownLatch));
    try
    {
      localCountDownLatch.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      String str = String.valueOf(this.zab);
      String.valueOf(str).length();
      Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(str)));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */