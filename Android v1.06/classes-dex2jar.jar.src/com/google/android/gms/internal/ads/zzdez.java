package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;

public final class zzdez
  implements zzcww, zzo, zzcwc
{
  zzfgo zza;
  private final Context zzb;
  private final zzcfb zzc;
  private final zzezf zzd;
  private final zzbzz zze;
  private final zzaxh zzf;
  
  public zzdez(Context paramContext, zzcfb paramzzcfb, zzezf paramzzezf, zzbzz paramzzbzz, zzaxh paramzzaxh)
  {
    this.zzb = paramContext;
    this.zzc = paramzzcfb;
    this.zzd = paramzzezf;
    this.zze = paramzzbzz;
    this.zzf = paramzzaxh;
  }
  
  public final void zzb()
  {
    if ((this.zza != null) && (this.zzc != null))
    {
      zzbbc localzzbbc = zzbbk.zzeP;
      if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        this.zzc.zzd("onSdkImpression", new ArrayMap());
      }
    }
  }
  
  public final void zzbF() {}
  
  public final void zzbo() {}
  
  public final void zzby() {}
  
  public final void zze() {}
  
  public final void zzf(int paramInt)
  {
    this.zza = null;
  }
  
  public final void zzl()
  {
    if ((this.zza != null) && (this.zzc != null))
    {
      zzbbc localzzbbc = zzbbk.zzeP;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        this.zzc.zzd("onSdkImpression", new ArrayMap());
      }
    }
  }
  
  public final void zzn()
  {
    Object localObject1;
    if (this.zzf != zzaxh.zzh)
    {
      localObject1 = this.zzf;
      if ((localObject1 != zzaxh.zzd) && (localObject1 != zzaxh.zzk)) {}
    }
    else if ((this.zzd.zzU) && (this.zzc != null) && (zzt.zzA().zze(this.zzb)))
    {
      localObject1 = this.zze;
      int j = ((zzbzz)localObject1).zzb;
      int i = ((zzbzz)localObject1).zzc;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(j);
      ((StringBuilder)localObject1).append(".");
      ((StringBuilder)localObject1).append(i);
      String str1 = ((StringBuilder)localObject1).toString();
      String str2 = this.zzd.zzW.zza();
      Object localObject2;
      Object localObject3;
      if (this.zzd.zzW.zzb() == 1)
      {
        localObject1 = zzebt.zzc;
        localObject2 = zzebu.zzb;
        localObject3 = localObject1;
      }
      else
      {
        if (this.zzd.zzZ == 2) {
          localObject1 = zzebu.zzd;
        } else {
          localObject1 = zzebu.zza;
        }
        localObject3 = zzebt.zza;
        localObject2 = localObject1;
      }
      localObject1 = zzt.zzA().zza(str1, this.zzc.zzG(), "", "javascript", str2, (zzebu)localObject2, (zzebt)localObject3, this.zzd.zzam);
      this.zza = ((zzfgo)localObject1);
      if (localObject1 != null)
      {
        zzt.zzA().zzc(this.zza, (View)this.zzc);
        this.zzc.zzap(this.zza);
        zzt.zzA().zzd(this.zza);
        this.zzc.zzd("onSdkLoaded", new ArrayMap());
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */