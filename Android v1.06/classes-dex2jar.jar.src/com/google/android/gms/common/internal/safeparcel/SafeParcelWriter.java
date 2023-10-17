package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SafeParcelWriter
{
  public static int beginObjectHeader(Parcel paramParcel)
  {
    return zza(paramParcel, 20293);
  }
  
  public static void finishObjectHeader(Parcel paramParcel, int paramInt)
  {
    zzb(paramParcel, paramInt);
  }
  
  public static void writeBigDecimal(Parcel paramParcel, int paramInt, BigDecimal paramBigDecimal, boolean paramBoolean)
  {
    if (paramBigDecimal == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeByteArray(paramBigDecimal.unscaledValue().toByteArray());
    paramParcel.writeInt(paramBigDecimal.scale());
    zzb(paramParcel, paramInt);
  }
  
  public static void writeBigDecimalArray(Parcel paramParcel, int paramInt, BigDecimal[] paramArrayOfBigDecimal, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfBigDecimal == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramArrayOfBigDecimal.length;
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++)
    {
      paramParcel.writeByteArray(paramArrayOfBigDecimal[paramInt].unscaledValue().toByteArray());
      paramParcel.writeInt(paramArrayOfBigDecimal[paramInt].scale());
    }
    zzb(paramParcel, k);
  }
  
  public static void writeBigInteger(Parcel paramParcel, int paramInt, BigInteger paramBigInteger, boolean paramBoolean)
  {
    if (paramBigInteger == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeByteArray(paramBigInteger.toByteArray());
    zzb(paramParcel, paramInt);
  }
  
  public static void writeBigIntegerArray(Parcel paramParcel, int paramInt, BigInteger[] paramArrayOfBigInteger, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfBigInteger == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramArrayOfBigInteger.length;
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeByteArray(paramArrayOfBigInteger[paramInt].toByteArray());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeBoolean(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void writeBooleanArray(Parcel paramParcel, int paramInt, boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (paramArrayOfBoolean == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeBooleanArray(paramArrayOfBoolean);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeBooleanList(Parcel paramParcel, int paramInt, List<Boolean> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++) {
      paramParcel.writeInt(((Boolean)paramList.get(paramInt)).booleanValue());
    }
    zzb(paramParcel, k);
  }
  
  public static void writeBooleanObject(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null)
    {
      if (paramBoolean1) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean.booleanValue());
  }
  
  public static void writeBundle(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeByte(Parcel paramParcel, int paramInt, byte paramByte)
  {
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramByte);
  }
  
  public static void writeByteArray(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeByteArrayArray(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramArrayOfByte.length;
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++) {
      paramParcel.writeByteArray(paramArrayOfByte[paramInt]);
    }
    zzb(paramParcel, k);
  }
  
  public static void writeByteArraySparseArray(Parcel paramParcel, int paramInt, SparseArray<byte[]> paramSparseArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramSparseArray.size();
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      paramParcel.writeByteArray((byte[])paramSparseArray.valueAt(paramInt));
    }
    zzb(paramParcel, k);
  }
  
  public static void writeChar(Parcel paramParcel, int paramInt, char paramChar)
  {
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramChar);
  }
  
  public static void writeCharArray(Parcel paramParcel, int paramInt, char[] paramArrayOfChar, boolean paramBoolean)
  {
    if (paramArrayOfChar == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeCharArray(paramArrayOfChar);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeDouble(Parcel paramParcel, int paramInt, double paramDouble)
  {
    zzc(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }
  
  public static void writeDoubleArray(Parcel paramParcel, int paramInt, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    if (paramArrayOfDouble == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeDoubleArray(paramArrayOfDouble);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeDoubleList(Parcel paramParcel, int paramInt, List<Double> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramList.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeDouble(((Double)paramList.get(paramInt)).doubleValue());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeDoubleObject(Parcel paramParcel, int paramInt, Double paramDouble, boolean paramBoolean)
  {
    if (paramDouble == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    zzc(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble.doubleValue());
  }
  
  public static void writeDoubleSparseArray(Parcel paramParcel, int paramInt, SparseArray<Double> paramSparseArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramSparseArray.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      paramParcel.writeDouble(((Double)paramSparseArray.valueAt(paramInt)).doubleValue());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeFloat(Parcel paramParcel, int paramInt, float paramFloat)
  {
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void writeFloatArray(Parcel paramParcel, int paramInt, float[] paramArrayOfFloat, boolean paramBoolean)
  {
    if (paramArrayOfFloat == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeFloatArray(paramArrayOfFloat);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeFloatList(Parcel paramParcel, int paramInt, List<Float> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++) {
      paramParcel.writeFloat(((Float)paramList.get(paramInt)).floatValue());
    }
    zzb(paramParcel, k);
  }
  
  public static void writeFloatObject(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat.floatValue());
  }
  
  public static void writeFloatSparseArray(Parcel paramParcel, int paramInt, SparseArray<Float> paramSparseArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramSparseArray.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      paramParcel.writeFloat(((Float)paramSparseArray.valueAt(paramInt)).floatValue());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeIBinder(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeIBinderArray(Parcel paramParcel, int paramInt, IBinder[] paramArrayOfIBinder, boolean paramBoolean)
  {
    if (paramArrayOfIBinder == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeBinderArray(paramArrayOfIBinder);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeIBinderList(Parcel paramParcel, int paramInt, List<IBinder> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeBinderList(paramList);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeIBinderSparseArray(Parcel paramParcel, int paramInt, SparseArray<IBinder> paramSparseArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramSparseArray.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      paramParcel.writeStrongBinder((IBinder)paramSparseArray.valueAt(paramInt));
    }
    zzb(paramParcel, j);
  }
  
  public static void writeInt(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    zzc(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void writeIntArray(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeIntegerList(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramList.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeInt(((Integer)paramList.get(paramInt)).intValue());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeIntegerObject(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    if (paramInteger == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }
  
  public static void writeList(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeList(paramList);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeLong(Parcel paramParcel, int paramInt, long paramLong)
  {
    zzc(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void writeLongArray(Parcel paramParcel, int paramInt, long[] paramArrayOfLong, boolean paramBoolean)
  {
    if (paramArrayOfLong == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeLongArray(paramArrayOfLong);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeLongList(Parcel paramParcel, int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramList.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeLong(((Long)paramList.get(paramInt)).longValue());
    }
    zzb(paramParcel, j);
  }
  
  public static void writeLongObject(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    if (paramLong == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    zzc(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void writeParcel(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean)
  {
    if (paramParcel2 == null)
    {
      if (paramBoolean) {
        zzc(paramParcel1, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel1, paramInt);
    paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
    zzb(paramParcel1, paramInt);
  }
  
  public static void writeParcelArray(Parcel paramParcel, int paramInt, Parcel[] paramArrayOfParcel, boolean paramBoolean)
  {
    if (paramArrayOfParcel == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int i = paramArrayOfParcel.length;
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      Parcel localParcel = paramArrayOfParcel[paramInt];
      if (localParcel != null)
      {
        paramParcel.writeInt(localParcel.dataSize());
        paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
    zzb(paramParcel, j);
  }
  
  public static void writeParcelList(Parcel paramParcel, int paramInt, List<Parcel> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = zza(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      Parcel localParcel = (Parcel)paramList.get(paramInt);
      if (localParcel != null)
      {
        paramParcel.writeInt(localParcel.dataSize());
        paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
    zzb(paramParcel, i);
  }
  
  public static void writeParcelSparseArray(Parcel paramParcel, int paramInt, SparseArray<Parcel> paramSparseArray, boolean paramBoolean)
  {
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = zza(paramParcel, paramInt);
    int j = paramSparseArray.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      Parcel localParcel = (Parcel)paramSparseArray.valueAt(paramInt);
      if (localParcel != null)
      {
        paramParcel.writeInt(localParcel.dataSize());
        paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
    zzb(paramParcel, i);
  }
  
  public static void writeParcelable(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt1, 0);
      }
      return;
    }
    paramInt1 = zza(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    zzb(paramParcel, paramInt1);
  }
  
  public static void writePendingIntent(Parcel paramParcel, int paramInt, PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    if (paramPendingIntent == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    PendingIntent.writePendingIntentOrNullToParcel(paramPendingIntent, paramParcel);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeShort(Parcel paramParcel, int paramInt, short paramShort)
  {
    zzc(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramShort);
  }
  
  public static void writeSparseBooleanArray(Parcel paramParcel, int paramInt, SparseBooleanArray paramSparseBooleanArray, boolean paramBoolean)
  {
    if (paramSparseBooleanArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeSparseBooleanArray(paramSparseBooleanArray);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeSparseIntArray(Parcel paramParcel, int paramInt, SparseIntArray paramSparseIntArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseIntArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int k = paramSparseIntArray.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++)
    {
      paramParcel.writeInt(paramSparseIntArray.keyAt(paramInt));
      paramParcel.writeInt(paramSparseIntArray.valueAt(paramInt));
    }
    zzb(paramParcel, j);
  }
  
  public static void writeSparseLongArray(Parcel paramParcel, int paramInt, SparseLongArray paramSparseLongArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseLongArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramSparseLongArray.size();
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++)
    {
      paramParcel.writeInt(paramSparseLongArray.keyAt(paramInt));
      paramParcel.writeLong(paramSparseLongArray.valueAt(paramInt));
    }
    zzb(paramParcel, k);
  }
  
  public static void writeString(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeStringArray(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeStringList(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = zza(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    zzb(paramParcel, paramInt);
  }
  
  public static void writeStringSparseArray(Parcel paramParcel, int paramInt, SparseArray<String> paramSparseArray, boolean paramBoolean)
  {
    int i = 0;
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int k = zza(paramParcel, paramInt);
    int j = paramSparseArray.size();
    paramParcel.writeInt(j);
    for (paramInt = i; paramInt < j; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      paramParcel.writeString((String)paramSparseArray.valueAt(paramInt));
    }
    zzb(paramParcel, k);
  }
  
  public static <T extends Parcelable> void writeTypedArray(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfT == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt1, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt1);
    int i = paramArrayOfT.length;
    paramParcel.writeInt(i);
    for (paramInt1 = 0; paramInt1 < i; paramInt1++)
    {
      T ? = paramArrayOfT[paramInt1];
      if (? == null) {
        paramParcel.writeInt(0);
      } else {
        zzd(paramParcel, ?, paramInt2);
      }
    }
    zzb(paramParcel, j);
  }
  
  public static <T extends Parcelable> void writeTypedList(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int i = paramList.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        zzd(paramParcel, localParcelable, 0);
      }
    }
    zzb(paramParcel, j);
  }
  
  public static <T extends Parcelable> void writeTypedSparseArray(Parcel paramParcel, int paramInt, SparseArray<T> paramSparseArray, boolean paramBoolean)
  {
    if (paramSparseArray == null)
    {
      if (paramBoolean) {
        zzc(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = zza(paramParcel, paramInt);
    int i = paramSparseArray.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      paramParcel.writeInt(paramSparseArray.keyAt(paramInt));
      Parcelable localParcelable = (Parcelable)paramSparseArray.valueAt(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        zzd(paramParcel, localParcelable, 0);
      }
    }
    zzb(paramParcel, j);
  }
  
  private static int zza(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void zzb(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  private static void zzc(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  private static <T extends Parcelable> void zzd(Parcel paramParcel, T paramT, int paramInt)
  {
    int j = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int i = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(j);
    paramParcel.writeInt(paramInt - i);
    paramParcel.setDataPosition(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\safeparcel\SafeParcelWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */