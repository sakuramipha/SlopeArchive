package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzdhw;
import com.google.android.gms.internal.ads.zzdhy;
import com.google.android.gms.internal.ads.zzdrk;
import com.google.android.gms.internal.ads.zzdrl;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzeuf;
import com.google.android.gms.internal.ads.zzeug;
import com.google.android.gms.internal.ads.zzevt;
import com.google.android.gms.internal.ads.zzevu;
import com.google.android.gms.internal.ads.zzexk;
import com.google.android.gms.internal.ads.zzexl;
import com.google.android.gms.internal.ads.zzeyy;
import com.google.android.gms.internal.ads.zzeyz;
import java.util.HashMap;

public class ClientApi
  extends zzcd
{
  public final zzbq zzb(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    return new zzeii(zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt), paramIObjectWrapper, paramString);
  }
  
  public final zzbu zzc(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzq = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzr();
    paramzzq.zza(paramString);
    paramzzq.zzb(paramIObjectWrapper);
    paramIObjectWrapper = paramzzq.zzc();
    paramzzq = zzbbk.zzeV;
    if (paramInt >= ((Integer)zzba.zzc().zzb(paramzzq)).intValue()) {
      return paramIObjectWrapper.zza();
    }
    return new zzew();
  }
  
  public final zzbu zzd(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzbny = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzs();
    paramzzbny.zzc(paramIObjectWrapper);
    paramzzbny.zza(paramzzq);
    paramzzbny.zzb(paramString);
    return paramzzbny.zzd().zza();
  }
  
  public final zzbu zze(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzbny = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzt();
    paramzzbny.zzc(paramIObjectWrapper);
    paramzzbny.zza(paramzzq);
    paramzzbny.zzb(paramString);
    return paramzzbny.zzd().zza();
  }
  
  public final zzbu zzf(IObjectWrapper paramIObjectWrapper, zzq paramzzq, String paramString, int paramInt)
  {
    return new zzs((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramzzq, paramString, new zzbzz(231700000, paramInt, true, false));
  }
  
  public final zzco zzg(IObjectWrapper paramIObjectWrapper, int paramInt)
  {
    return zzcgw.zza((Context)ObjectWrapper.unwrap(paramIObjectWrapper), null, paramInt).zzb();
  }
  
  public final zzdj zzh(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
  {
    return zzcgw.zza((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramzzbny, paramInt).zzk();
  }
  
  public final zzbeu zzi(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2)
  {
    return new zzdhy((FrameLayout)ObjectWrapper.unwrap(paramIObjectWrapper1), (FrameLayout)ObjectWrapper.unwrap(paramIObjectWrapper2), 231700000);
  }
  
  public final zzbfa zzj(IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
  {
    return new zzdhw((View)ObjectWrapper.unwrap(paramIObjectWrapper1), (HashMap)ObjectWrapper.unwrap(paramIObjectWrapper2), (HashMap)ObjectWrapper.unwrap(paramIObjectWrapper3));
  }
  
  public final zzbji zzk(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt, zzbjf paramzzbjf)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzbny = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzi();
    paramzzbny.zzb(paramIObjectWrapper);
    paramzzbny.zza(paramzzbjf);
    return paramzzbny.zzc().zzd();
  }
  
  public final zzbro zzl(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
  {
    return zzcgw.zza((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramzzbny, paramInt).zzl();
  }
  
  public final zzbrv zzm(IObjectWrapper paramIObjectWrapper)
  {
    Activity localActivity = (Activity)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramIObjectWrapper = AdOverlayInfoParcel.zza(localActivity.getIntent());
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = new zzt(localActivity);
    }
    else
    {
      int i = paramIObjectWrapper.zzk;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                paramIObjectWrapper = new zzt(localActivity);
              } else {
                paramIObjectWrapper = new zzac(localActivity);
              }
            }
            else {
              paramIObjectWrapper = new zzy(localActivity, paramIObjectWrapper);
            }
          }
          else {
            paramIObjectWrapper = new zzaf(localActivity);
          }
        }
        else {
          paramIObjectWrapper = new zzae(localActivity);
        }
      }
      else {
        paramIObjectWrapper = new com.google.android.gms.ads.internal.overlay.zzs(localActivity);
      }
    }
    return paramIObjectWrapper;
  }
  
  public final zzbuz zzn(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzbny = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzu();
    paramzzbny.zzb(paramIObjectWrapper);
    return paramzzbny.zzc().zzb();
  }
  
  public final zzbvp zzo(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramzzbny = zzcgw.zza(paramIObjectWrapper, paramzzbny, paramInt).zzu();
    paramzzbny.zzb(paramIObjectWrapper);
    paramzzbny.zza(paramString);
    return paramzzbny.zzc().zza();
  }
  
  public final zzbyk zzp(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
  {
    return zzcgw.zza((Context)ObjectWrapper.unwrap(paramIObjectWrapper), paramzzbny, paramInt).zzo();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\ClientApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */