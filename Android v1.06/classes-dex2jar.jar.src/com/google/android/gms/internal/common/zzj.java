package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

abstract class zzj<T>
  implements Iterator<T>
{
  @CheckForNull
  private T zza;
  private int zzb = 2;
  
  public final boolean hasNext()
  {
    int j = this.zzb;
    if (j != 4)
    {
      int i = j - 1;
      if (j != 0)
      {
        if (i != 0)
        {
          if (i != 2)
          {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3)
            {
              this.zzb = 1;
              return true;
            }
          }
          return false;
        }
        return true;
      }
      throw null;
    }
    throw new IllegalStateException();
  }
  
  public final T next()
  {
    if (hasNext())
    {
      this.zzb = 2;
      Object localObject = this.zza;
      this.zza = null;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  @CheckForNull
  protected abstract T zza();
  
  @CheckForNull
  protected final T zzb()
  {
    this.zzb = 3;
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */