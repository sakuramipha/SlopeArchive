package com.google.android.gms.internal.ads;

final class zzte
  extends zzsz
{
  public static final Object zzd = new Object();
  private final Object zze;
  private final Object zzf;
  
  private zzte(zzcx paramzzcx, Object paramObject1, Object paramObject2)
  {
    super(paramzzcx);
    this.zze = paramObject1;
    this.zzf = paramObject2;
  }
  
  public static zzte zzq(zzbq paramzzbq)
  {
    return new zzte(new zztf(paramzzbq), zzcw.zza, zzd);
  }
  
  public static zzte zzr(zzcx paramzzcx, Object paramObject1, Object paramObject2)
  {
    return new zzte(paramzzcx, paramObject1, paramObject2);
  }
  
  public final int zza(Object paramObject)
  {
    zzcx localzzcx = this.zzc;
    Object localObject1 = paramObject;
    if (zzd.equals(paramObject))
    {
      Object localObject2 = this.zzf;
      localObject1 = paramObject;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    return localzzcx.zza(localObject1);
  }
  
  public final zzcu zzd(int paramInt, zzcu paramzzcu, boolean paramBoolean)
  {
    this.zzc.zzd(paramInt, paramzzcu, paramBoolean);
    if ((zzfn.zzB(paramzzcu.zzc, this.zzf)) && (paramBoolean)) {
      paramzzcu.zzc = zzd;
    }
    return paramzzcu;
  }
  
  public final zzcw zze(int paramInt, zzcw paramzzcw, long paramLong)
  {
    this.zzc.zze(paramInt, paramzzcw, paramLong);
    if (zzfn.zzB(paramzzcw.zzc, this.zze)) {
      paramzzcw.zzc = zzcw.zza;
    }
    return paramzzcw;
  }
  
  public final Object zzf(int paramInt)
  {
    Object localObject2 = this.zzc.zzf(paramInt);
    Object localObject1 = localObject2;
    if (zzfn.zzB(localObject2, this.zzf)) {
      localObject1 = zzd;
    }
    return localObject1;
  }
  
  public final zzte zzp(zzcx paramzzcx)
  {
    return new zzte(paramzzcx, this.zze, this.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */