package com.google.android.gms.games.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.games_v2.zzaj;
import com.google.android.gms.internal.games_v2.zzez;

final class zzw
  extends zzaj
{
  final zzak zza;
  
  zzw(zzak paramzzak)
  {
    super(paramzzak.getContext().getMainLooper(), 1000);
  }
  
  protected final void zza(String paramString, int paramInt)
  {
    try
    {
      if (this.zza.isConnected())
      {
        ((zzap)this.zza.getService()).zzw(paramString, paramInt);
        return;
      }
      int i = String.valueOf(paramString).length();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i + 89);
      localStringBuilder.append("Unable to increment event ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" by ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" because the games client is no longer connected");
      zzez.zzc("GamesGmsClientImpl", localStringBuilder.toString());
      return;
    }
    catch (SecurityException paramString)
    {
      paramInt = zzak.zze;
      zzez.zzd("GamesGmsClientImpl", "Is player signed out?", paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzak.zzr(paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */