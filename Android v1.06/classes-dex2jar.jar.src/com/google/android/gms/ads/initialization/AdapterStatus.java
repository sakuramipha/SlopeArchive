package com.google.android.gms.ads.initialization;

public abstract interface AdapterStatus
{
  public abstract String getDescription();
  
  public abstract State getInitializationState();
  
  public abstract int getLatency();
  
  public static enum State
  {
    private static final State[] zza;
    
    static
    {
      State localState2 = new State("NOT_READY", 0);
      NOT_READY = localState2;
      State localState1 = new State("READY", 1);
      READY = localState1;
      zza = new State[] { localState2, localState1 };
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\initialization\AdapterStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */