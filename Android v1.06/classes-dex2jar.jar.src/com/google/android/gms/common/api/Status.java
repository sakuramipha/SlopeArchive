package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class Status
  extends AbstractSafeParcelable
  implements Result, ReflectedParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new zzb();
  public static final Status RESULT_CANCELED;
  public static final Status RESULT_DEAD_CLIENT;
  public static final Status RESULT_INTERNAL_ERROR;
  public static final Status RESULT_INTERRUPTED;
  public static final Status RESULT_SUCCESS = new Status(0);
  public static final Status RESULT_TIMEOUT;
  public static final Status zza;
  final int zzb;
  private final int zzc;
  private final String zzd;
  private final PendingIntent zze;
  private final ConnectionResult zzf;
  
  static
  {
    RESULT_INTERRUPTED = new Status(14);
    RESULT_INTERNAL_ERROR = new Status(8);
    RESULT_TIMEOUT = new Status(15);
    RESULT_CANCELED = new Status(16);
    zza = new Status(17);
    RESULT_DEAD_CLIENT = new Status(18);
  }
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this(paramInt1, paramInt2, paramString, paramPendingIntent, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent, ConnectionResult paramConnectionResult)
  {
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramString;
    this.zze = paramPendingIntent;
    this.zzf = paramConnectionResult;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public Status(ConnectionResult paramConnectionResult, String paramString)
  {
    this(paramConnectionResult, paramString, 17);
  }
  
  @Deprecated
  public Status(ConnectionResult paramConnectionResult, String paramString, int paramInt)
  {
    this(1, paramInt, paramString, paramConnectionResult.getResolution(), paramConnectionResult);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {
      return false;
    }
    paramObject = (Status)paramObject;
    return (this.zzb == ((Status)paramObject).zzb) && (this.zzc == ((Status)paramObject).zzc) && (Objects.equal(this.zzd, ((Status)paramObject).zzd)) && (Objects.equal(this.zze, ((Status)paramObject).zze)) && (Objects.equal(this.zzf, ((Status)paramObject).zzf));
  }
  
  public ConnectionResult getConnectionResult()
  {
    return this.zzf;
  }
  
  public PendingIntent getResolution()
  {
    return this.zze;
  }
  
  public Status getStatus()
  {
    return this;
  }
  
  public int getStatusCode()
  {
    return this.zzc;
  }
  
  public String getStatusMessage()
  {
    return this.zzd;
  }
  
  public boolean hasResolution()
  {
    return this.zze != null;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf });
  }
  
  public boolean isCanceled()
  {
    return this.zzc == 16;
  }
  
  public boolean isInterrupted()
  {
    return this.zzc == 14;
  }
  
  public boolean isSuccess()
  {
    return this.zzc <= 0;
  }
  
  public void startResolutionForResult(Activity paramActivity, int paramInt)
    throws IntentSender.SendIntentException
  {
    if (!hasResolution()) {
      return;
    }
    PendingIntent localPendingIntent = this.zze;
    Preconditions.checkNotNull(localPendingIntent);
    paramActivity.startIntentSenderForResult(localPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public String toString()
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(this);
    localToStringHelper.add("statusCode", zza());
    localToStringHelper.add("resolution", this.zze);
    return localToStringHelper.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, getStatusCode());
    SafeParcelWriter.writeString(paramParcel, 2, getStatusMessage(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zze, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, getConnectionResult(), paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    String str = this.zzd;
    if (str != null) {
      return str;
    }
    return CommonStatusCodes.getStatusCodeString(this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */