package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzash
  extends zzatf
{
  private static volatile Long zzi;
  private static final Object zzj = new Object();
  
  public zzash(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "qp6rBGTCbwl3Du6FT/SAKGuw1FuFEkW7uLvnpWgAVmj4gvXya3866ptnORhDDu8C", "eQRTNlDku3oQgUviNcuPPX0vJqvEjzyxzBtk+QMugeI=", paramzzano, paramInt1, 44);
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
      this.zze.zzo(zzi.longValue());
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */