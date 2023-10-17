package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzahm
{
  public int zza;
  public long zzb;
  public int zzc;
  public int zzd;
  public int zze;
  public final int[] zzf = new int['ÿ'];
  private final zzfd zzg = new zzfd(255);
  
  public final void zza()
  {
    this.zza = 0;
    this.zzb = 0L;
    this.zzc = 0;
    this.zzd = 0;
    this.zze = 0;
  }
  
  public final boolean zzb(zzaap paramzzaap, boolean paramBoolean)
    throws IOException
  {
    zza();
    this.zzg.zzC(27);
    byte[] arrayOfByte = this.zzg.zzH();
    int i = 0;
    if ((zzaas.zzc(paramzzaap, arrayOfByte, 0, 27, paramBoolean)) && (this.zzg.zzs() == 1332176723L))
    {
      if (this.zzg.zzk() != 0)
      {
        if (paramBoolean) {
          return false;
        }
        throw zzce.zzc("unsupported bit stream revision");
      }
      this.zza = this.zzg.zzk();
      this.zzb = this.zzg.zzp();
      this.zzg.zzq();
      this.zzg.zzq();
      this.zzg.zzq();
      int j = this.zzg.zzk();
      this.zzc = j;
      this.zzd = (j + 27);
      this.zzg.zzC(j);
      if (zzaas.zzc(paramzzaap, this.zzg.zzH(), 0, this.zzc, paramBoolean))
      {
        while (i < this.zzc)
        {
          this.zzf[i] = this.zzg.zzk();
          this.zze += this.zzf[i];
          i++;
        }
        return true;
      }
    }
    return false;
  }
  
  public final boolean zzc(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    boolean bool2;
    if (paramzzaap.zzf() == paramzzaap.zze()) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    zzdy.zzd(bool2);
    this.zzg.zzC(4);
    boolean bool1;
    for (;;)
    {
      bool1 = paramLong < -1L;
      if (((bool1) && (paramzzaap.zzf() + 4L >= paramLong)) || (!zzaas.zzc(paramzzaap, this.zzg.zzH(), 0, 4, true))) {
        break label128;
      }
      this.zzg.zzF(0);
      if (this.zzg.zzs() == 1332176723L) {
        break;
      }
      ((zzaae)paramzzaap).zzo(1, false);
    }
    paramzzaap.zzj();
    return true;
    label128:
    while (((!bool1) || (paramzzaap.zzf() < paramLong)) && (paramzzaap.zzc(1) != -1)) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */