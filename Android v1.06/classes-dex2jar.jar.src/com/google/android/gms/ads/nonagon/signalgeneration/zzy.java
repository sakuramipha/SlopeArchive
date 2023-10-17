package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfvn;

final class zzy
  implements zzfvn
{
  final zzaa zzc;
  
  zzy(zzaa paramzzaa, zzbsk paramzzbsk, boolean paramBoolean) {}
  
  public final void zza(Throwable paramThrowable)
  {
    try
    {
      zzbsk localzzbsk = this.zza;
      paramThrowable = paramThrowable.getMessage();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Internal error: ");
      localStringBuilder.append(paramThrowable);
      localzzbsk.zze(localStringBuilder.toString());
      return;
    }
    catch (RemoteException paramThrowable)
    {
      zzbzt.zzh("", paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */