package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasn
  extends zzatf
{
  private static volatile Long zzi;
  private static final Object zzj = new Object();
  
  public zzasn(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "9B7JBIdZiMTsL9pGnqEcYgUaYpTzUoAB9RvGyrnjQF7CiisbO4+nhiSdhoC6VSqn", "YfHvCp/fIECQ9h2Dc66KvN7YWoaMnV2BSJeyfKAdgmQ=", paramzzano, paramInt1, 22);
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    if (zzi == null) {
      synchronized (zzj)
      {
        if (zzi == null) {
          zzi = (Long)this.zzf.invoke(null, new Object[0]);
        }
      }
    }
    synchronized (this.zze)
    {
      this.zze.zzy(zzi.longValue());
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */