package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaac
  implements zzabn
{
  public final int zza;
  public final int[] zzb;
  public final long[] zzc;
  public final long[] zzd;
  public final long[] zze;
  private final long zzf;
  
  public zzaac(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    this.zzb = paramArrayOfInt;
    this.zzc = paramArrayOfLong1;
    this.zzd = paramArrayOfLong2;
    this.zze = paramArrayOfLong3;
    int i = paramArrayOfInt.length;
    this.zza = i;
    if (i > 0)
    {
      i--;
      this.zzf = (paramArrayOfLong2[i] + paramArrayOfLong3[i]);
      return;
    }
    this.zzf = 0L;
  }
  
  public final String toString()
  {
    int i = this.zza;
    String str3 = Arrays.toString(this.zzb);
    String str2 = Arrays.toString(this.zzc);
    String str4 = Arrays.toString(this.zze);
    String str1 = Arrays.toString(this.zzd);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ChunkIndex(length=");
    localStringBuilder.append(i);
    localStringBuilder.append(", sizes=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", offsets=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", timeUs=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", durationsUs=");
    localStringBuilder.append(str1);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final long zze()
  {
    return this.zzf;
  }
  
  public final zzabl zzg(long paramLong)
  {
    int i = zzfn.zzc(this.zze, paramLong, true, true);
    zzabo localzzabo = new zzabo(this.zze[i], this.zzc[i]);
    if ((localzzabo.zzb < paramLong) && (i != this.zza - 1))
    {
      long[] arrayOfLong = this.zze;
      i++;
      return new zzabl(localzzabo, new zzabo(arrayOfLong[i], this.zzc[i]));
    }
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */