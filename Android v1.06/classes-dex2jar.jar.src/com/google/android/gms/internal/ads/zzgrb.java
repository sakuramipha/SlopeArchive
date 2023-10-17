package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzgrb
{
  public static final int zza = 0;
  private static final Class zzb;
  private static final zzgrq zzc;
  private static final zzgrq zzd;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 16
    //   4: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore_0
    //   8: goto +6 -> 14
    //   11: astore_0
    //   12: aconst_null
    //   13: astore_0
    //   14: aload_0
    //   15: putstatic 24	com/google/android/gms/internal/ads/zzgrb:zzb	Ljava/lang/Class;
    //   18: ldc 26
    //   20: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   23: astore_0
    //   24: goto +6 -> 30
    //   27: astore_0
    //   28: aconst_null
    //   29: astore_0
    //   30: aload_0
    //   31: ifnonnull +8 -> 39
    //   34: aload_1
    //   35: astore_0
    //   36: goto +22 -> 58
    //   39: aload_0
    //   40: iconst_0
    //   41: anewarray 18	java/lang/Class
    //   44: invokevirtual 30	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   47: iconst_0
    //   48: anewarray 4	java/lang/Object
    //   51: invokevirtual 36	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast 38	com/google/android/gms/internal/ads/zzgrq
    //   57: astore_0
    //   58: aload_0
    //   59: putstatic 40	com/google/android/gms/internal/ads/zzgrb:zzc	Lcom/google/android/gms/internal/ads/zzgrq;
    //   62: new 42	com/google/android/gms/internal/ads/zzgrs
    //   65: dup
    //   66: invokespecial 45	com/google/android/gms/internal/ads/zzgrs:<init>	()V
    //   69: putstatic 47	com/google/android/gms/internal/ads/zzgrb:zzd	Lcom/google/android/gms/internal/ads/zzgrq;
    //   72: return
    //   73: astore_0
    //   74: aload_1
    //   75: astore_0
    //   76: goto -18 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   7	1	0	localClass1	Class
    //   11	1	0	localObject1	Object
    //   13	11	0	localClass2	Class
    //   27	1	0	localObject2	Object
    //   29	30	0	localObject3	Object
    //   73	1	0	localObject4	Object
    //   75	1	0	localObject5	Object
    //   1	74	1	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
    //   18	24	27	finally
    //   39	58	73	finally
  }
  
  static Object zzA(Object paramObject1, int paramInt, List paramList, zzgpa paramzzgpa, Object paramObject2, zzgrq paramzzgrq)
  {
    if (paramzzgpa == null) {
      return paramObject2;
    }
    int i;
    Object localObject;
    if ((paramList instanceof RandomAccess))
    {
      int k = paramList.size();
      i = 0;
      int j = 0;
      while (i < k)
      {
        int m = ((Integer)paramList.get(i)).intValue();
        if (paramzzgpa.zza(m))
        {
          if (i != j) {
            paramList.set(j, Integer.valueOf(m));
          }
          j++;
        }
        else
        {
          paramObject2 = zzB(paramObject1, paramInt, m, paramObject2, paramzzgrq);
        }
        i++;
      }
      localObject = paramObject2;
      if (j != k)
      {
        paramList.subList(j, k).clear();
        return paramObject2;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        localObject = paramObject2;
        if (!paramList.hasNext()) {
          break;
        }
        i = ((Integer)paramList.next()).intValue();
        if (!paramzzgpa.zza(i))
        {
          paramObject2 = zzB(paramObject1, paramInt, i, paramObject2, paramzzgrq);
          paramList.remove();
        }
      }
    }
    return localObject;
  }
  
  static Object zzB(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, zzgrq paramzzgrq)
  {
    Object localObject = paramObject2;
    if (paramObject2 == null) {
      localObject = paramzzgrq.zzc(paramObject1);
    }
    paramzzgrq.zzl(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  static void zzC(zzgrq paramzzgrq, Object paramObject1, Object paramObject2)
  {
    paramzzgrq.zzo(paramObject1, paramzzgrq.zze(paramzzgrq.zzd(paramObject1), paramzzgrq.zzd(paramObject2)));
  }
  
  public static void zzD(Class paramClass)
  {
    if (!zzgow.class.isAssignableFrom(paramClass))
    {
      Class localClass = zzb;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      }
    }
  }
  
  static boolean zzE(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public static void zzF(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzc(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzG(int paramInt, List paramList, zzgoe paramzzgoe)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zze(paramInt, paramList);
    }
  }
  
  public static void zzH(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzg(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzI(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzj(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzJ(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzl(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzK(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzn(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzL(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzp(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzM(int paramInt, List paramList, zzgoe paramzzgoe, zzgqz paramzzgqz)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      for (int i = 0; i < paramList.size(); i++) {
        paramzzgoe.zzq(paramInt, paramList.get(i), paramzzgqz);
      }
    }
  }
  
  public static void zzN(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzs(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzO(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzu(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzP(int paramInt, List paramList, zzgoe paramzzgoe, zzgqz paramzzgqz)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      for (int i = 0; i < paramList.size(); i++) {
        paramzzgoe.zzv(paramInt, paramList.get(i), paramzzgqz);
      }
    }
  }
  
  public static void zzQ(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzx(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzR(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzz(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzS(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzB(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzT(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzD(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzU(int paramInt, List paramList, zzgoe paramzzgoe)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzG(paramInt, paramList);
    }
  }
  
  public static void zzV(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzI(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void zzW(int paramInt, List paramList, zzgoe paramzzgoe, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramzzgoe.zzK(paramInt, paramList, paramBoolean);
    }
  }
  
  static int zza(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * (zzgod.zzA(paramInt << 3) + 1);
  }
  
  static int zzb(int paramInt, List paramList)
  {
    int j = paramList.size();
    int i = 0;
    if (j == 0) {
      return 0;
    }
    j *= zzgod.zzA(paramInt << 3);
    paramInt = i;
    i = j;
    while (paramInt < paramList.size())
    {
      j = ((zzgno)paramList.get(paramInt)).zzd();
      i += zzgod.zzA(j) + j;
      paramInt++;
    }
    return i;
  }
  
  static int zzc(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzd(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzd(List paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzgod.zzx(paramList.zze(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzgod.zzx(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return j;
  }
  
  static int zze(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * (zzgod.zzA(paramInt << 3) + 4);
  }
  
  static int zzf(List paramList)
  {
    return paramList.size() * 4;
  }
  
  static int zzg(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * (zzgod.zzA(paramInt << 3) + 8);
  }
  
  static int zzh(List paramList)
  {
    return paramList.size() * 8;
  }
  
  static int zzi(int paramInt, List paramList, zzgqz paramzzgqz)
  {
    int k = paramList.size();
    int i = 0;
    if (k != 0)
    {
      int j = 0;
      while (i < k)
      {
        j += zzgod.zzw(paramInt, (zzgqg)paramList.get(i), paramzzgqz);
        i++;
      }
      return j;
    }
    return 0;
  }
  
  static int zzj(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzk(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzk(List paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzgod.zzx(paramList.zze(k));
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
      i += zzgod.zzx(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  static int zzl(int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    return zzm(paramList) + paramList.size() * zzgod.zzA(paramInt << 3);
  }
  
  static int zzm(List paramList)
  {
    int m = paramList.size();
    int j = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = 0;
      for (;;)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzgod.zzB(paramList.zze(k));
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
      i += zzgod.zzB(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  static int zzn(int paramInt, Object paramObject, zzgqz paramzzgqz)
  {
    if ((paramObject instanceof zzgpm))
    {
      paramObject = (zzgpm)paramObject;
      i = zzgod.zzf;
      i = ((zzgpm)paramObject).zza();
      int j = zzgod.zzA(i);
      return zzgod.zzA(paramInt << 3) + (j + i);
    }
    int i = zzgod.zzy((zzgqg)paramObject, paramzzgqz);
    return zzgod.zzA(paramInt << 3) + i;
  }
  
  static int zzo(int paramInt, List paramList, zzgqz paramzzgqz)
  {
    int j = paramList.size();
    int i = 0;
    if (j == 0) {
      return 0;
    }
    paramInt = zzgod.zzA(paramInt << 3) * j;
    while (i < j)
    {
      Object localObject = paramList.get(i);
      if ((localObject instanceof zzgpm))
      {
        int k = ((zzgpm)localObject).zza();
        paramInt += zzgod.zzA(k) + k;
      }
      else
      {
        paramInt += zzgod.zzy((zzgqg)localObject, paramzzgqz);
      }
      i++;
    }
    return paramInt;
  }
  
  static int zzp(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzq(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzq(List paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = 0;
      for (;;)
      {
        k = i;
        if (j >= m) {
          break;
        }
        k = paramList.zze(j);
        i += zzgod.zzA(k >> 31 ^ k + k);
        j++;
      }
    }
    int i = 0;
    for (j = k;; j++)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = ((Integer)paramList.get(j)).intValue();
      i += zzgod.zzA(k >> 31 ^ k + k);
    }
    return k;
  }
  
  static int zzr(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzs(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzs(List paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    long l;
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        l = paramList.zze(k);
        i += zzgod.zzB(l >> 63 ^ l + l);
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      l = ((Long)paramList.get(k)).longValue();
      i += zzgod.zzB(l >> 63 ^ l + l);
      k++;
    }
    return j;
  }
  
  static int zzt(int paramInt, List paramList)
  {
    int m = paramList.size();
    int i = 0;
    int k = 0;
    if (m == 0) {
      return 0;
    }
    int j = zzgod.zzf;
    boolean bool = paramList instanceof zzgpo;
    j = zzgod.zzA(paramInt << 3) * m;
    paramInt = j;
    Object localObject;
    if (bool)
    {
      paramList = (zzgpo)paramList;
      paramInt = j;
      for (i = k;; i++)
      {
        j = paramInt;
        if (i >= m) {
          break;
        }
        localObject = paramList.zzf(i);
        if ((localObject instanceof zzgno))
        {
          j = ((zzgno)localObject).zzd();
          paramInt += zzgod.zzA(j) + j;
        }
        else
        {
          paramInt += zzgod.zzz((String)localObject);
        }
      }
    }
    for (;;)
    {
      j = paramInt;
      if (i >= m) {
        break;
      }
      localObject = paramList.get(i);
      if ((localObject instanceof zzgno))
      {
        j = ((zzgno)localObject).zzd();
        paramInt += zzgod.zzA(j) + j;
      }
      else
      {
        paramInt += zzgod.zzz((String)localObject);
      }
      i++;
    }
    return j;
  }
  
  static int zzu(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzv(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzv(List paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzgod.zzA(paramList.zze(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzgod.zzA(((Integer)paramList.get(k)).intValue());
      k++;
    }
    return j;
  }
  
  static int zzw(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return zzx(paramList) + i * zzgod.zzA(paramInt << 3);
  }
  
  static int zzx(List paramList)
  {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0) {
      return 0;
    }
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = 0;
      for (k = j;; k++)
      {
        j = i;
        if (k >= m) {
          break;
        }
        i += zzgod.zzB(paramList.zze(k));
      }
    }
    int i = 0;
    for (;;)
    {
      j = i;
      if (k >= m) {
        break;
      }
      i += zzgod.zzB(((Long)paramList.get(k)).longValue());
      k++;
    }
    return j;
  }
  
  public static zzgrq zzy()
  {
    return zzc;
  }
  
  public static zzgrq zzz()
  {
    return zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */