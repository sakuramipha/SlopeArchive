package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zziq
  extends zzim
  implements RandomAccess, zzkj, zzlq
{
  private static final zziq zza;
  private boolean[] zzb;
  private int zzc;
  
  static
  {
    zziq localzziq = new zziq(new boolean[0], 0);
    zza = localzziq;
    localzziq.zzb();
  }
  
  zziq()
  {
    this(new boolean[10], 0);
  }
  
  private zziq(boolean[] paramArrayOfBoolean, int paramInt)
  {
    this.zzb = paramArrayOfBoolean;
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
    if (!(paramCollection instanceof zziq)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zziq)paramCollection;
    int i = paramCollection.zzc;
    if (i == 0) {
      return false;
    }
    int j = this.zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      boolean[] arrayOfBoolean = this.zzb;
      if (i > arrayOfBoolean.length) {
        this.zzb = Arrays.copyOf(arrayOfBoolean, i);
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
    if (!(paramObject instanceof zziq)) {
      return super.equals(paramObject);
    }
    paramObject = (zziq)paramObject;
    if (this.zzc != ((zziq)paramObject).zzc) {
      return false;
    }
    paramObject = ((zziq)paramObject).zzb;
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
      j = j * 31 + zzkk.zza(this.zzb[i]);
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Boolean)) {
      return -1;
    }
    int k = ((Boolean)paramObject).booleanValue();
    int j = this.zzc;
    for (int i = 0; i < j; i++) {
      if (this.zzb[i] == k) {
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
      boolean[] arrayOfBoolean = this.zzb;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, this.zzc - paramInt2);
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
  
  public final void zze(boolean paramBoolean)
  {
    zzbS();
    int i = this.zzc;
    boolean[] arrayOfBoolean2 = this.zzb;
    if (i == arrayOfBoolean2.length)
    {
      arrayOfBoolean1 = new boolean[i * 3 / 2 + 1];
      System.arraycopy(arrayOfBoolean2, 0, arrayOfBoolean1, 0, i);
      this.zzb = arrayOfBoolean1;
    }
    boolean[] arrayOfBoolean1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfBoolean1[i] = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zziq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */