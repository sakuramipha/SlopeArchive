package com.google.android.gms.internal.drive;

final class zzlh
  implements zzlp
{
  private zzlp[] zztt;
  
  zzlh(zzlp... paramVarArgs)
  {
    this.zztt = paramVarArgs;
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    zzlp[] arrayOfzzlp = this.zztt;
    int j = arrayOfzzlp.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfzzlp[i].zzb(paramClass)) {
        return true;
      }
    }
    return false;
  }
  
  public final zzlo zzc(Class<?> paramClass)
  {
    for (zzlp localzzlp : this.zztt) {
      if (localzzlp.zzb(paramClass)) {
        return localzzlp.zzc(paramClass);
      }
    }
    paramClass = String.valueOf(paramClass.getName());
    if (paramClass.length() != 0) {
      paramClass = "No factory is available for message type: ".concat(paramClass);
    } else {
      paramClass = new String("No factory is available for message type: ");
    }
    throw new UnsupportedOperationException(paramClass);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */