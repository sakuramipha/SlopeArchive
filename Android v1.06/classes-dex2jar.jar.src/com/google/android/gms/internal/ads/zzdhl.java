package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

public final class zzdhl
{
  zzbfr zza;
  zzbfo zzb;
  zzbge zzc;
  zzbgb zzd;
  zzbkz zze;
  final SimpleArrayMap zzf = new SimpleArrayMap();
  final SimpleArrayMap zzg = new SimpleArrayMap();
  
  public final zzdhl zza(zzbfo paramzzbfo)
  {
    this.zzb = paramzzbfo;
    return this;
  }
  
  public final zzdhl zzb(zzbfr paramzzbfr)
  {
    this.zza = paramzzbfr;
    return this;
  }
  
  public final zzdhl zzc(String paramString, zzbfx paramzzbfx, zzbfu paramzzbfu)
  {
    this.zzf.put(paramString, paramzzbfx);
    if (paramzzbfu != null) {
      this.zzg.put(paramString, paramzzbfu);
    }
    return this;
  }
  
  public final zzdhl zzd(zzbkz paramzzbkz)
  {
    this.zze = paramzzbkz;
    return this;
  }
  
  public final zzdhl zze(zzbgb paramzzbgb)
  {
    this.zzd = paramzzbgb;
    return this;
  }
  
  public final zzdhl zzf(zzbge paramzzbge)
  {
    this.zzc = paramzzbge;
    return this;
  }
  
  public final zzdhn zzg()
  {
    return new zzdhn(this, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */