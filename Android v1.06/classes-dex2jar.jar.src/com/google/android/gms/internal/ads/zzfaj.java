package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.List;

public final class zzfaj
{
  private final zzezf zza;
  private final zzezi zzb;
  private final zzebc zzc;
  private final zzfgj zzd;
  private final zzffq zze;
  
  public zzfaj(zzebc paramzzebc, zzfgj paramzzfgj, zzezf paramzzezf, zzezi paramzzezi, zzffq paramzzffq)
  {
    this.zza = paramzzezf;
    this.zzb = paramzzezi;
    this.zzc = paramzzebc;
    this.zzd = paramzzfgj;
    this.zze = paramzzffq;
  }
  
  public final void zza(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      zzb((String)paramList.next(), 2);
    }
  }
  
  public final void zzb(String paramString, int paramInt)
  {
    if (!this.zza.zzaj)
    {
      this.zzd.zzc(paramString, this.zze);
      return;
    }
    paramString = new zzebe(zzt.zzB().currentTimeMillis(), this.zzb.zzb, paramString, paramInt);
    this.zzc.zzd(paramString);
  }
  
  public final void zzc(List paramList, int paramInt)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      zzb((String)paramList.next(), paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */