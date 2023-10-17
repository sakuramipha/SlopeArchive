package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class zzgop
  extends zzgmy
  implements RandomAccess, zzgpf, zzgqn
{
  private static final zzgop zza = new zzgop(new float[0], 0, false);
  private float[] zzb;
  private int zzc;
  
  zzgop()
  {
    this(new float[10], 0, true);
  }
  
  private zzgop(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    this.zzb = paramArrayOfFloat;
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
    if (!(paramCollection instanceof zzgop)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzgop)paramCollection;
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
        this.zzb = Arrays.copyOf((float[])localObject, i);
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
    if (!(paramObject instanceof zzgop)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgop)paramObject;
    if (this.zzc != ((zzgop)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzgop)paramObject).zzb;
    for (int i = 0; i < this.zzc; i++) {
      if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int j = 1;
    for (int i = 0; i < this.zzc; i++) {
      j = j * 31 + Float.floatToIntBits(this.zzb[i]);
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Float)) {
      return -1;
    }
    float f = ((Float)paramObject).floatValue();
    int j = this.zzc;
    for (int i = 0; i < j; i++) {
      if (this.zzb[i] == f) {
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
      float[] arrayOfFloat = this.zzb;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, this.zzc - paramInt2);
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
  
  public final void zze(float paramFloat)
  {
    zzbH();
    int i = this.zzc;
    float[] arrayOfFloat2 = this.zzb;
    if (i == arrayOfFloat2.length)
    {
      arrayOfFloat1 = new float[i * 3 / 2 + 1];
      System.arraycopy(arrayOfFloat2, 0, arrayOfFloat1, 0, i);
      this.zzb = arrayOfFloat1;
    }
    float[] arrayOfFloat1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfFloat1[i] = paramFloat;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */