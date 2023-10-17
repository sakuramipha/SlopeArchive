package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzv
  extends zzw
{
  private final Callable<String> zzd;
  
  final String zza()
  {
    try
    {
      String str = (String)this.zzd.call();
      return str;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */