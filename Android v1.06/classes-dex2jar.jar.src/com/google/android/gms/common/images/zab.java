package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;
import java.util.Map;

final class zab
  implements Runnable
{
  final ImageManager zaa;
  private final zag zab;
  
  public zab(ImageManager paramImageManager, zag paramzag)
  {
    this.zab = paramzag;
  }
  
  public final void run()
  {
    Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
    Object localObject1 = (ImageManager.ImageReceiver)ImageManager.zag(this.zaa).get(this.zab);
    if (localObject1 != null)
    {
      ImageManager.zag(this.zaa).remove(this.zab);
      ((ImageManager.ImageReceiver)localObject1).zac(this.zab);
    }
    localObject1 = this.zab;
    zad localzad = ((zag)localObject1).zaa;
    ??? = localzad.zaa;
    if (??? != null)
    {
      localObject1 = (Long)ImageManager.zaf(this.zaa).get(???);
      if (localObject1 != null)
      {
        if (SystemClock.elapsedRealtime() - ((Long)localObject1).longValue() < 3600000L)
        {
          localObject1 = this.zab;
          ??? = this.zaa;
          ((zag)localObject1).zab(ImageManager.zaa((ImageManager)???), ImageManager.zac((ImageManager)???), true);
          return;
        }
        ImageManager.zaf(this.zaa).remove(localzad.zaa);
      }
      this.zab.zaa(null, false, true, false);
      ??? = (ImageManager.ImageReceiver)ImageManager.zah(this.zaa).get(localzad.zaa);
      localObject1 = ???;
      if (??? == null)
      {
        localObject1 = new ImageManager.ImageReceiver(this.zaa, localzad.zaa);
        ImageManager.zah(this.zaa).put(localzad.zaa, localObject1);
      }
      ((ImageManager.ImageReceiver)localObject1).zab(this.zab);
      ??? = this.zab;
      if (!(??? instanceof zaf)) {
        ImageManager.zag(this.zaa).put(???, localObject1);
      }
      synchronized (ImageManager.zad())
      {
        if (!ImageManager.zae().contains(localzad.zaa))
        {
          ImageManager.zae().add(localzad.zaa);
          ((ImageManager.ImageReceiver)localObject1).zad();
        }
        return;
      }
    }
    ??? = this.zaa;
    ((zag)localObject2).zab(ImageManager.zaa((ImageManager)???), ImageManager.zac((ImageManager)???), true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\images\zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */