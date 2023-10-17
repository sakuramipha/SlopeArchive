package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzfk
{
  private long[] zza = new long[10];
  private Object[] zzb = new Object[10];
  private int zzc;
  private int zzd;
  
  public zzfk()
  {
    this(10);
  }
  
  public zzfk(int paramInt) {}
  
  private final Object zzf()
  {
    boolean bool;
    if (this.zzd > 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    Object[] arrayOfObject = this.zzb;
    int i = this.zzc;
    Object localObject = arrayOfObject[i];
    arrayOfObject[i] = null;
    this.zzc = ((i + 1) % arrayOfObject.length);
    this.zzd -= 1;
    return localObject;
  }
  
  public final int zza()
  {
    try
    {
      int i = this.zzd;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object zzb()
  {
    try
    {
      int i = this.zzd;
      if (i == 0) {
        return null;
      }
      Object localObject1 = zzf();
      return localObject1;
    }
    finally {}
  }
  
  public final Object zzc(long paramLong)
  {
    Object localObject1 = null;
    try
    {
      while ((this.zzd > 0) && (paramLong - this.zza[this.zzc] >= 0L)) {
        localObject1 = zzf();
      }
      return localObject1;
    }
    finally {}
  }
  
  public final void zzd(long paramLong, Object paramObject)
  {
    try
    {
      int i = this.zzd;
      if (i > 0)
      {
        int k = this.zzc;
        j = this.zzb.length;
        if (paramLong <= this.zza[((k + i - 1) % j)]) {
          zze();
        }
      }
      int j = this.zzb.length;
      if (this.zzd >= j)
      {
        i = j + j;
        localObject = new long[i];
        Object[] arrayOfObject = new Object[i];
        i = this.zzc;
        j -= i;
        System.arraycopy(this.zza, i, localObject, 0, j);
        System.arraycopy(this.zzb, this.zzc, arrayOfObject, 0, j);
        i = this.zzc;
        if (i > 0)
        {
          System.arraycopy(this.zza, 0, localObject, j, i);
          System.arraycopy(this.zzb, 0, arrayOfObject, j, this.zzc);
        }
        this.zza = ((long[])localObject);
        this.zzb = arrayOfObject;
        this.zzc = 0;
      }
      j = this.zzc;
      i = this.zzd;
      Object localObject = this.zzb;
      j = (j + i) % localObject.length;
      this.zza[j] = paramLong;
      localObject[j] = paramObject;
      this.zzd = (i + 1);
      return;
    }
    finally {}
  }
  
  public final void zze()
  {
    try
    {
      this.zzc = 0;
      this.zzd = 0;
      Arrays.fill(this.zzb, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */