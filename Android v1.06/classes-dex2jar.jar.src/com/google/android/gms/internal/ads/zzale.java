package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class zzale
{
  public final int zza;
  public final byte[] zzb;
  public final Map zzc;
  public final List zzd;
  public final boolean zze;
  
  private zzale(int paramInt, byte[] paramArrayOfByte, Map paramMap, List paramList, boolean paramBoolean, long paramLong)
  {
    this.zza = paramInt;
    this.zzb = paramArrayOfByte;
    this.zzc = paramMap;
    if (paramList == null) {
      paramArrayOfByte = null;
    } else {
      paramArrayOfByte = Collections.unmodifiableList(paramList);
    }
    this.zzd = paramArrayOfByte;
    this.zze = paramBoolean;
  }
  
  @Deprecated
  public zzale(int paramInt, byte[] paramArrayOfByte, Map paramMap, boolean paramBoolean, long paramLong)
  {
    this(paramInt, paramArrayOfByte, paramMap, zza(paramMap), paramBoolean, paramLong);
  }
  
  public zzale(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean, long paramLong, List paramList)
  {
    this(paramInt, paramArrayOfByte, (Map)localObject, paramList, paramBoolean, paramLong);
  }
  
  @Deprecated
  public zzale(byte[] paramArrayOfByte, Map paramMap)
  {
    this(200, paramArrayOfByte, paramMap, zza(paramMap), false, 0L);
  }
  
  private static List zza(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    if (paramMap.isEmpty()) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localArrayList.add(new zzala((String)paramMap.getKey(), (String)paramMap.getValue()));
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */