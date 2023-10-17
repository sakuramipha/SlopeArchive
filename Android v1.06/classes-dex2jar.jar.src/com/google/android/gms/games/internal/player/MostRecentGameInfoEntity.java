package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.games.internal.zzh;

public final class MostRecentGameInfoEntity
  extends zzh
  implements zza
{
  public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new zzb();
  private final String zza;
  private final String zzb;
  private final long zzc;
  private final Uri zzd;
  private final Uri zze;
  private final Uri zzf;
  
  public MostRecentGameInfoEntity(zza paramzza)
  {
    this.zza = paramzza.zze();
    this.zzb = paramzza.zzf();
    this.zzc = paramzza.zza();
    this.zzd = paramzza.zzd();
    this.zze = paramzza.zzc();
    this.zzf = paramzza.zzb();
  }
  
  MostRecentGameInfoEntity(String paramString1, String paramString2, long paramLong, Uri paramUri1, Uri paramUri2, Uri paramUri3)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramLong;
    this.zzd = paramUri1;
    this.zze = paramUri2;
    this.zzf = paramUri3;
  }
  
  static int zzg(zza paramzza)
  {
    return Objects.hashCode(new Object[] { paramzza.zze(), paramzza.zzf(), Long.valueOf(paramzza.zza()), paramzza.zzd(), paramzza.zzc(), paramzza.zzb() });
  }
  
  static String zzh(zza paramzza)
  {
    return Objects.toStringHelper(paramzza).add("GameId", paramzza.zze()).add("GameName", paramzza.zzf()).add("ActivityTimestampMillis", Long.valueOf(paramzza.zza())).add("GameIconUri", paramzza.zzd()).add("GameHiResUri", paramzza.zzc()).add("GameFeaturedUri", paramzza.zzb()).toString();
  }
  
  static boolean zzi(zza paramzza, Object paramObject)
  {
    if (!(paramObject instanceof zza)) {
      return false;
    }
    if (paramzza == paramObject) {
      return true;
    }
    paramObject = (zza)paramObject;
    return (Objects.equal(((zza)paramObject).zze(), paramzza.zze())) && (Objects.equal(((zza)paramObject).zzf(), paramzza.zzf())) && (Objects.equal(Long.valueOf(((zza)paramObject).zza()), Long.valueOf(paramzza.zza()))) && (Objects.equal(((zza)paramObject).zzd(), paramzza.zzd())) && (Objects.equal(((zza)paramObject).zzc(), paramzza.zzc())) && (Objects.equal(((zza)paramObject).zzb(), paramzza.zzb()));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzi(this, paramObject);
  }
  
  public final int hashCode()
  {
    return zzg(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzh(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final long zza()
  {
    return this.zzc;
  }
  
  public final Uri zzb()
  {
    return this.zzf;
  }
  
  public final Uri zzc()
  {
    return this.zze;
  }
  
  public final Uri zzd()
  {
    return this.zzd;
  }
  
  public final String zze()
  {
    return this.zza;
  }
  
  public final String zzf()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\player\MostRecentGameInfoEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */