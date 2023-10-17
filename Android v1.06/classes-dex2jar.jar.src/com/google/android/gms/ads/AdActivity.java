package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbzt;

public final class AdActivity
  extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  private zzbrv zza;
  
  private final void zza()
  {
    zzbrv localzzbrv = this.zza;
    if (localzzbrv != null) {
      try
      {
        localzzbrv.zzw();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzg(paramInt1, paramInt2, paramIntent);
      }
    }
    catch (Exception localException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localException);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onBackPressed()
  {
    try
    {
      zzbrv localzzbrv1 = this.zza;
      if (localzzbrv1 != null)
      {
        boolean bool = localzzbrv1.zzF();
        if (!bool) {
          break label49;
        }
      }
    }
    catch (RemoteException localRemoteException1)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException1);
    }
    super.onBackPressed();
    try
    {
      zzbrv localzzbrv2 = this.zza;
      if (localzzbrv2 != null) {
        localzzbrv2.zzh();
      }
      label49:
      return;
    }
    catch (RemoteException localRemoteException2)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException2);
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzj(ObjectWrapper.wrap(paramConfiguration));
      }
      return;
    }
    catch (RemoteException paramConfiguration)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramConfiguration);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    zzbrv localzzbrv = zzay.zza().zzo(this);
    this.zza = localzzbrv;
    if (localzzbrv != null) {
      try
      {
        localzzbrv.zzk(paramBundle);
        return;
      }
      catch (RemoteException paramBundle)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramBundle);
        finish();
        return;
      }
    }
    zzbzt.zzl("#007 Could not call remote method.", null);
    finish();
  }
  
  protected final void onDestroy()
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzl();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
    super.onDestroy();
  }
  
  protected final void onPause()
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzn();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onPause();
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzo(paramInt, paramArrayOfString, paramArrayOfInt);
      }
      return;
    }
    catch (RemoteException paramArrayOfString)
    {
      zzbzt.zzl("#007 Could not call remote method.", paramArrayOfString);
    }
  }
  
  protected final void onRestart()
  {
    super.onRestart();
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzp();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected final void onResume()
  {
    super.onResume();
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzq();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzr(paramBundle);
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  protected final void onStart()
  {
    super.onStart();
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzs();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
  }
  
  protected final void onStop()
  {
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzt();
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
      finish();
    }
    super.onStop();
  }
  
  protected final void onUserLeaveHint()
  {
    super.onUserLeaveHint();
    try
    {
      zzbrv localzzbrv = this.zza;
      if (localzzbrv != null) {
        localzzbrv.zzu();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzbzt.zzl("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    zza();
  }
  
  public final void setContentView(View paramView)
  {
    super.setContentView(paramView);
    zza();
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */