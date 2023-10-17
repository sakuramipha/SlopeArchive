package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfvn;

final class zzz
  implements zzfvn
{
  final zzaa zza;
  
  zzz(zzaa paramzzaa) {}
  
  public final void zza(Throwable paramThrowable)
  {
    zzt.zzo().zzu(paramThrowable, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
    zzaa localzzaa = this.zza;
    zzf.zzc(zzaa.zzp(localzzaa), zzaa.zzo(localzzaa), "sgf", new Pair[] { new Pair("sgf_reason", paramThrowable.getMessage()) });
    zzbzt.zzh("Failed to initialize webview for loading SDKCore. ", paramThrowable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */