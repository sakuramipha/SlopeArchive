package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

final class zzaf
  implements zzae
{
  private final Object zza = new Object();
  private final int zzb;
  private final zzw<Void> zzc;
  private int zzd;
  private int zze;
  private int zzf;
  private Exception zzg;
  private boolean zzh;
  
  public zzaf(int paramInt, zzw<Void> paramzzw)
  {
    this.zzb = paramInt;
    this.zzc = paramzzw;
  }
  
  private final void zza()
  {
    if (this.zzd + this.zze + this.zzf == this.zzb)
    {
      if (this.zzg != null)
      {
        zzw localzzw = this.zzc;
        int i = this.zze;
        int j = this.zzb;
        StringBuilder localStringBuilder = new StringBuilder(54);
        localStringBuilder.append(i);
        localStringBuilder.append(" out of ");
        localStringBuilder.append(j);
        localStringBuilder.append(" underlying tasks failed");
        localzzw.zza(new ExecutionException(localStringBuilder.toString(), this.zzg));
        return;
      }
      if (this.zzh)
      {
        this.zzc.zzc();
        return;
      }
      this.zzc.zzb(null);
    }
  }
  
  public final void onCanceled()
  {
    synchronized (this.zza)
    {
      this.zzf += 1;
      this.zzh = true;
      zza();
      return;
    }
  }
  
  public final void onFailure(Exception paramException)
  {
    synchronized (this.zza)
    {
      this.zze += 1;
      this.zzg = paramException;
      zza();
      return;
    }
  }
  
  public final void onSuccess(Object paramObject)
  {
    synchronized (this.zza)
    {
      this.zzd += 1;
      zza();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\tasks\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */