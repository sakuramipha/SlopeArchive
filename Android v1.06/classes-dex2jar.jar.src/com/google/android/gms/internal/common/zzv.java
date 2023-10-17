package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzv
  implements Iterable<String>
{
  final zzx zzb;
  
  zzv(zzx paramzzx, CharSequence paramCharSequence) {}
  
  public final Iterator<String> iterator()
  {
    return zzx.zze(this.zzb, this.zza);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    Iterator localIterator = iterator();
    try
    {
      if (localIterator.hasNext())
      {
        localStringBuilder.append(zzq.zza(localIterator.next(), ", "));
        while (localIterator.hasNext())
        {
          localStringBuilder.append(", ");
          localStringBuilder.append(zzq.zza(localIterator.next(), ", "));
        }
      }
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */