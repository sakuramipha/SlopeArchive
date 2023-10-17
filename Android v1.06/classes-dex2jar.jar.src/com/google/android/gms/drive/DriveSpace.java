package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;
import java.util.regex.Pattern;

public class DriveSpace
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<DriveSpace> CREATOR = new zzm();
  public static final DriveSpace zzah;
  public static final DriveSpace zzai;
  public static final DriveSpace zzaj;
  private static final Set<DriveSpace> zzak;
  private static final String zzal;
  private static final Pattern zzam = Pattern.compile("[A-Z0-9_]*");
  private final String name;
  
  static
  {
    Object localObject = new DriveSpace("DRIVE");
    zzah = (DriveSpace)localObject;
    DriveSpace localDriveSpace1 = new DriveSpace("APP_DATA_FOLDER");
    zzai = localDriveSpace1;
    DriveSpace localDriveSpace2 = new DriveSpace("PHOTOS");
    zzaj = localDriveSpace2;
    localObject = CollectionUtils.setOf(localObject, localDriveSpace1, localDriveSpace2);
    zzak = (Set)localObject;
    zzal = TextUtils.join(",", ((Set)localObject).toArray());
  }
  
  DriveSpace(String paramString)
  {
    this.name = ((String)Preconditions.checkNotNull(paramString));
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == DriveSpace.class)) {
      return this.name.equals(((DriveSpace)paramObject).name);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.name.hashCode() ^ 0x4A54C0DE;
  }
  
  public String toString()
  {
    return this.name;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.name, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\DriveSpace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */