package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfmz
  extends zzfnp
{
  final zzfnb zze;
  
  zzfmz(zzfnb paramzzfnb, TaskCompletionSource paramTaskCompletionSource1, zzfni paramzzfni, int paramInt, zzfng paramzzfng, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(paramTaskCompletionSource1);
  }
  
  protected final void zza()
  {
    try
    {
      IInterface localIInterface = this.zze.zza.zze();
      zzfni localzzfni = this.zza;
      Object localObject = zzfnb.zzb(this.zze);
      int i = this.zzb;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("sessionToken", localzzfni.zzb());
      localBundle.putInt("displayMode", i);
      localBundle.putString("callerPackage", (String)localObject);
      localBundle.putString("appId", localzzfni.zza());
      localObject = new com/google/android/gms/internal/ads/zzfna;
      ((zzfna)localObject).<init>(this.zze, this.zzc);
      localIInterface.zzg(localBundle, (zzfnn)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzfnb.zza().zzb(localRemoteException, "switchDisplayMode overlay display to %d from: %s", new Object[] { Integer.valueOf(this.zzb), zzfnb.zzb(this.zze) });
      this.zzd.trySetException(new RuntimeException(localRemoteException));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfmz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */