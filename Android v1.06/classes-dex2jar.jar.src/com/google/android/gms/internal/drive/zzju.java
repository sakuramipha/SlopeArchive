package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzju
  extends zziw<Double>
  implements zzkp<Double>, zzmc, RandomAccess
{
  private static final zzju zzoi;
  private int size;
  private double[] zzoj;
  
  static
  {
    zzju localzzju = new zzju(new double[0], 0);
    zzoi = localzzju;
    localzzju.zzbp();
  }
  
  zzju()
  {
    this(new double[10], 0);
  }
  
  private zzju(double[] paramArrayOfDouble, int paramInt)
  {
    this.zzoj = paramArrayOfDouble;
    this.size = paramInt;
  }
  
  private final void zzc(int paramInt, double paramDouble)
  {
    zzbq();
    if (paramInt >= 0)
    {
      int i = this.size;
      if (paramInt <= i)
      {
        double[] arrayOfDouble1 = this.zzoj;
        if (i < arrayOfDouble1.length)
        {
          System.arraycopy(arrayOfDouble1, paramInt, arrayOfDouble1, paramInt + 1, i - paramInt);
        }
        else
        {
          double[] arrayOfDouble2 = new double[i * 3 / 2 + 1];
          System.arraycopy(arrayOfDouble1, 0, arrayOfDouble2, 0, paramInt);
          System.arraycopy(this.zzoj, paramInt, arrayOfDouble2, paramInt + 1, this.size - paramInt);
          this.zzoj = arrayOfDouble2;
        }
        this.zzoj[paramInt] = paramDouble;
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
  
  public final boolean addAll(Collection<? extends Double> paramCollection)
  {
    zzbq();
    zzkm.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzju)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzju)paramCollection;
    int i = paramCollection.size;
    if (i == 0) {
      return false;
    }
    int j = this.size;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      double[] arrayOfDouble = this.zzoj;
      if (i > arrayOfDouble.length) {
        this.zzoj = Arrays.copyOf(arrayOfDouble, i);
      }
      System.arraycopy(paramCollection.zzoj, 0, this.zzoj, this.size, paramCollection.size);
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
    if (!(paramObject instanceof zzju)) {
      return super.equals(paramObject);
    }
    paramObject = (zzju)paramObject;
    if (this.size != ((zzju)paramObject).size) {
      return false;
    }
    paramObject = ((zzju)paramObject).zzoj;
    for (int i = 0; i < this.size; i++) {
      if (Double.doubleToLongBits(this.zzoj[i]) != Double.doubleToLongBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.size; i++) {
      j = j * 31 + zzkm.zzu(Double.doubleToLongBits(this.zzoj[i]));
    }
    return j;
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbq();
    for (int i = 0; i < this.size; i++) {
      if (paramObject.equals(Double.valueOf(this.zzoj[i])))
      {
        paramObject = this.zzoj;
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
      double[] arrayOfDouble = this.zzoj;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, this.size - paramInt2);
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
  
  public final void zzc(double paramDouble)
  {
    zzc(this.size, paramDouble);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */