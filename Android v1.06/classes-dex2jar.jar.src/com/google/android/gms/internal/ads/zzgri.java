package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzgri
  implements Iterator
{
  final zzgrm zza;
  private int zzb;
  private boolean zzc;
  private Iterator zzd;
  
  private final Iterator zza()
  {
    if (this.zzd == null) {
      this.zzd = zzgrm.zzh(this.zza).entrySet().iterator();
    }
    return this.zzd;
  }
  
  public final boolean hasNext()
  {
    int i = this.zzb;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (i + 1 >= zzgrm.zzf(this.zza).size()) {
      if (!zzgrm.zzh(this.zza).isEmpty())
      {
        if (zza().hasNext()) {
          bool1 = bool2;
        } else {
          return false;
        }
      }
      else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final void remove()
  {
    if (this.zzc)
    {
      this.zzc = false;
      zzgrm.zzi(this.zza);
      if (this.zzb < zzgrm.zzf(this.zza).size())
      {
        zzgrm localzzgrm = this.zza;
        int i = this.zzb;
        this.zzb = (i - 1);
        zzgrm.zzd(localzzgrm, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */