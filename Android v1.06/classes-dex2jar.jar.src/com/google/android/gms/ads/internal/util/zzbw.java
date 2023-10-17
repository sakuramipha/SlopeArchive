package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbw
{
  final Map zza = new ConcurrentHashMap();
  private final AtomicInteger zzb = new AtomicInteger(0);
  
  public final Bitmap zza(Integer paramInteger)
  {
    return (Bitmap)this.zza.get(paramInteger);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */