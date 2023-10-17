package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

final class zabc
  extends zaq
{
  final zabe zaa;
  
  zabc(zabe paramzabe, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i != 1)
    {
      if (i != 2)
      {
        i = paramMessage.what;
        paramMessage = new StringBuilder(31);
        paramMessage.append("Unknown message id: ");
        paramMessage.append(i);
        Log.w("GoogleApiClientImpl", paramMessage.toString());
        return;
      }
      zabe.zai(this.zaa);
      return;
    }
    zabe.zaj(this.zaa);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */