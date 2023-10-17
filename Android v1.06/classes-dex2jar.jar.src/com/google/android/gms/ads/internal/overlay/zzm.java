package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzdcw;

public final class zzm
{
  public static final void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((paramAdOverlayInfoParcel.zzk == 4) && (paramAdOverlayInfoParcel.zzc == null))
    {
      localObject1 = paramAdOverlayInfoParcel.zzb;
      if (localObject1 != null) {
        ((com.google.android.gms.ads.internal.client.zza)localObject1).onAdClicked();
      }
      localObject1 = paramAdOverlayInfoParcel.zzy;
      if (localObject1 != null) {
        ((zzdcw)localObject1).zzr();
      }
      localObject2 = paramAdOverlayInfoParcel.zzd.zzi();
      zzc localzzc = paramAdOverlayInfoParcel.zza;
      localObject1 = paramContext;
      if (localzzc != null)
      {
        localObject1 = paramContext;
        if (localzzc.zzj)
        {
          localObject1 = paramContext;
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
      }
      zzt.zzh();
      localObject2 = paramAdOverlayInfoParcel.zza;
      paramAdOverlayInfoParcel = paramAdOverlayInfoParcel.zzi;
      if (localObject2 != null) {
        paramContext = ((zzc)localObject2).zzi;
      } else {
        paramContext = null;
      }
      zza.zzb((Context)localObject1, (zzc)localObject2, paramAdOverlayInfoParcel, paramContext);
      return;
    }
    Object localObject2 = new Intent();
    ((Intent)localObject2).setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ((Intent)localObject2).putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.zzm.zzd);
    ((Intent)localObject2).putExtra("shouldCallOnOverlayOpened", paramBoolean);
    Object localObject1 = new Bundle(1);
    ((Bundle)localObject1).putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    ((Intent)localObject2).putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", (Bundle)localObject1);
    if (!PlatformVersion.isAtLeastLollipop()) {
      ((Intent)localObject2).addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      ((Intent)localObject2).addFlags(268435456);
    }
    zzt.zzp();
    zzs.zzP(paramContext, (Intent)localObject2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */