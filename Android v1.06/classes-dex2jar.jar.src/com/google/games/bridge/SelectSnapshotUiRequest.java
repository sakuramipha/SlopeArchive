package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

class SelectSnapshotUiRequest
  implements HelperFragment.Request
{
  static final int SELECT_UI_STATUS_AUTHENTICATION_ERROR = -3;
  static final int SELECT_UI_STATUS_GAME_SELECTED = 1;
  static final int SELECT_UI_STATUS_INTERNAL_ERROR = -1;
  static final int SELECT_UI_STATUS_UI_BUSY = -5;
  static final int SELECT_UI_STATUS_USER_CLOSED_UI = 2;
  private static final String TAG = "SelectSnapshotUiRequest";
  private boolean allowAddButton;
  private boolean allowDelete;
  private int maxSnapshots;
  private final TaskCompletionSource<Result> resultTaskSource = new TaskCompletionSource();
  private String title;
  
  SelectSnapshotUiRequest(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.title = paramString;
    this.allowAddButton = paramBoolean1;
    this.allowDelete = paramBoolean2;
    this.maxSnapshots = paramInt;
  }
  
  Task<Result> getTask()
  {
    return this.resultTaskSource.getTask();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 9004) {
      if (paramInt2 == -1)
      {
        setResult(1, (SnapshotMetadata)paramIntent.getParcelableExtra("com.google.android.gms.games.SNAPSHOT_METADATA"));
      }
      else if (paramInt2 == 0)
      {
        setResult(2);
      }
      else if (paramInt2 == 10001)
      {
        setResult(-3);
      }
      else
      {
        paramIntent = new StringBuilder(48);
        paramIntent.append("onActivityResult unknown resultCode: ");
        paramIntent.append(paramInt2);
        Log.d("SelectSnapshotUiRequest", paramIntent.toString());
        setResult(-1);
      }
    }
  }
  
  public void process(final HelperFragment paramHelperFragment)
  {
    Activity localActivity = paramHelperFragment.getActivity();
    PlayGames.getSnapshotsClient(localActivity).getSelectSnapshotIntent(this.title, this.allowAddButton, this.allowDelete, this.maxSnapshots).addOnSuccessListener(localActivity, new OnSuccessListener()
    {
      public void onSuccess(Intent paramAnonymousIntent)
      {
        Utils.startActivityForResult(paramHelperFragment, paramAnonymousIntent, 9004);
      }
    }).addOnFailureListener(localActivity, new OnFailureListener()
    {
      public void onFailure(Exception paramAnonymousException)
      {
        SelectSnapshotUiRequest.this.setFailure(paramAnonymousException);
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
    setResult(paramInt, null);
  }
  
  void setResult(int paramInt, SnapshotMetadata paramSnapshotMetadata)
  {
    paramSnapshotMetadata = new Result(paramInt, paramSnapshotMetadata);
    this.resultTaskSource.setResult(paramSnapshotMetadata);
    HelperFragment.finishRequest(this);
  }
  
  public class Result
  {
    public SnapshotMetadata metadata;
    public int status;
    
    Result(int paramInt, SnapshotMetadata paramSnapshotMetadata)
    {
      this.status = paramInt;
      this.metadata = paramSnapshotMetadata;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\SelectSnapshotUiRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */