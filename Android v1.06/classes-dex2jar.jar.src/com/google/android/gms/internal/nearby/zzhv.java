package com.google.android.gms.internal.nearby;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzhv
  extends ContentObserver
{
  zzhv(Handler paramHandler)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    zzhw.zzb().set(true);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */