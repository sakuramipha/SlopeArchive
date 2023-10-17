package com.google.android.gms.nearby.messages;

public abstract interface BleSignal
{
  public static final int UNKNOWN_TX_POWER = Integer.MIN_VALUE;
  
  public abstract int getRssi();
  
  public abstract int getTxPower();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\BleSignal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */