package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zzdx
{
  private final Date zza;
  private final String zzb;
  private final List zzc;
  private final int zzd;
  private final Set zze;
  private final Bundle zzf;
  private final Map zzg;
  private final String zzh;
  private final String zzi;
  @NotOnlyInitialized
  private final SearchAdRequest zzj;
  private final int zzk;
  private final Set zzl;
  private final Bundle zzm;
  private final Set zzn;
  private final boolean zzo;
  private final String zzp;
  private final int zzq;
  
  public zzdx(zzdw paramzzdw, SearchAdRequest paramSearchAdRequest)
  {
    this.zza = zzdw.zzj(paramzzdw);
    this.zzb = zzdw.zzg(paramzzdw);
    this.zzc = zzdw.zzo(paramzzdw);
    this.zzd = zzdw.zza(paramzzdw);
    this.zze = Collections.unmodifiableSet(zzdw.zzm(paramzzdw));
    this.zzf = zzdw.zze(paramzzdw);
    this.zzg = Collections.unmodifiableMap(zzdw.zzk(paramzzdw));
    this.zzh = zzdw.zzh(paramzzdw);
    this.zzi = zzdw.zzi(paramzzdw);
    this.zzj = paramSearchAdRequest;
    this.zzk = zzdw.zzc(paramzzdw);
    this.zzl = Collections.unmodifiableSet(zzdw.zzn(paramzzdw));
    this.zzm = zzdw.zzd(paramzzdw);
    this.zzn = Collections.unmodifiableSet(zzdw.zzl(paramzzdw));
    this.zzo = zzdw.zzH(paramzzdw);
    this.zzp = zzdw.zzf(paramzzdw);
    this.zzq = zzdw.zzb(paramzzdw);
  }
  
  @Deprecated
  public final int zza()
  {
    return this.zzd;
  }
  
  public final int zzb()
  {
    return this.zzq;
  }
  
  public final int zzc()
  {
    return this.zzk;
  }
  
  public final Bundle zzd(Class paramClass)
  {
    Bundle localBundle = this.zzf.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null) {
      return localBundle.getBundle(paramClass.getName());
    }
    return null;
  }
  
  public final Bundle zze()
  {
    return this.zzm;
  }
  
  public final Bundle zzf(Class paramClass)
  {
    return this.zzf.getBundle(paramClass.getName());
  }
  
  public final Bundle zzg()
  {
    return this.zzf;
  }
  
  @Deprecated
  public final NetworkExtras zzh(Class paramClass)
  {
    return (NetworkExtras)this.zzg.get(paramClass);
  }
  
  public final SearchAdRequest zzi()
  {
    return this.zzj;
  }
  
  public final String zzj()
  {
    return this.zzp;
  }
  
  public final String zzk()
  {
    return this.zzb;
  }
  
  public final String zzl()
  {
    return this.zzh;
  }
  
  public final String zzm()
  {
    return this.zzi;
  }
  
  @Deprecated
  public final Date zzn()
  {
    return this.zza;
  }
  
  public final List zzo()
  {
    return new ArrayList(this.zzc);
  }
  
  public final Set zzp()
  {
    return this.zzn;
  }
  
  public final Set zzq()
  {
    return this.zze;
  }
  
  @Deprecated
  public final boolean zzr()
  {
    return this.zzo;
  }
  
  public final boolean zzs(Context paramContext)
  {
    RequestConfiguration localRequestConfiguration = zzej.zzf().zzc();
    zzay.zzb();
    paramContext = zzbzm.zzy(paramContext);
    return (this.zzl.contains(paramContext)) || (localRequestConfiguration.getTestDeviceIds().contains(paramContext));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */