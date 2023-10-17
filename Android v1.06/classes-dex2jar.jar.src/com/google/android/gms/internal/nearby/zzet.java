package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zzet
{
  private static final WeakHashMap<Activity, zzet> zza = new WeakHashMap();
  private final Context zzb;
  private final WeakReference<Activity> zzc;
  private final NfcAdapter zzd;
  private boolean zze = true;
  private boolean zzf;
  private boolean zzg;
  
  private zzet(Activity paramActivity)
  {
    Context localContext = paramActivity.getApplicationContext();
    this.zzb = localContext;
    WeakReference localWeakReference = new WeakReference(paramActivity);
    this.zzc = localWeakReference;
    this.zzd = NfcAdapter.getDefaultAdapter(localContext);
    paramActivity.getApplication().registerActivityLifecycleCallbacks(new zzes(this, localWeakReference));
    Log.d("NearbyConnections", "NfcDispatcher created.");
  }
  
  public static zzet zza(Activity paramActivity)
  {
    try
    {
      WeakHashMap localWeakHashMap = zza;
      if (!localWeakHashMap.containsKey(paramActivity))
      {
        zzet localzzet = new com/google/android/gms/internal/nearby/zzet;
        localzzet.<init>(paramActivity);
        localWeakHashMap.put(paramActivity, localzzet);
      }
      paramActivity = (zzet)localWeakHashMap.get(paramActivity);
      return paramActivity;
    }
    finally {}
  }
  
  private final void zzg()
  {
    Log.d("NearbyConnections", "Invalidating dispatch state.");
    if ((this.zze) && (this.zzf))
    {
      Log.d("NearbyConnections", "Starting NFC dispatching.");
      if (!this.zzg)
      {
        if ((Build.VERSION.SDK_INT >= 19) && (this.zzb.getPackageManager().hasSystemFeature("android.hardware.nfc")) && (ContextCompat.checkSelfPermission(this.zzb, "android.permission.NFC") == 0))
        {
          localObject = this.zzd;
          if ((localObject != null) && (((NfcAdapter)localObject).isEnabled()))
          {
            Activity localActivity = (Activity)this.zzc.get();
            if (localActivity == null)
            {
              Log.d("NearbyConnections", "Cannot dispatch NFC events. Activity is gone.");
              return;
            }
            localObject = new Bundle();
            ((Bundle)localObject).putInt("presence", 100);
            this.zzd.enableReaderMode(localActivity, new zzer(this), 385, (Bundle)localObject);
            this.zzg = true;
            Log.d("NearbyConnections", "Dispatching NFC events");
            return;
          }
        }
        Log.d("NearbyConnections", "Cannot dispatch NFC events. NFC is not supported.");
        return;
      }
      Log.d("NearbyConnections", "Can't start NFC dispatching. Already dispatching.");
      return;
    }
    Log.d("NearbyConnections", "Stopping NFC dispatching.");
    if (!this.zzg)
    {
      Log.d("NearbyConnections", "Can't stop NFC dispatching. Not dispatching.");
      return;
    }
    Object localObject = (Activity)this.zzc.get();
    if (localObject != null) {
      this.zzd.disableReaderMode((Activity)localObject);
    }
    this.zzg = false;
    Log.d("NearbyConnections", "No longer dispatching NFC events");
  }
  
  public final void zzb()
  {
    this.zzf = true;
    Log.d("NearbyConnections", "NFC discovery started.");
    zzg();
  }
  
  public final void zzc()
  {
    this.zzf = false;
    Log.d("NearbyConnections", "NFC discovery stopped.");
    zzg();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */