package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class zzgdh
{
  private final Class zza;
  private final Map zzb;
  private final Class zzc;
  
  @SafeVarargs
  protected zzgdh(Class paramClass, zzgef... paramVarArgs)
  {
    this.zza = paramClass;
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i <= 0)
    {
      paramClass = paramVarArgs[i];
      if (!localHashMap.containsKey(paramClass.zzb()))
      {
        localHashMap.put(paramClass.zzb(), paramClass);
        i++;
      }
      else
      {
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(paramClass.zzb().getCanonicalName())));
      }
    }
    this.zzc = paramVarArgs[0].zzb();
    this.zzb = Collections.unmodifiableMap(localHashMap);
  }
  
  public zzgdg zza()
  {
    throw null;
  }
  
  public abstract zzgjt zzb();
  
  public abstract zzgqg zzc(zzgno paramzzgno)
    throws zzgpi;
  
  public abstract String zzd();
  
  public abstract void zze(zzgqg paramzzgqg)
    throws GeneralSecurityException;
  
  public int zzf()
  {
    return 1;
  }
  
  public final Class zzi()
  {
    return this.zzc;
  }
  
  public final Class zzj()
  {
    return this.zza;
  }
  
  public final Object zzk(zzgqg paramzzgqg, Class paramClass)
    throws GeneralSecurityException
  {
    zzgef localzzgef = (zzgef)this.zzb.get(paramClass);
    if (localzzgef != null) {
      return localzzgef.zza(paramzzgqg);
    }
    paramzzgqg = paramClass.getCanonicalName();
    paramClass = new StringBuilder();
    paramClass.append("Requested primitive class ");
    paramClass.append(paramzzgqg);
    paramClass.append(" not supported.");
    throw new IllegalArgumentException(paramClass.toString());
  }
  
  public final Set zzl()
  {
    return this.zzb.keySet();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */