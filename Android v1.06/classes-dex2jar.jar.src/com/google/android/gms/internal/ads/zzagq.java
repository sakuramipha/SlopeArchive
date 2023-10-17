package com.google.android.gms.internal.ads;

final class zzagq
{
  public final zzabr zza;
  public final zzahc zzb;
  public final zzfd zzc;
  public zzahd zzd;
  public zzagm zze;
  public int zzf;
  public int zzg;
  public int zzh;
  public int zzi;
  private final zzfd zzj;
  private final zzfd zzk;
  private boolean zzl;
  
  public zzagq(zzabr paramzzabr, zzahd paramzzahd, zzagm paramzzagm)
  {
    this.zza = paramzzabr;
    this.zzd = paramzzahd;
    this.zze = paramzzagm;
    this.zzb = new zzahc();
    this.zzc = new zzfd();
    this.zzj = new zzfd(1);
    this.zzk = new zzfd();
    zzh(paramzzahd, paramzzagm);
  }
  
  public final int zza()
  {
    int i;
    if (!this.zzl) {
      i = this.zzd.zzg[this.zzf];
    } else if (this.zzb.zzj[this.zzf] != 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (zzf() != null) {
      j = i | 0x40000000;
    }
    return j;
  }
  
  public final int zzb()
  {
    int i;
    if (!this.zzl) {
      i = this.zzd.zzd[this.zzf];
    } else {
      i = this.zzb.zzh[this.zzf];
    }
    return i;
  }
  
  public final int zzc(int paramInt1, int paramInt2)
  {
    Object localObject1 = zzf();
    if (localObject1 == null) {
      return 0;
    }
    int j = ((zzahb)localObject1).zzd;
    if (j != 0)
    {
      localObject1 = this.zzb.zzn;
    }
    else
    {
      localObject2 = ((zzahb)localObject1).zze;
      j = zzfn.zza;
      localObject1 = this.zzk;
      j = localObject2.length;
      ((zzfd)localObject1).zzD((byte[])localObject2, j);
      localObject1 = this.zzk;
    }
    boolean bool = this.zzb.zzb(this.zzf);
    int k;
    if ((!bool) && (paramInt2 == 0)) {
      k = 0;
    } else {
      k = 1;
    }
    zzfd localzzfd = this.zzj;
    Object localObject2 = localzzfd.zzH();
    int m;
    if (1 != k) {
      m = 0;
    } else {
      m = 128;
    }
    localObject2[0] = ((byte)(m | j));
    localzzfd.zzF(0);
    this.zza.zzr(this.zzj, 1, 1);
    this.zza.zzr((zzfd)localObject1, j, 1);
    if (k == 0) {
      return j + 1;
    }
    if (!bool)
    {
      int i = (byte)paramInt2;
      this.zzc.zzC(8);
      localObject1 = this.zzc;
      localObject2 = ((zzfd)localObject1).zzH();
      localObject2[0] = 0;
      localObject2[1] = 1;
      localObject2[2] = 0;
      localObject2[3] = i;
      localObject2[4] = ((byte)(paramInt1 >> 24 & 0xFF));
      localObject2[5] = ((byte)(paramInt1 >> 16 & 0xFF));
      localObject2[6] = ((byte)(paramInt1 >> 8 & 0xFF));
      localObject2[7] = ((byte)(paramInt1 & 0xFF));
      this.zza.zzr((zzfd)localObject1, 8, 1);
      return j + 9;
    }
    localObject2 = this.zzb.zzn;
    paramInt1 = ((zzfd)localObject2).zzo();
    ((zzfd)localObject2).zzG(-2);
    paramInt1 = paramInt1 * 6 + 2;
    localObject1 = localObject2;
    if (paramInt2 != 0)
    {
      this.zzc.zzC(paramInt1);
      localObject1 = this.zzc.zzH();
      ((zzfd)localObject2).zzB((byte[])localObject1, 0, paramInt1);
      paramInt2 = ((localObject1[2] & 0xFF) << 8 | localObject1[3] & 0xFF) + paramInt2;
      localObject1[2] = ((byte)(paramInt2 >> 8 & 0xFF));
      localObject1[3] = ((byte)(paramInt2 & 0xFF));
      localObject1 = this.zzc;
    }
    this.zza.zzr((zzfd)localObject1, paramInt1, 1);
    return j + 1 + paramInt1;
  }
  
  public final long zzd()
  {
    long l;
    if (!this.zzl) {
      l = this.zzd.zzc[this.zzf];
    } else {
      l = this.zzb.zzf[this.zzh];
    }
    return l;
  }
  
  public final long zze()
  {
    long l;
    if (!this.zzl)
    {
      l = this.zzd.zzf[this.zzf];
    }
    else
    {
      zzahc localzzahc = this.zzb;
      int i = this.zzf;
      l = localzzahc.zzi[i];
    }
    return l;
  }
  
  public final zzahb zzf()
  {
    if (!this.zzl) {
      return null;
    }
    Object localObject = this.zzb.zza;
    int i = zzfn.zza;
    i = ((zzagm)localObject).zza;
    localObject = this.zzb.zzm;
    if (localObject == null) {
      localObject = this.zzd.zza.zza(i);
    }
    if ((localObject != null) && (((zzahb)localObject).zza)) {
      return (zzahb)localObject;
    }
    return null;
  }
  
  public final void zzh(zzahd paramzzahd, zzagm paramzzagm)
  {
    this.zzd = paramzzahd;
    this.zze = paramzzagm;
    this.zza.zzk(paramzzahd.zza.zzf);
    zzi();
  }
  
  public final void zzi()
  {
    zzahc localzzahc = this.zzb;
    localzzahc.zzd = 0;
    localzzahc.zzp = 0L;
    localzzahc.zzq = false;
    localzzahc.zzk = false;
    localzzahc.zzo = false;
    localzzahc.zzm = null;
    this.zzf = 0;
    this.zzh = 0;
    this.zzg = 0;
    this.zzi = 0;
    this.zzl = false;
  }
  
  public final boolean zzk()
  {
    this.zzf += 1;
    if (!this.zzl) {
      return false;
    }
    int i = this.zzg + 1;
    this.zzg = i;
    int[] arrayOfInt = this.zzb.zzg;
    int j = this.zzh;
    if (i == arrayOfInt[j])
    {
      this.zzh = (j + 1);
      this.zzg = 0;
      return false;
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */