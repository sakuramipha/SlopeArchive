package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasu
  extends zzatf
{
  public zzasu(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "Y4VPax9NN/dKmqF+s9P1EMA+IqhcGIPpcbgTKYuHNMmPmp8MhTxur5CR0eiVwBHP", "Egu28ffoQSw9KOwYfG/AJmF7jqmf54ISsd5MNAePHGo=", paramzzano, paramInt1, 73);
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    try
    {
      Object localObject = this.zzf;
      int i = 1;
      boolean bool = ((Boolean)((Method)localObject).invoke(null, new Object[] { this.zzb.zzb() })).booleanValue();
      localObject = this.zze;
      if (true == bool) {
        i = 2;
      }
      ((zzano)localObject).zzaf(i);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      this.zze.zzaf(3);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */