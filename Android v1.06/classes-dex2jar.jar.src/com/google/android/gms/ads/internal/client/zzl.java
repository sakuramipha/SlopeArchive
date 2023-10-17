package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbzu;
import java.util.ArrayList;
import java.util.List;

public final class zzl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzl> CREATOR = new zzn();
  public final int zza;
  @Deprecated
  public final long zzb;
  public final Bundle zzc;
  @Deprecated
  public final int zzd;
  public final List zze;
  public final boolean zzf;
  public final int zzg;
  public final boolean zzh;
  public final String zzi;
  public final zzfh zzj;
  public final Location zzk;
  public final String zzl;
  public final Bundle zzm;
  public final Bundle zzn;
  public final List zzo;
  public final String zzp;
  public final String zzq;
  @Deprecated
  public final boolean zzr;
  public final zzc zzs;
  public final int zzt;
  public final String zzu;
  public final List zzv;
  public final int zzw;
  public final String zzx;
  
  public zzl(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, zzfh paramzzfh, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List paramList2, String paramString3, String paramString4, boolean paramBoolean3, zzc paramzzc, int paramInt4, String paramString5, List paramList3, int paramInt5, String paramString6)
  {
    this.zza = paramInt1;
    this.zzb = paramLong;
    if (paramBundle1 == null) {
      paramBundle1 = new Bundle();
    }
    this.zzc = paramBundle1;
    this.zzd = paramInt2;
    this.zze = paramList1;
    this.zzf = paramBoolean1;
    this.zzg = paramInt3;
    this.zzh = paramBoolean2;
    this.zzi = paramString1;
    this.zzj = paramzzfh;
    this.zzk = paramLocation;
    this.zzl = paramString2;
    if (paramBundle2 == null) {
      paramBundle2 = new Bundle();
    }
    this.zzm = paramBundle2;
    this.zzn = paramBundle3;
    this.zzo = paramList2;
    this.zzp = paramString3;
    this.zzq = paramString4;
    this.zzr = paramBoolean3;
    this.zzs = paramzzc;
    this.zzt = paramInt4;
    this.zzu = paramString5;
    if (paramList3 == null) {
      paramList3 = new ArrayList();
    }
    this.zzv = paramList3;
    this.zzw = paramInt5;
    this.zzx = paramString6;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzl)) {
      return false;
    }
    paramObject = (zzl)paramObject;
    return (this.zza == ((zzl)paramObject).zza) && (this.zzb == ((zzl)paramObject).zzb) && (zzbzu.zza(this.zzc, ((zzl)paramObject).zzc)) && (this.zzd == ((zzl)paramObject).zzd) && (Objects.equal(this.zze, ((zzl)paramObject).zze)) && (this.zzf == ((zzl)paramObject).zzf) && (this.zzg == ((zzl)paramObject).zzg) && (this.zzh == ((zzl)paramObject).zzh) && (Objects.equal(this.zzi, ((zzl)paramObject).zzi)) && (Objects.equal(this.zzj, ((zzl)paramObject).zzj)) && (Objects.equal(this.zzk, ((zzl)paramObject).zzk)) && (Objects.equal(this.zzl, ((zzl)paramObject).zzl)) && (zzbzu.zza(this.zzm, ((zzl)paramObject).zzm)) && (zzbzu.zza(this.zzn, ((zzl)paramObject).zzn)) && (Objects.equal(this.zzo, ((zzl)paramObject).zzo)) && (Objects.equal(this.zzp, ((zzl)paramObject).zzp)) && (Objects.equal(this.zzq, ((zzl)paramObject).zzq)) && (this.zzr == ((zzl)paramObject).zzr) && (this.zzt == ((zzl)paramObject).zzt) && (Objects.equal(this.zzu, ((zzl)paramObject).zzu)) && (Objects.equal(this.zzv, ((zzl)paramObject).zzv)) && (this.zzw == ((zzl)paramObject).zzw) && (Objects.equal(this.zzx, ((zzl)paramObject).zzx));
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBundle(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeStringList(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zzf);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeString(paramParcel, 9, this.zzi, false);
    SafeParcelWriter.writeParcelable(paramParcel, 10, this.zzj, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 11, this.zzk, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 12, this.zzl, false);
    SafeParcelWriter.writeBundle(paramParcel, 13, this.zzm, false);
    SafeParcelWriter.writeBundle(paramParcel, 14, this.zzn, false);
    SafeParcelWriter.writeStringList(paramParcel, 15, this.zzo, false);
    SafeParcelWriter.writeString(paramParcel, 16, this.zzp, false);
    SafeParcelWriter.writeString(paramParcel, 17, this.zzq, false);
    SafeParcelWriter.writeBoolean(paramParcel, 18, this.zzr);
    SafeParcelWriter.writeParcelable(paramParcel, 19, this.zzs, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 20, this.zzt);
    SafeParcelWriter.writeString(paramParcel, 21, this.zzu, false);
    SafeParcelWriter.writeStringList(paramParcel, 22, this.zzv, false);
    SafeParcelWriter.writeInt(paramParcel, 23, this.zzw);
    SafeParcelWriter.writeString(paramParcel, 24, this.zzx, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */