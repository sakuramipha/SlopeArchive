package com.google.android.gms.internal.consent_sdk;

import javax.annotation.CheckForNull;

final class zzdd
  extends zzde
{
  final transient int zza;
  final transient int zzb;
  final zzde zzc;
  
  zzdd(zzde paramzzde, int paramInt1, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    zzcx.zza(paramInt, this.zzb, "index");
    return this.zzc.get(paramInt + this.zza);
  }
  
  public final int size()
  {
    return this.zzb;
  }
  
  final int zzb()
  {
    return this.zzc.zzc() + this.zza + this.zzb;
  }
  
  final int zzc()
  {
    return this.zzc.zzc() + this.zza;
  }
  
  @CheckForNull
  final Object[] zze()
  {
    return this.zzc.zze();
  }
  
  public final zzde zzf(int paramInt1, int paramInt2)
  {
    zzcx.zzc(paramInt1, paramInt2, this.zzb);
    zzde localzzde = this.zzc;
    int i = this.zza;
    return localzzde.zzf(paramInt1 + i, paramInt2 + i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */