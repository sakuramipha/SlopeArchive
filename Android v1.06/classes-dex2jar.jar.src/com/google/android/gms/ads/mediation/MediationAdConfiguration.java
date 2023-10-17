package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class MediationAdConfiguration
{
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
  private final String zza;
  private final Bundle zzb;
  private final Bundle zzc;
  private final Context zzd;
  private final boolean zze;
  private final int zzf;
  private final int zzg;
  private final String zzh;
  private final String zzi;
  
  public MediationAdConfiguration(Context paramContext, String paramString1, Bundle paramBundle1, Bundle paramBundle2, boolean paramBoolean, Location paramLocation, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    this.zza = paramString1;
    this.zzb = paramBundle1;
    this.zzc = paramBundle2;
    this.zzd = paramContext;
    this.zze = paramBoolean;
    this.zzf = paramInt1;
    this.zzg = paramInt2;
    this.zzh = paramString2;
    this.zzi = paramString3;
  }
  
  public String getBidResponse()
  {
    return this.zza;
  }
  
  public Context getContext()
  {
    return this.zzd;
  }
  
  public String getMaxAdContentRating()
  {
    return this.zzh;
  }
  
  public Bundle getMediationExtras()
  {
    return this.zzc;
  }
  
  public Bundle getServerParameters()
  {
    return this.zzb;
  }
  
  public String getWatermark()
  {
    return this.zzi;
  }
  
  public boolean isTestRequest()
  {
    return this.zze;
  }
  
  public int taggedForChildDirectedTreatment()
  {
    return this.zzf;
  }
  
  public int taggedForUnderAgeTreatment()
  {
    return this.zzg;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface TagForChildDirectedTreatment {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationAdConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */