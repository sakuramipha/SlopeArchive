package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

class SimpleUiRequest
  implements HelperFragment.Request
{
  private static final String TAG = "SimpleUiRequest";
  private final TaskCompletionSource<Integer> resultTaskSource = new TaskCompletionSource();
  
  protected Task<Intent> getIntent(Activity paramActivity)
  {
    return null;
  }
  
  public Task<Integer> getTask()
  {
    return this.resultTaskSource.getTask();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 9003) {
      if ((paramInt2 != -1) && (paramInt2 != 0))
      {
        if (paramInt2 == 10001)
        {
          setResult(-3);
        }
        else
        {
          paramIntent = new StringBuilder(48);
          paramIntent.append("onActivityResult unknown resultCode: ");
          paramIntent.append(paramInt2);
          Log.d("SimpleUiRequest", paramIntent.toString());
          setResult(-2);
        }
      }
      else {
        setResult(1);
      }
    }
  }
  
  public void process(final HelperFragment paramHelperFragment)
  {
    Activity localActivity = paramHelperFragment.getActivity();
    getIntent(localActivity).addOnSuccessListener(localActivity, new OnSuccessListener()
    {
      public void onSuccess(Intent paramAnonymousIntent)
      {
        Utils.startActivityForResult(paramHelperFragment, paramAnonymousIntent, 9003);
      }
    }).addOnFailureListener(localActivity, new OnFailureListener()
    {
      public void onFailure(Exception paramAnonymousException)
      {
        SimpleUiRequest.this.setFailure(paramAnonymousException);
      }
    });
  }
  
  void setFailure(Exception paramException)
  {
    this.resultTaskSource.setException(paramException);
    HelperFragment.finishRequest(this);
  }
  
  void setResult(int paramInt)
  {
    this.resultTaskSource.setResult(Integer.valueOf(paramInt));
    HelperFragment.finishRequest(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\SimpleUiRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */