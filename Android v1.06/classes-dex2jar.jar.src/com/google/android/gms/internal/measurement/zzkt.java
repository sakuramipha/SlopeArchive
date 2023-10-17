package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzkt
  extends zzkx
{
  private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private zzkt()
  {
    super(null);
  }
  
  final void zza(Object paramObject, long paramLong)
  {
    Object localObject = (List)zzmv.zzf(paramObject, paramLong);
    if ((localObject instanceof zzkr))
    {
      localObject = ((zzkr)localObject).zze();
    }
    else
    {
      if (zza.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof zzlq)) && ((localObject instanceof zzkj)))
      {
        paramObject = (zzkj)localObject;
        if (((zzkj)paramObject).zzc()) {
          ((zzkj)paramObject).zzb();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    zzmv.zzs(paramObject, paramLong, localObject);
  }
  
  final void zzb(Object paramObject1, Object paramObject2, long paramLong)
  {
    List localList = (List)zzmv.zzf(paramObject2, paramLong);
    int i = localList.size();
    Object localObject = (List)zzmv.zzf(paramObject1, paramLong);
    if (((List)localObject).isEmpty())
    {
      if ((localObject instanceof zzkr)) {
        paramObject2 = new zzkq(i);
      } else if (((localObject instanceof zzlq)) && ((localObject instanceof zzkj))) {
        paramObject2 = ((zzkj)localObject).zzd(i);
      } else {
        paramObject2 = new ArrayList(i);
      }
      zzmv.zzs(paramObject1, paramLong, paramObject2);
    }
    else
    {
      if (zza.isAssignableFrom(localObject.getClass()))
      {
        paramObject2 = new ArrayList(((List)localObject).size() + i);
        ((ArrayList)paramObject2).addAll((Collection)localObject);
        zzmv.zzs(paramObject1, paramLong, paramObject2);
      }
      for (;;)
      {
        break;
        if ((localObject instanceof zzmq))
        {
          paramObject2 = new zzkq(((List)localObject).size() + i);
          localObject = (zzmq)localObject;
          ((zzim)paramObject2).addAll(((zzkq)paramObject2).size(), (Collection)localObject);
          zzmv.zzs(paramObject1, paramLong, paramObject2);
        }
        else
        {
          paramObject2 = localObject;
          if ((localObject instanceof zzlq))
          {
            paramObject2 = localObject;
            if ((localObject instanceof zzkj))
            {
              zzkj localzzkj = (zzkj)localObject;
              paramObject2 = localObject;
              if (!localzzkj.zzc())
              {
                paramObject2 = localzzkj.zzd(((List)localObject).size() + i);
                zzmv.zzs(paramObject1, paramLong, paramObject2);
              }
            }
          }
        }
      }
    }
    i = ((List)paramObject2).size();
    int j = localList.size();
    if ((i > 0) && (j > 0)) {
      ((List)paramObject2).addAll(localList);
    }
    if (i <= 0) {
      paramObject2 = localList;
    }
    zzmv.zzs(paramObject1, paramLong, paramObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */