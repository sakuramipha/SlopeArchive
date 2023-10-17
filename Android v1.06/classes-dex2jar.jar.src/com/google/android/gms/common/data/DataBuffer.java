package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

public abstract interface DataBuffer<T>
  extends Iterable<T>, Releasable, Closeable
{
  public abstract void close();
  
  public abstract T get(int paramInt);
  
  public abstract int getCount();
  
  public abstract Bundle getMetadata();
  
  @Deprecated
  public abstract boolean isClosed();
  
  public abstract Iterator<T> iterator();
  
  public abstract void release();
  
  public abstract Iterator<T> singleRefIterator();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\DataBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */