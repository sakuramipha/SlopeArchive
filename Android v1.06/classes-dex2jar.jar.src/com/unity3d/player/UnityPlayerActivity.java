package com.unity3d.player;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class UnityPlayerActivity
  extends Activity
  implements IUnityPlayerLifecycleEvents
{
  protected UnityPlayer mUnityPlayer;
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 2) {
      return this.mUnityPlayer.injectEvent(paramKeyEvent);
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mUnityPlayer.configurationChanged(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    paramBundle = updateUnityCommandLineArguments(getIntent().getStringExtra("unity"));
    getIntent().putExtra("unity", paramBundle);
    paramBundle = new UnityPlayer(this, this);
    this.mUnityPlayer = paramBundle;
    setContentView(paramBundle);
    this.mUnityPlayer.requestFocus();
  }
  
  protected void onDestroy()
  {
    this.mUnityPlayer.destroy();
    super.onDestroy();
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return this.mUnityPlayer.onGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.mUnityPlayer.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return this.mUnityPlayer.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.mUnityPlayer.lowMemory();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    setIntent(paramIntent);
    this.mUnityPlayer.newIntent(paramIntent);
  }
  
  protected void onPause()
  {
    super.onPause();
    MultiWindowSupport.saveMultiWindowMode(this);
    if (MultiWindowSupport.getAllowResizableWindow(this)) {
      return;
    }
    this.mUnityPlayer.pause();
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((MultiWindowSupport.getAllowResizableWindow(this)) && (!MultiWindowSupport.isMultiWindowModeChangedToTrue(this))) {
      return;
    }
    this.mUnityPlayer.resume();
  }
  
  protected void onStart()
  {
    super.onStart();
    if (!MultiWindowSupport.getAllowResizableWindow(this)) {
      return;
    }
    this.mUnityPlayer.resume();
  }
  
  protected void onStop()
  {
    super.onStop();
    if (!MultiWindowSupport.getAllowResizableWindow(this)) {
      return;
    }
    this.mUnityPlayer.pause();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.mUnityPlayer.onTouchEvent(paramMotionEvent);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    if (paramInt == 15) {
      this.mUnityPlayer.lowMemory();
    }
  }
  
  public void onUnityPlayerQuitted() {}
  
  public void onUnityPlayerUnloaded()
  {
    moveTaskToBack(true);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    this.mUnityPlayer.windowFocusChanged(paramBoolean);
  }
  
  protected String updateUnityCommandLineArguments(String paramString)
  {
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\UnityPlayerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */