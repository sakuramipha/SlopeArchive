package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class zzgox
  extends zzgmy
  implements RandomAccess, zzgpb, zzgqn
{
  private static final zzgox zza = new zzgox(new int[0], 0, false);
  private int[] zzb;
  private int zzc;
  
  zzgox()
  {
    this(new int[10], 0, true);
  }
  
  private zzgox(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    this.zzb = paramArrayOfInt;
    this.zzc = paramInt;
  }
  
  public static zzgox zzf()
  {
    return zza;
  }
  
  private final String zzi(int paramInt)
  {
    int i = this.zzc;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  private final void zzj(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzi(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zzbH();
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramCollection);
    if (!(paramCollection instanceof zzgox)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzgox)paramCollection;
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
        this.zzb = Arrays.copyOf((int[])localObject, i);
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
    if (!(paramObject instanceof zzgox)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgox)paramObject;
    if (this.zzc != ((zzgox)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzgox)paramObject).zzb;
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
      j = j * 31 + this.zzb[i];
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    int k = ((Integer)paramObject).intValue();
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
    zzbH();
    if (paramInt2 >= paramInt1)
    {
      int[] arrayOfInt = this.zzb;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.zzc - paramInt2);
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
  
  public final int zze(int paramInt)
  {
    zzj(paramInt);
    return this.zzb[paramInt];
  }
  
  public final zzgpb zzg(int paramInt)
  {
    if (paramInt >= this.zzc) {
      return new zzgox(Arrays.copyOf(this.zzb, paramInt), this.zzc, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzh(int paramInt)
  {
    zzbH();
    int i = this.zzc;
    int[] arrayOfInt1 = this.zzb;
    if (i == arrayOfInt1.length)
    {
      int[] arrayOfInt2 = new int[i * 3 / 2 + 1];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      this.zzb = arrayOfInt2;
    }
    arrayOfInt1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfInt1[i] = paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */