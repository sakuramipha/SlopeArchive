package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public abstract class zzgda
{
  private final zzgmu zza;
  private final Class zzb;
  
  public static zzgda zzb(zzgcy paramzzgcy, zzgmu paramzzgmu, Class paramClass)
  {
    return new zzgcx(paramzzgmu, paramClass, paramzzgcy);
  }
  
  public abstract zzfxb zza(zzgen paramzzgen, @Nullable zzfye paramzzfye)
    throws GeneralSecurityException;
  
  public final zzgmu zzc()
  {
    return this.zza;
  }
  
  public final Class zzd()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */