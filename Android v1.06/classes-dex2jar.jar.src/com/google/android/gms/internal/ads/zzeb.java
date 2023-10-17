package com.google.android.gms.internal.ads;

public final class zzeb
{
  private final zzdz zza;
  private boolean zzb;
  
  public zzeb() {}
  
  public zzeb(zzdz paramzzdz)
  {
    this.zza = paramzzdz;
  }
  
  public final void zza()
    throws InterruptedException
  {
    try
    {
      while (!this.zzb) {
        wait();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb()
  {
    int i = 0;
    try
    {
      for (;;)
      {
        boolean bool = this.zzb;
        if (bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          i = 1;
        }
      }
      if (i != 0)
      {
        Thread.currentThread().interrupt();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final boolean zzc()
  {
    try
    {
      boolean bool = this.zzb;
      this.zzb = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zzd()
  {
    try
    {
      boolean bool = this.zzb;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean zze()
  {
    try
    {
      boolean bool = this.zzb;
      if (bool) {
        return false;
      }
      this.zzb = true;
      notifyAll();
      return true;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */