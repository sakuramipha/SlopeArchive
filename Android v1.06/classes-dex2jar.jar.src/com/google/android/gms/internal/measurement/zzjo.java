package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzjo
{
  static final zzjo zza = new zzjo(true);
  private static volatile boolean zzb = false;
  private static volatile zzjo zzc;
  private static volatile zzjo zzd;
  private final Map zze;
  
  zzjo()
  {
    this.zze = new HashMap();
  }
  
  zzjo(boolean paramBoolean)
  {
    this.zze = Collections.emptyMap();
  }
  
  public static zzjo zza()
  {
    zzjo localzzjo3 = zzc;
    zzjo localzzjo1 = localzzjo3;
    if (localzzjo3 == null) {
      try
      {
        localzzjo3 = zzc;
        localzzjo1 = localzzjo3;
        if (localzzjo3 == null)
        {
          localzzjo1 = zza;
          zzc = localzzjo1;
        }
      }
      finally {}
    }
    return localzzjo2;
  }
  
  public static zzjo zzb()
  {
    zzjo localzzjo = zzd;
    if (localzzjo != null) {
      return localzzjo;
    }
    try
    {
      localzzjo = zzd;
      if (localzzjo != null) {
        return localzzjo;
      }
      localzzjo = zzjw.zzb(zzjo.class);
      zzd = localzzjo;
      return localzzjo;
    }
    finally {}
  }
  
  public final zzka zzc(zzlj paramzzlj, int paramInt)
  {
    return (zzka)this.zze.get(new zzjn(paramzzlj, paramInt));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */