package com.google.android.gms.internal.ads;

final class zzny
{
  final zznz zza;
  private final String zzb;
  private int zzc;
  private long zzd;
  private zztl zze;
  private boolean zzf;
  private boolean zzg;
  
  public zzny(zznz paramzznz, String paramString, int paramInt, zztl paramzztl)
  {
    this.zzb = paramString;
    this.zzc = paramInt;
    long l;
    if (paramzztl == null) {
      l = -1L;
    } else {
      l = paramzztl.zzd;
    }
    this.zzd = l;
    if ((paramzztl != null) && (paramzztl.zzb())) {
      this.zze = paramzztl;
    }
  }
  
  public final void zzg(int paramInt, zztl paramzztl)
  {
    if ((this.zzd == -1L) && (paramInt == this.zzc) && (paramzztl != null)) {
      this.zzd = paramzztl.zzd;
    }
  }
  
  public final boolean zzj(int paramInt, zztl paramzztl)
  {
    if (paramzztl == null) {
      return paramInt == this.zzc;
    }
    zztl localzztl = this.zze;
    if (localzztl == null) {
      return (!paramzztl.zzb()) && (paramzztl.zzd == this.zzd);
    }
    return (paramzztl.zzd == localzztl.zzd) && (paramzztl.zzb == localzztl.zzb) && (paramzztl.zzc == localzztl.zzc);
  }
  
  public final boolean zzk(zzlt paramzzlt)
  {
    zztl localzztl = paramzzlt.zzd;
    boolean bool2 = true;
    if (localzztl == null) {
      return this.zzc != paramzzlt.zzc;
    }
    long l = this.zzd;
    if (l == -1L) {
      return false;
    }
    if (localzztl.zzd > l) {
      return true;
    }
    if (this.zze == null) {
      return false;
    }
    int i = paramzzlt.zzb.zza(localzztl.zza);
    int j = paramzzlt.zzb.zza(this.zze.zza);
    localzztl = paramzzlt.zzd;
    if ((localzztl.zzd >= this.zze.zzd) && (i >= j))
    {
      if (i > j) {
        return true;
      }
      if (localzztl.zzb())
      {
        paramzzlt = paramzzlt.zzd;
        j = paramzzlt.zzb;
        int k = paramzzlt.zzc;
        paramzzlt = this.zze;
        i = paramzzlt.zzb;
        boolean bool1 = bool2;
        if (j <= i) {
          if (j == i)
          {
            if (k > paramzzlt.zzc) {
              bool1 = bool2;
            } else {
              return false;
            }
          }
          else {
            bool1 = false;
          }
        }
        return bool1;
      }
      i = paramzzlt.zzd.zze;
      return (i == -1) || (i > this.zze.zzb);
    }
    return false;
  }
  
  public final boolean zzl(zzcx paramzzcx1, zzcx paramzzcx2)
  {
    int i = this.zzc;
    if (i >= paramzzcx1.zzc())
    {
      if (i < paramzzcx2.zzc()) {}
    }
    else {
      for (;;)
      {
        i = -1;
        break;
        paramzzcx1.zze(i, zznz.zzb(this.zza), 0L);
        for (i = zznz.zzb(this.zza).zzo; i <= zznz.zzb(this.zza).zzp; i++)
        {
          int j = paramzzcx2.zza(paramzzcx1.zzf(i));
          if (j != -1)
          {
            i = paramzzcx2.zzd(j, zznz.zza(this.zza), false).zzd;
            break label112;
          }
        }
      }
    }
    label112:
    this.zzc = i;
    if (i == -1) {
      return false;
    }
    paramzzcx1 = this.zze;
    if (paramzzcx1 == null) {
      return true;
    }
    return paramzzcx2.zza(paramzzcx1.zza) != -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */