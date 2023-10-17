package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgoi
{
  static final zzgoi zza = new zzgoi(true);
  public static final int zzb = 0;
  private static volatile boolean zzc = false;
  private static volatile zzgoi zzd;
  private final Map zze;
  
  zzgoi()
  {
    this.zze = new HashMap();
  }
  
  zzgoi(boolean paramBoolean)
  {
    this.zze = Collections.emptyMap();
  }
  
  public static zzgoi zza()
  {
    return zza;
  }
  
  public static zzgoi zzb()
  {
    zzgoi localzzgoi = zzd;
    if (localzzgoi != null) {
      return localzzgoi;
    }
    try
    {
      localzzgoi = zzd;
      if (localzzgoi != null) {
        return localzzgoi;
      }
      localzzgoi = zzgoq.zzb(zzgoi.class);
      zzd = localzzgoi;
      return localzzgoi;
    }
    finally {}
  }
  
  public final zzgou zzc(zzgqg paramzzgqg, int paramInt)
  {
    return (zzgou)this.zze.get(new zzgoh(paramzzgqg, paramInt));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */