package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzezy
{
  private zzl zza;
  private zzq zzb;
  private String zzc;
  private zzfl zzd;
  private boolean zze;
  private ArrayList zzf;
  private ArrayList zzg;
  private zzbee zzh;
  private zzw zzi;
  private AdManagerAdViewOptions zzj;
  private PublisherAdViewOptions zzk;
  private zzcb zzl;
  private int zzm = 1;
  private zzbkq zzn;
  private final zzezl zzo = new zzezl();
  private boolean zzp = false;
  private zzejf zzq;
  private boolean zzr = false;
  private zzcf zzs;
  
  public final zzezy zzA(zzbee paramzzbee)
  {
    this.zzh = paramzzbee;
    return this;
  }
  
  public final zzezy zzB(ArrayList paramArrayList)
  {
    this.zzf = paramArrayList;
    return this;
  }
  
  public final zzezy zzC(ArrayList paramArrayList)
  {
    this.zzg = paramArrayList;
    return this;
  }
  
  public final zzezy zzD(PublisherAdViewOptions paramPublisherAdViewOptions)
  {
    this.zzk = paramPublisherAdViewOptions;
    if (paramPublisherAdViewOptions != null)
    {
      this.zze = paramPublisherAdViewOptions.zzc();
      this.zzl = paramPublisherAdViewOptions.zza();
    }
    return this;
  }
  
  public final zzezy zzE(zzl paramzzl)
  {
    this.zza = paramzzl;
    return this;
  }
  
  public final zzezy zzF(zzfl paramzzfl)
  {
    this.zzd = paramzzfl;
    return this;
  }
  
  public final zzfaa zzG()
  {
    Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
    Preconditions.checkNotNull(this.zzb, "ad size must not be null");
    Preconditions.checkNotNull(this.zza, "ad request must not be null");
    return new zzfaa(this, null);
  }
  
  public final String zzI()
  {
    return this.zzc;
  }
  
  public final boolean zzO()
  {
    return this.zzp;
  }
  
  public final zzezy zzQ(zzcf paramzzcf)
  {
    this.zzs = paramzzcf;
    return this;
  }
  
  public final zzl zze()
  {
    return this.zza;
  }
  
  public final zzq zzg()
  {
    return this.zzb;
  }
  
  public final zzezl zzo()
  {
    return this.zzo;
  }
  
  public final zzezy zzp(zzfaa paramzzfaa)
  {
    this.zzo.zza(paramzzfaa.zzo.zza);
    this.zza = paramzzfaa.zzd;
    this.zzb = paramzzfaa.zze;
    this.zzs = paramzzfaa.zzr;
    this.zzc = paramzzfaa.zzf;
    this.zzd = paramzzfaa.zza;
    this.zzf = paramzzfaa.zzg;
    this.zzg = paramzzfaa.zzh;
    this.zzh = paramzzfaa.zzi;
    this.zzi = paramzzfaa.zzj;
    zzq(paramzzfaa.zzl);
    zzD(paramzzfaa.zzm);
    this.zzp = paramzzfaa.zzp;
    this.zzq = paramzzfaa.zzc;
    this.zzr = paramzzfaa.zzq;
    return this;
  }
  
  public final zzezy zzq(AdManagerAdViewOptions paramAdManagerAdViewOptions)
  {
    this.zzj = paramAdManagerAdViewOptions;
    if (paramAdManagerAdViewOptions != null) {
      this.zze = paramAdManagerAdViewOptions.getManualImpressionsEnabled();
    }
    return this;
  }
  
  public final zzezy zzr(zzq paramzzq)
  {
    this.zzb = paramzzq;
    return this;
  }
  
  public final zzezy zzs(String paramString)
  {
    this.zzc = paramString;
    return this;
  }
  
  public final zzezy zzt(zzw paramzzw)
  {
    this.zzi = paramzzw;
    return this;
  }
  
  public final zzezy zzu(zzejf paramzzejf)
  {
    this.zzq = paramzzejf;
    return this;
  }
  
  public final zzezy zzv(zzbkq paramzzbkq)
  {
    this.zzn = paramzzbkq;
    this.zzd = new zzfl(false, true, false);
    return this;
  }
  
  public final zzezy zzw(boolean paramBoolean)
  {
    this.zzp = paramBoolean;
    return this;
  }
  
  public final zzezy zzx(boolean paramBoolean)
  {
    this.zzr = true;
    return this;
  }
  
  public final zzezy zzy(boolean paramBoolean)
  {
    this.zze = paramBoolean;
    return this;
  }
  
  public final zzezy zzz(int paramInt)
  {
    this.zzm = paramInt;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */