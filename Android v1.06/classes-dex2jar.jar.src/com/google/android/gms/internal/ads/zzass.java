package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzass
  extends zzatf
{
  private static volatile String zzi;
  private static final Object zzj = new Object();
  
  public zzass(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "pOQv/ncF1LaNtzYOMl87UsR5TvsuG5ecw6dyIcJCym+lewlOBw6IZhtgwF1qNMNH", "0G0hVgzYtuXNuzEKOxAON/a0c4+sHPmbkckIOa2TK0w=", paramzzano, paramInt1, 1);
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    this.zze.zzB("E");
    if (zzi == null) {
      synchronized (zzj)
      {
        if (zzi == null) {
          zzi = (String)this.zzf.invoke(null, new Object[0]);
        }
      }
    }
    synchronized (this.zze)
    {
      this.zze.zzB(zzi);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */