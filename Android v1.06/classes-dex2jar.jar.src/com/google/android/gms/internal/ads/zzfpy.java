package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.CheckForNull;

class zzfpy
  implements Iterator
{
  final Iterator zza;
  @CheckForNull
  Object zzb;
  @CheckForNull
  Collection zzc;
  Iterator zzd;
  final zzfqk zze;
  
  zzfpy(zzfqk paramzzfqk)
  {
    this.zza = zzfqk.zzi(paramzzfqk).entrySet().iterator();
    this.zzb = null;
    this.zzc = null;
    this.zzd = zzfsa.zza;
  }
  
  public final boolean hasNext()
  {
    return (this.zza.hasNext()) || (this.zzd.hasNext());
  }
  
  public final Object next()
  {
    if (!this.zzd.hasNext())
    {
      Object localObject = (Map.Entry)this.zza.next();
      this.zzb = ((Map.Entry)localObject).getKey();
      localObject = (Collection)((Map.Entry)localObject).getValue();
      this.zzc = ((Collection)localObject);
      this.zzd = ((Collection)localObject).iterator();
    }
    return this.zzd.next();
  }
  
  public final void remove()
  {
    this.zzd.remove();
    Object localObject = this.zzc;
    localObject.getClass();
    if (((Collection)localObject).isEmpty()) {
      this.zza.remove();
    }
    localObject = this.zze;
    zzfqk.zzn((zzfqk)localObject, zzfqk.zzd((zzfqk)localObject) - 1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */