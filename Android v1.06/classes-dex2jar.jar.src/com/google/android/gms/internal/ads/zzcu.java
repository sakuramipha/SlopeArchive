package com.google.android.gms.internal.ads;

public final class zzcu
{
  public static final zzn zza = zzct.zza;
  private static final String zzh = Integer.toString(0, 36);
  private static final String zzi = Integer.toString(1, 36);
  private static final String zzj = Integer.toString(2, 36);
  private static final String zzk = Integer.toString(3, 36);
  private static final String zzl = Integer.toString(4, 36);
  public Object zzb;
  public Object zzc;
  public int zzd;
  public long zze;
  public long zzf;
  public boolean zzg;
  private zzd zzm = zzd.zza;
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass().equals(paramObject.getClass())))
    {
      paramObject = (zzcu)paramObject;
      if ((zzfn.zzB(this.zzb, ((zzcu)paramObject).zzb)) && (zzfn.zzB(this.zzc, ((zzcu)paramObject).zzc)) && (this.zzd == ((zzcu)paramObject).zzd) && (this.zze == ((zzcu)paramObject).zze) && (this.zzg == ((zzcu)paramObject).zzg) && (zzfn.zzB(this.zzm, ((zzcu)paramObject).zzm))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = this.zzb;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    localObject = this.zzc;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    int k = this.zzd;
    long l = this.zze;
    return (((((i + 217) * 31 + j) * 31 + k) * 31 + (int)(l ^ l >>> 32)) * 961 + this.zzg) * 31 + this.zzm.hashCode();
  }
  
  public final int zza(int paramInt)
  {
    return this.zzm.zza(paramInt).zzc;
  }
  
  public final int zzb()
  {
    int i = this.zzm.zzc;
    return 0;
  }
  
  public final int zzc(long paramLong)
  {
    return -1;
  }
  
  public final int zzd(long paramLong)
  {
    this.zzm.zzb(-1);
    return -1;
  }
  
  public final int zze(int paramInt)
  {
    return this.zzm.zza(paramInt).zza(-1);
  }
  
  public final int zzf(int paramInt1, int paramInt2)
  {
    return this.zzm.zza(paramInt1).zza(paramInt2);
  }
  
  public final int zzg()
  {
    int i = this.zzm.zze;
    return 0;
  }
  
  public final long zzh(int paramInt1, int paramInt2)
  {
    zzc localzzc = this.zzm.zza(paramInt1);
    if (localzzc.zzc != -1) {
      return localzzc.zzf[paramInt2];
    }
    return -9223372036854775807L;
  }
  
  public final long zzi(int paramInt)
  {
    long l = this.zzm.zza(paramInt).zzb;
    return 0L;
  }
  
  public final long zzj()
  {
    long l = this.zzm.zzd;
    return 0L;
  }
  
  public final long zzk(int paramInt)
  {
    long l = this.zzm.zza(paramInt).zzg;
    return 0L;
  }
  
  public final zzcu zzl(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, zzd paramzzd, boolean paramBoolean)
  {
    this.zzb = paramObject1;
    this.zzc = paramObject2;
    this.zzd = 0;
    this.zze = paramLong1;
    this.zzf = 0L;
    this.zzm = paramzzd;
    this.zzg = paramBoolean;
    return this;
  }
  
  public final boolean zzm(int paramInt)
  {
    zzb();
    if (paramInt == -1) {
      this.zzm.zzb(-1);
    }
    return false;
  }
  
  public final boolean zzn(int paramInt)
  {
    boolean bool = this.zzm.zza(paramInt).zzh;
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */