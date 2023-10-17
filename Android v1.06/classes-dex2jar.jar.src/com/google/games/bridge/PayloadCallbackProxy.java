package com.google.games.bridge;

import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

public class PayloadCallbackProxy
  extends PayloadCallback
{
  private Callback callback;
  
  public PayloadCallbackProxy(Callback paramCallback)
  {
    this.callback = paramCallback;
  }
  
  public void onPayloadReceived(String paramString, Payload paramPayload)
  {
    this.callback.onPayloadReceived(paramString, paramPayload);
  }
  
  public void onPayloadTransferUpdate(String paramString, PayloadTransferUpdate paramPayloadTransferUpdate) {}
  
  public static abstract interface Callback
  {
    public abstract void onPayloadReceived(String paramString, Payload paramPayload);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\games\bridge\PayloadCallbackProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */