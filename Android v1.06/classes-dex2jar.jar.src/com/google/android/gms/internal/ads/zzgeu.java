package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;
import javax.annotation.Nullable;

public final class zzgeu
{
  private final Map zza;
  private final Map zzb;
  private final Map zzc;
  private final Map zzd;
  
  public final zzfxb zza(zzgen paramzzgen, @Nullable zzfye paramzzfye)
    throws GeneralSecurityException
  {
    zzgeq localzzgeq = new zzgeq(paramzzgen.getClass(), paramzzgen.zzd(), null);
    if (this.zzb.containsKey(localzzgeq)) {
      return ((zzgda)this.zzb.get(localzzgeq)).zza(paramzzgen, paramzzfye);
    }
    paramzzgen = localzzgeq.toString();
    paramzzfye = new StringBuilder();
    paramzzfye.append("No Key Parser for requested key type ");
    paramzzfye.append(paramzzgen);
    paramzzfye.append(" available");
    throw new GeneralSecurityException(paramzzfye.toString());
  }
  
  public final boolean zzf(zzgen paramzzgen)
  {
    paramzzgen = new zzgeq(paramzzgen.getClass(), paramzzgen.zzd(), null);
    return this.zzb.containsKey(paramzzgen);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */