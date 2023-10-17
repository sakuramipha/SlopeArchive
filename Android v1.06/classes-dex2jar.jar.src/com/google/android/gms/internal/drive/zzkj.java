package com.google.android.gms.internal.drive;

final class zzkj
  implements zzlp
{
  private static final zzkj zzrp = new zzkj();
  
  public static zzkj zzcv()
  {
    return zzrp;
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    return zzkk.class.isAssignableFrom(paramClass);
  }
  
  public final zzlo zzc(Class<?> paramClass)
  {
    if (!zzkk.class.isAssignableFrom(paramClass))
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unsupported message type: ".concat(paramClass);
      } else {
        paramClass = new String("Unsupported message type: ");
      }
      throw new IllegalArgumentException(paramClass);
    }
    try
    {
      zzlo localzzlo = (zzlo)zzkk.zzd(paramClass.asSubclass(zzkk.class)).zza(zzkk.zze.zzrz, null, null);
      return localzzlo;
    }
    catch (Exception localException)
    {
      paramClass = String.valueOf(paramClass.getName());
      if (paramClass.length() != 0) {
        paramClass = "Unable to get message info for ".concat(paramClass);
      } else {
        paramClass = new String("Unable to get message info for ");
      }
      throw new RuntimeException(paramClass, localException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */