package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class zzkb<FieldDescriptorType extends zzkd<FieldDescriptorType>>
{
  private static final zzkb zzov = new zzkb(true);
  final zzmi<FieldDescriptorType, Object> zzos;
  private boolean zzot;
  private boolean zzou = false;
  
  private zzkb()
  {
    this.zzos = zzmi.zzav(16);
  }
  
  private zzkb(boolean paramBoolean)
  {
    this.zzos = zzmi.zzav(0);
    zzbp();
  }
  
  static int zza(zznm paramzznm, int paramInt, Object paramObject)
  {
    int i = zzjr.zzab(paramInt);
    paramInt = i;
    if (paramzznm == zznm.zzxd)
    {
      zzkm.zzf((zzlq)paramObject);
      paramInt = i << 1;
    }
    return paramInt + zzb(paramzznm, paramObject);
  }
  
  private final Object zza(FieldDescriptorType paramFieldDescriptorType)
  {
    Object localObject = this.zzos.get(paramFieldDescriptorType);
    paramFieldDescriptorType = (FieldDescriptorType)localObject;
    if ((localObject instanceof zzkt)) {
      paramFieldDescriptorType = zzkt.zzdp();
    }
    return paramFieldDescriptorType;
  }
  
  static void zza(zzjr paramzzjr, zznm paramzznm, int paramInt, Object paramObject)
    throws IOException
  {
    if (paramzznm == zznm.zzxd)
    {
      paramzznm = (zzlq)paramObject;
      zzkm.zzf(paramzznm);
      paramzzjr.zzb(paramInt, 3);
      paramzznm.zzb(paramzzjr);
      paramzzjr.zzb(paramInt, 4);
      return;
    }
    paramzzjr.zzb(paramInt, paramzznm.zzfk());
    switch (zzkc.zzox[paramzznm.ordinal()])
    {
    default: 
      break;
    case 18: 
      if ((paramObject instanceof zzkn))
      {
        paramzzjr.zzx(((zzkn)paramObject).zzcp());
        return;
      }
      paramzzjr.zzx(((Integer)paramObject).intValue());
      break;
    case 17: 
      paramzzjr.zzm(((Long)paramObject).longValue());
      return;
    case 16: 
      paramzzjr.zzz(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramzzjr.zzn(((Long)paramObject).longValue());
      return;
    case 14: 
      paramzzjr.zzaa(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramzzjr.zzy(((Integer)paramObject).intValue());
      return;
    case 12: 
      if ((paramObject instanceof zzjc))
      {
        paramzzjr.zza((zzjc)paramObject);
        return;
      }
      paramzznm = (byte[])paramObject;
      paramzzjr.zzd(paramzznm, 0, paramzznm.length);
      return;
    case 11: 
      if ((paramObject instanceof zzjc))
      {
        paramzzjr.zza((zzjc)paramObject);
        return;
      }
      paramzzjr.zzl((String)paramObject);
      return;
    case 10: 
      paramzzjr.zzb((zzlq)paramObject);
      return;
    case 9: 
      ((zzlq)paramObject).zzb(paramzzjr);
      return;
    case 8: 
      paramzzjr.zzc(((Boolean)paramObject).booleanValue());
      return;
    case 7: 
      paramzzjr.zzaa(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramzzjr.zzn(((Long)paramObject).longValue());
      return;
    case 5: 
      paramzzjr.zzx(((Integer)paramObject).intValue());
      return;
    case 4: 
      paramzzjr.zzl(((Long)paramObject).longValue());
      return;
    case 3: 
      paramzzjr.zzl(((Long)paramObject).longValue());
      return;
    case 2: 
      paramzzjr.zza(((Float)paramObject).floatValue());
      return;
    case 1: 
      paramzzjr.zza(((Double)paramObject).doubleValue());
    }
  }
  
  private final void zza(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.zzcs())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        paramObject = (ArrayList)localArrayList;
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          paramObject = localArrayList.get(i);
          i++;
          zza(paramFieldDescriptorType.zzcq(), paramObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zza(paramFieldDescriptorType.zzcq(), paramObject);
    }
    if ((paramObject instanceof zzkt)) {
      this.zzou = true;
    }
    this.zzos.zza(paramFieldDescriptorType, paramObject);
  }
  
  private static void zza(zznm paramzznm, Object paramObject)
  {
    zzkm.checkNotNull(paramObject);
    int i = zzkc.zzow[paramzznm.zzfj().ordinal()];
    boolean bool2 = true;
    boolean bool1 = false;
    switch (i)
    {
    default: 
      break;
    case 9: 
      bool1 = bool2;
      if ((paramObject instanceof zzlq)) {
        break label194;
      }
      if ((paramObject instanceof zzkt)) {
        bool1 = bool2;
      }
      break;
    case 8: 
    case 7: 
      do
      {
        do
        {
          bool1 = false;
          break;
          bool1 = bool2;
          if ((paramObject instanceof Integer)) {
            break;
          }
        } while (!(paramObject instanceof zzkn));
        bool1 = bool2;
        break;
        bool1 = bool2;
        if ((paramObject instanceof zzjc)) {
          break;
        }
      } while (!(paramObject instanceof byte[]));
      bool1 = bool2;
      break;
    case 6: 
      bool1 = paramObject instanceof String;
      break;
    case 5: 
      bool1 = paramObject instanceof Boolean;
      break;
    case 4: 
      bool1 = paramObject instanceof Double;
      break;
    case 3: 
      bool1 = paramObject instanceof Float;
      break;
    case 2: 
      bool1 = paramObject instanceof Long;
      break;
    }
    bool1 = paramObject instanceof Integer;
    label194:
    if (bool1) {
      return;
    }
    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
  }
  
  public static int zzb(zzkd<?> paramzzkd, Object paramObject)
  {
    zznm localzznm = paramzzkd.zzcq();
    int k = paramzzkd.zzcp();
    if (paramzzkd.zzcs())
    {
      boolean bool = paramzzkd.zzct();
      int j = 0;
      int i = 0;
      if (bool)
      {
        paramzzkd = ((List)paramObject).iterator();
        while (paramzzkd.hasNext()) {
          i += zzb(localzznm, paramzzkd.next());
        }
        return zzjr.zzab(k) + i + zzjr.zzaj(i);
      }
      paramzzkd = ((List)paramObject).iterator();
      i = j;
      while (paramzzkd.hasNext()) {
        i += zza(localzznm, k, paramzzkd.next());
      }
      return i;
    }
    return zza(localzznm, k, paramObject);
  }
  
  private static int zzb(zznm paramzznm, Object paramObject)
  {
    switch (zzkc.zzox[paramzznm.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof zzkn)) {
        return zzjr.zzah(((zzkn)paramObject).zzcp());
      }
      return zzjr.zzah(((Integer)paramObject).intValue());
    case 17: 
      return zzjr.zzq(((Long)paramObject).longValue());
    case 16: 
      return zzjr.zzae(((Integer)paramObject).intValue());
    case 15: 
      return zzjr.zzs(((Long)paramObject).longValue());
    case 14: 
      return zzjr.zzag(((Integer)paramObject).intValue());
    case 13: 
      return zzjr.zzad(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof zzjc)) {
        return zzjr.zzb((zzjc)paramObject);
      }
      return zzjr.zzc((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof zzjc)) {
        return zzjr.zzb((zzjc)paramObject);
      }
      return zzjr.zzm((String)paramObject);
    case 10: 
      if ((paramObject instanceof zzkt)) {
        return zzjr.zza((zzkt)paramObject);
      }
      return zzjr.zzc((zzlq)paramObject);
    case 9: 
      return zzjr.zzd((zzlq)paramObject);
    case 8: 
      return zzjr.zzd(((Boolean)paramObject).booleanValue());
    case 7: 
      return zzjr.zzaf(((Integer)paramObject).intValue());
    case 6: 
      return zzjr.zzr(((Long)paramObject).longValue());
    case 5: 
      return zzjr.zzac(((Integer)paramObject).intValue());
    case 4: 
      return zzjr.zzp(((Long)paramObject).longValue());
    case 3: 
      return zzjr.zzo(((Long)paramObject).longValue());
    case 2: 
      return zzjr.zzb(((Float)paramObject).floatValue());
    }
    return zzjr.zzb(((Double)paramObject).doubleValue());
  }
  
  private static boolean zzb(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    zzkd localzzkd = (zzkd)paramEntry.getKey();
    if (localzzkd.zzcr() == zznr.zzxx)
    {
      if (localzzkd.zzcs())
      {
        paramEntry = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!paramEntry.hasNext()) {
            break;
          }
        } while (((zzlq)paramEntry.next()).isInitialized());
        return false;
      }
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof zzlq))
      {
        if (!((zzlq)paramEntry).isInitialized()) {
          return false;
        }
      }
      else
      {
        if ((paramEntry instanceof zzkt)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private final void zzc(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    zzkd localzzkd = (zzkd)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    paramEntry = (Map.Entry<FieldDescriptorType, Object>)localObject1;
    if ((localObject1 instanceof zzkt)) {
      paramEntry = zzkt.zzdp();
    }
    if (localzzkd.zzcs())
    {
      Object localObject2 = zza(localzzkd);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new ArrayList();
      }
      paramEntry = ((List)paramEntry).iterator();
      while (paramEntry.hasNext())
      {
        localObject2 = paramEntry.next();
        ((List)localObject1).add(zze(localObject2));
      }
      this.zzos.zza(localzzkd, localObject1);
      return;
    }
    if (localzzkd.zzcr() == zznr.zzxx)
    {
      localObject1 = zza(localzzkd);
      if (localObject1 == null)
      {
        this.zzos.zza(localzzkd, zze(paramEntry));
        return;
      }
      if ((localObject1 instanceof zzlx)) {
        paramEntry = localzzkd.zza((zzlx)localObject1, (zzlx)paramEntry);
      } else {
        paramEntry = localzzkd.zza(((zzlq)localObject1).zzcy(), (zzlq)paramEntry).zzdf();
      }
      this.zzos.zza(localzzkd, paramEntry);
      return;
    }
    this.zzos.zza(localzzkd, zze(paramEntry));
  }
  
  public static <T extends zzkd<T>> zzkb<T> zzcn()
  {
    return zzov;
  }
  
  private static int zzd(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    zzkd localzzkd = (zzkd)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localzzkd.zzcr() == zznr.zzxx) && (!localzzkd.zzcs()) && (!localzzkd.zzct()))
    {
      if ((localObject instanceof zzkt)) {
        return zzjr.zzb(((zzkd)paramEntry.getKey()).zzcp(), (zzkt)localObject);
      }
      return zzjr.zzb(((zzkd)paramEntry.getKey()).zzcp(), (zzlq)localObject);
    }
    return zzb(localzzkd, localObject);
  }
  
  private static Object zze(Object paramObject)
  {
    if ((paramObject instanceof zzlx)) {
      return ((zzlx)paramObject).zzef();
    }
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, paramObject, 0, arrayOfByte.length);
      return paramObject;
    }
    return paramObject;
  }
  
  final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator()
  {
    if (this.zzou) {
      return new zzkw(this.zzos.zzet().iterator());
    }
    return this.zzos.zzet().iterator();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzkb)) {
      return false;
    }
    paramObject = (zzkb)paramObject;
    return this.zzos.equals(((zzkb)paramObject).zzos);
  }
  
  public final int hashCode()
  {
    return this.zzos.hashCode();
  }
  
  public final boolean isImmutable()
  {
    return this.zzot;
  }
  
  public final boolean isInitialized()
  {
    for (int i = 0; i < this.zzos.zzer(); i++) {
      if (!zzb(this.zzos.zzaw(i))) {
        return false;
      }
    }
    Iterator localIterator = this.zzos.zzes().iterator();
    while (localIterator.hasNext()) {
      if (!zzb((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator()
  {
    if (this.zzou) {
      return new zzkw(this.zzos.entrySet().iterator());
    }
    return this.zzos.entrySet().iterator();
  }
  
  public final void zza(zzkb<FieldDescriptorType> paramzzkb)
  {
    for (int i = 0; i < paramzzkb.zzos.zzer(); i++) {
      zzc(paramzzkb.zzos.zzaw(i));
    }
    paramzzkb = paramzzkb.zzos.zzes().iterator();
    while (paramzzkb.hasNext()) {
      zzc((Map.Entry)paramzzkb.next());
    }
  }
  
  public final void zzbp()
  {
    if (this.zzot) {
      return;
    }
    this.zzos.zzbp();
    this.zzot = true;
  }
  
  public final int zzco()
  {
    int j = 0;
    int i = 0;
    while (j < this.zzos.zzer())
    {
      i += zzd(this.zzos.zzaw(j));
      j++;
    }
    Iterator localIterator = this.zzos.zzes().iterator();
    while (localIterator.hasNext()) {
      i += zzd((Map.Entry)localIterator.next());
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */