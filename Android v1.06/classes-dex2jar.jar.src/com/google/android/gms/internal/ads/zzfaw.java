package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzfaw
{
  private final Deque zza = new LinkedBlockingDeque();
  private final Callable zzb;
  private final zzfwc zzc;
  
  public zzfaw(Callable paramCallable, zzfwc paramzzfwc)
  {
    this.zzb = paramCallable;
    this.zzc = paramzzfwc;
  }
  
  public final zzfwb zza()
  {
    try
    {
      zzc(1);
      zzfwb localzzfwb = (zzfwb)this.zza.poll();
      return localzzfwb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb(zzfwb paramzzfwb)
  {
    try
    {
      this.zza.addFirst(paramzzfwb);
      return;
    }
    finally
    {
      paramzzfwb = finally;
      throw paramzzfwb;
    }
  }
  
  public final void zzc(int paramInt)
  {
    try
    {
      int j = this.zza.size();
      for (int i = 0; i < paramInt - j; i++) {
        this.zza.add(this.zzc.zzb(this.zzb));
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */