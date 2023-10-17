package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

final class zzjt
{
  private static final zzjt zzb = new zzjt(true);
  final zzmh zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzjt()
  {
    this.zza = new zzlx(16);
  }
  
  private zzjt(boolean paramBoolean)
  {
    this.zza = localzzlx;
    zzb();
    zzb();
  }
  
  public static zzjt zza()
  {
    throw null;
  }
  
  private static final void zzd(zzjs paramzzjs, Object paramObject)
  {
    zznb localzznb = paramzzjs.zzb();
    zzkk.zze(paramObject);
    Object localObject = zznb.zza;
    localObject = zznc.zza;
    boolean bool;
    switch (localzznb.zza().ordinal())
    {
    default: 
      break;
    case 8: 
      if ((paramObject instanceof zzlj)) {
        break label183;
      }
      if (!(paramObject instanceof zzko)) {
        break label184;
      }
    case 7: 
      if ((goto 183) || ((paramObject instanceof Integer))) {
        break label183;
      }
      if (!(paramObject instanceof zzke)) {
        break label184;
      }
    case 6: 
      if ((goto 183) || ((paramObject instanceof zzjb))) {
        break label183;
      }
      if (!(paramObject instanceof byte[])) {
        break label184;
      }
      break;
    case 5: 
      bool = paramObject instanceof String;
      break;
    case 4: 
      bool = paramObject instanceof Boolean;
      break;
    case 3: 
      bool = paramObject instanceof Double;
      break;
    case 2: 
      bool = paramObject instanceof Float;
      break;
    case 1: 
      bool = paramObject instanceof Long;
      break;
    case 0: 
      bool = paramObject instanceof Integer;
    }
    if (bool) {
      label183:
      return;
    }
    label184:
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramzzjs.zza()), paramzzjs.zzb().zza(), paramObject.getClass().getName() }));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzjt)) {
      return false;
    }
    paramObject = (zzjt)paramObject;
    return this.zza.equals(((zzjt)paramObject).zza);
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final void zzb()
  {
    if (this.zzc) {
      return;
    }
    this.zza.zza();
    this.zzc = true;
  }
  
  public final void zzc(zzjs paramzzjs, Object paramObject)
  {
    if (paramzzjs.zzc())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        int j = localArrayList.size();
        for (int i = 0; i < j; i++) {
          zzd(paramzzjs, localArrayList.get(i));
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zzd(paramzzjs, paramObject);
    }
    if ((paramObject instanceof zzko)) {
      this.zzd = true;
    }
    this.zza.zze(paramzzjs, paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */