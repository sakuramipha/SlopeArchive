package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzes
{
  private int zza;
  private long[] zzb = new long[32];
  
  public zzes()
  {
    this(32);
  }
  
  public zzes(int paramInt) {}
  
  public final int zza()
  {
    return this.zza;
  }
  
  public final long zzb(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zza)) {
      return this.zzb[paramInt];
    }
    int i = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", size is ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final void zzc(long paramLong)
  {
    int i = this.zza;
    long[] arrayOfLong = this.zzb;
    if (i == arrayOfLong.length) {
      this.zzb = Arrays.copyOf(arrayOfLong, i + i);
    }
    arrayOfLong = this.zzb;
    i = this.zza;
    this.zza = (i + 1);
    arrayOfLong[i] = paramLong;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */