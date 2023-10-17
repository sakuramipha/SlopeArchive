package com.google.games.bridge;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

class GenericResolutionUiRequest
  implements HelperFragment.Request
{
  static final int SELECT_UI_STATUS_INTERNAL_ERROR = -2;
  static final int SELECT_UI_STATUS_RESULT_OK = 1;
  static final int SELECT_UI_STATUS_USER_CLOSED_UI = -6;
  private static final String TAG = "FriendsSharingConsent";
  private final PendingIntent pendingIntent;
  private final TaskCompletionSource<Integer> resultTaskSource = new TaskCompletionSource();
  
  GenericResolutionUiRequest(PendingIntent paramPendingIntent)
  {
    this.pendingIntent = paramPendingIntent;
  }
  
  Task<Integer> getTask()
  {
    return this.resultTaskSource.getTask();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 9011) {
      if (paramInt2 == -1)
      {
        setResult(Integer.valueOf(1));
      }
      else if (paramInt2 == 0)
      {
        setResult(Integer.valueOf(-6));
      }
      else
      {
        paramIntent = new StringBuilder(48);
        paramIntent.append("onActivityResult unknown resultCode: ");
        paramIntent.append(paramInt2);
        Log.d("FriendsSharingConsent", paramIntent.toString());
        setResult(Integer.valueOf(-2));
      }
    }
  }
  
  public void process(HelperFragment paramHelperFragment)
  {
    Intent localIntent = new Intent(paramHelperFragment.getActivity(), GenericResolutionActivity.class);
    localIntent.putExtra("RequestFriendsAccessPermissionPendingIntent", this.pendingIntent);
    paramHelperFragment.startActivityForResult(localIntent, 9011);
  }
  
  void setFailure(Exception paramException)
  {
    this.resultTaskSource.setException(paramException);
    HelperFragment.finishRequest(this);
  }
  
  void setResult(Integer paramInteger)
  {
    this.resultTaskSource.setResult(paramInteger);
    HelperFragment.finishRequest(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\GenericResolutionUiRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */