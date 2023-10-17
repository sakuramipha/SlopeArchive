package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public abstract class zzsu
  extends zzsm
{
  private final HashMap zza = new HashMap();
  private Handler zzb;
  private zzgz zzc;
  
  protected final void zzA(Object paramObject, zztn paramzztn)
  {
    zzdy.zzd(this.zza.containsKey(paramObject) ^ true);
    zzsr localzzsr = new zzsr(this, paramObject);
    zzss localzzss = new zzss(this, paramObject);
    this.zza.put(paramObject, new zzst(paramzztn, localzzsr, localzzss));
    paramObject = this.zzb;
    Objects.requireNonNull(paramObject);
    paramzztn.zzh((Handler)paramObject, localzzss);
    paramObject = this.zzb;
    Objects.requireNonNull(paramObject);
    paramzztn.zzg((Handler)paramObject, localzzss);
    paramzztn.zzm(localzzsr, this.zzc, zzb());
    if (!zzt()) {
      paramzztn.zzi(localzzsr);
    }
  }
  
  protected final void zzj()
  {
    Iterator localIterator = this.zza.values().iterator();
    while (localIterator.hasNext())
    {
      zzst localzzst = (zzst)localIterator.next();
      localzzst.zza.zzi(localzzst.zzb);
    }
  }
  
  protected final void zzl()
  {
    Iterator localIterator = this.zza.values().iterator();
    while (localIterator.hasNext())
    {
      zzst localzzst = (zzst)localIterator.next();
      localzzst.zza.zzk(localzzst.zzb);
    }
  }
  
  protected void zzn(zzgz paramzzgz)
  {
    this.zzc = paramzzgz;
    this.zzb = zzfn.zzs(null);
  }
  
  protected void zzq()
  {
    Iterator localIterator = this.zza.values().iterator();
    while (localIterator.hasNext())
    {
      zzst localzzst = (zzst)localIterator.next();
      localzzst.zza.zzp(localzzst.zzb);
      localzzst.zza.zzs(localzzst.zzc);
      localzzst.zza.zzr(localzzst.zzc);
    }
    this.zza.clear();
  }
  
  protected int zzv(Object paramObject, int paramInt)
  {
    return 0;
  }
  
  protected long zzw(Object paramObject, long paramLong)
  {
    return paramLong;
  }
  
  protected zztl zzx(Object paramObject, zztl paramzztl)
  {
    throw null;
  }
  
  public void zzy()
    throws IOException
  {
    Iterator localIterator = this.zza.values().iterator();
    while (localIterator.hasNext()) {
      ((zzst)localIterator.next()).zza.zzy();
    }
  }
  
  protected abstract void zzz(Object paramObject, zztn paramzztn, zzcx paramzzcx);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */