package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkl
  extends zziw<Integer>
  implements zzkp<Integer>, zzmc, RandomAccess
{
  private static final zzkl zzsl;
  private int size;
  private int[] zzsm;
  
  static
  {
    zzkl localzzkl = new zzkl(new int[0], 0);
    zzsl = localzzkl;
    localzzkl.zzbp();
  }
  
  zzkl()
  {
    this(new int[10], 0);
  }
  
  private zzkl(int[] paramArrayOfInt, int paramInt)
  {
    this.zzsm = paramArrayOfInt;
    this.size = paramInt;
  }
  
  private final void zzo(int paramInt1, int paramInt2)
  {
    zzbq();
    if (paramInt1 >= 0)
    {
      int i = this.size;
      if (paramInt1 <= i)
      {
        int[] arrayOfInt2 = this.zzsm;
        if (i < arrayOfInt2.length)
        {
          System.arraycopy(arrayOfInt2, paramInt1, arrayOfInt2, paramInt1 + 1, i - paramInt1);
        }
        else
        {
          int[] arrayOfInt1 = new int[i * 3 / 2 + 1];
          System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, paramInt1);
          System.arraycopy(this.zzsm, paramInt1, arrayOfInt1, paramInt1 + 1, this.size - paramInt1);
          this.zzsm = arrayOfInt1;
        }
        this.zzsm[paramInt1] = paramInt2;
        this.size += 1;
        this.modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzq(paramInt1));
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
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    zzbq();
    zzkm.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzkl)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzkl)paramCollection;
    int j = paramCollection.size;
    if (j == 0) {
      return false;
    }
    int i = this.size;
    if (Integer.MAX_VALUE - i >= j)
    {
      i += j;
      int[] arrayOfInt = this.zzsm;
      if (i > arrayOfInt.length) {
        this.zzsm = Arrays.copyOf(arrayOfInt, i);
      }
      System.arraycopy(paramCollection.zzsm, 0, this.zzsm, this.size, paramCollection.size);
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
    if (!(paramObject instanceof zzkl)) {
      return super.equals(paramObject);
    }
    paramObject = (zzkl)paramObject;
    if (this.size != ((zzkl)paramObject).size) {
      return false;
    }
    paramObject = ((zzkl)paramObject).zzsm;
    for (int i = 0; i < this.size; i++) {
      if (this.zzsm[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int getInt(int paramInt)
  {
    zzp(paramInt);
    return this.zzsm[paramInt];
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.size; i++) {
      j = j * 31 + this.zzsm[i];
    }
    return j;
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbq();
    for (int i = 0; i < this.size; i++) {
      if (paramObject.equals(Integer.valueOf(this.zzsm[i])))
      {
        paramObject = this.zzsm;
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
      int[] arrayOfInt = this.zzsm;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.size - paramInt2);
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
  
  public final void zzam(int paramInt)
  {
    zzo(this.size, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */