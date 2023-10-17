package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;

public final class zzam
{
  public IBinder zza;
  public final int zzb;
  public int zzc = -1;
  public int zzd = 0;
  public int zze = 0;
  public int zzf = 0;
  public int zzg = 0;
  
  public zzam(int paramInt, IBinder paramIBinder)
  {
    this.zzb = paramInt;
    this.zza = null;
  }
  
  public final Bundle zza()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("popupLocationInfo.gravity", this.zzb);
    localBundle.putInt("popupLocationInfo.displayId", this.zzc);
    localBundle.putInt("popupLocationInfo.left", this.zzd);
    localBundle.putInt("popupLocationInfo.top", this.zze);
    localBundle.putInt("popupLocationInfo.right", this.zzf);
    localBundle.putInt("popupLocationInfo.bottom", this.zzg);
    return localBundle;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */