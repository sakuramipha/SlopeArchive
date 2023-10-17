package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzfes
{
  private final Clock zza;
  private final Map zzb;
  private final Map zzc;
  
  public zzfes(Clock paramClock)
  {
    this.zza = paramClock;
    this.zzb = new HashMap();
    this.zzc = new HashMap();
  }
  
  private final void zzd(String paramString1, String paramString2)
  {
    if (!this.zzb.containsKey(paramString1)) {
      this.zzb.put(paramString1, new ArrayList());
    }
    ((List)this.zzb.get(paramString1)).add(paramString2);
  }
  
  public final List zza()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = this.zzb.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      int j = ((List)localEntry.getValue()).size();
      int i = 0;
      if (j > 1)
      {
        Iterator localIterator1 = ((List)localEntry.getValue()).iterator();
        while (localIterator1.hasNext())
        {
          String str2 = (String)localIterator1.next();
          String str1 = (String)localEntry.getKey();
          i++;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str1);
          localStringBuilder.append(".");
          localStringBuilder.append(i);
          localArrayList.add(new zzfer(localStringBuilder.toString(), str2));
        }
      }
      else
      {
        localArrayList.add(new zzfer((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0)));
      }
    }
    return localArrayList;
  }
  
  public final void zzb(String paramString)
  {
    if (this.zzc.containsKey(paramString))
    {
      long l1 = this.zza.elapsedRealtime();
      long l2 = ((Long)this.zzc.remove(paramString)).longValue();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(l1 - l2);
      zzd(paramString, localStringBuilder.toString());
      return;
    }
    this.zzc.put(paramString, Long.valueOf(this.zza.elapsedRealtime()));
  }
  
  public final void zzc(String paramString1, String paramString2)
  {
    if (this.zzc.containsKey(paramString1))
    {
      long l2 = this.zza.elapsedRealtime();
      long l1 = ((Long)this.zzc.remove(paramString1)).longValue();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString2);
      localStringBuilder.append(l2 - l1);
      zzd(paramString1, localStringBuilder.toString());
      return;
    }
    this.zzc.put(paramString1, Long.valueOf(this.zza.elapsedRealtime()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */