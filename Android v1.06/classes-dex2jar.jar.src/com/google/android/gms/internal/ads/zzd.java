package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzd
{
  public static final zzd zza = new zzd(null, new zzc[0], 0L, -9223372036854775807L, 0);
  public static final zzn zzb = zza.zza;
  private static final zzc zzf = new zzc(0L).zzb(0);
  private static final String zzg = Integer.toString(1, 36);
  private static final String zzh = Integer.toString(2, 36);
  private static final String zzi = Integer.toString(3, 36);
  private static final String zzj = Integer.toString(4, 36);
  public final int zzc = 0;
  public final long zzd = 0L;
  public final int zze;
  private final zzc[] zzk;
  
  private zzd(Object paramObject, zzc[] paramArrayOfzzc, long paramLong1, long paramLong2, int paramInt)
  {
    this.zzk = paramArrayOfzzc;
    this.zze = 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzd)paramObject;
      if ((zzfn.zzB(null, null)) && (Arrays.equals(this.zzk, ((zzd)paramObject).zzk))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(this.zzk);
    return (int)-9223372036854775807L * 961 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdPlaybackState(adsId=");
    localStringBuilder.append(null);
    localStringBuilder.append(", adResumePositionUs=0, adGroups=[");
    localStringBuilder.append("])");
    return localStringBuilder.toString();
  }
  
  public final zzc zza(int paramInt)
  {
    zzc localzzc;
    if (paramInt < 0) {
      localzzc = zzf;
    } else {
      localzzc = this.zzk[paramInt];
    }
    return localzzc;
  }
  
  public final boolean zzb(int paramInt)
  {
    zza(-1);
    zzn localzzn = zzc.zza;
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */