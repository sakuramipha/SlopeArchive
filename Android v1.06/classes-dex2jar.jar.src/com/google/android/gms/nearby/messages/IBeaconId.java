package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;

public class IBeaconId
{
  public static final int LENGTH = 20;
  private final zzl zza;
  
  public IBeaconId(UUID paramUUID, short paramShort1, short paramShort2)
  {
    this.zza = new zzl(paramUUID, Short.valueOf(paramShort1), Short.valueOf(paramShort2));
  }
  
  public IBeaconId(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 20) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
    this.zza = new zzl(paramArrayOfByte);
  }
  
  public static IBeaconId from(Message paramMessage)
  {
    boolean bool = paramMessage.zza("__i_beacon_id");
    String str = paramMessage.getType();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 55);
    localStringBuilder.append("Message type '");
    localStringBuilder.append(str);
    localStringBuilder.append("' is not Message.MESSAGE_TYPE_I_BEACON_ID");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    return new IBeaconId(paramMessage.getContent());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof IBeaconId)) {
      return false;
    }
    paramObject = (IBeaconId)paramObject;
    return Objects.equal(this.zza, ((IBeaconId)paramObject).zza);
  }
  
  public short getMajor()
  {
    return this.zza.zzf().shortValue();
  }
  
  public short getMinor()
  {
    return this.zza.zzg().shortValue();
  }
  
  public UUID getProximityUuid()
  {
    return this.zza.zze();
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza });
  }
  
  public String toString()
  {
    String str = String.valueOf(getProximityUuid());
    int i = getMajor();
    int j = getMinor();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 53);
    localStringBuilder.append("IBeaconId{proximityUuid=");
    localStringBuilder.append(str);
    localStringBuilder.append(", major=");
    localStringBuilder.append(i);
    localStringBuilder.append(", minor=");
    localStringBuilder.append(j);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\IBeaconId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */