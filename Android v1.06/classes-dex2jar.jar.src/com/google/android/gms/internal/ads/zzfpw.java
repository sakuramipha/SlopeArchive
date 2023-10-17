package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfpw
  implements Iterator
{
  final Iterator zza;
  @CheckForNull
  Collection zzb;
  final zzfpx zzc;
  
  zzfpw(zzfpx paramzzfpx)
  {
    this.zza = paramzzfpx.zza.entrySet().iterator();
  }
  
  public final boolean hasNext()
  {
    return this.zza.hasNext();
  }
  
  public final void remove()
  {
    boolean bool;
    if (this.zzb != null) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzi(bool, "no calls to next() since the last call to remove()");
    this.zza.remove();
    zzfqk localzzfqk = this.zzc.zzb;
    zzfqk.zzn(localzzfqk, zzfqk.zzd(localzzfqk) - this.zzb.size());
    this.zzb.clear();
    this.zzb = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */