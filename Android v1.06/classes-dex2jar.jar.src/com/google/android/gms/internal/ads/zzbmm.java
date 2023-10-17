package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

public final class zzbmm
  implements zzbld, zzbml
{
  private final zzbml zza;
  private final HashSet zzb;
  
  public zzbmm(zzbml paramzzbml)
  {
    this.zza = paramzzbml;
    this.zzb = new HashSet();
  }
  
  public final void zza(String paramString)
  {
    this.zza.zza(paramString);
  }
  
  public final void zzc()
  {
    Iterator localIterator = this.zzb.iterator();
    while (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbii)localSimpleEntry.getValue()).toString())));
      this.zza.zzr((String)localSimpleEntry.getKey(), (zzbii)localSimpleEntry.getValue());
    }
    this.zzb.clear();
  }
  
  public final void zzq(String paramString, zzbii paramzzbii)
  {
    this.zza.zzq(paramString, paramzzbii);
    this.zzb.add(new AbstractMap.SimpleEntry(paramString, paramzzbii));
  }
  
  public final void zzr(String paramString, zzbii paramzzbii)
  {
    this.zza.zzr(paramString, paramzzbii);
    this.zzb.remove(new AbstractMap.SimpleEntry(paramString, paramzzbii));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */