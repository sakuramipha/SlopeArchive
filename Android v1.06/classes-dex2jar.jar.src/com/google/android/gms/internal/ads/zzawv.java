package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class zzawv
{
  private final InputStream zza;
  private final boolean zzb;
  private final boolean zzc;
  private final long zzd;
  private final boolean zze;
  
  private zzawv(InputStream paramInputStream, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3)
  {
    this.zza = paramInputStream;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramLong;
    this.zze = paramBoolean3;
  }
  
  public static zzawv zzb(InputStream paramInputStream, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3)
  {
    return new zzawv(paramInputStream, paramBoolean1, paramBoolean2, paramLong, paramBoolean3);
  }
  
  public final long zza()
  {
    return this.zzd;
  }
  
  public final InputStream zzc()
  {
    return this.zza;
  }
  
  public final boolean zzd()
  {
    return this.zzb;
  }
  
  public final boolean zze()
  {
    return this.zze;
  }
  
  public final boolean zzf()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */