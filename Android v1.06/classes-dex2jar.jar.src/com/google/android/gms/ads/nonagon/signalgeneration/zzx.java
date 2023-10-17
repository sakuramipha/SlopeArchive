package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfvn;

final class zzx
  implements zzfvn
{
  final zzaa zzc;
  
  zzx(zzaa paramzzaa, zzbsk paramzzbsk, boolean paramBoolean) {}
  
  public final void zza(Throwable paramThrowable)
  {
    try
    {
      zzbsk localzzbsk = this.zza;
      String str = paramThrowable.getMessage();
      paramThrowable = new java/lang/StringBuilder;
      paramThrowable.<init>();
      paramThrowable.append("Internal error: ");
      paramThrowable.append(str);
      localzzbsk.zze(paramThrowable.toString());
      return;
    }
    catch (RemoteException paramThrowable)
    {
      zzbzt.zzh("", paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */