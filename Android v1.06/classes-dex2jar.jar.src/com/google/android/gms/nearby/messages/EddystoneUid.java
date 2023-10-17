package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzc;
import com.google.android.gms.nearby.messages.internal.zzg;
import java.util.Arrays;

public class EddystoneUid
{
  public static final int INSTANCE_LENGTH = 6;
  public static final int LENGTH = 16;
  public static final int NAMESPACE_LENGTH = 10;
  private final zzg zza;
  
  public EddystoneUid(String paramString)
  {
    this(zzc.zzb(paramString));
  }
  
  public EddystoneUid(String paramString1, String paramString2)
  {
    this.zza = new zzg(paramString1, paramString2);
  }
  
  public EddystoneUid(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 16) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Bytes must be a namespace plus instance (16 bytes).");
    this.zza = new zzg(paramArrayOfByte);
  }
  
  public static EddystoneUid from(Message paramMessage)
  {
    boolean bool = paramMessage.zza("__eddystone_uid");
    String str = paramMessage.getType();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 58);
    localStringBuilder.append("Message type '");
    localStringBuilder.append(str);
    localStringBuilder.append("' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    return new EddystoneUid(paramMessage.getContent());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof EddystoneUid)) {
      return false;
    }
    paramObject = (EddystoneUid)paramObject;
    return Objects.equal(this.zza, ((EddystoneUid)paramObject).zza);
  }
  
  public String getHex()
  {
    return this.zza.zzd();
  }
  
  public String getInstance()
  {
    byte[] arrayOfByte = this.zza.zzc();
    if (arrayOfByte.length < 16) {
      return null;
    }
    return zzc.zza(Arrays.copyOfRange(arrayOfByte, 10, 16));
  }
  
  public String getNamespace()
  {
    return zzc.zza(Arrays.copyOfRange(this.zza.zzc(), 0, 10));
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza });
  }
  
  public String toString()
  {
    String str = getHex();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 17);
    localStringBuilder.append("EddystoneUid{id=");
    localStringBuilder.append(str);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\EddystoneUid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */