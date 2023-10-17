package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

public final class zzcgz
{
  private final zzbzz zza;
  private final Context zzb;
  private final WeakReference zzc;
  
  final Context zza()
  {
    return this.zzb;
  }
  
  public final zzaqq zzb()
  {
    return new zzaqq(new zzi(this.zzb, this.zza));
  }
  
  final zzbdx zzc()
  {
    return new zzbdx(this.zzb);
  }
  
  final zzbzz zzd()
  {
    return this.zza;
  }
  
  final String zze()
  {
    return zzt.zzp().zzc(this.zzb, this.zza.zza);
  }
  
  final WeakReference zzf()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */