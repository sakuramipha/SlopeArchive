package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class zzgeo
{
  private final Map zza;
  private final Map zzb;
  private final Map zzc;
  private final Map zzd;
  
  public zzgeo()
  {
    this.zza = new HashMap();
    this.zzb = new HashMap();
    this.zzc = new HashMap();
    this.zzd = new HashMap();
  }
  
  public zzgeo(zzgeu paramzzgeu)
  {
    this.zza = new HashMap(zzgeu.zzc(paramzzgeu));
    this.zzb = new HashMap(zzgeu.zzb(paramzzgeu));
    this.zzc = new HashMap(zzgeu.zze(paramzzgeu));
    this.zzd = new HashMap(zzgeu.zzd(paramzzgeu));
  }
  
  public final zzgeo zza(zzgda paramzzgda)
    throws GeneralSecurityException
  {
    zzgeq localzzgeq = new zzgeq(paramzzgda.zzd(), paramzzgda.zzc(), null);
    if (this.zzb.containsKey(localzzgeq))
    {
      zzgda localzzgda = (zzgda)this.zzb.get(localzzgeq);
      if ((!localzzgda.equals(paramzzgda)) || (!paramzzgda.equals(localzzgda))) {
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(localzzgeq.toString()));
      }
    }
    else
    {
      this.zzb.put(localzzgeq, paramzzgda);
    }
    return this;
  }
  
  public final zzgeo zzb(zzgde paramzzgde)
    throws GeneralSecurityException
  {
    zzges localzzges = new zzges(paramzzgde.zzb(), paramzzgde.zzc(), null);
    if (this.zza.containsKey(localzzges))
    {
      zzgde localzzgde = (zzgde)this.zza.get(localzzges);
      if ((!localzzgde.equals(paramzzgde)) || (!paramzzgde.equals(localzzgde))) {
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(localzzges.toString()));
      }
    }
    else
    {
      this.zza.put(localzzges, paramzzgde);
    }
    return this;
  }
  
  public final zzgeo zzc(zzgdw paramzzgdw)
    throws GeneralSecurityException
  {
    zzgeq localzzgeq = new zzgeq(paramzzgdw.zzc(), paramzzgdw.zzb(), null);
    if (this.zzd.containsKey(localzzgeq))
    {
      zzgdw localzzgdw = (zzgdw)this.zzd.get(localzzgeq);
      if ((!localzzgdw.equals(paramzzgdw)) || (!paramzzgdw.equals(localzzgdw))) {
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(localzzgeq.toString()));
      }
    }
    else
    {
      this.zzd.put(localzzgeq, paramzzgdw);
    }
    return this;
  }
  
  public final zzgeo zzd(zzgea paramzzgea)
    throws GeneralSecurityException
  {
    zzges localzzges = new zzges(paramzzgea.zzb(), paramzzgea.zzc(), null);
    if (this.zzc.containsKey(localzzges))
    {
      zzgea localzzgea = (zzgea)this.zzc.get(localzzges);
      if ((!localzzgea.equals(paramzzgea)) || (!paramzzgea.equals(localzzgea))) {
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(localzzges.toString()));
      }
    }
    else
    {
      this.zzc.put(localzzges, paramzzgea);
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */