package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader
{
  public static BigDecimal createBigDecimal(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    int i = paramParcel.readInt();
    paramParcel.setDataPosition(j + paramInt);
    return new BigDecimal(new BigInteger(arrayOfByte), i);
  }
  
  public static BigDecimal[] createBigDecimalArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    int i = paramParcel.readInt();
    BigDecimal[] arrayOfBigDecimal = new BigDecimal[i];
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      byte[] arrayOfByte = paramParcel.createByteArray();
      int m = paramParcel.readInt();
      arrayOfBigDecimal[paramInt] = new BigDecimal(new BigInteger(arrayOfByte), m);
    }
    paramParcel.setDataPosition(k + j);
    return arrayOfBigDecimal;
  }
  
  public static BigInteger createBigInteger(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(paramInt + i);
    return new BigInteger(arrayOfByte);
  }
  
  public static BigInteger[] createBigIntegerArray(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int k = paramParcel.readInt();
    BigInteger[] arrayOfBigInteger = new BigInteger[k];
    for (paramInt = 0; paramInt < k; paramInt++) {
      arrayOfBigInteger[paramInt] = new BigInteger(paramParcel.createByteArray());
    }
    paramParcel.setDataPosition(j + i);
    return arrayOfBigInteger;
  }
  
  public static boolean[] createBooleanArray(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    boolean[] arrayOfBoolean = paramParcel.createBooleanArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfBoolean;
  }
  
  public static ArrayList<Boolean> createBooleanList(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = paramParcel.readInt();
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      localArrayList.add(Boolean.valueOf(bool));
    }
    paramParcel.setDataPosition(i + k);
    return localArrayList;
  }
  
  public static Bundle createBundle(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    Bundle localBundle = paramParcel.readBundle();
    paramParcel.setDataPosition(i + paramInt);
    return localBundle;
  }
  
  public static byte[] createByteArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    byte[] arrayOfByte = paramParcel.createByteArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfByte;
  }
  
  public static byte[][] createByteArrayArray(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int j = paramParcel.readInt();
    byte[][] arrayOfByte = new byte[j][];
    for (paramInt = 0; paramInt < j; paramInt++) {
      arrayOfByte[paramInt] = paramParcel.createByteArray();
    }
    paramParcel.setDataPosition(k + i);
    return arrayOfByte;
  }
  
  public static SparseArray<byte[]> createByteArraySparseArray(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    int i = paramParcel.readInt();
    SparseArray localSparseArray = new SparseArray(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      localSparseArray.append(paramParcel.readInt(), paramParcel.createByteArray());
    }
    paramParcel.setDataPosition(j + k);
    return localSparseArray;
  }
  
  public static char[] createCharArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    char[] arrayOfChar = paramParcel.createCharArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfChar;
  }
  
  public static double[] createDoubleArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    double[] arrayOfDouble = paramParcel.createDoubleArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfDouble;
  }
  
  public static ArrayList<Double> createDoubleList(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramParcel.readInt();
    for (paramInt = 0; paramInt < i; paramInt++) {
      localArrayList.add(Double.valueOf(paramParcel.readDouble()));
    }
    paramParcel.setDataPosition(j + k);
    return localArrayList;
  }
  
  public static SparseArray<Double> createDoubleSparseArray(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    SparseArray localSparseArray = new SparseArray();
    int i = paramParcel.readInt();
    for (paramInt = 0; paramInt < i; paramInt++) {
      localSparseArray.append(paramParcel.readInt(), Double.valueOf(paramParcel.readDouble()));
    }
    paramParcel.setDataPosition(j + k);
    return localSparseArray;
  }
  
  public static float[] createFloatArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    float[] arrayOfFloat = paramParcel.createFloatArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfFloat;
  }
  
  public static ArrayList<Float> createFloatList(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramParcel.readInt();
    for (paramInt = 0; paramInt < i; paramInt++) {
      localArrayList.add(Float.valueOf(paramParcel.readFloat()));
    }
    paramParcel.setDataPosition(k + j);
    return localArrayList;
  }
  
  public static SparseArray<Float> createFloatSparseArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    SparseArray localSparseArray = new SparseArray();
    int k = paramParcel.readInt();
    for (paramInt = 0; paramInt < k; paramInt++) {
      localSparseArray.append(paramParcel.readInt(), Float.valueOf(paramParcel.readFloat()));
    }
    paramParcel.setDataPosition(i + j);
    return localSparseArray;
  }
  
  public static IBinder[] createIBinderArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    IBinder[] arrayOfIBinder = paramParcel.createBinderArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfIBinder;
  }
  
  public static ArrayList<IBinder> createIBinderList(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createBinderArrayList();
    paramParcel.setDataPosition(i + paramInt);
    return localArrayList;
  }
  
  public static SparseArray<IBinder> createIBinderSparseArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    int k = paramParcel.readInt();
    SparseArray localSparseArray = new SparseArray(k);
    for (paramInt = 0; paramInt < k; paramInt++) {
      localSparseArray.append(paramParcel.readInt(), paramParcel.readStrongBinder());
    }
    paramParcel.setDataPosition(i + j);
    return localSparseArray;
  }
  
  public static int[] createIntArray(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfInt;
  }
  
  public static ArrayList<Integer> createIntegerList(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramParcel.readInt();
    for (paramInt = 0; paramInt < i; paramInt++) {
      localArrayList.add(Integer.valueOf(paramParcel.readInt()));
    }
    paramParcel.setDataPosition(j + k);
    return localArrayList;
  }
  
  public static long[] createLongArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    long[] arrayOfLong = paramParcel.createLongArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfLong;
  }
  
  public static ArrayList<Long> createLongList(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = paramParcel.readInt();
    for (paramInt = 0; paramInt < j; paramInt++) {
      localArrayList.add(Long.valueOf(paramParcel.readLong()));
    }
    paramParcel.setDataPosition(k + i);
    return localArrayList;
  }
  
  public static Parcel createParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    localParcel.appendFrom(paramParcel, i, paramInt);
    paramParcel.setDataPosition(i + paramInt);
    return localParcel;
  }
  
  public static Parcel[] createParcelArray(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    int i = paramParcel.readInt();
    Parcel[] arrayOfParcel = new Parcel[i];
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      int n = paramParcel.readInt();
      if (n != 0)
      {
        int m = paramParcel.dataPosition();
        Parcel localParcel = Parcel.obtain();
        localParcel.appendFrom(paramParcel, m, n);
        arrayOfParcel[paramInt] = localParcel;
        paramParcel.setDataPosition(m + n);
      }
      else
      {
        arrayOfParcel[paramInt] = null;
      }
    }
    paramParcel.setDataPosition(j + k);
    return arrayOfParcel;
  }
  
  public static ArrayList<Parcel> createParcelList(Parcel paramParcel, int paramInt)
  {
    int k = readSize(paramParcel, paramInt);
    int j = paramParcel.dataPosition();
    if (k == 0) {
      return null;
    }
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      int n = paramParcel.readInt();
      if (n != 0)
      {
        int m = paramParcel.dataPosition();
        Parcel localParcel = Parcel.obtain();
        localParcel.appendFrom(paramParcel, m, n);
        localArrayList.add(localParcel);
        paramParcel.setDataPosition(m + n);
      }
      else
      {
        localArrayList.add(null);
      }
    }
    paramParcel.setDataPosition(j + k);
    return localArrayList;
  }
  
  public static SparseArray<Parcel> createParcelSparseArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    int i = paramParcel.readInt();
    SparseArray localSparseArray = new SparseArray();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      int i1 = paramParcel.readInt();
      int m = paramParcel.readInt();
      if (m != 0)
      {
        int n = paramParcel.dataPosition();
        Parcel localParcel = Parcel.obtain();
        localParcel.appendFrom(paramParcel, n, m);
        localSparseArray.append(i1, localParcel);
        paramParcel.setDataPosition(n + m);
      }
      else
      {
        localSparseArray.append(i1, null);
      }
    }
    paramParcel.setDataPosition(k + j);
    return localSparseArray;
  }
  
  public static <T extends Parcelable> T createParcelable(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(paramInt + i);
    return paramCreator;
  }
  
  public static SparseBooleanArray createSparseBooleanArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    SparseBooleanArray localSparseBooleanArray = paramParcel.readSparseBooleanArray();
    paramParcel.setDataPosition(i + paramInt);
    return localSparseBooleanArray;
  }
  
  public static SparseIntArray createSparseIntArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    SparseIntArray localSparseIntArray = new SparseIntArray();
    int i = paramParcel.readInt();
    for (paramInt = 0; paramInt < i; paramInt++) {
      localSparseIntArray.append(paramParcel.readInt(), paramParcel.readInt());
    }
    paramParcel.setDataPosition(k + j);
    return localSparseIntArray;
  }
  
  public static SparseLongArray createSparseLongArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    SparseLongArray localSparseLongArray = new SparseLongArray();
    int k = paramParcel.readInt();
    for (paramInt = 0; paramInt < k; paramInt++) {
      localSparseLongArray.append(paramParcel.readInt(), paramParcel.readLong());
    }
    paramParcel.setDataPosition(i + j);
    return localSparseLongArray;
  }
  
  public static String createString(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  public static String[] createStringArray(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    String[] arrayOfString = paramParcel.createStringArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfString;
  }
  
  public static ArrayList<String> createStringList(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    ArrayList localArrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(paramInt + i);
    return localArrayList;
  }
  
  public static SparseArray<String> createStringSparseArray(Parcel paramParcel, int paramInt)
  {
    int j = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (j == 0) {
      return null;
    }
    SparseArray localSparseArray = new SparseArray();
    int k = paramParcel.readInt();
    for (paramInt = 0; paramInt < k; paramInt++) {
      localSparseArray.append(paramParcel.readInt(), paramParcel.readString());
    }
    paramParcel.setDataPosition(i + j);
    return localSparseArray;
  }
  
  public static <T> T[] createTypedArray(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static <T> ArrayList<T> createTypedList(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    paramCreator = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return paramCreator;
  }
  
  public static <T> SparseArray<T> createTypedSparseArray(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator)
  {
    int i = readSize(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    int j = paramParcel.readInt();
    SparseArray localSparseArray = new SparseArray();
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      int m = paramParcel.readInt();
      Object localObject;
      if (paramParcel.readInt() != 0) {
        localObject = paramCreator.createFromParcel(paramParcel);
      } else {
        localObject = null;
      }
      localSparseArray.append(m, localObject);
    }
    paramParcel.setDataPosition(k + i);
    return localSparseArray;
  }
  
  public static void ensureAtEnd(Parcel paramParcel, int paramInt)
  {
    if (paramParcel.dataPosition() == paramInt) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder(37);
    localStringBuilder.append("Overread allowed size end=");
    localStringBuilder.append(paramInt);
    throw new ParseException(localStringBuilder.toString(), paramParcel);
  }
  
  public static int getFieldId(int paramInt)
  {
    return (char)paramInt;
  }
  
  public static boolean readBoolean(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return paramParcel.readInt() != 0;
  }
  
  public static Boolean readBooleanObject(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    zza(paramParcel, paramInt, i, 4);
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public static byte readByte(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return (byte)paramParcel.readInt();
  }
  
  public static char readChar(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return (char)paramParcel.readInt();
  }
  
  public static double readDouble(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  public static Double readDoubleObject(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    zza(paramParcel, paramInt, i, 8);
    return Double.valueOf(paramParcel.readDouble());
  }
  
  public static float readFloat(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static Float readFloatObject(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    zza(paramParcel, paramInt, i, 4);
    return Float.valueOf(paramParcel.readFloat());
  }
  
  public static int readHeader(Parcel paramParcel)
  {
    return paramParcel.readInt();
  }
  
  public static IBinder readIBinder(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0) {
      return null;
    }
    IBinder localIBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(paramInt + i);
    return localIBinder;
  }
  
  public static int readInt(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Integer readIntegerObject(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    zza(paramParcel, paramInt, i, 4);
    return Integer.valueOf(paramParcel.readInt());
  }
  
  public static void readList(Parcel paramParcel, int paramInt, List paramList, ClassLoader paramClassLoader)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return;
    }
    paramParcel.readList(paramList, paramClassLoader);
    paramParcel.setDataPosition(i + paramInt);
  }
  
  public static long readLong(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long readLongObject(Parcel paramParcel, int paramInt)
  {
    int i = readSize(paramParcel, paramInt);
    if (i == 0) {
      return null;
    }
    zza(paramParcel, paramInt, i, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static PendingIntent readPendingIntent(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0) {
      return null;
    }
    PendingIntent localPendingIntent = PendingIntent.readPendingIntentOrNullFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return localPendingIntent;
  }
  
  public static short readShort(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt, 4);
    return (short)paramParcel.readInt();
  }
  
  public static int readSize(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {
      return (char)(paramInt >> 16);
    }
    return paramParcel.readInt();
  }
  
  public static void skipUnknownField(Parcel paramParcel, int paramInt)
  {
    paramInt = readSize(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static int validateObjectHeader(Parcel paramParcel)
  {
    int j = readHeader(paramParcel);
    int k = readSize(paramParcel, j);
    int i = paramParcel.dataPosition();
    if (getFieldId(j) != 20293)
    {
      localObject = String.valueOf(Integer.toHexString(j));
      if (((String)localObject).length() != 0) {
        localObject = "Expected object header. Got 0x".concat((String)localObject);
      } else {
        localObject = new String("Expected object header. Got 0x");
      }
      throw new ParseException((String)localObject, paramParcel);
    }
    j = k + i;
    if ((j >= i) && (j <= paramParcel.dataSize())) {
      return j;
    }
    Object localObject = new StringBuilder(54);
    ((StringBuilder)localObject).append("Size read is invalid start=");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" end=");
    ((StringBuilder)localObject).append(j);
    throw new ParseException(((StringBuilder)localObject).toString(), paramParcel);
  }
  
  private static void zza(Parcel paramParcel, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == paramInt3) {
      return;
    }
    String str = Integer.toHexString(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new ParseException(localStringBuilder.toString(), paramParcel);
  }
  
  private static void zzb(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramInt1 = readSize(paramParcel, paramInt1);
    if (paramInt1 == paramInt2) {
      return;
    }
    String str = Integer.toHexString(paramInt1);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    localStringBuilder.append("Expected size ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(" got ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" (0x");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    throw new ParseException(localStringBuilder.toString(), paramParcel);
  }
  
  public static class ParseException
    extends RuntimeException
  {
    public ParseException(String paramString, Parcel paramParcel)
    {
      super();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\safeparcel\SafeParcelReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */