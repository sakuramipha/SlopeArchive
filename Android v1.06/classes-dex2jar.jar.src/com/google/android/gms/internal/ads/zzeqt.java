package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzeqt
{
  private final Context zza;
  private final Set zzb;
  private final Executor zzc;
  private final zzffq zzd;
  private final zzdqc zze;
  
  public zzeqt(Context paramContext, Executor paramExecutor, Set paramSet, zzffq paramzzffq, zzdqc paramzzdqc)
  {
    this.zza = paramContext;
    this.zzc = paramExecutor;
    this.zzb = paramSet;
    this.zzd = paramzzffq;
    this.zze = paramzzdqc;
  }
  
  public final zzfwb zza(Object paramObject)
  {
    zzfff localzzfff = zzffe.zza(this.zza, 8);
    localzzfff.zzh();
    ArrayList localArrayList = new ArrayList(this.zzb.size());
    Iterator localIterator = this.zzb.iterator();
    while (localIterator.hasNext())
    {
      zzeqq localzzeqq = (zzeqq)localIterator.next();
      zzfwb localzzfwb = localzzeqq.zzb();
      localzzfwb.zzc(new zzeqr(this, zzt.zzB().elapsedRealtime(), localzzeqq), zzcag.zzf);
      localArrayList.add(localzzfwb);
    }
    paramObject = zzfvr.zzb(localArrayList).zza(new zzeqs(localArrayList, paramObject), this.zzc);
    if (zzfft.zza()) {
      zzffp.zza((zzfwb)paramObject, this.zzd, localzzfff);
    }
    return (zzfwb)paramObject;
  }
  
  public final void zzb(long paramLong, zzeqq paramzzeqq)
  {
    paramLong = zzt.zzB().elapsedRealtime() - paramLong;
    if (((Boolean)zzbdh.zza.zze()).booleanValue())
    {
      localObject = zzfpo.zzc(paramzzeqq.getClass().getCanonicalName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Signal runtime (ms) : ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" = ");
      localStringBuilder.append(paramLong);
      zze.zza(localStringBuilder.toString());
    }
    Object localObject = zzbbk.zzbT;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    localObject = this.zze.zza();
    ((zzdqb)localObject).zzb("action", "lat_ms");
    ((zzdqb)localObject).zzb("lat_grp", "sig_lat_grp");
    ((zzdqb)localObject).zzb("lat_id", String.valueOf(paramzzeqq.zza()));
    ((zzdqb)localObject).zzb("clat_ms", String.valueOf(paramLong));
    paramzzeqq = zzbbk.zzbU;
    if (((Boolean)zzba.zzc().zzb(paramzzeqq)).booleanValue()) {
      ((zzdqb)localObject).zzb("seq_num", zzt.zzo().zzg().zzc());
    }
    ((zzdqb)localObject).zzh();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */