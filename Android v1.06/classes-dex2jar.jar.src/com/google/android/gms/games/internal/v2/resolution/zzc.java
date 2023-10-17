package com.google.android.gms.games.internal.v2.resolution;

import android.content.Intent;

public final class zzc
{
  private final boolean zza;
  private final Intent zzb;
  
  private zzc(boolean paramBoolean, Intent paramIntent)
  {
    this.zza = paramBoolean;
    this.zzb = paramIntent;
  }
  
  public static zzc zzb(Intent paramIntent)
  {
    return new zzc(false, paramIntent);
  }
  
  public static zzc zzc(Intent paramIntent)
  {
    return new zzc(true, paramIntent);
  }
  
  public final Intent zza()
  {
    return this.zzb;
  }
  
  public final boolean zzd()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\v2\resolution\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */