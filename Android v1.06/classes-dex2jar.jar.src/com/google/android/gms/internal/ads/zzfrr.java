package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class zzfrr
  extends zzfrm
  implements List, RandomAccess
{
  private static final zzfts zza = new zzfrp(zzftb.zza, 0);
  public static final int zzd = 0;
  
  static zzfrr zzi(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzftb.zza;
    }
    return new zzftb(paramArrayOfObject, paramInt);
  }
  
  public static zzfrr zzj(Collection paramCollection)
  {
    if ((paramCollection instanceof zzfrm))
    {
      zzfrr localzzfrr = ((zzfrm)paramCollection).zzd();
      paramCollection = localzzfrr;
      if (localzzfrr.zzf())
      {
        paramCollection = localzzfrr.toArray();
        paramCollection = zzi(paramCollection, paramCollection.length);
      }
      return paramCollection;
    }
    paramCollection = paramCollection.toArray();
    int i = paramCollection.length;
    zzfsz.zzb(paramCollection, i);
    return zzi(paramCollection, i);
  }
  
  public static zzfrr zzk(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0)
    {
      paramArrayOfObject = zzftb.zza;
    }
    else
    {
      paramArrayOfObject = (Object[])paramArrayOfObject.clone();
      int i = paramArrayOfObject.length;
      zzfsz.zzb(paramArrayOfObject, i);
      paramArrayOfObject = zzi(paramArrayOfObject, i);
    }
    return paramArrayOfObject;
  }
  
  public static zzfrr zzl()
  {
    return zzftb.zza;
  }
  
  public static zzfrr zzm(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    zzfsz.zzb(arrayOfObject, 1);
    return zzi(arrayOfObject, 1);
  }
  
  public static zzfrr zzn(Object paramObject1, Object paramObject2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    zzfsz.zzb(arrayOfObject, 2);
    return zzi(arrayOfObject, 2);
  }
  
  public static zzfrr zzo(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    arrayOfObject[2] = paramObject3;
    zzfsz.zzb(arrayOfObject, 3);
    return zzi(arrayOfObject, 3);
  }
  
  public static zzfrr zzp(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    arrayOfObject[2] = paramObject3;
    arrayOfObject[3] = paramObject4;
    arrayOfObject[4] = paramObject5;
    zzfsz.zzb(arrayOfObject, 5);
    return zzi(arrayOfObject, 5);
  }
  
  public static zzfrr zzq(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6)
  {
    paramObject1 = new Object[6];
    paramObject1[0] = "3010";
    paramObject1[1] = "3008";
    paramObject1[2] = "1005";
    paramObject1[3] = "1009";
    paramObject1[4] = "2011";
    paramObject1[5] = "2007";
    zzfsz.zzb((Object[])paramObject1, 6);
    return zzi((Object[])paramObject1, 6);
  }
  
  @Deprecated
  public final void add(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection paramCollection)
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
                if (!zzfou.zza(get(i), ((List)localObject).get(i))) {
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
            } while (zzfou.zza(((Iterator)paramObject).next(), ((Iterator)localObject).next()));
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
  public final Object remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final Object set(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    int j = size();
    for (int i = 0; i < j; i++) {
      paramArrayOfObject[(paramInt + i)] = get(i);
    }
    return paramInt + j;
  }
  
  @Deprecated
  public final zzfrr zzd()
  {
    return this;
  }
  
  public final zzftr zze()
  {
    return zzr(0);
  }
  
  public zzfrr zzh(int paramInt1, int paramInt2)
  {
    zzfoz.zzg(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzftb.zza;
    }
    return new zzfrq(this, paramInt1, paramInt2);
  }
  
  public final zzfts zzr(int paramInt)
  {
    zzfoz.zzb(paramInt, size(), "index");
    if (isEmpty()) {
      return zza;
    }
    return new zzfrp(this, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */