package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public final class zzgma
{
  public static final zzgma zza = new zzgma(new zzgmb());
  public static final zzgma zzb = new zzgma(new zzgmf());
  public static final zzgma zzc = new zzgma(new zzgmh());
  public static final zzgma zzd = new zzgma(new zzgmg());
  public static final zzgma zze = new zzgma(new zzgmc());
  public static final zzgma zzf = new zzgma(new zzgme());
  public static final zzgma zzg = new zzgma(new zzgmd());
  private final zzglz zzh;
  
  public zzgma(zzgmi paramzzgmi)
  {
    if (zzgcw.zzb())
    {
      this.zzh = new zzgly(paramzzgmi, null);
      return;
    }
    if (zzgmr.zza())
    {
      this.zzh = new zzglu(paramzzgmi, null);
      return;
    }
    this.zzh = new zzglw(paramzzgmi, null);
  }
  
  public static List zzb(String... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramVarArgs.length; i++)
    {
      Provider localProvider = Security.getProvider(paramVarArgs[i]);
      if (localProvider != null) {
        localArrayList.add(localProvider);
      }
    }
    return localArrayList;
  }
  
  public final Object zza(String paramString)
    throws GeneralSecurityException
  {
    return this.zzh.zza(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */