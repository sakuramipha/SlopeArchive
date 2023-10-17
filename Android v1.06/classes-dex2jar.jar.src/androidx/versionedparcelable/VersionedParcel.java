package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class VersionedParcel
{
  private static final int EX_BAD_PARCELABLE = -2;
  private static final int EX_ILLEGAL_ARGUMENT = -3;
  private static final int EX_ILLEGAL_STATE = -5;
  private static final int EX_NETWORK_MAIN_THREAD = -6;
  private static final int EX_NULL_POINTER = -4;
  private static final int EX_PARCELABLE = -9;
  private static final int EX_SECURITY = -1;
  private static final int EX_UNSUPPORTED_OPERATION = -7;
  private static final String TAG = "VersionedParcel";
  private static final int TYPE_BINDER = 5;
  private static final int TYPE_FLOAT = 8;
  private static final int TYPE_INTEGER = 7;
  private static final int TYPE_PARCELABLE = 2;
  private static final int TYPE_SERIALIZABLE = 3;
  private static final int TYPE_STRING = 4;
  private static final int TYPE_VERSIONED_PARCELABLE = 1;
  protected final ArrayMap<String, Class> mParcelizerCache;
  protected final ArrayMap<String, Method> mReadCache;
  protected final ArrayMap<String, Method> mWriteCache;
  
  public VersionedParcel(ArrayMap<String, Method> paramArrayMap1, ArrayMap<String, Method> paramArrayMap2, ArrayMap<String, Class> paramArrayMap)
  {
    this.mReadCache = paramArrayMap1;
    this.mWriteCache = paramArrayMap2;
    this.mParcelizerCache = paramArrayMap;
  }
  
  private Exception createException(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case -8: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown exception code: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" msg ");
      localStringBuilder.append(paramString);
      return new RuntimeException(localStringBuilder.toString());
    case -1: 
      return new SecurityException(paramString);
    case -2: 
      return new BadParcelableException(paramString);
    case -3: 
      return new IllegalArgumentException(paramString);
    case -4: 
      return new NullPointerException(paramString);
    case -5: 
      return new IllegalStateException(paramString);
    case -6: 
      return new NetworkOnMainThreadException();
    case -7: 
      return new UnsupportedOperationException(paramString);
    }
    return (Exception)readParcelable();
  }
  
  private Class findParcelClass(Class<? extends VersionedParcelable> paramClass)
    throws ClassNotFoundException
  {
    Class localClass2 = (Class)this.mParcelizerCache.get(paramClass.getName());
    Class localClass1 = localClass2;
    if (localClass2 == null)
    {
      localClass1 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      this.mParcelizerCache.put(paramClass.getName(), localClass1);
    }
    return localClass1;
  }
  
  private Method getReadMethod(String paramString)
    throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException
  {
    Method localMethod2 = (Method)this.mReadCache.get(paramString);
    Method localMethod1 = localMethod2;
    if (localMethod2 == null)
    {
      System.currentTimeMillis();
      localMethod1 = Class.forName(paramString, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[] { VersionedParcel.class });
      this.mReadCache.put(paramString, localMethod1);
    }
    return localMethod1;
  }
  
  protected static Throwable getRootCause(Throwable paramThrowable)
  {
    while (paramThrowable.getCause() != null) {
      paramThrowable = paramThrowable.getCause();
    }
    return paramThrowable;
  }
  
  private <T> int getType(T paramT)
  {
    if ((paramT instanceof String)) {
      return 4;
    }
    if ((paramT instanceof Parcelable)) {
      return 2;
    }
    if ((paramT instanceof VersionedParcelable)) {
      return 1;
    }
    if ((paramT instanceof Serializable)) {
      return 3;
    }
    if ((paramT instanceof IBinder)) {
      return 5;
    }
    if ((paramT instanceof Integer)) {
      return 7;
    }
    if ((paramT instanceof Float)) {
      return 8;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramT.getClass().getName());
    localStringBuilder.append(" cannot be VersionedParcelled");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private Method getWriteMethod(Class paramClass)
    throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException
  {
    Method localMethod = (Method)this.mWriteCache.get(paramClass.getName());
    Object localObject = localMethod;
    if (localMethod == null)
    {
      localObject = findParcelClass(paramClass);
      System.currentTimeMillis();
      localObject = ((Class)localObject).getDeclaredMethod("write", new Class[] { paramClass, VersionedParcel.class });
      this.mWriteCache.put(paramClass.getName(), localObject);
    }
    return (Method)localObject;
  }
  
  private <T, S extends Collection<T>> S readCollection(S paramS)
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    if (i != 0)
    {
      int k = readInt();
      if (i < 0) {
        return null;
      }
      int j = i;
      if (k != 1)
      {
        j = i;
        if (k != 2)
        {
          j = i;
          if (k != 3)
          {
            j = i;
            if (k != 4)
            {
              if (k == 5) {
                while (i > 0)
                {
                  paramS.add(readStrongBinder());
                  i--;
                }
              }
            }
            else {
              while (j > 0)
              {
                paramS.add(readString());
                j--;
              }
            }
          }
          else
          {
            while (j > 0)
            {
              paramS.add(readSerializable());
              j--;
            }
          }
        }
        else
        {
          while (j > 0)
          {
            paramS.add(readParcelable());
            j--;
          }
        }
      }
      else
      {
        while (j > 0)
        {
          paramS.add(readVersionedParcelable());
          j--;
        }
      }
    }
    return paramS;
  }
  
  private Exception readException(int paramInt, String paramString)
  {
    return createException(paramInt, paramString);
  }
  
  private int readExceptionCode()
  {
    return readInt();
  }
  
  private <T> void writeCollection(Collection<T> paramCollection)
  {
    if (paramCollection == null)
    {
      writeInt(-1);
      return;
    }
    int i = paramCollection.size();
    writeInt(i);
    if (i > 0)
    {
      i = getType(paramCollection.iterator().next());
      writeInt(i);
      switch (i)
      {
      case 6: 
      default: 
        break;
      case 8: 
        paramCollection = paramCollection.iterator();
      case 7: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
        while (paramCollection.hasNext())
        {
          writeFloat(((Float)paramCollection.next()).floatValue());
          continue;
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext())
          {
            writeInt(((Integer)paramCollection.next()).intValue());
            continue;
            paramCollection = paramCollection.iterator();
            while (paramCollection.hasNext())
            {
              writeStrongBinder((IBinder)paramCollection.next());
              continue;
              paramCollection = paramCollection.iterator();
              while (paramCollection.hasNext())
              {
                writeString((String)paramCollection.next());
                continue;
                paramCollection = paramCollection.iterator();
                while (paramCollection.hasNext())
                {
                  writeSerializable((Serializable)paramCollection.next());
                  continue;
                  paramCollection = paramCollection.iterator();
                  while (paramCollection.hasNext())
                  {
                    writeParcelable((Parcelable)paramCollection.next());
                    continue;
                    paramCollection = paramCollection.iterator();
                    while (paramCollection.hasNext()) {
                      writeVersionedParcelable((VersionedParcelable)paramCollection.next());
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private <T> void writeCollection(Collection<T> paramCollection, int paramInt)
  {
    setOutputField(paramInt);
    writeCollection(paramCollection);
  }
  
  private void writeSerializable(Serializable paramSerializable)
  {
    if (paramSerializable == null)
    {
      writeString(null);
      return;
    }
    String str = paramSerializable.getClass().getName();
    writeString(str);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(paramSerializable);
      localObjectOutputStream.close();
      writeByteArray(localByteArrayOutputStream.toByteArray());
      return;
    }
    catch (IOException localIOException)
    {
      paramSerializable = new StringBuilder();
      paramSerializable.append("VersionedParcelable encountered IOException writing serializable object (name = ");
      paramSerializable.append(str);
      paramSerializable.append(")");
      throw new RuntimeException(paramSerializable.toString(), localIOException);
    }
  }
  
  private void writeVersionedParcelableCreator(VersionedParcelable paramVersionedParcelable)
  {
    try
    {
      localObject = findParcelClass(paramVersionedParcelable.getClass());
      writeString(((Class)localObject).getName());
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramVersionedParcelable.getClass().getSimpleName());
      ((StringBuilder)localObject).append(" does not have a Parcelizer");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localClassNotFoundException);
    }
  }
  
  protected abstract void closeField();
  
  protected abstract VersionedParcel createSubParcel();
  
  public boolean isStream()
  {
    return false;
  }
  
  protected <T> T[] readArray(T[] paramArrayOfT)
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(i);
    if (i != 0)
    {
      int k = readInt();
      if (i < 0) {
        return null;
      }
      int j = i;
      if (k != 1)
      {
        j = i;
        if (k != 2)
        {
          j = i;
          if (k != 3)
          {
            j = i;
            if (k != 4)
            {
              if (k == 5) {
                while (i > 0)
                {
                  localArrayList.add(readStrongBinder());
                  i--;
                }
              }
            }
            else {
              while (j > 0)
              {
                localArrayList.add(readString());
                j--;
              }
            }
          }
          else
          {
            while (j > 0)
            {
              localArrayList.add(readSerializable());
              j--;
            }
          }
        }
        else
        {
          while (j > 0)
          {
            localArrayList.add(readParcelable());
            j--;
          }
        }
      }
      else
      {
        while (j > 0)
        {
          localArrayList.add(readVersionedParcelable());
          j--;
        }
      }
    }
    return localArrayList.toArray(paramArrayOfT);
  }
  
  public <T> T[] readArray(T[] paramArrayOfT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfT;
    }
    return readArray(paramArrayOfT);
  }
  
  protected abstract boolean readBoolean();
  
  public boolean readBoolean(boolean paramBoolean, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramBoolean;
    }
    return readBoolean();
  }
  
  protected boolean[] readBooleanArray()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    boolean[] arrayOfBoolean = new boolean[j];
    for (int i = 0; i < j; i++)
    {
      int k;
      if (readInt() != 0) {
        k = 1;
      } else {
        k = 0;
      }
      arrayOfBoolean[i] = k;
    }
    return arrayOfBoolean;
  }
  
  public boolean[] readBooleanArray(boolean[] paramArrayOfBoolean, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfBoolean;
    }
    return readBooleanArray();
  }
  
  protected abstract Bundle readBundle();
  
  public Bundle readBundle(Bundle paramBundle, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramBundle;
    }
    return readBundle();
  }
  
  public byte readByte(byte paramByte, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramByte;
    }
    return (byte)(readInt() & 0xFF);
  }
  
  protected abstract byte[] readByteArray();
  
  public byte[] readByteArray(byte[] paramArrayOfByte, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfByte;
    }
    return readByteArray();
  }
  
  public char[] readCharArray(char[] paramArrayOfChar, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfChar;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    paramArrayOfChar = new char[i];
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramArrayOfChar[paramInt] = ((char)readInt());
    }
    return paramArrayOfChar;
  }
  
  protected abstract CharSequence readCharSequence();
  
  public CharSequence readCharSequence(CharSequence paramCharSequence, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramCharSequence;
    }
    return readCharSequence();
  }
  
  protected abstract double readDouble();
  
  public double readDouble(double paramDouble, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramDouble;
    }
    return readDouble();
  }
  
  protected double[] readDoubleArray()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    double[] arrayOfDouble = new double[j];
    for (int i = 0; i < j; i++) {
      arrayOfDouble[i] = readDouble();
    }
    return arrayOfDouble;
  }
  
  public double[] readDoubleArray(double[] paramArrayOfDouble, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfDouble;
    }
    return readDoubleArray();
  }
  
  public Exception readException(Exception paramException, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramException;
    }
    paramInt = readExceptionCode();
    if (paramInt != 0) {
      paramException = readException(paramInt, readString());
    }
    return paramException;
  }
  
  protected abstract boolean readField(int paramInt);
  
  protected abstract float readFloat();
  
  public float readFloat(float paramFloat, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramFloat;
    }
    return readFloat();
  }
  
  protected float[] readFloatArray()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    float[] arrayOfFloat = new float[j];
    for (int i = 0; i < j; i++) {
      arrayOfFloat[i] = readFloat();
    }
    return arrayOfFloat;
  }
  
  public float[] readFloatArray(float[] paramArrayOfFloat, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfFloat;
    }
    return readFloatArray();
  }
  
  protected <T extends VersionedParcelable> T readFromParcel(String paramString, VersionedParcel paramVersionedParcel)
  {
    try
    {
      paramString = (VersionedParcelable)getReadMethod(paramString).invoke(null, new Object[] { paramVersionedParcel });
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramString);
    }
    catch (NoSuchMethodException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramString);
    }
    catch (InvocationTargetException paramString)
    {
      if ((paramString.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramString.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramString);
    }
  }
  
  protected abstract int readInt();
  
  public int readInt(int paramInt1, int paramInt2)
  {
    if (!readField(paramInt2)) {
      return paramInt1;
    }
    return readInt();
  }
  
  protected int[] readIntArray()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++) {
      arrayOfInt[i] = readInt();
    }
    return arrayOfInt;
  }
  
  public int[] readIntArray(int[] paramArrayOfInt, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfInt;
    }
    return readIntArray();
  }
  
  public <T> List<T> readList(List<T> paramList, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramList;
    }
    return (List)readCollection(new ArrayList());
  }
  
  protected abstract long readLong();
  
  public long readLong(long paramLong, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramLong;
    }
    return readLong();
  }
  
  protected long[] readLongArray()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    long[] arrayOfLong = new long[j];
    for (int i = 0; i < j; i++) {
      arrayOfLong[i] = readLong();
    }
    return arrayOfLong;
  }
  
  public long[] readLongArray(long[] paramArrayOfLong, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfLong;
    }
    return readLongArray();
  }
  
  public <K, V> Map<K, V> readMap(Map<K, V> paramMap, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramMap;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    paramMap = new ArrayMap();
    if (i == 0) {
      return paramMap;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    readCollection(localArrayList1);
    readCollection(localArrayList2);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramMap.put(localArrayList1.get(paramInt), localArrayList2.get(paramInt));
    }
    return paramMap;
  }
  
  protected abstract <T extends Parcelable> T readParcelable();
  
  public <T extends Parcelable> T readParcelable(T paramT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramT;
    }
    return readParcelable();
  }
  
  protected Serializable readSerializable()
  {
    String str = readString();
    if (str == null) {
      return null;
    }
    Object localObject1 = new ByteArrayInputStream(readByteArray());
    try
    {
      localObject2 = new androidx/versionedparcelable/VersionedParcel$1;
      ((1)localObject2).<init>(this, (InputStream)localObject1);
      localObject1 = (Serializable)((ObjectInputStream)localObject2).readObject();
      return (Serializable)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(")");
      throw new RuntimeException(((StringBuilder)localObject2).toString(), localClassNotFoundException);
    }
    catch (IOException localIOException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("VersionedParcelable encountered IOException reading a Serializable object (name = ");
      localStringBuilder.append(str);
      localStringBuilder.append(")");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
  
  public <T> Set<T> readSet(Set<T> paramSet, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSet;
    }
    return (Set)readCollection(new ArraySet());
  }
  
  public Size readSize(Size paramSize, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSize;
    }
    if (readBoolean()) {
      return new Size(readInt(), readInt());
    }
    return null;
  }
  
  public SizeF readSizeF(SizeF paramSizeF, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSizeF;
    }
    if (readBoolean()) {
      return new SizeF(readFloat(), readFloat());
    }
    return null;
  }
  
  public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray paramSparseBooleanArray, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSparseBooleanArray;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    paramSparseBooleanArray = new SparseBooleanArray(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramSparseBooleanArray.put(readInt(), readBoolean());
    }
    return paramSparseBooleanArray;
  }
  
  protected abstract String readString();
  
  public String readString(String paramString, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramString;
    }
    return readString();
  }
  
  protected abstract IBinder readStrongBinder();
  
  public IBinder readStrongBinder(IBinder paramIBinder, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramIBinder;
    }
    return readStrongBinder();
  }
  
  protected <T extends VersionedParcelable> T readVersionedParcelable()
  {
    String str = readString();
    if (str == null) {
      return null;
    }
    return readFromParcel(str, createSubParcel());
  }
  
  public <T extends VersionedParcelable> T readVersionedParcelable(T paramT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramT;
    }
    return readVersionedParcelable();
  }
  
  protected abstract void setOutputField(int paramInt);
  
  public void setSerializationFlags(boolean paramBoolean1, boolean paramBoolean2) {}
  
  protected <T> void writeArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT == null)
    {
      writeInt(-1);
      return;
    }
    int i1 = paramArrayOfT.length;
    writeInt(i1);
    if (i1 > 0)
    {
      int k = 0;
      int m = 0;
      int n = 0;
      int i = 0;
      int j = 0;
      int i2 = getType(paramArrayOfT[0]);
      writeInt(i2);
      if (i2 != 1)
      {
        i = n;
        if (i2 != 2)
        {
          i = m;
          if (i2 != 3)
          {
            i = k;
            if (i2 != 4)
            {
              i = j;
              if (i2 == 5) {
                while (i < i1)
                {
                  writeStrongBinder((IBinder)paramArrayOfT[i]);
                  i++;
                }
              }
            }
            else
            {
              while (i < i1)
              {
                writeString((String)paramArrayOfT[i]);
                i++;
              }
            }
          }
          else
          {
            while (i < i1)
            {
              writeSerializable((Serializable)paramArrayOfT[i]);
              i++;
            }
          }
        }
        else
        {
          while (i < i1)
          {
            writeParcelable((Parcelable)paramArrayOfT[i]);
            i++;
          }
        }
      }
      else
      {
        while (i < i1)
        {
          writeVersionedParcelable((VersionedParcelable)paramArrayOfT[i]);
          i++;
        }
      }
    }
  }
  
  public <T> void writeArray(T[] paramArrayOfT, int paramInt)
  {
    setOutputField(paramInt);
    writeArray(paramArrayOfT);
  }
  
  protected abstract void writeBoolean(boolean paramBoolean);
  
  public void writeBoolean(boolean paramBoolean, int paramInt)
  {
    setOutputField(paramInt);
    writeBoolean(paramBoolean);
  }
  
  protected void writeBooleanArray(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      int j = paramArrayOfBoolean.length;
      writeInt(j);
      for (int i = 0; i < j; i++) {
        writeInt(paramArrayOfBoolean[i]);
      }
    }
    writeInt(-1);
  }
  
  public void writeBooleanArray(boolean[] paramArrayOfBoolean, int paramInt)
  {
    setOutputField(paramInt);
    writeBooleanArray(paramArrayOfBoolean);
  }
  
  protected abstract void writeBundle(Bundle paramBundle);
  
  public void writeBundle(Bundle paramBundle, int paramInt)
  {
    setOutputField(paramInt);
    writeBundle(paramBundle);
  }
  
  public void writeByte(byte paramByte, int paramInt)
  {
    setOutputField(paramInt);
    writeInt(paramByte);
  }
  
  protected abstract void writeByteArray(byte[] paramArrayOfByte);
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt)
  {
    setOutputField(paramInt);
    writeByteArray(paramArrayOfByte);
  }
  
  protected abstract void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    setOutputField(paramInt3);
    writeByteArray(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void writeCharArray(char[] paramArrayOfChar, int paramInt)
  {
    setOutputField(paramInt);
    if (paramArrayOfChar != null)
    {
      int i = paramArrayOfChar.length;
      writeInt(i);
      for (paramInt = 0; paramInt < i; paramInt++) {
        writeInt(paramArrayOfChar[paramInt]);
      }
    }
    writeInt(-1);
  }
  
  protected abstract void writeCharSequence(CharSequence paramCharSequence);
  
  public void writeCharSequence(CharSequence paramCharSequence, int paramInt)
  {
    setOutputField(paramInt);
    writeCharSequence(paramCharSequence);
  }
  
  protected abstract void writeDouble(double paramDouble);
  
  public void writeDouble(double paramDouble, int paramInt)
  {
    setOutputField(paramInt);
    writeDouble(paramDouble);
  }
  
  protected void writeDoubleArray(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      int j = paramArrayOfDouble.length;
      writeInt(j);
      for (int i = 0; i < j; i++) {
        writeDouble(paramArrayOfDouble[i]);
      }
    }
    writeInt(-1);
  }
  
  public void writeDoubleArray(double[] paramArrayOfDouble, int paramInt)
  {
    setOutputField(paramInt);
    writeDoubleArray(paramArrayOfDouble);
  }
  
  public void writeException(Exception paramException, int paramInt)
  {
    setOutputField(paramInt);
    if (paramException == null)
    {
      writeNoException();
      return;
    }
    paramInt = 0;
    if (((paramException instanceof Parcelable)) && (paramException.getClass().getClassLoader() == Parcelable.class.getClassLoader())) {
      paramInt = -9;
    } else if ((paramException instanceof SecurityException)) {
      paramInt = -1;
    } else if ((paramException instanceof BadParcelableException)) {
      paramInt = -2;
    } else if ((paramException instanceof IllegalArgumentException)) {
      paramInt = -3;
    } else if ((paramException instanceof NullPointerException)) {
      paramInt = -4;
    } else if ((paramException instanceof IllegalStateException)) {
      paramInt = -5;
    } else if ((paramException instanceof NetworkOnMainThreadException)) {
      paramInt = -6;
    } else if ((paramException instanceof UnsupportedOperationException)) {
      paramInt = -7;
    }
    writeInt(paramInt);
    if (paramInt == 0)
    {
      if ((paramException instanceof RuntimeException)) {
        throw ((RuntimeException)paramException);
      }
      throw new RuntimeException(paramException);
    }
    writeString(paramException.getMessage());
    if (paramInt == -9) {
      writeParcelable((Parcelable)paramException);
    }
  }
  
  protected abstract void writeFloat(float paramFloat);
  
  public void writeFloat(float paramFloat, int paramInt)
  {
    setOutputField(paramInt);
    writeFloat(paramFloat);
  }
  
  protected void writeFloatArray(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      int j = paramArrayOfFloat.length;
      writeInt(j);
      for (int i = 0; i < j; i++) {
        writeFloat(paramArrayOfFloat[i]);
      }
    }
    writeInt(-1);
  }
  
  public void writeFloatArray(float[] paramArrayOfFloat, int paramInt)
  {
    setOutputField(paramInt);
    writeFloatArray(paramArrayOfFloat);
  }
  
  protected abstract void writeInt(int paramInt);
  
  public void writeInt(int paramInt1, int paramInt2)
  {
    setOutputField(paramInt2);
    writeInt(paramInt1);
  }
  
  protected void writeIntArray(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      int j = paramArrayOfInt.length;
      writeInt(j);
      for (int i = 0; i < j; i++) {
        writeInt(paramArrayOfInt[i]);
      }
    }
    writeInt(-1);
  }
  
  public void writeIntArray(int[] paramArrayOfInt, int paramInt)
  {
    setOutputField(paramInt);
    writeIntArray(paramArrayOfInt);
  }
  
  public <T> void writeList(List<T> paramList, int paramInt)
  {
    writeCollection(paramList, paramInt);
  }
  
  protected abstract void writeLong(long paramLong);
  
  public void writeLong(long paramLong, int paramInt)
  {
    setOutputField(paramInt);
    writeLong(paramLong);
  }
  
  protected void writeLongArray(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      int j = paramArrayOfLong.length;
      writeInt(j);
      for (int i = 0; i < j; i++) {
        writeLong(paramArrayOfLong[i]);
      }
    }
    writeInt(-1);
  }
  
  public void writeLongArray(long[] paramArrayOfLong, int paramInt)
  {
    setOutputField(paramInt);
    writeLongArray(paramArrayOfLong);
  }
  
  public <K, V> void writeMap(Map<K, V> paramMap, int paramInt)
  {
    setOutputField(paramInt);
    if (paramMap == null)
    {
      writeInt(-1);
      return;
    }
    paramInt = paramMap.size();
    writeInt(paramInt);
    if (paramInt == 0) {
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localArrayList1.add(localEntry.getKey());
      localArrayList2.add(localEntry.getValue());
    }
    writeCollection(localArrayList1);
    writeCollection(localArrayList2);
  }
  
  protected void writeNoException()
  {
    writeInt(0);
  }
  
  protected abstract void writeParcelable(Parcelable paramParcelable);
  
  public void writeParcelable(Parcelable paramParcelable, int paramInt)
  {
    setOutputField(paramInt);
    writeParcelable(paramParcelable);
  }
  
  public void writeSerializable(Serializable paramSerializable, int paramInt)
  {
    setOutputField(paramInt);
    writeSerializable(paramSerializable);
  }
  
  public <T> void writeSet(Set<T> paramSet, int paramInt)
  {
    writeCollection(paramSet, paramInt);
  }
  
  public void writeSize(Size paramSize, int paramInt)
  {
    setOutputField(paramInt);
    boolean bool;
    if (paramSize != null) {
      bool = true;
    } else {
      bool = false;
    }
    writeBoolean(bool);
    if (paramSize != null)
    {
      writeInt(paramSize.getWidth());
      writeInt(paramSize.getHeight());
    }
  }
  
  public void writeSizeF(SizeF paramSizeF, int paramInt)
  {
    setOutputField(paramInt);
    boolean bool;
    if (paramSizeF != null) {
      bool = true;
    } else {
      bool = false;
    }
    writeBoolean(bool);
    if (paramSizeF != null)
    {
      writeFloat(paramSizeF.getWidth());
      writeFloat(paramSizeF.getHeight());
    }
  }
  
  public void writeSparseBooleanArray(SparseBooleanArray paramSparseBooleanArray, int paramInt)
  {
    setOutputField(paramInt);
    if (paramSparseBooleanArray == null)
    {
      writeInt(-1);
      return;
    }
    int i = paramSparseBooleanArray.size();
    writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      writeInt(paramSparseBooleanArray.keyAt(paramInt));
      writeBoolean(paramSparseBooleanArray.valueAt(paramInt));
    }
  }
  
  protected abstract void writeString(String paramString);
  
  public void writeString(String paramString, int paramInt)
  {
    setOutputField(paramInt);
    writeString(paramString);
  }
  
  protected abstract void writeStrongBinder(IBinder paramIBinder);
  
  public void writeStrongBinder(IBinder paramIBinder, int paramInt)
  {
    setOutputField(paramInt);
    writeStrongBinder(paramIBinder);
  }
  
  protected abstract void writeStrongInterface(IInterface paramIInterface);
  
  public void writeStrongInterface(IInterface paramIInterface, int paramInt)
  {
    setOutputField(paramInt);
    writeStrongInterface(paramIInterface);
  }
  
  protected <T extends VersionedParcelable> void writeToParcel(T paramT, VersionedParcel paramVersionedParcel)
  {
    try
    {
      getWriteMethod(paramT.getClass()).invoke(null, new Object[] { paramT, paramVersionedParcel });
      return;
    }
    catch (ClassNotFoundException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramT);
    }
    catch (NoSuchMethodException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramT);
    }
    catch (InvocationTargetException paramT)
    {
      if ((paramT.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramT.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramT);
    }
    catch (IllegalAccessException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramT);
    }
  }
  
  protected void writeVersionedParcelable(VersionedParcelable paramVersionedParcelable)
  {
    if (paramVersionedParcelable == null)
    {
      writeString(null);
      return;
    }
    writeVersionedParcelableCreator(paramVersionedParcelable);
    VersionedParcel localVersionedParcel = createSubParcel();
    writeToParcel(paramVersionedParcelable, localVersionedParcel);
    localVersionedParcel.closeField();
  }
  
  public void writeVersionedParcelable(VersionedParcelable paramVersionedParcelable, int paramInt)
  {
    setOutputField(paramInt);
    writeVersionedParcelable(paramVersionedParcelable);
  }
  
  public static class ParcelException
    extends RuntimeException
  {
    public ParcelException(Throwable paramThrowable)
    {
      super();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\versionedparcelable\VersionedParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */