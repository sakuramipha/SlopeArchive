package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class zzle
{
  public static final int zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (zzld)paramObject1;
    paramObject2 = (zzlc)paramObject2;
    if (!((zzld)paramObject1).isEmpty())
    {
      paramObject1 = ((zzld)paramObject1).entrySet().iterator();
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
  
  public static final Object zzb(Object paramObject1, Object paramObject2)
  {
    zzld localzzld = (zzld)paramObject1;
    paramObject2 = (zzld)paramObject2;
    paramObject1 = localzzld;
    if (!((zzld)paramObject2).isEmpty())
    {
      paramObject1 = localzzld;
      if (!localzzld.zze()) {
        paramObject1 = localzzld.zzb();
      }
      ((zzld)paramObject1).zzd((zzld)paramObject2);
    }
    return paramObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */