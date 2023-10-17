package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabx
  extends BroadcastReceiver
{
  Context zaa;
  private final zabw zab;
  
  public zabx(zabw paramzabw)
  {
    this.zab = paramzabw;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getData();
    if (paramContext != null) {
      paramContext = paramContext.getSchemeSpecificPart();
    } else {
      paramContext = null;
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      this.zab.zaa();
      zab();
    }
  }
  
  public final void zaa(Context paramContext)
  {
    this.zaa = paramContext;
  }
  
  public final void zab()
  {
    try
    {
      Context localContext = this.zaa;
      if (localContext != null) {
        localContext.unregisterReceiver(this);
      }
      this.zaa = null;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */