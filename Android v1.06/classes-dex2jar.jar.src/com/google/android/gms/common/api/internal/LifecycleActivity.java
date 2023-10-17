package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;

public class LifecycleActivity
{
  private final Object zza;
  
  public LifecycleActivity(Activity paramActivity)
  {
    Preconditions.checkNotNull(paramActivity, "Activity must not be null");
    this.zza = paramActivity;
  }
  
  public LifecycleActivity(ContextWrapper paramContextWrapper)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Activity zza()
  {
    return (Activity)this.zza;
  }
  
  public final FragmentActivity zzb()
  {
    return (FragmentActivity)this.zza;
  }
  
  public final boolean zzc()
  {
    return this.zza instanceof Activity;
  }
  
  public final boolean zzd()
  {
    return this.zza instanceof FragmentActivity;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\LifecycleActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */