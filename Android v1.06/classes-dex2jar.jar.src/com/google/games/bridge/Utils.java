package com.google.games.bridge;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;

public final class Utils
{
  private static final String TAG = "Utils";
  
  public static void startActivityForResult(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    try
    {
      paramFragment.startActivityForResult(paramIntent, paramInt);
    }
    catch (ActivityNotFoundException paramFragment)
    {
      Log.e("Utils", "Activity not found. Please install Play Games App.");
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */