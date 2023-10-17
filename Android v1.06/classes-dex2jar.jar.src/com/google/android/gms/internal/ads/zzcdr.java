package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

public final class zzcdr
  extends zzcdn
{
  public zzcdr(zzccc paramzzccc)
  {
    super(paramzzccc);
  }
  
  public final void zzf() {}
  
  public final boolean zzt(String paramString)
  {
    String str = zzbzm.zze(paramString);
    zzccc localzzccc = (zzccc)this.zzc.get();
    if ((localzzccc != null) && (str != null)) {
      localzzccc.zzt(str, this);
    }
    zzbzt.zzj("VideoStreamNoopCache is doing nothing.");
    zzg(paramString, str, "noop", "Noop cache is a noop.");
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */