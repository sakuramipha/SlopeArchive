package com.google.android.gms.internal.ads;

final class zzgpx
  implements zzgqe
{
  private final zzgqe[] zza;
  
  zzgpx(zzgqe... paramVarArgs)
  {
    this.zza = paramVarArgs;
  }
  
  public final zzgqd zzb(Class paramClass)
  {
    zzgqe[] arrayOfzzgqe = this.zza;
    for (int i = 0; i < 2; i++)
    {
      zzgqe localzzgqe = arrayOfzzgqe[i];
      if (localzzgqe.zzc(paramClass)) {
        return localzzgqe.zzb(paramClass);
      }
    }
    throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(paramClass.getName())));
  }
  
  public final boolean zzc(Class paramClass)
  {
    zzgqe[] arrayOfzzgqe = this.zza;
    for (int i = 0; i < 2; i++) {
      if (arrayOfzzgqe[i].zzc(paramClass)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */