package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public abstract class zzsm
  implements zztn
{
  private final ArrayList zza = new ArrayList(1);
  private final HashSet zzb = new HashSet(1);
  private final zztu zzc = new zztu();
  private final zzql zzd = new zzql();
  private Looper zze;
  private zzcx zzf;
  private zzof zzg;
  
  protected final zzof zzb()
  {
    zzof localzzof = this.zzg;
    zzdy.zzb(localzzof);
    return localzzof;
  }
  
  protected final zzql zzc(zztl paramzztl)
  {
    return this.zzd.zza(0, paramzztl);
  }
  
  protected final zzql zzd(int paramInt, zztl paramzztl)
  {
    return this.zzd.zza(0, paramzztl);
  }
  
  protected final zztu zze(zztl paramzztl)
  {
    return this.zzc.zza(0, paramzztl);
  }
  
  protected final zztu zzf(int paramInt, zztl paramzztl)
  {
    return this.zzc.zza(0, paramzztl);
  }
  
  public final void zzg(Handler paramHandler, zzqm paramzzqm)
  {
    Objects.requireNonNull(paramzzqm);
    this.zzd.zzb(paramHandler, paramzzqm);
  }
  
  public final void zzh(Handler paramHandler, zztv paramzztv)
  {
    Objects.requireNonNull(paramzztv);
    this.zzc.zzb(paramHandler, paramzztv);
  }
  
  public final void zzi(zztm paramzztm)
  {
    boolean bool = this.zzb.isEmpty();
    this.zzb.remove(paramzztm);
    if (((bool ^ true)) && (this.zzb.isEmpty())) {
      zzj();
    }
  }
  
  protected void zzj() {}
  
  public final void zzk(zztm paramzztm)
  {
    Objects.requireNonNull(this.zze);
    boolean bool = this.zzb.isEmpty();
    this.zzb.add(paramzztm);
    if (bool) {
      zzl();
    }
  }
  
  protected void zzl() {}
  
  public final void zzm(zztm paramzztm, zzgz paramzzgz, zzof paramzzof)
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = this.zze;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (localLooper2 != null) {
      if (localLooper2 == localLooper1) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    zzdy.zzd(bool1);
    this.zzg = paramzzof;
    paramzzof = this.zzf;
    this.zza.add(paramzztm);
    if (this.zze == null)
    {
      this.zze = localLooper1;
      this.zzb.add(paramzztm);
      zzn(paramzzgz);
      return;
    }
    if (paramzzof != null)
    {
      zzk(paramzztm);
      paramzztm.zza(this, paramzzof);
    }
  }
  
  protected abstract void zzn(zzgz paramzzgz);
  
  protected final void zzo(zzcx paramzzcx)
  {
    this.zzf = paramzzcx;
    ArrayList localArrayList = this.zza;
    int j = localArrayList.size();
    for (int i = 0; i < j; i++) {
      ((zztm)localArrayList.get(i)).zza(this, paramzzcx);
    }
  }
  
  public final void zzp(zztm paramzztm)
  {
    this.zza.remove(paramzztm);
    if (this.zza.isEmpty())
    {
      this.zze = null;
      this.zzf = null;
      this.zzg = null;
      this.zzb.clear();
      zzq();
      return;
    }
    zzi(paramzztm);
  }
  
  protected abstract void zzq();
  
  public final void zzr(zzqm paramzzqm)
  {
    this.zzd.zzc(paramzzqm);
  }
  
  public final void zzs(zztv paramzztv)
  {
    this.zzc.zzh(paramzztv);
  }
  
  protected final boolean zzt()
  {
    return !this.zzb.isEmpty();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */