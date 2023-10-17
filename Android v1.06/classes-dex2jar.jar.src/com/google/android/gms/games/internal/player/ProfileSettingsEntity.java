package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;
import com.google.android.gms.games.zzw;

public class ProfileSettingsEntity
  extends zzh
  implements zzw
{
  public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new zze();
  private final Status zza;
  private final String zzb;
  private final boolean zzc;
  private final boolean zzd;
  private final boolean zze;
  private final StockProfileImageEntity zzf;
  private final boolean zzg;
  private final boolean zzh;
  private final int zzi;
  private final boolean zzj;
  private final boolean zzk;
  private final int zzl;
  private final int zzm;
  private final boolean zzn;
  
  public ProfileSettingsEntity(Status paramStatus, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, StockProfileImageEntity paramStockProfileImageEntity, boolean paramBoolean4, boolean paramBoolean5, int paramInt1, boolean paramBoolean6, boolean paramBoolean7, int paramInt2, int paramInt3, boolean paramBoolean8)
  {
    this.zza = paramStatus;
    this.zzb = paramString;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
    this.zze = paramBoolean3;
    this.zzf = paramStockProfileImageEntity;
    this.zzg = paramBoolean4;
    this.zzh = paramBoolean5;
    this.zzi = paramInt1;
    this.zzj = paramBoolean6;
    this.zzk = paramBoolean7;
    this.zzl = paramInt2;
    this.zzm = paramInt3;
    this.zzn = paramBoolean8;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzw)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (zzw)paramObject;
    return (Objects.equal(this.zzb, ((zzw)paramObject).zze())) && (Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(((zzw)paramObject).zzi()))) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((zzw)paramObject).zzk()))) && (Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(((zzw)paramObject).zzm()))) && (Objects.equal(this.zza, ((zzw)paramObject).getStatus())) && (Objects.equal(this.zzf, ((zzw)paramObject).zzd())) && (Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(((zzw)paramObject).zzj()))) && (Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(((zzw)paramObject).zzh()))) && (this.zzi == ((zzw)paramObject).zzb()) && (this.zzj == ((zzw)paramObject).zzl()) && (this.zzk == ((zzw)paramObject).zzf()) && (this.zzl == ((zzw)paramObject).zzc()) && (this.zzm == ((zzw)paramObject).zza()) && (this.zzn == ((zzw)paramObject).zzg());
  }
  
  public final Status getStatus()
  {
    return this.zza;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zza, this.zzf, Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(this.zzi), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), Boolean.valueOf(this.zzn) });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("GamerTag", this.zzb).add("IsGamerTagExplicitlySet", Boolean.valueOf(this.zzc)).add("IsProfileVisible", Boolean.valueOf(this.zzd)).add("IsVisibilityExplicitlySet", Boolean.valueOf(this.zze)).add("Status", this.zza).add("StockProfileImage", this.zzf).add("IsProfileDiscoverable", Boolean.valueOf(this.zzg)).add("AutoSignIn", Boolean.valueOf(this.zzh)).add("httpErrorCode", Integer.valueOf(this.zzi)).add("IsSettingsChangesProhibited", Boolean.valueOf(this.zzj)).add("AllowFriendInvites", Boolean.valueOf(this.zzk)).add("ProfileVisibility", Integer.valueOf(this.zzl)).add("global_friends_list_visibility", Integer.valueOf(this.zzm)).add("always_auto_sign_in", Boolean.valueOf(this.zzn)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zza, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zze);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzk);
    SafeParcelWriter.writeInt(paramParcel, 12, this.zzl);
    SafeParcelWriter.writeInt(paramParcel, 13, this.zzm);
    SafeParcelWriter.writeBoolean(paramParcel, 14, this.zzn);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final int zza()
  {
    return this.zzm;
  }
  
  public final int zzb()
  {
    return this.zzi;
  }
  
  public final int zzc()
  {
    return this.zzl;
  }
  
  public final StockProfileImage zzd()
  {
    return this.zzf;
  }
  
  public final String zze()
  {
    return this.zzb;
  }
  
  public final boolean zzf()
  {
    return this.zzk;
  }
  
  public final boolean zzg()
  {
    return this.zzn;
  }
  
  public final boolean zzh()
  {
    return this.zzh;
  }
  
  public final boolean zzi()
  {
    return this.zzc;
  }
  
  public final boolean zzj()
  {
    return this.zzg;
  }
  
  public final boolean zzk()
  {
    return this.zzd;
  }
  
  public final boolean zzl()
  {
    return this.zzj;
  }
  
  public final boolean zzm()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\player\ProfileSettingsEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */