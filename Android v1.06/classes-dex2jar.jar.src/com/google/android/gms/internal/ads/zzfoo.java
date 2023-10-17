package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

public final class zzfoo
{
  static final CharSequence zza(@CheckForNull Object paramObject)
  {
    paramObject.getClass();
    if ((paramObject instanceof CharSequence)) {
      paramObject = (CharSequence)paramObject;
    } else {
      paramObject = paramObject.toString();
    }
    return (CharSequence)paramObject;
  }
  
  public static final StringBuilder zzb(StringBuilder paramStringBuilder, Iterable paramIterable, String paramString)
  {
    paramIterable = paramIterable.iterator();
    try
    {
      if (paramIterable.hasNext())
      {
        paramStringBuilder.append(zza(paramIterable.next()));
        while (paramIterable.hasNext())
        {
          paramStringBuilder.append(paramString);
          paramStringBuilder.append(zza(paramIterable.next()));
        }
      }
      return paramStringBuilder;
    }
    catch (IOException paramStringBuilder)
    {
      throw new AssertionError(paramStringBuilder);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfoo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */