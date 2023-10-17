package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfmy
  extends zzfnp
{
  final zzfnb zzd;
  
  zzfmy(zzfnb paramzzfnb, TaskCompletionSource paramTaskCompletionSource1, zzfms paramzzfms, zzfng paramzzfng, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(paramTaskCompletionSource1);
  }
  
  protected final void zza()
  {
    try
    {
      IInterface localIInterface = this.zzd.zza.zze();
      Object localObject = this.zza;
      String str = zzfnb.zzb(this.zzd);
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("sessionToken", ((zzfms)localObject).zzb());
      localBundle.putString("callerPackage", str);
      localBundle.putString("appId", ((zzfms)localObject).zza());
      localObject = new com/google/android/gms/internal/ads/zzfna;
      ((zzfna)localObject).<init>(this.zzd, this.zzb);
      localIInterface.zze(localBundle, (zzfnn)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzfnb.zza().zzb(localRemoteException, "dismiss overlay display from: %s", new Object[] { zzfnb.zzb(this.zzd) });
      this.zzc.trySetException(new RuntimeException(localRemoteException));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */