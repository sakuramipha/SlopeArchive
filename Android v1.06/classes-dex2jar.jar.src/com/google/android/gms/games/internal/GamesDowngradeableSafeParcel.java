package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.GmsVersion;

public abstract class GamesDowngradeableSafeParcel
  extends DowngradeableSafeParcel
{
  protected static boolean zzo(Integer paramInteger)
  {
    if (paramInteger == null) {
      return false;
    }
    return GmsVersion.isAtLeastFenacho(paramInteger.intValue());
  }
  
  public final boolean prepareForClientVersion(int paramInt)
  {
    setShouldDowngrade(zzo(Integer.valueOf(paramInt)) ^ true);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\GamesDowngradeableSafeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */