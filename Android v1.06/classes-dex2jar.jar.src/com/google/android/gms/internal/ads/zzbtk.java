package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbtk
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbtk> CREATOR = new zzbtl();
  public final ApplicationInfo zza;
  public final String zzb;
  public final PackageInfo zzc;
  public final String zzd;
  public final int zze;
  public final String zzf;
  public final List zzg;
  public final boolean zzh;
  public final boolean zzi;
  
  public zzbtk(ApplicationInfo paramApplicationInfo, String paramString1, PackageInfo paramPackageInfo, String paramString2, int paramInt, String paramString3, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzb = paramString1;
    this.zza = paramApplicationInfo;
    this.zzc = paramPackageInfo;
    this.zzd = paramString2;
    this.zze = paramInt;
    this.zzf = paramString3;
    this.zzg = paramList;
    this.zzh = paramBoolean1;
    this.zzi = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zza, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zze);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeStringList(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzi);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */