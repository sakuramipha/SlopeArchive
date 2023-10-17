package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

@Deprecated
public final class zzt
{
  private String zzba;
  private DriveId zzbd;
  private Integer zzdk;
  private final int zzdl = 0;
  private MetadataChangeSet zzdm;
  
  public zzt(int paramInt) {}
  
  public final IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkState(paramGoogleApiClient.isConnected(), "Client must be connected");
    zzg();
    paramGoogleApiClient = (zzaw)paramGoogleApiClient.getClient(Drive.CLIENT_KEY);
    this.zzdm.zzq().zza(paramGoogleApiClient.getContext());
    try
    {
      zzeo localzzeo = (zzeo)paramGoogleApiClient.getService();
      paramGoogleApiClient = new com/google/android/gms/internal/drive/zzu;
      paramGoogleApiClient.<init>(this.zzdm.zzq(), this.zzdk.intValue(), this.zzba, this.zzbd, Integer.valueOf(0));
      paramGoogleApiClient = localzzeo.zza(paramGoogleApiClient);
      return paramGoogleApiClient;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new RuntimeException("Unable to connect Drive Play Service", paramGoogleApiClient);
    }
  }
  
  public final int getRequestId()
  {
    return this.zzdk.intValue();
  }
  
  public final void zza(DriveId paramDriveId)
  {
    this.zzbd = ((DriveId)Preconditions.checkNotNull(paramDriveId));
  }
  
  public final void zza(MetadataChangeSet paramMetadataChangeSet)
  {
    this.zzdm = ((MetadataChangeSet)Preconditions.checkNotNull(paramMetadataChangeSet));
  }
  
  public final MetadataChangeSet zzc()
  {
    return this.zzdm;
  }
  
  public final void zzc(String paramString)
  {
    this.zzba = ((String)Preconditions.checkNotNull(paramString));
  }
  
  public final DriveId zzd()
  {
    return this.zzbd;
  }
  
  public final void zzd(int paramInt)
  {
    this.zzdk = Integer.valueOf(paramInt);
  }
  
  public final String zze()
  {
    return this.zzba;
  }
  
  public final void zzg()
  {
    Preconditions.checkNotNull(this.zzdm, "Must provide initial metadata via setInitialMetadata.");
    Integer localInteger = this.zzdk;
    int i;
    if (localInteger == null) {
      i = 0;
    } else {
      i = localInteger.intValue();
    }
    this.zzdk = Integer.valueOf(i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */