package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class TokenContents
{
  private final byte[] mContents;
  private List<byte[]> mFingerprints;
  private String mPackageName;
  
  private TokenContents(byte[] paramArrayOfByte)
  {
    this.mContents = paramArrayOfByte;
  }
  
  private TokenContents(byte[] paramArrayOfByte, String paramString, List<byte[]> paramList)
  {
    this.mContents = paramArrayOfByte;
    this.mPackageName = paramString;
    this.mFingerprints = new ArrayList(paramList.size());
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramArrayOfByte = (byte[])paramString.next();
      this.mFingerprints.add(Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length));
    }
  }
  
  private static int compareByteArrays(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == paramArrayOfByte2) {
      return 0;
    }
    if (paramArrayOfByte1 == null) {
      return -1;
    }
    if (paramArrayOfByte2 == null) {
      return 1;
    }
    int i = 0;
    int j;
    if (i < Math.min(paramArrayOfByte1.length, paramArrayOfByte2.length)) {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        j = paramArrayOfByte1[i];
      }
    }
    for (i = paramArrayOfByte2[i];; i = paramArrayOfByte2.length)
    {
      return j - i;
      i++;
      break;
      if (paramArrayOfByte1.length == paramArrayOfByte2.length) {
        break label75;
      }
      j = paramArrayOfByte1.length;
    }
    label75:
    return 0;
  }
  
  static TokenContents create(String paramString, List<byte[]> paramList)
    throws IOException
  {
    return new TokenContents(createToken(paramString, paramList), paramString, paramList);
  }
  
  private static byte[] createToken(String paramString, List<byte[]> paramList)
    throws IOException
  {
    Collections.sort(paramList, TokenContents..ExternalSyntheticLambda0.INSTANCE);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeUTF(paramString);
    localDataOutputStream.writeInt(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramString = (byte[])paramList.next();
      localDataOutputStream.writeInt(paramString.length);
      localDataOutputStream.write(paramString);
    }
    localDataOutputStream.flush();
    return localByteArrayOutputStream.toByteArray();
  }
  
  static TokenContents deserialize(byte[] paramArrayOfByte)
  {
    return new TokenContents(paramArrayOfByte);
  }
  
  private void parseIfNeeded()
    throws IOException
  {
    if (this.mPackageName != null) {
      return;
    }
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
    this.mPackageName = localDataInputStream.readUTF();
    int j = localDataInputStream.readInt();
    this.mFingerprints = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      int k = localDataInputStream.readInt();
      byte[] arrayOfByte = new byte[k];
      if (localDataInputStream.read(arrayOfByte) == k)
      {
        this.mFingerprints.add(arrayOfByte);
        i++;
      }
      else
      {
        throw new IllegalStateException("Could not read fingerprint");
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (TokenContents)paramObject;
      return Arrays.equals(this.mContents, ((TokenContents)paramObject).mContents);
    }
    return false;
  }
  
  public byte[] getFingerprint(int paramInt)
    throws IOException
  {
    parseIfNeeded();
    List localList = this.mFingerprints;
    if (localList != null) {
      return Arrays.copyOf((byte[])localList.get(paramInt), ((byte[])this.mFingerprints.get(paramInt)).length);
    }
    throw new IllegalStateException();
  }
  
  public int getFingerprintCount()
    throws IOException
  {
    parseIfNeeded();
    List localList = this.mFingerprints;
    if (localList != null) {
      return localList.size();
    }
    throw new IllegalStateException();
  }
  
  public String getPackageName()
    throws IOException
  {
    parseIfNeeded();
    String str = this.mPackageName;
    if (str != null) {
      return str;
    }
    throw new IllegalStateException();
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.mContents);
  }
  
  public byte[] serialize()
  {
    byte[] arrayOfByte = this.mContents;
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TokenContents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */