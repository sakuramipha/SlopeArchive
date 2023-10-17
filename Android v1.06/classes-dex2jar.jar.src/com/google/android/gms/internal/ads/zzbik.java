package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbik
{
  private boolean zza = false;
  private boolean zzb = false;
  private float zzc = 0.0F;
  private final AtomicBoolean zzd = new AtomicBoolean(false);
  
  public final float zza()
  {
    try
    {
      float f = this.zzc;
      return f;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzb(boolean paramBoolean, float paramFloat)
  {
    try
    {
      this.zzb = paramBoolean;
      this.zzc = paramFloat;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzc(boolean paramBoolean)
  {
    try
    {
      this.zza = paramBoolean;
      this.zzd.set(true);
      return;
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
  
  public final boolean zze(boolean paramBoolean)
  {
    try
    {
      if (this.zzd.get())
      {
        paramBoolean = this.zza;
        return paramBoolean;
      }
      return paramBoolean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */