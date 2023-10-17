package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class zzgof
  extends zzgmy
  implements RandomAccess, zzgpf, zzgqn
{
  private static final zzgof zza = new zzgof(new double[0], 0, false);
  private double[] zzb;
  private int zzc;
  
  zzgof()
  {
    this(new double[10], 0, true);
  }
  
  private zzgof(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
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
    zzbH();
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramCollection);
    if (!(paramCollection instanceof zzgof)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzgof)paramCollection;
    int j = paramCollection.zzc;
    if (j == 0) {
      return false;
    }
    int i = this.zzc;
    if (Integer.MAX_VALUE - i >= j)
    {
      i += j;
      localObject = this.zzb;
      if (i > localObject.length) {
        this.zzb = Arrays.copyOf((double[])localObject, i);
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
    if (!(paramObject instanceof zzgof)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgof)paramObject;
    if (this.zzc != ((zzgof)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzgof)paramObject).zzb;
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
    for (int i = 0; i < this.zzc; i++)
    {
      long l = Double.doubleToLongBits(this.zzb[i]);
      byte[] arrayOfByte = zzgpg.zzd;
      j = j * 31 + (int)(l ^ l >>> 32);
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
    zzbH();
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
    zzbH();
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */