package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgdr
{
  private static final zzgdr zza = new zzgdr();
  private final AtomicReference zzb = new AtomicReference(new zzgek(new zzgeg(), null));
  
  public static zzgdr zza()
  {
    return zza;
  }
  
  public final Class zzb(Class paramClass)
    throws GeneralSecurityException
  {
    return ((zzgek)this.zzb.get()).zza(paramClass);
  }
  
  public final Object zzc(zzfxb paramzzfxb, Class paramClass)
    throws GeneralSecurityException
  {
    return ((zzgek)this.zzb.get()).zzb(paramzzfxb, paramClass);
  }
  
  public final Object zzd(zzfya paramzzfya, Class paramClass)
    throws GeneralSecurityException
  {
    return ((zzgek)this.zzb.get()).zzc(paramzzfya, paramClass);
  }
  
  public final void zze(zzgee paramzzgee)
    throws GeneralSecurityException
  {
    try
    {
      zzgeg localzzgeg = new com/google/android/gms/internal/ads/zzgeg;
      localzzgeg.<init>((zzgek)this.zzb.get());
      localzzgeg.zza(paramzzgee);
      paramzzgee = new com/google/android/gms/internal/ads/zzgek;
      paramzzgee.<init>(localzzgeg, null);
      this.zzb.set(paramzzgee);
      return;
    }
    finally
    {
      paramzzgee = finally;
      throw paramzzgee;
    }
  }
  
  public final void zzf(zzfyb paramzzfyb)
    throws GeneralSecurityException
  {
    try
    {
      zzgeg localzzgeg = new com/google/android/gms/internal/ads/zzgeg;
      localzzgeg.<init>((zzgek)this.zzb.get());
      localzzgeg.zzb(paramzzfyb);
      paramzzfyb = new com/google/android/gms/internal/ads/zzgek;
      paramzzfyb.<init>(localzzgeg, null);
      this.zzb.set(paramzzfyb);
      return;
    }
    finally
    {
      paramzzfyb = finally;
      throw paramzzfyb;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */