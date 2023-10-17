package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzlm
  implements zzll
{
  public final int zzb(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (zzlk)paramObject1;
    if (((zzlk)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((zzlk)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw new NoSuchMethodError();
  }
  
  public final Object zzb(Object paramObject1, Object paramObject2)
  {
    zzlk localzzlk = (zzlk)paramObject1;
    paramObject2 = (zzlk)paramObject2;
    paramObject1 = localzzlk;
    if (!((zzlk)paramObject2).isEmpty())
    {
      paramObject1 = localzzlk;
      if (!localzzlk.isMutable()) {
        paramObject1 = localzzlk.zzdx();
      }
      ((zzlk)paramObject1).zza((zzlk)paramObject2);
    }
    return paramObject1;
  }
  
  public final Map<?, ?> zzh(Object paramObject)
  {
    return (zzlk)paramObject;
  }
  
  public final Map<?, ?> zzi(Object paramObject)
  {
    return (zzlk)paramObject;
  }
  
  public final boolean zzj(Object paramObject)
  {
    return !((zzlk)paramObject).isMutable();
  }
  
  public final Object zzk(Object paramObject)
  {
    ((zzlk)paramObject).zzbp();
    return paramObject;
  }
  
  public final Object zzl(Object paramObject)
  {
    return zzlk.zzdw().zzdx();
  }
  
  public final zzlj<?, ?> zzm(Object paramObject)
  {
    throw new NoSuchMethodError();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */