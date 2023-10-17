package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkd
  extends zzim
  implements RandomAccess, zzkh, zzlq
{
  private static final zzkd zza;
  private int[] zzb;
  private int zzc;
  
  static
  {
    zzkd localzzkd = new zzkd(new int[0], 0);
    zza = localzzkd;
    localzzkd.zzb();
  }
  
  zzkd()
  {
    this(new int[10], 0);
  }
  
  private zzkd(int[] paramArrayOfInt, int paramInt)
  {
    this.zzb = paramArrayOfInt;
    this.zzc = paramInt;
  }
  
  public static zzkd zzf()
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
    zzbS();
    zzkk.zze(paramCollection);
    if (!(paramCollection instanceof zzkd)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzkd)paramCollection;
    int i = paramCollection.zzc;
    if (i == 0) {
      return false;
    }
    int j = this.zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      int[] arrayOfInt = this.zzb;
      if (i > arrayOfInt.length) {
        this.zzb = Arrays.copyOf(arrayOfInt, i);
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
    if (!(paramObject instanceof zzkd)) {
      return super.equals(paramObject);
    }
    paramObject = (zzkd)paramObject;
    if (this.zzc != ((zzkd)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzkd)paramObject).zzb;
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
    int j = ((Integer)paramObject).intValue();
    int k = this.zzc;
    for (int i = 0; i < k; i++) {
      if (this.zzb[i] == j) {
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
  
  public final zzkh zzg(int paramInt)
  {
    if (paramInt >= this.zzc) {
      return new zzkd(Arrays.copyOf(this.zzb, paramInt), this.zzc);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzh(int paramInt)
  {
    zzbS();
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */