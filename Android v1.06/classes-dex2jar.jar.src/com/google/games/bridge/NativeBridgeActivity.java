package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public final class NativeBridgeActivity
  extends Activity
{
  private static final int BG_COLOR = 1090519039;
  private static final String BRIDGED_INTENT = "BRIDGED_INTENT";
  private static final int GPG_RESPONSE_CODE = 4673607;
  private static final String TAG = "NativeBridgeActivity";
  private boolean pendingResult;
  
  static
  {
    System.loadLibrary("gpg");
  }
  
  private native void forwardActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
  
  public static void launchBridgeIntent(Activity paramActivity, Intent paramIntent)
  {
    String str = String.valueOf(paramActivity);
    Object localObject = String.valueOf(paramIntent);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(localObject).length());
    localStringBuilder.append("Launching bridge activity: parent:");
    localStringBuilder.append(str);
    localStringBuilder.append(" intent ");
    localStringBuilder.append((String)localObject);
    Log.d("NativeBridgeActivity", localStringBuilder.toString());
    localObject = new Intent(paramActivity, NativeBridgeActivity.class);
    ((Intent)localObject).putExtra("BRIDGED_INTENT", paramIntent);
    paramActivity.startActivity((Intent)localObject);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 4673607)
    {
      Log.d("NativeBridgeActivity", "Forwarding activity result to native SDK.");
      forwardActivityResult(paramInt1, paramInt2, paramIntent);
      this.pendingResult = false;
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder(71);
      localStringBuilder.append("onActivityResult for unknown request code: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" calling finish()");
      Log.d("NativeBridgeActivity", localStringBuilder.toString());
    }
    finish();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    View localView = new View(this);
    localView.setBackgroundColor(1090519039);
    setContentView(localView);
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    if (this.pendingResult)
    {
      Log.w("NativeBridgeActivity", "onDestroy called with pendingResult == true.  forwarding canceled result");
      forwardActivityResult(4673607, 0, null);
      this.pendingResult = false;
    }
    super.onDestroy();
  }
  
  protected void onStart()
  {
    Intent localIntent = (Intent)getIntent().getParcelableExtra("BRIDGED_INTENT");
    if (localIntent != null) {
      startActivityForResult(localIntent, 4673607);
    }
    super.onStart();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    boolean bool;
    if (paramInt == 4673607) {
      bool = true;
    } else {
      bool = false;
    }
    this.pendingResult = bool;
    String str;
    StringBuilder localStringBuilder;
    if (bool)
    {
      str = String.valueOf(paramIntent);
      localStringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
      localStringBuilder.append("starting GPG activity: ");
      localStringBuilder.append(str);
      Log.d("NativeBridgeActivity", localStringBuilder.toString());
    }
    else
    {
      str = String.valueOf(paramIntent);
      localStringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
      localStringBuilder.append("starting non-GPG activity: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" ");
      localStringBuilder.append(str);
      Log.i("NativeBridgeActivity", localStringBuilder.toString());
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\NativeBridgeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */