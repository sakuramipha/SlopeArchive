package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

public final class zzl
  extends zzk
{
  public static boolean zza(@CheckForNull Object paramObject1, @CheckForNull Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */