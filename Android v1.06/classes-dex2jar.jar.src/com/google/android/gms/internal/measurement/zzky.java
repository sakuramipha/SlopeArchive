package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzky
  extends zzim
  implements RandomAccess, zzki, zzlq
{
  private static final zzky zza;
  private long[] zzb;
  private int zzc;
  
  static
  {
    zzky localzzky = new zzky(new long[0], 0);
    zza = localzzky;
    localzzky.zzb();
  }
  
  zzky()
  {
    this(new long[10], 0);
  }
  
  private zzky(long[] paramArrayOfLong, int paramInt)
  {
    this.zzb = paramArrayOfLong;
    this.zzc = paramInt;
  }
  
  public static zzky zzf()
  {
    return zza;
  }
  
  private final String zzh(int paramInt)
  {
    int i = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  private final void zzi(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzh(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zzbS();
    zzkk.zze(paramCollection);
    if (!(paramCollection instanceof zzky)) {
      return super.addAll(paramCollection);
    }
    zzky localzzky = (zzky)paramCollection;
    int j = localzzky.zzc;
    if (j == 0) {
      return false;
    }
    int i = this.zzc;
    if (Integer.MAX_VALUE - i >= j)
    {
      i += j;
      paramCollection = this.zzb;
      if (i > paramCollection.length) {
        this.zzb = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(localzzky.zzb, 0, this.zzb, this.zzc, localzzky.zzc);
      this.zzc = i;
      this.modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject)
  {
    return indexOf(paramObject) != -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzky)) {
      return super.equals(paramObject);
    }
    paramObject = (zzky)paramObject;
    if (this.zzc != ((zzky)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzky)paramObject).zzb;
    for (int i = 0; i < this.zzc; i++) {
      if (this.zzb[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.zzc; i++) {
      j = j * 31 + zzkk.zzc(this.zzb[i]);
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Long)) {
      return -1;
    }
    long l = ((Long)paramObject).longValue();
    int j = this.zzc;
    for (int i = 0; i < j; i++) {
      if (this.zzb[i] == l) {
        return i;
      }
    }
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2)
  {
    zzbS();
    if (paramInt2 >= paramInt1)
    {
      long[] arrayOfLong = this.zzb;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, this.zzc - paramInt2);
      this.zzc -= paramInt2 - paramInt1;
      this.modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return this.zzc;
  }
  
  public final long zza(int paramInt)
  {
    zzi(paramInt);
    return this.zzb[paramInt];
  }
  
  public final zzki zze(int paramInt)
  {
    if (paramInt >= this.zzc) {
      return new zzky(Arrays.copyOf(this.zzb, paramInt), this.zzc);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzg(long paramLong)
  {
    zzbS();
    int i = this.zzc;
    long[] arrayOfLong2 = this.zzb;
    if (i == arrayOfLong2.length)
    {
      arrayOfLong1 = new long[i * 3 / 2 + 1];
      System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, i);
      this.zzb = arrayOfLong1;
    }
    long[] arrayOfLong1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfLong1[i] = paramLong;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */