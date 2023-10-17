package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbcc
{
  private final List zza = new LinkedList();
  private final Map zzb;
  private final Object zzc;
  
  public zzbcc(boolean paramBoolean, String paramString1, String paramString2)
  {
    paramString1 = new LinkedHashMap();
    this.zzb = paramString1;
    this.zzc = new Object();
    paramString1.put("action", "make_wv");
    paramString1.put("ad_format", paramString2);
  }
  
  public static final zzbbz zzf()
  {
    return new zzbbz(zzt.zzB().elapsedRealtime(), null, null);
  }
  
  public final zzbcb zza()
  {
    Object localObject1 = zzbbk.zzbJ;
    boolean bool = ((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue();
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject4 = new HashMap();
    synchronized (this.zzc)
    {
      Object localObject5 = this.zza.iterator();
      long l1;
      while (((Iterator)localObject5).hasNext())
      {
        Object localObject6 = (zzbbz)((Iterator)localObject5).next();
        long l2 = ((zzbbz)localObject6).zza();
        localObject1 = ((zzbbz)localObject6).zzc();
        localObject6 = ((zzbbz)localObject6).zzb();
        if ((localObject6 != null) && (l2 > 0L))
        {
          l1 = ((zzbbz)localObject6).zza();
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append('.');
          localStringBuilder.append(l2 - l1);
          localStringBuilder.append(',');
          if (bool) {
            if (!((Map)localObject4).containsKey(Long.valueOf(((zzbbz)localObject6).zza())))
            {
              l1 = ((zzbbz)localObject6).zza();
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>((String)localObject1);
              ((Map)localObject4).put(Long.valueOf(l1), localObject6);
            }
            else
            {
              localObject6 = (StringBuilder)((Map)localObject4).get(Long.valueOf(((zzbbz)localObject6).zza()));
              ((StringBuilder)localObject6).append('+');
              ((StringBuilder)localObject6).append((String)localObject1);
            }
          }
        }
      }
      this.zza.clear();
      localObject1 = null;
      if (!TextUtils.isEmpty(null)) {
        localStringBuilder.append(null);
      } else if (localStringBuilder.length() > 0) {
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      }
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      if (bool)
      {
        localObject4 = ((Map)localObject4).entrySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject1 = (Map.Entry)((Iterator)localObject4).next();
          ((StringBuilder)localObject5).append((CharSequence)((Map.Entry)localObject1).getValue());
          ((StringBuilder)localObject5).append('.');
          l1 = ((Long)((Map.Entry)localObject1).getKey()).longValue();
          ((StringBuilder)localObject5).append(zzt.zzB().currentTimeMillis() + (l1 - zzt.zzB().elapsedRealtime()));
          ((StringBuilder)localObject5).append(',');
        }
        if (((StringBuilder)localObject5).length() > 0) {
          ((StringBuilder)localObject5).setLength(((StringBuilder)localObject5).length() - 1);
        }
        localObject1 = ((StringBuilder)localObject5).toString();
      }
      localObject4 = new com/google/android/gms/internal/ads/zzbcb;
      ((zzbcb)localObject4).<init>(localStringBuilder.toString(), (String)localObject1);
      return (zzbcb)localObject4;
    }
  }
  
  public final Map zzb()
  {
    synchronized (this.zzc)
    {
      zzt.zzo().zzf();
      Map localMap = this.zzb;
      return localMap;
    }
  }
  
  public final void zzc(zzbcc arg1)
  {
    synchronized (this.zzc) {}
  }
  
  public final void zzd(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    Object localObject2 = zzt.zzo().zzf();
    if (localObject2 == null) {
      return;
    }
    synchronized (this.zzc)
    {
      zzbby localzzbby = ((zzbbs)localObject2).zza(paramString1);
      localObject2 = this.zzb;
      ((Map)localObject2).put(paramString1, localzzbby.zza((String)((Map)localObject2).get(paramString1), paramString2));
      return;
    }
  }
  
  public final boolean zze(zzbbz paramzzbbz, long paramLong, String... paramVarArgs)
  {
    localObject = this.zzc;
    int i = 0;
    for (;;)
    {
      String str;
      if (i <= 0) {
        str = paramVarArgs[i];
      }
      try
      {
        zzbbz localzzbbz = new com/google/android/gms/internal/ads/zzbbz;
        localzzbbz.<init>(paramLong, str, paramzzbbz);
        this.zza.add(localzzbbz);
        i++;
      }
      finally {}
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */