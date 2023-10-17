package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import java.util.regex.Pattern;

public final class zzdzd
  implements zzdaa, zza, zzcwc, zzcvm
{
  private final Context zza;
  private final zzfap zzb;
  private final zzezr zzc;
  private final zzezf zzd;
  private final zzebc zze;
  private Boolean zzf;
  private final boolean zzg;
  private final zzfen zzh;
  private final String zzi;
  
  public zzdzd(Context paramContext, zzfap paramzzfap, zzezr paramzzezr, zzezf paramzzezf, zzebc paramzzebc, zzfen paramzzfen, String paramString)
  {
    this.zza = paramContext;
    this.zzb = paramzzfap;
    this.zzc = paramzzezr;
    this.zzd = paramzzezf;
    this.zze = paramzzebc;
    paramContext = zzbbk.zzgC;
    this.zzg = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    this.zzh = paramzzfen;
    this.zzi = paramString;
  }
  
  private final zzfem zzf(String paramString)
  {
    zzfem localzzfem = zzfem.zzb(paramString);
    localzzfem.zzh(this.zzc, null);
    localzzfem.zzf(this.zzd);
    localzzfem.zza("request_id", this.zzi);
    if (!this.zzd.zzu.isEmpty()) {
      localzzfem.zza("ancn", (String)this.zzd.zzu.get(0));
    }
    if (this.zzd.zzaj)
    {
      if (true != zzt.zzo().zzx(this.zza)) {
        paramString = "offline";
      } else {
        paramString = "online";
      }
      localzzfem.zza("device_connectivity", paramString);
      localzzfem.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
      localzzfem.zza("offline_ad", "1");
    }
    return localzzfem;
  }
  
  private final void zzg(zzfem paramzzfem)
  {
    if (this.zzd.zzaj)
    {
      paramzzfem = this.zzh.zza(paramzzfem);
      paramzzfem = new zzebe(zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, paramzzfem, 2);
      this.zze.zzd(paramzzfem);
      return;
    }
    this.zzh.zzb(paramzzfem);
  }
  
  private final boolean zzh()
  {
    if (this.zzf == null) {
      try
      {
        if (this.zzf == null)
        {
          Object localObject1 = zzbbk.zzbp;
          String str = (String)zzba.zzc().zzb((zzbbc)localObject1);
          zzt.zzp();
          localObject1 = zzs.zzn(this.zza);
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (str != null) {
            if (localObject1 == null) {
              bool1 = bool2;
            } else {
              try
              {
                bool1 = Pattern.matches(str, (CharSequence)localObject1);
              }
              catch (RuntimeException localRuntimeException)
              {
                zzt.zzo().zzu(localRuntimeException, "CsiActionsListener.isPatternMatched");
                bool1 = bool2;
              }
            }
          }
          this.zzf = Boolean.valueOf(bool1);
        }
      }
      finally {}
    }
    return this.zzf.booleanValue();
  }
  
  public final void onAdClicked()
  {
    if (!this.zzd.zzaj) {
      return;
    }
    zzg(zzf("click"));
  }
  
  public final void zza(zze paramzze)
  {
    if (!this.zzg) {
      return;
    }
    int j = paramzze.zza;
    String str2 = paramzze.zzb;
    int i = j;
    String str1 = str2;
    if (paramzze.zzc.equals("com.google.android.gms.ads"))
    {
      zze localzze = paramzze.zzd;
      i = j;
      str1 = str2;
      if (localzze != null)
      {
        i = j;
        str1 = str2;
        if (!localzze.zzc.equals("com.google.android.gms.ads"))
        {
          paramzze = paramzze.zzd;
          i = paramzze.zza;
          str1 = paramzze.zzb;
        }
      }
    }
    str1 = this.zzb.zza(str1);
    paramzze = zzf("ifts");
    paramzze.zza("reason", "adapter");
    if (i >= 0) {
      paramzze.zza("arec", String.valueOf(i));
    }
    if (str1 != null) {
      paramzze.zza("areec", str1);
    }
    this.zzh.zzb(paramzze);
  }
  
  public final void zzb()
  {
    if (!this.zzg) {
      return;
    }
    zzfen localzzfen = this.zzh;
    zzfem localzzfem = zzf("ifts");
    localzzfem.zza("reason", "blocked");
    localzzfen.zzb(localzzfem);
  }
  
  public final void zzc(zzdex paramzzdex)
  {
    if (!this.zzg) {
      return;
    }
    zzfem localzzfem = zzf("ifts");
    localzzfem.zza("reason", "exception");
    if (!TextUtils.isEmpty(paramzzdex.getMessage())) {
      localzzfem.zza("msg", paramzzdex.getMessage());
    }
    this.zzh.zzb(localzzfem);
  }
  
  public final void zzd()
  {
    if (!zzh()) {
      return;
    }
    this.zzh.zzb(zzf("adapter_shown"));
  }
  
  public final void zze()
  {
    if (!zzh()) {
      return;
    }
    this.zzh.zzb(zzf("adapter_impression"));
  }
  
  public final void zzl()
  {
    if ((!zzh()) && (!this.zzd.zzaj)) {
      return;
    }
    zzg(zzf("impression"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */