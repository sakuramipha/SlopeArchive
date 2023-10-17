package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbcd
  extends zzbce
{
  private final zzf zza;
  private final String zzb;
  private final String zzc;
  
  public zzbcd(zzf paramzzf, String paramString1, String paramString2)
  {
    this.zza = paramzzf;
    this.zzb = paramString1;
    this.zzc = paramString2;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzc;
  }
  
  public final void zzd(IObjectWrapper paramIObjectWrapper)
  {
    if (paramIObjectWrapper == null) {
      return;
    }
    this.zza.zza((View)ObjectWrapper.unwrap(paramIObjectWrapper));
  }
  
  public final void zze()
  {
    this.zza.zzb();
  }
  
  public final void zzf()
  {
    this.zza.zzc();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */