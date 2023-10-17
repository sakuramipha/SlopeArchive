package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfwb;

final class zzw
  implements zzfvn
{
  final zzaa zzf;
  
  zzw(zzaa paramzzaa, zzfwb paramzzfwb, zzbyo paramzzbyo, zzbyh paramzzbyh, zzfff paramzzfff, long paramLong) {}
  
  public final void zza(Throwable paramThrowable)
  {
    long l1 = zzt.zzB().currentTimeMillis();
    long l2 = this.zze;
    String str = paramThrowable.getMessage();
    zzt.zzo().zzu(paramThrowable, "SignalGeneratorImpl.generateSignals");
    Object localObject = this.zzf;
    zzf.zzc(zzaa.zzp((zzaa)localObject), zzaa.zzo((zzaa)localObject), "sgf", new Pair[] { new Pair("sgf_reason", str), new Pair("tqgt", String.valueOf(l1 - l2)) });
    zzffq localzzffq = zzaa.zzr(this.zza, this.zzb);
    if ((((Boolean)zzbcw.zze.zze()).booleanValue()) && (localzzffq != null))
    {
      localObject = this.zzd;
      ((zzfff)localObject).zzg(paramThrowable);
      ((zzfff)localObject).zzf(false);
      localzzffq.zza((zzfff)localObject);
      localzzffq.zzg();
    }
    try
    {
      paramThrowable = this.zzc;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Internal error. ");
      ((StringBuilder)localObject).append(str);
      paramThrowable.zzb(((StringBuilder)localObject).toString());
      return;
    }
    catch (RemoteException paramThrowable)
    {
      zzbzt.zzh("", paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */