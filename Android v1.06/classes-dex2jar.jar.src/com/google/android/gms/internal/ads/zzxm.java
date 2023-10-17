package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

public final class zzxm
{
  private int zza;
  private int zzb;
  private int zzc = 0;
  private zzxf[] zzd = new zzxf[100];
  
  public zzxm(boolean paramBoolean, int paramInt) {}
  
  public final int zza()
  {
    try
    {
      int i = this.zzb;
      return i * 65536;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final zzxf zzb()
  {
    try
    {
      this.zzb += 1;
      int i = this.zzc;
      zzxf[] arrayOfzzxf;
      zzxf localzzxf;
      int j;
      if (i > 0)
      {
        arrayOfzzxf = this.zzd;
        i--;
        this.zzc = i;
        localzzxf = arrayOfzzxf[i];
        Objects.requireNonNull(localzzxf);
        arrayOfzzxf[i] = null;
      }
      else
      {
        localzzxf = new com/google/android/gms/internal/ads/zzxf;
        localzzxf.<init>(new byte[65536], 0);
        i = this.zzb;
        arrayOfzzxf = this.zzd;
        j = arrayOfzzxf.length;
        if (i > j) {
          break label90;
        }
      }
      return localzzxf;
      label90:
      this.zzd = ((zzxf[])Arrays.copyOf(arrayOfzzxf, j + j));
      return localzzxf;
    }
    finally {}
  }
  
  public final void zzc(zzxf paramzzxf)
  {
    try
    {
      zzxf[] arrayOfzzxf = this.zzd;
      int i = this.zzc;
      this.zzc = (i + 1);
      arrayOfzzxf[i] = paramzzxf;
      this.zzb -= 1;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public final void zzd(zzxg paramzzxg)
  {
    for (;;)
    {
      if (paramzzxg != null) {}
      try
      {
        zzxf[] arrayOfzzxf = this.zzd;
        int i = this.zzc;
        this.zzc = (i + 1);
        arrayOfzzxf[i] = paramzzxg.zzc();
        this.zzb -= 1;
        paramzzxg = paramzzxg.zzd();
      }
      finally {}
    }
    notifyAll();
  }
  
  public final void zze()
  {
    try
    {
      zzf(0);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzf(int paramInt)
  {
    try
    {
      int i = this.zza;
      this.zza = paramInt;
      if (paramInt < i)
      {
        zzg();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final void zzg()
  {
    try
    {
      int j = this.zza;
      int i = zzfn.zza;
      j = Math.max(0, (j + 65535) / 65536 - this.zzb);
      i = this.zzc;
      if (j >= i) {
        return;
      }
      Arrays.fill(this.zzd, j, i, null);
      this.zzc = j;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzxm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */