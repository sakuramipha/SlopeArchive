package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzln
  implements zzlu
{
  private final zzlj zza;
  private final zzml zzb;
  private final boolean zzc;
  private final zzjp zzd;
  
  private zzln(zzml paramzzml, zzjp paramzzjp, zzlj paramzzlj)
  {
    this.zzb = paramzzml;
    this.zzc = paramzzjp.zzc(paramzzlj);
    this.zzd = paramzzjp;
    this.zza = paramzzlj;
  }
  
  static zzln zzc(zzml paramzzml, zzjp paramzzjp, zzlj paramzzlj)
  {
    return new zzln(paramzzml, paramzzjp, paramzzlj);
  }
  
  public final int zza(Object paramObject)
  {
    zzml localzzml = this.zzb;
    int i = localzzml.zzb(localzzml.zzc(paramObject));
    if (!this.zzc) {
      return i;
    }
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final int zzb(Object paramObject)
  {
    int i = this.zzb.zzc(paramObject).hashCode();
    if (!this.zzc) {
      return i;
    }
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final Object zze()
  {
    return this.zza.zzbI().zzaG();
  }
  
  public final void zzf(Object paramObject)
  {
    this.zzb.zzg(paramObject);
    this.zzd.zzb(paramObject);
  }
  
  public final void zzg(Object paramObject1, Object paramObject2)
  {
    zzlw.zzF(this.zzb, paramObject1, paramObject2);
    if (this.zzc) {
      zzlw.zzE(this.zzd, paramObject1, paramObject2);
    }
  }
  
  public final void zzh(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzio paramzzio)
    throws IOException
  {
    paramArrayOfByte = (zzkc)paramObject;
    if (paramArrayOfByte.zzc == zzmm.zzc()) {
      paramArrayOfByte.zzc = zzmm.zze();
    }
    paramObject = (zzjz)paramObject;
    throw null;
  }
  
  public final void zzi(Object paramObject, zznd paramzznd)
    throws IOException
  {
    this.zzd.zza(paramObject);
    throw null;
  }
  
  public final boolean zzj(Object paramObject1, Object paramObject2)
  {
    if (!this.zzb.zzc(paramObject1).equals(this.zzb.zzc(paramObject2))) {
      return false;
    }
    if (!this.zzc) {
      return true;
    }
    this.zzd.zza(paramObject1);
    this.zzd.zza(paramObject2);
    throw null;
  }
  
  public final boolean zzk(Object paramObject)
  {
    this.zzd.zza(paramObject);
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */