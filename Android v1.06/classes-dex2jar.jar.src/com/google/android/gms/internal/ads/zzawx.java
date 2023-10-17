package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

public final class zzawx
{
  private final zzaxd zza;
  private final zzaym zzb = zzayn.zzd();
  private final boolean zzc;
  
  private zzawx()
  {
    this.zzc = false;
    this.zza = new zzaxd();
  }
  
  public zzawx(zzaxd paramzzaxd)
  {
    this.zza = paramzzaxd;
    paramzzaxd = zzbbk.zzeE;
    this.zzc = ((Boolean)zzba.zzc().zzb(paramzzaxd)).booleanValue();
  }
  
  public static zzawx zza()
  {
    return new zzawx();
  }
  
  private final String zzd(int paramInt)
  {
    try
    {
      String str = String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[] { this.zzb.zzk(), Long.valueOf(zzt.zzB().elapsedRealtime()), Integer.valueOf(paramInt - 1), Base64.encodeToString(((zzayn)this.zzb.zzal()).zzax(), 3) });
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private final void zze(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 123	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnonnull +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: new 125	java/io/File
    //   16: astore_3
    //   17: aload_3
    //   18: aload_2
    //   19: ldc 127
    //   21: invokespecial 130	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: new 132	java/io/FileOutputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_3
    //   30: iconst_1
    //   31: invokespecial 135	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   34: aload_2
    //   35: aload_0
    //   36: iload_1
    //   37: invokespecial 137	com/google/android/gms/internal/ads/zzawx:zzd	(I)Ljava/lang/String;
    //   40: invokevirtual 140	java/lang/String:getBytes	()[B
    //   43: invokevirtual 144	java/io/FileOutputStream:write	([B)V
    //   46: aload_2
    //   47: invokevirtual 147	java/io/FileOutputStream:close	()V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_2
    //   54: ldc -107
    //   56: invokestatic 154	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_3
    //   63: goto +25 -> 88
    //   66: astore_3
    //   67: ldc -100
    //   69: invokestatic 154	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   72: aload_2
    //   73: invokevirtual 147	java/io/FileOutputStream:close	()V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_2
    //   80: ldc -107
    //   82: invokestatic 154	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_2
    //   89: invokevirtual 147	java/io/FileOutputStream:close	()V
    //   92: goto +9 -> 101
    //   95: astore_2
    //   96: ldc -107
    //   98: invokestatic 154	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   101: aload_3
    //   102: athrow
    //   103: astore_2
    //   104: ldc -98
    //   106: invokestatic 154	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: monitorexit
    //   111: return
    //   112: astore_2
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_2
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	zzawx
    //   0	117	1	paramInt	int
    //   5	42	2	localObject1	Object
    //   53	20	2	localIOException1	java.io.IOException
    //   79	10	2	localIOException2	java.io.IOException
    //   95	1	2	localIOException3	java.io.IOException
    //   103	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   112	4	2	localObject2	Object
    //   16	14	3	localFile	java.io.File
    //   62	1	3	localObject3	Object
    //   66	36	3	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   46	50	53	java/io/IOException
    //   34	46	62	finally
    //   67	72	62	finally
    //   34	46	66	java/io/IOException
    //   72	76	79	java/io/IOException
    //   88	92	95	java/io/IOException
    //   24	34	103	java/io/FileNotFoundException
    //   46	50	103	java/io/FileNotFoundException
    //   54	59	103	java/io/FileNotFoundException
    //   72	76	103	java/io/FileNotFoundException
    //   80	85	103	java/io/FileNotFoundException
    //   88	92	103	java/io/FileNotFoundException
    //   96	101	103	java/io/FileNotFoundException
    //   101	103	103	java/io/FileNotFoundException
    //   2	6	112	finally
    //   13	24	112	finally
    //   24	34	112	finally
    //   46	50	112	finally
    //   54	59	112	finally
    //   72	76	112	finally
    //   80	85	112	finally
    //   88	92	112	finally
    //   96	101	112	finally
    //   101	103	112	finally
    //   104	109	112	finally
  }
  
  private final void zzf(int paramInt)
  {
    try
    {
      Object localObject1 = this.zzb;
      ((zzaym)localObject1).zzd();
      ((zzaym)localObject1).zzc(zzs.zzd());
      zzaxd localzzaxd = this.zza;
      localObject1 = ((zzayn)this.zzb.zzal()).zzax();
      zzaxc localzzaxc = new com/google/android/gms/internal/ads/zzaxc;
      localzzaxc.<init>(localzzaxd, (byte[])localObject1, null);
      paramInt--;
      localzzaxc.zza(paramInt);
      localzzaxc.zzc();
      zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(paramInt, 10))));
      return;
    }
    finally {}
  }
  
  public final void zzb(zzaww paramzzaww)
  {
    try
    {
      boolean bool = this.zzc;
      if (bool) {
        try
        {
          paramzzaww.zza(this.zzb);
          return;
        }
        catch (NullPointerException paramzzaww)
        {
          zzt.zzo().zzu(paramzzaww, "AdMobClearcutLogger.modify");
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzc(int paramInt)
  {
    try
    {
      boolean bool = this.zzc;
      if (!bool) {
        return;
      }
      zzbbc localzzbbc = zzbbk.zzeF;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zze(paramInt);
        return;
      }
      zzf(paramInt);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */