package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> zaa;
  protected int zab;
  
  public DataBufferIterator(DataBuffer<T> paramDataBuffer)
  {
    this.zaa = ((DataBuffer)Preconditions.checkNotNull(paramDataBuffer));
    this.zab = -1;
  }
  
  public final boolean hasNext()
  {
    return this.zab < this.zaa.getCount() - 1;
  }
  
  public T next()
  {
    if (hasNext())
    {
      localObject = this.zaa;
      i = this.zab + 1;
      this.zab = i;
      return (T)((DataBuffer)localObject).get(i);
    }
    int i = this.zab;
    Object localObject = new StringBuilder(46);
    ((StringBuilder)localObject).append("Cannot advance the iterator beyond ");
    ((StringBuilder)localObject).append(i);
    throw new NoSuchElementException(((StringBuilder)localObject).toString());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\DataBufferIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */