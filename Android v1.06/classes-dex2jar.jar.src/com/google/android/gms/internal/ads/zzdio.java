package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;

public final class zzdio
{
  private final zzdnk zza;
  private final zzdlz zzb;
  private final zzcoj zzc;
  private final zzdhk zzd;
  
  public zzdio(zzdnk paramzzdnk, zzdlz paramzzdlz, zzcoj paramzzcoj, zzdhk paramzzdhk)
  {
    this.zza = paramzzdnk;
    this.zzb = paramzzdlz;
    this.zzc = paramzzcoj;
    this.zzd = paramzzdhk;
  }
  
  public final View zza()
    throws zzcfm
  {
    zzcfb localzzcfb = this.zza.zza(zzq.zzc(), null, null);
    View localView = (View)localzzcfb;
    localView.setVisibility(8);
    localzzcfb.zzad("/sendMessageToSdk", new zzdii(this));
    localzzcfb.zzad("/adMuted", new zzdij(this));
    this.zzb.zzj(new WeakReference(localzzcfb), "/loadHtml", new zzdik(this));
    this.zzb.zzj(new WeakReference(localzzcfb), "/showOverlay", new zzdil(this));
    this.zzb.zzj(new WeakReference(localzzcfb), "/hideOverlay", new zzdim(this));
    return localView;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */