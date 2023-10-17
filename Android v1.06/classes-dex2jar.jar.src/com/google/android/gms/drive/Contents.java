package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Contents> CREATOR = new zzc();
  private final int mode;
  private final ParcelFileDescriptor zzi;
  final int zzj;
  private final DriveId zzk;
  private final boolean zzl;
  private final String zzm;
  
  public Contents(ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, DriveId paramDriveId, boolean paramBoolean, String paramString)
  {
    this.zzi = paramParcelFileDescriptor;
    this.zzj = paramInt1;
    this.mode = paramInt2;
    this.zzk = paramDriveId;
    this.zzl = paramBoolean;
    this.zzm = paramString;
  }
  
  public final DriveId getDriveId()
  {
    return this.zzk;
  }
  
  public final InputStream getInputStream()
  {
    return new FileInputStream(this.zzi.getFileDescriptor());
  }
  
  public final int getMode()
  {
    return this.mode;
  }
  
  public final OutputStream getOutputStream()
  {
    return new FileOutputStream(this.zzi.getFileDescriptor());
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    return this.zzi;
  }
  
  public final int getRequestId()
  {
    return this.zzj;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzi, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzj);
    SafeParcelWriter.writeInt(paramParcel, 4, this.mode);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzk, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzl);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzm, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final boolean zzb()
  {
    return this.zzl;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\Contents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */