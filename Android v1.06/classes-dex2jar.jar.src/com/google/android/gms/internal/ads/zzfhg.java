package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfhg
{
  private static final zzfhg zza = new zzfhg();
  private Context zzb;
  
  public static zzfhg zzb()
  {
    return zza;
  }
  
  public final Context zza()
  {
    return this.zzb;
  }
  
  public final void zzc(Context paramContext)
  {
    if (paramContext != null) {
      paramContext = paramContext.getApplicationContext();
    } else {
      paramContext = null;
    }
    this.zzb = paramContext;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */