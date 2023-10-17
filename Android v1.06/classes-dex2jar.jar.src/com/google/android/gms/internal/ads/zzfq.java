package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class zzfq
  extends zzfr
{
  private final AssetManager zza;
  private Uri zzb;
  private InputStream zzc;
  private long zzd;
  private boolean zze;
  
  public zzfq(Context paramContext)
  {
    super(false);
    this.zza = paramContext.getAssets();
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzfp
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = this.zzd;
    if (l1 != 0L)
    {
      int i = paramInt2;
      long l2;
      if (l1 != -1L) {
        l2 = paramInt2;
      }
      try
      {
        i = (int)Math.min(l1, l2);
        InputStream localInputStream = this.zzc;
        paramInt2 = zzfn.zza;
        paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 == -1) {
          return -1;
        }
        l1 = this.zzd;
        if (l1 != -1L) {
          this.zzd = (l1 - paramInt1);
        }
        zzg(paramInt1);
        return paramInt1;
      }
      catch (IOException paramArrayOfByte)
      {
        throw new zzfp(paramArrayOfByte, 2000);
      }
    }
    return -1;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzfp
  {
    try
    {
      Object localObject = paramzzgc.zza;
      this.zzb = ((Uri)localObject);
      String str = ((Uri)localObject).getPath();
      Objects.requireNonNull(str);
      if (str.startsWith("/android_asset/"))
      {
        localObject = str.substring(15);
      }
      else
      {
        localObject = str;
        if (str.startsWith("/")) {
          localObject = str.substring(1);
        }
      }
      zzi(paramzzgc);
      localObject = this.zza.open((String)localObject, 1);
      this.zzc = ((InputStream)localObject);
      if (((InputStream)localObject).skip(paramzzgc.zzf) >= paramzzgc.zzf)
      {
        long l = paramzzgc.zzg;
        if (l != -1L)
        {
          this.zzd = l;
        }
        else
        {
          l = this.zzc.available();
          this.zzd = l;
          if (l == 2147483647L) {
            this.zzd = -1L;
          }
        }
        this.zze = true;
        zzj(paramzzgc);
        return this.zzd;
      }
      paramzzgc = new com/google/android/gms/internal/ads/zzfp;
      paramzzgc.<init>(null, 2008);
      throw paramzzgc;
    }
    catch (IOException paramzzgc)
    {
      int i;
      if (true != paramzzgc instanceof FileNotFoundException) {
        i = 2000;
      } else {
        i = 2005;
      }
      throw new zzfp(paramzzgc, i);
    }
    catch (zzfp paramzzgc)
    {
      throw paramzzgc;
    }
  }
  
  public final Uri zzc()
  {
    return this.zzb;
  }
  
  /* Error */
  public final void zzd()
    throws zzfp
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 70	com/google/android/gms/internal/ads/zzfq:zzb	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 45	com/google/android/gms/internal/ads/zzfq:zzc	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 133	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 45	com/google/android/gms/internal/ads/zzfq:zzc	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 123	com/google/android/gms/internal/ads/zzfq:zze	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 123	com/google/android/gms/internal/ads/zzfq:zze	Z
    //   35: aload_0
    //   36: invokevirtual 136	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   39: return
    //   40: astore_1
    //   41: goto +18 -> 59
    //   44: astore_2
    //   45: new 31	com/google/android/gms/internal/ads/zzfp
    //   48: astore_1
    //   49: aload_1
    //   50: aload_2
    //   51: sipush 2000
    //   54: invokespecial 62	com/google/android/gms/internal/ads/zzfp:<init>	(Ljava/lang/Throwable;I)V
    //   57: aload_1
    //   58: athrow
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 45	com/google/android/gms/internal/ads/zzfq:zzc	Ljava/io/InputStream;
    //   64: aload_0
    //   65: getfield 123	com/google/android/gms/internal/ads/zzfq:zze	Z
    //   68: ifne +6 -> 74
    //   71: goto +12 -> 83
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield 123	com/google/android/gms/internal/ads/zzfq:zze	Z
    //   79: aload_0
    //   80: invokevirtual 136	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	zzfq
    //   9	6	1	localInputStream	InputStream
    //   40	1	1	localObject	Object
    //   48	36	1	localzzfp	zzfp
    //   44	7	2	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   5	10	40	finally
    //   14	18	40	finally
    //   45	59	40	finally
    //   5	10	44	java/io/IOException
    //   14	18	44	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */