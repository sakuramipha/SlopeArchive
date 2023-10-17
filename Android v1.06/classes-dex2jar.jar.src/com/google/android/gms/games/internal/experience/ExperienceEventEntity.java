package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzh;

public final class ExperienceEventEntity
  extends zzh
  implements ExperienceEvent
{
  public static final Parcelable.Creator<ExperienceEventEntity> CREATOR = new zza();
  private final String zza;
  private final GameEntity zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final Uri zzf;
  private final long zzg;
  private final long zzh;
  private final long zzi;
  private final int zzj;
  private final int zzk;
  
  ExperienceEventEntity(String paramString1, GameEntity paramGameEntity, String paramString2, String paramString3, String paramString4, Uri paramUri, long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2)
  {
    this.zza = paramString1;
    this.zzb = paramGameEntity;
    this.zzc = paramString2;
    this.zzd = paramString3;
    this.zze = paramString4;
    this.zzf = paramUri;
    this.zzg = paramLong1;
    this.zzh = paramLong2;
    this.zzi = paramLong3;
    this.zzj = paramInt1;
    this.zzk = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = paramObject instanceof ExperienceEvent;
    boolean bool1 = true;
    if (!bool2) {}
    do
    {
      bool1 = false;
      break;
      if (this == paramObject) {
        break;
      }
      paramObject = (ExperienceEvent)paramObject;
    } while ((!Objects.equal(((ExperienceEvent)paramObject).zzj(), this.zza)) || (!Objects.equal(((ExperienceEvent)paramObject).zzg(), this.zzb)) || (!Objects.equal(((ExperienceEvent)paramObject).zzi(), this.zzc)) || (!Objects.equal(((ExperienceEvent)paramObject).zzh(), this.zzd)) || (!Objects.equal(((ExperienceEvent)paramObject).getIconImageUrl(), getIconImageUrl())) || (!Objects.equal(((ExperienceEvent)paramObject).zzf(), this.zzf)) || (!Objects.equal(Long.valueOf(((ExperienceEvent)paramObject).zzc()), Long.valueOf(this.zzg))) || (!Objects.equal(Long.valueOf(((ExperienceEvent)paramObject).zze()), Long.valueOf(this.zzh))) || (!Objects.equal(Long.valueOf(((ExperienceEvent)paramObject).zzd()), Long.valueOf(this.zzi))) || (!Objects.equal(Integer.valueOf(((ExperienceEvent)paramObject).zzb()), Integer.valueOf(this.zzj))) || (!Objects.equal(Integer.valueOf(((ExperienceEvent)paramObject).zza()), Integer.valueOf(this.zzk))));
    return bool1;
  }
  
  public String getIconImageUrl()
  {
    return this.zze;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, this.zzd, getIconImageUrl(), this.zzf, Long.valueOf(this.zzg), Long.valueOf(this.zzh), Long.valueOf(this.zzi), Integer.valueOf(this.zzj), Integer.valueOf(this.zzk) });
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("ExperienceId", this.zza).add("Game", this.zzb).add("DisplayTitle", this.zzc).add("DisplayDescription", this.zzd).add("IconImageUrl", getIconImageUrl()).add("IconImageUri", this.zzf).add("CreatedTimestamp", Long.valueOf(this.zzg)).add("XpEarned", Long.valueOf(this.zzh)).add("CurrentXp", Long.valueOf(this.zzi)).add("Type", Integer.valueOf(this.zzj)).add("NewLevel", Integer.valueOf(this.zzk)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 5, getIconImageUrl(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeLong(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeLong(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeLong(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeInt(paramParcel, 10, this.zzj);
    SafeParcelWriter.writeInt(paramParcel, 11, this.zzk);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final int zza()
  {
    return this.zzk;
  }
  
  public final int zzb()
  {
    return this.zzj;
  }
  
  public final long zzc()
  {
    return this.zzg;
  }
  
  public final long zzd()
  {
    return this.zzi;
  }
  
  public final long zze()
  {
    return this.zzh;
  }
  
  public final Uri zzf()
  {
    return this.zzf;
  }
  
  public final Game zzg()
  {
    return this.zzb;
  }
  
  public final String zzh()
  {
    return this.zzd;
  }
  
  public final String zzi()
  {
    return this.zzc;
  }
  
  public final String zzj()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\experience\ExperienceEventEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */