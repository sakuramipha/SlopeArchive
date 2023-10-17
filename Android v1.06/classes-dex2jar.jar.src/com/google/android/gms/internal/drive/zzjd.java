package com.google.android.gms.internal.drive;

import java.util.NoSuchElementException;

final class zzjd
  extends zzjf
{
  private final int limit;
  private int position = 0;
  private final zzjc zznu;
  
  zzjd(zzjc paramzzjc)
  {
    this.limit = paramzzjc.size();
  }
  
  public final boolean hasNext()
  {
    return this.position < this.limit;
  }
  
  public final byte nextByte()
  {
    int i = this.position;
    if (i < this.limit)
    {
      this.position = (i + 1);
      return this.zznu.zzt(i);
    }
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */