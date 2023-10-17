package com.google.android.gms.internal.consent_sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class zzde
  extends zzdb
  implements List, RandomAccess
{
  private static final zzdl zza = new zzdc(zzdh.zza, 0);
  public static final int zzd = 0;
  
  static zzde zzg(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzdh.zza;
    }
    return new zzdh(paramArrayOfObject, paramInt);
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
                if (!zzcw.zza(get(i), ((List)localObject).get(i))) {
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
            } while (zzcw.zza(((Iterator)paramObject).next(), ((Iterator)localObject).next()));
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
    int i = size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramArrayOfObject[paramInt] = get(paramInt);
    }
    return i;
  }
  
  public final zzdk zzd()
  {
    return zzh(0);
  }
  
  public zzde zzf(int paramInt1, int paramInt2)
  {
    zzcx.zzc(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzdh.zza;
    }
    return new zzdd(this, paramInt1, paramInt2);
  }
  
  public final zzdl zzh(int paramInt)
  {
    zzcx.zzb(paramInt, size(), "index");
    if (isEmpty()) {
      return zza;
    }
    return new zzdc(this, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */