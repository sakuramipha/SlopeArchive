package com.google.android.gms.internal.measurement;

final class zzjd
  extends zzjf
{
  private final byte[] zzb;
  private int zzc;
  private int zzd;
  private int zze;
  
  public final int zza(int paramInt)
    throws zzkm
  {
    int i = this.zze;
    this.zze = 0;
    paramInt = this.zzc + this.zzd;
    this.zzc = paramInt;
    if (paramInt > 0)
    {
      this.zzd = paramInt;
      this.zzc = 0;
    }
    else
    {
      this.zzd = 0;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */