package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

final class zao
  implements Runnable
{
  final zap zaa;
  private final zam zab;
  
  zao(zap paramzap, zam paramzam)
  {
    this.zab = paramzam;
  }
  
  public final void run()
  {
    if (!this.zaa.zaa) {
      return;
    }
    Object localObject = this.zab.zab();
    if (((ConnectionResult)localObject).hasResolution())
    {
      this.zaa.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zaa.getActivity(), (PendingIntent)Preconditions.checkNotNull(((ConnectionResult)localObject).getResolution()), this.zab.zaa(), false), 1);
      return;
    }
    zap localzap = this.zaa;
    if (localzap.zac.getErrorResolutionIntent(localzap.getActivity(), ((ConnectionResult)localObject).getErrorCode(), null) != null)
    {
      localzap = this.zaa;
      localzap.zac.zag(localzap.getActivity(), this.zaa.mLifecycleFragment, ((ConnectionResult)localObject).getErrorCode(), 2, this.zaa);
      return;
    }
    if (((ConnectionResult)localObject).getErrorCode() == 18)
    {
      localObject = this.zaa;
      localObject = ((zap)localObject).zac.zab(((zap)localObject).getActivity(), this.zaa);
      localzap = this.zaa;
      localzap.zac.zac(localzap.getActivity().getApplicationContext(), new zan(this, (Dialog)localObject));
      return;
    }
    zap.zaf(this.zaa, (ConnectionResult)localObject, this.zab.zaa());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */