package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

public class DataBufferResponse<T, R extends AbstractDataBuffer<T>,  extends Result>
  extends Response<R>
  implements DataBuffer<T>
{
  public DataBufferResponse() {}
  
  public DataBufferResponse(R paramR)
  {
    super(paramR);
  }
  
  public final void close()
  {
    ((AbstractDataBuffer)getResult()).close();
  }
  
  public final T get(int paramInt)
  {
    return (T)((AbstractDataBuffer)getResult()).get(paramInt);
  }
  
  public final int getCount()
  {
    return ((AbstractDataBuffer)getResult()).getCount();
  }
  
  public final Bundle getMetadata()
  {
    return ((AbstractDataBuffer)getResult()).getMetadata();
  }
  
  public final boolean isClosed()
  {
    return ((AbstractDataBuffer)getResult()).isClosed();
  }
  
  public final Iterator<T> iterator()
  {
    return ((AbstractDataBuffer)getResult()).iterator();
  }
  
  public final void release()
  {
    ((AbstractDataBuffer)getResult()).release();
  }
  
  public final Iterator<T> singleRefIterator()
  {
    return ((AbstractDataBuffer)getResult()).singleRefIterator();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\DataBufferResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */