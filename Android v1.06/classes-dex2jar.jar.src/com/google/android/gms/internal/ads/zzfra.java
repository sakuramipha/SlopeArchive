package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfra
  extends AbstractMap
  implements Serializable
{
  private static final Object zzd = new Object();
  @CheckForNull
  transient int[] zza;
  @CheckForNull
  transient Object[] zzb;
  @CheckForNull
  transient Object[] zzc;
  @CheckForNull
  private transient Object zze;
  private transient int zzf;
  private transient int zzg;
  @CheckForNull
  private transient Set zzh;
  @CheckForNull
  private transient Set zzi;
  @CheckForNull
  private transient Collection zzj;
  
  zzfra()
  {
    zzm(3);
  }
  
  zzfra(int paramInt)
  {
    zzm(8);
  }
  
  private final int zzp()
  {
    return (1 << (this.zzf & 0x1F)) - 1;
  }
  
  private final int zzq(@CheckForNull Object paramObject)
  {
    if (zzo()) {
      return -1;
    }
    int k = zzfrj.zzb(paramObject);
    int n = zzp();
    Object localObject = this.zze;
    localObject.getClass();
    int i = zzfrb.zzc(localObject, k & n);
    if (i != 0)
    {
      int m = n ^ 0xFFFFFFFF;
      int j;
      do
      {
        i--;
        localObject = this.zza;
        localObject.getClass();
        j = localObject[i];
        if ((j & m) == (k & m))
        {
          localObject = this.zzb;
          localObject.getClass();
          if (zzfou.zza(paramObject, localObject[i])) {
            return i;
          }
        }
        j &= n;
        i = j;
      } while (j != 0);
    }
    return -1;
  }
  
  private final int zzr(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2 - 1;
    Object localObject1 = zzfrb.zzd(paramInt2);
    if (paramInt4 != 0) {
      zzfrb.zze(localObject1, paramInt3 & i, paramInt4 + 1);
    }
    Object localObject2 = this.zze;
    localObject2.getClass();
    int[] arrayOfInt = this.zza;
    arrayOfInt.getClass();
    for (paramInt2 = 0; paramInt2 <= paramInt1; paramInt2++)
    {
      int n;
      for (paramInt3 = zzfrb.zzc(localObject2, paramInt2); paramInt3 != 0; paramInt3 = n & paramInt1)
      {
        int m = paramInt3 - 1;
        n = arrayOfInt[m];
        int j = (paramInt1 ^ 0xFFFFFFFF) & n | paramInt2;
        int k = j & i;
        paramInt4 = zzfrb.zzc(localObject1, k);
        zzfrb.zze(localObject1, k, paramInt3);
        arrayOfInt[m] = ((i ^ 0xFFFFFFFF) & j | paramInt4 & i);
      }
    }
    this.zze = localObject1;
    zzt(i);
    return i;
  }
  
  private final Object zzs(@CheckForNull Object paramObject)
  {
    if (zzo()) {
      return zzd;
    }
    int j = zzp();
    Object localObject = this.zze;
    localObject.getClass();
    int[] arrayOfInt = this.zza;
    arrayOfInt.getClass();
    Object[] arrayOfObject = this.zzb;
    arrayOfObject.getClass();
    int i = zzfrb.zzb(paramObject, null, j, localObject, arrayOfInt, arrayOfObject, null);
    if (i == -1) {
      return zzd;
    }
    paramObject = this.zzc;
    paramObject.getClass();
    paramObject = paramObject[i];
    zzn(i, j);
    this.zzg -= 1;
    zzl();
    return paramObject;
  }
  
  private final void zzt(int paramInt)
  {
    this.zzf = (32 - Integer.numberOfLeadingZeros(paramInt) & 0x1F | this.zzf & 0xFFFFFFE0);
  }
  
  public final void clear()
  {
    if (zzo()) {
      return;
    }
    zzl();
    Object localObject = zzj();
    if (localObject == null)
    {
      localObject = this.zzb;
      localObject.getClass();
      Arrays.fill((Object[])localObject, 0, this.zzg, null);
      localObject = this.zzc;
      localObject.getClass();
      Arrays.fill((Object[])localObject, 0, this.zzg, null);
      localObject = this.zze;
      localObject.getClass();
      if ((localObject instanceof byte[])) {
        Arrays.fill((byte[])localObject, (byte)0);
      } else if ((localObject instanceof short[])) {
        Arrays.fill((short[])localObject, (short)0);
      } else {
        Arrays.fill((int[])localObject, 0);
      }
      localObject = this.zza;
      localObject.getClass();
      Arrays.fill((int[])localObject, 0, this.zzg, 0);
      this.zzg = 0;
      return;
    }
    this.zzf = zzftz.zzb(size(), 3, 1073741823);
    ((Map)localObject).clear();
    this.zze = null;
    this.zzg = 0;
  }
  
  public final boolean containsKey(@CheckForNull Object paramObject)
  {
    Map localMap = zzj();
    boolean bool;
    if (localMap != null)
    {
      bool = localMap.containsKey(paramObject);
    }
    else
    {
      if (zzq(paramObject) != -1) {
        break label33;
      }
      bool = false;
    }
    return bool;
    label33:
    return true;
  }
  
  public final boolean containsValue(@CheckForNull Object paramObject)
  {
    Object localObject = zzj();
    if (localObject == null)
    {
      for (int i = 0; i < this.zzg; i++)
      {
        localObject = this.zzc;
        localObject.getClass();
        if (zzfou.zza(paramObject, localObject[i])) {
          return true;
        }
      }
      return false;
    }
    return ((Map)localObject).containsValue(paramObject);
  }
  
  public final Set entrySet()
  {
    Set localSet = this.zzi;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new zzfqu(this);
      this.zzi = ((Set)localObject);
    }
    return (Set)localObject;
  }
  
  @CheckForNull
  public final Object get(@CheckForNull Object paramObject)
  {
    Map localMap = zzj();
    if (localMap != null) {
      return localMap.get(paramObject);
    }
    int i = zzq(paramObject);
    if (i == -1) {
      return null;
    }
    paramObject = this.zzc;
    paramObject.getClass();
    return paramObject[i];
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final Set keySet()
  {
    Set localSet = this.zzh;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new zzfqx(this);
      this.zzh = ((Set)localObject);
    }
    return (Set)localObject;
  }
  
  @CheckForNull
  public final Object put(Object paramObject1, Object paramObject2)
  {
    int k;
    int m;
    int j;
    int i;
    if (zzo())
    {
      zzfoz.zzi(zzo(), "Arrays already allocated");
      k = this.zzf;
      m = Math.max(k + 1, 2);
      j = Integer.highestOneBit(m);
      i = j;
      if (m > (int)j)
      {
        j += j;
        i = j;
        if (j <= 0) {
          i = 1073741824;
        }
      }
      i = Math.max(4, i);
      this.zze = zzfrb.zzd(i);
      zzt(i - 1);
      this.zza = new int[k];
      this.zzb = new Object[k];
      this.zzc = new Object[k];
    }
    Object localObject1 = zzj();
    if (localObject1 == null)
    {
      int[] arrayOfInt = this.zza;
      arrayOfInt.getClass();
      Object[] arrayOfObject = this.zzb;
      arrayOfObject.getClass();
      localObject1 = this.zzc;
      localObject1.getClass();
      int n = this.zzg;
      m = n + 1;
      int i1 = zzfrj.zzb(paramObject1);
      k = zzp();
      i = i1 & k;
      Object localObject2 = this.zze;
      localObject2.getClass();
      j = zzfrb.zzc(localObject2, i);
      int i2;
      if (j == 0)
      {
        if (m > k)
        {
          i = zzr(k, zzfrb.zza(k), i1, n);
        }
        else
        {
          localObject1 = this.zze;
          localObject1.getClass();
          zzfrb.zze(localObject1, i, m);
          i = k;
        }
      }
      else
      {
        i2 = k ^ 0xFFFFFFFF;
        i = 0;
      }
      for (;;)
      {
        int i4 = j - 1;
        j = arrayOfInt[i4];
        int i3 = j & i2;
        if ((i3 == (i1 & i2)) && (zzfou.zza(paramObject1, arrayOfObject[i4])))
        {
          paramObject1 = localObject1[i4];
          localObject1[i4] = paramObject2;
          return paramObject1;
        }
        j &= k;
        i++;
        if (j == 0)
        {
          if (i >= 9)
          {
            localObject1 = new LinkedHashMap(zzp() + 1, 1.0F);
            for (i = zze(); i >= 0; i = zzf(i))
            {
              localObject2 = this.zzb;
              localObject2.getClass();
              arrayOfObject = localObject2[i];
              localObject2 = this.zzc;
              localObject2.getClass();
              ((Map)localObject1).put(arrayOfObject, localObject2[i]);
            }
            this.zze = localObject1;
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            zzl();
            return ((Map)localObject1).put(paramObject1, paramObject2);
          }
          if (m > k)
          {
            i = zzr(k, zzfrb.zza(k), i1, n);
          }
          else
          {
            arrayOfInt[i4] = (m & k | i3);
            i = k;
          }
          localObject1 = this.zza;
          localObject1.getClass();
          j = localObject1.length;
          if (m > j)
          {
            k = Math.min(1073741823, Math.max(1, j >>> 1) + j | 0x1);
            if (k != j)
            {
              localObject1 = this.zza;
              localObject1.getClass();
              this.zza = Arrays.copyOf((int[])localObject1, k);
              localObject1 = this.zzb;
              localObject1.getClass();
              this.zzb = Arrays.copyOf((Object[])localObject1, k);
              localObject1 = this.zzc;
              localObject1.getClass();
              this.zzc = Arrays.copyOf((Object[])localObject1, k);
            }
          }
          localObject1 = this.zza;
          localObject1.getClass();
          localObject1[n] = ((i ^ 0xFFFFFFFF) & i1);
          localObject1 = this.zzb;
          localObject1.getClass();
          localObject1[n] = paramObject1;
          paramObject1 = this.zzc;
          paramObject1.getClass();
          paramObject1[n] = paramObject2;
          this.zzg = m;
          zzl();
          return null;
        }
      }
    }
    return ((Map)localObject1).put(paramObject1, paramObject2);
  }
  
  @CheckForNull
  public final Object remove(@CheckForNull Object paramObject)
  {
    Object localObject = zzj();
    if (localObject != null) {
      return ((Map)localObject).remove(paramObject);
    }
    localObject = zzs(paramObject);
    paramObject = localObject;
    if (localObject == zzd) {
      paramObject = null;
    }
    return paramObject;
  }
  
  public final int size()
  {
    Map localMap = zzj();
    int i;
    if (localMap != null) {
      i = localMap.size();
    } else {
      i = this.zzg;
    }
    return i;
  }
  
  public final Collection values()
  {
    Collection localCollection = this.zzj;
    Object localObject = localCollection;
    if (localCollection == null)
    {
      localObject = new zzfqz(this);
      this.zzj = ((Collection)localObject);
    }
    return (Collection)localObject;
  }
  
  final int zze()
  {
    if (isEmpty()) {
      return -1;
    }
    return 0;
  }
  
  final int zzf(int paramInt)
  {
    
    if (paramInt < this.zzg) {
      return paramInt;
    }
    return -1;
  }
  
  @CheckForNull
  final Map zzj()
  {
    Object localObject = this.zze;
    if ((localObject instanceof Map)) {
      return (Map)localObject;
    }
    return null;
  }
  
  final void zzl()
  {
    this.zzf += 32;
  }
  
  final void zzm(int paramInt)
  {
    this.zzf = zzftz.zzb(8, 1, 1073741823);
  }
  
  final void zzn(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.zze;
    localObject1.getClass();
    int[] arrayOfInt = this.zza;
    arrayOfInt.getClass();
    Object[] arrayOfObject1 = this.zzb;
    arrayOfObject1.getClass();
    Object[] arrayOfObject2 = this.zzc;
    arrayOfObject2.getClass();
    int j = size() - 1;
    if (paramInt1 < j)
    {
      Object localObject2 = arrayOfObject1[j];
      arrayOfObject1[paramInt1] = localObject2;
      arrayOfObject2[paramInt1] = arrayOfObject2[j];
      arrayOfObject1[j] = null;
      arrayOfObject2[j] = null;
      arrayOfInt[paramInt1] = arrayOfInt[j];
      arrayOfInt[j] = 0;
      int k = zzfrj.zzb(localObject2) & paramInt2;
      int i = zzfrb.zzc(localObject1, k);
      j++;
      if (i != j)
      {
        int m;
        do
        {
          m = i - 1;
          k = arrayOfInt[m];
          i = k & paramInt2;
        } while (i != j);
        arrayOfInt[m] = (paramInt1 + 1 & paramInt2 | k & (paramInt2 ^ 0xFFFFFFFF));
        return;
      }
      zzfrb.zze(localObject1, k, paramInt1 + 1);
      return;
    }
    arrayOfObject1[paramInt1] = null;
    arrayOfObject2[paramInt1] = null;
    arrayOfInt[paramInt1] = 0;
  }
  
  final boolean zzo()
  {
    return this.zze == null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */