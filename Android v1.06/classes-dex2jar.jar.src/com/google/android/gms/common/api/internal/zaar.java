package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

final class zaar
  extends zac
{
  private final WeakReference<zaaw> zaa;
  
  zaar(zaaw paramzaaw)
  {
    this.zaa = new WeakReference(paramzaaw);
  }
  
  public final void zab(zak paramzak)
  {
    zaaw localzaaw = (zaaw)this.zaa.get();
    if (localzaaw == null) {
      return;
    }
    zaaw.zak(localzaaw).zal(new zaaq(this, localzaaw, localzaaw, paramzak));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */