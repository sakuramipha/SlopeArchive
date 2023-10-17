package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
  final int zza;
  final int zzb;
  int zzc;
  String zzd;
  IBinder zze;
  Scope[] zzf;
  Bundle zzg;
  Account zzh;
  Feature[] zzi;
  Feature[] zzj;
  boolean zzk;
  int zzl;
  boolean zzm;
  private String zzn;
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString1, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, Feature[] paramArrayOfFeature1, Feature[] paramArrayOfFeature2, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, String paramString2)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    if ("com.google.android.gms".equals(paramString1)) {
      this.zzd = "com.google.android.gms";
    } else {
      this.zzd = paramString1;
    }
    if (paramInt1 < 2)
    {
      if (paramIBinder != null) {
        paramString1 = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(paramIBinder));
      } else {
        paramString1 = null;
      }
      this.zzh = paramString1;
    }
    else
    {
      this.zze = paramIBinder;
      this.zzh = paramAccount;
    }
    this.zzf = paramArrayOfScope;
    this.zzg = paramBundle;
    this.zzi = paramArrayOfFeature1;
    this.zzj = paramArrayOfFeature2;
    this.zzk = paramBoolean1;
    this.zzl = paramInt4;
    this.zzm = paramBoolean2;
    this.zzn = paramString2;
  }
  
  public GetServiceRequest(int paramInt, String paramString)
  {
    this.zza = 6;
    this.zzc = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    this.zzb = paramInt;
    this.zzk = true;
    this.zzn = paramString;
  }
  
  public Bundle getExtraArgs()
  {
    return this.zzg;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zzn;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */