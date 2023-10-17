package com.google.android.gms.internal.drive;

import java.io.IOException;

final class zziy
{
  static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zziz paramzziz)
    throws zzkq
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5) {
                return paramInt2 + 4;
              }
              throw zzkq.zzdk();
            }
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            paramInt1 = 0;
            for (;;)
            {
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              int j = zza(paramArrayOfByte, paramInt2, paramzziz);
              paramInt2 = paramzziz.zznk;
              paramInt1 = paramInt2;
              i = j;
              if (paramInt2 == k) {
                break;
              }
              i = zza(paramInt2, paramArrayOfByte, j, paramInt3, paramzziz);
              paramInt1 = paramInt2;
              paramInt2 = i;
            }
            if ((i <= paramInt3) && (paramInt1 == k)) {
              return i;
            }
            throw zzkq.zzdm();
          }
          return zza(paramArrayOfByte, paramInt2, paramzziz) + paramzziz.zznk;
        }
        return paramInt2 + 8;
      }
      return zzb(paramArrayOfByte, paramInt2, paramzziz);
    }
    throw zzkq.zzdk();
  }
  
  static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkp<?> paramzzkp, zziz paramzziz)
  {
    paramzzkp = (zzkl)paramzzkp;
    paramInt2 = zza(paramArrayOfByte, paramInt2, paramzziz);
    paramzzkp.zzam(paramzziz.zznk);
    while (paramInt2 < paramInt3)
    {
      int i = zza(paramArrayOfByte, paramInt2, paramzziz);
      if (paramInt1 != paramzziz.zznk) {
        break;
      }
      paramInt2 = zza(paramArrayOfByte, i, paramzziz);
      paramzzkp.zzam(paramzziz.zznk);
    }
    return paramInt2;
  }
  
  static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzmy paramzzmy, zziz paramzziz)
    throws zzkq
  {
    if (paramInt1 >>> 3 != 0)
    {
      int i = paramInt1 & 0x7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 5)
              {
                paramzzmy.zzb(paramInt1, Integer.valueOf(zza(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzkq.zzdk();
            }
            zzmy localzzmy = zzmy.zzfb();
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            i = 0;
            for (;;)
            {
              j = i;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break label140;
              }
              j = zza(paramArrayOfByte, paramInt2, paramzziz);
              i = paramzziz.zznk;
              paramInt2 = i;
              if (i == k) {
                break;
              }
              paramInt2 = zza(paramInt2, paramArrayOfByte, j, paramInt3, localzzmy, paramzziz);
            }
            i = j;
            int j = paramInt2;
            label140:
            if ((i <= paramInt3) && (j == k))
            {
              paramzzmy.zzb(paramInt1, localzzmy);
              return i;
            }
            throw zzkq.zzdm();
          }
          paramInt3 = zza(paramArrayOfByte, paramInt2, paramzziz);
          paramInt2 = paramzziz.zznk;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {
                paramzzmy.zzb(paramInt1, zzjc.zznq);
              } else {
                paramzzmy.zzb(paramInt1, zzjc.zzb(paramArrayOfByte, paramInt3, paramInt2));
              }
              return paramInt3 + paramInt2;
            }
            throw zzkq.zzdi();
          }
          throw zzkq.zzdj();
        }
        paramzzmy.zzb(paramInt1, Long.valueOf(zzb(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzb(paramArrayOfByte, paramInt2, paramzziz);
      paramzzmy.zzb(paramInt1, Long.valueOf(paramzziz.zznl));
      return paramInt2;
    }
    throw zzkq.zzdk();
  }
  
  static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zziz paramzziz)
  {
    int i = paramInt1 & 0x7F;
    paramInt1 = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0)
    {
      paramzziz.zznk = (i | paramInt2 << 7);
      return paramInt1;
    }
    paramInt2 = i | (paramInt2 & 0x7F) << 7;
    i = paramInt1 + 1;
    paramInt1 = paramArrayOfByte[paramInt1];
    if (paramInt1 >= 0)
    {
      paramzziz.zznk = (paramInt2 | paramInt1 << 14);
      return i;
    }
    paramInt1 = paramInt2 | (paramInt1 & 0x7F) << 14;
    paramInt2 = i + 1;
    i = paramArrayOfByte[i];
    if (i >= 0)
    {
      paramzziz.zznk = (paramInt1 | i << 21);
      return paramInt2;
    }
    i = paramInt1 | (i & 0x7F) << 21;
    paramInt1 = paramInt2 + 1;
    int j = paramArrayOfByte[paramInt2];
    if (j >= 0)
    {
      paramzziz.zznk = (i | j << 28);
      return paramInt1;
    }
    for (;;)
    {
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0)
      {
        paramzziz.zznk = (i | (j & 0x7F) << 28);
        return paramInt2;
      }
      paramInt1 = paramInt2;
    }
  }
  
  static int zza(zzmf<?> paramzzmf, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkp<?> paramzzkp, zziz paramzziz)
    throws IOException
  {
    paramInt2 = zza(paramzzmf, paramArrayOfByte, paramInt2, paramInt3, paramzziz);
    paramzzkp.add(paramzziz.zznm);
    while (paramInt2 < paramInt3)
    {
      int i = zza(paramArrayOfByte, paramInt2, paramzziz);
      if (paramInt1 != paramzziz.zznk) {
        break;
      }
      paramInt2 = zza(paramzzmf, paramArrayOfByte, i, paramInt3, paramzziz);
      paramzzkp.add(paramzziz.zznm);
    }
    return paramInt2;
  }
  
  static int zza(zzmf paramzzmf, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zziz paramzziz)
    throws IOException
  {
    zzlu localzzlu = (zzlu)paramzzmf;
    paramzzmf = localzzlu.newInstance();
    paramInt1 = localzzlu.zza(paramzzmf, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzziz);
    localzzlu.zzd(paramzzmf);
    paramzziz.zznm = paramzzmf;
    return paramInt1;
  }
  
  static int zza(zzmf paramzzmf, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zziz paramzziz)
    throws IOException
  {
    int j = paramInt1 + 1;
    int k = paramArrayOfByte[paramInt1];
    paramInt1 = j;
    int i = k;
    if (k < 0)
    {
      paramInt1 = zza(k, paramArrayOfByte, j, paramzziz);
      i = paramzziz.zznk;
    }
    if ((i >= 0) && (i <= paramInt2 - paramInt1))
    {
      Object localObject = paramzzmf.newInstance();
      paramInt2 = i + paramInt1;
      paramzzmf.zza(localObject, paramArrayOfByte, paramInt1, paramInt2, paramzziz);
      paramzzmf.zzd(localObject);
      paramzziz.zznm = localObject;
      return paramInt2;
    }
    throw zzkq.zzdi();
  }
  
  static int zza(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16;
  }
  
  static int zza(byte[] paramArrayOfByte, int paramInt, zziz paramzziz)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      paramzziz.zznk = paramInt;
      return i;
    }
    return zza(paramInt, paramArrayOfByte, i, paramzziz);
  }
  
  static int zza(byte[] paramArrayOfByte, int paramInt, zzkp<?> paramzzkp, zziz paramzziz)
    throws IOException
  {
    paramzzkp = (zzkl)paramzzkp;
    paramInt = zza(paramArrayOfByte, paramInt, paramzziz);
    int i = paramzziz.zznk + paramInt;
    while (paramInt < i)
    {
      paramInt = zza(paramArrayOfByte, paramInt, paramzziz);
      paramzzkp.zzam(paramzziz.zznk);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzkq.zzdi();
  }
  
  static int zzb(byte[] paramArrayOfByte, int paramInt, zziz paramzziz)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      paramzziz.zznl = l;
      return i;
    }
    paramInt = i + 1;
    int j = paramArrayOfByte[i];
    l = l & 0x7F | (j & 0x7F) << 7;
    i = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[paramInt];
      i += 7;
      l |= (j & 0x7F) << i;
      paramInt++;
    }
    paramzziz.zznl = l;
    return paramInt;
  }
  
  static long zzb(byte[] paramArrayOfByte, int paramInt)
  {
    long l7 = paramArrayOfByte[paramInt];
    long l4 = paramArrayOfByte[(paramInt + 1)];
    long l1 = paramArrayOfByte[(paramInt + 2)];
    long l2 = paramArrayOfByte[(paramInt + 3)];
    long l5 = paramArrayOfByte[(paramInt + 4)];
    long l6 = paramArrayOfByte[(paramInt + 5)];
    long l3 = paramArrayOfByte[(paramInt + 6)];
    return (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56 | l7 & 0xFF | (l4 & 0xFF) << 8 | (l1 & 0xFF) << 16 | (l2 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l3 & 0xFF) << 48;
  }
  
  static double zzc(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(zzb(paramArrayOfByte, paramInt));
  }
  
  static int zzc(byte[] paramArrayOfByte, int paramInt, zziz paramzziz)
    throws zzkq
  {
    int i = zza(paramArrayOfByte, paramInt, paramzziz);
    paramInt = paramzziz.zznk;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        paramzziz.zznm = "";
        return i;
      }
      paramzziz.zznm = new String(paramArrayOfByte, i, paramInt, zzkm.UTF_8);
      return i + paramInt;
    }
    throw zzkq.zzdj();
  }
  
  static float zzd(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(zza(paramArrayOfByte, paramInt));
  }
  
  static int zzd(byte[] paramArrayOfByte, int paramInt, zziz paramzziz)
    throws zzkq
  {
    int i = zza(paramArrayOfByte, paramInt, paramzziz);
    paramInt = paramzziz.zznk;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        paramzziz.zznm = "";
        return i;
      }
      paramzziz.zznm = zznf.zzg(paramArrayOfByte, i, paramInt);
      return i + paramInt;
    }
    throw zzkq.zzdj();
  }
  
  static int zze(byte[] paramArrayOfByte, int paramInt, zziz paramzziz)
    throws zzkq
  {
    paramInt = zza(paramArrayOfByte, paramInt, paramzziz);
    int i = paramzziz.zznk;
    if (i >= 0)
    {
      if (i <= paramArrayOfByte.length - paramInt)
      {
        if (i == 0)
        {
          paramzziz.zznm = zzjc.zznq;
          return paramInt;
        }
        paramzziz.zznm = zzjc.zzb(paramArrayOfByte, paramInt, i);
        return paramInt + i;
      }
      throw zzkq.zzdi();
    }
    throw zzkq.zzdj();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zziy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */