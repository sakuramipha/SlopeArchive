package com.unity3d.player;

public abstract interface IPermissionRequestCallbacks
{
  public abstract void onPermissionDenied(String paramString);
  
  public abstract void onPermissionDeniedAndDontAskAgain(String paramString);
  
  public abstract void onPermissionGranted(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\IPermissionRequestCallbacks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */