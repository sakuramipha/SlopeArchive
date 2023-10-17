package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;

class CallbackWithHandler
{
  private final FontsContractCompat.FontRequestCallback mCallback;
  private final Handler mCallbackHandler;
  
  CallbackWithHandler(FontsContractCompat.FontRequestCallback paramFontRequestCallback)
  {
    this.mCallback = paramFontRequestCallback;
    this.mCallbackHandler = CalleeHandler.create();
  }
  
  CallbackWithHandler(FontsContractCompat.FontRequestCallback paramFontRequestCallback, Handler paramHandler)
  {
    this.mCallback = paramFontRequestCallback;
    this.mCallbackHandler = paramHandler;
  }
  
  private void onTypefaceRequestFailed(final int paramInt)
  {
    final FontsContractCompat.FontRequestCallback localFontRequestCallback = this.mCallback;
    this.mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        localFontRequestCallback.onTypefaceRequestFailed(paramInt);
      }
    });
  }
  
  private void onTypefaceRetrieved(final Typeface paramTypeface)
  {
    final FontsContractCompat.FontRequestCallback localFontRequestCallback = this.mCallback;
    this.mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        localFontRequestCallback.onTypefaceRetrieved(paramTypeface);
      }
    });
  }
  
  void onTypefaceResult(FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    if (paramTypefaceResult.isSuccess()) {
      onTypefaceRetrieved(paramTypefaceResult.mTypeface);
    } else {
      onTypefaceRequestFailed(paramTypefaceResult.mResult);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\CallbackWithHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */