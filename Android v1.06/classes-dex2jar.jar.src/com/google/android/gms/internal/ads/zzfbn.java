package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

final class zzfbn
  implements zzfbm
{
  private final ConcurrentHashMap zza;
  private final zzfbt zzb;
  private final zzfbp zzc;
  
  public zzfbn(zzfbt paramzzfbt)
  {
    this.zza = new ConcurrentHashMap(paramzzfbt.zzd);
    this.zzb = paramzzfbt;
    this.zzc = new zzfbp();
  }
  
  private final void zzf()
  {
    Object localObject = zzfbt.CREATOR;
    localObject = zzbbk.zzgd;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.zzb.zzb);
      localStringBuilder.append(" PoolCollection");
      localStringBuilder.append(this.zzc.zzb());
      Iterator localIterator = this.zza.entrySet().iterator();
      int j;
      for (int i = 0;; i = j)
      {
        j = i;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        j = i + 1;
        localStringBuilder.append(j);
        localStringBuilder.append(". ");
        localStringBuilder.append(((Map.Entry)localObject).getValue());
        localStringBuilder.append("#");
        localStringBuilder.append(((zzfbw)((Map.Entry)localObject).getKey()).hashCode());
        localStringBuilder.append("    ");
        for (i = 0; i < ((zzfbl)((Map.Entry)localObject).getValue()).zzb(); i++) {
          localStringBuilder.append("[O]");
        }
        for (i = ((zzfbl)((Map.Entry)localObject).getValue()).zzb(); i < this.zzb.zzd; i++) {
          localStringBuilder.append("[ ]");
        }
        localStringBuilder.append("\n");
        localStringBuilder.append(((zzfbl)((Map.Entry)localObject).getValue()).zzg());
        localStringBuilder.append("\n");
      }
      while (j < this.zzb.zzc)
      {
        j++;
        localStringBuilder.append(j);
        localStringBuilder.append(".\n");
      }
      zzbzt.zze(localStringBuilder.toString());
    }
  }
  
  public final zzfbt zza()
  {
    return this.zzb;
  }
  
  public final zzfbv zzb(zzfbw paramzzfbw)
  {
    try
    {
      Object localObject = (zzfbl)this.zza.get(paramzzfbw);
      if (localObject != null)
      {
        paramzzfbw = ((zzfbl)localObject).zze();
        if (paramzzfbw == null) {
          this.zzc.zze();
        }
        zzfcj localzzfcj = ((zzfbl)localObject).zzf();
        if (paramzzfbw != null)
        {
          zzaxm localzzaxm = zzaxs.zza();
          zzaxk localzzaxk = zzaxl.zza();
          localzzaxk.zzd(2);
          localObject = zzaxp.zza();
          ((zzaxo)localObject).zza(localzzfcj.zza);
          ((zzaxo)localObject).zzb(localzzfcj.zzb);
          localzzaxk.zza((zzaxo)localObject);
          localzzaxm.zza(localzzaxk);
          localObject = (zzaxs)localzzaxm.zzal();
          paramzzfbw.zza.zzb().zzc().zze((zzaxs)localObject);
        }
        zzf();
      }
      else
      {
        this.zzc.zzf();
        zzf();
        paramzzfbw = null;
      }
      return paramzzfbw;
    }
    finally {}
  }
  
  @Deprecated
  public final zzfbw zzc(zzl paramzzl, String paramString, zzw paramzzw)
  {
    return new zzfbx(paramzzl, paramString, new zzbuk(this.zzb.zza).zza().zzk, this.zzb.zzf, paramzzw);
  }
  
  public final boolean zzd(zzfbw paramzzfbw, zzfbv paramzzfbv)
  {
    try
    {
      Object localObject2 = (zzfbl)this.zza.get(paramzzfbw);
      paramzzfbv.zzd = zzt.zzB().currentTimeMillis();
      Object localObject1 = localObject2;
      Object localObject3;
      Object localObject4;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/internal/ads/zzfbl;
        localObject1 = this.zzb;
        ((zzfbl)localObject2).<init>(((zzfbt)localObject1).zzd, ((zzfbt)localObject1).zze * 1000);
        int i = this.zza.size();
        localObject1 = this.zzb;
        if (i == ((zzfbt)localObject1).zzc)
        {
          int j = ((zzfbt)localObject1).zzg;
          i = j - 1;
          localObject3 = null;
          localObject4 = null;
          localObject1 = null;
          if (j != 0)
          {
            long l = Long.MAX_VALUE;
            if (i != 0)
            {
              if (i != 1)
              {
                if (i == 2)
                {
                  localObject3 = this.zza.entrySet().iterator();
                  i = Integer.MAX_VALUE;
                  while (((Iterator)localObject3).hasNext())
                  {
                    localObject4 = (Map.Entry)((Iterator)localObject3).next();
                    if (((zzfbl)((Map.Entry)localObject4).getValue()).zza() < i)
                    {
                      i = ((zzfbl)((Map.Entry)localObject4).getValue()).zza();
                      localObject1 = (zzfbw)((Map.Entry)localObject4).getKey();
                    }
                  }
                  if (localObject1 != null) {
                    this.zza.remove(localObject1);
                  }
                }
              }
              else
              {
                localObject4 = this.zza.entrySet().iterator();
                localObject1 = localObject3;
                while (((Iterator)localObject4).hasNext())
                {
                  localObject3 = (Map.Entry)((Iterator)localObject4).next();
                  if (((zzfbl)((Map.Entry)localObject3).getValue()).zzd() < l)
                  {
                    l = ((zzfbl)((Map.Entry)localObject3).getValue()).zzd();
                    localObject1 = (zzfbw)((Map.Entry)localObject3).getKey();
                  }
                }
                if (localObject1 != null) {
                  this.zza.remove(localObject1);
                }
              }
            }
            else
            {
              localObject3 = this.zza.entrySet().iterator();
              localObject1 = localObject4;
              while (((Iterator)localObject3).hasNext())
              {
                localObject4 = (Map.Entry)((Iterator)localObject3).next();
                if (((zzfbl)((Map.Entry)localObject4).getValue()).zzc() < l)
                {
                  l = ((zzfbl)((Map.Entry)localObject4).getValue()).zzc();
                  localObject1 = (zzfbw)((Map.Entry)localObject4).getKey();
                }
              }
              if (localObject1 != null) {
                this.zza.remove(localObject1);
              }
            }
            this.zzc.zzg();
          }
          else
          {
            throw null;
          }
        }
        this.zza.put(paramzzfbw, localObject2);
        this.zzc.zzd();
        localObject1 = localObject2;
      }
      boolean bool = ((zzfbl)localObject1).zzh(paramzzfbv);
      this.zzc.zzc();
      paramzzfbw = this.zzc.zza();
      localObject1 = ((zzfbl)localObject1).zzf();
      if (paramzzfbv != null)
      {
        localObject3 = zzaxs.zza();
        localObject4 = zzaxl.zza();
        ((zzaxk)localObject4).zzd(2);
        localObject2 = zzaxr.zza();
        ((zzaxq)localObject2).zza(paramzzfbw.zza);
        ((zzaxq)localObject2).zzb(paramzzfbw.zzb);
        ((zzaxq)localObject2).zzc(((zzfcj)localObject1).zzb);
        ((zzaxk)localObject4).zzc((zzaxq)localObject2);
        ((zzaxm)localObject3).zza((zzaxk)localObject4);
        paramzzfbw = (zzaxs)((zzgos)localObject3).zzal();
        paramzzfbv.zza.zzb().zzc().zzf(paramzzfbw);
      }
      zzf();
      return bool;
    }
    finally {}
  }
  
  public final boolean zze(zzfbw paramzzfbw)
  {
    try
    {
      paramzzfbw = (zzfbl)this.zza.get(paramzzfbw);
      if (paramzzfbw != null)
      {
        int i = paramzzfbw.zzb();
        int j = this.zzb.zzd;
        return i < j;
      }
      return true;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */