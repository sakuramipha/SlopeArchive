package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzefr
{
  private zzefk zza;
  
  zzefr() {}
  
  private zzefr(zzefk paramzzefk)
  {
    this.zza = paramzzefk;
  }
  
  public static zzefr zzb(zzefk paramzzefk)
  {
    return new zzefr(paramzzefk);
  }
  
  public final zzefk zza(Clock paramClock, zzefl paramzzefl, zzeca paramzzeca, zzfgj paramzzfgj)
  {
    zzefk localzzefk = this.zza;
    if (localzzefk != null) {
      return localzzefk;
    }
    return new zzefk(paramClock, paramzzefl, paramzzeca, paramzzfgj);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */