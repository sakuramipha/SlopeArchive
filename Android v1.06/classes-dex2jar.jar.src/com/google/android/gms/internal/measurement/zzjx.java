package com.google.android.gms.internal.measurement;

final class zzjx
  implements zzlh
{
  private static final zzjx zza = new zzjx();
  
  public static zzjx zza()
  {
    return zza;
  }
  
  public final zzlg zzb(Class paramClass)
  {
    if (zzkc.class.isAssignableFrom(paramClass)) {
      try
      {
        zzlg localzzlg = (zzlg)zzkc.zzbC(paramClass.asSubclass(zzkc.class)).zzl(3, null, null);
        return localzzlg;
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
    return zzkc.class.isAssignableFrom(paramClass);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */