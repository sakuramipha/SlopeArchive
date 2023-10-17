package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class zabd
  extends zabw
{
  private final WeakReference<zabe> zaa;
  
  zabd(zabe paramzabe)
  {
    this.zaa = new WeakReference(paramzabe);
  }
  
  public final void zaa()
  {
    zabe localzabe = (zabe)this.zaa.get();
    if (localzabe == null) {
      return;
    }
    zabe.zai(localzabe);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */