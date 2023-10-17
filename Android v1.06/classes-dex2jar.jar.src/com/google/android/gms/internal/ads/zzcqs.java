package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzcqs
  implements zzcww, zzcwc
{
  private final Context zza;
  private final zzcfb zzb;
  private final zzezf zzc;
  private final zzbzz zzd;
  private zzfgo zze;
  private boolean zzf;
  
  public zzcqs(Context paramContext, zzcfb paramzzcfb, zzezf paramzzezf, zzbzz paramzzbzz)
  {
    this.zza = paramContext;
    this.zzb = paramzzcfb;
    this.zzc = paramzzezf;
    this.zzd = paramzzbzz;
  }
  
  private final void zza()
  {
    try
    {
      boolean bool = this.zzc.zzU;
      if (!bool) {
        return;
      }
      Object localObject1 = this.zzb;
      if (localObject1 == null) {
        return;
      }
      bool = zzt.zzA().zze(this.zza);
      if (!bool) {
        return;
      }
      localObject1 = this.zzd;
      int j = ((zzbzz)localObject1).zzb;
      int i = ((zzbzz)localObject1).zzc;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(j);
      ((StringBuilder)localObject1).append(".");
      ((StringBuilder)localObject1).append(i);
      String str1 = ((StringBuilder)localObject1).toString();
      String str2 = this.zzc.zzW.zza();
      if (this.zzc.zzW.zzb() == 1)
      {
        localObject3 = zzebt.zzc;
        localObject1 = zzebu.zzb;
      }
      for (;;)
      {
        break;
        localObject3 = zzebt.zza;
        if (this.zzc.zzf == 1) {
          localObject1 = zzebu.zzc;
        } else {
          localObject1 = zzebu.zza;
        }
      }
      Object localObject3 = zzt.zzA().zza(str1, this.zzb.zzG(), "", "javascript", str2, (zzebu)localObject1, (zzebt)localObject3, this.zzc.zzam);
      this.zze = ((zzfgo)localObject3);
      localObject1 = this.zzb;
      if (localObject3 != null)
      {
        zzt.zzA().zzc(this.zze, (View)localObject1);
        this.zzb.zzap(this.zze);
        zzt.zzA().zzd(this.zze);
        this.zzf = true;
        localObject3 = this.zzb;
        localObject1 = new androidx/collection/ArrayMap;
        ((ArrayMap)localObject1).<init>();
        ((zzcfb)localObject3).zzd("onSdkLoaded", (Map)localObject1);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzl()
  {
    try
    {
      if (!this.zzf) {
        zza();
      }
      if ((this.zzc.zzU) && (this.zze != null))
      {
        zzcfb localzzcfb = this.zzb;
        if (localzzcfb != null)
        {
          ArrayMap localArrayMap = new androidx/collection/ArrayMap;
          localArrayMap.<init>();
          localzzcfb.zzd("onSdkImpression", localArrayMap);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzn()
  {
    try
    {
      boolean bool = this.zzf;
      if (bool) {
        return;
      }
      zza();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */