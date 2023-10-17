package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

public class SingleRefDataBufferIterator<T>
  extends DataBufferIterator<T>
{
  private T zac;
  
  public SingleRefDataBufferIterator(DataBuffer<T> paramDataBuffer)
  {
    super(paramDataBuffer);
  }
  
  public final T next()
  {
    if (hasNext())
    {
      i = this.zab + 1;
      this.zab = i;
      if (i == 0)
      {
        localObject = Preconditions.checkNotNull(this.zaa.get(0));
        this.zac = localObject;
        if (!(localObject instanceof DataBufferRef))
        {
          localObject = String.valueOf(localObject.getClass());
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 44);
          localStringBuilder.append("DataBuffer reference of type ");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(" is not movable");
          throw new IllegalStateException(localStringBuilder.toString());
        }
      }
      else
      {
        ((DataBufferRef)Preconditions.checkNotNull(this.zac)).zaa(this.zab);
      }
      return (T)this.zac;
    }
    int i = this.zab;
    Object localObject = new StringBuilder(46);
    ((StringBuilder)localObject).append("Cannot advance the iterator beyond ");
    ((StringBuilder)localObject).append(i);
    throw new NoSuchElementException(((StringBuilder)localObject).toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\SingleRefDataBufferIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */