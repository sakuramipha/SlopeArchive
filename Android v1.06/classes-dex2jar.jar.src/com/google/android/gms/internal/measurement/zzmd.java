package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzmd
  implements Iterator
{
  final zzmh zza;
  private int zzb;
  private boolean zzc;
  private Iterator zzd;
  
  private final Iterator zza()
  {
    if (this.zzd == null) {
      this.zzd = zzmh.zzh(this.zza).entrySet().iterator();
    }
    return this.zzd;
  }
  
  public final boolean hasNext()
  {
    int i = this.zzb;
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (i + 1 >= zzmh.zzf(this.zza).size()) {
      if (!zzmh.zzh(this.zza).isEmpty())
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
      zzmh.zzi(this.zza);
      if (this.zzb < zzmh.zzf(this.zza).size())
      {
        zzmh localzzmh = this.zza;
        int i = this.zzb;
        this.zzb = (i - 1);
        zzmh.zzd(localzzmh, i);
        return;
      }
      zza().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */