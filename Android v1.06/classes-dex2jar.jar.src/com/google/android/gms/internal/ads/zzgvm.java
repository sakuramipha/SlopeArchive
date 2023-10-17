package com.google.android.gms.internal.ads;

public final class zzgvm
  implements zzgvo
{
  private zzgwb zza;
  
  public static void zza(zzgwb paramzzgwb1, zzgwb paramzzgwb2)
  {
    paramzzgwb1 = (zzgvm)paramzzgwb1;
    if (paramzzgwb1.zza == null)
    {
      paramzzgwb1.zza = paramzzgwb2;
      return;
    }
    throw new IllegalStateException();
  }
  
  public final Object zzb()
  {
    zzgwb localzzgwb = this.zza;
    if (localzzgwb != null) {
      return localzzgwb.zzb();
    }
    throw new IllegalStateException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */