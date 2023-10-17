package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class zzajp
  implements zzaao
{
  public static final zzaav zza = zzajm.zza;
  private final List zzb;
  private final zzfd zzc;
  private final SparseIntArray zzd;
  private final zzajs zze;
  private final SparseArray zzf;
  private final SparseBooleanArray zzg;
  private final SparseBooleanArray zzh;
  private final zzajl zzi;
  private zzajk zzj;
  private zzaar zzk;
  private int zzl;
  private boolean zzm;
  private boolean zzn;
  private boolean zzo;
  private int zzp;
  private int zzq;
  
  public zzajp()
  {
    this(0);
  }
  
  public zzajp(int paramInt)
  {
    this(1, new zzfl(0L), new zzaie(0), 112800);
  }
  
  public zzajp(int paramInt1, zzfl paramzzfl, zzajs paramzzajs, int paramInt2)
  {
    this.zze = paramzzajs;
    this.zzb = Collections.singletonList(paramzzfl);
    this.zzc = new zzfd(new byte['Ⓒ'], 0);
    paramzzfl = new SparseBooleanArray();
    this.zzg = paramzzfl;
    this.zzh = new SparseBooleanArray();
    paramzzajs = new SparseArray();
    this.zzf = paramzzajs;
    this.zzd = new SparseIntArray();
    this.zzi = new zzajl(112800);
    this.zzk = zzaar.zza;
    this.zzq = -1;
    paramzzfl.clear();
    paramzzajs.clear();
    paramzzfl = new SparseArray();
    paramInt2 = paramzzfl.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      this.zzf.put(paramzzfl.keyAt(paramInt1), (zzaju)paramzzfl.valueAt(paramInt1));
    }
    this.zzf.put(0, new zzajh(new zzajn(this)));
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    long l = paramzzaap.zzd();
    if (this.zzm)
    {
      if (l != -1L)
      {
        localObject = this.zzi;
        if (!((zzajl)localObject).zzd()) {
          return ((zzajl)localObject).zza(paramzzaap, paramzzabk, this.zzq);
        }
      }
      if (!this.zzn)
      {
        this.zzn = true;
        localObject = this.zzi;
        if (((zzajl)localObject).zzb() != -9223372036854775807L)
        {
          localObject = new zzajk(((zzajl)localObject).zzc(), ((zzajl)localObject).zzb(), l, this.zzq, 112800);
          this.zzj = ((zzajk)localObject);
          this.zzk.zzN(((zzaaa)localObject).zzb());
        }
        else
        {
          this.zzk.zzN(new zzabm(((zzajl)localObject).zzb(), 0L));
        }
      }
      if (this.zzo)
      {
        this.zzo = false;
        zzc(0L, 0L);
        if (paramzzaap.zzf() != 0L)
        {
          paramzzabk.zza = 0L;
          return 1;
        }
      }
      localObject = this.zzj;
      if ((localObject != null) && (((zzaaa)localObject).zze())) {
        return ((zzaaa)localObject).zza(paramzzaap, paramzzabk);
      }
    }
    Object localObject = this.zzc;
    paramzzabk = ((zzfd)localObject).zzH();
    if (9400 - ((zzfd)localObject).zzc() < 188)
    {
      i = ((zzfd)localObject).zza();
      if (i > 0) {
        System.arraycopy(paramzzabk, ((zzfd)localObject).zzc(), paramzzabk, 0, i);
      }
      this.zzc.zzD(paramzzabk, i);
    }
    for (;;)
    {
      localObject = this.zzc;
      if (((zzfd)localObject).zza() >= 188) {
        break;
      }
      j = ((zzfd)localObject).zzd();
      i = paramzzaap.zza(paramzzabk, j, 9400 - j);
      if (i == -1) {
        return -1;
      }
      this.zzc.zzE(j + i);
    }
    int i = ((zzfd)localObject).zzc();
    int j = ((zzfd)localObject).zzd();
    int m = zzajv.zza(((zzfd)localObject).zzH(), i, j);
    this.zzc.zzF(m);
    int k = m + 188;
    if (k > j) {
      this.zzp += m - i;
    } else {
      this.zzp = 0;
    }
    paramzzaap = this.zzc;
    m = paramzzaap.zzd();
    if (k > m) {
      return 0;
    }
    int i1 = paramzzaap.zze();
    if ((0x800000 & i1) != 0)
    {
      this.zzc.zzF(k);
      return 0;
    }
    if ((0x400000 & i1) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int n = i1 >> 8 & 0x1FFF;
    if ((i1 & 0x10) != 0) {
      paramzzaap = (zzaju)this.zzf.get(n);
    } else {
      paramzzaap = null;
    }
    if (paramzzaap == null)
    {
      this.zzc.zzF(k);
      return 0;
    }
    j = i1 & 0xF;
    int i2 = this.zzd.get(n, j - 1);
    this.zzd.put(n, j);
    if (i2 == j)
    {
      this.zzc.zzF(k);
      return 0;
    }
    if (j != (i2 + 1 & 0xF)) {
      paramzzaap.zzc();
    }
    j = i;
    if ((i1 & 0x20) != 0)
    {
      i1 = this.zzc.zzk();
      if ((this.zzc.zzk() & 0x40) != 0) {
        j = 2;
      } else {
        j = 0;
      }
      j = i | j;
      this.zzc.zzG(i1 - 1);
    }
    boolean bool = this.zzm;
    if ((bool) || (!this.zzh.get(n, false)))
    {
      this.zzc.zzE(k);
      paramzzaap.zza(this.zzc, j);
      this.zzc.zzE(m);
      if (bool) {}
    }
    else if ((this.zzm) && (l != -1L))
    {
      this.zzo = true;
    }
    this.zzc.zzF(k);
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzk = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    int j = this.zzb.size();
    Object localObject;
    for (int i = 0; i < j; i++)
    {
      localObject = (zzfl)this.zzb.get(i);
      if (((zzfl)localObject).zze() != -9223372036854775807L)
      {
        paramLong1 = ((zzfl)localObject).zzc();
        if ((paramLong1 == -9223372036854775807L) || (paramLong1 == 0L) || (paramLong1 == paramLong2)) {}
      }
      else
      {
        ((zzfl)localObject).zzf(paramLong2);
      }
    }
    if (paramLong2 != 0L)
    {
      localObject = this.zzj;
      if (localObject != null) {
        ((zzaaa)localObject).zzd(paramLong2);
      }
    }
    this.zzc.zzC(0);
    this.zzd.clear();
    for (i = 0; i < this.zzf.size(); i++) {
      ((zzaju)this.zzf.valueAt(i)).zzc();
    }
    this.zzp = 0;
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = this.zzc.zzH();
    paramzzaap = (zzaae)paramzzaap;
    paramzzaap.zzm(arrayOfByte, 0, 940, false);
    int i = 0;
    if (i < 188)
    {
      for (int j = 0;; j++)
      {
        if (j >= 5) {
          break label69;
        }
        if (arrayOfByte[(j * 188 + i)] != 71)
        {
          i++;
          break;
        }
      }
      label69:
      paramzzaap.zzo(i, false);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */