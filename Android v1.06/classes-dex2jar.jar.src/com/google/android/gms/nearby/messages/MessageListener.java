package com.google.android.gms.nearby.messages;

public abstract class MessageListener
{
  public void onBleSignalChanged(Message paramMessage, BleSignal paramBleSignal) {}
  
  public void onDistanceChanged(Message paramMessage, Distance paramDistance) {}
  
  public void onFound(Message paramMessage) {}
  
  public void onLost(Message paramMessage) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\MessageListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */