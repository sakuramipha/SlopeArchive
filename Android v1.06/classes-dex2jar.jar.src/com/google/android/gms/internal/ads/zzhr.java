package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public abstract class zzhr
  implements zzle, zzlf
{
  private final Object zza = new Object();
  private final int zzb;
  private final zzkf zzc;
  private zzlg zzd;
  private int zze;
  private zzof zzf;
  private int zzg;
  private zzvc zzh;
  private zzam[] zzi;
  private long zzj;
  private long zzk;
  private boolean zzl;
  private boolean zzm;
  
  public zzhr(int paramInt)
  {
    this.zzb = paramInt;
    this.zzc = new zzkf();
    this.zzk = Long.MIN_VALUE;
  }
  
  private final void zzR(long paramLong, boolean paramBoolean)
    throws zzia
  {
    this.zzl = false;
    this.zzk = paramLong;
    zzv(paramLong, paramBoolean);
  }
  
  public final void zzA()
  {
    boolean bool;
    if (this.zzg == 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
  }
  
  public final void zzB(zzam[] paramArrayOfzzam, zzvc paramzzvc, long paramLong1, long paramLong2)
    throws zzia
  {
    zzdy.zzf(this.zzl ^ true);
    this.zzh = paramzzvc;
    if (this.zzk == Long.MIN_VALUE) {
      this.zzk = paramLong1;
    }
    this.zzi = paramArrayOfzzam;
    this.zzj = paramLong2;
    zzz(paramArrayOfzzam, paramLong1, paramLong2);
  }
  
  public final void zzC()
  {
    boolean bool;
    if (this.zzg == 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    zzkf localzzkf = this.zzc;
    localzzkf.zzb = null;
    localzzkf.zza = null;
    zzw();
  }
  
  public final void zzD(long paramLong)
    throws zzia
  {
    zzR(paramLong, false);
  }
  
  public final void zzE()
  {
    this.zzl = true;
  }
  
  public final void zzG()
    throws zzia
  {
    int i = this.zzg;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzg = 2;
    zzx();
  }
  
  public final void zzH()
  {
    boolean bool;
    if (this.zzg == 2) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzg = 1;
    zzy();
  }
  
  public final boolean zzI()
  {
    return this.zzk == Long.MIN_VALUE;
  }
  
  public final boolean zzJ()
  {
    return this.zzl;
  }
  
  protected final boolean zzK()
  {
    boolean bool;
    if (zzI())
    {
      bool = this.zzl;
    }
    else
    {
      zzvc localzzvc = this.zzh;
      Objects.requireNonNull(localzzvc);
      bool = localzzvc.zze();
    }
    return bool;
  }
  
  protected final zzam[] zzL()
  {
    zzam[] arrayOfzzam = this.zzi;
    Objects.requireNonNull(arrayOfzzam);
    return arrayOfzzam;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final int zzbc()
  {
    return this.zzg;
  }
  
  protected final int zzbd(zzkf paramzzkf, zzhi paramzzhi, int paramInt)
  {
    zzvc localzzvc = this.zzh;
    Objects.requireNonNull(localzzvc);
    paramInt = localzzvc.zza(paramzzkf, paramzzhi, paramInt);
    long l;
    if (paramInt == -4)
    {
      if (paramzzhi.zzg())
      {
        this.zzk = Long.MIN_VALUE;
        if (this.zzl) {
          return -4;
        }
        return -3;
      }
      l = paramzzhi.zzd + this.zzj;
      paramzzhi.zzd = l;
      this.zzk = Math.max(this.zzk, l);
    }
    else if (paramInt == -5)
    {
      paramzzhi = paramzzkf.zza;
      Objects.requireNonNull(paramzzhi);
      l = paramzzhi.zzq;
      if (l != Long.MAX_VALUE)
      {
        paramzzhi = paramzzhi.zzb();
        paramzzhi.zzW(l + this.zzj);
        paramzzkf.zza = paramzzhi.zzY();
        return -5;
      }
    }
    return paramInt;
  }
  
  /* Error */
  protected final zzia zzbe(Throwable paramThrowable, zzam paramzzam, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +52 -> 53
    //   4: aload_0
    //   5: getfield 166	com/google/android/gms/internal/ads/zzhr:zzm	Z
    //   8: ifne +45 -> 53
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield 166	com/google/android/gms/internal/ads/zzhr:zzm	Z
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual 170	com/google/android/gms/internal/ads/zzhr:zzQ	(Lcom/google/android/gms/internal/ads/zzam;)I
    //   21: istore 5
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield 166	com/google/android/gms/internal/ads/zzhr:zzm	Z
    //   28: iload 5
    //   30: bipush 7
    //   32: iand
    //   33: istore 5
    //   35: goto +21 -> 56
    //   38: astore_1
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield 166	com/google/android/gms/internal/ads/zzhr:zzm	Z
    //   44: aload_1
    //   45: athrow
    //   46: astore 6
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 166	com/google/android/gms/internal/ads/zzhr:zzm	Z
    //   53: iconst_4
    //   54: istore 5
    //   56: aload_1
    //   57: aload_0
    //   58: invokevirtual 174	com/google/android/gms/internal/ads/zzhr:zzM	()Ljava/lang/String;
    //   61: aload_0
    //   62: getfield 176	com/google/android/gms/internal/ads/zzhr:zze	I
    //   65: aload_2
    //   66: iload 5
    //   68: iload_3
    //   69: iload 4
    //   71: invokestatic 179	com/google/android/gms/internal/ads/zzia:zzb	(Ljava/lang/Throwable;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzam;IZI)Lcom/google/android/gms/internal/ads/zzia;
    //   74: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	zzhr
    //   0	75	1	paramThrowable	Throwable
    //   0	75	2	paramzzam	zzam
    //   0	75	3	paramBoolean	boolean
    //   0	75	4	paramInt	int
    //   21	46	5	i	int
    //   46	1	6	localzzia	zzia
    // Exception table:
    //   from	to	target	type
    //   16	23	38	finally
    //   16	23	46	com/google/android/gms/internal/ads/zzia
  }
  
  protected final int zzd(long paramLong)
  {
    zzvc localzzvc = this.zzh;
    Objects.requireNonNull(localzzvc);
    return localzzvc.zzb(paramLong - this.zzj);
  }
  
  public int zze()
    throws zzia
  {
    return 0;
  }
  
  public final long zzf()
  {
    return this.zzk;
  }
  
  protected final zzkf zzh()
  {
    zzkf localzzkf = this.zzc;
    localzzkf.zzb = null;
    localzzkf.zza = null;
    return localzzkf;
  }
  
  public zzkh zzi()
  {
    return null;
  }
  
  public final zzlf zzj()
  {
    return this;
  }
  
  protected final zzlg zzk()
  {
    zzlg localzzlg = this.zzd;
    Objects.requireNonNull(localzzlg);
    return localzzlg;
  }
  
  protected final zzof zzl()
  {
    zzof localzzof = this.zzf;
    Objects.requireNonNull(localzzof);
    return localzzof;
  }
  
  public final zzvc zzm()
  {
    return this.zzh;
  }
  
  public final void zzn()
  {
    synchronized (this.zza) {}
  }
  
  public final void zzo()
  {
    int i = this.zzg;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    zzdy.zzf(bool);
    zzkf localzzkf = this.zzc;
    localzzkf.zzb = null;
    localzzkf.zza = null;
    this.zzg = 0;
    this.zzh = null;
    this.zzi = null;
    this.zzl = false;
    zzt();
  }
  
  public final void zzp(zzlg paramzzlg, zzam[] paramArrayOfzzam, zzvc paramzzvc, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, long paramLong2, long paramLong3)
    throws zzia
  {
    boolean bool;
    if (this.zzg == 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzd = paramzzlg;
    this.zzg = 1;
    zzu(paramBoolean1, paramBoolean2);
    zzB(paramArrayOfzzam, paramzzvc, paramLong2, paramLong3);
    zzR(paramLong1, paramBoolean1);
  }
  
  public void zzq(int paramInt, Object paramObject)
    throws zzia
  {}
  
  public final void zzr(int paramInt, zzof paramzzof)
  {
    this.zze = paramInt;
    this.zzf = paramzzof;
  }
  
  public final void zzs()
    throws IOException
  {
    zzvc localzzvc = this.zzh;
    Objects.requireNonNull(localzzvc);
    localzzvc.zzd();
  }
  
  protected void zzt()
  {
    throw null;
  }
  
  protected void zzu(boolean paramBoolean1, boolean paramBoolean2)
    throws zzia
  {}
  
  protected void zzv(long paramLong, boolean paramBoolean)
    throws zzia
  {
    throw null;
  }
  
  protected void zzw() {}
  
  protected void zzx()
    throws zzia
  {}
  
  protected void zzy() {}
  
  protected void zzz(zzam[] paramArrayOfzzam, long paramLong1, long paramLong2)
    throws zzia
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */