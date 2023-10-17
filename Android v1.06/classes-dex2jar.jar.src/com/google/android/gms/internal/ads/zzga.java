package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class zzga
{
  private Uri zza;
  private Map zzb = Collections.emptyMap();
  private long zzc;
  private int zzd;
  
  public final zzga zza(int paramInt)
  {
    this.zzd = 6;
    return this;
  }
  
  public final zzga zzb(Map paramMap)
  {
    this.zzb = paramMap;
    return this;
  }
  
  public final zzga zzc(long paramLong)
  {
    this.zzc = paramLong;
    return this;
  }
  
  public final zzga zzd(Uri paramUri)
  {
    this.zza = paramUri;
    return this;
  }
  
  public final zzgc zze()
  {
    if (this.zza != null) {
      return new zzgc(this.zza, 0L, 1, null, this.zzb, this.zzc, -1L, null, this.zzd, null, null);
    }
    throw new IllegalStateException("The uri must be set.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */