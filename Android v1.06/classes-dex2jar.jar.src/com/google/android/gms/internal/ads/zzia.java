package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;

public final class zzia
  extends zzcg
{
  public static final zzn zzd = zzhz.zza;
  private static final String zzl = Integer.toString(1001, 36);
  private static final String zzm = Integer.toString(1002, 36);
  private static final String zzn = Integer.toString(1003, 36);
  private static final String zzo = Integer.toString(1004, 36);
  private static final String zzp = Integer.toString(1005, 36);
  private static final String zzq = Integer.toString(1006, 36);
  public final int zze;
  public final String zzf;
  public final int zzg;
  public final zzam zzh;
  public final int zzi;
  public final zzbx zzj;
  final boolean zzk;
  
  private zzia(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    this(paramInt1, paramThrowable, null, paramInt2, null, -1, null, 4, false);
  }
  
  private zzia(int paramInt1, Throwable paramThrowable, String paramString1, int paramInt2, String paramString2, int paramInt3, zzam paramzzam, int paramInt4, boolean paramBoolean)
  {
    this(str, paramThrowable, paramInt2, paramInt1, paramString2, paramInt3, paramzzam, paramInt4, null, SystemClock.elapsedRealtime(), paramBoolean);
  }
  
  private zzia(String paramString1, Throwable paramThrowable, int paramInt1, int paramInt2, String paramString2, int paramInt3, zzam paramzzam, int paramInt4, zzbx paramzzbx, long paramLong, boolean paramBoolean)
  {
    super(paramString1, paramThrowable, paramInt1, paramLong);
    boolean bool2 = false;
    if (paramBoolean)
    {
      paramInt1 = paramInt2;
      if (paramInt1 == 1)
      {
        paramInt1 = 1;
      }
      else
      {
        bool1 = false;
        break label42;
      }
    }
    else
    {
      paramInt1 = paramInt2;
    }
    boolean bool1 = true;
    label42:
    zzdy.zzd(bool1);
    if (paramThrowable == null) {
      bool1 = bool2;
    } else {
      bool1 = true;
    }
    zzdy.zzd(bool1);
    this.zze = paramInt1;
    this.zzf = paramString2;
    this.zzg = paramInt3;
    this.zzh = paramzzam;
    this.zzi = paramInt4;
    this.zzj = paramzzbx;
    this.zzk = paramBoolean;
  }
  
  public static zzia zzb(Throwable paramThrowable, String paramString, int paramInt1, zzam paramzzam, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (paramzzam == null) {
      paramInt2 = 4;
    }
    return new zzia(1, paramThrowable, null, paramInt3, paramString, paramInt1, paramzzam, paramInt2, paramBoolean);
  }
  
  public static zzia zzc(IOException paramIOException, int paramInt)
  {
    return new zzia(0, paramIOException, paramInt);
  }
  
  public static zzia zzd(RuntimeException paramRuntimeException, int paramInt)
  {
    return new zzia(2, paramRuntimeException, paramInt);
  }
  
  final zzia zza(zzbx paramzzbx)
  {
    String str = getMessage();
    int i = zzfn.zza;
    return new zzia(str, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, paramzzbx, this.zzc, this.zzk);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */