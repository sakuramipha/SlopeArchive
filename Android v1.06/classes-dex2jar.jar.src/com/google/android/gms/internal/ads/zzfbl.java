package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedList;

final class zzfbl
{
  private final LinkedList zza = new LinkedList();
  private final int zzb;
  private final int zzc;
  private final zzfck zzd;
  
  public zzfbl(int paramInt1, int paramInt2)
  {
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = new zzfck();
  }
  
  private final void zzi()
  {
    while (!this.zza.isEmpty())
    {
      zzfbv localzzfbv = (zzfbv)this.zza.getFirst();
      if (zzt.zzB().currentTimeMillis() - localzzfbv.zzd < this.zzc) {
        break;
      }
      this.zzd.zzg();
      this.zza.remove();
    }
  }
  
  public final int zza()
  {
    return this.zzd.zza();
  }
  
  public final int zzb()
  {
    zzi();
    return this.zza.size();
  }
  
  public final long zzc()
  {
    return this.zzd.zzb();
  }
  
  public final long zzd()
  {
    return this.zzd.zzc();
  }
  
  public final zzfbv zze()
  {
    this.zzd.zzf();
    zzi();
    if (this.zza.isEmpty()) {
      return null;
    }
    zzfbv localzzfbv = (zzfbv)this.zza.remove();
    if (localzzfbv != null) {
      this.zzd.zzh();
    }
    return localzzfbv;
  }
  
  public final zzfcj zzf()
  {
    return this.zzd.zzd();
  }
  
  public final String zzg()
  {
    return this.zzd.zze();
  }
  
  public final boolean zzh(zzfbv paramzzfbv)
  {
    this.zzd.zzf();
    zzi();
    if (this.zza.size() == this.zzb) {
      return false;
    }
    this.zza.add(paramzzfbv);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */