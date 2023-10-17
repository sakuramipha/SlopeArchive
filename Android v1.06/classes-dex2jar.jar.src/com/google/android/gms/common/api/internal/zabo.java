package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;

final class zabo
  implements Runnable
{
  final zabp zaa;
  
  zabo(zabp paramzabp) {}
  
  public final void run()
  {
    zabq localzabq = this.zaa.zaa;
    zabq.zae(localzabq).disconnect(String.valueOf(zabq.zae(localzabq).getClass().getName()).concat(" disconnecting because it was signed out."));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */