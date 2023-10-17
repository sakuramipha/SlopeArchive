package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;

final class zzeau
  extends zzebp
{
  private final Activity zza;
  private final zzl zzb;
  private final zzbr zzc;
  private final zzebc zzd;
  private final zzdqc zze;
  private final zzfen zzf;
  private final String zzg;
  private final String zzh;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzebp))
    {
      paramObject = (zzebp)paramObject;
      if (this.zza.equals(((zzebp)paramObject).zza()))
      {
        zzl localzzl = this.zzb;
        if ((localzzl == null ? ((zzebp)paramObject).zzb() == null : localzzl.equals(((zzebp)paramObject).zzb())) && (this.zzc.equals(((zzebp)paramObject).zzc())) && (this.zzd.equals(((zzebp)paramObject).zze())) && (this.zze.equals(((zzebp)paramObject).zzd())) && (this.zzf.equals(((zzebp)paramObject).zzf())) && (this.zzg.equals(((zzebp)paramObject).zzg())) && (this.zzh.equals(((zzebp)paramObject).zzh()))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zza.hashCode();
    zzl localzzl = this.zzb;
    int i;
    if (localzzl == null) {
      i = 0;
    } else {
      i = localzzl.hashCode();
    }
    return (((((((j ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ this.zzc.hashCode()) * 1000003 ^ this.zzd.hashCode()) * 1000003 ^ this.zze.hashCode()) * 1000003 ^ this.zzf.hashCode()) * 1000003 ^ this.zzg.hashCode()) * 1000003 ^ this.zzh.hashCode();
  }
  
  public final String toString()
  {
    String str5 = this.zza.toString();
    String str6 = String.valueOf(this.zzb);
    String str7 = this.zzc.toString();
    String str3 = this.zzd.toString();
    String str1 = this.zze.toString();
    String str4 = this.zzf.toString();
    String str2 = this.zzg;
    String str8 = this.zzh;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OfflineUtilsParamsBuilder{activity=");
    localStringBuilder.append(str5);
    localStringBuilder.append(", adOverlay=");
    localStringBuilder.append(str6);
    localStringBuilder.append(", workManagerUtil=");
    localStringBuilder.append(str7);
    localStringBuilder.append(", databaseManager=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", csiReporter=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", logger=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", gwsQueryId=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", uri=");
    localStringBuilder.append(str8);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final Activity zza()
  {
    return this.zza;
  }
  
  public final zzl zzb()
  {
    return this.zzb;
  }
  
  public final zzbr zzc()
  {
    return this.zzc;
  }
  
  public final zzdqc zzd()
  {
    return this.zze;
  }
  
  public final zzebc zze()
  {
    return this.zzd;
  }
  
  public final zzfen zzf()
  {
    return this.zzf;
  }
  
  public final String zzg()
  {
    return this.zzg;
  }
  
  public final String zzh()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */