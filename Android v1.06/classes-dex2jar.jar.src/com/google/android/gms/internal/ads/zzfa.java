package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Objects;

final class zzfa
  extends BroadcastReceiver
{
  final zzfb zza;
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int j = 2;
    if (paramIntent == null) {}
    for (;;)
    {
      int i = 0;
      try
      {
        paramIntent = paramIntent.getActiveNetworkInfo();
        if ((paramIntent != null) && (paramIntent.isConnected()))
        {
          int k = paramIntent.getType();
          if (k != 0)
          {
            i = j;
            if (k == 1) {
              break label236;
            }
            if ((k != 4) && (k != 5))
            {
              if (k != 6)
              {
                if (k != 9)
                {
                  i = 8;
                  break label236;
                }
                i = 7;
                break label236;
              }
              i = 5;
              break label236;
            }
          }
          i = j;
        }
        else
        {
          switch (paramIntent.getSubtype())
          {
          case 13: 
          case 16: 
          case 19: 
          default: 
            i = 6;
            break;
          case 20: 
            if (zzfn.zza < 29) {
              continue;
            }
            i = 9;
            break;
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 14: 
          case 15: 
          case 17: 
            i = 4;
            break;
          case 1: 
          case 2: 
            i = 3;
            break label236;
            i = 1;
          }
        }
        label236:
        if ((zzfn.zza >= 31) && (i == 5))
        {
          paramIntent = this.zza;
          try
          {
            TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
            Objects.requireNonNull(localTelephonyManager);
            zzey localzzey = new com/google/android/gms/internal/ads/zzey;
            localzzey.<init>(paramIntent);
            localTelephonyManager.registerTelephonyCallback(paramContext.getMainExecutor(), localzzey);
            localTelephonyManager.unregisterTelephonyCallback(localzzey);
            return;
          }
          catch (RuntimeException paramContext)
          {
            zzfb.zzc(paramIntent, 5);
            return;
          }
        }
        zzfb.zzc(this.zza, i);
        return;
      }
      catch (SecurityException paramIntent) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */