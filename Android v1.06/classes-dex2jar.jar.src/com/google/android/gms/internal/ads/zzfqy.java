package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzfqy
  extends zzfql
{
  final zzfra zza;
  private final Object zzb;
  private int zzc;
  
  zzfqy(zzfra paramzzfra, int paramInt)
  {
    paramzzfra = paramzzfra.zzb;
    paramzzfra.getClass();
    this.zzb = paramzzfra[paramInt];
    this.zzc = paramInt;
  }
  
  private final void zza()
  {
    int i = this.zzc;
    if ((i != -1) && (i < this.zza.size()))
    {
      Object localObject1 = this.zzb;
      Object localObject2 = this.zza;
      i = this.zzc;
      localObject2 = ((zzfra)localObject2).zzb;
      localObject2.getClass();
      if (zzfou.zza(localObject1, localObject2[i])) {
        return;
      }
    }
    this.zzc = zzfra.zzd(this.zza, this.zzb);
  }
  
  public final Object getKey()
  {
    return this.zzb;
  }
  
  public final Object getValue()
  {
    Object localObject = this.zza.zzj();
    if (localObject != null) {
      return ((Map)localObject).get(this.zzb);
    }
    zza();
    int i = this.zzc;
    if (i == -1) {
      return null;
    }
    localObject = this.zza.zzc;
    localObject.getClass();
    return localObject[i];
  }
  
  public final Object setValue(Object paramObject)
  {
    Map localMap = this.zza.zzj();
    if (localMap != null) {
      return localMap.put(this.zzb, paramObject);
    }
    zza();
    int i = this.zzc;
    if (i == -1)
    {
      this.zza.put(this.zzb, paramObject);
      return null;
    }
    Object[] arrayOfObject = this.zza.zzc;
    arrayOfObject.getClass();
    localMap = arrayOfObject[i];
    arrayOfObject.getClass();
    arrayOfObject[i] = paramObject;
    return localMap;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */