package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

final class zzgnc
  extends zzgmy
  implements RandomAccess, zzgpf, zzgqn
{
  private static final zzgnc zza = new zzgnc(new boolean[0], 0, false);
  private boolean[] zzb;
  private int zzc;
  
  zzgnc()
  {
    this(new boolean[10], 0, true);
  }
  
  private zzgnc(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
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
    zzbH();
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramCollection);
    if (!(paramCollection instanceof zzgnc)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzgnc)paramCollection;
    int i = ((zzgnc)localObject).zzc;
    if (i == 0) {
      return false;
    }
    int j = this.zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = this.zzb;
      if (i > paramCollection.length) {
        this.zzb = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(((zzgnc)localObject).zzb, 0, this.zzb, this.zzc, ((zzgnc)localObject).zzc);
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
    if (!(paramObject instanceof zzgnc)) {
      return super.equals(paramObject);
    }
    paramObject = (zzgnc)paramObject;
    if (this.zzc != ((zzgnc)paramObject).zzc) {
      return false;
    }
    paramObject = ((zzgnc)paramObject).zzb;
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
      j = j * 31 + zzgpg.zza(this.zzb[i]);
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
    zzbH();
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
    zzbH();
    int i = this.zzc;
    boolean[] arrayOfBoolean1 = this.zzb;
    if (i == arrayOfBoolean1.length)
    {
      boolean[] arrayOfBoolean2 = new boolean[i * 3 / 2 + 1];
      System.arraycopy(arrayOfBoolean1, 0, arrayOfBoolean2, 0, i);
      this.zzb = arrayOfBoolean2;
    }
    arrayOfBoolean1 = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfBoolean1[i] = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */