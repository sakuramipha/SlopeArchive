package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjl
  extends zzim
  implements RandomAccess, zzkj, zzlq
{
  private static final zzjl zza;
  private double[] zzb;
  private int zzc;
  
  static
  {
    zzjl localzzjl = new zzjl(new double[0], 0);
    zza = localzzjl;
    localzzjl.zzb();
  }
  
  zzjl()
  {
    this(new double[10], 0);
  }
  
  private zzjl(double[] paramArrayOfDouble, int paramInt)
  {
    this.zzb = paramArrayOfDouble;
    this.zzc = paramInt;
  }
  
  private final String zzf(int paramInt)
  {
    int i = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  private final void zzg(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zzbS();
    zzkk.zze(paramCollection);
    if (!(paramCollection instanceof zzjl)) {
      return super.addAll(paramCollection);
    }
    zzjl localzzjl = (zzjl)paramCollection;
    int j = localzzjl.zzc;
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
      System.arraycopy(localzzjl.zzb, 0, this.zzb, this.zzc, localzzjl.zzc);
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
    if (!(paramObject instanceof zzjl)) {
      return super.equals(paramObject);
    }
    paramObject = (zzjl)paramObject;
    if (this.zzc != ((zzjl)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzjl)paramObject).zzb;
    for (int i = 0; i < this.zzc; i++) {
      if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.zzc; i++) {
      j = j * 31 + zzkk.zzc(Double.doubleToLongBits(this.zzb[i]));
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Double)) {
      return -1;
    }
    double d = ((Double)paramObject).doubleValue();
    int j = this.zzc;
    for (int i = 0; i < j; i++) {
      if (this.zzb[i] == d) {
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
      double[] arrayOfDouble = this.zzb;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, this.zzc - paramInt2);
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
  
  public final void zze(double paramDouble)
  {
    zzbS();
    int i = this.zzc;
    double[] arrayOfDouble1 = this.zzb;
    if (i == arrayOfDouble1.length)
    {
      double[] arrayOfDouble2 = new double[i * 3 / 2 + 1];
      System.arraycopy(arrayOfDouble1, 0, arrayOfDouble2, 0, i);
      this.zzb = arrayOfDouble2;
    }
    arrayOfDouble1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfDouble1[i] = paramDouble;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */