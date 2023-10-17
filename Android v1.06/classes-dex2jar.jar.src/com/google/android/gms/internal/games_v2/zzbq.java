package com.google.android.gms.internal.games_v2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;

final class zzbq
{
  private final String zza;
  private final Status zzb;
  
  private zzbq(Status paramStatus, String paramString)
  {
    this.zzb = paramStatus;
    this.zza = paramString;
  }
  
  public static zzbq zzb(Status paramStatus)
  {
    Preconditions.checkArgument(paramStatus.isSuccess() ^ true);
    return new zzbq(paramStatus, null);
  }
  
  public static zzbq zzc(String paramString)
  {
    return new zzbq(Status.RESULT_SUCCESS, paramString);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzbq)) {
      return false;
    }
    paramObject = (zzbq)paramObject;
    return (Objects.equal(this.zzb, ((zzbq)paramObject).zzb)) && (Objects.equal(this.zza, ((zzbq)paramObject).zza));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, this.zza });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("status", this.zzb).add("gameRunToken", this.zza).toString();
  }
  
  public final PendingIntent zza()
  {
    return this.zzb.getResolution();
  }
  
  public final String zzd()
  {
    return this.zza;
  }
  
  public final boolean zze()
  {
    return this.zzb.isSuccess();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */