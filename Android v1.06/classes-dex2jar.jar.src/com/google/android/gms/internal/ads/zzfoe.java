package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

abstract class zzfoe
  implements Iterator
{
  @CheckForNull
  private Object zza;
  private int zzb = 2;
  
  public final boolean hasNext()
  {
    boolean bool;
    if (this.zzb != 4) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzh(bool);
    int i = this.zzb;
    int j = i - 1;
    if (i != 0)
    {
      if (j != 0)
      {
        if (j != 2)
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
  
  public final Object next()
  {
    if (hasNext())
    {
      this.zzb = 2;
      Object localObject = this.zza;
      this.zza = null;
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  @CheckForNull
  protected abstract Object zza();
  
  @CheckForNull
  protected final Object zzb()
  {
    this.zzb = 3;
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */