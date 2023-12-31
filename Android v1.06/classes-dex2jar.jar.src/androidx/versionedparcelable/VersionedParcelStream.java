package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

class VersionedParcelStream
  extends VersionedParcel
{
  private static final int TYPE_BOOLEAN = 5;
  private static final int TYPE_BOOLEAN_ARRAY = 6;
  private static final int TYPE_DOUBLE = 7;
  private static final int TYPE_DOUBLE_ARRAY = 8;
  private static final int TYPE_FLOAT = 13;
  private static final int TYPE_FLOAT_ARRAY = 14;
  private static final int TYPE_INT = 9;
  private static final int TYPE_INT_ARRAY = 10;
  private static final int TYPE_LONG = 11;
  private static final int TYPE_LONG_ARRAY = 12;
  private static final int TYPE_NULL = 0;
  private static final int TYPE_STRING = 3;
  private static final int TYPE_STRING_ARRAY = 4;
  private static final int TYPE_SUB_BUNDLE = 1;
  private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
  private static final Charset UTF_16 = Charset.forName("UTF-16");
  int mCount = 0;
  private DataInputStream mCurrentInput;
  private DataOutputStream mCurrentOutput;
  private FieldBuffer mFieldBuffer;
  private int mFieldId = -1;
  int mFieldSize = -1;
  private boolean mIgnoreParcelables;
  private final DataInputStream mMasterInput;
  private final DataOutputStream mMasterOutput;
  
  public VersionedParcelStream(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    this(paramInputStream, paramOutputStream, new ArrayMap(), new ArrayMap(), new ArrayMap());
  }
  
  private VersionedParcelStream(InputStream paramInputStream, OutputStream paramOutputStream, ArrayMap<String, Method> paramArrayMap1, ArrayMap<String, Method> paramArrayMap2, ArrayMap<String, Class> paramArrayMap)
  {
    super(paramArrayMap1, paramArrayMap2, paramArrayMap);
    paramArrayMap1 = null;
    if (paramInputStream != null) {
      paramInputStream = new DataInputStream(new FilterInputStream(paramInputStream)
      {
        public int read()
          throws IOException
        {
          if ((VersionedParcelStream.this.mFieldSize != -1) && (VersionedParcelStream.this.mCount >= VersionedParcelStream.this.mFieldSize)) {
            throw new IOException();
          }
          int i = super.read();
          VersionedParcelStream localVersionedParcelStream = VersionedParcelStream.this;
          localVersionedParcelStream.mCount += 1;
          return i;
        }
        
        public int read(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2)
          throws IOException
        {
          if ((VersionedParcelStream.this.mFieldSize != -1) && (VersionedParcelStream.this.mCount >= VersionedParcelStream.this.mFieldSize)) {
            throw new IOException();
          }
          paramAnonymousInt1 = super.read(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2);
          if (paramAnonymousInt1 > 0)
          {
            paramAnonymousArrayOfByte = VersionedParcelStream.this;
            paramAnonymousArrayOfByte.mCount += paramAnonymousInt1;
          }
          return paramAnonymousInt1;
        }
        
        public long skip(long paramAnonymousLong)
          throws IOException
        {
          if ((VersionedParcelStream.this.mFieldSize != -1) && (VersionedParcelStream.this.mCount >= VersionedParcelStream.this.mFieldSize)) {
            throw new IOException();
          }
          paramAnonymousLong = super.skip(paramAnonymousLong);
          if (paramAnonymousLong > 0L)
          {
            VersionedParcelStream localVersionedParcelStream = VersionedParcelStream.this;
            localVersionedParcelStream.mCount += (int)paramAnonymousLong;
          }
          return paramAnonymousLong;
        }
      });
    } else {
      paramInputStream = null;
    }
    this.mMasterInput = paramInputStream;
    if (paramOutputStream != null) {
      paramArrayMap1 = new DataOutputStream(paramOutputStream);
    }
    this.mMasterOutput = paramArrayMap1;
    this.mCurrentInput = paramInputStream;
    this.mCurrentOutput = paramArrayMap1;
  }
  
  private void readObject(int paramInt, String paramString, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      paramString = new StringBuilder();
      paramString.append("Unknown type ");
      paramString.append(paramInt);
      throw new RuntimeException(paramString.toString());
    case 14: 
      paramBundle.putFloatArray(paramString, readFloatArray());
      break;
    case 13: 
      paramBundle.putFloat(paramString, readFloat());
      break;
    case 12: 
      paramBundle.putLongArray(paramString, readLongArray());
      break;
    case 11: 
      paramBundle.putLong(paramString, readLong());
      break;
    case 10: 
      paramBundle.putIntArray(paramString, readIntArray());
      break;
    case 9: 
      paramBundle.putInt(paramString, readInt());
      break;
    case 8: 
      paramBundle.putDoubleArray(paramString, readDoubleArray());
      break;
    case 7: 
      paramBundle.putDouble(paramString, readDouble());
      break;
    case 6: 
      paramBundle.putBooleanArray(paramString, readBooleanArray());
      break;
    case 5: 
      paramBundle.putBoolean(paramString, readBoolean());
      break;
    case 4: 
      paramBundle.putStringArray(paramString, (String[])readArray(new String[0]));
      break;
    case 3: 
      paramBundle.putString(paramString, readString());
      break;
    case 2: 
      paramBundle.putBundle(paramString, readBundle());
      break;
    case 1: 
      paramBundle.putBundle(paramString, readBundle());
      break;
    case 0: 
      paramBundle.putParcelable(paramString, null);
    }
  }
  
  private void writeObject(Object paramObject)
  {
    if (paramObject == null)
    {
      writeInt(0);
    }
    else if ((paramObject instanceof Bundle))
    {
      writeInt(1);
      writeBundle((Bundle)paramObject);
    }
    else if ((paramObject instanceof String))
    {
      writeInt(3);
      writeString((String)paramObject);
    }
    else if ((paramObject instanceof String[]))
    {
      writeInt(4);
      writeArray((String[])paramObject);
    }
    else if ((paramObject instanceof Boolean))
    {
      writeInt(5);
      writeBoolean(((Boolean)paramObject).booleanValue());
    }
    else if ((paramObject instanceof boolean[]))
    {
      writeInt(6);
      writeBooleanArray((boolean[])paramObject);
    }
    else if ((paramObject instanceof Double))
    {
      writeInt(7);
      writeDouble(((Double)paramObject).doubleValue());
    }
    else if ((paramObject instanceof double[]))
    {
      writeInt(8);
      writeDoubleArray((double[])paramObject);
    }
    else if ((paramObject instanceof Integer))
    {
      writeInt(9);
      writeInt(((Integer)paramObject).intValue());
    }
    else if ((paramObject instanceof int[]))
    {
      writeInt(10);
      writeIntArray((int[])paramObject);
    }
    else if ((paramObject instanceof Long))
    {
      writeInt(11);
      writeLong(((Long)paramObject).longValue());
    }
    else if ((paramObject instanceof long[]))
    {
      writeInt(12);
      writeLongArray((long[])paramObject);
    }
    else if ((paramObject instanceof Float))
    {
      writeInt(13);
      writeFloat(((Float)paramObject).floatValue());
    }
    else
    {
      if (!(paramObject instanceof float[])) {
        break label333;
      }
      writeInt(14);
      writeFloatArray((float[])paramObject);
    }
    return;
    label333:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported type ");
    localStringBuilder.append(paramObject.getClass());
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void closeField()
  {
    FieldBuffer localFieldBuffer = this.mFieldBuffer;
    if (localFieldBuffer != null) {
      try
      {
        if (localFieldBuffer.mOutput.size() != 0) {
          this.mFieldBuffer.flushField();
        }
        this.mFieldBuffer = null;
      }
      catch (IOException localIOException)
      {
        throw new VersionedParcel.ParcelException(localIOException);
      }
    }
  }
  
  protected VersionedParcel createSubParcel()
  {
    return new VersionedParcelStream(this.mCurrentInput, this.mCurrentOutput, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
  }
  
  public boolean isStream()
  {
    return true;
  }
  
  public boolean readBoolean()
  {
    try
    {
      boolean bool = this.mCurrentInput.readBoolean();
      return bool;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public Bundle readBundle()
  {
    int j = readInt();
    if (j < 0) {
      return null;
    }
    Bundle localBundle = new Bundle();
    for (int i = 0; i < j; i++)
    {
      String str = readString();
      readObject(readInt(), str, localBundle);
    }
    return localBundle;
  }
  
  public byte[] readByteArray()
  {
    try
    {
      int i = this.mCurrentInput.readInt();
      if (i > 0)
      {
        byte[] arrayOfByte = new byte[i];
        this.mCurrentInput.readFully(arrayOfByte);
        return arrayOfByte;
      }
      return null;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  protected CharSequence readCharSequence()
  {
    return null;
  }
  
  public double readDouble()
  {
    try
    {
      double d = this.mCurrentInput.readDouble();
      return d;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public boolean readField(int paramInt)
  {
    try
    {
      for (;;)
      {
        int i = this.mFieldId;
        if (i == paramInt) {
          return true;
        }
        if (String.valueOf(i).compareTo(String.valueOf(paramInt)) > 0) {
          return false;
        }
        int j = this.mCount;
        i = this.mFieldSize;
        if (j < i) {
          this.mMasterInput.skip(i - j);
        }
        this.mFieldSize = -1;
        int k = this.mMasterInput.readInt();
        this.mCount = 0;
        j = k & 0xFFFF;
        i = j;
        if (j == 65535) {
          i = this.mMasterInput.readInt();
        }
        this.mFieldId = (k >> 16 & 0xFFFF);
        this.mFieldSize = i;
      }
      return false;
    }
    catch (IOException localIOException) {}
  }
  
  public float readFloat()
  {
    try
    {
      float f = this.mCurrentInput.readFloat();
      return f;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public int readInt()
  {
    try
    {
      int i = this.mCurrentInput.readInt();
      return i;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public long readLong()
  {
    try
    {
      long l = this.mCurrentInput.readLong();
      return l;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public <T extends Parcelable> T readParcelable()
  {
    return null;
  }
  
  public String readString()
  {
    try
    {
      int i = this.mCurrentInput.readInt();
      if (i > 0)
      {
        Object localObject = new byte[i];
        this.mCurrentInput.readFully((byte[])localObject);
        localObject = new String((byte[])localObject, UTF_16);
        return (String)localObject;
      }
      return null;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public IBinder readStrongBinder()
  {
    return null;
  }
  
  public void setOutputField(int paramInt)
  {
    closeField();
    FieldBuffer localFieldBuffer = new FieldBuffer(paramInt, this.mMasterOutput);
    this.mFieldBuffer = localFieldBuffer;
    this.mCurrentOutput = localFieldBuffer.mDataStream;
  }
  
  public void setSerializationFlags(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.mIgnoreParcelables = paramBoolean2;
      return;
    }
    throw new RuntimeException("Serialization of this object is not allowed");
  }
  
  public void writeBoolean(boolean paramBoolean)
  {
    try
    {
      this.mCurrentOutput.writeBoolean(paramBoolean);
      return;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public void writeBundle(Bundle paramBundle)
  {
    if (paramBundle != null) {}
    try
    {
      Object localObject = paramBundle.keySet();
      this.mCurrentOutput.writeInt(((Set)localObject).size());
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        writeString(str);
        writeObject(paramBundle.get(str));
        continue;
        this.mCurrentOutput.writeInt(-1);
      }
      return;
    }
    catch (IOException paramBundle)
    {
      throw new VersionedParcel.ParcelException(paramBundle);
    }
  }
  
  public void writeByteArray(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    try
    {
      this.mCurrentOutput.writeInt(paramArrayOfByte.length);
      this.mCurrentOutput.write(paramArrayOfByte);
      break label32;
      this.mCurrentOutput.writeInt(-1);
      label32:
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new VersionedParcel.ParcelException(paramArrayOfByte);
    }
  }
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null) {}
    try
    {
      this.mCurrentOutput.writeInt(paramInt2);
      this.mCurrentOutput.write(paramArrayOfByte, paramInt1, paramInt2);
      break label33;
      this.mCurrentOutput.writeInt(-1);
      label33:
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new VersionedParcel.ParcelException(paramArrayOfByte);
    }
  }
  
  protected void writeCharSequence(CharSequence paramCharSequence)
  {
    if (this.mIgnoreParcelables) {
      return;
    }
    throw new RuntimeException("CharSequence cannot be written to an OutputStream");
  }
  
  public void writeDouble(double paramDouble)
  {
    try
    {
      this.mCurrentOutput.writeDouble(paramDouble);
      return;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public void writeFloat(float paramFloat)
  {
    try
    {
      this.mCurrentOutput.writeFloat(paramFloat);
      return;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public void writeInt(int paramInt)
  {
    try
    {
      this.mCurrentOutput.writeInt(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public void writeLong(long paramLong)
  {
    try
    {
      this.mCurrentOutput.writeLong(paramLong);
      return;
    }
    catch (IOException localIOException)
    {
      throw new VersionedParcel.ParcelException(localIOException);
    }
  }
  
  public void writeParcelable(Parcelable paramParcelable)
  {
    if (this.mIgnoreParcelables) {
      return;
    }
    throw new RuntimeException("Parcelables cannot be written to an OutputStream");
  }
  
  public void writeString(String paramString)
  {
    if (paramString != null) {}
    try
    {
      paramString = paramString.getBytes(UTF_16);
      this.mCurrentOutput.writeInt(paramString.length);
      this.mCurrentOutput.write(paramString);
      break label40;
      this.mCurrentOutput.writeInt(-1);
      label40:
      return;
    }
    catch (IOException paramString)
    {
      throw new VersionedParcel.ParcelException(paramString);
    }
  }
  
  public void writeStrongBinder(IBinder paramIBinder)
  {
    if (this.mIgnoreParcelables) {
      return;
    }
    throw new RuntimeException("Binders cannot be written to an OutputStream");
  }
  
  public void writeStrongInterface(IInterface paramIInterface)
  {
    if (this.mIgnoreParcelables) {
      return;
    }
    throw new RuntimeException("Binders cannot be written to an OutputStream");
  }
  
  private static class FieldBuffer
  {
    final DataOutputStream mDataStream;
    private final int mFieldId;
    final ByteArrayOutputStream mOutput;
    private final DataOutputStream mTarget;
    
    FieldBuffer(int paramInt, DataOutputStream paramDataOutputStream)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      this.mOutput = localByteArrayOutputStream;
      this.mDataStream = new DataOutputStream(localByteArrayOutputStream);
      this.mFieldId = paramInt;
      this.mTarget = paramDataOutputStream;
    }
    
    void flushField()
      throws IOException
    {
      this.mDataStream.flush();
      int j = this.mOutput.size();
      int k = this.mFieldId;
      int i;
      if (j >= 65535) {
        i = 65535;
      } else {
        i = j;
      }
      this.mTarget.writeInt(k << 16 | i);
      if (j >= 65535) {
        this.mTarget.writeInt(j);
      }
      this.mOutput.writeTo(this.mTarget);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\versionedparcelable\VersionedParcelStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */