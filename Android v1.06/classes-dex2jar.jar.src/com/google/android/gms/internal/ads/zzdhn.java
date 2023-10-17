package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public final class zzdhn
{
  public static final zzdhn zza = new zzdhn(new zzdhl());
  private final zzbfr zzb;
  private final zzbfo zzc;
  private final zzbge zzd;
  private final zzbgb zze;
  private final zzbkz zzf;
  private final SimpleArrayMap zzg;
  private final SimpleArrayMap zzh;
  
  private zzdhn(zzdhl paramzzdhl)
  {
    this.zzb = paramzzdhl.zza;
    this.zzc = paramzzdhl.zzb;
    this.zzd = paramzzdhl.zzc;
    this.zzg = new SimpleArrayMap(paramzzdhl.zzf);
    this.zzh = new SimpleArrayMap(paramzzdhl.zzg);
    this.zze = paramzzdhl.zzd;
    this.zzf = paramzzdhl.zze;
  }
  
  public final zzbfo zza()
  {
    return this.zzc;
  }
  
  public final zzbfr zzb()
  {
    return this.zzb;
  }
  
  public final zzbfu zzc(String paramString)
  {
    return (zzbfu)this.zzh.get(paramString);
  }
  
  public final zzbfx zzd(String paramString)
  {
    return (zzbfx)this.zzg.get(paramString);
  }
  
  public final zzbgb zze()
  {
    return this.zze;
  }
  
  public final zzbge zzf()
  {
    return this.zzd;
  }
  
  public final zzbkz zzg()
  {
    return this.zzf;
  }
  
  public final ArrayList zzh()
  {
    ArrayList localArrayList = new ArrayList(this.zzg.size());
    for (int i = 0; i < this.zzg.size(); i++) {
      localArrayList.add((String)this.zzg.keyAt(i));
    }
    return localArrayList;
  }
  
  public final ArrayList zzi()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.zzd != null) {
      localArrayList.add(Integer.toString(6));
    }
    if (this.zzb != null) {
      localArrayList.add(Integer.toString(1));
    }
    if (this.zzc != null) {
      localArrayList.add(Integer.toString(2));
    }
    if (!this.zzg.isEmpty()) {
      localArrayList.add(Integer.toString(3));
    }
    if (this.zzf != null) {
      localArrayList.add(Integer.toString(7));
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */