package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbkk;
import java.util.ArrayList;
import java.util.List;

final class zzei
  extends zzbkk
{
  final zzej zza;
  
  public final void zzb(List paramList)
    throws RemoteException
  {
    synchronized (zzej.zzg(this.zza))
    {
      Object localObject2 = this.zza;
      int i = 0;
      zzej.zzk((zzej)localObject2, false);
      zzej.zzj(this.zza, true);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(zzej.zzi(this.zza));
      zzej.zzi(this.zza).clear();
      paramList = zzej.zzd(paramList);
      int j = ((List)localObject2).size();
      while (i < j)
      {
        ((OnInitializationCompleteListener)((List)localObject2).get(i)).onInitializationComplete(paramList);
        i++;
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */