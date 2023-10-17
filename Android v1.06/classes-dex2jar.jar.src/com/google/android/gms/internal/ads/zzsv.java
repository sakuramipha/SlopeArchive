package com.google.android.gms.internal.ads;

public final class zzsv
  implements zzve
{
  protected final zzve[] zza;
  
  public zzsv(zzve[] paramArrayOfzzve)
  {
    this.zza = paramArrayOfzzve;
  }
  
  public final long zzb()
  {
    zzve[] arrayOfzzve = this.zza;
    int j = arrayOfzzve.length;
    int i = 0;
    long l2;
    for (long l1 = Long.MAX_VALUE; i < j; l1 = l2)
    {
      long l3 = arrayOfzzve[i].zzb();
      l2 = l1;
      if (l3 != Long.MIN_VALUE) {
        l2 = Math.min(l1, l3);
      }
      i++;
    }
    if (l1 == Long.MAX_VALUE) {
      return Long.MIN_VALUE;
    }
    return l1;
  }
  
  public final long zzc()
  {
    zzve[] arrayOfzzve = this.zza;
    int j = arrayOfzzve.length;
    int i = 0;
    long l2;
    for (long l1 = Long.MAX_VALUE; i < j; l1 = l2)
    {
      long l3 = arrayOfzzve[i].zzc();
      l2 = l1;
      if (l3 != Long.MIN_VALUE) {
        l2 = Math.min(l1, l3);
      }
      i++;
    }
    if (l1 == Long.MAX_VALUE) {
      return Long.MIN_VALUE;
    }
    return l1;
  }
  
  public final void zzm(long paramLong)
  {
    zzve[] arrayOfzzve = this.zza;
    int j = arrayOfzzve.length;
    for (int i = 0; i < j; i++) {
      arrayOfzzve[i].zzm(paramLong);
    }
  }
  
  public final boolean zzo(long paramLong)
  {
    boolean bool3 = false;
    boolean bool1;
    boolean bool4;
    do
    {
      long l2 = zzc();
      if (l2 == Long.MIN_VALUE) {
        break;
      }
      zzve[] arrayOfzzve = this.zza;
      int k = arrayOfzzve.length;
      int i = 0;
      boolean bool2;
      for (bool1 = false; i < k; bool1 = bool2)
      {
        zzve localzzve = arrayOfzzve[i];
        long l1 = localzzve.zzc();
        int j;
        if ((l1 != Long.MIN_VALUE) && (l1 <= paramLong)) {
          j = 1;
        } else {
          j = 0;
        }
        if (l1 != l2)
        {
          bool2 = bool1;
          if (j == 0) {}
        }
        else
        {
          bool2 = bool1 | localzzve.zzo(paramLong);
        }
        i++;
      }
      bool4 = bool3 | bool1;
      bool3 = bool4;
    } while (bool1);
    bool3 = bool4;
    return bool3;
  }
  
  public final boolean zzp()
  {
    zzve[] arrayOfzzve = this.zza;
    int j = arrayOfzzve.length;
    for (int i = 0; i < j; i++) {
      if (arrayOfzzve[i].zzp()) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzsv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */