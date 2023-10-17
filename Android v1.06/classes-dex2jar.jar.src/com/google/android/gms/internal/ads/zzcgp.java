package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class zzcgp
  extends MutableContextWrapper
{
  private Activity zza;
  private Context zzb;
  private Context zzc;
  
  public zzcgp(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public final Object getSystemService(String paramString)
  {
    return this.zzc.getSystemService(paramString);
  }
  
  public final void setBaseContext(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.zzb = localContext;
    Activity localActivity;
    if ((paramContext instanceof Activity)) {
      localActivity = (Activity)paramContext;
    } else {
      localActivity = null;
    }
    this.zza = localActivity;
    this.zzc = paramContext;
    super.setBaseContext(localContext);
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
    this.zzb.startActivity(paramIntent);
  }
  
  public final Activity zza()
  {
    return this.zza;
  }
  
  public final Context zzb()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */