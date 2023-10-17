package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcvb
  extends zzdm
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final List zze;
  private final long zzf;
  private final String zzg;
  private final zzeca zzh;
  private final Bundle zzi;
  
  public zzcvb(zzezf paramzzezf, String paramString1, zzeca paramzzeca, zzezi paramzzezi, String paramString2)
  {
    Object localObject = null;
    String str;
    if (paramzzezf == null) {
      str = null;
    } else {
      str = paramzzezf.zzac;
    }
    this.zzb = str;
    this.zzc = paramString2;
    if (paramzzezi == null) {
      paramString2 = null;
    } else {
      paramString2 = paramzzezi.zzb;
    }
    this.zzd = paramString2;
    if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(paramString1))
    {
      paramString2 = (String)localObject;
      if (!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString1)) {}
    }
    else
    {
      try
      {
        paramString2 = paramzzezf.zzw.getString("class_name");
      }
      catch (JSONException paramzzezf)
      {
        paramString2 = (String)localObject;
      }
    }
    if (paramString2 != null) {
      paramString1 = paramString2;
    }
    this.zza = paramString1;
    this.zze = paramzzeca.zzc();
    this.zzh = paramzzeca;
    this.zzf = (zzt.zzB().currentTimeMillis() / 1000L);
    paramzzezf = zzbbk.zzgB;
    if ((((Boolean)zzba.zzc().zzb(paramzzezf)).booleanValue()) && (paramzzezi != null)) {
      this.zzi = paramzzezi.zzj;
    } else {
      this.zzi = new Bundle();
    }
    paramzzezf = zzbbk.zziI;
    if ((((Boolean)zzba.zzc().zzb(paramzzezf)).booleanValue()) && (paramzzezi != null) && (!TextUtils.isEmpty(paramzzezi.zzh))) {
      paramzzezf = paramzzezi.zzh;
    } else {
      paramzzezf = "";
    }
    this.zzg = paramzzezf;
  }
  
  public final long zzc()
  {
    return this.zzf;
  }
  
  public final String zzd()
  {
    return this.zzg;
  }
  
  public final Bundle zze()
  {
    return this.zzi;
  }
  
  public final zzu zzf()
  {
    zzeca localzzeca = this.zzh;
    if (localzzeca != null) {
      return localzzeca.zza();
    }
    return null;
  }
  
  public final String zzg()
  {
    return this.zza;
  }
  
  public final String zzh()
  {
    return this.zzc;
  }
  
  public final String zzi()
  {
    return this.zzb;
  }
  
  public final List zzj()
  {
    return this.zze;
  }
  
  public final String zzk()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcvb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */