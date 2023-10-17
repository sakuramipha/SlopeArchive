package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzc
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzc> CREATOR = new zzb();
  public final String zza;
  public final String zzb;
  public final String zzc;
  public final String zzd;
  public final String zze;
  public final String zzf;
  public final String zzg;
  public final Intent zzh;
  public final zzx zzi;
  public final boolean zzj;
  
  public zzc(Intent paramIntent, zzx paramzzx)
  {
    this(null, null, null, null, null, null, null, paramIntent, ObjectWrapper.wrap(paramzzx).asBinder(), false);
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent, IBinder paramIBinder, boolean paramBoolean)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramString4;
    this.zze = paramString5;
    this.zzf = paramString6;
    this.zzg = paramString7;
    this.zzh = paramIntent;
    this.zzi = ((zzx)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder)));
    this.zzj = paramBoolean;
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, zzx paramzzx)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null, ObjectWrapper.wrap(paramzzx).asBinder(), false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zze, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzf, false);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzg, false);
    SafeParcelWriter.writeParcelable(paramParcel, 9, this.zzh, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzj);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */