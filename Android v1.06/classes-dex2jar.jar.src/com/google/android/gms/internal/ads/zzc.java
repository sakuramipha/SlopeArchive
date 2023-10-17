package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class zzc
{
  public static final zzn zza = zzb.zza;
  private static final String zzi = Integer.toString(0, 36);
  private static final String zzj = Integer.toString(1, 36);
  private static final String zzk = Integer.toString(2, 36);
  private static final String zzl = Integer.toString(3, 36);
  private static final String zzm = Integer.toString(4, 36);
  private static final String zzn = Integer.toString(5, 36);
  private static final String zzo = Integer.toString(6, 36);
  private static final String zzp = Integer.toString(7, 36);
  public final long zzb;
  public final int zzc;
  public final Uri[] zzd;
  public final int[] zze;
  public final long[] zzf;
  public final long zzg;
  public final boolean zzh;
  
  public zzc(long paramLong)
  {
    this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
  }
  
  private zzc(long paramLong1, int paramInt1, int paramInt2, int[] paramArrayOfInt, Uri[] paramArrayOfUri, long[] paramArrayOfLong, long paramLong2, boolean paramBoolean)
  {
    if (paramArrayOfInt.length == paramArrayOfUri.length) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    zzdy.zzd(paramBoolean);
    this.zzb = 0L;
    this.zzc = paramInt1;
    this.zze = paramArrayOfInt;
    this.zzd = paramArrayOfUri;
    this.zzf = paramArrayOfLong;
    this.zzg = 0L;
    this.zzh = false;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzc)paramObject;
      if ((this.zzc == ((zzc)paramObject).zzc) && (Arrays.equals(this.zzd, ((zzc)paramObject).zzd)) && (Arrays.equals(this.zze, ((zzc)paramObject).zze)) && (Arrays.equals(this.zzf, ((zzc)paramObject).zzf))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((this.zzc * 31 - 1) * 961 + Arrays.hashCode(this.zzd)) * 31 + Arrays.hashCode(this.zze)) * 31 + Arrays.hashCode(this.zzf)) * 961;
  }
  
  public final int zza(int paramInt)
  {
    
    for (;;)
    {
      int[] arrayOfInt = this.zze;
      if (paramInt >= arrayOfInt.length) {
        break;
      }
      int i = arrayOfInt[paramInt];
      if ((i == 0) || (i == 1)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public final zzc zzb(int paramInt)
  {
    int[] arrayOfInt = this.zze;
    int i = arrayOfInt.length;
    paramInt = Math.max(0, i);
    arrayOfInt = Arrays.copyOf(arrayOfInt, paramInt);
    Arrays.fill(arrayOfInt, i, paramInt, 0);
    long[] arrayOfLong = this.zzf;
    paramInt = arrayOfLong.length;
    i = Math.max(0, paramInt);
    arrayOfLong = Arrays.copyOf(arrayOfLong, i);
    Arrays.fill(arrayOfLong, paramInt, i, -9223372036854775807L);
    return new zzc(0L, 0, -1, arrayOfInt, (Uri[])Arrays.copyOf(this.zzd, 0), arrayOfLong, 0L, false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */