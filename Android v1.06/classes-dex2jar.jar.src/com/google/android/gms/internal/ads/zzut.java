package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

public final class zzut
  extends zzsm
  implements zzuk
{
  private final zzbq zza;
  private final zzbi zzb;
  private final zzfw zzc;
  private final zzqr zzd;
  private final int zze;
  private boolean zzf;
  private long zzg;
  private boolean zzh;
  private boolean zzi;
  private zzgz zzj;
  private final zzuq zzk;
  private final zzxq zzl;
  
  private final void zzv()
  {
    long l = this.zzg;
    boolean bool1 = this.zzh;
    boolean bool2 = this.zzi;
    zzbq localzzbq = this.zza;
    if (bool2) {
      localObject = localzzbq.zzf;
    } else {
      localObject = null;
    }
    Object localObject = new zzvg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, l, l, 0L, 0L, bool1, false, false, null, localzzbq, (zzbg)localObject);
    if (this.zzf) {
      localObject = new zzup(this, (zzcx)localObject);
    }
    zzo((zzcx)localObject);
  }
  
  public final void zzF(zztj paramzztj)
  {
    ((zzuo)paramzztj).zzM();
  }
  
  public final zztj zzH(zztl paramzztl, zzxm paramzzxm, long paramLong)
  {
    zzfx localzzfx = this.zzc.zza();
    Object localObject = this.zzj;
    if (localObject != null) {
      localzzfx.zzf((zzgz)localObject);
    }
    Uri localUri = this.zzb.zza;
    localObject = this.zzk;
    zzb();
    return new zzuo(localUri, localzzfx, new zzso(((zzuq)localObject).zza), this.zzd, zzc(paramzztl), this.zzl, zze(paramzztl), this, paramzzxm, null, this.zze);
  }
  
  public final zzbq zzI()
  {
    return this.zza;
  }
  
  public final void zza(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l = paramLong;
    if (paramLong == -9223372036854775807L) {
      l = this.zzg;
    }
    if ((!this.zzf) && (this.zzg == l) && (this.zzh == paramBoolean1) && (this.zzi == paramBoolean2)) {
      return;
    }
    this.zzg = l;
    this.zzh = paramBoolean1;
    this.zzi = paramBoolean2;
    this.zzf = false;
    zzv();
  }
  
  protected final void zzn(zzgz paramzzgz)
  {
    this.zzj = paramzzgz;
    Objects.requireNonNull(Looper.myLooper());
    zzb();
    zzv();
  }
  
  protected final void zzq() {}
  
  public final void zzy() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */