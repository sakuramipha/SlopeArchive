package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;

public final class zzajf
  implements zzaao
{
  public static final zzaav zza = zzajd.zza;
  private final zzfl zzb;
  private final SparseArray zzc;
  private final zzfd zzd;
  private final zzajc zze;
  private boolean zzf;
  private boolean zzg;
  private boolean zzh;
  private long zzi;
  private zzajb zzj;
  private zzaar zzk;
  private boolean zzl;
  
  public zzajf()
  {
    this.zzb = localzzfl;
    this.zzd = new zzfd(4096);
    this.zzc = new SparseArray();
    this.zze = new zzajc();
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzk);
    long l1 = paramzzaap.zzd();
    boolean bool1 = l1 < -1L;
    if (bool1)
    {
      localObject1 = this.zze;
      if (!((zzajc)localObject1).zze()) {
        return ((zzajc)localObject1).zza(paramzzaap, paramzzabk);
      }
    }
    if (!this.zzl)
    {
      this.zzl = true;
      localObject1 = this.zze;
      if (((zzajc)localObject1).zzb() != -9223372036854775807L)
      {
        localObject1 = new zzajb(((zzajc)localObject1).zzd(), ((zzajc)localObject1).zzb(), l1);
        this.zzj = ((zzajb)localObject1);
        this.zzk.zzN(((zzaaa)localObject1).zzb());
      }
      else
      {
        this.zzk.zzN(new zzabm(((zzajc)localObject1).zzb(), 0L));
      }
    }
    Object localObject1 = this.zzj;
    if ((localObject1 != null) && (((zzaaa)localObject1).zze())) {
      return ((zzaaa)localObject1).zza(paramzzaap, paramzzabk);
    }
    paramzzaap.zzj();
    if (bool1) {
      l1 -= paramzzaap.zze();
    } else {
      l1 = -1L;
    }
    if ((l1 != -1L) && (l1 < 4L)) {
      return -1;
    }
    if (!paramzzaap.zzm(this.zzd.zzH(), 0, 4, true)) {
      return -1;
    }
    this.zzd.zzF(0);
    int i = this.zzd.zze();
    if (i == 441) {
      return -1;
    }
    if (i == 442)
    {
      paramzzabk = this.zzd.zzH();
      paramzzaap = (zzaae)paramzzaap;
      paramzzaap.zzm(paramzzabk, 0, 10, false);
      this.zzd.zzF(9);
      paramzzaap.zzo((this.zzd.zzk() & 0x7) + 14, false);
      return 0;
    }
    if (i == 443)
    {
      paramzzabk = this.zzd.zzH();
      paramzzaap = (zzaae)paramzzaap;
      paramzzaap.zzm(paramzzabk, 0, 2, false);
      this.zzd.zzF(0);
      paramzzaap.zzo(this.zzd.zzo() + 6, false);
      return 0;
    }
    if (i >> 8 != 1)
    {
      ((zzaae)paramzzaap).zzo(1, false);
      return 0;
    }
    i &= 0xFF;
    localObject1 = (zzaje)this.zzc.get(i);
    Object localObject2 = localObject1;
    if (!this.zzf)
    {
      paramzzabk = (zzabk)localObject1;
      if (localObject1 == null)
      {
        localObject2 = null;
        if (i == 189)
        {
          paramzzabk = new zzahx(null);
          this.zzg = true;
          this.zzi = paramzzaap.zzf();
        }
        for (;;)
        {
          localObject2 = paramzzabk;
          break;
          if ((i & 0xE0) == 192)
          {
            paramzzabk = new zzaiv(null);
            this.zzg = true;
            this.zzi = paramzzaap.zzf();
          }
          else
          {
            if ((i & 0xF0) != 224) {
              break;
            }
            paramzzabk = new zzaij(null);
            this.zzh = true;
            this.zzi = paramzzaap.zzf();
          }
        }
        paramzzabk = (zzabk)localObject1;
        if (localObject2 != null)
        {
          paramzzabk = new zzajt(Integer.MIN_VALUE, i, 256);
          ((zzaih)localObject2).zzb(this.zzk, paramzzabk);
          paramzzabk = new zzaje((zzaih)localObject2, this.zzb);
          this.zzc.put(i, paramzzabk);
        }
      }
      boolean bool2 = this.zzg;
      long l2 = 1048576L;
      l1 = l2;
      if (bool2)
      {
        l1 = l2;
        if (this.zzh) {
          l1 = this.zzi + 8192L;
        }
      }
      localObject2 = paramzzabk;
      if (paramzzaap.zzf() > l1)
      {
        this.zzf = true;
        this.zzk.zzC();
        localObject2 = paramzzabk;
      }
    }
    paramzzabk = this.zzd.zzH();
    paramzzaap = (zzaae)paramzzaap;
    paramzzaap.zzm(paramzzabk, 0, 2, false);
    this.zzd.zzF(0);
    i = this.zzd.zzo() + 6;
    if (localObject2 == null)
    {
      paramzzaap.zzo(i, false);
    }
    else
    {
      this.zzd.zzC(i);
      paramzzaap.zzn(this.zzd.zzH(), 0, i, false);
      this.zzd.zzF(6);
      ((zzaje)localObject2).zza(this.zzd);
      paramzzaap = this.zzd;
      paramzzaap.zzE(paramzzaap.zzb());
    }
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzk = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    Object localObject = this.zzb;
    if (((zzfl)localObject).zze() != -9223372036854775807L)
    {
      paramLong1 = ((zzfl)localObject).zzc();
      if ((paramLong1 == -9223372036854775807L) || (paramLong1 == 0L) || (paramLong1 == paramLong2)) {}
    }
    else
    {
      ((zzfl)localObject).zzf(paramLong2);
    }
    localObject = this.zzj;
    int j = 0;
    int i = j;
    if (localObject != null) {
      ((zzaaa)localObject).zzd(paramLong2);
    }
    for (i = j; i < this.zzc.size(); i++) {
      ((zzaje)this.zzc.valueAt(i)).zzb();
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = new byte[14];
    paramzzaap = (zzaae)paramzzaap;
    paramzzaap.zzm(arrayOfByte, 0, 14, false);
    if (((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF) != 442) {
      return false;
    }
    if ((arrayOfByte[4] & 0xC4) != 68) {
      return false;
    }
    if ((arrayOfByte[6] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[8] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[9] & 0x1) != 1) {
      return false;
    }
    if ((arrayOfByte[12] & 0x3) != 3) {
      return false;
    }
    paramzzaap.zzl(arrayOfByte[13] & 0x7, false);
    paramzzaap.zzm(arrayOfByte, 0, 3, false);
    return ((arrayOfByte[0] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF) == 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */