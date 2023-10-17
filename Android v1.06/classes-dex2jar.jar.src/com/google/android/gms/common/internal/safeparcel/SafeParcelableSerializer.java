package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SafeParcelableSerializer
{
  public static <T extends SafeParcelable> T deserializeFromBytes(byte[] paramArrayOfByte, Parcelable.Creator<T> paramCreator)
  {
    Preconditions.checkNotNull(paramCreator);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = (SafeParcelable)paramCreator.createFromParcel(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public static <T extends SafeParcelable> T deserializeFromIntentExtra(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    return deserializeFromBytes(paramIntent, paramCreator);
  }
  
  public static <T extends SafeParcelable> T deserializeFromString(String paramString, Parcelable.Creator<T> paramCreator)
  {
    return deserializeFromBytes(Base64Utils.decodeUrlSafe(paramString), paramCreator);
  }
  
  @Deprecated
  public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundle(Bundle paramBundle, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramString = (ArrayList)paramBundle.getSerializable(paramString);
    if (paramString == null) {
      return null;
    }
    paramBundle = new ArrayList(paramString.size());
    int j = paramString.size();
    for (int i = 0; i < j; i++) {
      paramBundle.add(deserializeFromBytes((byte[])paramString.get(i), paramCreator));
    }
    return paramBundle;
  }
  
  public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBundleSafe(Bundle paramBundle, String paramString, Parcelable.Creator<T> paramCreator)
  {
    return deserializeIterableFromBytes(paramBundle.getByteArray(paramString), paramCreator);
  }
  
  public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromBytes(byte[] paramArrayOfByte, Parcelable.Creator<T> paramCreator)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length;
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, i);
    localParcel.setDataPosition(0);
    try
    {
      paramArrayOfByte = new java/util/ArrayList;
      paramArrayOfByte.<init>();
      localParcel.readTypedList(paramArrayOfByte, paramCreator);
      return paramArrayOfByte;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  @Deprecated
  public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtra(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    paramIntent = (ArrayList)paramIntent.getSerializableExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    paramString = new ArrayList(paramIntent.size());
    int j = paramIntent.size();
    for (int i = 0; i < j; i++) {
      paramString.add(deserializeFromBytes((byte[])paramIntent.get(i), paramCreator));
    }
    return paramString;
  }
  
  public static <T extends SafeParcelable> ArrayList<T> deserializeIterableFromIntentExtraSafe(Intent paramIntent, String paramString, Parcelable.Creator<T> paramCreator)
  {
    return deserializeIterableFromBytes(paramIntent.getByteArrayExtra(paramString), paramCreator);
  }
  
  @Deprecated
  public static <T extends SafeParcelable> void serializeIterableToBundle(Iterable<T> paramIterable, Bundle paramBundle, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      localArrayList.add(serializeToBytes((SafeParcelable)paramIterable.next()));
    }
    paramBundle.putSerializable(paramString, localArrayList);
  }
  
  public static <T extends SafeParcelable> void serializeIterableToBundleSafe(Iterable<T> paramIterable, Bundle paramBundle, String paramString)
  {
    paramBundle.putByteArray(paramString, zza(paramIterable));
  }
  
  @Deprecated
  public static <T extends SafeParcelable> void serializeIterableToIntentExtra(Iterable<T> paramIterable, Intent paramIntent, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      localArrayList.add(serializeToBytes((SafeParcelable)paramIterable.next()));
    }
    paramIntent.putExtra(paramString, localArrayList);
  }
  
  public static <T extends SafeParcelable> void serializeIterableToIntentExtraSafe(Iterable<T> paramIterable, Intent paramIntent, String paramString)
  {
    paramIntent.putExtra(paramString, zza(paramIterable));
  }
  
  public static <T extends SafeParcelable> byte[] serializeToBytes(T paramT)
  {
    Parcel localParcel = Parcel.obtain();
    paramT.writeToParcel(localParcel, 0);
    paramT = localParcel.marshall();
    localParcel.recycle();
    return paramT;
  }
  
  public static <T extends SafeParcelable> void serializeToIntentExtra(T paramT, Intent paramIntent, String paramString)
  {
    paramIntent.putExtra(paramString, serializeToBytes(paramT));
  }
  
  public static <T extends SafeParcelable> String serializeToString(T paramT)
  {
    return Base64Utils.encodeUrlSafe(serializeToBytes(paramT));
  }
  
  private static <T extends SafeParcelable> byte[] zza(Iterable<T> paramIterable)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeTypedList(zzag.zzj(paramIterable));
      paramIterable = localParcel.marshall();
      return paramIterable;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\safeparcel\SafeParcelableSerializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */