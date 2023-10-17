package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;

public final class ResolvableFuture<V>
  extends AbstractResolvableFuture<V>
{
  public static <V> ResolvableFuture<V> create()
  {
    return new ResolvableFuture();
  }
  
  public boolean set(V paramV)
  {
    return super.set(paramV);
  }
  
  public boolean setException(Throwable paramThrowable)
  {
    return super.setException(paramThrowable);
  }
  
  public boolean setFuture(ListenableFuture<? extends V> paramListenableFuture)
  {
    return super.setFuture(paramListenableFuture);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\concurrent\futures\ResolvableFuture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */