package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zze
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zze> CREATOR = new zzf();
  public final int zza;
  public final String zzb;
  public final String zzc;
  public zze zzd;
  public IBinder zze;
  
  public zze(int paramInt, String paramString1, String paramString2, zze paramzze, IBinder paramIBinder)
  {
    this.zza = paramInt;
    this.zzb = paramString1;
    this.zzc = paramString2;
    this.zzd = paramzze;
    this.zze = paramIBinder;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 5, this.zze, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final AdError zza()
  {
    Object localObject = this.zzd;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new AdError(((zze)localObject).zza, ((zze)localObject).zzb, ((zze)localObject).zzc);
    }
    return new AdError(this.zza, this.zzb, this.zzc, (AdError)localObject);
  }
  
  public final LoadAdError zzb()
  {
    Object localObject2 = this.zzd;
    Object localObject1 = null;
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = new AdError(((zze)localObject2).zza, ((zze)localObject2).zzb, ((zze)localObject2).zzc);
    }
    int i = this.zza;
    String str2 = this.zzb;
    String str1 = this.zzc;
    IBinder localIBinder = this.zze;
    if (localIBinder != null)
    {
      localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
      if ((localObject1 instanceof zzdn)) {
        localObject1 = (zzdn)localObject1;
      } else {
        localObject1 = new zzdl(localIBinder);
      }
    }
    return new LoadAdError(i, str2, str1, (AdError)localObject2, ResponseInfo.zza((zzdn)localObject1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */