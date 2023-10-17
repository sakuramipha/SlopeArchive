package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class zzgeg
{
  private final Map zza;
  private final Map zzb;
  
  public zzgeg()
  {
    this.zza = new HashMap();
    this.zzb = new HashMap();
  }
  
  public zzgeg(zzgek paramzzgek)
  {
    this.zza = new HashMap(zzgek.zzd(paramzzgek));
    this.zzb = new HashMap(zzgek.zze(paramzzgek));
  }
  
  public final zzgeg zza(zzgee paramzzgee)
    throws GeneralSecurityException
  {
    zzgei localzzgei = new zzgei(paramzzgee.zzc(), paramzzgee.zzd(), null);
    if (this.zza.containsKey(localzzgei))
    {
      zzgee localzzgee = (zzgee)this.zza.get(localzzgei);
      if ((!localzzgee.equals(paramzzgee)) || (!paramzzgee.equals(localzzgee))) {
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(localzzgei.toString()));
      }
    }
    else
    {
      this.zza.put(localzzgei, paramzzgee);
    }
    return this;
  }
  
  public final zzgeg zzb(zzfyb paramzzfyb)
    throws GeneralSecurityException
  {
    Objects.requireNonNull(paramzzfyb, "wrapper must be non-null");
    Object localObject = this.zzb;
    Class localClass = paramzzfyb.zzb();
    if (((Map)localObject).containsKey(localClass))
    {
      localObject = (zzfyb)this.zzb.get(localClass);
      if ((!localObject.equals(paramzzfyb)) || (!paramzzfyb.equals(localObject))) {
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(localClass.toString()));
      }
    }
    else
    {
      this.zzb.put(localClass, paramzzfyb);
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */