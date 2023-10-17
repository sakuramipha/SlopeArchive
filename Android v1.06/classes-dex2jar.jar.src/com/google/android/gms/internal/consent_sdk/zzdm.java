package com.google.android.gms.internal.consent_sdk;

public final class zzdm
  implements zzdo
{
  private zzdr zza;
  
  public static void zza(zzdr paramzzdr1, zzdr paramzzdr2)
  {
    paramzzdr1 = (zzdm)paramzzdr1;
    if (paramzzdr1.zza == null)
    {
      paramzzdr1.zza = paramzzdr2;
      return;
    }
    throw new IllegalStateException();
  }
  
  public final Object zzb()
  {
    zzdr localzzdr = this.zza;
    if (localzzdr != null) {
      return localzzdr.zzb();
    }
    throw new IllegalStateException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */