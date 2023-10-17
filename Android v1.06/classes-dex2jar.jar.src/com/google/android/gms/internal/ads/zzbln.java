package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbln
  implements zzblf, zzbld
{
  private final zzcfb zza;
  
  public zzbln(Context paramContext, zzbzz paramzzbzz, zzaqq paramzzaqq, zza paramzza)
    throws zzcfm
  {
    zzt.zzz();
    paramContext = zzcfn.zza(paramContext, zzcgq.zza(), "", false, false, null, null, paramzzbzz, null, null, null, zzawx.zza(), null, null);
    this.zza = paramContext;
    ((View)paramContext).setWillNotDraw(true);
  }
  
  private static final void zzs(Runnable paramRunnable)
  {
    zzay.zzb();
    if (zzbzm.zzu())
    {
      paramRunnable.run();
      return;
    }
    zzs.zza.post(paramRunnable);
  }
  
  public final void zza(String paramString)
  {
    zzs(new zzbli(this, paramString));
  }
  
  public final void zzc()
  {
    this.zza.destroy();
  }
  
  public final void zzf(String paramString)
  {
    zzs(new zzblj(this, paramString));
  }
  
  public final void zzg(String paramString)
  {
    zzs(new zzbll(this, paramString));
  }
  
  public final void zzh(String paramString)
  {
    zzs(new zzblk(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }
  
  public final boolean zzi()
  {
    return this.zza.zzaz();
  }
  
  public final zzbmm zzj()
  {
    return new zzbmm(this);
  }
  
  public final void zzk(zzblu paramzzblu)
  {
    this.zza.zzN().zzG(new zzblg(paramzzblu));
  }
  
  public final void zzq(String paramString, zzbii paramzzbii)
  {
    this.zza.zzad(paramString, new zzblm(this, paramzzbii));
  }
  
  public final void zzr(String paramString, zzbii paramzzbii)
  {
    this.zza.zzav(paramString, new zzblh(paramzzbii));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */