package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnv;

public final class OutOfContextTestingActivity
  extends Activity
{
  public static final String AD_UNIT_KEY = "adUnit";
  public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = zzay.zza().zzf(this, new zzbnv());
    if (paramBundle == null)
    {
      finish();
      return;
    }
    setContentView(R.layout.admob_empty_layout);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(R.id.layout);
    Object localObject = getIntent();
    if (localObject == null)
    {
      finish();
      return;
    }
    localObject = ((Intent)localObject).getStringExtra("adUnit");
    if (localObject == null)
    {
      finish();
      return;
    }
    try
    {
      paramBundle.zze((String)localObject, ObjectWrapper.wrap(this), ObjectWrapper.wrap(localLinearLayout));
      return;
    }
    catch (RemoteException paramBundle)
    {
      finish();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\OutOfContextTestingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */