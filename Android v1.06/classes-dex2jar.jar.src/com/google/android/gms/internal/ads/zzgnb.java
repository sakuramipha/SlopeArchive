package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzgnb
{
  static int zza(byte[] paramArrayOfByte, int paramInt, zzgna paramzzgna)
    throws zzgpi
  {
    int i = zzj(paramArrayOfByte, paramInt, paramzzgna);
    paramInt = paramzzgna.zza;
    if (paramInt >= 0)
    {
      if (paramInt <= paramArrayOfByte.length - i)
      {
        if (paramInt == 0)
        {
          paramzzgna.zzc = zzgno.zzb;
          return i;
        }
        paramzzgna.zzc = zzgno.zzv(paramArrayOfByte, i, paramInt);
        return i + paramInt;
      }
      throw zzgpi.zzj();
    }
    throw zzgpi.zzf();
  }
  
  static int zzb(byte[] paramArrayOfByte, int paramInt)
  {
    int j = paramArrayOfByte[paramInt];
    int i = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (i & 0xFF) << 8 | j & 0xFF | (k & 0xFF) << 16;
  }
  
  static int zzc(zzgqz paramzzgqz, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzgna paramzzgna)
    throws IOException
  {
    Object localObject = paramzzgqz.zze();
    paramInt1 = zzn(localObject, paramzzgqz, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzgna);
    paramzzgqz.zzf(localObject);
    paramzzgna.zzc = localObject;
    return paramInt1;
  }
  
  static int zzd(zzgqz paramzzgqz, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzgna paramzzgna)
    throws IOException
  {
    Object localObject = paramzzgqz.zze();
    paramInt1 = zzo(localObject, paramzzgqz, paramArrayOfByte, paramInt1, paramInt2, paramzzgna);
    paramzzgqz.zzf(localObject);
    paramzzgna.zzc = localObject;
    return paramInt1;
  }
  
  static int zze(zzgqz paramzzgqz, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzgpf paramzzgpf, zzgna paramzzgna)
    throws IOException
  {
    paramInt2 = zzd(paramzzgqz, paramArrayOfByte, paramInt2, paramInt3, paramzzgna);
    paramzzgpf.add(paramzzgna.zzc);
    while (paramInt2 < paramInt3)
    {
      int i = zzj(paramArrayOfByte, paramInt2, paramzzgna);
      if (paramInt1 != paramzzgna.zza) {
        break;
      }
      paramInt2 = zzd(paramzzgqz, paramArrayOfByte, i, paramInt3, paramzzgna);
      paramzzgpf.add(paramzzgna.zzc);
    }
    return paramInt2;
  }
  
  static int zzf(byte[] paramArrayOfByte, int paramInt, zzgpf paramzzgpf, zzgna paramzzgna)
    throws IOException
  {
    paramzzgpf = (zzgox)paramzzgpf;
    paramInt = zzj(paramArrayOfByte, paramInt, paramzzgna);
    int i = paramzzgna.zza + paramInt;
    while (paramInt < i)
    {
      paramInt = zzj(paramArrayOfByte, paramInt, paramzzgna);
      paramzzgpf.zzh(paramzzgna.zza);
    }
    if (paramInt == i) {
      return paramInt;
    }
    throw zzgpi.zzj();
  }
  
  static int zzg(byte[] paramArrayOfByte, int paramInt, zzgna paramzzgna)
    throws zzgpi
  {
    int i = zzj(paramArrayOfByte, paramInt, paramzzgna);
    paramInt = paramzzgna.zza;
    if (paramInt >= 0)
    {
      if (paramInt == 0)
      {
        paramzzgna.zzc = "";
        return i;
      }
      paramzzgna.zzc = new String(paramArrayOfByte, i, paramInt, zzgpg.zzb);
      return i + paramInt;
    }
    throw zzgpi.zzf();
  }
  
  static int zzh(byte[] paramArrayOfByte, int paramInt, zzgna paramzzgna)
    throws zzgpi
  {
    paramInt = zzj(paramArrayOfByte, paramInt, paramzzgna);
    int i = paramzzgna.zza;
    if (i >= 0)
    {
      if (i == 0)
      {
        paramzzgna.zzc = "";
        return paramInt;
      }
      paramzzgna.zzc = zzgsf.zzh(paramArrayOfByte, paramInt, i);
      return paramInt + i;
    }
    throw zzgpi.zzf();
  }
  
  static int zzi(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzgrr paramzzgrr, zzgna paramzzgna)
    throws zzgpi
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
                paramzzgrr.zzj(paramInt1, Integer.valueOf(zzb(paramArrayOfByte, paramInt2)));
                return paramInt2 + 4;
              }
              throw zzgpi.zzc();
            }
            int k = paramInt1 & 0xFFFFFFF8 | 0x4;
            zzgrr localzzgrr = zzgrr.zzf();
            i = 0;
            for (;;)
            {
              j = i;
              i = paramInt2;
              if (paramInt2 >= paramInt3) {
                break label140;
              }
              j = zzj(paramArrayOfByte, paramInt2, paramzzgna);
              i = paramzzgna.zza;
              paramInt2 = i;
              if (i == k) {
                break;
              }
              paramInt2 = zzi(paramInt2, paramArrayOfByte, j, paramInt3, localzzgrr, paramzzgna);
            }
            i = j;
            int j = paramInt2;
            label140:
            if ((i <= paramInt3) && (j == k))
            {
              paramzzgrr.zzj(paramInt1, localzzgrr);
              return i;
            }
            throw zzgpi.zzg();
          }
          paramInt3 = zzj(paramArrayOfByte, paramInt2, paramzzgna);
          paramInt2 = paramzzgna.zza;
          if (paramInt2 >= 0)
          {
            if (paramInt2 <= paramArrayOfByte.length - paramInt3)
            {
              if (paramInt2 == 0) {
                paramzzgrr.zzj(paramInt1, zzgno.zzb);
              } else {
                paramzzgrr.zzj(paramInt1, zzgno.zzv(paramArrayOfByte, paramInt3, paramInt2));
              }
              return paramInt3 + paramInt2;
            }
            throw zzgpi.zzj();
          }
          throw zzgpi.zzf();
        }
        paramzzgrr.zzj(paramInt1, Long.valueOf(zzp(paramArrayOfByte, paramInt2)));
        return paramInt2 + 8;
      }
      paramInt2 = zzm(paramArrayOfByte, paramInt2, paramzzgna);
      paramzzgrr.zzj(paramInt1, Long.valueOf(paramzzgna.zzb));
      return paramInt2;
    }
    throw zzgpi.zzc();
  }
  
  static int zzj(byte[] paramArrayOfByte, int paramInt, zzgna paramzzgna)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    if (paramInt >= 0)
    {
      paramzzgna.zza = paramInt;
      return i;
    }
    return zzk(paramInt, paramArrayOfByte, i, paramzzgna);
  }
  
  static int zzk(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zzgna paramzzgna)
  {
    int i = paramArrayOfByte[paramInt2];
    paramInt2++;
    paramInt1 &= 0x7F;
    if (i >= 0)
    {
      paramzzgna.zza = (paramInt1 | i << 7);
      return paramInt2;
    }
    i = paramInt1 | (i & 0x7F) << 7;
    paramInt1 = paramInt2 + 1;
    paramInt2 = paramArrayOfByte[paramInt2];
    if (paramInt2 >= 0)
    {
      paramzzgna.zza = (i | paramInt2 << 14);
      return paramInt1;
    }
    i |= (paramInt2 & 0x7F) << 14;
    paramInt2 = paramInt1 + 1;
    paramInt1 = paramArrayOfByte[paramInt1];
    if (paramInt1 >= 0)
    {
      paramzzgna.zza = (i | paramInt1 << 21);
      return paramInt2;
    }
    i |= (paramInt1 & 0x7F) << 21;
    paramInt1 = paramInt2 + 1;
    int j = paramArrayOfByte[paramInt2];
    if (j >= 0)
    {
      paramzzgna.zza = (i | j << 28);
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
    paramzzgna.zza = (i | (j & 0x7F) << 28);
    return paramInt2;
  }
  
  static int zzl(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zzgpf paramzzgpf, zzgna paramzzgna)
  {
    paramzzgpf = (zzgox)paramzzgpf;
    paramInt2 = zzj(paramArrayOfByte, paramInt2, paramzzgna);
    paramzzgpf.zzh(paramzzgna.zza);
    while (paramInt2 < paramInt3)
    {
      int i = zzj(paramArrayOfByte, paramInt2, paramzzgna);
      if (paramInt1 != paramzzgna.zza) {
        break;
      }
      paramInt2 = zzj(paramArrayOfByte, i, paramzzgna);
      paramzzgpf.zzh(paramzzgna.zza);
    }
    return paramInt2;
  }
  
  static int zzm(byte[] paramArrayOfByte, int paramInt, zzgna paramzzgna)
  {
    long l = paramArrayOfByte[paramInt];
    paramInt++;
    if (l >= 0L)
    {
      paramzzgna.zzb = l;
      return paramInt;
    }
    int i = paramInt + 1;
    int j = paramArrayOfByte[paramInt];
    l = l & 0x7F | (j & 0x7F) << 7;
    paramInt = 7;
    while (j < 0)
    {
      j = paramArrayOfByte[i];
      paramInt += 7;
      l |= (j & 0x7F) << paramInt;
      i++;
    }
    paramzzgna.zzb = l;
    return i;
  }
  
  static int zzn(Object paramObject, zzgqz paramzzgqz, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzgna paramzzgna)
    throws IOException
  {
    paramInt1 = ((zzgqj)paramzzgqz).zzc(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzzgna);
    paramzzgna.zzc = paramObject;
    return paramInt1;
  }
  
  static int zzo(Object paramObject, zzgqz paramzzgqz, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzgna paramzzgna)
    throws IOException
  {
    int j = paramInt1 + 1;
    int k = paramArrayOfByte[paramInt1];
    int i = j;
    paramInt1 = k;
    if (k < 0)
    {
      i = zzk(k, paramArrayOfByte, j, paramzzgna);
      paramInt1 = paramzzgna.zza;
    }
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - i))
    {
      paramInt1 += i;
      paramzzgqz.zzi(paramObject, paramArrayOfByte, i, paramInt1, paramzzgna);
      paramzzgna.zzc = paramObject;
      return paramInt1;
    }
    throw zzgpi.zzj();
  }
  
  static long zzp(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 4)] & 0xFF) << 32 | (paramArrayOfByte[(paramInt + 5)] & 0xFF) << 40 | (paramArrayOfByte[(paramInt + 6)] & 0xFF) << 48 | (paramArrayOfByte[(paramInt + 7)] & 0xFF) << 56;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */