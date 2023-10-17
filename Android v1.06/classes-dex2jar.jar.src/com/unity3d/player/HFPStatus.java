package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

public class HFPStatus
{
  private Context a;
  private BroadcastReceiver b = null;
  private boolean c = false;
  private AudioManager d = null;
  private boolean e = false;
  private a f = a.a;
  
  public HFPStatus(Context paramContext)
  {
    this.a = paramContext;
    this.d = ((AudioManager)paramContext.getSystemService("audio"));
    initHFPStatusJni();
  }
  
  private final native void deinitHFPStatusJni();
  
  private final native void initHFPStatusJni();
  
  public void a()
  {
    clearHFPStat();
    deinitHFPStatusJni();
  }
  
  protected void clearHFPStat()
  {
    BroadcastReceiver localBroadcastReceiver = this.b;
    if (localBroadcastReceiver != null)
    {
      this.a.unregisterReceiver(localBroadcastReceiver);
      this.b = null;
    }
    this.f = a.a;
    if (this.e)
    {
      this.e = false;
      this.d.stopBluetoothSco();
    }
  }
  
  protected boolean getHFPStat()
  {
    boolean bool;
    if (this.f == a.b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void requestHFPStat()
  {
    clearHFPStat();
    BroadcastReceiver local1 = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1)
        {
          paramAnonymousContext = HFPStatus.this;
          HFPStatus.-$$Nest$fputf(paramAnonymousContext, HFPStatus.a.b);
          if (HFPStatus.-$$Nest$fgete(paramAnonymousContext))
          {
            HFPStatus.-$$Nest$fpute(paramAnonymousContext, false);
            HFPStatus.-$$Nest$fgetd(paramAnonymousContext).stopBluetoothSco();
          }
          paramAnonymousContext = HFPStatus.this;
          if (HFPStatus.-$$Nest$fgetc(paramAnonymousContext)) {
            HFPStatus.-$$Nest$fgetd(paramAnonymousContext).setMode(3);
          }
        }
      }
    };
    this.b = local1;
    this.a.registerReceiver(local1, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
    try
    {
      this.e = true;
      this.d.startBluetoothSco();
    }
    catch (NullPointerException localNullPointerException)
    {
      u.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
    }
  }
  
  protected void setHFPRecordingStat(boolean paramBoolean)
  {
    this.c = paramBoolean;
    if (!paramBoolean) {
      this.d.setMode(0);
    }
  }
  
  static enum a {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\HFPStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */