package com.google.android.gms.internal.ads;

public final class zzgvp
  implements zzgvo, zzgvi
{
  private static final zzgvp zza = new zzgvp(null);
  private final Object zzb;
  
  private zzgvp(Object paramObject)
  {
    this.zzb = paramObject;
  }
  
  public static zzgvo zza(Object paramObject)
  {
    zzgvw.zza(paramObject, "instance cannot be null");
    return new zzgvp(paramObject);
  }
  
  public static zzgvo zzc(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = zza;
    } else {
      paramObject = new zzgvp(paramObject);
    }
    return (zzgvo)paramObject;
  }
  
  public final Object zzb()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */