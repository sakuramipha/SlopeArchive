package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.query.Filter;

public final class zzk
  implements zzj<Boolean>
{
  private Boolean zzmm = Boolean.valueOf(false);
  
  public static boolean zza(Filter paramFilter)
  {
    if (paramFilter == null) {
      return false;
    }
    return ((Boolean)paramFilter.zza(new zzk())).booleanValue();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */