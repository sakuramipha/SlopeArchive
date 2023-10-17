package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zac
  implements Runnable
{
  final ImageManager zaa;
  private final Uri zab;
  private final Bitmap zac;
  private final CountDownLatch zad;
  
  public zac(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.zab = paramUri;
    this.zac = paramBitmap;
    this.zad = paramCountDownLatch;
  }
  
  public final void run()
  {
    Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
    Bitmap localBitmap = this.zac;
    ??? = (ImageManager.ImageReceiver)ImageManager.zah(this.zaa).remove(this.zab);
    if (??? != null)
    {
      ArrayList localArrayList = ImageManager.ImageReceiver.zaa((ImageManager.ImageReceiver)???);
      int j = localArrayList.size();
      for (int i = 0; i < j; i++)
      {
        ??? = (zag)localArrayList.get(i);
        Object localObject3 = this.zac;
        if ((localObject3 != null) && (localBitmap != null))
        {
          ((zag)???).zac(ImageManager.zaa(this.zaa), (Bitmap)localObject3, false);
        }
        else
        {
          ImageManager.zaf(this.zaa).put(this.zab, Long.valueOf(SystemClock.elapsedRealtime()));
          localObject3 = this.zaa;
          ((zag)???).zab(ImageManager.zaa((ImageManager)localObject3), ImageManager.zac((ImageManager)localObject3), false);
        }
        if (!(??? instanceof zaf)) {
          ImageManager.zag(this.zaa).remove(???);
        }
      }
    }
    this.zad.countDown();
    synchronized (ImageManager.zad())
    {
      ImageManager.zae().remove(this.zab);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */