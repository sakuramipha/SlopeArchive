package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class zzkx
{
  private final zzof zza;
  private final List zzb;
  private final IdentityHashMap zzc;
  private final Map zzd;
  private final zzkw zze;
  private final HashMap zzf;
  private final Set zzg;
  private final zzls zzh;
  private final zzei zzi;
  private boolean zzj;
  private zzgz zzk;
  private zzvf zzl;
  
  public zzkx(zzkw paramzzkw, zzls paramzzls, zzei paramzzei, zzof paramzzof)
  {
    this.zza = paramzzof;
    this.zze = paramzzkw;
    this.zzl = new zzvf(0);
    this.zzc = new IdentityHashMap();
    this.zzd = new HashMap();
    this.zzb = new ArrayList();
    this.zzh = paramzzls;
    this.zzi = paramzzei;
    this.zzf = new HashMap();
    this.zzg = new HashSet();
  }
  
  private final void zzp(int paramInt1, int paramInt2)
  {
    while (paramInt1 < this.zzb.size())
    {
      zzkv localzzkv = (zzkv)this.zzb.get(paramInt1);
      localzzkv.zzd += paramInt2;
      paramInt1++;
    }
  }
  
  private final void zzq(zzkv paramzzkv)
  {
    paramzzkv = (zzku)this.zzf.get(paramzzkv);
    if (paramzzkv != null) {
      paramzzkv.zza.zzi(paramzzkv.zzb);
    }
  }
  
  private final void zzr()
  {
    Iterator localIterator = this.zzg.iterator();
    while (localIterator.hasNext())
    {
      zzkv localzzkv = (zzkv)localIterator.next();
      if (localzzkv.zzc.isEmpty())
      {
        zzq(localzzkv);
        localIterator.remove();
      }
    }
  }
  
  private final void zzs(zzkv paramzzkv)
  {
    if ((paramzzkv.zze) && (paramzzkv.zzc.isEmpty()))
    {
      zzku localzzku = (zzku)this.zzf.remove(paramzzkv);
      Objects.requireNonNull(localzzku);
      localzzku.zza.zzp(localzzku.zzb);
      localzzku.zza.zzs(localzzku.zzc);
      localzzku.zza.zzr(localzzku.zzc);
      this.zzg.remove(paramzzkv);
    }
  }
  
  private final void zzt(zzkv paramzzkv)
  {
    zztg localzztg = paramzzkv.zza;
    zzkn localzzkn = new zzkn(this);
    zzkt localzzkt = new zzkt(this, paramzzkv);
    this.zzf.put(paramzzkv, new zzku(localzztg, localzzkn, localzzkt));
    localzztg.zzh(new Handler(zzfn.zzt(), null), localzzkt);
    localzztg.zzg(new Handler(zzfn.zzt(), null), localzzkt);
    localzztg.zzm(localzzkn, this.zzk, this.zza);
  }
  
  private final void zzu(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i = paramInt2 - 1;
      if (i < paramInt1) {
        break;
      }
      zzkv localzzkv = (zzkv)this.zzb.remove(i);
      this.zzd.remove(localzzkv.zzb);
      zzp(i, -localzzkv.zza.zzB().zzc());
      localzzkv.zze = true;
      paramInt2 = i;
      if (this.zzj)
      {
        zzs(localzzkv);
        paramInt2 = i;
      }
    }
  }
  
  public final int zza()
  {
    return this.zzb.size();
  }
  
  public final zzcx zzb()
  {
    if (!this.zzb.isEmpty())
    {
      int j = 0;
      int i = 0;
      while (j < this.zzb.size())
      {
        zzkv localzzkv = (zzkv)this.zzb.get(j);
        localzzkv.zzd = i;
        i += localzzkv.zza.zzB().zzc();
        j++;
      }
      return new zzlc(this.zzb, this.zzl);
    }
    return zzcx.zza;
  }
  
  public final void zzf(zzgz paramzzgz)
  {
    zzdy.zzf(this.zzj ^ true);
    this.zzk = paramzzgz;
    for (int i = 0; i < this.zzb.size(); i++)
    {
      paramzzgz = (zzkv)this.zzb.get(i);
      zzt(paramzzgz);
      this.zzg.add(paramzzgz);
    }
    this.zzj = true;
  }
  
  public final void zzg()
  {
    Iterator localIterator = this.zzf.values().iterator();
    while (localIterator.hasNext())
    {
      zzku localzzku = (zzku)localIterator.next();
      try
      {
        localzzku.zza.zzp(localzzku.zzb);
      }
      catch (RuntimeException localRuntimeException)
      {
        zzer.zzc("MediaSourceList", "Failed to release child source.", localRuntimeException);
      }
      localzzku.zza.zzs(localzzku.zzc);
      localzzku.zza.zzr(localzzku.zzc);
    }
    this.zzf.clear();
    this.zzg.clear();
    this.zzj = false;
  }
  
  public final void zzh(zztj paramzztj)
  {
    zzkv localzzkv = (zzkv)this.zzc.remove(paramzztj);
    Objects.requireNonNull(localzzkv);
    localzzkv.zza.zzF(paramzztj);
    localzzkv.zzc.remove(((zztd)paramzztj).zza);
    if (!this.zzc.isEmpty()) {
      zzr();
    }
    zzs(localzzkv);
  }
  
  public final boolean zzi()
  {
    return this.zzj;
  }
  
  public final zzcx zzj(int paramInt, List paramList, zzvf paramzzvf)
  {
    if (!paramList.isEmpty())
    {
      this.zzl = paramzzvf;
      for (int i = paramInt; i < paramList.size() + paramInt; i++)
      {
        paramzzvf = (zzkv)paramList.get(i - paramInt);
        if (i > 0)
        {
          zzkv localzzkv = (zzkv)this.zzb.get(i - 1);
          zzcx localzzcx = localzzkv.zza.zzB();
          paramzzvf.zzc(localzzkv.zzd + localzzcx.zzc());
        }
        else
        {
          paramzzvf.zzc(0);
        }
        zzp(i, paramzzvf.zza.zzB().zzc());
        this.zzb.add(i, paramzzvf);
        this.zzd.put(paramzzvf.zzb, paramzzvf);
        if (this.zzj)
        {
          zzt(paramzzvf);
          if (this.zzc.isEmpty()) {
            this.zzg.add(paramzzvf);
          } else {
            zzq(paramzzvf);
          }
        }
      }
    }
    return zzb();
  }
  
  public final zzcx zzk(int paramInt1, int paramInt2, int paramInt3, zzvf paramzzvf)
  {
    boolean bool;
    if (zza() >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    this.zzl = null;
    return zzb();
  }
  
  public final zzcx zzl(int paramInt1, int paramInt2, zzvf paramzzvf)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 >= 0)
    {
      bool1 = bool2;
      if (paramInt1 <= paramInt2)
      {
        bool1 = bool2;
        if (paramInt2 <= zza()) {
          bool1 = true;
        }
      }
    }
    zzdy.zzd(bool1);
    this.zzl = paramzzvf;
    zzu(paramInt1, paramInt2);
    return zzb();
  }
  
  public final zzcx zzm(List paramList, zzvf paramzzvf)
  {
    zzu(0, this.zzb.size());
    return zzj(this.zzb.size(), paramList, paramzzvf);
  }
  
  public final zzcx zzn(zzvf paramzzvf)
  {
    int i = zza();
    zzvf localzzvf = paramzzvf;
    if (paramzzvf.zzc() != i) {
      localzzvf = paramzzvf.zzf().zzg(0, i);
    }
    this.zzl = localzzvf;
    return zzb();
  }
  
  public final zztj zzo(zztl paramzztl, zzxm paramzzxm, long paramLong)
  {
    Object localObject = paramzztl.zza;
    int i = zzlc.zzc;
    localObject = ((Pair)localObject).first;
    paramzztl = paramzztl.zzc(((Pair)paramzztl.zza).second);
    localObject = (zzkv)this.zzd.get(localObject);
    Objects.requireNonNull(localObject);
    this.zzg.add(localObject);
    zzku localzzku = (zzku)this.zzf.get(localObject);
    if (localzzku != null) {
      localzzku.zza.zzk(localzzku.zzb);
    }
    ((zzkv)localObject).zzc.add(paramzztl);
    paramzztl = ((zzkv)localObject).zza.zzG(paramzztl, paramzzxm, paramLong);
    this.zzc.put(paramzztl, localObject);
    zzr();
    return paramzztl;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */