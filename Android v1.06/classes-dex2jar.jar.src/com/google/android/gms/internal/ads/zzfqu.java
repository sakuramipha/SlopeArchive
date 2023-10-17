package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfqu
  extends AbstractSet
{
  final zzfra zza;
  
  zzfqu(zzfra paramzzfra) {}
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    Object localObject = this.zza.zzj();
    if (localObject != null) {
      return ((Map)localObject).entrySet().contains(paramObject);
    }
    if ((paramObject instanceof Map.Entry))
    {
      localObject = (Map.Entry)paramObject;
      int i = zzfra.zzd(this.zza, ((Map.Entry)localObject).getKey());
      if (i != -1)
      {
        paramObject = this.zza.zzc;
        paramObject.getClass();
        if (zzfou.zza(paramObject[i], ((Map.Entry)localObject).getValue())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final Iterator iterator()
  {
    Object localObject = this.zza;
    Map localMap = ((zzfra)localObject).zzj();
    if (localMap != null) {
      localObject = localMap.entrySet().iterator();
    } else {
      localObject = new zzfqs((zzfra)localObject);
    }
    return (Iterator)localObject;
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    Object localObject1 = this.zza.zzj();
    if (localObject1 != null) {
      return ((Map)localObject1).entrySet().remove(paramObject);
    }
    if ((paramObject instanceof Map.Entry))
    {
      localObject1 = (Map.Entry)paramObject;
      paramObject = this.zza;
      if (((zzfra)paramObject).zzo()) {
        return false;
      }
      int j = zzfra.zzc((zzfra)paramObject);
      paramObject = ((Map.Entry)localObject1).getKey();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      Object localObject3 = zzfra.zzh(this.zza);
      Object localObject4 = this.zza;
      int[] arrayOfInt = ((zzfra)localObject4).zza;
      arrayOfInt.getClass();
      localObject1 = ((zzfra)localObject4).zzb;
      localObject1.getClass();
      localObject4 = ((zzfra)localObject4).zzc;
      localObject4.getClass();
      int i = zzfrb.zzb(paramObject, localObject2, j, localObject3, arrayOfInt, (Object[])localObject1, (Object[])localObject4);
      if (i == -1) {
        return false;
      }
      this.zza.zzn(i, j);
      paramObject = this.zza;
      zzfra.zzk((zzfra)paramObject, zzfra.zzb((zzfra)paramObject) - 1);
      this.zza.zzl();
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */