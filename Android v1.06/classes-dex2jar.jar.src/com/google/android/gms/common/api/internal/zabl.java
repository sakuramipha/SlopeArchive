package com.google.android.gms.common.api.internal;

import android.os.Handler;

final class zabl
  implements BackgroundDetector.BackgroundStateChangeListener
{
  final GoogleApiManager zaa;
  
  zabl(GoogleApiManager paramGoogleApiManager) {}
  
  public final void onBackgroundStateChanged(boolean paramBoolean)
  {
    GoogleApiManager localGoogleApiManager = this.zaa;
    GoogleApiManager.zaf(localGoogleApiManager).sendMessage(GoogleApiManager.zaf(localGoogleApiManager).obtainMessage(1, Boolean.valueOf(paramBoolean)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */