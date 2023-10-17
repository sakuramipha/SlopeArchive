package com.google.android.gms.internal.ads;

import android.view.View;

public abstract class zzfgo
{
  public static zzfgo zza(zzfgp paramzzfgp, zzfgq paramzzfgq)
  {
    if (zzfgm.zzb()) {
      return new zzfgs(paramzzfgp, paramzzfgq);
    }
    throw new IllegalStateException("Method called before OM SDK activation");
  }
  
  public abstract void zzb(View paramView, zzfgu paramzzfgu, String paramString);
  
  public abstract void zzc();
  
  public abstract void zzd(View paramView);
  
  public abstract void zze();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */