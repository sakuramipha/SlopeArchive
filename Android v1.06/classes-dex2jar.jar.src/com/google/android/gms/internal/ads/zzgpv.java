package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class zzgpv
  extends zzgmy
  implements RandomAccess, zzgpe, zzgqn
{
  private static final zzgpv zza = new zzgpv(new long[0], 0, false);
  private long[] zzb;
  private int zzc;
  
  zzgpv()
  {
    this(new long[10], 0, true);
  }
  
  private zzgpv(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    this.zzb = paramArrayOfLong;
    this.zzc = paramInt;
  }
  
  public static zzgpv zzf()
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
    zzbH();
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramCollection);
    if (!(paramCollection instanceof zzgpv)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzgpv)paramCollection;
    int i = paramCollection.zzc;
    if (i == 0) {
      return false;
    }
    int j = this.zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      localObject = this.zzb;
      if (i > localObject.length) {
        this.zzb = Arrays.copyOf((long[])localObject, i);
      }
      System.arraycopy(paramCollection.zzb, 0, this.zzb, this.zzc, paramCollection.zzc);
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
    if (!(paramObject instanceof zzgpv)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgpv)paramObject;
    if (this.zzc != ((zzgpv)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzgpv)paramObject).zzb;
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
    for (int i = 0; i < this.zzc; i++)
    {
      long l = this.zzb[i];
      byte[] arrayOfByte = zzgpg.zzd;
      j = j * 31 + (int)(l ^ l >>> 32);
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
    zzbH();
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
  
  public final zzgpe zza(int paramInt)
  {
    if (paramInt >= this.zzc) {
      return new zzgpv(Arrays.copyOf(this.zzb, paramInt), this.zzc, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final long zze(int paramInt)
  {
    zzi(paramInt);
    return this.zzb[paramInt];
  }
  
  public final void zzg(long paramLong)
  {
    zzbH();
    int i = this.zzc;
    long[] arrayOfLong1 = this.zzb;
    if (i == arrayOfLong1.length)
    {
      long[] arrayOfLong2 = new long[i * 3 / 2 + 1];
      System.arraycopy(arrayOfLong1, 0, arrayOfLong2, 0, i);
      this.zzb = arrayOfLong2;
    }
    arrayOfLong1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfLong1[i] = paramLong;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */