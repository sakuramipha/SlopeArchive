package com.google.android.gms.internal.ads;

public final class zzkb
{
  public zzky zza;
  public int zzb;
  public boolean zzc;
  public int zzd;
  public boolean zze;
  public int zzf;
  private boolean zzg;
  
  public zzkb(zzky paramzzky)
  {
    this.zza = paramzzky;
  }
  
  public final void zza(int paramInt)
  {
    int i = this.zzg;
    boolean bool = true;
    if (1 != (i | paramInt)) {
      bool = false;
    }
    this.zzg = bool;
    this.zzb += paramInt;
  }
  
  public final void zzb(int paramInt)
  {
    this.zzg = true;
    this.zze = true;
    this.zzf = paramInt;
  }
  
  public final void zzc(zzky paramzzky)
  {
    boolean bool2 = this.zzg;
    boolean bool1;
    if (this.zza != paramzzky) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    this.zzg = (bool2 | bool1);
    this.zza = paramzzky;
  }
  
  public final void zzd(int paramInt)
  {
    boolean bool2 = this.zzc;
    boolean bool1 = true;
    if ((bool2) && (this.zzd != 5))
    {
      if (paramInt != 5) {
        bool1 = false;
      }
      zzdy.zzd(bool1);
      return;
    }
    this.zzg = true;
    this.zzc = true;
    this.zzd = paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */