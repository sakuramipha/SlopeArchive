package com.google.android.gms.internal.ads;

abstract class zzacw
{
  protected final zzabr zza;
  
  protected zzacw(zzabr paramzzabr)
  {
    this.zza = paramzzabr;
  }
  
  protected abstract boolean zza(zzfd paramzzfd)
    throws zzce;
  
  protected abstract boolean zzb(zzfd paramzzfd, long paramLong)
    throws zzce;
  
  public final boolean zzf(zzfd paramzzfd, long paramLong)
    throws zzce
  {
    return (zza(paramzzfd)) && (zzb(paramzzfd, paramLong));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */