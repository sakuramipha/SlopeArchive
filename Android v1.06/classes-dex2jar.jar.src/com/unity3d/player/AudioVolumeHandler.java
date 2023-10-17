package com.unity3d.player;

import android.content.Context;

public class AudioVolumeHandler
  implements k
{
  private l a;
  
  AudioVolumeHandler(Context paramContext)
  {
    paramContext = new l(paramContext);
    this.a = paramContext;
    paramContext.a(3, this);
  }
  
  public void a()
  {
    this.a.a();
    this.a = null;
  }
  
  public final native void onAudioVolumeChanged(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\AudioVolumeHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */