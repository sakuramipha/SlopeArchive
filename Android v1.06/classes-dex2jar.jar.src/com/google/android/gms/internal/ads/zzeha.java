package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.Iterator;
import java.util.List;

public final class zzeha
  implements zzebv
{
  private final zzebx zza;
  private final zzecb zzb;
  private final zzfed zzc;
  private final zzfwc zzd;
  
  public zzeha(zzfed paramzzfed, zzfwc paramzzfwc, zzebx paramzzebx, zzecb paramzzecb)
  {
    this.zzc = paramzzfed;
    this.zzd = paramzzfwc;
    this.zzb = paramzzecb;
    this.zza = paramzzebx;
  }
  
  static final String zze(String paramString, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Error from: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(", code: ");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    Object localObject2 = paramzzezf.zzu.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject1 = (String)((Iterator)localObject2).next();
      try
      {
        localObject1 = this.zza.zza((String)localObject1, paramzzezf.zzw);
      }
      catch (zzfaf localzzfaf) {}
    }
    zzeby localzzeby = null;
    if (localzzeby == null) {
      return zzfvr.zzg(new zzeex("Unable to instantiate mediation adapter class."));
    }
    zzcal localzzcal = new zzcal();
    localObject2 = new zzegz(this, localzzeby, localzzcal);
    localzzeby.zzc.zza((zzcwr)localObject2);
    if (paramzzezf.zzN)
    {
      Bundle localBundle = paramzzezr.zza.zza.zzd.zzm;
      localObject3 = localBundle.getBundle(AdMobAdapter.class.getName());
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject2 = new Bundle();
        localBundle.putBundle(AdMobAdapter.class.getName(), (Bundle)localObject2);
      }
      ((Bundle)localObject2).putBoolean("render_test_ad_label", true);
    }
    localObject2 = this.zzc;
    Object localObject3 = zzfdx.zzp;
    return zzfdn.zzd(new zzegx(this, paramzzezr, paramzzezf, localzzeby), this.zzd, localObject3, (zzfdv)localObject2).zzb(zzfdx.zzq).zzd(localzzcal).zzb(zzfdx.zzr).zze(new zzegy(this, paramzzezr, paramzzezf, localzzeby)).zza();
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    return !paramzzezf.zzu.isEmpty();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */