package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzud
  extends zzsu
{
  private static final zzbq zza;
  private final zztn[] zzb;
  private final zzcx[] zzc;
  private final ArrayList zzd;
  private final Map zze;
  private final zzfsn zzf;
  private int zzg;
  private long[][] zzh;
  private zzuc zzi;
  private final zzsw zzj;
  
  static
  {
    zzat localzzat = new zzat();
    localzzat.zza("MergingMediaSource");
    zza = localzzat.zzc();
  }
  
  public zzud(boolean paramBoolean1, boolean paramBoolean2, zztn... paramVarArgs)
  {
    this.zzb = paramVarArgs;
    this.zzj = localzzsw;
    this.zzd = new ArrayList(Arrays.asList(paramVarArgs));
    this.zzg = -1;
    this.zzc = new zzcx[paramVarArgs.length];
    this.zzh = new long[0][];
    this.zze = new HashMap();
    this.zzf = zzfsv.zzb(8).zzb(2).zza();
  }
  
  public final void zzF(zztj paramzztj)
  {
    paramzztj = (zzub)paramzztj;
    for (int i = 0;; i++)
    {
      zztn[] arrayOfzztn = this.zzb;
      if (i >= arrayOfzztn.length) {
        break;
      }
      arrayOfzztn[i].zzF(paramzztj.zzn(i));
    }
  }
  
  public final zztj zzH(zztl paramzztl, zzxm paramzzxm, long paramLong)
  {
    int j = this.zzb.length;
    zztj[] arrayOfzztj = new zztj[j];
    Object localObject = this.zzc;
    int i = 0;
    int k = localObject[0].zza(paramzztl.zza);
    while (i < j)
    {
      localObject = paramzztl.zzc(this.zzc[i].zzf(k));
      arrayOfzztj[i] = this.zzb[i].zzH((zztl)localObject, paramzzxm, paramLong - this.zzh[k][i]);
      i++;
    }
    return new zzub(this.zzj, this.zzh[k], arrayOfzztj);
  }
  
  public final zzbq zzI()
  {
    Object localObject = this.zzb;
    if (localObject.length > 0) {
      localObject = localObject[0].zzI();
    } else {
      localObject = zza;
    }
    return (zzbq)localObject;
  }
  
  protected final void zzn(zzgz paramzzgz)
  {
    super.zzn(paramzzgz);
    for (int i = 0; i < this.zzb.length; i++) {
      zzA(Integer.valueOf(i), this.zzb[i]);
    }
  }
  
  protected final void zzq()
  {
    super.zzq();
    Arrays.fill(this.zzc, null);
    this.zzg = -1;
    this.zzi = null;
    this.zzd.clear();
    Collections.addAll(this.zzd, this.zzb);
  }
  
  public final void zzy()
    throws IOException
  {
    zzuc localzzuc = this.zzi;
    if (localzzuc == null)
    {
      super.zzy();
      return;
    }
    throw localzzuc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */