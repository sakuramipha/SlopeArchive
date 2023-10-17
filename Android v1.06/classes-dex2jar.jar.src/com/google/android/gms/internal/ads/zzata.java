package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzata
  extends zzatf
{
  private static volatile Long zzi;
  private static final Object zzj = new Object();
  
  public zzata(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "atxCXkhFC9Qo4zr+qQKStmlw+xq4VCpNksBYKhnncQoFPxOQrQVA0Q5Y3uEyrMy9", "7UZ/EsEPgF4ZRZ1chhiVPxgR+NfE5rqmZss2fiG1QT0=", paramzzano, paramInt1, 33);
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
      this.zze.zzV(zzi.longValue());
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */