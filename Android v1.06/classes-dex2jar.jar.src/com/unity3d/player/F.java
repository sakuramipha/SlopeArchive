package com.unity3d.player;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;

class F
{
  private Context a;
  private E b;
  
  public F(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void a()
  {
    if (this.b != null)
    {
      this.a.getContentResolver().unregisterContentObserver(this.b);
      this.b = null;
    }
  }
  
  public void a(D paramD, String paramString)
  {
    this.b = new E(this, new Handler(Looper.getMainLooper()), paramD);
    this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor(paramString), true, this.b);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\F.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */