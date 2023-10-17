package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class zzgqb
{
  public static final int zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (zzgqa)paramObject1;
    paramObject2 = (zzgpz)paramObject2;
    if (!((zzgqa)paramObject1).isEmpty())
    {
      paramObject1 = ((zzgqa)paramObject1).entrySet().iterator();
      if (((Iterator)paramObject1).hasNext()) {}
    }
    else
    {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw null;
  }
  
  public static final boolean zzb(Object paramObject)
  {
    return !((zzgqa)paramObject).zze();
  }
  
  public static final Object zzc(Object paramObject1, Object paramObject2)
  {
    zzgqa localzzgqa = (zzgqa)paramObject1;
    paramObject2 = (zzgqa)paramObject2;
    paramObject1 = localzzgqa;
    if (!((zzgqa)paramObject2).isEmpty())
    {
      paramObject1 = localzzgqa;
      if (!localzzgqa.zze()) {
        paramObject1 = localzzgqa.zzb();
      }
      ((zzgqa)paramObject1).zzd((zzgqa)paramObject2);
    }
    return paramObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */