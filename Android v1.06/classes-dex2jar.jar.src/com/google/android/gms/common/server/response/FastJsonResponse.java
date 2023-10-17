package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{
  protected static final <O, I> I zaD(Field<I, O> paramField, Object paramObject)
  {
    if (Field.zac(paramField) != null) {
      return (I)paramField.zaf(paramObject);
    }
    return (I)paramObject;
  }
  
  private final <I, O> void zaE(Field<I, O> paramField, I paramI)
  {
    String str = paramField.zae;
    paramI = paramField.zae(paramI);
    int i = paramField.zac;
    switch (i)
    {
    case 3: 
    default: 
      paramField = new StringBuilder(44);
      paramField.append("Unsupported type for conversion: ");
      paramField.append(i);
      throw new IllegalStateException(paramField.toString());
    case 8: 
    case 9: 
      if (paramI != null)
      {
        setDecodedBytesInternal(paramField, str, (byte[])paramI);
        return;
      }
      zaG(str);
      return;
    case 7: 
      setStringInternal(paramField, str, (String)paramI);
      return;
    case 6: 
      if (paramI != null)
      {
        setBooleanInternal(paramField, str, ((Boolean)paramI).booleanValue());
        return;
      }
      zaG(str);
      return;
    case 5: 
      zab(paramField, str, (BigDecimal)paramI);
      return;
    case 4: 
      if (paramI != null)
      {
        zan(paramField, str, ((Double)paramI).doubleValue());
        return;
      }
      zaG(str);
      return;
    case 2: 
      if (paramI != null)
      {
        setLongInternal(paramField, str, ((Long)paramI).longValue());
        return;
      }
      zaG(str);
      return;
    case 1: 
      zaf(paramField, str, (BigInteger)paramI);
      return;
    }
    if (paramI != null)
    {
      setIntegerInternal(paramField, str, ((Integer)paramI).intValue());
      return;
    }
    zaG(str);
  }
  
  private static final void zaF(StringBuilder paramStringBuilder, Field paramField, Object paramObject)
  {
    int i = paramField.zaa;
    if (i != 11)
    {
      if (i == 7)
      {
        paramStringBuilder.append("\"");
        paramStringBuilder.append(JsonUtils.escapeString((String)paramObject));
        paramStringBuilder.append("\"");
        return;
      }
      paramStringBuilder.append(paramObject);
      return;
    }
    paramField = paramField.zag;
    Preconditions.checkNotNull(paramField);
    paramStringBuilder.append(((FastJsonResponse)paramField.cast(paramObject)).toString());
  }
  
  private static final <O> void zaG(String paramString)
  {
    if (Log.isLoggable("FastJsonResponse", 6))
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 58);
      localStringBuilder.append("Output field (");
      localStringBuilder.append(paramString);
      localStringBuilder.append(") has a null value, but expected a primitive");
      Log.e("FastJsonResponse", localStringBuilder.toString());
    }
  }
  
  public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field paramField, String paramString, ArrayList<T> paramArrayList)
  {
    throw new UnsupportedOperationException("Concrete type array not supported");
  }
  
  public <T extends FastJsonResponse> void addConcreteTypeInternal(Field paramField, String paramString, T paramT)
  {
    throw new UnsupportedOperationException("Concrete type not supported");
  }
  
  public abstract Map<String, Field<?, ?>> getFieldMappings();
  
  protected Object getFieldValue(Field paramField)
  {
    String str = paramField.zae;
    if (paramField.zag != null)
    {
      if (getValueObject(str) == null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool, "Concrete field shouldn't be value object: %s", new Object[] { paramField.zae });
      boolean bool = paramField.zad;
      try
      {
        char c = Character.toUpperCase(str.charAt(0));
        str = str.substring(1);
        int i = String.valueOf(str).length();
        paramField = new java/lang/StringBuilder;
        paramField.<init>(i + 4);
        paramField.append("get");
        paramField.append(c);
        paramField.append(str);
        paramField = getClass().getMethod(paramField.toString(), new Class[0]).invoke(this, new Object[0]);
        return paramField;
      }
      catch (Exception paramField)
      {
        throw new RuntimeException(paramField);
      }
    }
    return getValueObject(str);
  }
  
  protected abstract Object getValueObject(String paramString);
  
  protected boolean isFieldSet(Field paramField)
  {
    if (paramField.zac == 11)
    {
      boolean bool = paramField.zad;
      paramField = paramField.zae;
      paramField = new java/lang/UnsupportedOperationException;
      if (bool)
      {
        paramField.<init>("Concrete type arrays not supported");
        throw paramField;
      }
      paramField.<init>("Concrete types not supported");
      throw paramField;
    }
    return isPrimitiveFieldSet(paramField.zae);
  }
  
  protected abstract boolean isPrimitiveFieldSet(String paramString);
  
  protected void setBooleanInternal(Field<?, ?> paramField, String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Boolean not supported");
  }
  
  protected void setDecodedBytesInternal(Field<?, ?> paramField, String paramString, byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException("byte[] not supported");
  }
  
  protected void setIntegerInternal(Field<?, ?> paramField, String paramString, int paramInt)
  {
    throw new UnsupportedOperationException("Integer not supported");
  }
  
  protected void setLongInternal(Field<?, ?> paramField, String paramString, long paramLong)
  {
    throw new UnsupportedOperationException("Long not supported");
  }
  
  protected void setStringInternal(Field<?, ?> paramField, String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException("String not supported");
  }
  
  protected void setStringMapInternal(Field<?, ?> paramField, String paramString, Map<String, String> paramMap)
  {
    throw new UnsupportedOperationException("String map not supported");
  }
  
  protected void setStringsInternal(Field<?, ?> paramField, String paramString, ArrayList<String> paramArrayList)
  {
    throw new UnsupportedOperationException("String list not supported");
  }
  
  public String toString()
  {
    Map localMap = getFieldMappings();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      Field localField = (Field)localMap.get(localObject1);
      if (isFieldSet(localField))
      {
        Object localObject2 = zaD(localField, getFieldValue(localField));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        } else {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("\"");
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append("\":");
        if (localObject2 == null)
        {
          localStringBuilder.append("null");
        }
        else
        {
          int j;
          int i;
          switch (localField.zac)
          {
          default: 
            if (localField.zab)
            {
              localObject2 = (ArrayList)localObject2;
              localStringBuilder.append("[");
              j = ((ArrayList)localObject2).size();
              i = 0;
            }
            break;
          case 10: 
            MapUtils.writeStringMapToJson(localStringBuilder, (HashMap)localObject2);
            break;
          case 9: 
            localStringBuilder.append("\"");
            localStringBuilder.append(Base64Utils.encodeUrlSafe((byte[])localObject2));
            localStringBuilder.append("\"");
            break;
          case 8: 
            localStringBuilder.append("\"");
            localStringBuilder.append(Base64Utils.encode((byte[])localObject2));
            localStringBuilder.append("\"");
            continue;
            while (i < j)
            {
              if (i > 0) {
                localStringBuilder.append(",");
              }
              localObject1 = ((ArrayList)localObject2).get(i);
              if (localObject1 != null) {
                zaF(localStringBuilder, localField, localObject1);
              }
              i++;
            }
            localStringBuilder.append("]");
            continue;
            zaF(localStringBuilder, localField, localObject2);
          }
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    } else {
      localStringBuilder.append("{}");
    }
    return localStringBuilder.toString();
  }
  
  public final <O> void zaA(Field<String, O> paramField, String paramString)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramString);
      return;
    }
    setStringInternal(paramField, paramField.zae, paramString);
  }
  
  public final <O> void zaB(Field<Map<String, String>, O> paramField, Map<String, String> paramMap)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramMap);
      return;
    }
    setStringMapInternal(paramField, paramField.zae, paramMap);
  }
  
  public final <O> void zaC(Field<ArrayList<String>, O> paramField, ArrayList<String> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    setStringsInternal(paramField, paramField.zae, paramArrayList);
  }
  
  public final <O> void zaa(Field<BigDecimal, O> paramField, BigDecimal paramBigDecimal)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramBigDecimal);
      return;
    }
    zab(paramField, paramField.zae, paramBigDecimal);
  }
  
  protected void zab(Field<?, ?> paramField, String paramString, BigDecimal paramBigDecimal)
  {
    throw new UnsupportedOperationException("BigDecimal not supported");
  }
  
  public final <O> void zac(Field<ArrayList<BigDecimal>, O> paramField, ArrayList<BigDecimal> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zad(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zad(Field<?, ?> paramField, String paramString, ArrayList<BigDecimal> paramArrayList)
  {
    throw new UnsupportedOperationException("BigDecimal list not supported");
  }
  
  public final <O> void zae(Field<BigInteger, O> paramField, BigInteger paramBigInteger)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramBigInteger);
      return;
    }
    zaf(paramField, paramField.zae, paramBigInteger);
  }
  
  protected void zaf(Field<?, ?> paramField, String paramString, BigInteger paramBigInteger)
  {
    throw new UnsupportedOperationException("BigInteger not supported");
  }
  
  public final <O> void zag(Field<ArrayList<BigInteger>, O> paramField, ArrayList<BigInteger> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zah(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zah(Field<?, ?> paramField, String paramString, ArrayList<BigInteger> paramArrayList)
  {
    throw new UnsupportedOperationException("BigInteger list not supported");
  }
  
  public final <O> void zai(Field<Boolean, O> paramField, boolean paramBoolean)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, Boolean.valueOf(paramBoolean));
      return;
    }
    setBooleanInternal(paramField, paramField.zae, paramBoolean);
  }
  
  public final <O> void zaj(Field<ArrayList<Boolean>, O> paramField, ArrayList<Boolean> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zak(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zak(Field<?, ?> paramField, String paramString, ArrayList<Boolean> paramArrayList)
  {
    throw new UnsupportedOperationException("Boolean list not supported");
  }
  
  public final <O> void zal(Field<byte[], O> paramField, byte[] paramArrayOfByte)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayOfByte);
      return;
    }
    setDecodedBytesInternal(paramField, paramField.zae, paramArrayOfByte);
  }
  
  public final <O> void zam(Field<Double, O> paramField, double paramDouble)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, Double.valueOf(paramDouble));
      return;
    }
    zan(paramField, paramField.zae, paramDouble);
  }
  
  protected void zan(Field<?, ?> paramField, String paramString, double paramDouble)
  {
    throw new UnsupportedOperationException("Double not supported");
  }
  
  public final <O> void zao(Field<ArrayList<Double>, O> paramField, ArrayList<Double> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zap(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zap(Field<?, ?> paramField, String paramString, ArrayList<Double> paramArrayList)
  {
    throw new UnsupportedOperationException("Double list not supported");
  }
  
  public final <O> void zaq(Field<Float, O> paramField, float paramFloat)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, Float.valueOf(paramFloat));
      return;
    }
    zar(paramField, paramField.zae, paramFloat);
  }
  
  protected void zar(Field<?, ?> paramField, String paramString, float paramFloat)
  {
    throw new UnsupportedOperationException("Float not supported");
  }
  
  public final <O> void zas(Field<ArrayList<Float>, O> paramField, ArrayList<Float> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zat(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zat(Field<?, ?> paramField, String paramString, ArrayList<Float> paramArrayList)
  {
    throw new UnsupportedOperationException("Float list not supported");
  }
  
  public final <O> void zau(Field<Integer, O> paramField, int paramInt)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, Integer.valueOf(paramInt));
      return;
    }
    setIntegerInternal(paramField, paramField.zae, paramInt);
  }
  
  public final <O> void zav(Field<ArrayList<Integer>, O> paramField, ArrayList<Integer> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zaw(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zaw(Field<?, ?> paramField, String paramString, ArrayList<Integer> paramArrayList)
  {
    throw new UnsupportedOperationException("Integer list not supported");
  }
  
  public final <O> void zax(Field<Long, O> paramField, long paramLong)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, Long.valueOf(paramLong));
      return;
    }
    setLongInternal(paramField, paramField.zae, paramLong);
  }
  
  public final <O> void zay(Field<ArrayList<Long>, O> paramField, ArrayList<Long> paramArrayList)
  {
    if (Field.zac(paramField) != null)
    {
      zaE(paramField, paramArrayList);
      return;
    }
    zaz(paramField, paramField.zae, paramArrayList);
  }
  
  protected void zaz(Field<?, ?> paramField, String paramString, ArrayList<Long> paramArrayList)
  {
    throw new UnsupportedOperationException("Long list not supported");
  }
  
  public static class Field<I, O>
    extends AbstractSafeParcelable
  {
    public static final zaj CREATOR = new zaj();
    protected final int zaa;
    protected final boolean zab;
    protected final int zac;
    protected final boolean zad;
    protected final String zae;
    protected final int zaf;
    protected final Class<? extends FastJsonResponse> zag;
    protected final String zah;
    private final int zai;
    private zan zaj;
    private FastJsonResponse.FieldConverter<I, O> zak;
    
    Field(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, zaa paramzaa)
    {
      this.zai = paramInt1;
      this.zaa = paramInt2;
      this.zab = paramBoolean1;
      this.zac = paramInt3;
      this.zad = paramBoolean2;
      this.zae = paramString1;
      this.zaf = paramInt4;
      if (paramString2 == null)
      {
        this.zag = null;
        this.zah = null;
      }
      else
      {
        this.zag = SafeParcelResponse.class;
        this.zah = paramString2;
      }
      if (paramzaa == null)
      {
        this.zak = null;
        return;
      }
      this.zak = paramzaa.zab();
    }
    
    protected Field(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class<? extends FastJsonResponse> paramClass, FastJsonResponse.FieldConverter<I, O> paramFieldConverter)
    {
      this.zai = 1;
      this.zaa = paramInt1;
      this.zab = paramBoolean1;
      this.zac = paramInt2;
      this.zad = paramBoolean2;
      this.zae = paramString;
      this.zaf = paramInt3;
      this.zag = paramClass;
      if (paramClass == null) {
        this.zah = null;
      } else {
        this.zah = paramClass.getCanonicalName();
      }
      this.zak = paramFieldConverter;
    }
    
    public static Field<byte[], byte[]> forBase64(String paramString, int paramInt)
    {
      return new Field(8, false, 8, false, paramString, paramInt, null, null);
    }
    
    public static Field<Boolean, Boolean> forBoolean(String paramString, int paramInt)
    {
      return new Field(6, false, 6, false, paramString, paramInt, null, null);
    }
    
    public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String paramString, int paramInt, Class<T> paramClass)
    {
      return new Field(11, false, 11, false, paramString, paramInt, paramClass, null);
    }
    
    public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String paramString, int paramInt, Class<T> paramClass)
    {
      return new Field(11, true, 11, true, paramString, paramInt, paramClass, null);
    }
    
    public static Field<Double, Double> forDouble(String paramString, int paramInt)
    {
      return new Field(4, false, 4, false, paramString, paramInt, null, null);
    }
    
    public static Field<Float, Float> forFloat(String paramString, int paramInt)
    {
      return new Field(3, false, 3, false, paramString, paramInt, null, null);
    }
    
    public static Field<Integer, Integer> forInteger(String paramString, int paramInt)
    {
      return new Field(0, false, 0, false, paramString, paramInt, null, null);
    }
    
    public static Field<Long, Long> forLong(String paramString, int paramInt)
    {
      return new Field(2, false, 2, false, paramString, paramInt, null, null);
    }
    
    public static Field<String, String> forString(String paramString, int paramInt)
    {
      return new Field(7, false, 7, false, paramString, paramInt, null, null);
    }
    
    public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String paramString, int paramInt)
    {
      return new Field(10, false, 10, false, paramString, paramInt, null, null);
    }
    
    public static Field<ArrayList<String>, ArrayList<String>> forStrings(String paramString, int paramInt)
    {
      return new Field(7, true, 7, true, paramString, paramInt, null, null);
    }
    
    public static Field withConverter(String paramString, int paramInt, FastJsonResponse.FieldConverter<?, ?> paramFieldConverter, boolean paramBoolean)
    {
      paramFieldConverter.zaa();
      paramFieldConverter.zab();
      return new Field(7, paramBoolean, 0, false, paramString, paramInt, null, paramFieldConverter);
    }
    
    public int getSafeParcelableFieldId()
    {
      return this.zaf;
    }
    
    public final String toString()
    {
      Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
      Object localObject = this.zag;
      if (localObject != null) {
        localToStringHelper.add("concreteType.class", ((Class)localObject).getCanonicalName());
      }
      localObject = this.zak;
      if (localObject != null) {
        localToStringHelper.add("converterName", localObject.getClass().getCanonicalName());
      }
      return localToStringHelper.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = SafeParcelWriter.beginObjectHeader(paramParcel);
      SafeParcelWriter.writeInt(paramParcel, 1, this.zai);
      SafeParcelWriter.writeInt(paramParcel, 2, this.zaa);
      SafeParcelWriter.writeBoolean(paramParcel, 3, this.zab);
      SafeParcelWriter.writeInt(paramParcel, 4, this.zac);
      SafeParcelWriter.writeBoolean(paramParcel, 5, this.zad);
      SafeParcelWriter.writeString(paramParcel, 6, this.zae, false);
      SafeParcelWriter.writeInt(paramParcel, 7, getSafeParcelableFieldId());
      SafeParcelWriter.writeString(paramParcel, 8, zag(), false);
      SafeParcelWriter.writeParcelable(paramParcel, 9, zaa(), paramInt, false);
      SafeParcelWriter.finishObjectHeader(paramParcel, i);
    }
    
    final zaa zaa()
    {
      FastJsonResponse.FieldConverter localFieldConverter = this.zak;
      if (localFieldConverter == null) {
        return null;
      }
      return zaa.zaa(localFieldConverter);
    }
    
    public final Field<I, O> zab()
    {
      return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
    }
    
    public final FastJsonResponse zad()
      throws InstantiationException, IllegalAccessException
    {
      Preconditions.checkNotNull(this.zag);
      Class localClass = this.zag;
      if (localClass == SafeParcelResponse.class)
      {
        Preconditions.checkNotNull(this.zah);
        Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
        return new SafeParcelResponse(this.zaj, this.zah);
      }
      return (FastJsonResponse)localClass.newInstance();
    }
    
    public final O zae(I paramI)
    {
      Preconditions.checkNotNull(this.zak);
      return (O)Preconditions.checkNotNull(this.zak.zac(paramI));
    }
    
    public final I zaf(O paramO)
    {
      Preconditions.checkNotNull(this.zak);
      return (I)this.zak.zad(paramO);
    }
    
    final String zag()
    {
      String str2 = this.zah;
      String str1 = str2;
      if (str2 == null) {
        str1 = null;
      }
      return str1;
    }
    
    public final Map<String, Field<?, ?>> zah()
    {
      Preconditions.checkNotNull(this.zah);
      Preconditions.checkNotNull(this.zaj);
      return (Map)Preconditions.checkNotNull(this.zaj.zab(this.zah));
    }
    
    public final void zai(zan paramzan)
    {
      this.zaj = paramzan;
    }
    
    public final boolean zaj()
    {
      return this.zak != null;
    }
  }
  
  public static abstract interface FieldConverter<I, O>
  {
    public abstract int zaa();
    
    public abstract int zab();
    
    public abstract O zac(I paramI);
    
    public abstract I zad(O paramO);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\FastJsonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */