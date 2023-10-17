package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class ArrayUtils
{
  public static <T> T[] concat(T[]... paramVarArgs)
  {
    if (paramVarArgs.length != 0)
    {
      int i = 0;
      int j = 0;
      while (i < paramVarArgs.length)
      {
        j += paramVarArgs[i].length;
        i++;
      }
      Object[] arrayOfObject = Arrays.copyOf(paramVarArgs[0], j);
      j = paramVarArgs[0].length;
      for (i = 1; i < paramVarArgs.length; i++)
      {
        T[] arrayOfT = paramVarArgs[i];
        int k = arrayOfT.length;
        System.arraycopy(arrayOfT, 0, arrayOfObject, j, k);
        j += k;
      }
      return arrayOfObject;
    }
    return (Object[])Array.newInstance(paramVarArgs.getClass(), 0);
  }
  
  public static byte[] concatByteArrays(byte[]... paramVarArgs)
  {
    if (paramVarArgs.length != 0)
    {
      int j = 0;
      int i = 0;
      while (j < paramVarArgs.length)
      {
        i += paramVarArgs[j].length;
        j++;
      }
      byte[] arrayOfByte2 = Arrays.copyOf(paramVarArgs[0], i);
      j = paramVarArgs[0].length;
      for (i = 1; i < paramVarArgs.length; i++)
      {
        byte[] arrayOfByte1 = paramVarArgs[i];
        int k = arrayOfByte1.length;
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, k);
        j += k;
      }
      return arrayOfByte2;
    }
    return new byte[0];
  }
  
  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null) {
      return false;
    }
    int j = paramArrayOfInt.length;
    for (int i = 0; i < j; i++) {
      if (paramArrayOfInt[i] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static <T> boolean contains(T[] paramArrayOfT, T paramT)
  {
    int i;
    if (paramArrayOfT != null) {
      i = paramArrayOfT.length;
    } else {
      i = 0;
    }
    for (int j = 0; j < i; j++) {
      if (Objects.equal(paramArrayOfT[j], paramT))
      {
        if (j < 0) {
          break;
        }
        return true;
      }
    }
    return false;
  }
  
  public static <T> ArrayList<T> newArrayList()
  {
    return new ArrayList();
  }
  
  public static <T> T[] removeAll(T[] paramArrayOfT1, T... paramVarArgs)
  {
    Object localObject1 = null;
    if (paramArrayOfT1 == null) {
      return null;
    }
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i != 0)
      {
        Object localObject2 = paramVarArgs.getClass().getComponentType();
        int m = paramArrayOfT1.length;
        localObject2 = (Object[])Array.newInstance((Class)localObject2, m);
        int j = 0;
        T ?;
        if (i == 1)
        {
          j = 0;
          for (i = 0;; i = k)
          {
            k = i;
            if (j >= m) {
              break;
            }
            ? = paramArrayOfT1[j];
            k = i;
            if (!Objects.equal(paramVarArgs[0], ?))
            {
              localObject2[i] = ?;
              k = i + 1;
            }
            j++;
          }
        }
        for (i = 0; j < m; i = k)
        {
          ? = paramArrayOfT1[j];
          k = i;
          if (!contains(paramVarArgs, ?))
          {
            localObject2[i] = ?;
            k = i + 1;
          }
          j++;
        }
        int k = i;
        if (localObject2 == null)
        {
          paramArrayOfT1 = (T[])localObject1;
        }
        else
        {
          if (k != localObject2.length) {
            break label179;
          }
          paramArrayOfT1 = (T[])localObject2;
        }
        return paramArrayOfT1;
        label179:
        return Arrays.copyOf((Object[])localObject2, k);
      }
    }
    return Arrays.copyOf(paramArrayOfT1, paramArrayOfT1.length);
  }
  
  public static <T> ArrayList<T> toArrayList(T[] paramArrayOfT)
  {
    int j = paramArrayOfT.length;
    ArrayList localArrayList = new ArrayList(j);
    for (int i = 0; i < j; i++) {
      localArrayList.add(paramArrayOfT[i]);
    }
    return localArrayList;
  }
  
  public static int[] toPrimitiveArray(Collection<Integer> paramCollection)
  {
    int i = 0;
    if ((paramCollection != null) && (paramCollection.size() != 0))
    {
      int[] arrayOfInt = new int[paramCollection.size()];
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        arrayOfInt[i] = ((Integer)paramCollection.next()).intValue();
        i++;
      }
      return arrayOfInt;
    }
    return new int[0];
  }
  
  public static Integer[] toWrapperArray(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    int j = paramArrayOfInt.length;
    Integer[] arrayOfInteger = new Integer[j];
    for (int i = 0; i < j; i++) {
      arrayOfInteger[i] = Integer.valueOf(paramArrayOfInt[i]);
    }
    return arrayOfInteger;
  }
  
  public static void writeArray(StringBuilder paramStringBuilder, double[] paramArrayOfDouble)
  {
    int j = paramArrayOfDouble.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Double.toString(paramArrayOfDouble[i]));
    }
  }
  
  public static void writeArray(StringBuilder paramStringBuilder, float[] paramArrayOfFloat)
  {
    int j = paramArrayOfFloat.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Float.toString(paramArrayOfFloat[i]));
    }
  }
  
  public static void writeArray(StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Integer.toString(paramArrayOfInt[i]));
    }
  }
  
  public static void writeArray(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    int j = paramArrayOfLong.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Long.toString(paramArrayOfLong[i]));
    }
  }
  
  public static <T> void writeArray(StringBuilder paramStringBuilder, T[] paramArrayOfT)
  {
    int j = paramArrayOfT.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(paramArrayOfT[i]);
    }
  }
  
  public static void writeArray(StringBuilder paramStringBuilder, boolean[] paramArrayOfBoolean)
  {
    int j = paramArrayOfBoolean.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Boolean.toString(paramArrayOfBoolean[i]));
    }
  }
  
  public static void writeStringArray(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int j = paramArrayOfString.length;
    for (int i = 0; i < j; i++)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append("\"");
      paramStringBuilder.append(paramArrayOfString[i]);
      paramStringBuilder.append("\"");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\ArrayUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */