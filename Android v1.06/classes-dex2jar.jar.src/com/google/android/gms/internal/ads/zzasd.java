package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasd
  extends zzatf
{
  public zzasd(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2)
  {
    super(paramzzarr, "ZkhLHPiP7Uf4DooNt/1kizZNADm1b+h8tAhXSPwcPrPbN3t+Jx06DZwzXlYEhSXE", "dE9eOZLY1eX3llTY4h0xyyrKD5UgCxwXxmUW3B3njYU=", paramzzano, paramInt1, 49);
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    this.zze.zzaa(3);
    try
    {
      Object localObject = this.zzf;
      int i = 1;
      boolean bool = ((Boolean)((Method)localObject).invoke(null, new Object[] { this.zzb.zzb() })).booleanValue();
      localObject = this.zze;
      if (true == bool) {
        i = 2;
      }
      ((zzano)localObject).zzaa(i);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      if ((localInvocationTargetException.getTargetException() instanceof Settings.SettingNotFoundException)) {
        return;
      }
      throw localInvocationTargetException;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */