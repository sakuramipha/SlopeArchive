package com.google.android.gms.internal.drive;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.drive.DriveId;

public final class zzf
{
  private final int status;
  private final int zzct;
  private final DriveId zzk;
  
  public zzf(zzh paramzzh)
  {
    this.zzk = paramzzh.zzk;
    this.zzct = paramzzh.zzct;
    this.status = paramzzh.status;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzf)paramObject;
      if ((Objects.equal(this.zzk, ((zzf)paramObject).zzk)) && (this.zzct == ((zzf)paramObject).zzct) && (this.status == ((zzf)paramObject).status)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzk, Integer.valueOf(this.zzct), Integer.valueOf(this.status) });
  }
  
  public final String toString()
  {
    return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[] { Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */