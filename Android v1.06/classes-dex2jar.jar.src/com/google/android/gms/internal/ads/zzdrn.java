package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdrn
  implements zzdrb
{
  private final long zza;
  private final zzejn zzb;
  
  zzdrn(long paramLong, Context paramContext, zzdrg paramzzdrg, zzcgw paramzzcgw, String paramString)
  {
    this.zza = paramLong;
    paramzzcgw = paramzzcgw.zzt();
    paramzzcgw.zzc(paramContext);
    paramzzcgw.zza(new zzq());
    paramzzcgw.zzb(paramString);
    paramContext = paramzzcgw.zzd().zza();
    this.zzb = paramContext;
    paramContext.zzD(new zzdrm(this, paramzzdrg));
  }
  
  public final void zza()
  {
    this.zzb.zzx();
  }
  
  public final void zzb(zzl paramzzl)
  {
    this.zzb.zzaa(paramzzl);
  }
  
  public final void zzc()
  {
    this.zzb.zzW(ObjectWrapper.wrap(null));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdrn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */