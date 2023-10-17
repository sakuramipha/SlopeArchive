package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;

public class GoogleApiActivity
  extends Activity
  implements DialogInterface.OnCancelListener
{
  protected int zaa = 0;
  
  public static Intent zaa(Context paramContext, PendingIntent paramPendingIntent, int paramInt, boolean paramBoolean)
  {
    paramContext = new Intent(paramContext, GoogleApiActivity.class);
    paramContext.putExtra("pending_intent", paramPendingIntent);
    paramContext.putExtra("failing_client_id", paramInt);
    paramContext.putExtra("notify_manager", paramBoolean);
    return paramContext;
  }
  
  private final void zab()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null)
    {
      Log.e("GoogleApiActivity", "Activity started without extras");
      finish();
      return;
    }
    Object localObject2 = (PendingIntent)localBundle.get("pending_intent");
    Integer localInteger = (Integer)localBundle.get("error_code");
    if ((localObject2 == null) && (localInteger == null))
    {
      Log.e("GoogleApiActivity", "Activity started without resolution");
      finish();
      return;
    }
    if (localObject2 != null) {
      try
      {
        startIntentSenderForResult(((PendingIntent)localObject2).getIntentSender(), 1, null, 0, 0, 0);
        this.zaa = 1;
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", localSendIntentException);
        finish();
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        if (localSendIntentException.getBoolean("notify_manager", true))
        {
          GoogleApiManager.zam(this).zaz(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
        }
        else
        {
          localObject2 = localObject2.toString();
          Object localObject1 = new StringBuilder(((String)localObject2).length() + 36);
          ((StringBuilder)localObject1).append("Activity not found while launching ");
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(".");
          localObject2 = ((StringBuilder)localObject1).toString();
          localObject1 = localObject2;
          if (Build.FINGERPRINT.contains("generic")) {
            localObject1 = ((String)localObject2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
          }
          Log.e("GoogleApiActivity", (String)localObject1, localActivityNotFoundException);
        }
        this.zaa = 1;
        finish();
        return;
      }
    }
    int i = ((Integer)Preconditions.checkNotNull(localActivityNotFoundException)).intValue();
    GoogleApiAvailability.getInstance().showErrorDialogFragment(this, i, 2, this);
    this.zaa = 1;
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.zaa = 0;
      setResult(paramInt2, paramIntent);
      if (bool)
      {
        paramIntent = GoogleApiManager.zam(this);
        if (paramInt2 != -1)
        {
          if (paramInt2 == 0) {
            paramIntent.zaz(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
          }
        }
        else {
          paramIntent.zaA();
        }
      }
    }
    else if (paramInt1 == 2)
    {
      this.zaa = 0;
      setResult(paramInt2, paramIntent);
    }
    finish();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.zaa = 0;
    setResult(0);
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.zaa = paramBundle.getInt("resolution");
    }
    if (this.zaa != 1) {
      zab();
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("resolution", this.zaa);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */