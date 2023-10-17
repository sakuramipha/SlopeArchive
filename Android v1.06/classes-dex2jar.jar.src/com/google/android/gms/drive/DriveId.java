package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.drive.zzbn;
import com.google.android.gms.internal.drive.zzbs;
import com.google.android.gms.internal.drive.zzdp;
import com.google.android.gms.internal.drive.zzfb;
import com.google.android.gms.internal.drive.zzfb.zza;
import com.google.android.gms.internal.drive.zzfd;
import com.google.android.gms.internal.drive.zzfd.zza;
import com.google.android.gms.internal.drive.zzit;
import com.google.android.gms.internal.drive.zzjx;
import com.google.android.gms.internal.drive.zzkk.zza;
import com.google.android.gms.internal.drive.zzkq;

public class DriveId
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<DriveId> CREATOR = new zzk();
  public static final int RESOURCE_TYPE_FILE = 0;
  public static final int RESOURCE_TYPE_FOLDER = 1;
  public static final int RESOURCE_TYPE_UNKNOWN = -1;
  private final String zzad;
  private final long zzae;
  private final int zzaf;
  private volatile String zzag = null;
  private final long zzf;
  private volatile String zzh = null;
  
  public DriveId(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    this.zzad = paramString;
    boolean bool1 = "".equals(paramString);
    boolean bool2 = true;
    Preconditions.checkArgument(bool1 ^ true);
    bool1 = bool2;
    if (paramString == null) {
      if (paramLong1 != -1L) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    Preconditions.checkArgument(bool1);
    this.zzae = paramLong1;
    this.zzf = paramLong2;
    this.zzaf = paramInt;
  }
  
  public static DriveId decodeFromString(String paramString)
  {
    boolean bool = paramString.startsWith("DriveId:");
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "Invalid DriveId: ".concat(str);
    } else {
      str = new String("Invalid DriveId: ");
    }
    Preconditions.checkArgument(bool, str);
    return zza(Base64.decode(paramString.substring(8), 10));
  }
  
  public static DriveId zza(String paramString)
  {
    Preconditions.checkNotNull(paramString);
    return new DriveId(paramString, -1L, -1L, -1);
  }
  
  private static DriveId zza(byte[] paramArrayOfByte)
  {
    try
    {
      zzfb localzzfb = zzfb.zza(paramArrayOfByte, zzjx.zzcj());
      if ("".equals(localzzfb.getResourceId())) {
        paramArrayOfByte = null;
      } else {
        paramArrayOfByte = localzzfb.getResourceId();
      }
      return new DriveId(paramArrayOfByte, localzzfb.zzal(), localzzfb.zzam(), localzzfb.getResourceType());
    }
    catch (zzkq paramArrayOfByte)
    {
      throw new IllegalArgumentException();
    }
  }
  
  public DriveFile asDriveFile()
  {
    if (this.zzaf != 1) {
      return new zzbn(this);
    }
    throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
  }
  
  public DriveFolder asDriveFolder()
  {
    if (this.zzaf != 0) {
      return new zzbs(this);
    }
    throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
  }
  
  public DriveResource asDriveResource()
  {
    int i = this.zzaf;
    if (i == 1) {
      return asDriveFolder();
    }
    if (i == 0) {
      return asDriveFile();
    }
    return new zzdp(this);
  }
  
  public final String encodeToString()
  {
    if (this.zzh == null)
    {
      zzfb.zza localzza = zzfb.zzan().zzm(1);
      String str2 = this.zzad;
      String str1 = str2;
      if (str2 == null) {
        str1 = "";
      }
      str1 = String.valueOf(Base64.encodeToString(((zzfb)localzza.zze(str1).zzg(this.zzae).zzh(this.zzf).zzn(this.zzaf).zzdf()).toByteArray(), 10));
      if (str1.length() != 0) {
        str1 = "DriveId:".concat(str1);
      } else {
        str1 = new String("DriveId:");
      }
      this.zzh = str1;
    }
    return this.zzh;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == DriveId.class))
    {
      Object localObject = (DriveId)paramObject;
      if (((DriveId)localObject).zzf != this.zzf) {
        return false;
      }
      long l = ((DriveId)localObject).zzae;
      if ((l == -1L) && (this.zzae == -1L)) {
        return ((DriveId)localObject).zzad.equals(this.zzad);
      }
      paramObject = this.zzad;
      if (paramObject != null)
      {
        localObject = ((DriveId)localObject).zzad;
        if (localObject != null) {
          return (l == this.zzae) && (((String)localObject).equals(paramObject));
        }
      }
      if (l == this.zzae) {
        return true;
      }
    }
    return false;
  }
  
  public String getResourceId()
  {
    return this.zzad;
  }
  
  public int getResourceType()
  {
    return this.zzaf;
  }
  
  public int hashCode()
  {
    if (this.zzae == -1L) {
      return this.zzad.hashCode();
    }
    String str1 = String.valueOf(String.valueOf(this.zzf));
    String str2 = String.valueOf(String.valueOf(this.zzae));
    if (str2.length() != 0) {
      str1 = str1.concat(str2);
    } else {
      str1 = new String(str1);
    }
    return str1.hashCode();
  }
  
  public final String toInvariantString()
  {
    if (this.zzag == null) {
      this.zzag = Base64.encodeToString(((zzfd)zzfd.zzap().zzi(this.zzae).zzj(this.zzf).zzdf()).toByteArray(), 10);
    }
    return this.zzag;
  }
  
  public String toString()
  {
    return encodeToString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzad, false);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzae);
    SafeParcelWriter.writeLong(paramParcel, 4, this.zzf);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzaf);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */