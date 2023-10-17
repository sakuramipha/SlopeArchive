package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzasz
  extends zzatf
{
  private final zzary zzi;
  private long zzj;
  
  public zzasz(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, zzary paramzzary)
  {
    super(paramzzarr, "q+aDudU1oKRGiIp85Yex9xQTLhLt7Zb/ajE2OuEM3cyk16vcxQY/UGOPmqieA16k", "wkdkWHeqh0k+zNwmTrd5/YaupE9zOer3F4zT7d5lKl4=", paramzzano, paramInt1, 53);
    this.zzi = paramzzary;
    if (paramzzary != null) {
      this.zzj = paramzzary.zza();
    }
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    if (this.zzi != null) {
      this.zze.zzP(((Long)this.zzf.invoke(null, new Object[] { Long.valueOf(this.zzj) })).longValue());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */