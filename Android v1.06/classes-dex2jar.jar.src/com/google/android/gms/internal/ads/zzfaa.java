package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.ArrayList;

public final class zzfaa
{
  public final zzfl zza;
  public final zzbkq zzb;
  public final zzejf zzc;
  public final zzl zzd;
  public final zzq zze;
  public final String zzf;
  public final ArrayList zzg;
  public final ArrayList zzh;
  public final zzbee zzi;
  public final zzw zzj;
  public final int zzk;
  public final AdManagerAdViewOptions zzl;
  public final PublisherAdViewOptions zzm;
  public final zzcb zzn;
  public final zzezn zzo;
  public final boolean zzp;
  public final boolean zzq;
  public final zzcf zzr;
  
  public final zzbgh zza()
  {
    PublisherAdViewOptions localPublisherAdViewOptions = this.zzm;
    if ((localPublisherAdViewOptions == null) && (this.zzl == null)) {
      return null;
    }
    if (localPublisherAdViewOptions != null) {
      return localPublisherAdViewOptions.zzb();
    }
    return this.zzl.zza();
  }
  
  public final boolean zzb()
  {
    String str = this.zzf;
    zzbbc localzzbbc = zzbbk.zzcO;
    return str.matches((String)zzba.zzc().zzb(localzzbbc));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */