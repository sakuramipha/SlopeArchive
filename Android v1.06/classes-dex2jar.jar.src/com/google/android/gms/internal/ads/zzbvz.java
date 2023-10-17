package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzbvz
  implements RewardItem
{
  private final zzbvm zza;
  
  public zzbvz(zzbvm paramzzbvm)
  {
    this.zza = paramzzbvm;
  }
  
  public final int getAmount()
  {
    zzbvm localzzbvm = this.zza;
    if (localzzbvm != null) {
      try
      {
        int i = localzzbvm.zze();
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzk("Could not forward getAmount to RewardItem", localRemoteException);
      }
    }
    return 0;
  }
  
  public final String getType()
  {
    Object localObject = this.zza;
    if (localObject != null) {
      try
      {
        localObject = ((zzbvm)localObject).zzf();
        return (String)localObject;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzk("Could not forward getType to RewardItem", localRemoteException);
      }
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */