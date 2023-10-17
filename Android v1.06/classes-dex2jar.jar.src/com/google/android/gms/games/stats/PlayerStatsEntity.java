package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.games.internal.zzh;

public class PlayerStatsEntity
  extends zzh
  implements PlayerStats
{
  public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new zza();
  private final float zza;
  private final float zzb;
  private final int zzc;
  private final int zzd;
  private final int zze;
  private final float zzf;
  private final float zzg;
  private final Bundle zzh;
  private final float zzi;
  private final float zzj;
  private final float zzk;
  
  PlayerStatsEntity(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, float paramFloat3, float paramFloat4, Bundle paramBundle, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.zza = paramFloat1;
    this.zzb = paramFloat2;
    this.zzc = paramInt1;
    this.zzd = paramInt2;
    this.zze = paramInt3;
    this.zzf = paramFloat3;
    this.zzg = paramFloat4;
    this.zzh = paramBundle;
    this.zzi = paramFloat5;
    this.zzj = paramFloat6;
    this.zzk = paramFloat7;
  }
  
  public PlayerStatsEntity(PlayerStats paramPlayerStats)
  {
    this.zza = paramPlayerStats.getAverageSessionLength();
    this.zzb = paramPlayerStats.getChurnProbability();
    this.zzc = paramPlayerStats.getDaysSinceLastPlayed();
    this.zzd = paramPlayerStats.getNumberOfPurchases();
    this.zze = paramPlayerStats.getNumberOfSessions();
    this.zzf = paramPlayerStats.getSessionPercentile();
    this.zzg = paramPlayerStats.getSpendPercentile();
    this.zzi = paramPlayerStats.getSpendProbability();
    this.zzj = paramPlayerStats.getHighSpenderProbability();
    this.zzk = paramPlayerStats.getTotalSpendNext28Days();
    this.zzh = paramPlayerStats.zza();
  }
  
  static int zzb(PlayerStats paramPlayerStats)
  {
    return Objects.hashCode(new Object[] { Float.valueOf(paramPlayerStats.getAverageSessionLength()), Float.valueOf(paramPlayerStats.getChurnProbability()), Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed()), Integer.valueOf(paramPlayerStats.getNumberOfPurchases()), Integer.valueOf(paramPlayerStats.getNumberOfSessions()), Float.valueOf(paramPlayerStats.getSessionPercentile()), Float.valueOf(paramPlayerStats.getSpendPercentile()), Float.valueOf(paramPlayerStats.getSpendProbability()), Float.valueOf(paramPlayerStats.getHighSpenderProbability()), Float.valueOf(paramPlayerStats.getTotalSpendNext28Days()) });
  }
  
  static String zzc(PlayerStats paramPlayerStats)
  {
    return Objects.toStringHelper(paramPlayerStats).add("AverageSessionLength", Float.valueOf(paramPlayerStats.getAverageSessionLength())).add("ChurnProbability", Float.valueOf(paramPlayerStats.getChurnProbability())).add("DaysSinceLastPlayed", Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed())).add("NumberOfPurchases", Integer.valueOf(paramPlayerStats.getNumberOfPurchases())).add("NumberOfSessions", Integer.valueOf(paramPlayerStats.getNumberOfSessions())).add("SessionPercentile", Float.valueOf(paramPlayerStats.getSessionPercentile())).add("SpendPercentile", Float.valueOf(paramPlayerStats.getSpendPercentile())).add("SpendProbability", Float.valueOf(paramPlayerStats.getSpendProbability())).add("HighSpenderProbability", Float.valueOf(paramPlayerStats.getHighSpenderProbability())).add("TotalSpendNext28Days", Float.valueOf(paramPlayerStats.getTotalSpendNext28Days())).toString();
  }
  
  static boolean zzd(PlayerStats paramPlayerStats, Object paramObject)
  {
    if (!(paramObject instanceof PlayerStats)) {
      return false;
    }
    if (paramPlayerStats == paramObject) {
      return true;
    }
    paramObject = (PlayerStats)paramObject;
    return (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getAverageSessionLength()), Float.valueOf(paramPlayerStats.getAverageSessionLength()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getChurnProbability()), Float.valueOf(paramPlayerStats.getChurnProbability()))) && (Objects.equal(Integer.valueOf(((PlayerStats)paramObject).getDaysSinceLastPlayed()), Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed()))) && (Objects.equal(Integer.valueOf(((PlayerStats)paramObject).getNumberOfPurchases()), Integer.valueOf(paramPlayerStats.getNumberOfPurchases()))) && (Objects.equal(Integer.valueOf(((PlayerStats)paramObject).getNumberOfSessions()), Integer.valueOf(paramPlayerStats.getNumberOfSessions()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getSessionPercentile()), Float.valueOf(paramPlayerStats.getSessionPercentile()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getSpendPercentile()), Float.valueOf(paramPlayerStats.getSpendPercentile()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getSpendProbability()), Float.valueOf(paramPlayerStats.getSpendProbability()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getHighSpenderProbability()), Float.valueOf(paramPlayerStats.getHighSpenderProbability()))) && (Objects.equal(Float.valueOf(((PlayerStats)paramObject).getTotalSpendNext28Days()), Float.valueOf(paramPlayerStats.getTotalSpendNext28Days())));
  }
  
  public final boolean equals(Object paramObject)
  {
    return zzd(this, paramObject);
  }
  
  public final float getAverageSessionLength()
  {
    return this.zza;
  }
  
  public final float getChurnProbability()
  {
    return this.zzb;
  }
  
  public final int getDaysSinceLastPlayed()
  {
    return this.zzc;
  }
  
  public final float getHighSpenderProbability()
  {
    return this.zzj;
  }
  
  public final int getNumberOfPurchases()
  {
    return this.zzd;
  }
  
  public final int getNumberOfSessions()
  {
    return this.zze;
  }
  
  public final float getSessionPercentile()
  {
    return this.zzf;
  }
  
  public final float getSpendPercentile()
  {
    return this.zzg;
  }
  
  public final float getSpendProbability()
  {
    return this.zzi;
  }
  
  public final float getTotalSpendNext28Days()
  {
    return this.zzk;
  }
  
  public final int hashCode()
  {
    return zzb(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final Bundle zza()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\stats\PlayerStatsEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */