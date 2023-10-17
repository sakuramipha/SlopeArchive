package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgel
  implements zzgen
{
  private final String zza;
  private final zzgmu zzb;
  private final zzgno zzc;
  private final zzgjt zzd;
  private final zzgla zze;
  @Nullable
  private final Integer zzf;
  
  private zzgel(String paramString, zzgno paramzzgno, zzgjt paramzzgjt, zzgla paramzzgla, @Nullable Integer paramInteger)
  {
    this.zza = paramString;
    this.zzb = zzgew.zza(paramString);
    this.zzc = paramzzgno;
    this.zzd = paramzzgjt;
    this.zze = paramzzgla;
    this.zzf = paramInteger;
  }
  
  public static zzgel zza(String paramString, zzgno paramzzgno, zzgjt paramzzgjt, zzgla paramzzgla, @Nullable Integer paramInteger)
    throws GeneralSecurityException
  {
    if (paramzzgla == zzgla.zzd)
    {
      if (paramInteger != null) {
        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
      }
    }
    else {
      if (paramInteger == null) {
        break label44;
      }
    }
    return new zzgel(paramString, paramzzgno, paramzzgjt, paramzzgla, paramInteger);
    label44:
    throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
  }
  
  public final zzgjt zzb()
  {
    return this.zzd;
  }
  
  public final zzgla zzc()
  {
    return this.zze;
  }
  
  public final zzgmu zzd()
  {
    return this.zzb;
  }
  
  public final zzgno zze()
  {
    return this.zzc;
  }
  
  @Nullable
  public final Integer zzf()
  {
    return this.zzf;
  }
  
  public final String zzg()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */