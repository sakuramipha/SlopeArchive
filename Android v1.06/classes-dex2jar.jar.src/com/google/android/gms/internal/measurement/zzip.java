package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzip
{
  static int zza(byte[] paramArrayOfByte, int paramInt, zzio paramzzio)
    throws zzkm
  {
    int i = zzj(paramArrayOfByte, paramInt, paramzzio);
    paramInt = paramzzio.zza;
    if (paramInt >= 0)
    {
      if (paramInt <= paramArrayOfByte.length - i)
      {
        if (paramInt == 0)
        {
          paramzzio.zzc = zzjb.zzb;
          return i;
        }
        paramzzio.zzc = zzjb.zzl(paramArrayOfByte, i, paramInt);
        return i + paramInt;
      }
      throw zzkm.zzf();
    }
    throw zzkm.zzd();
  }
  
  static int zzb(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int k = paramArrayOfByte[(paramInt + 1)];
    int j = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | i & 0xFF | (k & 0xFF) << 8 | (j & 0xFF) << 16;
  }
  
  static int zzc(zzlu paramzzlu, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzio paramzzio)
    throws IOException
  {
    paramzzlu = (zzlm)paramzzlu;
    Object localObject = paramzzlu.zze();
    paramInt1 = paramzzlu.zzc(localObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzio);
    paramzzlu.zzf(localObject);
    paramzzio.zzc = localObject;
    return paramInt1;
  }
  
  static int zzd(zzlu paramzzlu, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzio paramzzio)
    throws IOException
  {
    int j = paramInt1 + 1;
    int k = paramArrayOfByte[paramInt1];
    int i = j;
    paramInt1 = k;
    if (k < 0)
    {
      i = zzk(k, paramArrayOfByte, j, paramzzio);
      paramInt1 = paramzzio.zza;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - i))
    {
      Object localObject = paramzzlu.zze();
      paramInt1 += i;
      paramzzlu.zzh(localObject, paramArrayOfByte, i, paramInt1, paramzzio);
      paramzzlu.zzf(localObject);
      paramzzio.zzc = localObject;
      return paramInt1;
    }
    throw zzkm.zzf();
  }
  
  static int zze(zzlu paramzzlu, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkj paramzzkj, zzio paramzzio)
    throws IOException
  {
    paramInt2 = zzd(paramzzlu, paramArrayOfByte, paramInt2, paramInt3, paramzzio);
    paramzzkj.add(paramzzio.zzc);
    while (paramInt2 < paramInt3)
    {
      int i = zzj(paramArrayOfByte, paramInt2, paramzzio);
      if (paramInt1 != paramzzio.zza) {
        break;
      }
      paramInt2 = zzd(paramzzlu, paramArrayOfByte, i, paramInt3, paramzzio);
      paramzzkj.add(paramzzio.zzc);
    }
    return paramInt2;
  }
  
  static int zzf(byte[] paramArrayOfByte, int paramInt, zzkj paramzzkj, zzio paramzzio)
    throws IOException
  {
    paramzzkj = (zzkd)paramzzkj;
    paramInt = zzj(paramArrayOfByte, paramInt, paramzzio);
    int i = paramzzio.zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzj(paramArrayOfByte, paramInt, paramzzio);
      paramzzkj.zzh(paramzzio.zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzkm.zzf();
  }
  
  static int zzg(byte[] paramArrayOfByte, int paramInt, zzio paramzzio)
    throws zzkm
  {
    int i = zzj(paramArrayOfByte, paramInt, paramzzio);
    paramInt = paramzzio.zza;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        paramzzio.zzc = "";
        return i;
      }
      paramzzio.zzc = new String(paramArrayOfByte, i, paramInt, zzkk.zzb);
      return i + paramInt;
    }
    throw zzkm.zzd();
  }
  
  static int zzh(byte[] paramArrayOfByte, int paramInt, zzio paramzzio)
    throws zzkm
  {
    int i = zzj(paramArrayOfByte, paramInt, paramzzio);
    paramInt = paramzzio.zza;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        paramzzio.zzc = "";
        return i;
      }
      paramzzio.zzc = zzna.zzd(paramArrayOfByte, i, paramInt);
      return i + paramInt;
    }
    throw zzkm.zzd();
  }
  
  static int zzi(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzmm paramzzmm, zzio paramzzio)
    throws zzkm
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
                paramzzmm.zzh(paramInt1, Integer.valueOf(zzb(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzkm.zzb();
            }
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            zzmm localzzmm = zzmm.zze();
            i = 0;
            int j;
            for (;;)
            {
              j = paramInt2;
              if (paramInt2 >= paramInt3) {
                break;
              }
              j = zzj(paramArrayOfByte, paramInt2, paramzzio);
              i = paramzzio.zza;
              if (i == k) {
                break;
              }
              paramInt2 = zzi(i, paramArrayOfByte, j, paramInt3, localzzmm, paramzzio);
            }
            if ((j <= paramInt3) && (i == k))
            {
              paramzzmm.zzh(paramInt1, localzzmm);
              return j;
            }
            throw zzkm.zze();
          }
          paramInt3 = zzj(paramArrayOfByte, paramInt2, paramzzio);
          paramInt2 = paramzzio.zza;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {
                paramzzmm.zzh(paramInt1, zzjb.zzb);
              } else {
                paramzzmm.zzh(paramInt1, zzjb.zzl(paramArrayOfByte, paramInt3, paramInt2));
              }
              return paramInt3 + paramInt2;
            }
            throw zzkm.zzf();
          }
          throw zzkm.zzd();
        }
        paramzzmm.zzh(paramInt1, Long.valueOf(zzn(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzm(paramArrayOfByte, paramInt2, paramzzio);
      paramzzmm.zzh(paramInt1, Long.valueOf(paramzzio.zzb));
      return paramInt2;
    }
    throw zzkm.zzb();
  }
  
  static int zzj(byte[] paramArrayOfByte, int paramInt, zzio paramzzio)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      paramzzio.zza = paramInt;
      return i;
    }
    return zzk(paramInt, paramArrayOfByte, i, paramzzio);
  }
  
  static int zzk(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zzio paramzzio)
  {
    int i = paramInt1 & 0x7F;
    paramInt1 = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0)
    {
      paramzzio.zza = (i | paramInt2 << 7);
      return paramInt1;
    }
    paramInt2 = i | (paramInt2 & 0x7F) << 7;
    i = paramInt1 + 1;
    paramInt1 = paramArrayOfByte[paramInt1];
    if (paramInt1 >= 0)
    {
      paramzzio.zza = (paramInt2 | paramInt1 << 14);
      return i;
    }
    paramInt1 = paramInt2 | (paramInt1 & 0x7F) << 14;
    paramInt2 = i + 1;
    i = paramArrayOfByte[i];
    if (i >= 0)
    {
      paramzzio.zza = (paramInt1 | i << 21);
      return paramInt2;
    }
    i = paramInt1 | (i & 0x7F) << 21;
    paramInt1 = paramInt2 + 1;
    int j = paramArrayOfByte[paramInt2];
    if (j >= 0)
    {
      paramzzio.zza = (i | j << 28);
      return paramInt1;
    }
    for (;;)
    {
      paramInt2 = paramInt1 + 1;
      if (paramArrayOfByte[paramInt1] >= 0) {
        break;
      }
      paramInt1 = paramInt2;
    }
    paramzzio.zza = (i | (j & 0x7F) << 28);
    return paramInt2;
  }
  
  static int zzl(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzkj paramzzkj, zzio paramzzio)
  {
    paramzzkj = (zzkd)paramzzkj;
    paramInt2 = zzj(paramArrayOfByte, paramInt2, paramzzio);
    paramzzkj.zzh(paramzzio.zza);
    while (paramInt2 < paramInt3)
    {
      int i = zzj(paramArrayOfByte, paramInt2, paramzzio);
      if (paramInt1 != paramzzio.zza) {
        break;
      }
      paramInt2 = zzj(paramArrayOfByte, i, paramzzio);
      paramzzkj.zzh(paramzzio.zza);
    }
    return paramInt2;
  }
  
  static int zzm(byte[] paramArrayOfByte, int paramInt, zzio paramzzio)
  {
    int i = paramInt + 1;
    long l = paramArrayOfByte[paramInt];
    if (l >= 0L)
    {
      paramzzio.zzb = l;
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
    paramzzio.zzb = l;
    return paramInt;
  }
  
  static long zzn(byte[] paramArrayOfByte, int paramInt)
  {
    long l6 = paramArrayOfByte[paramInt];
    long l2 = paramArrayOfByte[(paramInt + 1)];
    long l3 = paramArrayOfByte[(paramInt + 2)];
    long l4 = paramArrayOfByte[(paramInt + 3)];
    long l5 = paramArrayOfByte[(paramInt + 4)];
    long l7 = paramArrayOfByte[(paramInt + 5)];
    long l1 = paramArrayOfByte[(paramInt + 6)];
    return (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56 | l6 & 0xFF | (l2 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l7 & 0xFF) << 40 | (l1 & 0xFF) << 48;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */