package com.google.android.gms.internal.ads;

public final class zzalo
{
  public final Object zza;
  public final zzakr zzb;
  public final zzalr zzc;
  public boolean zzd = false;
  
  private zzalo(zzalr paramzzalr)
  {
    this.zza = null;
    this.zzb = null;
    this.zzc = paramzzalr;
  }
  
  private zzalo(Object paramObject, zzakr paramzzakr)
  {
    this.zza = paramObject;
    this.zzb = paramzzakr;
    this.zzc = null;
  }
  
  public static zzalo zza(zzalr paramzzalr)
  {
    return new zzalo(paramzzalr);
  }
  
  public static zzalo zzb(Object paramObject, zzakr paramzzakr)
  {
    return new zzalo(paramObject, paramzzakr);
  }
  
  public final boolean zzc()
  {
    return this.zzc == null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */