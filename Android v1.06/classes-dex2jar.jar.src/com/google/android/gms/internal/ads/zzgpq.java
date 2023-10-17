package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzgpq
  extends zzgpu
{
  private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private zzgpq()
  {
    super(null);
  }
  
  private static List zzf(Object paramObject, long paramLong, int paramInt)
  {
    Object localObject2 = (List)zzgsa.zzh(paramObject, paramLong);
    Object localObject1;
    if (((List)localObject2).isEmpty())
    {
      if ((localObject2 instanceof zzgpo)) {
        localObject1 = new zzgpn(paramInt);
      } else if (((localObject2 instanceof zzgqn)) && ((localObject2 instanceof zzgpf))) {
        localObject1 = ((zzgpf)localObject2).zzd(paramInt);
      } else {
        localObject1 = new ArrayList(paramInt);
      }
      zzgsa.zzv(paramObject, paramLong, localObject1);
    }
    else
    {
      if (zza.isAssignableFrom(localObject2.getClass()))
      {
        localObject1 = new ArrayList(((List)localObject2).size() + paramInt);
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        zzgsa.zzv(paramObject, paramLong, localObject1);
      }
      for (paramObject = localObject1;; paramObject = localObject1)
      {
        localObject1 = paramObject;
        break label284;
        if (!(localObject2 instanceof zzgrv)) {
          break;
        }
        localObject1 = new zzgpn(((List)localObject2).size() + paramInt);
        localObject2 = (zzgrv)localObject2;
        ((zzgmy)localObject1).addAll(((zzgpn)localObject1).size(), (Collection)localObject2);
        zzgsa.zzv(paramObject, paramLong, localObject1);
      }
      localObject1 = localObject2;
      if ((localObject2 instanceof zzgqn))
      {
        localObject1 = localObject2;
        if ((localObject2 instanceof zzgpf))
        {
          localObject1 = (zzgpf)localObject2;
          if (((zzgpf)localObject1).zzc())
          {
            localObject1 = localObject2;
          }
          else
          {
            localObject1 = ((zzgpf)localObject1).zzd(((List)localObject2).size() + paramInt);
            zzgsa.zzv(paramObject, paramLong, localObject1);
            return (List)localObject1;
          }
        }
      }
    }
    label284:
    return (List)localObject1;
  }
  
  final List zza(Object paramObject, long paramLong)
  {
    return zzf(paramObject, paramLong, 10);
  }
  
  final void zzb(Object paramObject, long paramLong)
  {
    Object localObject = (List)zzgsa.zzh(paramObject, paramLong);
    if ((localObject instanceof zzgpo))
    {
      localObject = ((zzgpo)localObject).zze();
    }
    else
    {
      if (zza.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof zzgqn)) && ((localObject instanceof zzgpf)))
      {
        paramObject = (zzgpf)localObject;
        if (((zzgpf)paramObject).zzc()) {
          ((zzgpf)paramObject).zzb();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    zzgsa.zzv(paramObject, paramLong, localObject);
  }
  
  final void zzc(Object paramObject1, Object paramObject2, long paramLong)
  {
    paramObject2 = (List)zzgsa.zzh(paramObject2, paramLong);
    List localList = zzf(paramObject1, paramLong, ((List)paramObject2).size());
    int i = localList.size();
    int j = ((List)paramObject2).size();
    if ((i > 0) && (j > 0)) {
      localList.addAll((Collection)paramObject2);
    }
    if (i > 0) {
      paramObject2 = localList;
    }
    zzgsa.zzv(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */