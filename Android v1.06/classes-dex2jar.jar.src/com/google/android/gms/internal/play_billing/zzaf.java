package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import javax.annotation.CheckForNull;

final class zzaf
  extends zzx
{
  static final zzx zza = new zzaf(null, new Object[0], 0);
  final transient Object[] zzb;
  @CheckForNull
  private final transient Object zzc;
  private final transient int zzd;
  
  private zzaf(@CheckForNull Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    this.zzc = paramObject;
    this.zzb = paramArrayOfObject;
    this.zzd = paramInt;
  }
  
  static zzaf zzf(int paramInt, Object[] paramArrayOfObject, zzw paramzzw)
  {
    int i = paramInt;
    Object[] arrayOfObject = paramArrayOfObject;
    if (i == 0) {
      return (zzaf)zza;
    }
    Object localObject2 = null;
    Object localObject4 = null;
    paramArrayOfObject = null;
    Object localObject3 = null;
    if (i == 1)
    {
      paramzzw = arrayOfObject[0];
      paramzzw.getClass();
      paramArrayOfObject = arrayOfObject[1];
      paramArrayOfObject.getClass();
      zzp.zza(paramzzw, paramArrayOfObject);
      return new zzaf(null, arrayOfObject, 1);
    }
    zzm.zzb(i, arrayOfObject.length >> 1, "index");
    int k = Math.max(i, 2);
    int j = 1073741824;
    if (k < 751619276)
    {
      paramInt = Integer.highestOneBit(k - 1);
      paramInt += paramInt;
      for (;;)
      {
        j = paramInt;
        if (paramInt * 0.7D >= k) {
          break;
        }
        paramInt += paramInt;
      }
    }
    if (k < 1073741824)
    {
      if (i == 1)
      {
        localObject2 = arrayOfObject[0];
        localObject2.getClass();
        localObject1 = arrayOfObject[1];
        localObject1.getClass();
        zzp.zza(localObject2, localObject1);
      }
      else
      {
        int m = j - 1;
        int n;
        int i1;
        if (j <= 128)
        {
          localObject1 = new byte[j];
          Arrays.fill((byte[])localObject1, (byte)-1);
          paramInt = 0;
          j = 0;
          paramArrayOfObject = (Object[])localObject3;
          if (paramInt < i)
          {
            n = j + j;
            k = paramInt + paramInt;
            localObject3 = arrayOfObject[k];
            localObject3.getClass();
            localObject2 = arrayOfObject[(k ^ 0x1)];
            localObject2.getClass();
            zzp.zza(localObject3, localObject2);
            for (k = zzq.zza(localObject3.hashCode());; k = i1 + 1)
            {
              i1 = k & m;
              k = localObject1[i1] & 0xFF;
              if (k == 255)
              {
                localObject1[i1] = ((byte)n);
                if (j < paramInt)
                {
                  arrayOfObject[n] = localObject3;
                  arrayOfObject[(n ^ 0x1)] = localObject2;
                }
                j++;
              }
              else
              {
                if (!localObject3.equals(arrayOfObject[k])) {
                  continue;
                }
                k ^= 0x1;
                paramArrayOfObject = arrayOfObject[k];
                paramArrayOfObject.getClass();
                paramArrayOfObject = new zzv(localObject3, localObject2, paramArrayOfObject);
                arrayOfObject[k] = localObject2;
              }
              paramInt++;
              break;
            }
          }
          if (j == i)
          {
            paramArrayOfObject = (Object[])localObject1;
          }
          else
          {
            localObject2 = new Object[3];
            localObject2[0] = localObject1;
            localObject2[1] = Integer.valueOf(j);
            localObject2[2] = paramArrayOfObject;
            paramArrayOfObject = (Object[])localObject2;
          }
        }
        for (;;)
        {
          break;
          if (j <= 32768)
          {
            localObject1 = new short[j];
            Arrays.fill((short[])localObject1, (short)-1);
            paramInt = 0;
            j = 0;
            paramArrayOfObject = (Object[])localObject2;
            if (paramInt < i)
            {
              n = j + j;
              k = paramInt + paramInt;
              localObject3 = arrayOfObject[k];
              localObject3.getClass();
              localObject2 = arrayOfObject[(k ^ 0x1)];
              localObject2.getClass();
              zzp.zza(localObject3, localObject2);
              for (k = zzq.zza(localObject3.hashCode());; k++)
              {
                k &= m;
                i1 = (char)localObject1[k];
                if (i1 == 65535)
                {
                  localObject1[k] = ((short)n);
                  if (j < paramInt)
                  {
                    arrayOfObject[n] = localObject3;
                    arrayOfObject[(n ^ 0x1)] = localObject2;
                  }
                  j++;
                }
                else
                {
                  if (!localObject3.equals(arrayOfObject[i1])) {
                    continue;
                  }
                  k = i1 ^ 0x1;
                  paramArrayOfObject = arrayOfObject[k];
                  paramArrayOfObject.getClass();
                  paramArrayOfObject = new zzv(localObject3, localObject2, paramArrayOfObject);
                  arrayOfObject[k] = localObject2;
                }
                paramInt++;
                break;
              }
            }
            if (j == i)
            {
              paramArrayOfObject = (Object[])localObject1;
            }
            else
            {
              localObject2 = new Object[3];
              localObject2[0] = localObject1;
              localObject2[1] = Integer.valueOf(j);
              localObject2[2] = paramArrayOfObject;
              paramArrayOfObject = (Object[])localObject2;
              break;
            }
          }
          else
          {
            localObject1 = new int[j];
            Arrays.fill((int[])localObject1, -1);
            paramInt = 0;
            j = 0;
            paramArrayOfObject = (Object[])localObject4;
            if (paramInt < i)
            {
              n = j + j;
              k = paramInt + paramInt;
              localObject3 = arrayOfObject[k];
              localObject3.getClass();
              localObject2 = arrayOfObject[(k ^ 0x1)];
              localObject2.getClass();
              zzp.zza(localObject3, localObject2);
              for (k = zzq.zza(localObject3.hashCode());; k++)
              {
                k &= m;
                i1 = localObject1[k];
                if (i1 == -1)
                {
                  localObject1[k] = n;
                  if (j < paramInt)
                  {
                    arrayOfObject[n] = localObject3;
                    arrayOfObject[(n ^ 0x1)] = localObject2;
                  }
                  j++;
                }
                else
                {
                  if (!localObject3.equals(arrayOfObject[i1])) {
                    continue;
                  }
                  k = i1 ^ 0x1;
                  paramArrayOfObject = arrayOfObject[k];
                  paramArrayOfObject.getClass();
                  paramArrayOfObject = new zzv(localObject3, localObject2, paramArrayOfObject);
                  arrayOfObject[k] = localObject2;
                }
                paramInt++;
                break;
              }
            }
            if (j != i) {
              break label911;
            }
            paramArrayOfObject = (Object[])localObject1;
          }
          continue;
          label911:
          localObject2 = new Object[3];
          localObject2[0] = localObject1;
          localObject2[1] = Integer.valueOf(j);
          localObject2[2] = paramArrayOfObject;
          paramArrayOfObject = (Object[])localObject2;
        }
      }
      localObject2 = arrayOfObject;
      Object localObject1 = paramArrayOfObject;
      if ((paramArrayOfObject instanceof Object[]))
      {
        paramArrayOfObject = (Object[])paramArrayOfObject;
        paramzzw.zzc = ((zzv)paramArrayOfObject[2]);
        localObject1 = paramArrayOfObject[0];
        i = ((Integer)paramArrayOfObject[1]).intValue();
        localObject2 = Arrays.copyOf(arrayOfObject, i + i);
      }
      return new zzaf(localObject1, (Object[])localObject2, i);
    }
    throw new IllegalArgumentException("collection too large");
  }
  
  @CheckForNull
  public final Object get(@CheckForNull Object paramObject)
  {
    Object localObject = this.zzc;
    Object[] arrayOfObject = this.zzb;
    int i = this.zzd;
    if (paramObject == null) {}
    do
    {
      do
      {
        paramObject = null;
        break label295;
        if (i != 1) {
          break;
        }
        localObject = arrayOfObject[0];
        localObject.getClass();
      } while (!localObject.equals(paramObject));
      paramObject = arrayOfObject[1];
      paramObject.getClass();
      break;
    } while (localObject == null);
    int k;
    if ((localObject instanceof byte[]))
    {
      localObject = (byte[])localObject;
      j = localObject.length;
      for (i = zzq.zza(paramObject.hashCode());; i++)
      {
        i &= j - 1;
        k = localObject[i] & 0xFF;
        if (k == 255) {
          break;
        }
        if (paramObject.equals(arrayOfObject[k]))
        {
          paramObject = arrayOfObject[(k ^ 0x1)];
          break label295;
        }
      }
    }
    if ((localObject instanceof short[]))
    {
      localObject = (short[])localObject;
      j = localObject.length;
      for (i = zzq.zza(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = (char)localObject[k];
        if (i == 65535) {
          break;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          paramObject = arrayOfObject[(i ^ 0x1)];
          break label295;
        }
      }
    }
    localObject = (int[])localObject;
    int j = localObject.length;
    for (i = zzq.zza(paramObject.hashCode());; i++)
    {
      i &= j - 1;
      k = localObject[i];
      if (k == -1) {
        break;
      }
      if (paramObject.equals(arrayOfObject[k]))
      {
        paramObject = arrayOfObject[(k ^ 0x1)];
        label295:
        if (paramObject == null) {
          return null;
        }
        return paramObject;
      }
    }
  }
  
  public final int size()
  {
    return this.zzd;
  }
  
  final zzr zza()
  {
    return new zzae(this.zzb, 1, this.zzd);
  }
  
  final zzy zzc()
  {
    return new zzac(this, this.zzb, 0, this.zzd);
  }
  
  final zzy zzd()
  {
    return new zzad(this, new zzae(this.zzb, 0, this.zzd));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */