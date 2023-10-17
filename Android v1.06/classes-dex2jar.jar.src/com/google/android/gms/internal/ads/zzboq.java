package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzboq
  implements MediationAdRequest
{
  private final Date zza;
  private final int zzb;
  private final Set zzc;
  private final boolean zzd;
  private final Location zze;
  private final int zzf;
  private final boolean zzg;
  private final String zzh;
  
  public zzboq(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, String paramString)
  {
    this.zza = paramDate;
    this.zzb = paramInt1;
    this.zzc = paramSet;
    this.zze = paramLocation;
    this.zzd = paramBoolean1;
    this.zzf = paramInt2;
    this.zzg = paramBoolean2;
    this.zzh = paramString;
  }
  
  @Deprecated
  public final Date getBirthday()
  {
    return this.zza;
  }
  
  @Deprecated
  public final int getGender()
  {
    return this.zzb;
  }
  
  public final Set<String> getKeywords()
  {
    return this.zzc;
  }
  
  public final Location getLocation()
  {
    return this.zze;
  }
  
  @Deprecated
  public final boolean isDesignedForFamilies()
  {
    return this.zzg;
  }
  
  public final boolean isTesting()
  {
    return this.zzd;
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */