package androidx.browser.trusted;

import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

class FutureUtils
{
  static <T> ListenableFuture<T> immediateFailedFuture(Throwable paramThrowable)
  {
    ResolvableFuture localResolvableFuture = ResolvableFuture.create();
    localResolvableFuture.setException(paramThrowable);
    return localResolvableFuture;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\FutureUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */