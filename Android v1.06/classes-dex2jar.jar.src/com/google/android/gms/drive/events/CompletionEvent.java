package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.drive.zzeu;
import com.google.android.gms.internal.drive.zzev;
import com.google.android.gms.internal.drive.zzhs;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent
  extends AbstractSafeParcelable
  implements ResourceEvent
{
  public static final Parcelable.Creator<CompletionEvent> CREATOR = new zzg();
  public static final int STATUS_CANCELED = 3;
  public static final int STATUS_CONFLICT = 2;
  public static final int STATUS_FAILURE = 1;
  public static final int STATUS_SUCCESS = 0;
  private static final GmsLogger zzbz = new GmsLogger("CompletionEvent", "");
  private final int status;
  private final String zzca;
  private final ParcelFileDescriptor zzcb;
  private final ParcelFileDescriptor zzcc;
  private final MetadataBundle zzcd;
  private final List<String> zzce;
  private final IBinder zzcf;
  private boolean zzcg = false;
  private boolean zzch = false;
  private boolean zzci = false;
  private final DriveId zzk;
  
  CompletionEvent(DriveId paramDriveId, String paramString, ParcelFileDescriptor paramParcelFileDescriptor1, ParcelFileDescriptor paramParcelFileDescriptor2, MetadataBundle paramMetadataBundle, List<String> paramList, int paramInt, IBinder paramIBinder)
  {
    this.zzk = paramDriveId;
    this.zzca = paramString;
    this.zzcb = paramParcelFileDescriptor1;
    this.zzcc = paramParcelFileDescriptor2;
    this.zzcd = paramMetadataBundle;
    this.zzce = paramList;
    this.status = paramInt;
    this.zzcf = paramIBinder;
  }
  
  private final void zza(boolean paramBoolean)
  {
    zzv();
    this.zzci = true;
    IOUtils.closeQuietly(this.zzcb);
    IOUtils.closeQuietly(this.zzcc);
    Object localObject = this.zzcd;
    if ((localObject != null) && (((MetadataBundle)localObject).zzd(zzhs.zzkq))) {
      ((BitmapTeleporter)this.zzcd.zza(zzhs.zzkq)).release();
    }
    IBinder localIBinder = this.zzcf;
    localObject = "snooze";
    if (localIBinder == null)
    {
      if (!paramBoolean) {
        localObject = "dismiss";
      }
      zzbz.efmt("CompletionEvent", "No callback on %s", new Object[] { localObject });
      return;
    }
    try
    {
      zzev.zza(localIBinder).zza(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      if (!paramBoolean) {
        localObject = "dismiss";
      }
      zzbz.e("CompletionEvent", String.format("RemoteException on %s", new Object[] { localObject }), localRemoteException);
    }
  }
  
  private final void zzv()
  {
    if (!this.zzci) {
      return;
    }
    throw new IllegalStateException("Event has already been dismissed or snoozed.");
  }
  
  public final void dismiss()
  {
    zza(false);
  }
  
  public final String getAccountName()
  {
    zzv();
    return this.zzca;
  }
  
  public final InputStream getBaseContentsInputStream()
  {
    zzv();
    if (this.zzcb == null) {
      return null;
    }
    if (!this.zzcg)
    {
      this.zzcg = true;
      return new FileInputStream(this.zzcb.getFileDescriptor());
    }
    throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
  }
  
  public final DriveId getDriveId()
  {
    zzv();
    return this.zzk;
  }
  
  public final InputStream getModifiedContentsInputStream()
  {
    zzv();
    if (this.zzcc == null) {
      return null;
    }
    if (!this.zzch)
    {
      this.zzch = true;
      return new FileInputStream(this.zzcc.getFileDescriptor());
    }
    throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
  }
  
  public final MetadataChangeSet getModifiedMetadataChangeSet()
  {
    zzv();
    if (this.zzcd != null) {
      return new MetadataChangeSet(this.zzcd);
    }
    return null;
  }
  
  public final int getStatus()
  {
    zzv();
    return this.status;
  }
  
  public final List<String> getTrackingTags()
  {
    zzv();
    return new ArrayList(this.zzce);
  }
  
  public final int getType()
  {
    return 2;
  }
  
  public final void snooze()
  {
    zza(true);
  }
  
  public final String toString()
  {
    Object localObject = this.zzce;
    if (localObject == null)
    {
      localObject = "<null>";
    }
    else
    {
      String str = TextUtils.join("','", (Iterable)localObject);
      localObject = new StringBuilder(String.valueOf(str).length() + 2);
      ((StringBuilder)localObject).append("'");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("'");
      localObject = ((StringBuilder)localObject).toString();
    }
    return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] { this.zzk, Integer.valueOf(this.status), localObject });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt |= 0x1;
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzk, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzca, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzcb, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzcc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzcd, paramInt, false);
    SafeParcelWriter.writeStringList(paramParcel, 7, this.zzce, false);
    SafeParcelWriter.writeInt(paramParcel, 8, this.status);
    SafeParcelWriter.writeIBinder(paramParcel, 9, this.zzcf, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\events\CompletionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */