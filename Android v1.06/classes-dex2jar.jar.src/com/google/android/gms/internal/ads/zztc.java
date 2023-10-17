package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zztc
{
  private static final AtomicLong zzd = new AtomicLong();
  public final zzgc zza;
  public final Uri zzb;
  public final Map zzc;
  
  public zztc(long paramLong1, zzgc paramzzgc, Uri paramUri, Map paramMap, long paramLong2, long paramLong3, long paramLong4)
  {
    this.zza = paramzzgc;
    this.zzb = paramUri;
    this.zzc = paramMap;
  }
  
  public static long zza()
  {
    return zzd.getAndIncrement();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */