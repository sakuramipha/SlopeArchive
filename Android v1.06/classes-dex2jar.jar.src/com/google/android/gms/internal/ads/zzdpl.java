package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import java.util.regex.Pattern;

public final class zzdpl
  implements zzdaa, zza, zzcwc, zzcvm
{
  private final Context zza;
  private final zzfap zzb;
  private final zzdqc zzc;
  private final zzezr zzd;
  private final zzezf zze;
  private final zzebc zzf;
  private Boolean zzg;
  private final boolean zzh;
  
  public zzdpl(Context paramContext, zzfap paramzzfap, zzdqc paramzzdqc, zzezr paramzzezr, zzezf paramzzezf, zzebc paramzzebc)
  {
    this.zza = paramContext;
    this.zzb = paramzzfap;
    this.zzc = paramzzdqc;
    this.zzd = paramzzezr;
    this.zze = paramzzezf;
    this.zzf = paramzzebc;
    paramContext = zzbbk.zzgC;
    this.zzh = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
  }
  
  private final zzdqb zzf(String paramString)
  {
    zzdqb localzzdqb = this.zzc.zza();
    localzzdqb.zze(this.zzd.zzb.zzb);
    localzzdqb.zzd(this.zze);
    localzzdqb.zzb("action", paramString);
    boolean bool2 = this.zze.zzu.isEmpty();
    boolean bool1 = false;
    if (!bool2) {
      localzzdqb.zzb("ancn", (String)this.zze.zzu.get(0));
    }
    if (this.zze.zzaj)
    {
      if (true != zzt.zzo().zzx(this.zza)) {
        paramString = "offline";
      } else {
        paramString = "online";
      }
      localzzdqb.zzb("device_connectivity", paramString);
      localzzdqb.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
      localzzdqb.zzb("offline_ad", "1");
    }
    paramString = zzbbk.zzgL;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
    {
      if (zzf.zze(this.zzd.zza.zza) != 1) {
        bool1 = true;
      }
      localzzdqb.zzb("scar", String.valueOf(bool1));
      if (bool1)
      {
        paramString = this.zzd.zza.zza.zzd;
        localzzdqb.zzc("ragent", paramString.zzp);
        localzzdqb.zzc("rtype", zzf.zza(zzf.zzb(paramString)));
      }
    }
    return localzzdqb;
  }
  
  private final void zzg(zzdqb paramzzdqb)
  {
    if (this.zze.zzaj)
    {
      paramzzdqb = paramzzdqb.zzf();
      paramzzdqb = new zzebe(zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, paramzzdqb, 2);
      this.zzf.zzd(paramzzdqb);
      return;
    }
    paramzzdqb.zzg();
  }
  
  private final boolean zzh()
  {
    if (this.zzg == null) {
      try
      {
        if (this.zzg == null)
        {
          Object localObject1 = zzbbk.zzbp;
          localObject1 = (String)zzba.zzc().zzb((zzbbc)localObject1);
          zzt.zzp();
          String str = zzs.zzn(this.zza);
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (localObject1 != null) {
            if (str == null) {
              bool1 = bool2;
            } else {
              try
              {
                bool1 = Pattern.matches((String)localObject1, str);
              }
              catch (RuntimeException localRuntimeException)
              {
                zzt.zzo().zzu(localRuntimeException, "CsiActionsListener.isPatternMatched");
                bool1 = bool2;
              }
            }
          }
          this.zzg = Boolean.valueOf(bool1);
        }
      }
      finally {}
    }
    return this.zzg.booleanValue();
  }
  
  public final void onAdClicked()
  {
    if (!this.zze.zzaj) {
      return;
    }
    zzg(zzf("click"));
  }
  
  public final void zza(zze paramzze)
  {
    if (!this.zzh) {
      return;
    }
    zzdqb localzzdqb = zzf("ifts");
    localzzdqb.zzb("reason", "adapter");
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
    if (i >= 0) {
      localzzdqb.zzb("arec", String.valueOf(i));
    }
    paramzze = this.zzb.zza(str1);
    if (paramzze != null) {
      localzzdqb.zzb("areec", paramzze);
    }
    localzzdqb.zzg();
  }
  
  public final void zzb()
  {
    if (!this.zzh) {
      return;
    }
    zzdqb localzzdqb = zzf("ifts");
    localzzdqb.zzb("reason", "blocked");
    localzzdqb.zzg();
  }
  
  public final void zzc(zzdex paramzzdex)
  {
    if (!this.zzh) {
      return;
    }
    zzdqb localzzdqb = zzf("ifts");
    localzzdqb.zzb("reason", "exception");
    if (!TextUtils.isEmpty(paramzzdex.getMessage())) {
      localzzdqb.zzb("msg", paramzzdex.getMessage());
    }
    localzzdqb.zzg();
  }
  
  public final void zzd()
  {
    if (!zzh()) {
      return;
    }
    zzf("adapter_shown").zzg();
  }
  
  public final void zze()
  {
    if (!zzh()) {
      return;
    }
    zzf("adapter_impression").zzg();
  }
  
  public final void zzl()
  {
    if ((!zzh()) && (!this.zze.zzaj)) {
      return;
    }
    zzg(zzf("impression"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */