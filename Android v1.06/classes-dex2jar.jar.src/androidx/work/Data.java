package androidx.work;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Data
{
  public static final Data EMPTY = new Builder().build();
  public static final int MAX_DATA_BYTES = 10240;
  private static final String TAG = Logger.tagWithPrefix("Data");
  Map<String, Object> mValues;
  
  Data() {}
  
  public Data(Data paramData)
  {
    this.mValues = new HashMap(paramData.mValues);
  }
  
  public Data(Map<String, ?> paramMap)
  {
    this.mValues = new HashMap(paramMap);
  }
  
  public static Boolean[] convertPrimitiveBooleanArray(boolean[] paramArrayOfBoolean)
  {
    Boolean[] arrayOfBoolean = new Boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = Boolean.valueOf(paramArrayOfBoolean[i]);
    }
    return arrayOfBoolean;
  }
  
  public static Byte[] convertPrimitiveByteArray(byte[] paramArrayOfByte)
  {
    Byte[] arrayOfByte = new Byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = Byte.valueOf(paramArrayOfByte[i]);
    }
    return arrayOfByte;
  }
  
  public static Double[] convertPrimitiveDoubleArray(double[] paramArrayOfDouble)
  {
    Double[] arrayOfDouble = new Double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = Double.valueOf(paramArrayOfDouble[i]);
    }
    return arrayOfDouble;
  }
  
  public static Float[] convertPrimitiveFloatArray(float[] paramArrayOfFloat)
  {
    Float[] arrayOfFloat = new Float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = Float.valueOf(paramArrayOfFloat[i]);
    }
    return arrayOfFloat;
  }
  
  public static Integer[] convertPrimitiveIntArray(int[] paramArrayOfInt)
  {
    Integer[] arrayOfInteger = new Integer[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      arrayOfInteger[i] = Integer.valueOf(paramArrayOfInt[i]);
    }
    return arrayOfInteger;
  }
  
  public static Long[] convertPrimitiveLongArray(long[] paramArrayOfLong)
  {
    Long[] arrayOfLong = new Long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = Long.valueOf(paramArrayOfLong[i]);
    }
    return arrayOfLong;
  }
  
  public static byte[] convertToPrimitiveArray(Byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = paramArrayOfByte[i].byteValue();
    }
    return arrayOfByte;
  }
  
  public static double[] convertToPrimitiveArray(Double[] paramArrayOfDouble)
  {
    double[] arrayOfDouble = new double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = paramArrayOfDouble[i].doubleValue();
    }
    return arrayOfDouble;
  }
  
  public static float[] convertToPrimitiveArray(Float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = paramArrayOfFloat[i].floatValue();
    }
    return arrayOfFloat;
  }
  
  public static int[] convertToPrimitiveArray(Integer[] paramArrayOfInteger)
  {
    int[] arrayOfInt = new int[paramArrayOfInteger.length];
    for (int i = 0; i < paramArrayOfInteger.length; i++) {
      arrayOfInt[i] = paramArrayOfInteger[i].intValue();
    }
    return arrayOfInt;
  }
  
  public static long[] convertToPrimitiveArray(Long[] paramArrayOfLong)
  {
    long[] arrayOfLong = new long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = paramArrayOfLong[i].longValue();
    }
    return arrayOfLong;
  }
  
  public static boolean[] convertToPrimitiveArray(Boolean[] paramArrayOfBoolean)
  {
    boolean[] arrayOfBoolean = new boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = paramArrayOfBoolean[i].booleanValue();
    }
    return arrayOfBoolean;
  }
  
  /* Error */
  public static Data fromByteArray(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: sipush 10240
    //   5: if_icmpgt +223 -> 228
    //   8: new 43	java/util/HashMap
    //   11: dup
    //   12: invokespecial 131	java/util/HashMap:<init>	()V
    //   15: astore 5
    //   17: new 133	java/io/ByteArrayInputStream
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 136	java/io/ByteArrayInputStream:<init>	([B)V
    //   25: astore 4
    //   27: new 138	java/io/ObjectInputStream
    //   30: astore_2
    //   31: aload_2
    //   32: aload 4
    //   34: invokespecial 141	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   37: aload_2
    //   38: astore_0
    //   39: aload_2
    //   40: invokevirtual 144	java/io/ObjectInputStream:readInt	()I
    //   43: istore_1
    //   44: iload_1
    //   45: ifle +27 -> 72
    //   48: aload_2
    //   49: astore_0
    //   50: aload 5
    //   52: aload_2
    //   53: invokevirtual 148	java/io/ObjectInputStream:readUTF	()Ljava/lang/String;
    //   56: aload_2
    //   57: invokevirtual 152	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   60: invokeinterface 158 3 0
    //   65: pop
    //   66: iinc 1 -1
    //   69: goto -25 -> 44
    //   72: aload_2
    //   73: invokevirtual 161	java/io/ObjectInputStream:close	()V
    //   76: goto +14 -> 90
    //   79: astore_0
    //   80: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   83: ldc -93
    //   85: aload_0
    //   86: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   89: pop
    //   90: aload 4
    //   92: invokevirtual 170	java/io/ByteArrayInputStream:close	()V
    //   95: goto +79 -> 174
    //   98: astore_3
    //   99: goto +22 -> 121
    //   102: astore_3
    //   103: goto +18 -> 121
    //   106: astore_2
    //   107: aconst_null
    //   108: astore_0
    //   109: goto +76 -> 185
    //   112: astore_0
    //   113: goto +4 -> 117
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_0
    //   120: astore_3
    //   121: aload_2
    //   122: astore_0
    //   123: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   126: ldc -93
    //   128: aload_3
    //   129: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   132: pop
    //   133: aload_2
    //   134: ifnull +21 -> 155
    //   137: aload_2
    //   138: invokevirtual 161	java/io/ObjectInputStream:close	()V
    //   141: goto +14 -> 155
    //   144: astore_0
    //   145: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   148: ldc -93
    //   150: aload_0
    //   151: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: aload 4
    //   157: invokevirtual 170	java/io/ByteArrayInputStream:close	()V
    //   160: goto +14 -> 174
    //   163: astore_0
    //   164: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   167: ldc -93
    //   169: aload_0
    //   170: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   173: pop
    //   174: new 2	androidx/work/Data
    //   177: dup
    //   178: aload 5
    //   180: invokespecial 171	androidx/work/Data:<init>	(Ljava/util/Map;)V
    //   183: areturn
    //   184: astore_2
    //   185: aload_0
    //   186: ifnull +21 -> 207
    //   189: aload_0
    //   190: invokevirtual 161	java/io/ObjectInputStream:close	()V
    //   193: goto +14 -> 207
    //   196: astore_0
    //   197: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   200: ldc -93
    //   202: aload_0
    //   203: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: aload 4
    //   209: invokevirtual 170	java/io/ByteArrayInputStream:close	()V
    //   212: goto +14 -> 226
    //   215: astore_0
    //   216: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   219: ldc -93
    //   221: aload_0
    //   222: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   225: pop
    //   226: aload_2
    //   227: athrow
    //   228: new 173	java/lang/IllegalStateException
    //   231: dup
    //   232: ldc -81
    //   234: invokespecial 178	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   237: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	paramArrayOfByte	byte[]
    //   43	24	1	i	int
    //   30	43	2	localObjectInputStream	java.io.ObjectInputStream
    //   106	1	2	localObject1	Object
    //   118	20	2	localObject2	Object
    //   184	43	2	localObject3	Object
    //   98	1	3	localClassNotFoundException	ClassNotFoundException
    //   102	1	3	localIOException	java.io.IOException
    //   120	9	3	arrayOfByte	byte[]
    //   25	183	4	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   15	164	5	localHashMap	HashMap
    // Exception table:
    //   from	to	target	type
    //   72	76	79	java/io/IOException
    //   39	44	98	java/lang/ClassNotFoundException
    //   50	66	98	java/lang/ClassNotFoundException
    //   39	44	102	java/io/IOException
    //   50	66	102	java/io/IOException
    //   27	37	106	finally
    //   27	37	112	java/lang/ClassNotFoundException
    //   27	37	116	java/io/IOException
    //   137	141	144	java/io/IOException
    //   90	95	163	java/io/IOException
    //   155	160	163	java/io/IOException
    //   39	44	184	finally
    //   50	66	184	finally
    //   123	133	184	finally
    //   189	193	196	java/io/IOException
    //   207	212	215	java/io/IOException
  }
  
  /* Error */
  public static byte[] toByteArrayInternal(Data paramData)
  {
    // Byte code:
    //   0: new 182	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 183	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore 5
    //   9: aconst_null
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aload 4
    //   16: astore_1
    //   17: new 185	java/io/ObjectOutputStream
    //   20: astore_2
    //   21: aload 4
    //   23: astore_1
    //   24: aload_2
    //   25: aload 5
    //   27: invokespecial 188	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: aload_2
    //   31: aload_0
    //   32: invokevirtual 191	androidx/work/Data:size	()I
    //   35: invokevirtual 195	java/io/ObjectOutputStream:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 45	androidx/work/Data:mValues	Ljava/util/Map;
    //   42: invokeinterface 199 1 0
    //   47: invokeinterface 205 1 0
    //   52: astore_1
    //   53: aload_1
    //   54: invokeinterface 210 1 0
    //   59: ifeq +39 -> 98
    //   62: aload_1
    //   63: invokeinterface 213 1 0
    //   68: checkcast 215	java/util/Map$Entry
    //   71: astore_0
    //   72: aload_2
    //   73: aload_0
    //   74: invokeinterface 218 1 0
    //   79: checkcast 220	java/lang/String
    //   82: invokevirtual 223	java/io/ObjectOutputStream:writeUTF	(Ljava/lang/String;)V
    //   85: aload_2
    //   86: aload_0
    //   87: invokeinterface 226 1 0
    //   92: invokevirtual 230	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   95: goto -42 -> 53
    //   98: aload_2
    //   99: invokevirtual 231	java/io/ObjectOutputStream:close	()V
    //   102: goto +14 -> 116
    //   105: astore_0
    //   106: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   109: ldc -23
    //   111: aload_0
    //   112: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   115: pop
    //   116: aload 5
    //   118: invokevirtual 234	java/io/ByteArrayOutputStream:close	()V
    //   121: goto +14 -> 135
    //   124: astore_0
    //   125: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   128: ldc -23
    //   130: aload_0
    //   131: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   134: pop
    //   135: aload 5
    //   137: invokevirtual 235	java/io/ByteArrayOutputStream:size	()I
    //   140: sipush 10240
    //   143: if_icmpgt +9 -> 152
    //   146: aload 5
    //   148: invokevirtual 239	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   151: areturn
    //   152: new 173	java/lang/IllegalStateException
    //   155: dup
    //   156: ldc -81
    //   158: invokespecial 178	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   161: athrow
    //   162: astore_0
    //   163: aload_2
    //   164: astore_1
    //   165: goto +81 -> 246
    //   168: astore_1
    //   169: aload_2
    //   170: astore_0
    //   171: aload_1
    //   172: astore_2
    //   173: goto +10 -> 183
    //   176: astore_0
    //   177: goto +69 -> 246
    //   180: astore_2
    //   181: aload_3
    //   182: astore_0
    //   183: aload_0
    //   184: astore_1
    //   185: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   188: ldc -23
    //   190: aload_2
    //   191: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   194: pop
    //   195: aload_0
    //   196: astore_1
    //   197: aload 5
    //   199: invokevirtual 239	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   202: astore_2
    //   203: aload_0
    //   204: ifnull +21 -> 225
    //   207: aload_0
    //   208: invokevirtual 231	java/io/ObjectOutputStream:close	()V
    //   211: goto +14 -> 225
    //   214: astore_0
    //   215: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   218: ldc -23
    //   220: aload_0
    //   221: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   224: pop
    //   225: aload 5
    //   227: invokevirtual 234	java/io/ByteArrayOutputStream:close	()V
    //   230: goto +14 -> 244
    //   233: astore_0
    //   234: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   237: ldc -23
    //   239: aload_0
    //   240: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   243: pop
    //   244: aload_2
    //   245: areturn
    //   246: aload_1
    //   247: ifnull +21 -> 268
    //   250: aload_1
    //   251: invokevirtual 231	java/io/ObjectOutputStream:close	()V
    //   254: goto +14 -> 268
    //   257: astore_1
    //   258: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   261: ldc -23
    //   263: aload_1
    //   264: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   267: pop
    //   268: aload 5
    //   270: invokevirtual 234	java/io/ByteArrayOutputStream:close	()V
    //   273: goto +14 -> 287
    //   276: astore_1
    //   277: getstatic 29	androidx/work/Data:TAG	Ljava/lang/String;
    //   280: ldc -23
    //   282: aload_1
    //   283: invokestatic 169	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   286: pop
    //   287: aload_0
    //   288: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	paramData	Data
    //   16	149	1	localObject1	Object
    //   168	4	1	localIOException1	java.io.IOException
    //   184	67	1	localData	Data
    //   257	7	1	localIOException2	java.io.IOException
    //   276	7	1	localIOException3	java.io.IOException
    //   20	153	2	localObject2	Object
    //   180	11	2	localIOException4	java.io.IOException
    //   202	43	2	arrayOfByte	byte[]
    //   10	172	3	localObject3	Object
    //   12	10	4	localObject4	Object
    //   7	262	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   98	102	105	java/io/IOException
    //   116	121	124	java/io/IOException
    //   30	53	162	finally
    //   53	95	162	finally
    //   30	53	168	java/io/IOException
    //   53	95	168	java/io/IOException
    //   17	21	176	finally
    //   24	30	176	finally
    //   185	195	176	finally
    //   197	203	176	finally
    //   17	21	180	java/io/IOException
    //   24	30	180	java/io/IOException
    //   207	211	214	java/io/IOException
    //   225	230	233	java/io/IOException
    //   250	254	257	java/io/IOException
    //   268	273	276	java/io/IOException
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (Data)paramObject;
      Object localObject1 = this.mValues.keySet();
      if (!((Set)localObject1).equals(((Data)paramObject).mValues.keySet())) {
        return false;
      }
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = (String)((Iterator)localObject1).next();
        Object localObject2 = this.mValues.get(localObject3);
        localObject3 = ((Data)paramObject).mValues.get(localObject3);
        boolean bool;
        if ((localObject2 != null) && (localObject3 != null))
        {
          if (((localObject2 instanceof Object[])) && ((localObject3 instanceof Object[]))) {
            bool = Arrays.deepEquals((Object[])localObject2, (Object[])localObject3);
          } else {
            bool = localObject2.equals(localObject3);
          }
        }
        else if (localObject2 == localObject3) {
          bool = true;
        } else {
          bool = false;
        }
        if (!bool) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Boolean)) {
      return ((Boolean)paramString).booleanValue();
    }
    return paramBoolean;
  }
  
  public boolean[] getBooleanArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Boolean[])) {
      return convertToPrimitiveArray((Boolean[])paramString);
    }
    return null;
  }
  
  public byte getByte(String paramString, byte paramByte)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Byte)) {
      return ((Byte)paramString).byteValue();
    }
    return paramByte;
  }
  
  public byte[] getByteArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Byte[])) {
      return convertToPrimitiveArray((Byte[])paramString);
    }
    return null;
  }
  
  public double getDouble(String paramString, double paramDouble)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Double)) {
      return ((Double)paramString).doubleValue();
    }
    return paramDouble;
  }
  
  public double[] getDoubleArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Double[])) {
      return convertToPrimitiveArray((Double[])paramString);
    }
    return null;
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Float)) {
      return ((Float)paramString).floatValue();
    }
    return paramFloat;
  }
  
  public float[] getFloatArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Float[])) {
      return convertToPrimitiveArray((Float[])paramString);
    }
    return null;
  }
  
  public int getInt(String paramString, int paramInt)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Integer)) {
      return ((Integer)paramString).intValue();
    }
    return paramInt;
  }
  
  public int[] getIntArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Integer[])) {
      return convertToPrimitiveArray((Integer[])paramString);
    }
    return null;
  }
  
  public Map<String, Object> getKeyValueMap()
  {
    return Collections.unmodifiableMap(this.mValues);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Long)) {
      return ((Long)paramString).longValue();
    }
    return paramLong;
  }
  
  public long[] getLongArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof Long[])) {
      return convertToPrimitiveArray((Long[])paramString);
    }
    return null;
  }
  
  public String getString(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof String)) {
      return (String)paramString;
    }
    return null;
  }
  
  public String[] getStringArray(String paramString)
  {
    paramString = this.mValues.get(paramString);
    if ((paramString instanceof String[])) {
      return (String[])paramString;
    }
    return null;
  }
  
  public <T> boolean hasKeyWithValueOfType(String paramString, Class<T> paramClass)
  {
    paramString = this.mValues.get(paramString);
    boolean bool;
    if ((paramString != null) && (paramClass.isAssignableFrom(paramString.getClass()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return this.mValues.hashCode() * 31;
  }
  
  public int size()
  {
    return this.mValues.size();
  }
  
  public byte[] toByteArray()
  {
    return toByteArrayInternal(this);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Data {");
    if (!this.mValues.isEmpty())
    {
      Iterator localIterator = this.mValues.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" : ");
        localObject = this.mValues.get(localObject);
        if ((localObject instanceof Object[])) {
          localStringBuilder.append(Arrays.toString((Object[])localObject));
        } else {
          localStringBuilder.append(localObject);
        }
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private Map<String, Object> mValues = new HashMap();
    
    public Data build()
    {
      Data localData = new Data(this.mValues);
      Data.toByteArrayInternal(localData);
      return localData;
    }
    
    public Builder put(String paramString, Object paramObject)
    {
      if (paramObject == null)
      {
        this.mValues.put(paramString, null);
      }
      else
      {
        Class localClass = paramObject.getClass();
        if ((localClass != Boolean.class) && (localClass != Byte.class) && (localClass != Integer.class) && (localClass != Long.class) && (localClass != Float.class) && (localClass != Double.class) && (localClass != String.class) && (localClass != Boolean[].class) && (localClass != Byte[].class) && (localClass != Integer[].class) && (localClass != Long[].class) && (localClass != Float[].class) && (localClass != Double[].class) && (localClass != String[].class))
        {
          if (localClass == boolean[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveBooleanArray((boolean[])paramObject));
          } else if (localClass == byte[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveByteArray((byte[])paramObject));
          } else if (localClass == int[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveIntArray((int[])paramObject));
          } else if (localClass == long[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveLongArray((long[])paramObject));
          } else if (localClass == float[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveFloatArray((float[])paramObject));
          } else if (localClass == double[].class) {
            this.mValues.put(paramString, Data.convertPrimitiveDoubleArray((double[])paramObject));
          } else {
            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] { paramString, localClass }));
          }
        }
        else {
          this.mValues.put(paramString, paramObject);
        }
      }
      return this;
    }
    
    public Builder putAll(Data paramData)
    {
      putAll(paramData.mValues);
      return this;
    }
    
    public Builder putAll(Map<String, Object> paramMap)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        put((String)localEntry.getKey(), localEntry.getValue());
      }
      return this;
    }
    
    public Builder putBoolean(String paramString, boolean paramBoolean)
    {
      this.mValues.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    
    public Builder putBooleanArray(String paramString, boolean[] paramArrayOfBoolean)
    {
      this.mValues.put(paramString, Data.convertPrimitiveBooleanArray(paramArrayOfBoolean));
      return this;
    }
    
    public Builder putByte(String paramString, byte paramByte)
    {
      this.mValues.put(paramString, Byte.valueOf(paramByte));
      return this;
    }
    
    public Builder putByteArray(String paramString, byte[] paramArrayOfByte)
    {
      this.mValues.put(paramString, Data.convertPrimitiveByteArray(paramArrayOfByte));
      return this;
    }
    
    public Builder putDouble(String paramString, double paramDouble)
    {
      this.mValues.put(paramString, Double.valueOf(paramDouble));
      return this;
    }
    
    public Builder putDoubleArray(String paramString, double[] paramArrayOfDouble)
    {
      this.mValues.put(paramString, Data.convertPrimitiveDoubleArray(paramArrayOfDouble));
      return this;
    }
    
    public Builder putFloat(String paramString, float paramFloat)
    {
      this.mValues.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    
    public Builder putFloatArray(String paramString, float[] paramArrayOfFloat)
    {
      this.mValues.put(paramString, Data.convertPrimitiveFloatArray(paramArrayOfFloat));
      return this;
    }
    
    public Builder putInt(String paramString, int paramInt)
    {
      this.mValues.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    
    public Builder putIntArray(String paramString, int[] paramArrayOfInt)
    {
      this.mValues.put(paramString, Data.convertPrimitiveIntArray(paramArrayOfInt));
      return this;
    }
    
    public Builder putLong(String paramString, long paramLong)
    {
      this.mValues.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    
    public Builder putLongArray(String paramString, long[] paramArrayOfLong)
    {
      this.mValues.put(paramString, Data.convertPrimitiveLongArray(paramArrayOfLong));
      return this;
    }
    
    public Builder putString(String paramString1, String paramString2)
    {
      this.mValues.put(paramString1, paramString2);
      return this;
    }
    
    public Builder putStringArray(String paramString, String[] paramArrayOfString)
    {
      this.mValues.put(paramString, paramArrayOfString);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Data.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */