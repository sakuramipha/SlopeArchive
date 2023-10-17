package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzekd
  implements zzeqq
{
  private final Context zza;
  
  zzekd(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final int zza()
  {
    return 2;
  }
  
  public final zzfwb zzb()
  {
    zzbbc localzzbbc = zzbbk.zzcB;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      boolean bool;
      if (ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return zzfvr.zzh(new zzeke(bool));
    }
    return zzfvr.zzh(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzekd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */