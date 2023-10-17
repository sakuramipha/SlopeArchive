package com.google.android.gms.internal.measurement;

final class zzla
  implements zzlh
{
  private final zzlh[] zza;
  
  zzla(zzlh... paramVarArgs)
  {
    this.zza = paramVarArgs;
  }
  
  public final zzlg zzb(Class paramClass)
  {
    zzlh[] arrayOfzzlh = this.zza;
    for (int i = 0; i < 2; i++)
    {
      zzlh localzzlh = arrayOfzzlh[i];
      if (localzzlh.zzc(paramClass)) {
        return localzzlh.zzb(paramClass);
      }
    }
    throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(paramClass.getName())));
  }
  
  public final boolean zzc(Class paramClass)
  {
    zzlh[] arrayOfzzlh = this.zza;
    for (int i = 0; i < 2; i++) {
      if (arrayOfzzlh[i].zzc(paramClass)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */