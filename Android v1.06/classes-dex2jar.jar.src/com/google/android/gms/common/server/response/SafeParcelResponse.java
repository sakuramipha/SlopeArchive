package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse
  extends FastSafeParcelableJsonResponse
{
  public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
  private final int zaa;
  private final Parcel zab;
  private final int zac;
  private final zan zad;
  private final String zae;
  private int zaf;
  private int zag;
  
  SafeParcelResponse(int paramInt, Parcel paramParcel, zan paramzan)
  {
    this.zaa = paramInt;
    this.zab = ((Parcel)Preconditions.checkNotNull(paramParcel));
    this.zac = 2;
    this.zad = paramzan;
    if (paramzan == null) {
      paramParcel = null;
    } else {
      paramParcel = paramzan.zaa();
    }
    this.zae = paramParcel;
    this.zaf = 2;
  }
  
  private SafeParcelResponse(SafeParcelable paramSafeParcelable, zan paramzan, String paramString)
  {
    this.zaa = 1;
    Parcel localParcel = Parcel.obtain();
    this.zab = localParcel;
    paramSafeParcelable.writeToParcel(localParcel, 0);
    this.zac = 1;
    this.zad = ((zan)Preconditions.checkNotNull(paramzan));
    this.zae = ((String)Preconditions.checkNotNull(paramString));
    this.zaf = 2;
  }
  
  public SafeParcelResponse(zan paramzan, String paramString)
  {
    this.zaa = 1;
    this.zab = Parcel.obtain();
    this.zac = 0;
    this.zad = ((zan)Preconditions.checkNotNull(paramzan));
    this.zae = ((String)Preconditions.checkNotNull(paramString));
    this.zaf = 0;
  }
  
  public static <T extends FastJsonResponse,  extends SafeParcelable> SafeParcelResponse from(T paramT)
  {
    String str = (String)Preconditions.checkNotNull(paramT.getClass().getCanonicalName());
    zan localzan = new zan(paramT.getClass());
    zaF(localzan, paramT);
    localzan.zac();
    localzan.zad();
    return new SafeParcelResponse((SafeParcelable)paramT, localzan, str);
  }
  
  private static void zaF(zan paramzan, FastJsonResponse paramFastJsonResponse)
  {
    Class localClass = paramFastJsonResponse.getClass();
    if (!paramzan.zaf(localClass))
    {
      Map localMap = paramFastJsonResponse.getFieldMappings();
      paramzan.zae(localClass, localMap);
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramFastJsonResponse = (FastJsonResponse.Field)localMap.get((String)localIterator.next());
        localClass = paramFastJsonResponse.zag;
        if (localClass != null) {
          try
          {
            zaF(paramzan, (FastJsonResponse)localClass.newInstance());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            paramzan = String.valueOf(((Class)Preconditions.checkNotNull(paramFastJsonResponse.zag)).getCanonicalName());
            if (paramzan.length() != 0) {
              paramzan = "Could not access object of type ".concat(paramzan);
            } else {
              paramzan = new String("Could not access object of type ");
            }
            throw new IllegalStateException(paramzan, localIllegalAccessException);
          }
          catch (InstantiationException localInstantiationException)
          {
            paramzan = String.valueOf(((Class)Preconditions.checkNotNull(paramFastJsonResponse.zag)).getCanonicalName());
            if (paramzan.length() != 0) {
              paramzan = "Could not instantiate an object of type ".concat(paramzan);
            } else {
              paramzan = new String("Could not instantiate an object of type ");
            }
            throw new IllegalStateException(paramzan, localInstantiationException);
          }
        }
      }
    }
  }
  
  private final void zaG(FastJsonResponse.Field<?, ?> paramField)
  {
    if (paramField.zaf != -1)
    {
      paramField = this.zab;
      if (paramField != null)
      {
        int i = this.zaf;
        if (i != 0)
        {
          if (i == 1) {
            return;
          }
          throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        }
        this.zag = SafeParcelWriter.beginObjectHeader(paramField);
        this.zaf = 1;
        return;
      }
      throw new IllegalStateException("Internal Parcel object is null.");
    }
    throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
  }
  
  private final void zaH(StringBuilder paramStringBuilder, Map<String, FastJsonResponse.Field<?, ?>> paramMap, Parcel paramParcel)
  {
    SparseArray localSparseArray = new SparseArray();
    paramMap = paramMap.entrySet().iterator();
    Object localObject1;
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      localSparseArray.put(((FastJsonResponse.Field)((Map.Entry)localObject1).getValue()).getSafeParcelableFieldId(), localObject1);
    }
    paramStringBuilder.append('{');
    int j = SafeParcelReader.validateObjectHeader(paramParcel);
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      paramMap = (Map.Entry)localSparseArray.get(SafeParcelReader.getFieldId(k));
      if (paramMap != null)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        localObject1 = (String)paramMap.getKey();
        paramMap = (FastJsonResponse.Field)paramMap.getValue();
        paramStringBuilder.append("\"");
        paramStringBuilder.append((String)localObject1);
        paramStringBuilder.append("\":");
        Object localObject2;
        if (paramMap.zaj())
        {
          i = paramMap.zac;
          switch (i)
          {
          default: 
            paramStringBuilder = new StringBuilder(36);
            paramStringBuilder.append("Unknown field out type = ");
            paramStringBuilder.append(i);
            throw new IllegalArgumentException(paramStringBuilder.toString());
          case 11: 
            throw new IllegalArgumentException("Method does not accept concrete type.");
          case 10: 
            Bundle localBundle = SafeParcelReader.createBundle(paramParcel, k);
            localObject2 = new HashMap();
            localObject1 = localBundle.keySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              String str = (String)((Iterator)localObject1).next();
              ((HashMap)localObject2).put(str, (String)Preconditions.checkNotNull(localBundle.getString(str)));
            }
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, localObject2));
            break;
          case 8: 
          case 9: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, SafeParcelReader.createByteArray(paramParcel, k)));
            break;
          case 7: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, SafeParcelReader.createString(paramParcel, k)));
            break;
          case 6: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, Boolean.valueOf(SafeParcelReader.readBoolean(paramParcel, k))));
            break;
          case 5: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, SafeParcelReader.createBigDecimal(paramParcel, k)));
            break;
          case 4: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, Double.valueOf(SafeParcelReader.readDouble(paramParcel, k))));
            break;
          case 3: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, Float.valueOf(SafeParcelReader.readFloat(paramParcel, k))));
            break;
          case 2: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, Long.valueOf(SafeParcelReader.readLong(paramParcel, k))));
            break;
          case 1: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, SafeParcelReader.createBigInteger(paramParcel, k)));
            break;
          case 0: 
            zaJ(paramStringBuilder, paramMap, zaD(paramMap, Integer.valueOf(SafeParcelReader.readInt(paramParcel, k))));
          }
        }
        for (;;)
        {
          i = 1;
          break;
          if (paramMap.zad)
          {
            paramStringBuilder.append("[");
            switch (paramMap.zac)
            {
            default: 
              throw new IllegalStateException("Unknown field type out.");
            case 11: 
              localObject1 = SafeParcelReader.createParcelArray(paramParcel, k);
              k = localObject1.length;
              i = 0;
            }
            while (i < k)
            {
              if (i > 0) {
                paramStringBuilder.append(",");
              }
              localObject1[i].setDataPosition(0);
              zaH(paramStringBuilder, paramMap.zah(), localObject1[i]);
              i++;
              continue;
              throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
              ArrayUtils.writeStringArray(paramStringBuilder, SafeParcelReader.createStringArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createBooleanArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createBigDecimalArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createDoubleArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createFloatArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createLongArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createBigIntegerArray(paramParcel, k));
              break;
              ArrayUtils.writeArray(paramStringBuilder, SafeParcelReader.createIntArray(paramParcel, k));
            }
            paramStringBuilder.append("]");
          }
          else
          {
            switch (paramMap.zac)
            {
            default: 
              throw new IllegalStateException("Unknown field type out");
            case 11: 
              localObject1 = SafeParcelReader.createParcel(paramParcel, k);
              ((Parcel)localObject1).setDataPosition(0);
              zaH(paramStringBuilder, paramMap.zah(), (Parcel)localObject1);
              break;
            case 10: 
              paramMap = SafeParcelReader.createBundle(paramParcel, k);
              localObject1 = paramMap.keySet();
              paramStringBuilder.append("{");
              localObject1 = ((Set)localObject1).iterator();
              for (i = 1; ((Iterator)localObject1).hasNext(); i = 0)
              {
                localObject2 = (String)((Iterator)localObject1).next();
                if (i == 0) {
                  paramStringBuilder.append(",");
                }
                paramStringBuilder.append("\"");
                paramStringBuilder.append((String)localObject2);
                paramStringBuilder.append("\":\"");
                paramStringBuilder.append(JsonUtils.escapeString(paramMap.getString((String)localObject2)));
                paramStringBuilder.append("\"");
              }
              paramStringBuilder.append("}");
              break;
            case 9: 
              paramMap = SafeParcelReader.createByteArray(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(Base64Utils.encodeUrlSafe(paramMap));
              paramStringBuilder.append("\"");
              break;
            case 8: 
              paramMap = SafeParcelReader.createByteArray(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(Base64Utils.encode(paramMap));
              paramStringBuilder.append("\"");
              break;
            case 7: 
              paramMap = SafeParcelReader.createString(paramParcel, k);
              paramStringBuilder.append("\"");
              paramStringBuilder.append(JsonUtils.escapeString(paramMap));
              paramStringBuilder.append("\"");
              break;
            case 6: 
              paramStringBuilder.append(SafeParcelReader.readBoolean(paramParcel, k));
              break;
            case 5: 
              paramStringBuilder.append(SafeParcelReader.createBigDecimal(paramParcel, k));
              break;
            case 4: 
              paramStringBuilder.append(SafeParcelReader.readDouble(paramParcel, k));
              break;
            case 3: 
              paramStringBuilder.append(SafeParcelReader.readFloat(paramParcel, k));
              break;
            case 2: 
              paramStringBuilder.append(SafeParcelReader.readLong(paramParcel, k));
              break;
            case 1: 
              paramStringBuilder.append(SafeParcelReader.createBigInteger(paramParcel, k));
              break;
            case 0: 
              paramStringBuilder.append(SafeParcelReader.readInt(paramParcel, k));
            }
          }
        }
      }
    }
    if (paramParcel.dataPosition() == j)
    {
      paramStringBuilder.append('}');
      return;
    }
    paramStringBuilder = new StringBuilder(37);
    paramStringBuilder.append("Overread allowed size end=");
    paramStringBuilder.append(j);
    throw new SafeParcelReader.ParseException(paramStringBuilder.toString(), paramParcel);
  }
  
  private static final void zaI(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      paramStringBuilder = new StringBuilder(26);
      paramStringBuilder.append("Unknown type = ");
      paramStringBuilder.append(paramInt);
      throw new IllegalArgumentException(paramStringBuilder.toString());
    case 11: 
      throw new IllegalArgumentException("Method does not accept concrete type.");
    case 10: 
      MapUtils.writeStringMapToJson(paramStringBuilder, (HashMap)Preconditions.checkNotNull(paramObject));
      return;
    case 9: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(Base64Utils.encodeUrlSafe((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(Base64Utils.encode((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 7: 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(JsonUtils.escapeString(Preconditions.checkNotNull(paramObject).toString()));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private static final void zaJ(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Object paramObject)
  {
    if (paramField.zab)
    {
      paramObject = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int j = ((ArrayList)paramObject).size();
      for (int i = 0; i < j; i++)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        zaI(paramStringBuilder, paramField.zaa, ((ArrayList)paramObject).get(i));
      }
      paramStringBuilder.append("]");
      return;
    }
    zaI(paramStringBuilder, paramField.zaa, paramObject);
  }
  
  public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field paramField, String paramString, ArrayList<T> paramArrayList)
  {
    zaG(paramField);
    paramString = new ArrayList();
    ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    int j = paramArrayList.size();
    for (int i = 0; i < j; i++) {
      paramString.add(((SafeParcelResponse)paramArrayList.get(i)).zaE());
    }
    SafeParcelWriter.writeParcelList(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field paramField, String paramString, T paramT)
  {
    zaG(paramField);
    paramString = ((SafeParcelResponse)paramT).zaE();
    SafeParcelWriter.writeParcel(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings()
  {
    zan localzan = this.zad;
    if (localzan == null) {
      return null;
    }
    return localzan.zab((String)Preconditions.checkNotNull(this.zae));
  }
  
  public final Object getValueObject(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public final boolean isPrimitiveFieldSet(String paramString)
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  protected final void setBooleanInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, boolean paramBoolean)
  {
    zaG(paramField);
    SafeParcelWriter.writeBoolean(this.zab, paramField.getSafeParcelableFieldId(), paramBoolean);
  }
  
  protected final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, byte[] paramArrayOfByte)
  {
    zaG(paramField);
    SafeParcelWriter.writeByteArray(this.zab, paramField.getSafeParcelableFieldId(), paramArrayOfByte, true);
  }
  
  protected final void setIntegerInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, int paramInt)
  {
    zaG(paramField);
    SafeParcelWriter.writeInt(this.zab, paramField.getSafeParcelableFieldId(), paramInt);
  }
  
  protected final void setLongInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, long paramLong)
  {
    zaG(paramField);
    SafeParcelWriter.writeLong(this.zab, paramField.getSafeParcelableFieldId(), paramLong);
  }
  
  protected final void setStringInternal(FastJsonResponse.Field<?, ?> paramField, String paramString1, String paramString2)
  {
    zaG(paramField);
    SafeParcelWriter.writeString(this.zab, paramField.getSafeParcelableFieldId(), paramString2, true);
  }
  
  protected final void setStringMapInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, Map<String, String> paramMap)
  {
    zaG(paramField);
    Bundle localBundle = new Bundle();
    paramString = ((Map)Preconditions.checkNotNull(paramMap)).keySet().iterator();
    while (paramString.hasNext())
    {
      String str = (String)paramString.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    SafeParcelWriter.writeBundle(this.zab, paramField.getSafeParcelableFieldId(), localBundle, true);
  }
  
  protected final void setStringsInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<String> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new String[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((String)paramArrayList.get(i));
    }
    SafeParcelWriter.writeStringArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  public final String toString()
  {
    Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
    Parcel localParcel = zaE();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    zaH(localStringBuilder, (Map)Preconditions.checkNotNull(this.zad.zab((String)Preconditions.checkNotNull(this.zae))), localParcel);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeParcel(paramParcel, 2, zaE(), false);
    int j = this.zac;
    zan localzan;
    if (j != 0)
    {
      if (j != 1) {
        localzan = this.zad;
      } else {
        localzan = this.zad;
      }
    }
    else {
      localzan = null;
    }
    SafeParcelWriter.writeParcelable(paramParcel, 3, localzan, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final Parcel zaE()
  {
    int i = this.zaf;
    if (i != 0)
    {
      if (i == 1)
      {
        SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
        this.zaf = 2;
      }
    }
    else
    {
      i = SafeParcelWriter.beginObjectHeader(this.zab);
      this.zag = i;
      SafeParcelWriter.finishObjectHeader(this.zab, i);
      this.zaf = 2;
    }
    return this.zab;
  }
  
  protected final void zab(FastJsonResponse.Field<?, ?> paramField, String paramString, BigDecimal paramBigDecimal)
  {
    zaG(paramField);
    SafeParcelWriter.writeBigDecimal(this.zab, paramField.getSafeParcelableFieldId(), paramBigDecimal, true);
  }
  
  protected final void zad(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigDecimal> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new BigDecimal[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((BigDecimal)paramArrayList.get(i));
    }
    SafeParcelWriter.writeBigDecimalArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zaf(FastJsonResponse.Field<?, ?> paramField, String paramString, BigInteger paramBigInteger)
  {
    zaG(paramField);
    SafeParcelWriter.writeBigInteger(this.zab, paramField.getSafeParcelableFieldId(), paramBigInteger, true);
  }
  
  protected final void zah(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<BigInteger> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new BigInteger[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((BigInteger)paramArrayList.get(i));
    }
    SafeParcelWriter.writeBigIntegerArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zak(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Boolean> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new boolean[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((Boolean)paramArrayList.get(i)).booleanValue();
    }
    SafeParcelWriter.writeBooleanArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zan(FastJsonResponse.Field<?, ?> paramField, String paramString, double paramDouble)
  {
    zaG(paramField);
    SafeParcelWriter.writeDouble(this.zab, paramField.getSafeParcelableFieldId(), paramDouble);
  }
  
  protected final void zap(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Double> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new double[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((Double)paramArrayList.get(i)).doubleValue();
    }
    SafeParcelWriter.writeDoubleArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zar(FastJsonResponse.Field<?, ?> paramField, String paramString, float paramFloat)
  {
    zaG(paramField);
    SafeParcelWriter.writeFloat(this.zab, paramField.getSafeParcelableFieldId(), paramFloat);
  }
  
  protected final void zat(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Float> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new float[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((Float)paramArrayList.get(i)).floatValue();
    }
    SafeParcelWriter.writeFloatArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zaw(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Integer> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new int[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((Integer)paramArrayList.get(i)).intValue();
    }
    SafeParcelWriter.writeIntArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
  
  protected final void zaz(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<Long> paramArrayList)
  {
    zaG(paramField);
    int j = ((ArrayList)Preconditions.checkNotNull(paramArrayList)).size();
    paramString = new long[j];
    for (int i = 0; i < j; i++) {
      paramString[i] = ((Long)paramArrayList.get(i)).longValue();
    }
    SafeParcelWriter.writeLongArray(this.zab, paramField.getSafeParcelableFieldId(), paramString, true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\SafeParcelResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */