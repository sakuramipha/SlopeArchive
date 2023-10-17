package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzja
  extends zziw<Boolean>
  implements zzkp<Boolean>, zzmc, RandomAccess
{
  private static final zzja zzno;
  private int size;
  private boolean[] zznp;
  
  static
  {
    zzja localzzja = new zzja(new boolean[0], 0);
    zzno = localzzja;
    localzzja.zzbp();
  }
  
  zzja()
  {
    this(new boolean[10], 0);
  }
  
  private zzja(boolean[] paramArrayOfBoolean, int paramInt)
  {
    this.zznp = paramArrayOfBoolean;
    this.size = paramInt;
  }
  
  private final void zza(int paramInt, boolean paramBoolean)
  {
    zzbq();
    if (paramInt >= 0)
    {
      int i = this.size;
      if (paramInt <= i)
      {
        boolean[] arrayOfBoolean2 = this.zznp;
        if (i < arrayOfBoolean2.length)
        {
          System.arraycopy(arrayOfBoolean2, paramInt, arrayOfBoolean2, paramInt + 1, i - paramInt);
        }
        else
        {
          boolean[] arrayOfBoolean1 = new boolean[i * 3 / 2 + 1];
          System.arraycopy(arrayOfBoolean2, 0, arrayOfBoolean1, 0, paramInt);
          System.arraycopy(this.zznp, paramInt, arrayOfBoolean1, paramInt + 1, this.size - paramInt);
          this.zznp = arrayOfBoolean1;
        }
        this.zznp[paramInt] = paramBoolean;
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
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection)
  {
    zzbq();
    zzkm.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzja)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzja)paramCollection;
    int j = paramCollection.size;
    if (j == 0) {
      return false;
    }
    int i = this.size;
    if (Integer.MAX_VALUE - i >= j)
    {
      i += j;
      boolean[] arrayOfBoolean = this.zznp;
      if (i > arrayOfBoolean.length) {
        this.zznp = Arrays.copyOf(arrayOfBoolean, i);
      }
      System.arraycopy(paramCollection.zznp, 0, this.zznp, this.size, paramCollection.size);
      this.size = i;
      this.modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final void addBoolean(boolean paramBoolean)
  {
    zza(this.size, paramBoolean);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzja)) {
      return super.equals(paramObject);
    }
    paramObject = (zzja)paramObject;
    if (this.size != ((zzja)paramObject).size) {
      return false;
    }
    paramObject = ((zzja)paramObject).zznp;
    for (int i = 0; i < this.size; i++) {
      if (this.zznp[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.size; i++) {
      j = j * 31 + zzkm.zze(this.zznp[i]);
    }
    return j;
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbq();
    for (int i = 0; i < this.size; i++) {
      if (paramObject.equals(Boolean.valueOf(this.zznp[i])))
      {
        paramObject = this.zznp;
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
      boolean[] arrayOfBoolean = this.zznp;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, this.size - paramInt2);
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
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */