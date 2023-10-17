package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfmx
  extends zzfnp
{
  final zzfnb zzd;
  
  zzfmx(zzfnb paramzzfnb, TaskCompletionSource paramTaskCompletionSource1, zzfnd paramzzfnd, zzfng paramzzfng, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(paramTaskCompletionSource1);
  }
  
  protected final void zza()
  {
    try
    {
      IInterface localIInterface = this.zzd.zza.zze();
      Object localObject2 = this.zzd;
      String str1 = zzfnb.zzb((zzfnb)localObject2);
      Object localObject1 = this.zza;
      String str2 = zzfnb.zzb((zzfnb)localObject2);
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      ((Bundle)localObject2).putBinder("windowToken", ((zzfnd)localObject1).zze());
      ((Bundle)localObject2).putString("adFieldEnifd", ((zzfnd)localObject1).zzf());
      ((Bundle)localObject2).putInt("layoutGravity", ((zzfnd)localObject1).zzc());
      ((Bundle)localObject2).putFloat("layoutVerticalMargin", ((zzfnd)localObject1).zza());
      ((Bundle)localObject2).putInt("displayMode", 0);
      ((Bundle)localObject2).putInt("windowWidthPx", ((zzfnd)localObject1).zzd());
      ((Bundle)localObject2).putBoolean("stableSessionToken", false);
      ((Bundle)localObject2).putString("callerPackage", str2);
      if (((zzfnd)localObject1).zzg() != null) {
        ((Bundle)localObject2).putString("appId", ((zzfnd)localObject1).zzg());
      }
      localObject1 = new com/google/android/gms/internal/ads/zzfna;
      ((zzfna)localObject1).<init>(this.zzd, this.zzb);
      localIInterface.zzf(str1, (Bundle)localObject2, (zzfnn)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzfnb.zza().zzb(localRemoteException, "show overlay display from: %s", new Object[] { zzfnb.zzb(this.zzd) });
      this.zzc.trySetException(new RuntimeException(localRemoteException));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */