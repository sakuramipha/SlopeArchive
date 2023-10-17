package com.google.android.gms.internal.ads;

public final class zzabg
  implements zzabn
{
  private final long[] zza;
  private final long[] zzb;
  private final long zzc;
  private final boolean zzd;
  
  public zzabg(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    int j = paramArrayOfLong1.length;
    int i = paramArrayOfLong2.length;
    boolean bool;
    if (j == i) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzd = bool;
    if ((bool) && (paramArrayOfLong2[0] > 0L))
    {
      j = i + 1;
      long[] arrayOfLong1 = new long[j];
      this.zza = arrayOfLong1;
      long[] arrayOfLong2 = new long[j];
      this.zzb = arrayOfLong2;
      System.arraycopy(paramArrayOfLong1, 0, arrayOfLong1, 1, i);
      System.arraycopy(paramArrayOfLong2, 0, arrayOfLong2, 1, i);
    }
    else
    {
      this.zza = paramArrayOfLong1;
      this.zzb = paramArrayOfLong2;
    }
    this.zzc = paramLong;
  }
  
  public final long zze()
  {
    return this.zzc;
  }
  
  public final zzabl zzg(long paramLong)
  {
    Object localObject;
    if (!this.zzd)
    {
      localObject = zzabo.zza;
      return new zzabl((zzabo)localObject, (zzabo)localObject);
    }
    int i = zzfn.zzc(this.zzb, paramLong, true, true);
    zzabo localzzabo = new zzabo(this.zzb[i], this.zza[i]);
    if (localzzabo.zzb != paramLong)
    {
      localObject = this.zzb;
      if (i != localObject.length - 1)
      {
        i++;
        return new zzabl(localzzabo, new zzabo(localObject[i], this.zza[i]));
      }
    }
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final boolean zzh()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */