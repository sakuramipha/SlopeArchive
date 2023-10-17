package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

final class zabh
  extends zaq
{
  final zabi zaa;
  
  zabh(zabi paramzabi, Looper paramLooper)
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
        Log.w("GACStateManager", paramMessage.toString());
        return;
      }
      throw ((RuntimeException)paramMessage.obj);
    }
    ((zabg)paramMessage.obj).zab(this.zaa);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */