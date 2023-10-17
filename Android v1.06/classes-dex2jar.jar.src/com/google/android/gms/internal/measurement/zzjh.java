package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzjh
  extends IOException
{
  zzjh()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  zzjh(String paramString, Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(paramString)), paramThrowable);
  }
  
  zzjh(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */