package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;

final class zzbrf
  extends zzbft
{
  final zzbri zza;
  
  public final void zze(zzbfk paramzzbfk, String paramString)
  {
    zzbri localzzbri = this.zza;
    if (zzbri.zzc(localzzbri) == null) {
      return;
    }
    zzbri.zzc(localzzbri).onCustomClick(zzbri.zze(localzzbri, paramzzbfk), paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */