package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

public final class zzby
  extends ContextWrapper
{
  private Activity zza;
  
  public zzby(Application paramApplication)
  {
    super(paramApplication);
  }
  
  public final Object getSystemService(String paramString)
  {
    Activity localActivity = this.zza;
    if (localActivity != null) {
      return localActivity.getSystemService(paramString);
    }
    return super.getSystemService(paramString);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    Activity localActivity = this.zza;
    if (localActivity != null)
    {
      localActivity.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    super.startActivity(paramIntent);
  }
  
  public final void zza(Activity paramActivity)
  {
    this.zza = paramActivity;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */