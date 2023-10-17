package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzgoa
  extends IOException
{
  zzgoa()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  zzgoa(String paramString, Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(paramString)), paramThrowable);
  }
  
  zzgoa(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */