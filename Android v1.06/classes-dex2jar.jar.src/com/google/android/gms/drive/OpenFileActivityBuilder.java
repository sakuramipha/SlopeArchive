package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.zzk;
import com.google.android.gms.internal.drive.zzaw;
import com.google.android.gms.internal.drive.zzeo;
import com.google.android.gms.internal.drive.zzgm;

@Deprecated
public class OpenFileActivityBuilder
{
  public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
  private String zzba;
  private String[] zzbb;
  private Filter zzbc;
  private DriveId zzbd;
  
  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkState(paramGoogleApiClient.isConnected(), "Client must be connected");
    zzg();
    FilterHolder localFilterHolder;
    if (this.zzbc == null) {
      localFilterHolder = null;
    } else {
      localFilterHolder = new FilterHolder(this.zzbc);
    }
    try
    {
      paramGoogleApiClient = (zzeo)((zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY)).getService();
      zzgm localzzgm = new com/google/android/gms/internal/drive/zzgm;
      localzzgm.<init>(this.zzba, this.zzbb, this.zzbd, localFilterHolder);
      paramGoogleApiClient = paramGoogleApiClient.zza(localzzgm);
      return paramGoogleApiClient;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new RuntimeException("Unable to connect Drive Play Service", paramGoogleApiClient);
    }
  }
  
  final String getTitle()
  {
    return this.zzba;
  }
  
  public OpenFileActivityBuilder setActivityStartFolder(DriveId paramDriveId)
  {
    this.zzbd = ((DriveId)Preconditions.checkNotNull(paramDriveId));
    return this;
  }
  
  public OpenFileActivityBuilder setActivityTitle(String paramString)
  {
    this.zzba = ((String)Preconditions.checkNotNull(paramString));
    return this;
  }
  
  public OpenFileActivityBuilder setMimeType(String[] paramArrayOfString)
  {
    boolean bool;
    if (paramArrayOfString != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "mimeTypes may not be null");
    this.zzbb = paramArrayOfString;
    return this;
  }
  
  public OpenFileActivityBuilder setSelectionFilter(Filter paramFilter)
  {
    boolean bool;
    if (paramFilter != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "filter may not be null");
    Preconditions.checkArgument(true ^ zzk.zza(paramFilter), "FullTextSearchFilter cannot be used as a selection filter");
    this.zzbc = paramFilter;
    return this;
  }
  
  final void zzg()
  {
    if (this.zzbb == null) {
      this.zzbb = new String[0];
    }
    if ((this.zzbb.length > 0) && (this.zzbc != null)) {
      throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }
  }
  
  final String[] zzs()
  {
    return this.zzbb;
  }
  
  final Filter zzt()
  {
    return this.zzbc;
  }
  
  final DriveId zzu()
  {
    return this.zzbd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\OpenFileActivityBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */