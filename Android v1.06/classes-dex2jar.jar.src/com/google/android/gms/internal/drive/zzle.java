package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzle
  extends zziw<Long>
  implements zzkp<Long>, zzmc, RandomAccess
{
  private static final zzle zztp;
  private int size;
  private long[] zztq;
  
  static
  {
    zzle localzzle = new zzle(new long[0], 0);
    zztp = localzzle;
    localzzle.zzbp();
  }
  
  zzle()
  {
    this(new long[10], 0);
  }
  
  private zzle(long[] paramArrayOfLong, int paramInt)
  {
    this.zztq = paramArrayOfLong;
    this.size = paramInt;
  }
  
  private final void zzk(int paramInt, long paramLong)
  {
    zzbq();
    if (paramInt >= 0)
    {
      int i = this.size;
      if (paramInt <= i)
      {
        long[] arrayOfLong1 = this.zztq;
        if (i < arrayOfLong1.length)
        {
          System.arraycopy(arrayOfLong1, paramInt, arrayOfLong1, paramInt + 1, i - paramInt);
        }
        else
        {
          long[] arrayOfLong2 = new long[i * 3 / 2 + 1];
          System.arraycopy(arrayOfLong1, 0, arrayOfLong2, 0, paramInt);
          System.arraycopy(this.zztq, paramInt, arrayOfLong2, paramInt + 1, this.size - paramInt);
          this.zztq = arrayOfLong2;
        }
        this.zztq[paramInt] = paramLong;
        this.size += 1;
        this.modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzq(paramInt));
  }
  
  private final void zzp(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.size)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzq(paramInt));
  }
  
  private final String zzq(int paramInt)
  {
    int i = this.size;
    StringBuilder localStringBuilder = new StringBuilder(35);
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection)
  {
    zzbq();
    zzkm.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzle)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzle)paramCollection;
    int j = paramCollection.size;
    if (j == 0) {
      return false;
    }
    int i = this.size;
    if (Integer.MAX_VALUE - i >= j)
    {
      i += j;
      long[] arrayOfLong = this.zztq;
      if (i > arrayOfLong.length) {
        this.zztq = Arrays.copyOf(arrayOfLong, i);
      }
      System.arraycopy(paramCollection.zztq, 0, this.zztq, this.size, paramCollection.size);
      this.size = i;
      this.modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzle)) {
      return super.equals(paramObject);
    }
    paramObject = (zzle)paramObject;
    if (this.size != ((zzle)paramObject).size) {
      return false;
    }
    paramObject = ((zzle)paramObject).zztq;
    for (int i = 0; i < this.size; i++) {
      if (this.zztq[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final long getLong(int paramInt)
  {
    zzp(paramInt);
    return this.zztq[paramInt];
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.size; i++) {
      j = j * 31 + zzkm.zzu(this.zztq[i]);
    }
    return j;
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbq();
    for (int i = 0; i < this.size; i++) {
      if (paramObject.equals(Long.valueOf(this.zztq[i])))
      {
        paramObject = this.zztq;
        System.arraycopy(paramObject, i + 1, paramObject, i, this.size - i - 1);
        this.size -= 1;
        this.modCount += 1;
        return true;
      }
    }
    return false;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2)
  {
    zzbq();
    if (paramInt2 >= paramInt1)
    {
      long[] arrayOfLong = this.zztq;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, this.size - paramInt2);
      this.size -= paramInt2 - paramInt1;
      this.modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return this.size;
  }
  
  public final void zzv(long paramLong)
  {
    zzk(this.size, paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */