package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

final class zzgl
{
  private static boolean zzb(Throwable paramThrowable)
  {
    return ((paramThrowable instanceof ErrnoException)) && (((ErrnoException)paramThrowable).errno == OsConstants.EACCES);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */