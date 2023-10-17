package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzmh
{
  private static final Class<?> zzuz = ;
  private static final zzmx<?, ?> zzva = zzf(false);
  private static final zzmx<?, ?> zzvb = zzf(true);
  private static final zzmx<?, ?> zzvc = new zzmz();
  
  static int zza(List<Long> paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzle))
    {
      paramList = (zzle)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzo(paramList.getLong(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzo(((Long)paramList.get(k)).longValue());
      k++;
    }
    return j;
  }
  
  private static <UT, UB> UB zza(int paramInt1, int paramInt2, UB paramUB, zzmx<UT, UB> paramzzmx)
  {
    Object localObject = paramUB;
    if (paramUB == null) {
      localObject = paramzzmx.zzez();
    }
    paramzzmx.zza(localObject, paramInt1, paramInt2);
    return (UB)localObject;
  }
  
  static <UT, UB> UB zza(int paramInt, List<Integer> paramList, zzko paramzzko, UB paramUB, zzmx<UT, UB> paramzzmx)
  {
    if (paramzzko == null) {
      return paramUB;
    }
    int i;
    UB ?;
    if ((paramList instanceof RandomAccess))
    {
      int k = paramList.size();
      i = 0;
      int j = 0;
      while (i < k)
      {
        int m = ((Integer)paramList.get(i)).intValue();
        if (paramzzko.zzan(m))
        {
          if (i != j) {
            paramList.set(j, Integer.valueOf(m));
          }
          j++;
        }
        else
        {
          paramUB = zza(paramInt, m, paramUB, paramzzmx);
        }
        i++;
      }
      ? = paramUB;
      if (j != k)
      {
        paramList.subList(j, k).clear();
        ? = paramUB;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        ? = paramUB;
        if (!paramList.hasNext()) {
          break;
        }
        i = ((Integer)paramList.next()).intValue();
        if (!paramzzko.zzan(i))
        {
          paramUB = zza(paramInt, i, paramUB, paramzzmx);
          paramList.remove();
        }
      }
    }
    return ?;
  }
  
  public static void zza(int paramInt, List<String> paramList, zzns paramzzns)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zza(paramInt, paramList);
    }
  }
  
  public static void zza(int paramInt, List<?> paramList, zzns paramzzns, zzmf paramzzmf)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zza(paramInt, paramList, paramzzmf);
    }
  }
  
  public static void zza(int paramInt, List<Double> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzg(paramInt, paramList, paramBoolean);
    }
  }
  
  static <T, FT extends zzkd<FT>> void zza(zzjy<FT> paramzzjy, T paramT1, T paramT2)
  {
    paramT2 = paramzzjy.zzb(paramT2);
    if (!paramT2.zzos.isEmpty()) {
      paramzzjy.zzc(paramT1).zza(paramT2);
    }
  }
  
  static <T> void zza(zzll paramzzll, T paramT1, T paramT2, long paramLong)
  {
    zznd.zza(paramT1, paramLong, paramzzll.zzb(zznd.zzo(paramT1, paramLong), zznd.zzo(paramT2, paramLong)));
  }
  
  static <T, UT, UB> void zza(zzmx<UT, UB> paramzzmx, T paramT1, T paramT2)
  {
    paramzzmx.zze(paramT1, paramzzmx.zzg(paramzzmx.zzr(paramT1), paramzzmx.zzr(paramT2)));
  }
  
  static int zzb(List<Long> paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzle))
    {
      paramList = (zzle)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzp(paramList.getLong(k));
        k++;
      }
    }
    int i = 0;
    for (k = j;; k++)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzp(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void zzb(int paramInt, List<zzjc> paramList, zzns paramzzns)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzb(paramInt, paramList);
    }
  }
  
  public static void zzb(int paramInt, List<?> paramList, zzns paramzzns, zzmf paramzzmf)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzb(paramInt, paramList, paramzzmf);
    }
  }
  
  public static void zzb(int paramInt, List<Float> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzf(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzc(int paramInt, Object paramObject, zzmf paramzzmf)
  {
    if ((paramObject instanceof zzkx)) {
      return zzjr.zza(paramInt, (zzkx)paramObject);
    }
    return zzjr.zzb(paramInt, (zzlq)paramObject, paramzzmf);
  }
  
  static int zzc(int paramInt, List<?> paramList)
  {
    int m = paramList.size();
    int i = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    int j = zzjr.zzab(paramInt) * m;
    paramInt = j;
    Object localObject;
    if ((paramList instanceof zzkz))
    {
      localObject = (zzkz)paramList;
      paramInt = j;
      for (i = k;; i++)
      {
        j = paramInt;
        if (i >= m) {
          break;
        }
        paramList = ((zzkz)localObject).zzao(i);
        if ((paramList instanceof zzjc)) {
          j = zzjr.zzb((zzjc)paramList);
        } else {
          j = zzjr.zzm((String)paramList);
        }
        paramInt += j;
      }
    }
    for (;;)
    {
      j = paramInt;
      if (i >= m) {
        break;
      }
      localObject = paramList.get(i);
      if ((localObject instanceof zzjc)) {
        j = zzjr.zzb((zzjc)localObject);
      } else {
        j = zzjr.zzm((String)localObject);
      }
      paramInt += j;
      i++;
    }
    return j;
  }
  
  static int zzc(int paramInt, List<?> paramList, zzmf paramzzmf)
  {
    int k = paramList.size();
    int i = 0;
    if (k == 0) {
      return 0;
    }
    paramInt = zzjr.zzab(paramInt) * k;
    while (i < k)
    {
      Object localObject = paramList.get(i);
      int j;
      if ((localObject instanceof zzkx)) {
        j = zzjr.zza((zzkx)localObject);
      } else {
        j = zzjr.zza((zzlq)localObject, paramzzmf);
      }
      paramInt += j;
      i++;
    }
    return paramInt;
  }
  
  static int zzc(List<Long> paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzle))
    {
      paramList = (zzle)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzq(paramList.getLong(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzq(((Long)paramList.get(k)).longValue());
      k++;
    }
    return j;
  }
  
  public static void zzc(int paramInt, List<Long> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzc(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzd(int paramInt, List<zzjc> paramList)
  {
    int j = paramList.size();
    int i = 0;
    if (j == 0) {
      return 0;
    }
    j *= zzjr.zzab(paramInt);
    paramInt = i;
    i = j;
    while (paramInt < paramList.size())
    {
      i += zzjr.zzb((zzjc)paramList.get(paramInt));
      paramInt++;
    }
    return i;
  }
  
  static int zzd(int paramInt, List<zzlq> paramList, zzmf paramzzmf)
  {
    int k = paramList.size();
    int j = 0;
    if (k == 0) {
      return 0;
    }
    int i = 0;
    while (j < k)
    {
      i += zzjr.zzc(paramInt, (zzlq)paramList.get(j), paramzzmf);
      j++;
    }
    return i;
  }
  
  static int zzd(List<Integer> paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzkl))
    {
      paramList = (zzkl)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzah(paramList.getInt(k));
        k++;
      }
    }
    int i = 0;
    for (k = j;; k++)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzah(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zzd(int paramInt, List<Long> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzd(paramInt, paramList, paramBoolean);
    }
  }
  
  static boolean zzd(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  static int zze(List<Integer> paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzkl))
    {
      paramList = (zzkl)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzac(paramList.getInt(k));
        k++;
      }
    }
    int i = 0;
    for (k = j;; k++)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzac(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void zze(int paramInt, List<Long> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzn(paramInt, paramList, paramBoolean);
    }
  }
  
  public static zzmx<?, ?> zzem()
  {
    return zzva;
  }
  
  public static zzmx<?, ?> zzen()
  {
    return zzvb;
  }
  
  public static zzmx<?, ?> zzeo()
  {
    return zzvc;
  }
  
  private static Class<?> zzep()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessage");
      return localClass;
    }
    finally {}
    return null;
  }
  
  private static Class<?> zzeq()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    finally {}
    return null;
  }
  
  static int zzf(List<Integer> paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzkl))
    {
      paramList = (zzkl)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzad(paramList.getInt(k));
        k++;
      }
    }
    int i = 0;
    for (k = j;; k++)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzad(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  private static zzmx<?, ?> zzf(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = zzeq();
      if (localObject1 == null) {
        return null;
      }
      localObject1 = (zzmx)((Class)localObject1).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (zzmx<?, ?>)localObject1;
    }
    finally {}
    return null;
  }
  
  public static void zzf(int paramInt, List<Long> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zze(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzg(List<Integer> paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzkl))
    {
      paramList = (zzkl)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzjr.zzae(paramList.getInt(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzjr.zzae(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return j;
  }
  
  public static void zzg(int paramInt, List<Long> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzl(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzg(Class<?> paramClass)
  {
    if (!zzkk.class.isAssignableFrom(paramClass))
    {
      Class localClass = zzuz;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      }
    }
  }
  
  static int zzh(List<?> paramList)
  {
    return paramList.size() << 2;
  }
  
  public static void zzh(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zza(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzi(List<?> paramList)
  {
    return paramList.size() << 3;
  }
  
  public static void zzi(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzj(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzj(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static void zzj(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzm(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzk(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzb(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzl(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzk(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzm(int paramInt, List<Integer> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzh(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzn(int paramInt, List<Boolean> paramList, zzns paramzzns, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzns.zzi(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zzo(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    return zza(paramList) + paramList.size() * zzjr.zzab(paramInt);
  }
  
  static int zzp(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzb(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzq(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzc(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzr(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzd(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzs(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zze(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzt(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzf(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzu(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzg(paramList) + i * zzjr.zzab(paramInt);
  }
  
  static int zzv(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * zzjr.zzj(paramInt, 0);
  }
  
  static int zzw(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * zzjr.zzg(paramInt, 0L);
  }
  
  static int zzx(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * zzjr.zzc(paramInt, true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */