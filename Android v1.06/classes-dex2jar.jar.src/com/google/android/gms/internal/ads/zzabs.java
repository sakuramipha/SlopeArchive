package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzabs
{
  private final byte[] zza = new byte[10];
  private boolean zzb;
  private int zzc;
  private long zzd;
  private int zze;
  private int zzf;
  private int zzg;
  
  public final void zza(zzabr paramzzabr, zzabq paramzzabq)
  {
    if (this.zzc > 0)
    {
      paramzzabr.zzs(this.zzd, this.zze, this.zzf, this.zzg, paramzzabq);
      this.zzc = 0;
    }
  }
  
  public final void zzb()
  {
    this.zzb = false;
    this.zzc = 0;
  }
  
  public final void zzc(zzabr paramzzabr, long paramLong, int paramInt1, int paramInt2, int paramInt3, zzabq paramzzabq)
  {
    if (this.zzg <= paramInt2 + paramInt3)
    {
      if (!this.zzb) {
        return;
      }
      int i = this.zzc;
      int j = i + 1;
      this.zzc = j;
      if (i == 0)
      {
        this.zzd = paramLong;
        this.zze = paramInt1;
        this.zzf = 0;
      }
      this.zzf += paramInt2;
      this.zzg = paramInt3;
      if (j >= 16) {
        zza(paramzzabr, paramzzabq);
      }
      return;
    }
    throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
  }
  
  public final void zzd(zzaap paramzzaap)
    throws IOException
  {
    if (this.zzb) {
      return;
    }
    paramzzaap.zzh(this.zza, 0, 10);
    paramzzaap.zzj();
    paramzzaap = this.zza;
    int i = zzzp.zza;
    if ((paramzzaap[4] == -8) && (paramzzaap[5] == 114) && (paramzzaap[6] == 111) && ((paramzzaap[7] & 0xFE) == 186)) {
      this.zzb = true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */