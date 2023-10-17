package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zznw
  implements zzls
{
  private final zzdz zza;
  private final zzcu zzb;
  private final zzcw zzc;
  private final zznv zzd;
  private final SparseArray zze;
  private zzeo zzf;
  private zzcq zzg;
  private zzei zzh;
  private boolean zzi;
  
  public zznw(zzdz paramzzdz)
  {
    Objects.requireNonNull(paramzzdz);
    this.zza = paramzzdz;
    this.zzf = new zzeo(zzfn.zzt(), paramzzdz, zzmc.zza);
    paramzzdz = new zzcu();
    this.zzb = paramzzdz;
    this.zzc = new zzcw();
    this.zzd = new zznv(paramzzdz);
    this.zze = new SparseArray();
  }
  
  private final zzlt zzaa(zztl paramzztl)
  {
    Objects.requireNonNull(this.zzg);
    if (paramzztl == null) {
      localzzcx = null;
    } else {
      localzzcx = this.zzd.zza(paramzztl);
    }
    if ((paramzztl != null) && (localzzcx != null)) {
      return zzV(localzzcx, localzzcx.zzn(paramzztl.zza, this.zzb).zzd, paramzztl);
    }
    int i = this.zzg.zzd();
    zzcx localzzcx = this.zzg.zzn();
    paramzztl = localzzcx;
    if (i >= localzzcx.zzc()) {
      paramzztl = zzcx.zza;
    }
    return zzV(paramzztl, i, null);
  }
  
  private final zzlt zzab(int paramInt, zztl paramzztl)
  {
    Object localObject = this.zzg;
    Objects.requireNonNull(localObject);
    if (paramzztl != null)
    {
      if (this.zzd.zza(paramzztl) != null) {
        paramzztl = zzaa(paramzztl);
      } else {
        paramzztl = zzV(zzcx.zza, paramInt, paramzztl);
      }
      return paramzztl;
    }
    localObject = ((zzcq)localObject).zzn();
    paramzztl = (zztl)localObject;
    if (paramInt >= ((zzcx)localObject).zzc()) {
      paramzztl = zzcx.zza;
    }
    return zzV(paramzztl, paramInt, null);
  }
  
  private final zzlt zzac()
  {
    return zzaa(this.zzd.zzd());
  }
  
  private final zzlt zzad()
  {
    return zzaa(this.zzd.zze());
  }
  
  private final zzlt zzae(zzcg paramzzcg)
  {
    if ((paramzzcg instanceof zzia))
    {
      paramzzcg = ((zzia)paramzzcg).zzj;
      if (paramzzcg != null) {
        return zzaa(new zztl(paramzzcg));
      }
    }
    return zzU();
  }
  
  public final void zzA(String paramString)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1012, new zznu(localzzlt, paramString));
  }
  
  public final void zzB(zzhs paramzzhs)
  {
    zzlt localzzlt = zzac();
    zzZ(localzzlt, 1013, new zznk(localzzlt, paramzzhs));
  }
  
  public final void zzC(zzhs paramzzhs)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1007, new zzmz(localzzlt, paramzzhs));
  }
  
  public final void zzD(zzam paramzzam, zzht paramzzht)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1009, new zznj(localzzlt, paramzzam, paramzzht));
  }
  
  public final void zzE(long paramLong)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1010, new zznm(localzzlt, paramLong));
  }
  
  public final void zzF(Exception paramException)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1014, new zzmh(localzzlt, paramException));
  }
  
  public final void zzG(int paramInt, long paramLong1, long paramLong2)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1011, new zzlz(localzzlt, paramInt, paramLong1, paramLong2));
  }
  
  public final void zzH(int paramInt, long paramLong)
  {
    zzlt localzzlt = zzac();
    zzZ(localzzlt, 1018, new zzmu(localzzlt, paramInt, paramLong));
  }
  
  public final void zzI(Object paramObject, long paramLong)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 26, new zznq(localzzlt, paramObject, paramLong));
  }
  
  public final void zzJ(Exception paramException)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1030, new zzmf(localzzlt, paramException));
  }
  
  public final void zzK(String paramString, long paramLong1, long paramLong2)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1016, new zzmq(localzzlt, paramString, paramLong2, paramLong1));
  }
  
  public final void zzL(String paramString)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1019, new zzly(localzzlt, paramString));
  }
  
  public final void zzM(zzhs paramzzhs)
  {
    zzlt localzzlt = zzac();
    zzZ(localzzlt, 1020, new zznp(localzzlt, paramzzhs));
  }
  
  public final void zzN(zzhs paramzzhs)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1015, new zzmv(localzzlt, paramzzhs));
  }
  
  public final void zzO(long paramLong, int paramInt)
  {
    zzlt localzzlt = zzac();
    zzZ(localzzlt, 1021, new zzmi(localzzlt, paramLong, paramInt));
  }
  
  public final void zzP(zzam paramzzam, zzht paramzzht)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1017, new zzlx(localzzlt, paramzzam, paramzzht));
  }
  
  public final void zzQ()
  {
    zzei localzzei = this.zzh;
    zzdy.zzb(localzzei);
    localzzei.zzh(new zznl(this));
  }
  
  public final void zzR(zzlv paramzzlv)
  {
    this.zzf.zzf(paramzzlv);
  }
  
  public final void zzS(zzcq paramzzcq, Looper paramLooper)
  {
    zzcq localzzcq = this.zzg;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (localzzcq != null) {
      if (zznv.zzf(this.zzd).isEmpty()) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    zzdy.zzf(bool1);
    Objects.requireNonNull(paramzzcq);
    this.zzg = paramzzcq;
    this.zzh = this.zza.zzb(paramLooper, null);
    this.zzf = this.zzf.zza(paramLooper, new zzmp(this, paramzzcq));
  }
  
  public final void zzT(List paramList, zztl paramzztl)
  {
    zznv localzznv = this.zzd;
    zzcq localzzcq = this.zzg;
    Objects.requireNonNull(localzzcq);
    localzznv.zzh(paramList, paramzztl, localzzcq);
  }
  
  protected final zzlt zzU()
  {
    return zzaa(this.zzd.zzb());
  }
  
  @RequiresNonNull({"player"})
  protected final zzlt zzV(zzcx paramzzcx, int paramInt, zztl paramzztl)
  {
    boolean bool = paramzzcx.zzo();
    int i = 1;
    if (true == bool) {
      paramzztl = null;
    }
    long l3 = this.zza.zza();
    if ((!paramzzcx.equals(this.zzg.zzn())) || (paramInt != this.zzg.zzd())) {
      i = 0;
    }
    long l2 = 0L;
    long l1;
    if ((paramzztl != null) && (paramzztl.zzb()))
    {
      l1 = l2;
      if (i != 0)
      {
        l1 = l2;
        if (this.zzg.zzb() == paramzztl.zzb)
        {
          l1 = l2;
          if (this.zzg.zzc() == paramzztl.zzc) {
            l1 = this.zzg.zzk();
          }
        }
      }
    }
    else if (i != 0)
    {
      l1 = this.zzg.zzj();
    }
    else if (paramzzcx.zzo())
    {
      l1 = l2;
    }
    else
    {
      l1 = paramzzcx.zze(paramInt, this.zzc, 0L).zzm;
      l1 = zzfn.zzq(0L);
    }
    zztl localzztl = this.zzd.zzb();
    return new zzlt(l3, paramzzcx, paramInt, paramzztl, l1, this.zzg.zzn(), this.zzg.zzd(), localzztl, this.zzg.zzk(), this.zzg.zzm());
  }
  
  public final void zzY(int paramInt, long paramLong1, long paramLong2)
  {
    zzlt localzzlt = zzaa(this.zzd.zzc());
    zzZ(localzzlt, 1006, new zzmg(localzzlt, paramInt, paramLong1, paramLong2));
  }
  
  protected final void zzZ(zzlt paramzzlt, int paramInt, zzel paramzzel)
  {
    this.zze.put(paramInt, paramzzlt);
    paramzzlt = this.zzf;
    paramzzlt.zzd(paramInt, paramzzel);
    paramzzlt.zzc();
  }
  
  public final void zza(zzcm paramzzcm)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 13, new zzmk(localzzlt, paramzzcm));
  }
  
  public final void zzaf(int paramInt, zztl paramzztl, zzth paramzzth)
  {
    paramzztl = zzab(paramInt, paramzztl);
    zzZ(paramzztl, 1004, new zzme(paramzztl, paramzzth));
  }
  
  public final void zzag(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzab(paramInt, paramzztl);
    zzZ(paramzztl, 1002, new zzmw(paramzztl, paramzztc, paramzzth));
  }
  
  public final void zzah(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzab(paramInt, paramzztl);
    zzZ(paramzztl, 1001, new zzng(paramzztl, paramzztc, paramzzth));
  }
  
  public final void zzai(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean)
  {
    paramzztl = zzab(paramInt, paramzztl);
    zzZ(paramzztl, 1003, new zzmr(paramzztl, paramzztc, paramzzth, paramIOException, paramBoolean));
  }
  
  public final void zzaj(int paramInt, zztl paramzztl, zztc paramzztc, zzth paramzzth)
  {
    paramzztl = zzab(paramInt, paramzztl);
    zzZ(paramzztl, 1000, new zzna(paramzztl, paramzztc, paramzzth));
  }
  
  public final void zzb(zzz paramzzz)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 29, new zzml(localzzlt, paramzzz));
  }
  
  public final void zzc(int paramInt, boolean paramBoolean)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 30, new zzmo(localzzlt, paramInt, paramBoolean));
  }
  
  public final void zzd(boolean paramBoolean)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 3, new zznt(localzzlt, paramBoolean));
  }
  
  public final void zze(boolean paramBoolean)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 7, new zznc(localzzlt, paramBoolean));
  }
  
  public final void zzf(zzbq paramzzbq, int paramInt)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 1, new zznf(localzzlt, paramzzbq, paramInt));
  }
  
  public final void zzg(zzbw paramzzbw)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 14, new zzni(localzzlt, paramzzbw));
  }
  
  public final void zzh(boolean paramBoolean, int paramInt)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 5, new zznb(localzzlt, paramBoolean, paramInt));
  }
  
  public final void zzi(zzci paramzzci)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 12, new zzmb(localzzlt, paramzzci));
  }
  
  public final void zzj(int paramInt)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 4, new zzne(localzzlt, paramInt));
  }
  
  public final void zzk(int paramInt)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 6, new zzns(localzzlt, paramInt));
  }
  
  public final void zzl(zzcg paramzzcg)
  {
    zzlt localzzlt = zzae(paramzzcg);
    zzZ(localzzlt, 10, new zzmx(localzzlt, paramzzcg));
  }
  
  public final void zzm(zzcg paramzzcg)
  {
    zzlt localzzlt = zzae(paramzzcg);
    zzZ(localzzlt, 10, new zznh(localzzlt, paramzzcg));
  }
  
  public final void zzn(boolean paramBoolean, int paramInt)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, -1, new zzlw(localzzlt, paramBoolean, paramInt));
  }
  
  public final void zzo(zzcp paramzzcp1, zzcp paramzzcp2, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 1)
    {
      this.zzi = false;
      i = 1;
    }
    Object localObject = this.zzd;
    zzcq localzzcq = this.zzg;
    Objects.requireNonNull(localzzcq);
    ((zznv)localObject).zzg(localzzcq);
    localObject = zzU();
    zzZ((zzlt)localObject, 11, new zzmj((zzlt)localObject, i, paramzzcp1, paramzzcp2));
  }
  
  public final void zzp()
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, -1, new zzmd(localzzlt));
  }
  
  public final void zzq(boolean paramBoolean)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 23, new zznd(localzzlt, paramBoolean));
  }
  
  public final void zzr(int paramInt1, int paramInt2)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 24, new zznr(localzzlt, paramInt1, paramInt2));
  }
  
  public final void zzs(zzcx paramzzcx, int paramInt)
  {
    zznv localzznv = this.zzd;
    paramzzcx = this.zzg;
    Objects.requireNonNull(paramzzcx);
    localzznv.zzi(paramzzcx);
    paramzzcx = zzU();
    zzZ(paramzzcx, 0, new zzmt(paramzzcx, paramInt));
  }
  
  public final void zzt(zzdi paramzzdi)
  {
    zzlt localzzlt = zzU();
    zzZ(localzzlt, 2, new zzmm(localzzlt, paramzzdi));
  }
  
  public final void zzu(zzdn paramzzdn)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 25, new zzno(localzzlt, paramzzdn));
  }
  
  public final void zzv(float paramFloat)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 22, new zzma(localzzlt, paramFloat));
  }
  
  public final void zzw(zzlv paramzzlv)
  {
    this.zzf.zzb(paramzzlv);
  }
  
  public final void zzx()
  {
    if (!this.zzi)
    {
      zzlt localzzlt = zzU();
      this.zzi = true;
      zzZ(localzzlt, -1, new zznn(localzzlt));
    }
  }
  
  public final void zzy(Exception paramException)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1029, new zzmn(localzzlt, paramException));
  }
  
  public final void zzz(String paramString, long paramLong1, long paramLong2)
  {
    zzlt localzzlt = zzad();
    zzZ(localzzlt, 1008, new zzmy(localzzlt, paramString, paramLong2, paramLong1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zznw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */