package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfta
  implements Comparator
{
  public static zzfta zzb(Comparator paramComparator)
  {
    if ((paramComparator instanceof zzfta)) {
      paramComparator = (zzfta)paramComparator;
    } else {
      paramComparator = new zzfrc(paramComparator);
    }
    return paramComparator;
  }
  
  public static zzfta zzc()
  {
    return zzfsy.zza;
  }
  
  public abstract int compare(Object paramObject1, Object paramObject2);
  
  public zzfta zza()
  {
    return new zzftj(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */