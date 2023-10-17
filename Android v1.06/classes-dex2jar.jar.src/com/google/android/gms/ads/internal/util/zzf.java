package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzflv;

public final class zzf
  extends zzflv
{
  public zzf(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      super.handleMessage(paramMessage);
      return;
    }
    catch (Exception paramMessage)
    {
      zzt.zzo().zzu(paramMessage, "AdMobHandler.handleMessage");
    }
  }
  
  protected final void zza(Message paramMessage)
  {
    try
    {
      super.zza(paramMessage);
      return;
    }
    finally
    {
      zzt.zzp();
      zzs.zzI(zzt.zzo().zzc(), paramMessage);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */