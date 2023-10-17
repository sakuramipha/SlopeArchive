package com.google.android.gms.internal.ads;

final class zzgor
  implements zzgqe
{
  private static final zzgor zza = new zzgor();
  
  public static zzgor zza()
  {
    return zza;
  }
  
  public final zzgqd zzb(Class paramClass)
  {
    if (zzgow.class.isAssignableFrom(paramClass)) {
      try
      {
        zzgqd localzzgqd = (zzgqd)zzgow.zzaC(paramClass.asSubclass(zzgow.class)).zzb(3, null, null);
        return localzzgqd;
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(paramClass.getName())), localException);
      }
    }
    throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(paramClass.getName())));
  }
  
  public final boolean zzc(Class paramClass)
  {
    return zzgow.class.isAssignableFrom(paramClass);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */