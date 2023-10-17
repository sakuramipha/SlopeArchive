package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

final class zzftg
  extends zzfru
{
  static final zzfru zza = new zzftg(null, new Object[0], 0);
  final transient Object[] zzb;
  @CheckForNull
  private final transient Object zzc;
  private final transient int zzd;
  
  private zzftg(@CheckForNull Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    this.zzc = paramObject;
    this.zzb = paramArrayOfObject;
    this.zzd = paramInt;
  }
  
  static zzftg zzi(int paramInt, Object[] paramArrayOfObject, zzfrt paramzzfrt)
  {
    int i = paramInt;
    Object[] arrayOfObject = paramArrayOfObject;
    if (i == 0) {
      return (zzftg)zza;
    }
    Object localObject4 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    paramArrayOfObject = null;
    if (i == 1)
    {
      paramzzfrt = arrayOfObject[0];
      paramzzfrt.getClass();
      paramArrayOfObject = arrayOfObject[1];
      paramArrayOfObject.getClass();
      zzfqo.zzb(paramzzfrt, paramArrayOfObject);
      return new zzftg(null, arrayOfObject, 1);
    }
    zzfoz.zzb(i, arrayOfObject.length >> 1, "index");
    paramInt = zzfrw.zzh(paramInt);
    if (i == 1)
    {
      localObject2 = arrayOfObject[0];
      localObject2.getClass();
      localObject1 = arrayOfObject[1];
      localObject1.getClass();
      zzfqo.zzb(localObject2, localObject1);
    }
    for (;;)
    {
      break;
      int m = paramInt - 1;
      int j;
      int n;
      int k;
      int i1;
      if (paramInt <= 128)
      {
        localObject1 = new byte[paramInt];
        Arrays.fill((byte[])localObject1, (byte)-1);
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
          zzfqo.zzb(localObject3, localObject2);
          for (k = zzfrj.zza(localObject3.hashCode());; k++)
          {
            k &= m;
            i1 = localObject1[k] & 0xFF;
            if (i1 == 255)
            {
              localObject1[k] = ((byte)n);
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
              paramArrayOfObject = new zzfrs(localObject3, localObject2, paramArrayOfObject);
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
      else
      {
        for (;;)
        {
          break;
          if (paramInt <= 32768)
          {
            localObject1 = new short[paramInt];
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
              zzfqo.zzb(localObject3, localObject2);
              for (k = zzfrj.zza(localObject3.hashCode());; k = i1 + 1)
              {
                i1 = k & m;
                k = (char)localObject1[i1];
                if (k == 65535)
                {
                  localObject1[i1] = ((short)n);
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
                  paramArrayOfObject = new zzfrs(localObject3, localObject2, paramArrayOfObject);
                  arrayOfObject[k] = localObject2;
                }
                paramInt++;
                break;
              }
            }
            if (j == i)
            {
              paramArrayOfObject = (Object[])localObject1;
              break;
            }
            localObject2 = new Object[3];
            localObject2[0] = localObject1;
            localObject2[1] = Integer.valueOf(j);
            localObject2[2] = paramArrayOfObject;
            paramArrayOfObject = (Object[])localObject2;
            continue;
          }
          localObject1 = new int[paramInt];
          Arrays.fill((int[])localObject1, -1);
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
            zzfqo.zzb(localObject3, localObject2);
            for (k = zzfrj.zza(localObject3.hashCode());; k++)
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
                paramArrayOfObject = new zzfrs(localObject3, localObject2, paramArrayOfObject);
                arrayOfObject[k] = localObject2;
              }
              paramInt++;
              break;
            }
          }
          if (j == i)
          {
            paramArrayOfObject = (Object[])localObject1;
            break;
          }
          localObject2 = new Object[3];
          localObject2[0] = localObject1;
          localObject2[1] = Integer.valueOf(j);
          localObject2[2] = paramArrayOfObject;
          paramArrayOfObject = (Object[])localObject2;
        }
      }
    }
    paramInt = i;
    localObject2 = arrayOfObject;
    Object localObject1 = paramArrayOfObject;
    if ((paramArrayOfObject instanceof Object[]))
    {
      paramArrayOfObject = (Object[])paramArrayOfObject;
      paramzzfrt.zzc = ((zzfrs)paramArrayOfObject[2]);
      localObject1 = paramArrayOfObject[0];
      paramInt = ((Integer)paramArrayOfObject[1]).intValue();
      localObject2 = Arrays.copyOf(arrayOfObject, paramInt + paramInt);
    }
    return new zzftg(localObject1, (Object[])localObject2, paramInt);
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
        break label293;
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
      for (i = zzfrj.zza(paramObject.hashCode());; i++)
      {
        i &= j - 1;
        k = localObject[i] & 0xFF;
        if (k == 255) {
          break;
        }
        if (paramObject.equals(arrayOfObject[k]))
        {
          paramObject = arrayOfObject[(k ^ 0x1)];
          break label293;
        }
      }
    }
    if ((localObject instanceof short[]))
    {
      localObject = (short[])localObject;
      j = localObject.length;
      for (i = zzfrj.zza(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = (char)localObject[k];
        if (i == 65535) {
          break;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          paramObject = arrayOfObject[(i ^ 0x1)];
          break label293;
        }
      }
    }
    localObject = (int[])localObject;
    int j = localObject.length;
    for (i = zzfrj.zza(paramObject.hashCode());; i = k + 1)
    {
      k = i & j - 1;
      i = localObject[k];
      if (i == -1) {
        break;
      }
      if (paramObject.equals(arrayOfObject[i]))
      {
        paramObject = arrayOfObject[(i ^ 0x1)];
        label293:
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
  
  final zzfrm zza()
  {
    return new zzftf(this.zzb, 1, this.zzd);
  }
  
  final zzfrw zze()
  {
    return new zzftd(this, this.zzb, 0, this.zzd);
  }
  
  final zzfrw zzf()
  {
    return new zzfte(this, new zzftf(this.zzb, 0, this.zzd));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */