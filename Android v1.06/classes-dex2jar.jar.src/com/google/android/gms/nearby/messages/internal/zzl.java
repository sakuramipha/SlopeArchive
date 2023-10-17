package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzl
  extends zzc
{
  public zzl(UUID paramUUID, Short paramShort1, Short paramShort2)
  {
    super(paramUUID);
  }
  
  public zzl(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  private static byte[] zzh(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (i != 16)
    {
      bool1 = bool2;
      if (i != 18) {
        if (i == 20) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
    }
    Preconditions.checkArgument(bool1, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
    return paramArrayOfByte;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(zze());
    String str2 = String.valueOf(zzf());
    String str3 = String.valueOf(zzg());
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 47 + String.valueOf(str2).length() + String.valueOf(str3).length());
    localStringBuilder.append("IBeaconIdPrefix{proximityUuid=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", major=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", minor=");
    localStringBuilder.append(str3);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final UUID zze()
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(zzc());
    return new UUID(localByteBuffer.getLong(), localByteBuffer.getLong());
  }
  
  public final Short zzf()
  {
    byte[] arrayOfByte = zzc();
    if (arrayOfByte.length >= 18) {
      return Short.valueOf(ByteBuffer.wrap(arrayOfByte).getShort(16));
    }
    return null;
  }
  
  public final Short zzg()
  {
    byte[] arrayOfByte = zzc();
    if (arrayOfByte.length == 20) {
      return Short.valueOf(ByteBuffer.wrap(arrayOfByte).getShort(18));
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */