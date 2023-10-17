package com.google.android.gms.internal.ads;

final class zzair
{
  private final zzabr zza;
  private long zzb;
  private boolean zzc;
  private int zzd;
  private long zze;
  private boolean zzf;
  private boolean zzg;
  private boolean zzh;
  private boolean zzi;
  private boolean zzj;
  private long zzk;
  private long zzl;
  private boolean zzm;
  
  public zzair(zzabr paramzzabr)
  {
    this.zza = paramzzabr;
  }
  
  private final void zze(int paramInt)
  {
    long l1 = this.zzl;
    if (l1 == -9223372036854775807L) {
      return;
    }
    int i = this.zzm;
    long l3 = this.zzb;
    long l2 = this.zzk;
    this.zza.zzs(l1, i, (int)(l3 - l2), paramInt, null);
  }
  
  public final void zza(long paramLong, int paramInt, boolean paramBoolean)
  {
    if ((this.zzj) && (this.zzg))
    {
      this.zzm = this.zzc;
      this.zzj = false;
      return;
    }
    if ((!this.zzh) && (!this.zzg)) {
      return;
    }
    if ((paramBoolean) && (this.zzi)) {
      zze(paramInt + (int)(paramLong - this.zzb));
    }
    this.zzk = this.zzb;
    this.zzl = this.zze;
    this.zzm = this.zzc;
    this.zzi = true;
  }
  
  public final void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.zzf)
    {
      int j = this.zzd;
      int i = paramInt1 + 2 - j;
      if (i < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[i] & 0x80) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        this.zzg = bool;
        this.zzf = false;
        return;
      }
      this.zzd = (j + (paramInt2 - paramInt1));
    }
  }
  
  public final void zzc()
  {
    this.zzf = false;
    this.zzg = false;
    this.zzh = false;
    this.zzi = false;
    this.zzj = false;
  }
  
  public final void zzd(long paramLong1, int paramInt1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    boolean bool = false;
    this.zzg = false;
    this.zzh = false;
    this.zze = paramLong2;
    this.zzd = 0;
    this.zzb = paramLong1;
    if ((paramInt2 >= 32) && (paramInt2 != 40))
    {
      if ((this.zzi) && (!this.zzj))
      {
        if (paramBoolean) {
          zze(paramInt1);
        }
        this.zzi = false;
      }
      if ((paramInt2 <= 35) || (paramInt2 == 39))
      {
        this.zzh = (this.zzj ^ true);
        this.zzj = true;
      }
    }
    if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.zzc = paramBoolean;
    if (!paramBoolean)
    {
      paramBoolean = bool;
      if (paramInt2 > 9) {}
    }
    else
    {
      paramBoolean = true;
    }
    this.zzf = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */