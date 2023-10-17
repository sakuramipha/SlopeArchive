package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.nearby.zzhj;
import java.util.Arrays;

public class Message
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Message> CREATOR = new zza();
  public static final int MAX_CONTENT_SIZE_BYTES = 102400;
  public static final int MAX_TYPE_LENGTH = 32;
  public static final String MESSAGE_NAMESPACE_RESERVED = "__reserved_namespace";
  public static final String MESSAGE_TYPE_AUDIO_BYTES = "__audio_bytes";
  public static final String MESSAGE_TYPE_EDDYSTONE_UID = "__eddystone_uid";
  public static final String MESSAGE_TYPE_I_BEACON_ID = "__i_beacon_id";
  private static final zzhj[] zzc = { zzhj.zza };
  final int zza;
  @Deprecated
  final zzhj[] zzb;
  private final byte[] zzd;
  private final String zze;
  private final String zzf;
  private final long zzg;
  
  Message(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2, zzhj[] paramArrayOfzzhj, long paramLong)
  {
    this.zza = paramInt;
    this.zze = ((String)Preconditions.checkNotNull(paramString2));
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    this.zzf = str;
    this.zzg = paramLong;
    Preconditions.checkNotNull(paramArrayOfByte);
    paramInt = paramArrayOfByte.length;
    boolean bool;
    if (paramInt <= 102400) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(102400) });
    this.zzd = paramArrayOfByte;
    if (paramArrayOfzzhj != null)
    {
      paramArrayOfByte = paramArrayOfzzhj;
      if (paramArrayOfzzhj.length != 0) {}
    }
    else
    {
      paramArrayOfByte = zzc;
    }
    this.zzb = paramArrayOfByte;
    if (paramString2.length() <= 32) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", new Object[] { Integer.valueOf(paramString2.length()), Integer.valueOf(32) });
  }
  
  public Message(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, "", "", zzc, 0L);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString)
  {
    this(paramArrayOfByte, "", paramString, zzc, 0L);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    this(paramArrayOfByte, "__reserved_namespace", "__audio_bytes", zzc, 0L);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2, zzhj[] paramArrayOfzzhj, long paramLong)
  {
    this(2, paramArrayOfByte, paramString1, paramString2, paramArrayOfzzhj, 0L);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Message)) {
      return false;
    }
    paramObject = (Message)paramObject;
    return (TextUtils.equals(this.zzf, ((Message)paramObject).zzf)) && (TextUtils.equals(this.zze, ((Message)paramObject).zze)) && (Arrays.equals(this.zzd, ((Message)paramObject).zzd)) && (this.zzg == ((Message)paramObject).zzg);
  }
  
  public byte[] getContent()
  {
    return this.zzd;
  }
  
  public String getNamespace()
  {
    return this.zzf;
  }
  
  public String getType()
  {
    return this.zze;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzf, this.zze, Integer.valueOf(Arrays.hashCode(this.zzd)), Long.valueOf(this.zzg) });
  }
  
  public String toString()
  {
    String str2 = this.zzf;
    String str1 = this.zze;
    Object localObject = this.zzd;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.length;
    }
    localObject = new StringBuilder(String.valueOf(str2).length() + 59 + String.valueOf(str1).length());
    ((StringBuilder)localObject).append("Message{namespace='");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append("', type='");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("', content=[");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" bytes]}");
    return ((StringBuilder)localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeByteArray(paramParcel, 1, getContent(), false);
    SafeParcelWriter.writeString(paramParcel, 2, getType(), false);
    SafeParcelWriter.writeString(paramParcel, 3, getNamespace(), false);
    SafeParcelWriter.writeTypedArray(paramParcel, 4, this.zzb, paramInt, false);
    SafeParcelWriter.writeLong(paramParcel, 5, this.zzg);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final boolean zza(String paramString)
  {
    return ("__reserved_namespace".equals(getNamespace())) && (paramString.equals(getType()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\Message.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */