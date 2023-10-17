package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasi
  extends zzatf
{
  private final long zzi;
  
  public zzasi(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, long paramLong, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "jg02i/nmjOtojnLha7JcDbUziDuBiOjLYE3MteO5yoaAgj1btcenznNGCOsuwWch", "4CrOyliF592Vc7D7JV+aPXCWH2JLB6HWAiQnf8iH090=", paramzzano, paramInt1, 25);
    this.zzi = paramLong;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    long l2 = ((Long)this.zzf.invoke(null, new Object[0])).longValue();
    synchronized (this.zze)
    {
      this.zze.zzt(l2);
      long l1 = this.zzi;
      if (l1 != 0L)
      {
        this.zze.zzT(l2 - l1);
        this.zze.zzU(this.zzi);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */