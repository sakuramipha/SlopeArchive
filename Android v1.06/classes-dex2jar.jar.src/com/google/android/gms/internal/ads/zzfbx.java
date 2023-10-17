package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class zzfbx
  implements zzfbw
{
  private final Object[] zza;
  
  public zzfbx(zzl paramzzl, String paramString1, int paramInt, String paramString2, zzw paramzzw)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(paramString2.split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    localArrayList.add(paramString1);
    if (localHashSet.contains("networkType")) {
      localArrayList.add(Integer.valueOf(paramInt));
    }
    if (localHashSet.contains("birthday")) {
      localArrayList.add(Long.valueOf(paramzzl.zzb));
    }
    if (localHashSet.contains("extras")) {
      localArrayList.add(zza(paramzzl.zzc));
    } else if (localHashSet.contains("npa")) {
      localArrayList.add(paramzzl.zzc.getString("npa"));
    }
    if (localHashSet.contains("gender")) {
      localArrayList.add(Integer.valueOf(paramzzl.zzd));
    }
    if (localHashSet.contains("keywords"))
    {
      paramString1 = paramzzl.zze;
      if (paramString1 != null) {
        localArrayList.add(paramString1.toString());
      } else {
        localArrayList.add(null);
      }
    }
    if (localHashSet.contains("isTestDevice")) {
      localArrayList.add(Boolean.valueOf(paramzzl.zzf));
    }
    if (localHashSet.contains("tagForChildDirectedTreatment")) {
      localArrayList.add(Integer.valueOf(paramzzl.zzg));
    }
    if (localHashSet.contains("manualImpressionsEnabled")) {
      localArrayList.add(Boolean.valueOf(paramzzl.zzh));
    }
    if (localHashSet.contains("publisherProvidedId")) {
      localArrayList.add(paramzzl.zzi);
    }
    if (localHashSet.contains("location"))
    {
      paramString1 = paramzzl.zzk;
      if (paramString1 != null) {
        localArrayList.add(paramString1.toString());
      } else {
        localArrayList.add(null);
      }
    }
    if (localHashSet.contains("contentUrl")) {
      localArrayList.add(paramzzl.zzl);
    }
    if (localHashSet.contains("networkExtras")) {
      localArrayList.add(zza(paramzzl.zzm));
    }
    if (localHashSet.contains("customTargeting")) {
      localArrayList.add(zza(paramzzl.zzn));
    }
    if (localHashSet.contains("categoryExclusions"))
    {
      paramString1 = paramzzl.zzo;
      if (paramString1 != null) {
        localArrayList.add(paramString1.toString());
      } else {
        localArrayList.add(null);
      }
    }
    if (localHashSet.contains("requestAgent")) {
      localArrayList.add(paramzzl.zzp);
    }
    if (localHashSet.contains("requestPackage")) {
      localArrayList.add(paramzzl.zzq);
    }
    if (localHashSet.contains("isDesignedForFamilies")) {
      localArrayList.add(Boolean.valueOf(paramzzl.zzr));
    }
    if (localHashSet.contains("tagForUnderAgeOfConsent")) {
      localArrayList.add(Integer.valueOf(paramzzl.zzt));
    }
    if (localHashSet.contains("maxAdContentRating")) {
      localArrayList.add(paramzzl.zzu);
    }
    if (localHashSet.contains("orientation")) {
      if (paramzzw != null) {
        localArrayList.add(Integer.valueOf(paramzzw.zza));
      } else {
        localArrayList.add(null);
      }
    }
    this.zza = localArrayList.toArray();
  }
  
  private static String zza(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = paramBundle.get((String)localIterator.next());
      if (localObject == null) {
        localObject = "null";
      } else if ((localObject instanceof Bundle)) {
        localObject = zza((Bundle)localObject);
      } else {
        localObject = localObject.toString();
      }
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzfbx)) {
      return false;
    }
    paramObject = (zzfbx)paramObject;
    return Arrays.equals(this.zza, ((zzfbx)paramObject).zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zza);
  }
  
  public final String toString()
  {
    int i = Arrays.hashCode(this.zza);
    String str = Arrays.toString(this.zza);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[PoolKey#");
    localStringBuilder.append(i);
    localStringBuilder.append(" ");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */