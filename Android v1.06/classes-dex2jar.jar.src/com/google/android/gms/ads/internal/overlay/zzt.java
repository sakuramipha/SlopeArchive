package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;

public final class zzt
  extends zzl
{
  public zzt(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void zzk(Bundle paramBundle)
  {
    zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
    this.zzn = 4;
    this.zzb.finish();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */