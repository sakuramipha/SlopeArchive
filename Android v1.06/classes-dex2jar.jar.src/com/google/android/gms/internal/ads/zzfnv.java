package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

final class zzfnv
  extends zzfnp
{
  final zzfny zzb;
  
  zzfnv(zzfny paramzzfny, IBinder paramIBinder) {}
  
  public final void zza()
  {
    zzfnz.zzm(this.zzb.zza, zzfnk.zzb(this.zza));
    zzfnz.zzq(this.zzb.zza);
    zzfnz.zzl(this.zzb.zza, false);
    Iterator localIterator = zzfnz.zzh(this.zzb.zza).iterator();
    while (localIterator.hasNext()) {
      ((Runnable)localIterator.next()).run();
    }
    zzfnz.zzh(this.zzb.zza).clear();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */