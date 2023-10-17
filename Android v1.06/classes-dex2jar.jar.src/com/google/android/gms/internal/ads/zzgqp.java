package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

final class zzgqp
  extends zzgmy
  implements RandomAccess
{
  private static final zzgqp zza = new zzgqp(new Object[0], 0, false);
  private Object[] zzb;
  private int zzc;
  
  zzgqp()
  {
    this(new Object[10], 0, true);
  }
  
  private zzgqp(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    this.zzb = paramArrayOfObject;
    this.zzc = paramInt;
  }
  
  public static zzgqp zze()
  {
    return zza;
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
  
  public final void add(int paramInt, Object paramObject)
  {
    zzbH();
    if (paramInt >= 0)
    {
      int i = this.zzc;
      if (paramInt <= i)
      {
        Object[] arrayOfObject2 = this.zzb;
        if (i < arrayOfObject2.length)
        {
          System.arraycopy(arrayOfObject2, paramInt, arrayOfObject2, paramInt + 1, i - paramInt);
        }
        else
        {
          Object[] arrayOfObject1 = new Object[i * 3 / 2 + 1];
          System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, paramInt);
          System.arraycopy(this.zzb, paramInt, arrayOfObject1, paramInt + 1, this.zzc - paramInt);
          this.zzb = arrayOfObject1;
        }
        this.zzb[paramInt] = paramObject;
        this.zzc += 1;
        this.modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean add(Object paramObject)
  {
    zzbH();
    int i = this.zzc;
    Object[] arrayOfObject = this.zzb;
    if (i == arrayOfObject.length) {
      this.zzb = Arrays.copyOf(arrayOfObject, i * 3 / 2 + 1);
    }
    arrayOfObject = this.zzb;
    i = this.zzc;
    this.zzc = (i + 1);
    arrayOfObject[i] = paramObject;
    this.modCount += 1;
    return true;
  }
  
  public final Object get(int paramInt)
  {
    zzg(paramInt);
    return this.zzb[paramInt];
  }
  
  public final Object remove(int paramInt)
  {
    zzbH();
    zzg(paramInt);
    Object[] arrayOfObject = this.zzb;
    Object localObject = arrayOfObject[paramInt];
    int i = this.zzc;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    this.zzc -= 1;
    this.modCount += 1;
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    zzbH();
    zzg(paramInt);
    Object[] arrayOfObject = this.zzb;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    this.modCount += 1;
    return localObject;
  }
  
  public final int size()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */