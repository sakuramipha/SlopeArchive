package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

public class zzcpk
{
  private final zzcrd zza;
  private final View zzb;
  private final zzezg zzc;
  private final zzcfb zzd;
  
  public zzcpk(View paramView, zzcfb paramzzcfb, zzcrd paramzzcrd, zzezg paramzzezg)
  {
    this.zzb = paramView;
    this.zzd = paramzzcfb;
    this.zza = paramzzcrd;
    this.zzc = paramzzezg;
  }
  
  public static final zzdco zzf(Context paramContext, zzbzz paramzzbzz, zzezf paramzzezf, zzfaa paramzzfaa)
  {
    return new zzdco(new zzcpi(paramContext, paramzzbzz, paramzzezf, paramzzfaa), zzcag.zzf);
  }
  
  public static final Set zzg(zzcqu paramzzcqu)
  {
    return Collections.singleton(new zzdco(paramzzcqu, zzcag.zzf));
  }
  
  public static final zzdco zzh(zzcqs paramzzcqs)
  {
    return new zzdco(paramzzcqs, zzcag.zze);
  }
  
  public final View zza()
  {
    return this.zzb;
  }
  
  public final zzcfb zzb()
  {
    return this.zzd;
  }
  
  public final zzcrd zzc()
  {
    return this.zza;
  }
  
  public zzcwu zzd(Set paramSet)
  {
    return new zzcwu(paramSet);
  }
  
  public final zzezg zze()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */