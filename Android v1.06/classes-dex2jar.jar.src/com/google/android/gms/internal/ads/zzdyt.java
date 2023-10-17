package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class zzdyt
  extends zzbtv
{
  private final Context zza;
  private final zzery zzb;
  private final zzerw zzc;
  private final zzdzb zzd;
  private final zzfwc zze;
  private final zzdyy zzf;
  private final zzbus zzg;
  
  zzdyt(Context paramContext, zzery paramzzery, zzerw paramzzerw, zzdyy paramzzdyy, zzdzb paramzzdzb, zzfwc paramzzfwc, zzbus paramzzbus)
  {
    this.zza = paramContext;
    this.zzb = paramzzery;
    this.zzc = paramzzerw;
    this.zzf = paramzzdyy;
    this.zzd = paramzzdzb;
    this.zze = paramzzfwc;
    this.zzg = paramzzbus;
  }
  
  private final void zzc(zzfwb paramzzfwb, zzbtz paramzzbtz)
  {
    zzfvr.zzq(zzfvr.zzm(zzfvi.zzv(paramzzfwb), new zzdyl(this), zzcag.zza), new zzdys(this, paramzzbtz), zzcag.zzf);
  }
  
  public final zzfwb zzb(zzbto paramzzbto, int paramInt)
  {
    String str = paramzzbto.zza;
    int i = paramzzbto.zzb;
    Bundle localBundle = paramzzbto.zzc;
    HashMap localHashMap = new HashMap();
    Object localObject3;
    if (localBundle != null)
    {
      localObject1 = localBundle.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localObject3 = localBundle.getString((String)localObject2);
        if (localObject3 != null) {
          localHashMap.put(localObject2, localObject3);
        }
      }
    }
    Object localObject2 = new zzdyv(str, i, localHashMap, paramzzbto.zzd, "", paramzzbto.zze);
    Object localObject1 = this.zzc;
    ((zzerw)localObject1).zza(new zzetd(paramzzbto));
    localObject1 = ((zzerw)localObject1).zzb();
    if (((zzdyv)localObject2).zzf)
    {
      paramzzbto = paramzzbto.zza;
      localObject3 = (String)zzbdk.zzc.zze();
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        paramzzbto = Uri.parse(paramzzbto).getHost();
        if (!TextUtils.isEmpty(paramzzbto))
        {
          localObject3 = zzfpm.zzc(zzfok.zzc(';')).zzd((CharSequence)localObject3).iterator();
          while (((Iterator)localObject3).hasNext()) {
            if (paramzzbto.endsWith((String)((Iterator)localObject3).next()))
            {
              paramzzbto = zzfvr.zzl(((zzerx)localObject1).zza().zza(new JSONObject()), new zzdyr((zzdyv)localObject2), this.zze);
              break label287;
            }
          }
        }
      }
    }
    paramzzbto = zzfvr.zzh(localObject2);
    label287:
    localObject1 = ((zzerx)localObject1).zzb();
    localObject2 = new zzdyx(this.zza, "", this.zzg, paramInt);
    return zzfvr.zzm(((zzfdv)localObject1).zzb(zzfdx.zzi, paramzzbto).zze((zzfdg)localObject2).zza(), zzdyn.zza, this.zze);
  }
  
  public final void zze(zzbto paramzzbto, zzbtz paramzzbtz)
  {
    zzc(zzb(paramzzbto, Binder.getCallingUid()), paramzzbtz);
  }
  
  public final void zzf(zzbtk paramzzbtk, zzbtz paramzzbtz)
  {
    int i = Binder.getCallingUid();
    Object localObject = this.zzb;
    ((zzery)localObject).zza(new zzern(paramzzbtk, i));
    zzerz localzzerz = ((zzery)localObject).zzb();
    paramzzbtk = localzzerz.zzb();
    zzdyo localzzdyo = zzdyo.zza;
    localObject = zzdyp.zza;
    paramzzbtk = paramzzbtk.zzb(zzfdx.zze, zzfvr.zzi()).zzf(new zzdyq(localzzerz)).zze((zzfdg)localObject).zzf(localzzdyo).zza();
    zzc(paramzzbtk, paramzzbtz);
    if (((Boolean)zzbdd.zzd.zze()).booleanValue())
    {
      paramzzbtz = this.zzd;
      paramzzbtz.getClass();
      paramzzbtk.zzc(new zzdym(paramzzbtz), this.zze);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdyt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */