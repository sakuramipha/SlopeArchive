package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class zzvb
  implements zzabr
{
  private boolean zzA;
  private boolean zzB;
  private zzqs zzC;
  private final zzuv zza;
  private final zzux zzb;
  private final zzvi zzc;
  private final zzqr zzd;
  private final zzql zze;
  private zzva zzf;
  private zzam zzg;
  private int zzh;
  private long[] zzi;
  private long[] zzj;
  private int[] zzk;
  private int[] zzl;
  private long[] zzm;
  private zzabq[] zzn;
  private int zzo;
  private int zzp;
  private int zzq;
  private int zzr;
  private long zzs;
  private long zzt;
  private long zzu;
  private boolean zzv;
  private boolean zzw;
  private boolean zzx;
  private zzam zzy;
  private zzam zzz;
  
  protected zzvb(zzxm paramzzxm, zzqr paramzzqr, zzql paramzzql)
  {
    this.zzd = paramzzqr;
    this.zze = paramzzql;
    this.zza = new zzuv(paramzzxm);
    this.zzb = new zzux();
    this.zzh = 1000;
    this.zzi = new long['Ϩ'];
    this.zzj = new long['Ϩ'];
    this.zzm = new long['Ϩ'];
    this.zzl = new int['Ϩ'];
    this.zzk = new int['Ϩ'];
    this.zzn = new zzabq['Ϩ'];
    this.zzc = new zzvi(zzuw.zza);
    this.zzs = Long.MIN_VALUE;
    this.zzt = Long.MIN_VALUE;
    this.zzu = Long.MIN_VALUE;
    this.zzx = true;
    this.zzw = true;
  }
  
  private final int zzA(int paramInt)
  {
    int i = this.zzq + paramInt;
    paramInt = this.zzh;
    if (i < paramInt) {
      return i;
    }
    return i - paramInt;
  }
  
  private final int zzB(zzkf paramzzkf, zzhi paramzzhi, boolean paramBoolean1, boolean paramBoolean2, zzux paramzzux)
  {
    try
    {
      paramzzhi.zzc = false;
      if (!zzJ())
      {
        if ((!paramBoolean2) && (!this.zzv))
        {
          paramzzhi = this.zzz;
          if ((paramzzhi != null) && ((paramBoolean1) || (paramzzhi != this.zzg)))
          {
            zzG(paramzzhi, paramzzkf);
            return -5;
          }
          return -3;
        }
        paramzzhi.zzc(4);
        return -4;
      }
      zzam localzzam = ((zzuz)this.zzc.zza(this.zzp + this.zzr)).zza;
      if ((!paramBoolean1) && (localzzam == this.zzg))
      {
        int i = zzA(this.zzr);
        if (!zzK(i))
        {
          paramzzhi.zzc = true;
          return -3;
        }
        paramzzhi.zzc(this.zzl[i]);
        if ((this.zzr == this.zzo - 1) && ((paramBoolean2) || (this.zzv))) {
          paramzzhi.zza(536870912);
        }
        long l = this.zzm[i];
        paramzzhi.zzd = l;
        if (l < this.zzs) {
          paramzzhi.zza(Integer.MIN_VALUE);
        }
        paramzzux.zza = this.zzk[i];
        paramzzux.zzb = this.zzj[i];
        paramzzux.zzc = this.zzn[i];
        return -4;
      }
      zzG(localzzam, paramzzkf);
      return -5;
    }
    finally {}
  }
  
  private final long zzC(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int j = this.zzo;
      if (j != 0)
      {
        long[] arrayOfLong = this.zzm;
        int k = this.zzq;
        if (paramLong >= arrayOfLong[k])
        {
          int i = j;
          if (paramBoolean2)
          {
            int m = this.zzr;
            i = j;
            if (m != j) {
              i = m + 1;
            }
          }
          i = zzz(k, i, paramLong, false);
          if (i == -1) {
            return -1L;
          }
          paramLong = zzE(i);
          return paramLong;
        }
      }
      return -1L;
    }
    finally {}
  }
  
  private final long zzD()
  {
    try
    {
      int i = this.zzo;
      if (i == 0) {
        return -1L;
      }
      long l = zzE(i);
      return l;
    }
    finally {}
  }
  
  private final long zzE(int paramInt)
  {
    long l3 = this.zzt;
    long l1 = Long.MIN_VALUE;
    if (paramInt != 0)
    {
      i = zzA(paramInt - 1);
      j = 0;
      for (long l2 = l1;; l2 = l1)
      {
        l1 = l2;
        if (j >= paramInt) {
          break;
        }
        l1 = Math.max(l2, this.zzm[i]);
        if ((this.zzl[i] & 0x1) != 0) {
          break;
        }
        k = i - 1;
        i = k;
        if (k == -1) {
          i = this.zzh - 1;
        }
        j++;
      }
    }
    this.zzt = Math.max(l3, l1);
    this.zzo -= paramInt;
    int i = this.zzp + paramInt;
    this.zzp = i;
    int j = this.zzq + paramInt;
    this.zzq = j;
    int k = this.zzh;
    if (j >= k) {
      this.zzq = (j - k);
    }
    paramInt = this.zzr - paramInt;
    this.zzr = paramInt;
    if (paramInt < 0) {
      this.zzr = 0;
    }
    this.zzc.zze(i);
    if (this.zzo == 0)
    {
      i = this.zzq;
      paramInt = i;
      if (i == 0) {
        paramInt = this.zzh;
      }
      long[] arrayOfLong = this.zzj;
      paramInt--;
      return arrayOfLong[paramInt] + this.zzk[paramInt];
    }
    return this.zzj[this.zzq];
  }
  
  private final void zzF(long paramLong1, int paramInt1, long paramLong2, int paramInt2, zzabq paramzzabq)
  {
    try
    {
      int i = this.zzo;
      boolean bool;
      if (i > 0)
      {
        i = zzA(i - 1);
        if (this.zzj[i] + this.zzk[i] <= paramLong2) {
          bool = true;
        } else {
          bool = false;
        }
        zzdy.zzd(bool);
      }
      if ((0x20000000 & paramInt1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.zzv = bool;
      this.zzu = Math.max(this.zzu, paramLong1);
      i = zzA(this.zzo);
      this.zzm[i] = paramLong1;
      this.zzj[i] = paramLong2;
      this.zzk[i] = paramInt2;
      this.zzl[i] = paramInt1;
      this.zzn[i] = paramzzabq;
      this.zzi[i] = 0L;
      Object localObject3;
      Object localObject1;
      Object localObject2;
      if ((this.zzc.zzf()) || (!((zzuz)this.zzc.zzb()).zza.equals(this.zzz)))
      {
        paramzzabq = zzqq.zzb;
        localObject3 = this.zzc;
        paramInt1 = this.zzp;
        paramInt2 = this.zzo;
        localObject1 = new com/google/android/gms/internal/ads/zzuz;
        localObject2 = this.zzz;
        Objects.requireNonNull(localObject2);
        ((zzuz)localObject1).<init>((zzam)localObject2, paramzzabq, null);
        ((zzvi)localObject3).zzc(paramInt1 + paramInt2, localObject1);
      }
      paramInt1 = this.zzo + 1;
      this.zzo = paramInt1;
      paramInt2 = this.zzh;
      if (paramInt1 == paramInt2)
      {
        paramInt1 = paramInt2 + 1000;
        long[] arrayOfLong = new long[paramInt1];
        localObject2 = new long[paramInt1];
        localObject1 = new long[paramInt1];
        localObject3 = new int[paramInt1];
        paramzzabq = new int[paramInt1];
        zzabq[] arrayOfzzabq = new zzabq[paramInt1];
        i = this.zzq;
        paramInt2 -= i;
        System.arraycopy(this.zzj, i, localObject2, 0, paramInt2);
        System.arraycopy(this.zzm, this.zzq, localObject1, 0, paramInt2);
        System.arraycopy(this.zzl, this.zzq, localObject3, 0, paramInt2);
        System.arraycopy(this.zzk, this.zzq, paramzzabq, 0, paramInt2);
        System.arraycopy(this.zzn, this.zzq, arrayOfzzabq, 0, paramInt2);
        System.arraycopy(this.zzi, this.zzq, arrayOfLong, 0, paramInt2);
        i = this.zzq;
        System.arraycopy(this.zzj, 0, localObject2, paramInt2, i);
        System.arraycopy(this.zzm, 0, localObject1, paramInt2, i);
        System.arraycopy(this.zzl, 0, localObject3, paramInt2, i);
        System.arraycopy(this.zzk, 0, paramzzabq, paramInt2, i);
        System.arraycopy(this.zzn, 0, arrayOfzzabq, paramInt2, i);
        System.arraycopy(this.zzi, 0, arrayOfLong, paramInt2, i);
        this.zzj = ((long[])localObject2);
        this.zzm = ((long[])localObject1);
        this.zzl = ((int[])localObject3);
        this.zzk = paramzzabq;
        this.zzn = arrayOfzzabq;
        this.zzi = arrayOfLong;
        this.zzq = 0;
        this.zzh = paramInt1;
        return;
      }
      return;
    }
    finally {}
  }
  
  private final void zzG(zzam paramzzam, zzkf paramzzkf)
  {
    Object localObject1 = this.zzg;
    int i;
    if (localObject1 == null) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject2 = null;
    if (i != 0) {
      localObject1 = null;
    } else {
      localObject1 = ((zzam)localObject1).zzp;
    }
    this.zzg = paramzzam;
    zzad localzzad = paramzzam.zzp;
    paramzzkf.zza = paramzzam.zzc(this.zzd.zza(paramzzam));
    paramzzkf.zzb = this.zzC;
    if ((i == 0) && (zzfn.zzB(localObject1, localzzad))) {
      return;
    }
    if (paramzzam.zzp == null) {
      paramzzam = (zzam)localObject2;
    } else {
      paramzzam = new zzqs(new zzqj(new zzqu(1), 6001));
    }
    this.zzC = paramzzam;
    paramzzkf.zzb = paramzzam;
  }
  
  private final void zzH()
  {
    if (this.zzC != null)
    {
      this.zzC = null;
      this.zzg = null;
    }
  }
  
  private final void zzI()
  {
    try
    {
      this.zzr = 0;
      this.zza.zzg();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final boolean zzJ()
  {
    return this.zzr != this.zzo;
  }
  
  private final boolean zzK(int paramInt)
  {
    zzqs localzzqs = this.zzC;
    boolean bool = false;
    if (localzzqs != null)
    {
      if ((this.zzl[paramInt] & 0x40000000) == 0) {
        return false;
      }
    }
    else {
      bool = true;
    }
    return bool;
  }
  
  private final boolean zzL(zzam paramzzam)
  {
    try
    {
      this.zzx = false;
      boolean bool = zzfn.zzB(paramzzam, this.zzz);
      if (bool) {
        return false;
      }
      if ((!this.zzc.zzf()) && (((zzuz)this.zzc.zzb()).zza.equals(paramzzam))) {
        this.zzz = ((zzuz)this.zzc.zzb()).zza;
      } else {
        this.zzz = paramzzam;
      }
      paramzzam = this.zzz;
      this.zzA = zzcd.zze(paramzzam.zzm, paramzzam.zzj);
      this.zzB = false;
      return true;
    }
    finally {}
  }
  
  private final int zzz(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i = -1;
    int k = 0;
    int j = paramInt1;
    paramInt1 = k;
    for (;;)
    {
      k = i;
      if (paramInt1 >= paramInt2) {
        break;
      }
      boolean bool = this.zzm[j] < paramLong;
      k = i;
      if (bool) {
        break;
      }
      if (paramBoolean)
      {
        k = i;
        if ((this.zzl[j] & 0x1) == 0) {}
      }
      else
      {
        i = paramInt1;
        k = i;
        if (!bool)
        {
          k = i;
          break;
        }
      }
      i = j + 1;
      j = i;
      if (i == this.zzh) {
        j = 0;
      }
      paramInt1++;
      i = k;
    }
    return k;
  }
  
  public final int zza()
  {
    return this.zzp + this.zzr;
  }
  
  public final int zzb(long paramLong, boolean paramBoolean)
  {
    try
    {
      int i = this.zzr;
      int j = zzA(i);
      if ((zzJ()) && (paramLong >= this.zzm[j]))
      {
        if ((paramLong > this.zzu) && (paramBoolean))
        {
          j = this.zzo;
          return j - i;
        }
        i = zzz(j, this.zzo - i, paramLong, true);
        if (i == -1) {
          return 0;
        }
        return i;
      }
      return 0;
    }
    finally {}
  }
  
  public final int zzc()
  {
    return this.zzp + this.zzo;
  }
  
  public final int zzd(zzkf paramzzkf, zzhi paramzzhi, int paramInt, boolean paramBoolean)
  {
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    int j = zzB(paramzzkf, paramzzhi, bool, paramBoolean, this.zzb);
    int i = j;
    if (j == -4)
    {
      if (!paramzzhi.zzg())
      {
        i = paramInt & 0x1;
        if ((paramInt & 0x4) == 0)
        {
          if (i != 0)
          {
            this.zza.zzd(paramzzhi, this.zzb);
            break label116;
          }
          this.zza.zze(paramzzhi, this.zzb);
        }
        else
        {
          if (i != 0) {
            break label116;
          }
        }
        this.zzr += 1;
        return -4;
      }
      label116:
      i = -4;
    }
    return i;
  }
  
  public final int zzf(zzt paramzzt, int paramInt1, boolean paramBoolean, int paramInt2)
    throws IOException
  {
    return this.zza.zza(paramzzt, paramInt1, paramBoolean);
  }
  
  public final long zzg()
  {
    try
    {
      long l = this.zzu;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzam zzh()
  {
    try
    {
      boolean bool = this.zzx;
      if (bool) {
        return null;
      }
      zzam localzzam = this.zzz;
      return localzzam;
    }
    finally {}
  }
  
  public final void zzi(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza.zzc(zzC(paramLong, false, paramBoolean2));
  }
  
  public final void zzj()
  {
    this.zza.zzc(zzD());
  }
  
  public final void zzk(zzam paramzzam)
  {
    this.zzy = paramzzam;
    boolean bool = zzL(paramzzam);
    zzva localzzva = this.zzf;
    if ((localzzva != null) && (bool)) {
      localzzva.zzL(paramzzam);
    }
  }
  
  public final void zzm()
    throws IOException
  {
    zzqs localzzqs = this.zzC;
    if (localzzqs == null) {
      return;
    }
    throw localzzqs.zza();
  }
  
  public final void zzn()
  {
    zzj();
    zzH();
  }
  
  public final void zzo()
  {
    zzp(true);
    zzH();
  }
  
  public final void zzp(boolean paramBoolean)
  {
    this.zza.zzf();
    this.zzo = 0;
    this.zzp = 0;
    this.zzq = 0;
    this.zzr = 0;
    this.zzw = true;
    this.zzs = Long.MIN_VALUE;
    this.zzt = Long.MIN_VALUE;
    this.zzu = Long.MIN_VALUE;
    this.zzv = false;
    this.zzc.zzd();
    if (paramBoolean)
    {
      this.zzy = null;
      this.zzz = null;
      this.zzx = true;
    }
  }
  
  public final void zzr(zzfd paramzzfd, int paramInt1, int paramInt2)
  {
    this.zza.zzh(paramzzfd, paramInt1);
  }
  
  public final void zzs(long paramLong, int paramInt1, int paramInt2, int paramInt3, zzabq paramzzabq)
  {
    if (this.zzw)
    {
      if ((paramInt1 & 0x1) == 0) {
        return;
      }
      this.zzw = false;
    }
    int i = paramInt1;
    if (this.zzA)
    {
      if (paramLong < this.zzs) {
        return;
      }
      i = paramInt1;
      if ((paramInt1 & 0x1) == 0)
      {
        if (!this.zzB)
        {
          zzer.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
          this.zzB = true;
        }
        i = paramInt1 | 0x1;
      }
    }
    zzF(paramLong, i, this.zza.zzb() - paramInt2 - paramInt3, paramInt2, paramzzabq);
  }
  
  public final void zzt(long paramLong)
  {
    this.zzs = paramLong;
  }
  
  public final void zzu(zzva paramzzva)
  {
    this.zzf = paramzzva;
  }
  
  public final void zzv(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      try
      {
        if (this.zzr + paramInt <= this.zzo) {
          bool1 = true;
        }
      }
      finally
      {
        break label52;
      }
    }
    zzdy.zzd(bool1);
    this.zzr += paramInt;
    return;
    label52:
    throw ((Throwable)localObject);
  }
  
  public final boolean zzw()
  {
    try
    {
      boolean bool = this.zzv;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzx(boolean paramBoolean)
  {
    try
    {
      boolean bool1 = zzJ();
      boolean bool2 = true;
      if (!bool1)
      {
        bool1 = bool2;
        if (!paramBoolean)
        {
          bool1 = bool2;
          if (!this.zzv)
          {
            localzzam1 = this.zzz;
            if (localzzam1 != null)
            {
              localzzam2 = this.zzg;
              if (localzzam1 != localzzam2) {
                bool1 = bool2;
              } else {
                return false;
              }
            }
            else
            {
              bool1 = false;
            }
          }
        }
        return bool1;
      }
      zzam localzzam2 = ((zzuz)this.zzc.zza(this.zzp + this.zzr)).zza;
      zzam localzzam1 = this.zzg;
      if (localzzam2 != localzzam1) {
        return true;
      }
      paramBoolean = zzK(zzA(this.zzr));
      return paramBoolean;
    }
    finally {}
  }
  
  public final boolean zzy(long paramLong, boolean paramBoolean)
  {
    try
    {
      zzI();
      int i = this.zzr;
      int j = zzA(i);
      if ((zzJ()) && (paramLong >= this.zzm[j]) && ((paramLong <= this.zzu) || (paramBoolean)))
      {
        i = zzz(j, this.zzo - i, paramLong, true);
        if (i == -1) {
          return false;
        }
        this.zzs = paramLong;
        this.zzr += i;
        return true;
      }
      return false;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */