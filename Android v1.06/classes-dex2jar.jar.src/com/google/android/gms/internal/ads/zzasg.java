package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasg
  extends zzatf
{
  public zzasg(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "rrjLlsla978gQsd21zlsNlBlI2LX695vD5/bR0YoarWUKt9pBHEKqU2V70kXmeqs", "pQ8JnVS7yUZANCXtBVm35/Ifx7Qa6SIA2WAFLNMh0sw=", paramzzano, paramInt1, 5);
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    this.zze.zzm(-1L);
    this.zze.zzl(-1L);
    int[] arrayOfInt = (int[])this.zzf.invoke(null, new Object[] { this.zzb.zzb() });
    synchronized (this.zze)
    {
      this.zze.zzm(arrayOfInt[0]);
      this.zze.zzl(arrayOfInt[1]);
      int i = arrayOfInt[2];
      if (i != Integer.MIN_VALUE) {
        this.zze.zzk(i);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */