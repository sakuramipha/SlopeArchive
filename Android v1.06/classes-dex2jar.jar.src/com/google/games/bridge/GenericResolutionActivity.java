package com.google.games.bridge;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;

public final class GenericResolutionActivity
  extends Activity
{
  static final int SELECT_UI_STATUS_INTERNAL_ERROR = 0;
  static final int SELECT_UI_STATUS_RESULT_OK = -1;
  
  private void finishWithResult(int paramInt)
  {
    setResult(paramInt);
    finish();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 9011)
    {
      if (paramInt2 == -1) {
        finishWithResult(-1);
      } else {
        finishWithResult(0);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = (PendingIntent)getIntent().getParcelableExtra("RequestFriendsAccessPermissionPendingIntent");
    try
    {
      startIntentSenderForResult(paramBundle.getIntentSender(), 9011, null, 0, 0, 0, null);
    }
    catch (IntentSender.SendIntentException paramBundle)
    {
      finishWithResult(0);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\GenericResolutionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */