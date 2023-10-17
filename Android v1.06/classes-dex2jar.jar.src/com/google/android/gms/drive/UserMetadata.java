package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class UserMetadata
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<UserMetadata> CREATOR = new zzt();
  private final String zzbo;
  private final String zzbp;
  private final String zzbq;
  private final boolean zzbr;
  private final String zzbs;
  
  public UserMetadata(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.zzbo = paramString1;
    this.zzbp = paramString2;
    this.zzbq = paramString3;
    this.zzbr = paramBoolean;
    this.zzbs = paramString4;
  }
  
  public String toString()
  {
    return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] { this.zzbo, this.zzbp, this.zzbq, Boolean.valueOf(this.zzbr), this.zzbs });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzbo, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzbp, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzbq, false);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzbr);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzbs, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\UserMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */