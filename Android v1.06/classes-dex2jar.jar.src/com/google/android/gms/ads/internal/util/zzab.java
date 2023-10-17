package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

public final class zzab
{
  private boolean zza = false;
  private float zzb = 1.0F;
  
  public static float zzb(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext == null) {
      return 0.0F;
    }
    int j = paramContext.getStreamMaxVolume(3);
    int i = paramContext.getStreamVolume(3);
    if (j == 0) {
      return 0.0F;
    }
    return i / j;
  }
  
  /* Error */
  private final boolean zzf()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	com/google/android/gms/ads/internal/util/zzab:zzb	F
    //   6: fstore_1
    //   7: fload_1
    //   8: fconst_0
    //   9: fcmpl
    //   10: iflt +9 -> 19
    //   13: iconst_1
    //   14: istore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_2
    //   18: ireturn
    //   19: iconst_0
    //   20: istore_2
    //   21: goto -6 -> 15
    //   24: astore_3
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_3
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	zzab
    //   6	2	1	f	float
    //   14	7	2	bool	boolean
    //   24	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
  }
  
  public final float zza()
  {
    try
    {
      if (zzf())
      {
        float f = this.zzb;
        return f;
      }
      return 1.0F;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzc(boolean paramBoolean)
  {
    try
    {
      this.zza = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzd(float paramFloat)
  {
    try
    {
      this.zzb = paramFloat;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zze()
  {
    try
    {
      boolean bool = this.zza;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */