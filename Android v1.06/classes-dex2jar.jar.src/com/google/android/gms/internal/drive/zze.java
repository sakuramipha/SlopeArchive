package com.google.android.gms.internal.drive;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.drive.events.zzk;
import com.google.android.gms.drive.events.zzm;
import java.util.Locale;

public final class zze
  implements zzk
{
  private final zzm zzcv;
  private final long zzcw;
  private final long zzcx;
  
  public zze(zzh paramzzh)
  {
    this.zzcv = new zzf(paramzzh);
    this.zzcw = paramzzh.zzcw;
    this.zzcx = paramzzh.zzcx;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zze)paramObject;
      if ((Objects.equal(this.zzcv, ((zze)paramObject).zzcv)) && (this.zzcw == ((zze)paramObject).zzcw) && (this.zzcx == ((zze)paramObject).zzcx)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Long.valueOf(this.zzcx), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx) });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[] { this.zzcv.toString(), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */