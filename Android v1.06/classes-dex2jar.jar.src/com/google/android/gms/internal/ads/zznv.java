package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

final class zznv
{
  private final zzcu zza;
  private zzfrr zzb;
  private zzfru zzc;
  private zztl zzd;
  private zztl zze;
  private zztl zzf;
  
  public zznv(zzcu paramzzcu)
  {
    this.zza = paramzzcu;
    this.zzb = zzfrr.zzl();
    this.zzc = zzfru.zzd();
  }
  
  private static zztl zzj(zzcq paramzzcq, zzfrr paramzzfrr, zztl paramzztl, zzcu paramzzcu)
  {
    zzcx localzzcx = paramzzcq.zzn();
    int i = paramzzcq.zze();
    Object localObject;
    if (localzzcx.zzo()) {
      localObject = null;
    } else {
      localObject = localzzcx.zzf(i);
    }
    if ((!paramzzcq.zzx()) && (!localzzcx.zzo())) {
      i = localzzcx.zzd(i, paramzzcu, false).zzc(zzfn.zzo(paramzzcq.zzk()));
    } else {
      i = -1;
    }
    for (int j = 0; j < paramzzfrr.size(); j++)
    {
      paramzzcu = (zztl)paramzzfrr.get(j);
      if (zzm(paramzzcu, localObject, paramzzcq.zzx(), paramzzcq.zzb(), paramzzcq.zzc(), i)) {
        return paramzzcu;
      }
    }
    if ((paramzzfrr.isEmpty()) && (paramzztl != null) && (zzm(paramzztl, localObject, paramzzcq.zzx(), paramzzcq.zzb(), paramzzcq.zzc(), i))) {
      return paramzztl;
    }
    return null;
  }
  
  private final void zzk(zzfrt paramzzfrt, zztl paramzztl, zzcx paramzzcx)
  {
    if (paramzztl == null) {
      return;
    }
    if (paramzzcx.zza(paramzztl.zza) != -1)
    {
      paramzzfrt.zza(paramzztl, paramzzcx);
      return;
    }
    paramzzcx = (zzcx)this.zzc.get(paramzztl);
    if (paramzzcx != null) {
      paramzzfrt.zza(paramzztl, paramzzcx);
    }
  }
  
  private final void zzl(zzcx paramzzcx)
  {
    zzfrt localzzfrt = new zzfrt();
    if (this.zzb.isEmpty())
    {
      zzk(localzzfrt, this.zze, paramzzcx);
      if (!zzfou.zza(this.zzf, this.zze)) {
        zzk(localzzfrt, this.zzf, paramzzcx);
      }
      if ((!zzfou.zza(this.zzd, this.zze)) && (!zzfou.zza(this.zzd, this.zzf))) {
        zzk(localzzfrt, this.zzd, paramzzcx);
      }
    }
    else
    {
      for (int i = 0; i < this.zzb.size(); i++) {
        zzk(localzzfrt, (zztl)this.zzb.get(i), paramzzcx);
      }
      if (!this.zzb.contains(this.zzd)) {
        zzk(localzzfrt, this.zzd, paramzzcx);
      }
    }
    this.zzc = localzzfrt.zzc();
  }
  
  private static boolean zzm(zztl paramzztl, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = paramzztl.zza.equals(paramObject);
    boolean bool1 = false;
    if (!bool2) {
      return false;
    }
    if (paramBoolean)
    {
      paramBoolean = bool1;
      if (paramzztl.zzb != paramInt1) {
        return paramBoolean;
      }
      if (paramzztl.zzc != paramInt2) {
        return false;
      }
    }
    else
    {
      paramBoolean = bool1;
      if (paramzztl.zzb != -1) {
        return paramBoolean;
      }
      paramBoolean = bool1;
      if (paramzztl.zze != paramInt3) {
        return paramBoolean;
      }
    }
    paramBoolean = true;
    return paramBoolean;
  }
  
  public final zzcx zza(zztl paramzztl)
  {
    return (zzcx)this.zzc.get(paramzztl);
  }
  
  public final zztl zzb()
  {
    return this.zzd;
  }
  
  public final zztl zzc()
  {
    if (this.zzb.isEmpty()) {
      return null;
    }
    Object localObject = this.zzb;
    if ((localObject instanceof List))
    {
      if (!((List)localObject).isEmpty()) {
        localObject = ((List)localObject).get(((List)localObject).size() - 1);
      } else {
        throw new NoSuchElementException();
      }
    }
    else
    {
      Iterator localIterator = ((Iterable)localObject).iterator();
      do
      {
        localObject = localIterator.next();
      } while (localIterator.hasNext());
    }
    return (zztl)localObject;
  }
  
  public final zztl zzd()
  {
    return this.zze;
  }
  
  public final zztl zze()
  {
    return this.zzf;
  }
  
  public final void zzg(zzcq paramzzcq)
  {
    this.zzd = zzj(paramzzcq, this.zzb, this.zze, this.zza);
  }
  
  public final void zzh(List paramList, zztl paramzztl, zzcq paramzzcq)
  {
    this.zzb = zzfrr.zzj(paramList);
    if (!paramList.isEmpty())
    {
      this.zze = ((zztl)paramList.get(0));
      Objects.requireNonNull(paramzztl);
      this.zzf = paramzztl;
    }
    if (this.zzd == null) {
      this.zzd = zzj(paramzzcq, this.zzb, this.zze, this.zza);
    }
    zzl(paramzzcq.zzn());
  }
  
  public final void zzi(zzcq paramzzcq)
  {
    this.zzd = zzj(paramzzcq, this.zzb, this.zze, this.zza);
    zzl(paramzzcq.zzn());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zznv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */