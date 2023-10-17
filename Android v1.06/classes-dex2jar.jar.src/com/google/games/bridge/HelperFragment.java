package com.google.games.bridge;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.Task;

public class HelperFragment
  extends Fragment
{
  private static final String FRAGMENT_TAG = "gpg.HelperFragment";
  static final int RC_RESOLUTION_DIALOG = 9011;
  static final int RC_SELECT_OPPONENTS_UI = 9006;
  static final int RC_SELECT_SNAPSHOT_UI = 9004;
  static final int RC_SHOW_REQUEST_PERMISSIONS_UI = 9010;
  static final int RC_SIGN_IN = 9002;
  static final int RC_SIMPLE_UI = 9003;
  private static final String TAG = "HelperFragment";
  private static HelperFragment helperFragment;
  private static final Object lock = new Object();
  private static Request pendingRequest;
  private static Request runningRequest;
  
  public static Task<Integer> askForLoadFriendsResolution(Activity paramActivity, PendingIntent paramPendingIntent)
  {
    paramPendingIntent = new GenericResolutionUiRequest(paramPendingIntent);
    if (!startRequest(paramActivity, paramPendingIntent)) {
      paramPendingIntent.setResult(Integer.valueOf(-12));
    }
    return paramPendingIntent.getTask();
  }
  
  public static View createInvisibleView(Activity paramActivity)
  {
    paramActivity = new View(paramActivity);
    paramActivity.setVisibility(4);
    paramActivity.setClickable(false);
    return paramActivity;
  }
  
  static void finishRequest(Request paramRequest)
  {
    synchronized (lock)
    {
      if (runningRequest == paramRequest) {
        runningRequest = null;
      }
      return;
    }
  }
  
  public static View getDecorView(Activity paramActivity)
  {
    return paramActivity.getWindow().getDecorView();
  }
  
  /* Error */
  private static HelperFragment getHelperFragment(Activity paramActivity)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 109	android/app/Activity:getFragmentManager	()Landroid/app/FragmentManager;
    //   4: ldc 11
    //   6: invokevirtual 115	android/app/FragmentManager:findFragmentByTag	(Ljava/lang/String;)Landroid/app/Fragment;
    //   9: checkcast 2	com/google/games/bridge/HelperFragment
    //   12: astore_2
    //   13: aload_2
    //   14: astore_1
    //   15: aload_2
    //   16: ifnonnull +89 -> 105
    //   19: ldc 27
    //   21: ldc 117
    //   23: invokestatic 123	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   26: pop
    //   27: new 2	com/google/games/bridge/HelperFragment
    //   30: astore_1
    //   31: aload_1
    //   32: invokespecial 124	com/google/games/bridge/HelperFragment:<init>	()V
    //   35: aload_0
    //   36: invokevirtual 109	android/app/Activity:getFragmentManager	()Landroid/app/FragmentManager;
    //   39: invokevirtual 128	android/app/FragmentManager:beginTransaction	()Landroid/app/FragmentTransaction;
    //   42: astore_0
    //   43: aload_0
    //   44: aload_1
    //   45: ldc 11
    //   47: invokevirtual 134	android/app/FragmentTransaction:add	(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
    //   50: pop
    //   51: aload_0
    //   52: invokevirtual 138	android/app/FragmentTransaction:commit	()I
    //   55: pop
    //   56: goto +49 -> 105
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual 144	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   64: invokestatic 149	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   67: astore_0
    //   68: aload_0
    //   69: invokevirtual 152	java/lang/String:length	()I
    //   72: ifeq +13 -> 85
    //   75: ldc -102
    //   77: aload_0
    //   78: invokevirtual 158	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   81: astore_0
    //   82: goto +13 -> 95
    //   85: new 146	java/lang/String
    //   88: dup
    //   89: ldc -102
    //   91: invokespecial 161	java/lang/String:<init>	(Ljava/lang/String;)V
    //   94: astore_0
    //   95: ldc 27
    //   97: aload_0
    //   98: aload_1
    //   99: invokestatic 165	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   102: pop
    //   103: aconst_null
    //   104: areturn
    //   105: aload_1
    //   106: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramActivity	Activity
    //   14	31	1	localHelperFragment1	HelperFragment
    //   59	47	1	localThrowable	Throwable
    //   12	4	2	localHelperFragment2	HelperFragment
    // Exception table:
    //   from	to	target	type
    //   19	56	59	finally
  }
  
  public static boolean isResolutionRequired(Exception paramException)
  {
    return (paramException instanceof ResolvableApiException);
  }
  
  private void processRequest()
  {
    synchronized (lock)
    {
      if (runningRequest != null) {
        return;
      }
      Request localRequest = pendingRequest;
      pendingRequest = null;
      runningRequest = localRequest;
      if (localRequest == null) {
        return;
      }
      localRequest.process(this);
      return;
    }
  }
  
  public static Task<Integer> showAchievementUi(Activity paramActivity)
  {
    AchievementUiRequest localAchievementUiRequest = new AchievementUiRequest();
    if (!startRequest(paramActivity, localAchievementUiRequest)) {
      localAchievementUiRequest.setResult(-12);
    }
    return localAchievementUiRequest.getTask();
  }
  
  public static Task<Integer> showAllLeaderboardsUi(Activity paramActivity)
  {
    AllLeaderboardsUiRequest localAllLeaderboardsUiRequest = new AllLeaderboardsUiRequest();
    if (!startRequest(paramActivity, localAllLeaderboardsUiRequest)) {
      localAllLeaderboardsUiRequest.setResult(-12);
    }
    return localAllLeaderboardsUiRequest.getTask();
  }
  
  public static Task<Integer> showCompareProfileWithAlternativeNameHintsUI(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new CompareProfileUiRequest(paramString1, paramString2, paramString3);
    if (!startRequest(paramActivity, paramString1)) {
      paramString1.setResult(-12);
    }
    return paramString1.getTask();
  }
  
  public static Task<Integer> showLeaderboardUi(Activity paramActivity, String paramString, int paramInt)
  {
    paramString = new LeaderboardUiRequest(paramString, paramInt);
    if (!startRequest(paramActivity, paramString)) {
      paramString.setResult(-12);
    }
    return paramString.getTask();
  }
  
  public static Task<SelectSnapshotUiRequest.Result> showSelectSnapshotUi(Activity paramActivity, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    paramString = new SelectSnapshotUiRequest(paramString, paramBoolean1, paramBoolean2, paramInt);
    if (!startRequest(paramActivity, paramString)) {
      paramString.setResult(-5);
    }
    return paramString.getTask();
  }
  
  private static boolean startRequest(Activity paramActivity, Request paramRequest)
  {
    synchronized (lock)
    {
      boolean bool;
      if ((pendingRequest == null) && (runningRequest == null))
      {
        pendingRequest = paramRequest;
        bool = true;
      }
      else
      {
        bool = false;
      }
      if (bool)
      {
        paramActivity = getHelperFragment(paramActivity);
        if (paramActivity.isResumed()) {
          paramActivity.processRequest();
        }
      }
      return bool;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    synchronized (lock)
    {
      Request localRequest = runningRequest;
      if (localRequest == null) {
        return;
      }
      localRequest.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
  }
  
  public void onResume()
  {
    Log.d("HelperFragment", "onResume called");
    super.onResume();
    if (helperFragment == null) {
      helperFragment = this;
    }
    processRequest();
  }
  
  static abstract interface Request
  {
    public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
    
    public abstract void process(HelperFragment paramHelperFragment);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\HelperFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */