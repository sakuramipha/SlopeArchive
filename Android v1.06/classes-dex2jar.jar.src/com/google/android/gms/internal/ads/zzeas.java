package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import java.util.Objects;

final class zzeas
  extends zzebo
{
  private Activity zza;
  private zzl zzb;
  private zzbr zzc;
  private zzebc zzd;
  private zzdqc zze;
  private zzfen zzf;
  private String zzg;
  private String zzh;
  
  public final zzebo zza(Activity paramActivity)
  {
    Objects.requireNonNull(paramActivity, "Null activity");
    this.zza = paramActivity;
    return this;
  }
  
  public final zzebo zzb(zzl paramzzl)
  {
    this.zzb = paramzzl;
    return this;
  }
  
  public final zzebo zzc(zzdqc paramzzdqc)
  {
    Objects.requireNonNull(paramzzdqc, "Null csiReporter");
    this.zze = paramzzdqc;
    return this;
  }
  
  public final zzebo zzd(zzebc paramzzebc)
  {
    Objects.requireNonNull(paramzzebc, "Null databaseManager");
    this.zzd = paramzzebc;
    return this;
  }
  
  public final zzebo zze(String paramString)
  {
    Objects.requireNonNull(paramString, "Null gwsQueryId");
    this.zzg = paramString;
    return this;
  }
  
  public final zzebo zzf(zzfen paramzzfen)
  {
    Objects.requireNonNull(paramzzfen, "Null logger");
    this.zzf = paramzzfen;
    return this;
  }
  
  public final zzebo zzg(String paramString)
  {
    Objects.requireNonNull(paramString, "Null uri");
    this.zzh = paramString;
    return this;
  }
  
  public final zzebo zzh(zzbr paramzzbr)
  {
    Objects.requireNonNull(paramzzbr, "Null workManagerUtil");
    this.zzc = paramzzbr;
    return this;
  }
  
  public final zzebp zzi()
  {
    Activity localActivity = this.zza;
    if (localActivity != null)
    {
      zzbr localzzbr = this.zzc;
      if (localzzbr != null)
      {
        zzebc localzzebc = this.zzd;
        if (localzzebc != null)
        {
          zzdqc localzzdqc = this.zze;
          if (localzzdqc != null)
          {
            zzfen localzzfen = this.zzf;
            if (localzzfen != null)
            {
              String str = this.zzg;
              if (str != null)
              {
                localObject = this.zzh;
                if (localObject != null) {
                  return new zzeau(localActivity, this.zzb, localzzbr, localzzebc, localzzdqc, localzzfen, str, (String)localObject, null);
                }
              }
            }
          }
        }
      }
    }
    Object localObject = new StringBuilder();
    if (this.zza == null) {
      ((StringBuilder)localObject).append(" activity");
    }
    if (this.zzc == null) {
      ((StringBuilder)localObject).append(" workManagerUtil");
    }
    if (this.zzd == null) {
      ((StringBuilder)localObject).append(" databaseManager");
    }
    if (this.zze == null) {
      ((StringBuilder)localObject).append(" csiReporter");
    }
    if (this.zzf == null) {
      ((StringBuilder)localObject).append(" logger");
    }
    if (this.zzg == null) {
      ((StringBuilder)localObject).append(" gwsQueryId");
    }
    if (this.zzh == null) {
      ((StringBuilder)localObject).append(" uri");
    }
    throw new IllegalStateException("Missing required properties:".concat(localObject.toString()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */