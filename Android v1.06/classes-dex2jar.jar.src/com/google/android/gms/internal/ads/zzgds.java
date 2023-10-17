package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgds
{
  private static final zzgds zza = new zzgds();
  private final AtomicReference zzb = new AtomicReference(new zzgeu(new zzgeo(), null));
  
  public static zzgds zzb()
  {
    return zza;
  }
  
  public final zzfxb zza(zzgel paramzzgel, zzfye paramzzfye)
    throws GeneralSecurityException
  {
    if (!((zzgeu)this.zzb.get()).zzf(paramzzgel)) {
      try
      {
        paramzzgel = new zzgdj(paramzzgel, paramzzfye);
        return paramzzgel;
      }
      catch (GeneralSecurityException paramzzgel)
      {
        throw new zzgev("Creating a LegacyProtoKey failed", paramzzgel);
      }
    }
    return ((zzgeu)this.zzb.get()).zza(paramzzgel, paramzzfye);
  }
  
  public final void zzc(zzgda paramzzgda)
    throws GeneralSecurityException
  {
    try
    {
      zzgeo localzzgeo = new com/google/android/gms/internal/ads/zzgeo;
      localzzgeo.<init>((zzgeu)this.zzb.get());
      localzzgeo.zza(paramzzgda);
      paramzzgda = new com/google/android/gms/internal/ads/zzgeu;
      paramzzgda.<init>(localzzgeo, null);
      this.zzb.set(paramzzgda);
      return;
    }
    finally
    {
      paramzzgda = finally;
      throw paramzzgda;
    }
  }
  
  public final void zzd(zzgde paramzzgde)
    throws GeneralSecurityException
  {
    try
    {
      zzgeo localzzgeo = new com/google/android/gms/internal/ads/zzgeo;
      localzzgeo.<init>((zzgeu)this.zzb.get());
      localzzgeo.zzb(paramzzgde);
      paramzzgde = new com/google/android/gms/internal/ads/zzgeu;
      paramzzgde.<init>(localzzgeo, null);
      this.zzb.set(paramzzgde);
      return;
    }
    finally
    {
      paramzzgde = finally;
      throw paramzzgde;
    }
  }
  
  public final void zze(zzgdw paramzzgdw)
    throws GeneralSecurityException
  {
    try
    {
      zzgeo localzzgeo = new com/google/android/gms/internal/ads/zzgeo;
      localzzgeo.<init>((zzgeu)this.zzb.get());
      localzzgeo.zzc(paramzzgdw);
      paramzzgdw = new com/google/android/gms/internal/ads/zzgeu;
      paramzzgdw.<init>(localzzgeo, null);
      this.zzb.set(paramzzgdw);
      return;
    }
    finally
    {
      paramzzgdw = finally;
      throw paramzzgdw;
    }
  }
  
  public final void zzf(zzgea paramzzgea)
    throws GeneralSecurityException
  {
    try
    {
      zzgeo localzzgeo = new com/google/android/gms/internal/ads/zzgeo;
      localzzgeo.<init>((zzgeu)this.zzb.get());
      localzzgeo.zzd(paramzzgea);
      paramzzgea = new com/google/android/gms/internal/ads/zzgeu;
      paramzzgea.<init>(localzzgeo, null);
      this.zzb.set(paramzzgea);
      return;
    }
    finally
    {
      paramzzgea = finally;
      throw paramzzgea;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */