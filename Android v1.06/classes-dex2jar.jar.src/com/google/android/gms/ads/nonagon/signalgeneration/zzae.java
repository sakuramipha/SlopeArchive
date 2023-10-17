package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzaxh;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class zzae
{
  private final String zza;
  
  public final zzaxh zza()
  {
    String str = this.zza;
    switch (str.hashCode())
    {
    default: 
      break;
    case 1951953708: 
      if (str.equals("BANNER")) {
        i = 0;
      }
      break;
    case 543046670: 
      if (str.equals("REWARDED")) {
        i = 3;
      }
      break;
    case -1372958932: 
      if (str.equals("INTERSTITIAL")) {
        i = 1;
      }
      break;
    case -1999289321: 
      if (str.equals("NATIVE")) {
        i = 2;
      }
      break;
    }
    int i = -1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return zzaxh.zza;
          }
          return zzaxh.zzh;
        }
        return zzaxh.zzg;
      }
      return zzaxh.zzd;
    }
    return zzaxh.zzb;
  }
  
  public final String zzb()
  {
    return this.zza.toLowerCase(Locale.ROOT);
  }
  
  public final Set zzc()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add(this.zza.toLowerCase(Locale.ROOT));
    return localHashSet;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */