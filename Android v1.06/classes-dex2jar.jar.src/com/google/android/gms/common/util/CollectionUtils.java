package com.google.android.gms.common.util;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CollectionUtils
{
  public static boolean isEmpty(Collection<?> paramCollection)
  {
    if (paramCollection == null) {
      return true;
    }
    return paramCollection.isEmpty();
  }
  
  @Deprecated
  public static <T> List<T> listOf()
  {
    return Collections.emptyList();
  }
  
  @Deprecated
  public static <T> List<T> listOf(T paramT)
  {
    return Collections.singletonList(paramT);
  }
  
  @Deprecated
  public static <T> List<T> listOf(T... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      if (i != 1) {
        return Collections.unmodifiableList(Arrays.asList(paramVarArgs));
      }
      return listOf(paramVarArgs[0]);
    }
    return listOf();
  }
  
  public static <K, V> Map<K, V> mapOf(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3)
  {
    Map localMap = zza(3, false);
    localMap.put(paramK1, paramV1);
    localMap.put(paramK2, paramV2);
    localMap.put(paramK3, paramV3);
    return Collections.unmodifiableMap(localMap);
  }
  
  public static <K, V> Map<K, V> mapOf(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5, K paramK6, V paramV6)
  {
    Map localMap = zza(6, false);
    localMap.put(paramK1, paramV1);
    localMap.put(paramK2, paramV2);
    localMap.put(paramK3, paramV3);
    localMap.put(paramK4, paramV4);
    localMap.put(paramK5, paramV5);
    localMap.put(paramK6, paramV6);
    return Collections.unmodifiableMap(localMap);
  }
  
  public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    int j = paramArrayOfK.length;
    int i = paramArrayOfV.length;
    if (j == i)
    {
      if (j != 0)
      {
        i = 0;
        if (j != 1)
        {
          Map localMap = zza(j, false);
          while (i < paramArrayOfK.length)
          {
            localMap.put(paramArrayOfK[i], paramArrayOfV[i]);
            i++;
          }
          return Collections.unmodifiableMap(localMap);
        }
        return Collections.singletonMap(paramArrayOfK[0], paramArrayOfV[0]);
      }
      return Collections.emptyMap();
    }
    paramArrayOfK = new StringBuilder(66);
    paramArrayOfK.append("Key and values array lengths not equal: ");
    paramArrayOfK.append(j);
    paramArrayOfK.append(" != ");
    paramArrayOfK.append(i);
    throw new IllegalArgumentException(paramArrayOfK.toString());
  }
  
  public static <T> Set<T> mutableSetOfWithSize(int paramInt)
  {
    Object localObject;
    if (paramInt == 0) {
      localObject = new ArraySet();
    } else {
      localObject = zzb(paramInt, true);
    }
    return (Set<T>)localObject;
  }
  
  @Deprecated
  public static <T> Set<T> setOf(T paramT1, T paramT2, T paramT3)
  {
    Set localSet = zzb(3, false);
    localSet.add(paramT1);
    localSet.add(paramT2);
    localSet.add(paramT3);
    return Collections.unmodifiableSet(localSet);
  }
  
  @Deprecated
  public static <T> Set<T> setOf(T... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              localObject = zzb(i, false);
              Collections.addAll((Collection)localObject, paramVarArgs);
              return Collections.unmodifiableSet((Set)localObject);
            }
            T ? = paramVarArgs[0];
            localObject = paramVarArgs[1];
            ? = paramVarArgs[2];
            T ? = paramVarArgs[3];
            paramVarArgs = zzb(4, false);
            paramVarArgs.add(?);
            paramVarArgs.add(localObject);
            paramVarArgs.add(?);
            paramVarArgs.add(?);
            return Collections.unmodifiableSet(paramVarArgs);
          }
          return setOf(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2]);
        }
        Object localObject = paramVarArgs[0];
        T ? = paramVarArgs[1];
        paramVarArgs = zzb(2, false);
        paramVarArgs.add(localObject);
        paramVarArgs.add(?);
        return Collections.unmodifiableSet(paramVarArgs);
      }
      return Collections.singleton(paramVarArgs[0]);
    }
    return Collections.emptySet();
  }
  
  private static <K, V> Map<K, V> zza(int paramInt, boolean paramBoolean)
  {
    Object localObject;
    if (paramInt <= 256) {
      localObject = new ArrayMap(paramInt);
    } else {
      localObject = new HashMap(paramInt, 1.0F);
    }
    return (Map<K, V>)localObject;
  }
  
  private static <T> Set<T> zzb(int paramInt, boolean paramBoolean)
  {
    float f;
    if (true != paramBoolean) {
      f = 1.0F;
    } else {
      f = 0.75F;
    }
    int i;
    if (true != paramBoolean) {
      i = 256;
    } else {
      i = 128;
    }
    Object localObject;
    if (paramInt <= i) {
      localObject = new ArraySet(paramInt);
    } else {
      localObject = new HashSet(paramInt, f);
    }
    return (Set<T>)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\CollectionUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */