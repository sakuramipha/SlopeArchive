package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcql
  extends zzcpd
{
  private final zzbgh zzc;
  private final Runnable zzd;
  private final Executor zze;
  
  public zzcql(zzcre paramzzcre, zzbgh paramzzbgh, Runnable paramRunnable, Executor paramExecutor)
  {
    super(paramzzcre);
    this.zzc = paramzzbgh;
    this.zzd = paramRunnable;
    this.zze = paramExecutor;
  }
  
  public final int zza()
  {
    return 0;
  }
  
  public final View zzc()
  {
    return null;
  }
  
  public final zzdq zzd()
  {
    return null;
  }
  
  public final zzezg zze()
  {
    return null;
  }
  
  public final zzezg zzf()
  {
    return null;
  }
  
  public final void zzg() {}
  
  public final void zzh(ViewGroup paramViewGroup, zzq paramzzq) {}
  
  public final void zzj()
  {
    zzcqj localzzcqj = new zzcqj(new AtomicReference(this.zzd));
    this.zze.execute(new zzcqk(this, localzzcqj));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */