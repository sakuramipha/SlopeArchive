package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class zzccd
{
  private final Context zza;
  private final String zzb;
  private final zzbzz zzc;
  private final zzbbz zzd;
  private final zzbcc zze;
  private final zzbf zzf;
  private final long[] zzg;
  private final String[] zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  private zzcbi zzn;
  private boolean zzo;
  private boolean zzp;
  private long zzq;
  
  public zzccd(Context paramContext, zzbzz paramzzbzz, String paramString, zzbcc paramzzbcc, zzbbz paramzzbbz)
  {
    zzbd localzzbd = new zzbd();
    localzzbd.zza("min_1", Double.MIN_VALUE, 1.0D);
    localzzbd.zza("1_5", 1.0D, 5.0D);
    localzzbd.zza("5_10", 5.0D, 10.0D);
    localzzbd.zza("10_20", 10.0D, 20.0D);
    localzzbd.zza("20_30", 20.0D, 30.0D);
    localzzbd.zza("30_max", 30.0D, Double.MAX_VALUE);
    this.zzf = localzzbd.zzb();
    int i = 0;
    this.zzi = false;
    this.zzj = false;
    this.zzk = false;
    this.zzl = false;
    this.zzq = -1L;
    this.zza = paramContext;
    this.zzc = paramzzbzz;
    this.zzb = paramString;
    this.zze = paramzzbcc;
    this.zzd = paramzzbbz;
    paramContext = zzbbk.zzA;
    paramContext = (String)zzba.zzc().zzb(paramContext);
    if (paramContext == null)
    {
      this.zzh = new String[0];
      this.zzg = new long[0];
      return;
    }
    paramzzbzz = TextUtils.split(paramContext, ",");
    int j = paramzzbzz.length;
    this.zzh = new String[j];
    this.zzg = new long[j];
    while (i < paramzzbzz.length)
    {
      try
      {
        this.zzg[i] = Long.parseLong(paramzzbzz[i]);
      }
      catch (NumberFormatException paramContext)
      {
        zzbzt.zzk("Unable to parse frame hash target time number.", paramContext);
        this.zzg[i] = -1L;
      }
      i++;
    }
  }
  
  public final void zza(zzcbi paramzzcbi)
  {
    zzbbu.zza(this.zze, this.zzd, new String[] { "vpc2" });
    this.zzi = true;
    this.zze.zzd("vpn", paramzzcbi.zzj());
    this.zzn = paramzzcbi;
  }
  
  public final void zzb()
  {
    if ((this.zzi) && (!this.zzj))
    {
      zzbbu.zza(this.zze, this.zzd, new String[] { "vfr2" });
      this.zzj = true;
    }
  }
  
  public final void zzc()
  {
    this.zzm = true;
    if ((this.zzj) && (!this.zzk))
    {
      zzbbu.zza(this.zze, this.zzd, new String[] { "vfp2" });
      this.zzk = true;
    }
  }
  
  public final void zzd()
  {
    if ((((Boolean)zzbds.zza.zze()).booleanValue()) && (!this.zzo))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.zzb);
      localBundle.putString("player", this.zzn.zzj());
      Object localObject1 = this.zzf.zza().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zzbc)((Iterator)localObject1).next();
        String str = String.valueOf(((zzbc)localObject2).zza);
        localObject3 = Integer.toString(((zzbc)localObject2).zze);
        localBundle.putString("fps_c_".concat(str), (String)localObject3);
        localObject3 = String.valueOf(((zzbc)localObject2).zza);
        localObject2 = Double.toString(((zzbc)localObject2).zzd);
        localBundle.putString("fps_p_".concat((String)localObject3), (String)localObject2);
      }
      for (int i = 0;; i++)
      {
        localObject2 = this.zzg;
        if (i >= localObject2.length) {
          break;
        }
        localObject1 = this.zzh[i];
        if (localObject1 != null)
        {
          localObject2 = Long.valueOf(localObject2[i]);
          Objects.toString(localObject2);
          localBundle.putString("fh_".concat(localObject2.toString()), (String)localObject1);
        }
      }
      zzt.zzp();
      localObject1 = this.zza;
      Object localObject2 = this.zzc.zza;
      zzt.zzp();
      localBundle.putString("device", zzs.zzp());
      Object localObject3 = zzbbk.zza;
      localBundle.putString("eids", TextUtils.join(",", zzba.zza().zza()));
      zzay.zzb();
      zzbzm.zzw((Context)localObject1, (String)localObject2, "gmob-apps", localBundle, true, new zzk((Context)localObject1, (String)localObject2));
      this.zzo = true;
    }
  }
  
  public final void zze()
  {
    this.zzm = false;
  }
  
  public final void zzf(zzcbi paramzzcbi)
  {
    if ((this.zzk) && (!this.zzl))
    {
      if ((zze.zzc()) && (!this.zzl)) {
        zze.zza("VideoMetricsMixin first frame");
      }
      zzbbu.zza(this.zze, this.zzd, new String[] { "vff2" });
      this.zzl = true;
    }
    long l2 = zzt.zzB().nanoTime();
    if ((this.zzm) && (this.zzp) && (this.zzq != -1L))
    {
      double d = TimeUnit.SECONDS.toNanos(1L);
      l1 = this.zzq;
      this.zzf.zzb(d / (l2 - l1));
    }
    this.zzp = this.zzm;
    this.zzq = l2;
    Object localObject = zzbbk.zzB;
    l2 = ((Long)zzba.zzc().zzb((zzbbc)localObject)).longValue();
    long l1 = paramzzcbi.zza();
    for (int i = 0;; i++)
    {
      localObject = this.zzh;
      if (i >= localObject.length) {
        break;
      }
      if (localObject[i] == null)
      {
        while (l2 <= Math.abs(l1 - this.zzg[i])) {}
        localObject = this.zzh;
        paramzzcbi = paramzzcbi.getBitmap(8, 8);
        l1 = 63L;
        l2 = 0L;
        for (int j = 0; j < 8; j++) {
          for (int k = 0; k < 8; k++)
          {
            int m = paramzzcbi.getPixel(k, j);
            long l3;
            if (Color.blue(m) + Color.red(m) + Color.green(m) > 128) {
              l3 = 1L;
            } else {
              l3 = 0L;
            }
            l2 |= l3 << (int)l1;
            l1 -= 1L;
          }
        }
        localObject[i] = String.format("%016X", new Object[] { Long.valueOf(l2) });
        return;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */