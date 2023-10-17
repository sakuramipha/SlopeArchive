package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class zzag<E>
  extends zzac<E>
  implements List<E>, RandomAccess
{
  private static final zzak<Object> zza = new zzae(zzai.zza, 0);
  
  static <E> zzag<E> zzi(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzai.zza;
    }
    return new zzai(paramArrayOfObject, paramInt);
  }
  
  public static <E> zzag<E> zzj(Iterable<? extends E> paramIterable)
  {
    Objects.requireNonNull(paramIterable);
    if ((paramIterable instanceof Collection))
    {
      paramIterable = zzk((Collection)paramIterable);
    }
    else
    {
      Iterator localIterator = paramIterable.iterator();
      if (!localIterator.hasNext())
      {
        paramIterable = zzai.zza;
      }
      else
      {
        Object localObject = localIterator.next();
        if (!localIterator.hasNext())
        {
          paramIterable = zzm(localObject);
        }
        else
        {
          paramIterable = new zzad(4);
          paramIterable.zzb(localObject);
          paramIterable.zzc(localIterator);
          paramIterable.zzc = true;
          paramIterable = zzi(paramIterable.zza, paramIterable.zzb);
        }
      }
    }
    return paramIterable;
  }
  
  public static <E> zzag<E> zzk(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof zzac))
    {
      zzag localzzag = ((zzac)paramCollection).zzd();
      paramCollection = localzzag;
      if (localzzag.zzf())
      {
        paramCollection = localzzag.toArray();
        paramCollection = zzi(paramCollection, paramCollection.length);
      }
      return paramCollection;
    }
    paramCollection = paramCollection.toArray();
    int i = paramCollection.length;
    zzah.zza(paramCollection, i);
    return zzi(paramCollection, i);
  }
  
  public static <E> zzag<E> zzl()
  {
    return zzai.zza;
  }
  
  public static <E> zzag<E> zzm(E paramE)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramE;
    zzah.zza(arrayOfObject, 1);
    return zzi(arrayOfObject, 1);
  }
  
  public static <E> zzag<E> zzn(E paramE1, E paramE2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramE1;
    arrayOfObject[1] = paramE2;
    zzah.zza(arrayOfObject, 2);
    return zzi(arrayOfObject, 2);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramObject == this)
    {
      bool1 = bool2;
    }
    else
    {
      if (!(paramObject instanceof List)) {}
      Object localObject;
      label164:
      do
      {
        for (;;)
        {
          bool1 = false;
          break label178;
          localObject = (List)paramObject;
          int j = size();
          if (j == ((List)localObject).size())
          {
            if ((localObject instanceof RandomAccess)) {
              for (int i = 0;; i++)
              {
                bool1 = bool2;
                if (i >= j) {
                  break label178;
                }
                if (!zzr.zza(get(i), ((List)localObject).get(i))) {
                  break;
                }
              }
            }
            paramObject = iterator();
            localObject = ((List)localObject).iterator();
            do
            {
              if (!((Iterator)paramObject).hasNext()) {
                break label164;
              }
              if (!((Iterator)localObject).hasNext()) {
                break;
              }
            } while (zzr.zza(((Iterator)paramObject).next(), ((Iterator)localObject).next()));
          }
        }
      } while (((Iterator)localObject).hasNext());
      bool1 = bool2;
    }
    label178:
    return bool1;
  }
  
  public final int hashCode()
  {
    int k = size();
    int j = 1;
    for (int i = 0; i < k; i++) {
      j = j * 31 + get(i).hashCode();
    }
    return j;
  }
  
  public final int indexOf(@CheckForNull Object paramObject)
  {
    int k = -1;
    if (paramObject == null) {
      return -1;
    }
    int m = size();
    int j;
    for (int i = 0;; i++)
    {
      j = k;
      if (i >= m) {
        break;
      }
      if (paramObject.equals(get(i)))
      {
        j = i;
        break;
      }
    }
    return j;
  }
  
  public final int lastIndexOf(@CheckForNull Object paramObject)
  {
    int k = -1;
    if (paramObject == null) {
      return -1;
    }
    int j;
    for (int i = size() - 1;; i--)
    {
      j = k;
      if (i < 0) {
        break;
      }
      if (paramObject.equals(get(i)))
      {
        j = i;
        break;
      }
    }
    return j;
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramArrayOfObject[paramInt] = get(paramInt);
    }
    return i;
  }
  
  @Deprecated
  public final zzag<E> zzd()
  {
    return this;
  }
  
  public final zzaj<E> zze()
  {
    return zzo(0);
  }
  
  public zzag<E> zzh(int paramInt1, int paramInt2)
  {
    zzs.zzc(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzai.zza;
    }
    return new zzaf(this, paramInt1, paramInt2);
  }
  
  public final zzak<E> zzo(int paramInt)
  {
    zzs.zzb(paramInt, size(), "index");
    if (isEmpty()) {
      return zza;
    }
    return new zzae(this, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */