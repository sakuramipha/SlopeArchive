package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzez;

public final class GamesResolutionActivity
  extends Activity
{
  private ResultReceiver zza;
  
  private final void zza(int paramInt, Intent paramIntent)
  {
    ResultReceiver localResultReceiver = this.zza;
    if (localResultReceiver == null) {
      return;
    }
    if (paramIntent == null)
    {
      paramIntent = new Bundle();
    }
    else
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("resultData", paramIntent);
      paramIntent = localBundle;
    }
    localResultReceiver.send(paramInt, paramIntent);
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder(36);
      localStringBuilder.append("Unexpected request code: ");
      localStringBuilder.append(paramInt1);
      zzez.zzc("ResultActivity", localStringBuilder.toString());
      zza(0, paramIntent);
      finish();
      return;
    }
    zza(paramInt2, paramIntent);
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.zza = ((ResultReceiver)Preconditions.checkNotNull((ResultReceiver)paramBundle.getParcelable("resultReceiver")));
      return;
    }
    this.zza = ((ResultReceiver)Preconditions.checkNotNull((ResultReceiver)getIntent().getParcelableExtra("resultReceiver")));
    paramBundle = (PendingIntent)Preconditions.checkNotNull((PendingIntent)getIntent().getParcelableExtra("pendingIntent"));
    try
    {
      startIntentSenderForResult(paramBundle.getIntentSender(), 0, null, 0, 0, 0);
      return;
    }
    catch (IntentSender.SendIntentException paramBundle)
    {
      zzez.zzd("ResultActivity", "Failed to launch", paramBundle);
      zza(0, null);
      finish();
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("resultReceiver", this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\v2\resolution\GamesResolutionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */