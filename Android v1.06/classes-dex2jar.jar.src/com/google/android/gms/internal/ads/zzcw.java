package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzcw
{
  private static final String zzA = Integer.toString(9, 36);
  private static final String zzB = Integer.toString(10, 36);
  private static final String zzC = Integer.toString(11, 36);
  private static final String zzD = Integer.toString(12, 36);
  private static final String zzE = Integer.toString(13, 36);
  public static final Object zza = new Object();
  public static final zzn zzb = zzcv.zza;
  private static final Object zzq = new Object();
  private static final zzbq zzr;
  private static final String zzs;
  private static final String zzt;
  private static final String zzu;
  private static final String zzv;
  private static final String zzw;
  private static final String zzx;
  private static final String zzy;
  private static final String zzz;
  public Object zzc = zza;
  public zzbq zzd = zzr;
  public long zze;
  public long zzf;
  public long zzg;
  public boolean zzh;
  public boolean zzi;
  @Deprecated
  public boolean zzj;
  public zzbg zzk;
  public boolean zzl;
  public long zzm;
  public long zzn;
  public int zzo;
  public int zzp;
  
  static
  {
    zzat localzzat = new zzat();
    localzzat.zza("androidx.media3.common.Timeline");
    localzzat.zzb(Uri.EMPTY);
    zzr = localzzat.zzc();
    zzs = Integer.toString(1, 36);
    zzt = Integer.toString(2, 36);
    zzu = Integer.toString(3, 36);
    zzv = Integer.toString(4, 36);
    zzw = Integer.toString(5, 36);
    zzx = Integer.toString(6, 36);
    zzy = Integer.toString(7, 36);
    zzz = Integer.toString(8, 36);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass().equals(paramObject.getClass())))
    {
      paramObject = (zzcw)paramObject;
      if ((zzfn.zzB(this.zzc, ((zzcw)paramObject).zzc)) && (zzfn.zzB(this.zzd, ((zzcw)paramObject).zzd)) && (zzfn.zzB(null, null)) && (zzfn.zzB(this.zzk, ((zzcw)paramObject).zzk)) && (this.zze == ((zzcw)paramObject).zze) && (this.zzf == ((zzcw)paramObject).zzf) && (this.zzg == ((zzcw)paramObject).zzg) && (this.zzh == ((zzcw)paramObject).zzh) && (this.zzi == ((zzcw)paramObject).zzi) && (this.zzl == ((zzcw)paramObject).zzl) && (this.zzn == ((zzcw)paramObject).zzn) && (this.zzo == ((zzcw)paramObject).zzo) && (this.zzp == ((zzcw)paramObject).zzp)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zzc.hashCode();
    int j = this.zzd.hashCode();
    zzbg localzzbg = this.zzk;
    int i;
    if (localzzbg == null) {
      i = 0;
    } else {
      i = localzzbg.hashCode();
    }
    long l = this.zze;
    int n = (int)(l ^ l >>> 32);
    l = this.zzf;
    int i1 = (int)(l ^ l >>> 32);
    l = this.zzg;
    int i2 = (int)(l ^ l >>> 32);
    int m = this.zzh;
    int i3 = this.zzi;
    int i4 = this.zzl;
    l = this.zzn;
    return ((((((((((((k + 217) * 31 + j) * 961 + i) * 31 + n) * 31 + i1) * 31 + i2) * 31 + m) * 31 + i3) * 31 + i4) * 961 + (int)(l ^ l >>> 32)) * 31 + this.zzo) * 31 + this.zzp) * 31;
  }
  
  public final zzcw zza(Object paramObject1, zzbq paramzzbq, Object paramObject2, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, zzbg paramzzbg, long paramLong4, long paramLong5, int paramInt1, int paramInt2, long paramLong6)
  {
    this.zzc = paramObject1;
    if (paramzzbq == null) {
      paramzzbq = zzr;
    }
    this.zzd = paramzzbq;
    this.zze = -9223372036854775807L;
    this.zzf = -9223372036854775807L;
    this.zzg = -9223372036854775807L;
    this.zzh = paramBoolean1;
    this.zzi = paramBoolean2;
    if (paramzzbg != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    this.zzj = paramBoolean1;
    this.zzk = paramzzbg;
    this.zzm = 0L;
    this.zzn = paramLong5;
    this.zzo = 0;
    this.zzp = 0;
    this.zzl = false;
    return this;
  }
  
  public final boolean zzb()
  {
    boolean bool2 = this.zzj;
    boolean bool1;
    if (this.zzk == null) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    if (bool2 == bool1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzf(bool1);
    return this.zzk != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */