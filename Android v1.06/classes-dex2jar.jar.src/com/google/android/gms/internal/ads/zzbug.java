package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbug
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbug> CREATOR = new zzbuh();
  public final Bundle zza;
  public final zzbzz zzb;
  public final ApplicationInfo zzc;
  public final String zzd;
  public final List zze;
  public final PackageInfo zzf;
  public final String zzg;
  public final String zzh;
  public zzfbt zzi;
  public String zzj;
  public final boolean zzk;
  public final boolean zzl;
  
  public zzbug(Bundle paramBundle, zzbzz paramzzbzz, ApplicationInfo paramApplicationInfo, String paramString1, List paramList, PackageInfo paramPackageInfo, String paramString2, String paramString3, zzfbt paramzzfbt, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramBundle;
    this.zzb = paramzzbzz;
    this.zzd = paramString1;
    this.zzc = paramApplicationInfo;
    this.zze = paramList;
    this.zzf = paramPackageInfo;
    this.zzg = paramString2;
    this.zzh = paramString3;
    this.zzi = paramzzfbt;
    this.zzj = paramString4;
    this.zzk = paramBoolean1;
    this.zzl = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBundle(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeStringList(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeString(paramParcel, 9, this.zzh, false);
    SafeParcelWriter.writeParcelable(paramParcel, 10, this.zzi, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 11, this.zzj, false);
    SafeParcelWriter.writeBoolean(paramParcel, 12, this.zzk);
    SafeParcelWriter.writeBoolean(paramParcel, 13, this.zzl);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */