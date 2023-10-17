package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkh
  extends zziw<Float>
  implements zzkp<Float>, zzmc, RandomAccess
{
  private static final zzkh zzrm;
  private int size;
  private float[] zzrn;
  
  static
  {
    zzkh localzzkh = new zzkh(new float[0], 0);
    zzrm = localzzkh;
    localzzkh.zzbp();
  }
  
  zzkh()
  {
    this(new float[10], 0);
  }
  
  private zzkh(float[] paramArrayOfFloat, int paramInt)
  {
    this.zzrn = paramArrayOfFloat;
    this.size = paramInt;
  }
  
  private final void zzc(int paramInt, float paramFloat)
  {
    zzbq();
    if (paramInt >= 0)
    {
      int i = this.size;
      if (paramInt <= i)
      {
        float[] arrayOfFloat2 = this.zzrn;
        if (i < arrayOfFloat2.length)
        {
          System.arraycopy(arrayOfFloat2, paramInt, arrayOfFloat2, paramInt + 1, i - paramInt);
        }
        else
        {
          float[] arrayOfFloat1 = new float[i * 3 / 2 + 1];
          System.arraycopy(arrayOfFloat2, 0, arrayOfFloat1, 0, paramInt);
          System.arraycopy(this.zzrn, paramInt, arrayOfFloat1, paramInt + 1, this.size - paramInt);
          this.zzrn = arrayOfFloat1;
        }
        this.zzrn[paramInt] = paramFloat;
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
  
  public final boolean addAll(Collection<? extends Float> paramCollection)
  {
    zzbq();
    zzkm.checkNotNull(paramCollection);
    if (!(paramCollection instanceof zzkh)) {
      return super.addAll(paramCollection);
    }
    zzkh localzzkh = (zzkh)paramCollection;
    int i = localzzkh.size;
    if (i == 0) {
      return false;
    }
    int j = this.size;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = this.zzrn;
      if (i > paramCollection.length) {
        this.zzrn = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(localzzkh.zzrn, 0, this.zzrn, this.size, localzzkh.size);
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
    if (!(paramObject instanceof zzkh)) {
      return super.equals(paramObject);
    }
    paramObject = (zzkh)paramObject;
    if (this.size != ((zzkh)paramObject).size) {
      return false;
    }
    paramObject = ((zzkh)paramObject).zzrn;
    for (int i = 0; i < this.size; i++) {
      if (Float.floatToIntBits(this.zzrn[i]) != Float.floatToIntBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.size; i++) {
      j = j * 31 + Float.floatToIntBits(this.zzrn[i]);
    }
    return j;
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbq();
    for (int i = 0; i < this.size; i++) {
      if (paramObject.equals(Float.valueOf(this.zzrn[i])))
      {
        paramObject = this.zzrn;
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
      float[] arrayOfFloat = this.zzrn;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, this.size - paramInt2);
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
  
  public final void zzc(float paramFloat)
  {
    zzc(this.size, paramFloat);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */