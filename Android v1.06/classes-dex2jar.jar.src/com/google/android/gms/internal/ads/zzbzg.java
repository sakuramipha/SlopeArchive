package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class zzbzg
  implements zzaur
{
  final zzbzd zza;
  final HashSet zzb = new HashSet();
  final HashSet zzc = new HashSet();
  private final Object zzd = new Object();
  private final zzg zze;
  private final zzbze zzf;
  private boolean zzg = false;
  
  public zzbzg(String paramString, zzg paramzzg)
  {
    this.zza = new zzbzd(paramString, paramzzg);
    this.zze = paramzzg;
    this.zzf = new zzbze();
  }
  
  public final void zza(boolean paramBoolean)
  {
    long l2 = zzt.zzB().currentTimeMillis();
    if (paramBoolean)
    {
      long l1 = this.zze.zzd();
      zzbbc localzzbbc = zzbbk.zzaQ;
      if (l2 - l1 > ((Long)zzba.zzc().zzb(localzzbbc)).longValue()) {
        this.zza.zzd = -1;
      } else {
        this.zza.zzd = this.zze.zzc();
      }
      this.zzg = true;
      return;
    }
    this.zze.zzt(l2);
    this.zze.zzJ(this.zza.zzd);
  }
  
  public final zzbyv zzb(Clock paramClock, String paramString)
  {
    return new zzbyv(paramClock, this, this.zzf.zza(), paramString);
  }
  
  public final String zzc()
  {
    return this.zzf.zzb();
  }
  
  public final void zzd(zzbyv paramzzbyv)
  {
    synchronized (this.zzd)
    {
      this.zzb.add(paramzzbyv);
      return;
    }
  }
  
  public final void zze()
  {
    synchronized (this.zzd)
    {
      this.zza.zzb();
      return;
    }
  }
  
  public final void zzf()
  {
    synchronized (this.zzd)
    {
      this.zza.zzc();
      return;
    }
  }
  
  public final void zzg()
  {
    synchronized (this.zzd)
    {
      this.zza.zzd();
      return;
    }
  }
  
  public final void zzh()
  {
    synchronized (this.zzd)
    {
      this.zza.zze();
      return;
    }
  }
  
  public final void zzi(zzl paramzzl, long paramLong)
  {
    synchronized (this.zzd)
    {
      this.zza.zzf(paramzzl, paramLong);
      return;
    }
  }
  
  public final void zzj(HashSet paramHashSet)
  {
    synchronized (this.zzd)
    {
      this.zzb.addAll(paramHashSet);
      return;
    }
  }
  
  public final boolean zzk()
  {
    return this.zzg;
  }
  
  public final Bundle zzl(Context paramContext, zzfbg paramzzfbg)
  {
    HashSet localHashSet = new HashSet();
    synchronized (this.zzd)
    {
      localHashSet.addAll(this.zzb);
      this.zzb.clear();
      ??? = new Bundle();
      ((Bundle)???).putBundle("app", this.zza.zza(paramContext, this.zzf.zzb()));
      Object localObject2 = new Bundle();
      paramContext = this.zzc.iterator();
      if (!paramContext.hasNext())
      {
        ((Bundle)???).putBundle("slots", (Bundle)localObject2);
        localObject2 = new ArrayList();
        paramContext = localHashSet.iterator();
        while (paramContext.hasNext()) {
          ((ArrayList)localObject2).add(((zzbyv)paramContext.next()).zza());
        }
        ((Bundle)???).putParcelableArrayList("ads", (ArrayList)localObject2);
        paramzzfbg.zzc(localHashSet);
        return (Bundle)???;
      }
      paramContext = (zzbzf)paramContext.next();
      throw null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */