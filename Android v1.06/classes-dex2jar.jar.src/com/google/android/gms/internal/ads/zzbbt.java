package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbbt
{
  public static final void zza(zzbbs paramzzbbs, zzbbq paramzzbbq)
  {
    if (paramzzbbq.zza() != null)
    {
      if (!TextUtils.isEmpty(paramzzbbq.zzb()))
      {
        paramzzbbs.zzd(paramzzbbq.zza(), paramzzbbq.zzb(), paramzzbbq.zzc(), paramzzbbq.zzd());
        return;
      }
      throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
    }
    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */