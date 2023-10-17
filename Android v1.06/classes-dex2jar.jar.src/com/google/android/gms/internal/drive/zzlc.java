package com.google.android.gms.internal.drive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzlc
  extends zzla
{
  private static final Class<?> zzto = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private zzlc()
  {
    super(null);
  }
  
  private static <E> List<E> zzb(Object paramObject, long paramLong)
  {
    return (List)zznd.zzo(paramObject, paramLong);
  }
  
  final void zza(Object paramObject, long paramLong)
  {
    Object localObject = (List)zznd.zzo(paramObject, paramLong);
    if ((localObject instanceof zzkz))
    {
      localObject = ((zzkz)localObject).zzds();
    }
    else
    {
      if (zzto.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof zzmc)) && ((localObject instanceof zzkp)))
      {
        paramObject = (zzkp)localObject;
        if (((zzkp)paramObject).zzbo()) {
          ((zzkp)paramObject).zzbp();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    zznd.zza(paramObject, paramLong, localObject);
  }
  
  final <E> void zza(Object paramObject1, Object paramObject2, long paramLong)
  {
    Object localObject = zzb(paramObject2, paramLong);
    int i = ((List)localObject).size();
    List localList = zzb(paramObject1, paramLong);
    if (localList.isEmpty())
    {
      if ((localList instanceof zzkz)) {
        paramObject2 = new zzky(i);
      } else if (((localList instanceof zzmc)) && ((localList instanceof zzkp))) {
        paramObject2 = ((zzkp)localList).zzr(i);
      } else {
        paramObject2 = new ArrayList(i);
      }
      zznd.zza(paramObject1, paramLong, paramObject2);
    }
    else
    {
      if (zzto.isAssignableFrom(localList.getClass()))
      {
        paramObject2 = new ArrayList(localList.size() + i);
        ((ArrayList)paramObject2).addAll(localList);
        zznd.zza(paramObject1, paramLong, paramObject2);
      }
      for (;;)
      {
        break;
        if ((localList instanceof zzna))
        {
          paramObject2 = new zzky(localList.size() + i);
          ((zziw)paramObject2).addAll((zzna)localList);
          zznd.zza(paramObject1, paramLong, paramObject2);
        }
        else
        {
          paramObject2 = localList;
          if ((localList instanceof zzmc))
          {
            paramObject2 = localList;
            if ((localList instanceof zzkp))
            {
              zzkp localzzkp = (zzkp)localList;
              paramObject2 = localList;
              if (!localzzkp.zzbo())
              {
                paramObject2 = localzzkp.zzr(localList.size() + i);
                zznd.zza(paramObject1, paramLong, paramObject2);
              }
            }
          }
        }
      }
    }
    i = ((List)paramObject2).size();
    int j = ((List)localObject).size();
    if ((i > 0) && (j > 0)) {
      ((List)paramObject2).addAll((Collection)localObject);
    }
    if (i > 0) {
      localObject = paramObject2;
    }
    zznd.zza(paramObject1, paramLong, localObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */