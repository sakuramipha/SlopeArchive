package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import sun.misc.Unsafe;

final class zzlu<T>
  implements zzmf<T>
{
  private static final int[] zzub = new int[0];
  private static final Unsafe zzuc = zznd.zzff();
  private final int[] zzud;
  private final Object[] zzue;
  private final int zzuf;
  private final int zzug;
  private final zzlq zzuh;
  private final boolean zzui;
  private final boolean zzuj;
  private final boolean zzuk;
  private final boolean zzul;
  private final int[] zzum;
  private final int zzun;
  private final int zzuo;
  private final zzly zzup;
  private final zzla zzuq;
  private final zzmx<?, ?> zzur;
  private final zzjy<?> zzus;
  private final zzll zzut;
  
  private zzlu(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, zzlq paramzzlq, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, zzly paramzzly, zzla paramzzla, zzmx<?, ?> paramzzmx, zzjy<?> paramzzjy, zzll paramzzll)
  {
    this.zzud = paramArrayOfInt1;
    this.zzue = paramArrayOfObject;
    this.zzuf = paramInt1;
    this.zzug = paramInt2;
    this.zzuj = (paramzzlq instanceof zzkk);
    this.zzuk = paramBoolean1;
    if ((paramzzjy != null) && (paramzzjy.zze(paramzzlq))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    this.zzui = paramBoolean1;
    this.zzul = false;
    this.zzum = paramArrayOfInt2;
    this.zzun = paramInt3;
    this.zzuo = paramInt4;
    this.zzup = paramzzly;
    this.zzuq = paramzzla;
    this.zzur = paramzzmx;
    this.zzus = paramzzjy;
    this.zzuh = paramzzlq;
    this.zzut = paramzzll;
  }
  
  private static <UT, UB> int zza(zzmx<UT, UB> paramzzmx, T paramT)
  {
    return paramzzmx.zzn(paramzzmx.zzr(paramT));
  }
  
  private final int zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, zziz paramzziz)
    throws IOException
  {
    Unsafe localUnsafe = zzuc;
    long l = this.zzud[(paramInt8 + 2)] & 0xFFFFF;
    switch (paramInt7)
    {
    default: 
      break;
    case 68: 
      if (paramInt5 != 3) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(zzap(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramInt3 & 0xFFFFFFF8 | 0x4, paramzziz);
      if (localUnsafe.getInt(paramT, l) == paramInt4) {
        paramArrayOfByte = localUnsafe.getObject(paramT, paramLong);
      } else {
        paramArrayOfByte = null;
      }
      if (paramArrayOfByte == null) {
        localUnsafe.putObject(paramT, paramLong, paramzziz.zznm);
      } else {
        localUnsafe.putObject(paramT, paramLong, zzkm.zza(paramArrayOfByte, paramzziz.zznm));
      }
      break;
    case 67: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
      localUnsafe.putObject(paramT, paramLong, Long.valueOf(zzjo.zzk(paramzziz.zznl)));
      break;
    case 66: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(zzjo.zzw(paramzziz.zznk)));
      break;
    case 63: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      paramInt2 = paramzziz.zznk;
      paramArrayOfByte = zzar(paramInt8);
      if ((paramArrayOfByte != null) && (!paramArrayOfByte.zzan(paramInt2)))
      {
        zzo(paramT).zzb(paramInt3, Long.valueOf(paramInt2));
        return paramInt1;
      }
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(paramInt2));
      break;
    case 61: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = zziy.zze(paramArrayOfByte, paramInt1, paramzziz);
      localUnsafe.putObject(paramT, paramLong, paramzziz.zznm);
      break;
    case 60: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(zzap(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramzziz);
      if (localUnsafe.getInt(paramT, l) == paramInt4) {
        paramArrayOfByte = localUnsafe.getObject(paramT, paramLong);
      } else {
        paramArrayOfByte = null;
      }
      if (paramArrayOfByte == null) {
        localUnsafe.putObject(paramT, paramLong, paramzziz.zznm);
      } else {
        localUnsafe.putObject(paramT, paramLong, zzkm.zza(paramArrayOfByte, paramzziz.zznm));
      }
      localUnsafe.putInt(paramT, l, paramInt4);
      break;
    case 59: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      paramInt2 = paramzziz.zznk;
      if (paramInt2 == 0)
      {
        localUnsafe.putObject(paramT, paramLong, "");
      }
      else
      {
        if (((paramInt6 & 0x20000000) != 0) && (!zznf.zze(paramArrayOfByte, paramInt1, paramInt1 + paramInt2))) {
          throw zzkq.zzdn();
        }
        localUnsafe.putObject(paramT, paramLong, new String(paramArrayOfByte, paramInt1, paramInt2, zzkm.UTF_8));
        paramInt1 += paramInt2;
      }
      localUnsafe.putInt(paramT, l, paramInt4);
      break;
    case 58: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
      boolean bool;
      if (paramzziz.zznl != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      localUnsafe.putObject(paramT, paramLong, Boolean.valueOf(bool));
      break;
    case 57: 
    case 64: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(zziy.zza(paramArrayOfByte, paramInt1)));
      break;
    case 56: 
    case 65: 
      if (paramInt5 != 1) {
        return paramInt1;
      }
      localUnsafe.putObject(paramT, paramLong, Long.valueOf(zziy.zzb(paramArrayOfByte, paramInt1)));
      break;
    case 55: 
    case 62: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(paramzziz.zznk));
      break;
    case 53: 
    case 54: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
      localUnsafe.putObject(paramT, paramLong, Long.valueOf(paramzziz.zznl));
      break;
    case 52: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      localUnsafe.putObject(paramT, paramLong, Float.valueOf(zziy.zzd(paramArrayOfByte, paramInt1)));
      paramInt1 += 4;
      break;
    }
    if (paramInt5 == 1)
    {
      localUnsafe.putObject(paramT, paramLong, Double.valueOf(zziy.zzc(paramArrayOfByte, paramInt1)));
      paramInt1 += 8;
      localUnsafe.putInt(paramT, l, paramInt4);
    }
    return paramInt1;
  }
  
  private final int zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, zziz paramzziz)
    throws IOException
  {
    int i = paramInt1;
    Unsafe localUnsafe = zzuc;
    zzkp localzzkp2 = (zzkp)localUnsafe.getObject(paramT, paramLong2);
    zzkp localzzkp1 = localzzkp2;
    if (!localzzkp2.zzbo())
    {
      int j = localzzkp2.size();
      if (j == 0) {
        j = 10;
      } else {
        j <<= 1;
      }
      localzzkp1 = localzzkp2.zzr(j);
      localUnsafe.putObject(paramT, paramLong2, localzzkp1);
    }
    switch (paramInt7)
    {
    default: 
      paramInt7 = i;
      break;
    case 49: 
      paramInt7 = i;
      if (paramInt5 != 3) {
        break label2394;
      }
      paramT = zzap(paramInt6);
      paramInt4 = paramInt3 & 0xFFFFFFF8 | 0x4;
      paramInt1 = zziy.zza(paramT, paramArrayOfByte, paramInt1, paramInt2, paramInt4, paramzziz);
      localzzkp1.add(paramzziz.zznm);
      for (;;)
      {
        paramInt7 = paramInt1;
        if (paramInt1 >= paramInt2) {
          break;
        }
        paramInt5 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
        paramInt7 = paramInt1;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramInt1 = zziy.zza(paramT, paramArrayOfByte, paramInt5, paramInt2, paramInt4, paramzziz);
        localzzkp1.add(paramzziz.zznm);
      }
    case 34: 
    case 48: 
      if (paramInt5 == 2)
      {
        paramT = (zzle)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
          paramT.zzv(zzjo.zzk(paramzziz.zznl));
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2394;
      }
      paramT = (zzle)localzzkp1;
      paramInt4 = zziy.zzb(paramArrayOfByte, i, paramzziz);
      paramT.zzv(zzjo.zzk(paramzziz.zznl));
      for (;;)
      {
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        paramInt5 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramInt4 = zziy.zzb(paramArrayOfByte, paramInt5, paramzziz);
        paramT.zzv(zzjo.zzk(paramzziz.zznl));
      }
    case 33: 
    case 47: 
      if (paramInt5 == 2)
      {
        paramT = (zzkl)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
          paramT.zzam(zzjo.zzw(paramzziz.zznk));
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2394;
      }
      paramT = (zzkl)localzzkp1;
      paramInt4 = zziy.zza(paramArrayOfByte, i, paramzziz);
      paramT.zzam(zzjo.zzw(paramzziz.zznk));
      for (;;)
      {
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        paramInt5 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramInt4 = zziy.zza(paramArrayOfByte, paramInt5, paramzziz);
        paramT.zzam(zzjo.zzw(paramzziz.zznk));
      }
    case 30: 
    case 44: 
      if (paramInt5 == 2)
      {
        paramInt1 = zziy.zza(paramArrayOfByte, i, localzzkp1, paramzziz);
      }
      else
      {
        paramInt7 = i;
        if (paramInt5 != 0) {
          break label2394;
        }
        paramInt1 = zziy.zza(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkp1, paramzziz);
      }
      paramzziz = (zzkk)paramT;
      paramArrayOfByte = paramzziz.zzrq;
      paramT = paramArrayOfByte;
      if (paramArrayOfByte == zzmy.zzfa()) {
        paramT = null;
      }
      paramT = (zzmy)zzmh.zza(paramInt4, localzzkp1, zzar(paramInt6), paramT, this.zzur);
      paramInt2 = paramInt1;
      if (paramT != null)
      {
        paramzziz.zzrq = paramT;
        paramInt2 = paramInt1;
      }
    case 28: 
    case 27: 
    case 26: 
    case 25: 
    case 42: 
      boolean bool;
      do
      {
        return paramInt2;
        paramInt7 = i;
        if (paramInt5 != 2) {
          break label2394;
        }
        paramInt4 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt1 = paramzziz.zznk;
        if (paramInt1 >= 0)
        {
          if (paramInt1 <= paramArrayOfByte.length - paramInt4)
          {
            if (paramInt1 == 0) {
              localzzkp1.add(zzjc.zznq);
            } else {
              localzzkp1.add(zzjc.zzb(paramArrayOfByte, paramInt4, paramInt1));
            }
            for (;;)
            {
              paramInt4 += paramInt1;
              for (;;)
              {
                paramInt1 = paramInt4;
                if (paramInt4 >= paramInt2) {
                  return paramInt1;
                }
                paramInt5 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
                paramInt1 = paramInt4;
                if (paramInt3 != paramzziz.zznk) {
                  return paramInt1;
                }
                paramInt4 = zziy.zza(paramArrayOfByte, paramInt5, paramzziz);
                paramInt1 = paramzziz.zznk;
                if (paramInt1 < 0) {
                  break label972;
                }
                if (paramInt1 > paramArrayOfByte.length - paramInt4) {
                  break label968;
                }
                if (paramInt1 != 0) {
                  break;
                }
                localzzkp1.add(zzjc.zznq);
              }
              localzzkp1.add(zzjc.zzb(paramArrayOfByte, paramInt4, paramInt1));
            }
            throw zzkq.zzdi();
            throw zzkq.zzdj();
          }
          throw zzkq.zzdi();
        }
        throw zzkq.zzdj();
        paramInt7 = i;
        if (paramInt5 != 2) {
          break label2394;
        }
        return zziy.zza(zzap(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkp1, paramzziz);
        paramInt7 = i;
        if (paramInt5 != 2) {
          break label2394;
        }
        if ((paramLong1 & 0x20000000) == 0L)
        {
          paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
          paramInt4 = paramzziz.zznk;
          if (paramInt4 >= 0)
          {
            if (paramInt4 == 0) {
              localzzkp1.add("");
            } else {
              localzzkp1.add(new String(paramArrayOfByte, paramInt1, paramInt4, zzkm.UTF_8));
            }
            for (;;)
            {
              paramInt1 += paramInt4;
              for (;;)
              {
                paramInt7 = paramInt1;
                if (paramInt1 >= paramInt2) {
                  break label2394;
                }
                paramInt4 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
                paramInt7 = paramInt1;
                if (paramInt3 != paramzziz.zznk) {
                  break label2394;
                }
                paramInt1 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
                paramInt4 = paramzziz.zznk;
                if (paramInt4 < 0) {
                  break label1199;
                }
                if (paramInt4 != 0) {
                  break;
                }
                localzzkp1.add("");
              }
              localzzkp1.add(new String(paramArrayOfByte, paramInt1, paramInt4, zzkm.UTF_8));
            }
            throw zzkq.zzdj();
          }
          throw zzkq.zzdj();
        }
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt5 = paramzziz.zznk;
        if (paramInt5 >= 0)
        {
          if (paramInt5 == 0)
          {
            localzzkp1.add("");
          }
          else
          {
            paramInt4 = paramInt1 + paramInt5;
            if (!zznf.zze(paramArrayOfByte, paramInt1, paramInt4)) {
              break label1411;
            }
            localzzkp1.add(new String(paramArrayOfByte, paramInt1, paramInt5, zzkm.UTF_8));
            paramInt1 = paramInt4;
          }
          for (;;)
          {
            paramInt7 = paramInt1;
            if (paramInt1 >= paramInt2) {
              break label2394;
            }
            paramInt4 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
            paramInt7 = paramInt1;
            if (paramInt3 != paramzziz.zznk) {
              break label2394;
            }
            paramInt4 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
            paramInt5 = paramzziz.zznk;
            if (paramInt5 < 0) {
              break label1407;
            }
            if (paramInt5 == 0)
            {
              localzzkp1.add("");
              paramInt1 = paramInt4;
            }
            else
            {
              paramInt1 = paramInt4 + paramInt5;
              if (!zznf.zze(paramArrayOfByte, paramInt4, paramInt1)) {
                break;
              }
              localzzkp1.add(new String(paramArrayOfByte, paramInt4, paramInt5, zzkm.UTF_8));
            }
          }
          throw zzkq.zzdn();
          throw zzkq.zzdj();
          throw zzkq.zzdn();
        }
        throw zzkq.zzdj();
        if (paramInt5 != 2) {
          break;
        }
        paramT = (zzja)localzzkp1;
        paramInt2 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt1 = paramzziz.zznk + paramInt2;
        while (paramInt2 < paramInt1)
        {
          paramInt2 = zziy.zzb(paramArrayOfByte, paramInt2, paramzziz);
          if (paramzziz.zznl != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          paramT.addBoolean(bool);
        }
      } while (paramInt2 == paramInt1);
      throw zzkq.zzdi();
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2394;
      }
      paramT = (zzja)localzzkp1;
      paramInt1 = zziy.zzb(paramArrayOfByte, i, paramzziz);
      if (paramzziz.zznl != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramT.addBoolean(bool);
      for (;;)
      {
        paramInt7 = paramInt1;
        if (paramInt1 >= paramInt2) {
          break;
        }
        paramInt4 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
        paramInt7 = paramInt1;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramInt1 = zziy.zzb(paramArrayOfByte, paramInt4, paramzziz);
        if (paramzziz.zznl != 0L) {
          bool = true;
        } else {
          bool = false;
        }
        paramT.addBoolean(bool);
      }
    case 24: 
    case 31: 
    case 41: 
    case 45: 
      if (paramInt5 == 2)
      {
        paramT = (zzkl)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.zzam(zziy.zza(paramArrayOfByte, paramInt1));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 5) {
        break label2394;
      }
      paramT = (zzkl)localzzkp1;
      paramT.zzam(zziy.zza(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i + 4;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramT.zzam(zziy.zza(paramArrayOfByte, i));
      }
    case 23: 
    case 32: 
    case 40: 
    case 46: 
      if (paramInt5 == 2)
      {
        paramT = (zzle)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.zzv(zziy.zzb(paramArrayOfByte, paramInt1));
          paramInt1 += 8;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 1) {
        break label2394;
      }
      paramT = (zzle)localzzkp1;
      paramT.zzv(zziy.zzb(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i + 8;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramT.zzv(zziy.zzb(paramArrayOfByte, i));
      }
    case 22: 
    case 29: 
    case 39: 
    case 43: 
      if (paramInt5 == 2)
      {
        paramInt1 = zziy.zza(paramArrayOfByte, i, localzzkp1, paramzziz);
      }
      else
      {
        paramInt7 = i;
        if (paramInt5 == 0) {
          paramInt1 = zziy.zza(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkp1, paramzziz);
        }
      }
      break;
    case 20: 
    case 21: 
    case 37: 
    case 38: 
      if (paramInt5 == 2)
      {
        paramT = (zzle)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
          paramT.zzv(paramzziz.zznl);
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2394;
      }
      paramT = (zzle)localzzkp1;
      paramInt4 = zziy.zzb(paramArrayOfByte, i, paramzziz);
      paramT.zzv(paramzziz.zznl);
      for (;;)
      {
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        paramInt5 = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramInt4 = zziy.zzb(paramArrayOfByte, paramInt5, paramzziz);
        paramT.zzv(paramzziz.zznl);
      }
    case 19: 
    case 36: 
      label968:
      label972:
      label1199:
      label1407:
      label1411:
      if (paramInt5 == 2)
      {
        paramT = (zzkh)localzzkp1;
        paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
        paramInt2 = paramzziz.zznk + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramT.zzc(zziy.zzd(paramArrayOfByte, paramInt1));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          return paramInt1;
        }
        throw zzkq.zzdi();
      }
      paramInt7 = i;
      if (paramInt5 != 5) {
        break label2394;
      }
      paramT = (zzkh)localzzkp1;
      paramT.zzc(zziy.zzd(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt4 = i + 4;
        paramInt1 = paramInt4;
        if (paramInt4 >= paramInt2) {
          break;
        }
        i = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
        paramInt1 = paramInt4;
        if (paramInt3 != paramzziz.zznk) {
          break;
        }
        paramT.zzc(zziy.zzd(paramArrayOfByte, i));
      }
    }
    if (paramInt5 == 2)
    {
      paramT = (zzju)localzzkp1;
      paramInt1 = zziy.zza(paramArrayOfByte, i, paramzziz);
      paramInt2 = paramzziz.zznk + paramInt1;
      while (paramInt1 < paramInt2)
      {
        paramT.zzc(zziy.zzc(paramArrayOfByte, paramInt1));
        paramInt1 += 8;
      }
      if (paramInt1 != paramInt2) {
        throw zzkq.zzdi();
      }
    }
    else
    {
      paramInt7 = i;
      if (paramInt5 == 1)
      {
        paramT = (zzju)localzzkp1;
        paramT.zzc(zziy.zzc(paramArrayOfByte, paramInt1));
        for (;;)
        {
          paramInt4 = i + 8;
          paramInt1 = paramInt4;
          if (paramInt4 >= paramInt2) {
            break;
          }
          i = zziy.zza(paramArrayOfByte, paramInt4, paramzziz);
          paramInt1 = paramInt4;
          if (paramInt3 != paramzziz.zznk) {
            break;
          }
          paramT.zzc(zziy.zzc(paramArrayOfByte, i));
        }
      }
      label2394:
      paramInt1 = paramInt7;
    }
    return paramInt1;
  }
  
  private final <K, V> int zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong, zziz paramzziz)
    throws IOException
  {
    Unsafe localUnsafe = zzuc;
    Object localObject3 = zzaq(paramInt3);
    Object localObject2 = localUnsafe.getObject(paramT, paramLong);
    Object localObject1 = localObject2;
    if (this.zzut.zzj(localObject2))
    {
      localObject1 = this.zzut.zzl(localObject3);
      this.zzut.zzb(localObject1, localObject2);
      localUnsafe.putObject(paramT, paramLong, localObject1);
    }
    localObject2 = this.zzut.zzm(localObject3);
    localObject3 = this.zzut.zzh(localObject1);
    paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
    paramInt3 = paramzziz.zznk;
    if ((paramInt3 >= 0) && (paramInt3 <= paramInt2 - paramInt1))
    {
      int k = paramInt3 + paramInt1;
      paramT = ((zzlj)localObject2).zztv;
      localObject1 = ((zzlj)localObject2).zztx;
      while (paramInt1 < k)
      {
        int i = paramInt1 + 1;
        int j = paramArrayOfByte[paramInt1];
        paramInt3 = i;
        paramInt1 = j;
        if (j < 0)
        {
          paramInt3 = zziy.zza(j, paramArrayOfByte, i, paramzziz);
          paramInt1 = paramzziz.zznk;
        }
        i = paramInt1 >>> 3;
        j = paramInt1 & 0x7;
        if (i != 1)
        {
          if ((i == 2) && (j == ((zzlj)localObject2).zztw.zzfk()))
          {
            paramInt1 = zza(paramArrayOfByte, paramInt3, paramInt2, ((zzlj)localObject2).zztw, ((zzlj)localObject2).zztx.getClass(), paramzziz);
            localObject1 = paramzziz.zznm;
          }
        }
        else if (j == ((zzlj)localObject2).zztu.zzfk())
        {
          paramInt1 = zza(paramArrayOfByte, paramInt3, paramInt2, ((zzlj)localObject2).zztu, null, paramzziz);
          paramT = paramzziz.zznm;
          continue;
        }
        paramInt1 = zziy.zza(paramInt1, paramArrayOfByte, paramInt3, paramInt2, paramzziz);
      }
      if (paramInt1 == k)
      {
        ((Map)localObject3).put(paramT, localObject1);
        return k;
      }
      throw zzkq.zzdm();
    }
    throw zzkq.zzdi();
  }
  
  private static int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zznm paramzznm, Class<?> paramClass, zziz paramzziz)
    throws IOException
  {
    switch (zzlv.zzox[paramzznm.ordinal()])
    {
    default: 
      throw new RuntimeException("unsupported field type.");
    case 17: 
      paramInt1 = zziy.zzd(paramArrayOfByte, paramInt1, paramzziz);
      break;
    case 16: 
      paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
      paramzziz.zznm = Long.valueOf(zzjo.zzk(paramzziz.zznl));
      break;
    case 15: 
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      paramzziz.zznm = Integer.valueOf(zzjo.zzw(paramzziz.zznk));
      break;
    case 14: 
      paramInt1 = zziy.zza(zzmd.zzej().zzf(paramClass), paramArrayOfByte, paramInt1, paramInt2, paramzziz);
      break;
    case 12: 
    case 13: 
      paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
      paramzziz.zznm = Long.valueOf(paramzziz.zznl);
      break;
    case 9: 
    case 10: 
    case 11: 
      paramInt1 = zziy.zza(paramArrayOfByte, paramInt1, paramzziz);
      paramzziz.zznm = Integer.valueOf(paramzziz.zznk);
      break;
    case 8: 
      paramzziz.zznm = Float.valueOf(zziy.zzd(paramArrayOfByte, paramInt1));
      break;
    case 6: 
    case 7: 
      paramzziz.zznm = Long.valueOf(zziy.zzb(paramArrayOfByte, paramInt1));
      break;
    case 4: 
    case 5: 
      paramzziz.zznm = Integer.valueOf(zziy.zza(paramArrayOfByte, paramInt1));
      paramInt1 += 4;
      break;
    case 3: 
      paramzziz.zznm = Double.valueOf(zziy.zzc(paramArrayOfByte, paramInt1));
      paramInt1 += 8;
      break;
    case 2: 
      paramInt1 = zziy.zze(paramArrayOfByte, paramInt1, paramzziz);
      break;
    }
    paramInt1 = zziy.zzb(paramArrayOfByte, paramInt1, paramzziz);
    boolean bool;
    if (paramzziz.zznl != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    paramzziz.zznm = Boolean.valueOf(bool);
    return paramInt1;
  }
  
  static <T> zzlu<T> zza(Class<T> paramClass, zzlo paramzzlo, zzly paramzzly, zzla paramzzla, zzmx<?, ?> paramzzmx, zzjy<?> paramzzjy, zzll paramzzll)
  {
    if ((paramzzlo instanceof zzme))
    {
      zzme localzzme = (zzme)paramzzlo;
      int j = localzzme.zzec();
      i = zzkk.zze.zzsg;
      int n = 0;
      boolean bool;
      if (j == i) {
        bool = true;
      } else {
        bool = false;
      }
      String str = localzzme.zzek();
      int i10 = str.length();
      int i3 = str.charAt(0);
      if (i3 >= 55296)
      {
        k = i3 & 0x1FFF;
        m = 1;
        j = 13;
        for (;;)
        {
          i = m + 1;
          m = str.charAt(m);
          if (m < 55296) {
            break;
          }
          k |= (m & 0x1FFF) << j;
          j += 13;
          m = i;
        }
        i3 = k | m << j;
        j = i;
      }
      else
      {
        j = 1;
      }
      i = j + 1;
      int m = str.charAt(j);
      j = i;
      int k = m;
      if (m >= 55296)
      {
        k = m & 0x1FFF;
        j = 13;
        for (m = i;; m = i)
        {
          i = m + 1;
          m = str.charAt(m);
          if (m < 55296) {
            break;
          }
          k |= (m & 0x1FFF) << j;
          j += 13;
        }
        k |= m << j;
        j = i;
      }
      int i1;
      if (k == 0)
      {
        paramClass = zzub;
        i5 = 0;
        i2 = 0;
        i1 = 0;
        k = 0;
        i4 = 0;
        i = 0;
        m = n;
        n = i2;
      }
      else
      {
        k = j + 1;
        j = str.charAt(j);
        i = j;
        m = k;
        if (j >= 55296)
        {
          j &= 0x1FFF;
          i = 13;
          m = k;
          k = j;
          for (;;)
          {
            j = m + 1;
            m = str.charAt(m);
            if (m < 55296) {
              break;
            }
            k |= (m & 0x1FFF) << i;
            i += 13;
            m = j;
          }
          i = k | m << i;
          m = j;
        }
        j = m + 1;
        m = str.charAt(m);
        i4 = m;
        k = j;
        if (m >= 55296)
        {
          m &= 0x1FFF;
          k = 13;
          for (n = j;; n = j)
          {
            j = n + 1;
            n = str.charAt(n);
            if (n < 55296) {
              break;
            }
            m |= (n & 0x1FFF) << k;
            k += 13;
          }
          i4 = m | n << k;
          k = j;
        }
        m = k + 1;
        n = str.charAt(k);
        j = n;
        k = m;
        if (n >= 55296)
        {
          j = n & 0x1FFF;
          k = 13;
          n = m;
          m = j;
          for (;;)
          {
            j = n + 1;
            n = str.charAt(n);
            if (n < 55296) {
              break;
            }
            m |= (n & 0x1FFF) << k;
            k += 13;
            n = j;
          }
          m |= n << k;
          k = j;
          j = m;
        }
        m = k + 1;
        n = str.charAt(k);
        k = n;
        i1 = m;
        if (n >= 55296)
        {
          k = n & 0x1FFF;
          n = 13;
          i1 = m;
          m = k;
          for (;;)
          {
            k = i1 + 1;
            i1 = str.charAt(i1);
            if (i1 < 55296) {
              break;
            }
            m |= (i1 & 0x1FFF) << n;
            n += 13;
            i1 = k;
          }
          m |= i1 << n;
          i1 = k;
          k = m;
        }
        n = i1 + 1;
        i1 = str.charAt(i1);
        m = i1;
        i2 = n;
        if (i1 >= 55296)
        {
          m = i1 & 0x1FFF;
          i1 = 13;
          i2 = n;
          n = m;
          for (;;)
          {
            m = i2 + 1;
            i2 = str.charAt(i2);
            if (i2 < 55296) {
              break;
            }
            n |= (i2 & 0x1FFF) << i1;
            i1 += 13;
            i2 = m;
          }
          n |= i2 << i1;
          i2 = m;
          m = n;
        }
        i1 = i2 + 1;
        i5 = str.charAt(i2);
        n = i5;
        i2 = i1;
        if (i5 >= 55296)
        {
          i2 = i5 & 0x1FFF;
          n = 13;
          for (i5 = i1;; i5 = i1)
          {
            i1 = i5 + 1;
            i5 = str.charAt(i5);
            if (i5 < 55296) {
              break;
            }
            i2 |= (i5 & 0x1FFF) << n;
            n += 13;
          }
          n = i2 | i5 << n;
          i2 = i1;
        }
        i6 = i2 + 1;
        i5 = str.charAt(i2);
        if (i5 >= 55296)
        {
          i5 &= 0x1FFF;
          i2 = 13;
          for (;;)
          {
            i1 = i6 + 1;
            i6 = str.charAt(i6);
            if (i6 < 55296) {
              break;
            }
            i5 |= (i6 & 0x1FFF) << i2;
            i2 += 13;
            i6 = i1;
          }
          i5 |= i6 << i2;
        }
        else
        {
          i1 = i6;
        }
        i6 = i1 + 1;
        i7 = str.charAt(i1);
        i2 = i7;
        i1 = i6;
        if (i7 >= 55296)
        {
          i2 = i7 & 0x1FFF;
          i1 = 13;
          i7 = i6;
          i6 = i2;
          for (;;)
          {
            i2 = i7 + 1;
            i7 = str.charAt(i7);
            if (i7 < 55296) {
              break;
            }
            i6 |= (i7 & 0x1FFF) << i1;
            i1 += 13;
            i7 = i2;
          }
          i6 |= i7 << i1;
          i1 = i2;
          i2 = i6;
        }
        paramClass = new int[i2 + n + i5];
        i5 = k;
        i8 = (i << 1) + i4;
        k = i2;
        i2 = i;
        i6 = i1;
        i7 = n;
        i = k;
        i4 = m;
        k = i8;
        i1 = j;
        n = i5;
        j = i6;
        i5 = i7;
        m = i2;
      }
      Unsafe localUnsafe = zzuc;
      Object[] arrayOfObject2 = localzzme.zzel();
      paramzzlo = localzzme.zzee().getClass();
      int[] arrayOfInt = new int[i4 * 3];
      Object[] arrayOfObject1 = new Object[i4 << 1];
      int i19 = i + i5;
      int i2 = i;
      int i6 = j;
      int i8 = i19;
      int i4 = 0;
      int i9 = 0;
      j = i2;
      i2 = i4;
      i4 = i1;
      int i5 = n;
      n = i6;
      int i7 = m;
      i6 = i10;
      while (n < i6)
      {
        m = n + 1;
        i10 = str.charAt(n);
        if (i10 >= 55296)
        {
          i1 = i10 & 0x1FFF;
          n = 13;
          for (;;)
          {
            i10 = m + 1;
            i11 = str.charAt(m);
            m = i;
            if (i11 < 55296) {
              break;
            }
            i1 |= (i11 & 0x1FFF) << n;
            n += 13;
            i = m;
            m = i10;
          }
          i = i1 | i11 << n;
          n = i10;
          i10 = i;
        }
        else
        {
          n = m;
          m = i;
        }
        i = n + 1;
        int i12 = str.charAt(n);
        if (i12 >= 55296)
        {
          i1 = i12 & 0x1FFF;
          i11 = i;
          i = 13;
          for (;;)
          {
            n = i11 + 1;
            i11 = str.charAt(i11);
            if (i11 < 55296) {
              break;
            }
            i1 |= (i11 & 0x1FFF) << i;
            i += 13;
            i11 = n;
          }
          i12 = i1 | i11 << i;
        }
        else
        {
          n = i;
        }
        int i21 = i12 & 0xFF;
        int i11 = i2;
        if ((i12 & 0x400) != 0)
        {
          paramClass[i2] = i9;
          i11 = i2 + 1;
        }
        Object localObject;
        int i16;
        int i15;
        int i17;
        int i14;
        int i13;
        if (i21 >= 51)
        {
          i2 = n + 1;
          n = str.charAt(n);
          i = i2;
          i1 = n;
          if (n >= 55296)
          {
            i1 = n & 0x1FFF;
            i = 13;
            for (;;)
            {
              n = i2 + 1;
              i2 = str.charAt(i2);
              if (i2 < 55296) {
                break;
              }
              i1 |= (i2 & 0x1FFF) << i;
              i += 13;
              i2 = n;
            }
            i1 |= i2 << i;
            i = n;
          }
          i2 = i21 - 51;
          if ((i2 != 9) && (i2 != 17))
          {
            n = k;
            if (i2 == 12)
            {
              n = k;
              if ((i3 & 0x1) == 1)
              {
                arrayOfObject1[((i9 / 3 << 1) + 1)] = arrayOfObject2[k];
                n = k + 1;
              }
            }
            k = n;
          }
          else
          {
            arrayOfObject1[((i9 / 3 << 1) + 1)] = arrayOfObject2[k];
            k++;
          }
          n = i1 << 1;
          localObject = arrayOfObject2[n];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zza(paramzzlo, (String)localObject);
            arrayOfObject2[n] = localObject;
          }
          i16 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          n++;
          localObject = arrayOfObject2[n];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zza(paramzzlo, (String)localObject);
            arrayOfObject2[n] = localObject;
          }
          i15 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i17 = 0;
          n = i;
          i14 = j;
          i13 = i8;
          i = k;
        }
        else
        {
          i1 = k + 1;
          localObject = zza(paramzzlo, (String)arrayOfObject2[k]);
          if ((i21 != 9) && (i21 != 17))
          {
            if ((i21 != 27) && (i21 != 49))
            {
              if ((i21 != 12) && (i21 != 30) && (i21 != 44))
              {
                i = i1;
                k = j;
                if (i21 == 50)
                {
                  i = j + 1;
                  paramClass[j] = i9;
                  i2 = i9 / 3 << 1;
                  k = i1 + 1;
                  arrayOfObject1[i2] = arrayOfObject2[i1];
                  if ((i12 & 0x800) != 0)
                  {
                    j = k + 1;
                    arrayOfObject1[(i2 + 1)] = arrayOfObject2[k];
                    k = i;
                    i = j;
                  }
                }
                else
                {
                  break label2245;
                }
                j = k;
                k = i;
                i = j;
                break label2245;
              }
              i = i1;
              k = j;
              if ((i3 & 0x1) != 1) {
                break label2245;
              }
              k = i9 / 3;
              i = i1 + 1;
              arrayOfObject1[((k << 1) + 1)] = arrayOfObject2[i1];
            }
            else
            {
              k = i9 / 3;
              i = i1 + 1;
              arrayOfObject1[((k << 1) + 1)] = arrayOfObject2[i1];
            }
            k = j;
          }
          else
          {
            arrayOfObject1[((i9 / 3 << 1) + 1)] = ((Field)localObject).getType();
            k = j;
            i = i1;
          }
          label2245:
          int i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          if (((i3 & 0x1) == 1) && (i21 <= 17))
          {
            i1 = n + 1;
            i2 = str.charAt(n);
            j = i1;
            n = i2;
            if (i2 >= 55296)
            {
              i2 &= 0x1FFF;
              j = 13;
              for (;;)
              {
                n = i1 + 1;
                i1 = str.charAt(i1);
                if (i1 < 55296) {
                  break;
                }
                i2 |= (i1 & 0x1FFF) << j;
                j += 13;
                i1 = n;
              }
              i1 = i2 | i1 << j;
              j = n;
              n = i1;
            }
            i1 = (i7 << 1) + n / 32;
            localObject = arrayOfObject2[i1];
            if ((localObject instanceof Field))
            {
              localObject = (Field)localObject;
            }
            else
            {
              localObject = zza(paramzzlo, (String)localObject);
              arrayOfObject2[i1] = localObject;
            }
            i13 = (int)localUnsafe.objectFieldOffset((Field)localObject);
            i2 = n % 32;
            i1 = j;
            j = i13;
          }
          else
          {
            j = 0;
            i2 = 0;
            i1 = n;
          }
          int i18 = i;
          i16 = i20;
          i15 = j;
          i17 = i2;
          n = i1;
          i14 = k;
          i13 = i8;
          i = i18;
          if (i21 >= 18)
          {
            i16 = i20;
            i15 = j;
            i17 = i2;
            n = i1;
            i14 = k;
            i13 = i8;
            i = i18;
            if (i21 <= 49)
            {
              paramClass[i8] = i20;
              i13 = i8 + 1;
              i = i18;
              i14 = k;
              n = i1;
              i17 = i2;
              i15 = j;
              i16 = i20;
            }
          }
        }
        i1 = i9 + 1;
        arrayOfInt[i9] = i10;
        i2 = i1 + 1;
        if ((i12 & 0x200) != 0) {
          j = 536870912;
        } else {
          j = 0;
        }
        if ((i12 & 0x100) != 0) {
          k = 268435456;
        } else {
          k = 0;
        }
        arrayOfInt[i1] = (i16 | k | j | i21 << 20);
        i9 = i2 + 1;
        arrayOfInt[i2] = (i17 << 20 | i15);
        k = i;
        i = m;
        i2 = i11;
        j = i14;
        i8 = i13;
      }
      return new zzlu(arrayOfInt, arrayOfObject1, i4, i5, localzzme.zzee(), bool, false, paramClass, i, i19, paramzzly, paramzzla, paramzzmx, paramzzjy, paramzzll);
    }
    ((zzms)paramzzlo).zzec();
    int i = zzkk.zze.zzsg;
    throw new NoSuchMethodError();
  }
  
  private final <K, V, UT, UB> UB zza(int paramInt1, int paramInt2, Map<K, V> paramMap, zzko paramzzko, UB paramUB, zzmx<UT, UB> paramzzmx)
  {
    zzlj localzzlj = this.zzut.zzm(zzaq(paramInt1));
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!paramzzko.zzan(((Integer)localEntry.getValue()).intValue()))
      {
        paramMap = paramUB;
        if (paramUB == null) {
          paramMap = paramzzmx.zzez();
        }
        paramUB = zzjc.zzu(zzli.zza(localzzlj, localEntry.getKey(), localEntry.getValue()));
        zzjr localzzjr = paramUB.zzby();
        try
        {
          zzli.zza(localzzjr, localzzlj, localEntry.getKey(), localEntry.getValue());
          paramzzmx.zza(paramMap, paramInt2, paramUB.zzbx());
          localIterator.remove();
          paramUB = paramMap;
        }
        catch (IOException paramMap)
        {
          throw new RuntimeException(paramMap);
        }
      }
    }
    return paramUB;
  }
  
  private static Field zza(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (localObject2 : paramClass.getDeclaredFields()) {
        if (paramString.equals(((Field)localObject2).getName())) {
          return (Field)localObject2;
        }
      }
      paramClass = paramClass.getName();
      Object localObject2 = Arrays.toString((Object[])???);
      ??? = new StringBuilder(String.valueOf(paramString).length() + 40 + String.valueOf(paramClass).length() + String.valueOf(localObject2).length());
      ((StringBuilder)???).append("Field ");
      ((StringBuilder)???).append(paramString);
      ((StringBuilder)???).append(" for ");
      ((StringBuilder)???).append(paramClass);
      ((StringBuilder)???).append(" not found. Known fields are ");
      ((StringBuilder)???).append((String)localObject2);
      throw new RuntimeException(((StringBuilder)???).toString());
    }
  }
  
  private static void zza(int paramInt, Object paramObject, zzns paramzzns)
    throws IOException
  {
    if ((paramObject instanceof String))
    {
      paramzzns.zza(paramInt, (String)paramObject);
      return;
    }
    paramzzns.zza(paramInt, (zzjc)paramObject);
  }
  
  private static <UT, UB> void zza(zzmx<UT, UB> paramzzmx, T paramT, zzns paramzzns)
    throws IOException
  {
    paramzzmx.zza(paramzzmx.zzr(paramT), paramzzns);
  }
  
  private final <K, V> void zza(zzns paramzzns, int paramInt1, Object paramObject, int paramInt2)
    throws IOException
  {
    if (paramObject != null) {
      paramzzns.zza(paramInt1, this.zzut.zzm(zzaq(paramInt2)), this.zzut.zzi(paramObject));
    }
  }
  
  private final void zza(T paramT1, T paramT2, int paramInt)
  {
    long l = zzas(paramInt) & 0xFFFFF;
    if (!zza(paramT2, paramInt)) {
      return;
    }
    Object localObject = zznd.zzo(paramT1, l);
    paramT2 = zznd.zzo(paramT2, l);
    if ((localObject != null) && (paramT2 != null))
    {
      zznd.zza(paramT1, l, zzkm.zza(localObject, paramT2));
      zzb(paramT1, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      zznd.zza(paramT1, l, paramT2);
      zzb(paramT1, paramInt);
    }
  }
  
  private final boolean zza(T paramT, int paramInt)
  {
    if (this.zzuk)
    {
      paramInt = zzas(paramInt);
      long l = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return zznd.zzo(paramT, l) != null;
      case 16: 
        return zznd.zzk(paramT, l) != 0L;
      case 15: 
        return zznd.zzj(paramT, l) != 0;
      case 14: 
        return zznd.zzk(paramT, l) != 0L;
      case 13: 
        return zznd.zzj(paramT, l) != 0;
      case 12: 
        return zznd.zzj(paramT, l) != 0;
      case 11: 
        return zznd.zzj(paramT, l) != 0;
      case 10: 
        return !zzjc.zznq.equals(zznd.zzo(paramT, l));
      case 9: 
        return zznd.zzo(paramT, l) != null;
      case 8: 
        paramT = zznd.zzo(paramT, l);
        if ((paramT instanceof String)) {
          return !((String)paramT).isEmpty();
        }
        if ((paramT instanceof zzjc)) {
          return !zzjc.zznq.equals(paramT);
        }
        throw new IllegalArgumentException();
      case 7: 
        return zznd.zzl(paramT, l);
      case 6: 
        return zznd.zzj(paramT, l) != 0;
      case 5: 
        return zznd.zzk(paramT, l) != 0L;
      case 4: 
        return zznd.zzj(paramT, l) != 0;
      case 3: 
        return zznd.zzk(paramT, l) != 0L;
      case 2: 
        return zznd.zzk(paramT, l) != 0L;
      case 1: 
        return zznd.zzm(paramT, l) != 0.0F;
      }
      return zznd.zzn(paramT, l) != 0.0D;
    }
    paramInt = zzat(paramInt);
    return (zznd.zzj(paramT, paramInt & 0xFFFFF) & 1 << (paramInt >>> 20)) != 0;
  }
  
  private final boolean zza(T paramT, int paramInt1, int paramInt2)
  {
    return zznd.zzj(paramT, zzat(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  private final boolean zza(T paramT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.zzuk) {
      return zza(paramT, paramInt1);
    }
    return (paramInt2 & paramInt3) != 0;
  }
  
  private static boolean zza(Object paramObject, int paramInt, zzmf paramzzmf)
  {
    return paramzzmf.zzp(zznd.zzo(paramObject, paramInt & 0xFFFFF));
  }
  
  private final zzmf zzap(int paramInt)
  {
    paramInt = paramInt / 3 << 1;
    zzmf localzzmf = (zzmf)this.zzue[paramInt];
    if (localzzmf != null) {
      return localzzmf;
    }
    localzzmf = zzmd.zzej().zzf((Class)this.zzue[(paramInt + 1)]);
    this.zzue[paramInt] = localzzmf;
    return localzzmf;
  }
  
  private final Object zzaq(int paramInt)
  {
    return this.zzue[(paramInt / 3 << 1)];
  }
  
  private final zzko zzar(int paramInt)
  {
    return (zzko)this.zzue[((paramInt / 3 << 1) + 1)];
  }
  
  private final int zzas(int paramInt)
  {
    return this.zzud[(paramInt + 1)];
  }
  
  private final int zzat(int paramInt)
  {
    return this.zzud[(paramInt + 2)];
  }
  
  private final int zzau(int paramInt)
  {
    if ((paramInt >= this.zzuf) && (paramInt <= this.zzug)) {
      return zzq(paramInt, 0);
    }
    return -1;
  }
  
  private final void zzb(T paramT, int paramInt)
  {
    if (this.zzuk) {
      return;
    }
    paramInt = zzat(paramInt);
    long l = paramInt & 0xFFFFF;
    zznd.zza(paramT, l, zznd.zzj(paramT, l) | 1 << (paramInt >>> 20));
  }
  
  private final void zzb(T paramT, int paramInt1, int paramInt2)
  {
    zznd.zza(paramT, zzat(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void zzb(T paramT, zzns paramzzns)
    throws IOException
  {
    if (this.zzui)
    {
      localObject1 = this.zzus.zzb(paramT);
      if (!((zzkb)localObject1).zzos.isEmpty())
      {
        localIterator = ((zzkb)localObject1).iterator();
        localObject1 = (Map.Entry)localIterator.next();
        break label56;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = null;
    label56:
    int j = -1;
    int i1 = this.zzud.length;
    Unsafe localUnsafe = zzuc;
    int m = 0;
    int i = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (m >= i1) {
        break;
      }
      int i3 = zzas(m);
      localObject2 = this.zzud;
      int i4 = localObject2[m];
      int i2 = (0xFF00000 & i3) >>> 20;
      int n;
      if ((!this.zzuk) && (i2 <= 17))
      {
        int i5 = localObject2[(m + 2)];
        n = i5 & 0xFFFFF;
        int k = j;
        if (n != j)
        {
          i = localUnsafe.getInt(paramT, n);
          k = n;
        }
        n = 1 << (i5 >>> 20);
        j = k;
      }
      else
      {
        n = 0;
      }
      while ((localObject1 != null) && (this.zzus.zza((Map.Entry)localObject1) <= i4))
      {
        this.zzus.zza(paramzzns, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l = i3 & 0xFFFFF;
      switch (i2)
      {
      }
      for (;;)
      {
        break;
        if (zza(paramT, i4, m))
        {
          paramzzns.zzb(i4, localUnsafe.getObject(paramT, l), zzap(m));
          continue;
          if (zza(paramT, i4, m))
          {
            paramzzns.zzb(i4, zzh(paramT, l));
            continue;
            if (zza(paramT, i4, m))
            {
              paramzzns.zze(i4, zzg(paramT, l));
              continue;
              if (zza(paramT, i4, m))
              {
                paramzzns.zzj(i4, zzh(paramT, l));
                continue;
                if (zza(paramT, i4, m))
                {
                  paramzzns.zzm(i4, zzg(paramT, l));
                  continue;
                  if (zza(paramT, i4, m))
                  {
                    paramzzns.zzn(i4, zzg(paramT, l));
                    continue;
                    if (zza(paramT, i4, m))
                    {
                      paramzzns.zzd(i4, zzg(paramT, l));
                      continue;
                      if (zza(paramT, i4, m))
                      {
                        paramzzns.zza(i4, (zzjc)localUnsafe.getObject(paramT, l));
                        continue;
                        if (zza(paramT, i4, m))
                        {
                          paramzzns.zza(i4, localUnsafe.getObject(paramT, l), zzap(m));
                          continue;
                          if (zza(paramT, i4, m))
                          {
                            zza(i4, localUnsafe.getObject(paramT, l), paramzzns);
                            continue;
                            if (zza(paramT, i4, m))
                            {
                              paramzzns.zzb(i4, zzi(paramT, l));
                              continue;
                              if (zza(paramT, i4, m))
                              {
                                paramzzns.zzf(i4, zzg(paramT, l));
                                continue;
                                if (zza(paramT, i4, m))
                                {
                                  paramzzns.zzc(i4, zzh(paramT, l));
                                  continue;
                                  if (zza(paramT, i4, m))
                                  {
                                    paramzzns.zzc(i4, zzg(paramT, l));
                                    continue;
                                    if (zza(paramT, i4, m))
                                    {
                                      paramzzns.zza(i4, zzh(paramT, l));
                                      continue;
                                      if (zza(paramT, i4, m))
                                      {
                                        paramzzns.zzi(i4, zzh(paramT, l));
                                        continue;
                                        if (zza(paramT, i4, m))
                                        {
                                          paramzzns.zza(i4, zzf(paramT, l));
                                          continue;
                                          if (zza(paramT, i4, m))
                                          {
                                            paramzzns.zza(i4, zze(paramT, l));
                                            continue;
                                            zza(paramzzns, i4, localUnsafe.getObject(paramT, l), m);
                                            continue;
                                            zzmh.zzb(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, zzap(m));
                                            continue;
                                            zzmh.zze(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzj(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzg(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzl(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzm(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzi(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzn(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzk(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzf(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzh(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzd(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzc(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zzb(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zza(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, true);
                                            continue;
                                            zzmh.zze(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzj(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzg(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzl(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzm(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzi(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzb(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns);
                                            continue;
                                            zzmh.zza(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, zzap(m));
                                            continue;
                                            zzmh.zza(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns);
                                            continue;
                                            zzmh.zzn(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzk(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzf(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzh(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzd(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzc(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zzb(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            zzmh.zza(this.zzud[m], (List)localUnsafe.getObject(paramT, l), paramzzns, false);
                                            break;
                                            if ((n & i) != 0)
                                            {
                                              paramzzns.zzb(i4, localUnsafe.getObject(paramT, l), zzap(m));
                                              break;
                                              if ((n & i) != 0)
                                              {
                                                paramzzns.zzb(i4, localUnsafe.getLong(paramT, l));
                                                break;
                                                if ((n & i) != 0)
                                                {
                                                  paramzzns.zze(i4, localUnsafe.getInt(paramT, l));
                                                  break;
                                                  if ((n & i) != 0)
                                                  {
                                                    paramzzns.zzj(i4, localUnsafe.getLong(paramT, l));
                                                    break;
                                                    if ((n & i) != 0)
                                                    {
                                                      paramzzns.zzm(i4, localUnsafe.getInt(paramT, l));
                                                      break;
                                                      if ((n & i) != 0)
                                                      {
                                                        paramzzns.zzn(i4, localUnsafe.getInt(paramT, l));
                                                        break;
                                                        if ((n & i) != 0)
                                                        {
                                                          paramzzns.zzd(i4, localUnsafe.getInt(paramT, l));
                                                          break;
                                                          if ((n & i) != 0)
                                                          {
                                                            paramzzns.zza(i4, (zzjc)localUnsafe.getObject(paramT, l));
                                                            break;
                                                            if ((n & i) != 0)
                                                            {
                                                              paramzzns.zza(i4, localUnsafe.getObject(paramT, l), zzap(m));
                                                              break;
                                                              if ((n & i) != 0)
                                                              {
                                                                zza(i4, localUnsafe.getObject(paramT, l), paramzzns);
                                                                break;
                                                                if ((n & i) != 0)
                                                                {
                                                                  paramzzns.zzb(i4, zznd.zzl(paramT, l));
                                                                  break;
                                                                  if ((n & i) != 0)
                                                                  {
                                                                    paramzzns.zzf(i4, localUnsafe.getInt(paramT, l));
                                                                    break;
                                                                    if ((n & i) != 0)
                                                                    {
                                                                      paramzzns.zzc(i4, localUnsafe.getLong(paramT, l));
                                                                      break;
                                                                      if ((n & i) != 0)
                                                                      {
                                                                        paramzzns.zzc(i4, localUnsafe.getInt(paramT, l));
                                                                        break;
                                                                        if ((n & i) != 0)
                                                                        {
                                                                          paramzzns.zza(i4, localUnsafe.getLong(paramT, l));
                                                                          break;
                                                                          if ((n & i) != 0)
                                                                          {
                                                                            paramzzns.zzi(i4, localUnsafe.getLong(paramT, l));
                                                                            break;
                                                                            if ((n & i) != 0)
                                                                            {
                                                                              paramzzns.zza(i4, zznd.zzm(paramT, l));
                                                                              break;
                                                                              if ((n & i) != 0) {
                                                                                paramzzns.zza(i4, zznd.zzn(paramT, l));
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      m += 3;
    }
    while (localObject2 != null)
    {
      this.zzus.zza(paramzzns, (Map.Entry)localObject2);
      if (localIterator.hasNext()) {
        localObject2 = (Map.Entry)localIterator.next();
      } else {
        localObject2 = null;
      }
    }
    zza(this.zzur, paramT, paramzzns);
  }
  
  private final void zzb(T paramT1, T paramT2, int paramInt)
  {
    int j = zzas(paramInt);
    int i = this.zzud[paramInt];
    long l = j & 0xFFFFF;
    if (!zza(paramT2, i, paramInt)) {
      return;
    }
    Object localObject = zznd.zzo(paramT1, l);
    paramT2 = zznd.zzo(paramT2, l);
    if ((localObject != null) && (paramT2 != null))
    {
      zznd.zza(paramT1, l, zzkm.zza(localObject, paramT2));
      zzb(paramT1, i, paramInt);
      return;
    }
    if (paramT2 != null)
    {
      zznd.zza(paramT1, l, paramT2);
      zzb(paramT1, i, paramInt);
    }
  }
  
  private final boolean zzc(T paramT1, T paramT2, int paramInt)
  {
    return zza(paramT1, paramInt) == zza(paramT2, paramInt);
  }
  
  private static <E> List<E> zzd(Object paramObject, long paramLong)
  {
    return (List)zznd.zzo(paramObject, paramLong);
  }
  
  private static <T> double zze(T paramT, long paramLong)
  {
    return ((Double)zznd.zzo(paramT, paramLong)).doubleValue();
  }
  
  private static <T> float zzf(T paramT, long paramLong)
  {
    return ((Float)zznd.zzo(paramT, paramLong)).floatValue();
  }
  
  private static <T> int zzg(T paramT, long paramLong)
  {
    return ((Integer)zznd.zzo(paramT, paramLong)).intValue();
  }
  
  private static <T> long zzh(T paramT, long paramLong)
  {
    return ((Long)zznd.zzo(paramT, paramLong)).longValue();
  }
  
  private static <T> boolean zzi(T paramT, long paramLong)
  {
    return ((Boolean)zznd.zzo(paramT, paramLong)).booleanValue();
  }
  
  private static zzmy zzo(Object paramObject)
  {
    zzkk localzzkk = (zzkk)paramObject;
    zzmy localzzmy = localzzkk.zzrq;
    paramObject = localzzmy;
    if (localzzmy == zzmy.zzfa())
    {
      paramObject = zzmy.zzfb();
      localzzkk.zzrq = ((zzmy)paramObject);
    }
    return (zzmy)paramObject;
  }
  
  private final int zzp(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= this.zzuf) && (paramInt1 <= this.zzug)) {
      return zzq(paramInt1, paramInt2);
    }
    return -1;
  }
  
  private final int zzq(int paramInt1, int paramInt2)
  {
    int i = this.zzud.length / 3 - 1;
    while (paramInt2 <= i)
    {
      int m = i + paramInt2 >>> 1;
      int j = m * 3;
      int k = this.zzud[j];
      if (paramInt1 == k) {
        return j;
      }
      if (paramInt1 < k) {
        i = m - 1;
      } else {
        paramInt2 = m + 1;
      }
    }
    return -1;
  }
  
  /* Error */
  public final boolean equals(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	com/google/android/gms/internal/drive/zzlu:zzud	[I
    //   4: arraylength
    //   5: istore 4
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: istore 6
    //   12: iload_3
    //   13: iload 4
    //   15: if_icmpge +954 -> 969
    //   18: aload_0
    //   19: iload_3
    //   20: invokespecial 637	com/google/android/gms/internal/drive/zzlu:zzas	(I)I
    //   23: istore 5
    //   25: iload 5
    //   27: ldc 118
    //   29: iand
    //   30: i2l
    //   31: lstore 9
    //   33: iload 5
    //   35: ldc_w 649
    //   38: iand
    //   39: bipush 20
    //   41: iushr
    //   42: tableswitch	default:+290->332, 0:+879->921, 1:+845->887, 2:+816->858, 3:+787->829, 4:+759->801, 5:+730->772, 6:+702->744, 7:+674->716, 8:+643->685, 9:+612->654, 10:+581->623, 11:+553->595, 12:+525->567, 13:+497->539, 14:+468->510, 15:+440->482, 16:+411->453, 17:+380->422, 18:+360->402, 19:+360->402, 20:+360->402, 21:+360->402, 22:+360->402, 23:+360->402, 24:+360->402, 25:+360->402, 26:+360->402, 27:+360->402, 28:+360->402, 29:+360->402, 30:+360->402, 31:+360->402, 32:+360->402, 33:+360->402, 34:+360->402, 35:+360->402, 36:+360->402, 37:+360->402, 38:+360->402, 39:+360->402, 40:+360->402, 41:+360->402, 42:+360->402, 43:+360->402, 44:+360->402, 45:+360->402, 46:+360->402, 47:+360->402, 48:+360->402, 49:+360->402, 50:+340->382, 51:+293->335, 52:+293->335, 53:+293->335, 54:+293->335, 55:+293->335, 56:+293->335, 57:+293->335, 58:+293->335, 59:+293->335, 60:+293->335, 61:+293->335, 62:+293->335, 63:+293->335, 64:+293->335, 65:+293->335, 66:+293->335, 67:+293->335, 68:+293->335
    //   332: goto +624 -> 956
    //   335: aload_0
    //   336: iload_3
    //   337: invokespecial 673	com/google/android/gms/internal/drive/zzlu:zzat	(I)I
    //   340: ldc 118
    //   342: iand
    //   343: i2l
    //   344: lstore 7
    //   346: aload_1
    //   347: lload 7
    //   349: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   352: aload_2
    //   353: lload 7
    //   355: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   358: if_icmpne +595 -> 953
    //   361: aload_1
    //   362: lload 9
    //   364: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   367: aload_2
    //   368: lload 9
    //   370: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   373: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   376: ifne +580 -> 956
    //   379: goto +574 -> 953
    //   382: aload_1
    //   383: lload 9
    //   385: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   388: aload_2
    //   389: lload 9
    //   391: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   394: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   397: istore 6
    //   399: goto +557 -> 956
    //   402: aload_1
    //   403: lload 9
    //   405: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   408: aload_2
    //   409: lload 9
    //   411: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   414: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   417: istore 6
    //   419: goto +537 -> 956
    //   422: aload_0
    //   423: aload_1
    //   424: aload_2
    //   425: iload_3
    //   426: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   429: ifeq +524 -> 953
    //   432: aload_1
    //   433: lload 9
    //   435: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   438: aload_2
    //   439: lload 9
    //   441: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   444: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   447: ifne +509 -> 956
    //   450: goto +503 -> 953
    //   453: aload_0
    //   454: aload_1
    //   455: aload_2
    //   456: iload_3
    //   457: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   460: ifeq +493 -> 953
    //   463: aload_1
    //   464: lload 9
    //   466: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   469: aload_2
    //   470: lload 9
    //   472: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   475: lcmp
    //   476: ifeq +480 -> 956
    //   479: goto +474 -> 953
    //   482: aload_0
    //   483: aload_1
    //   484: aload_2
    //   485: iload_3
    //   486: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   489: ifeq +464 -> 953
    //   492: aload_1
    //   493: lload 9
    //   495: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   498: aload_2
    //   499: lload 9
    //   501: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   504: if_icmpeq +452 -> 956
    //   507: goto +446 -> 953
    //   510: aload_0
    //   511: aload_1
    //   512: aload_2
    //   513: iload_3
    //   514: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   517: ifeq +436 -> 953
    //   520: aload_1
    //   521: lload 9
    //   523: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   526: aload_2
    //   527: lload 9
    //   529: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   532: lcmp
    //   533: ifeq +423 -> 956
    //   536: goto +417 -> 953
    //   539: aload_0
    //   540: aload_1
    //   541: aload_2
    //   542: iload_3
    //   543: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   546: ifeq +407 -> 953
    //   549: aload_1
    //   550: lload 9
    //   552: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   555: aload_2
    //   556: lload 9
    //   558: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   561: if_icmpeq +395 -> 956
    //   564: goto +389 -> 953
    //   567: aload_0
    //   568: aload_1
    //   569: aload_2
    //   570: iload_3
    //   571: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   574: ifeq +379 -> 953
    //   577: aload_1
    //   578: lload 9
    //   580: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   583: aload_2
    //   584: lload 9
    //   586: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   589: if_icmpeq +367 -> 956
    //   592: goto +361 -> 953
    //   595: aload_0
    //   596: aload_1
    //   597: aload_2
    //   598: iload_3
    //   599: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   602: ifeq +351 -> 953
    //   605: aload_1
    //   606: lload 9
    //   608: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   611: aload_2
    //   612: lload 9
    //   614: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   617: if_icmpeq +339 -> 956
    //   620: goto +333 -> 953
    //   623: aload_0
    //   624: aload_1
    //   625: aload_2
    //   626: iload_3
    //   627: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   630: ifeq +323 -> 953
    //   633: aload_1
    //   634: lload 9
    //   636: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   639: aload_2
    //   640: lload 9
    //   642: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   645: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   648: ifne +308 -> 956
    //   651: goto +302 -> 953
    //   654: aload_0
    //   655: aload_1
    //   656: aload_2
    //   657: iload_3
    //   658: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   661: ifeq +292 -> 953
    //   664: aload_1
    //   665: lload 9
    //   667: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   670: aload_2
    //   671: lload 9
    //   673: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   676: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   679: ifne +277 -> 956
    //   682: goto +271 -> 953
    //   685: aload_0
    //   686: aload_1
    //   687: aload_2
    //   688: iload_3
    //   689: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   692: ifeq +261 -> 953
    //   695: aload_1
    //   696: lload 9
    //   698: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   701: aload_2
    //   702: lload 9
    //   704: invokestatic 642	com/google/android/gms/internal/drive/zznd:zzo	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   707: invokestatic 845	com/google/android/gms/internal/drive/zzmh:zzd	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   710: ifne +246 -> 956
    //   713: goto +240 -> 953
    //   716: aload_0
    //   717: aload_1
    //   718: aload_2
    //   719: iload_3
    //   720: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   723: ifeq +230 -> 953
    //   726: aload_1
    //   727: lload 9
    //   729: invokestatic 664	com/google/android/gms/internal/drive/zznd:zzl	(Ljava/lang/Object;J)Z
    //   732: aload_2
    //   733: lload 9
    //   735: invokestatic 664	com/google/android/gms/internal/drive/zznd:zzl	(Ljava/lang/Object;J)Z
    //   738: if_icmpeq +218 -> 956
    //   741: goto +212 -> 953
    //   744: aload_0
    //   745: aload_1
    //   746: aload_2
    //   747: iload_3
    //   748: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   751: ifeq +202 -> 953
    //   754: aload_1
    //   755: lload 9
    //   757: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   760: aload_2
    //   761: lload 9
    //   763: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   766: if_icmpeq +190 -> 956
    //   769: goto +184 -> 953
    //   772: aload_0
    //   773: aload_1
    //   774: aload_2
    //   775: iload_3
    //   776: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   779: ifeq +174 -> 953
    //   782: aload_1
    //   783: lload 9
    //   785: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   788: aload_2
    //   789: lload 9
    //   791: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   794: lcmp
    //   795: ifeq +161 -> 956
    //   798: goto +155 -> 953
    //   801: aload_0
    //   802: aload_1
    //   803: aload_2
    //   804: iload_3
    //   805: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   808: ifeq +145 -> 953
    //   811: aload_1
    //   812: lload 9
    //   814: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   817: aload_2
    //   818: lload 9
    //   820: invokestatic 657	com/google/android/gms/internal/drive/zznd:zzj	(Ljava/lang/Object;J)I
    //   823: if_icmpeq +133 -> 956
    //   826: goto +127 -> 953
    //   829: aload_0
    //   830: aload_1
    //   831: aload_2
    //   832: iload_3
    //   833: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   836: ifeq +117 -> 953
    //   839: aload_1
    //   840: lload 9
    //   842: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   845: aload_2
    //   846: lload 9
    //   848: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   851: lcmp
    //   852: ifeq +104 -> 956
    //   855: goto +98 -> 953
    //   858: aload_0
    //   859: aload_1
    //   860: aload_2
    //   861: iload_3
    //   862: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   865: ifeq +88 -> 953
    //   868: aload_1
    //   869: lload 9
    //   871: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   874: aload_2
    //   875: lload 9
    //   877: invokestatic 655	com/google/android/gms/internal/drive/zznd:zzk	(Ljava/lang/Object;J)J
    //   880: lcmp
    //   881: ifeq +75 -> 956
    //   884: goto +69 -> 953
    //   887: aload_0
    //   888: aload_1
    //   889: aload_2
    //   890: iload_3
    //   891: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   894: ifeq +59 -> 953
    //   897: aload_1
    //   898: lload 9
    //   900: invokestatic 667	com/google/android/gms/internal/drive/zznd:zzm	(Ljava/lang/Object;J)F
    //   903: invokestatic 851	java/lang/Float:floatToIntBits	(F)I
    //   906: aload_2
    //   907: lload 9
    //   909: invokestatic 667	com/google/android/gms/internal/drive/zznd:zzm	(Ljava/lang/Object;J)F
    //   912: invokestatic 851	java/lang/Float:floatToIntBits	(F)I
    //   915: if_icmpeq +41 -> 956
    //   918: goto +35 -> 953
    //   921: aload_0
    //   922: aload_1
    //   923: aload_2
    //   924: iload_3
    //   925: invokespecial 847	com/google/android/gms/internal/drive/zzlu:zzc	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   928: ifeq +25 -> 953
    //   931: aload_1
    //   932: lload 9
    //   934: invokestatic 670	com/google/android/gms/internal/drive/zznd:zzn	(Ljava/lang/Object;J)D
    //   937: invokestatic 855	java/lang/Double:doubleToLongBits	(D)J
    //   940: aload_2
    //   941: lload 9
    //   943: invokestatic 670	com/google/android/gms/internal/drive/zznd:zzn	(Ljava/lang/Object;J)D
    //   946: invokestatic 855	java/lang/Double:doubleToLongBits	(D)J
    //   949: lcmp
    //   950: ifeq +6 -> 956
    //   953: iconst_0
    //   954: istore 6
    //   956: iload 6
    //   958: ifne +5 -> 963
    //   961: iconst_0
    //   962: ireturn
    //   963: iinc 3 3
    //   966: goto -957 -> 9
    //   969: aload_0
    //   970: getfield 93	com/google/android/gms/internal/drive/zzlu:zzur	Lcom/google/android/gms/internal/drive/zzmx;
    //   973: aload_1
    //   974: invokevirtual 109	com/google/android/gms/internal/drive/zzmx:zzr	(Ljava/lang/Object;)Ljava/lang/Object;
    //   977: aload_0
    //   978: getfield 93	com/google/android/gms/internal/drive/zzlu:zzur	Lcom/google/android/gms/internal/drive/zzmx;
    //   981: aload_2
    //   982: invokevirtual 109	com/google/android/gms/internal/drive/zzmx:zzr	(Ljava/lang/Object;)Ljava/lang/Object;
    //   985: invokevirtual 856	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   988: ifne +5 -> 993
    //   991: iconst_0
    //   992: ireturn
    //   993: aload_0
    //   994: getfield 79	com/google/android/gms/internal/drive/zzlu:zzui	Z
    //   997: ifeq +23 -> 1020
    //   1000: aload_0
    //   1001: getfield 95	com/google/android/gms/internal/drive/zzlu:zzus	Lcom/google/android/gms/internal/drive/zzjy;
    //   1004: aload_1
    //   1005: invokevirtual 695	com/google/android/gms/internal/drive/zzjy:zzb	(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;
    //   1008: aload_0
    //   1009: getfield 95	com/google/android/gms/internal/drive/zzlu:zzus	Lcom/google/android/gms/internal/drive/zzjy;
    //   1012: aload_2
    //   1013: invokevirtual 695	com/google/android/gms/internal/drive/zzjy:zzb	(Ljava/lang/Object;)Lcom/google/android/gms/internal/drive/zzkb;
    //   1016: invokevirtual 857	com/google/android/gms/internal/drive/zzkb:equals	(Ljava/lang/Object;)Z
    //   1019: ireturn
    //   1020: iconst_1
    //   1021: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1022	0	this	zzlu
    //   0	1022	1	paramT1	T
    //   0	1022	2	paramT2	T
    //   8	956	3	i	int
    //   5	11	4	j	int
    //   23	16	5	k	int
    //   10	947	6	bool	boolean
    //   344	10	7	l1	long
    //   31	911	9	l2	long
  }
  
  public final int hashCode(T paramT)
  {
    int m = this.zzud.length;
    int k = 0;
    for (int j = 0; k < m; j = i)
    {
      int i1 = zzas(k);
      int n = this.zzud[k];
      long l = 0xFFFFF & i1;
      i = 37;
      Object localObject;
      switch ((i1 & 0xFF00000) >>> 20)
      {
      default: 
        i = j;
        break;
      case 68: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        localObject = zznd.zzo(paramT, l);
        i = j * 53;
        j = localObject.hashCode();
        break;
      case 67: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(zzh(paramT, l));
        break;
      case 66: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 65: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(zzh(paramT, l));
        break;
      case 64: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 63: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 62: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 61: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zznd.zzo(paramT, l).hashCode();
        break;
      case 60: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        localObject = zznd.zzo(paramT, l);
        i = j * 53;
        j = localObject.hashCode();
        break;
      case 59: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = ((String)zznd.zzo(paramT, l)).hashCode();
        break;
      case 58: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zze(zzi(paramT, l));
        break;
      case 57: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 56: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(zzh(paramT, l));
        break;
      case 55: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzg(paramT, l);
        break;
      case 54: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(zzh(paramT, l));
        break;
      case 53: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(zzh(paramT, l));
        break;
      case 52: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = Float.floatToIntBits(zzf(paramT, l));
        break;
      case 51: 
        i = j;
        if (!zza(paramT, n, k)) {
          break label1289;
        }
        i = j * 53;
        j = zzkm.zzu(Double.doubleToLongBits(zze(paramT, l)));
        break;
      case 50: 
        i = j * 53;
        j = zznd.zzo(paramT, l).hashCode();
        break;
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
        i = j * 53;
        j = zznd.zzo(paramT, l).hashCode();
        break;
      case 17: 
        localObject = zznd.zzo(paramT, l);
        if (localObject != null) {
          i = localObject.hashCode();
        }
        break;
      case 16: 
        i = j * 53;
        j = zzkm.zzu(zznd.zzk(paramT, l));
        break;
      case 15: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 14: 
        i = j * 53;
        j = zzkm.zzu(zznd.zzk(paramT, l));
        break;
      case 13: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 12: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 11: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 10: 
        i = j * 53;
        j = zznd.zzo(paramT, l).hashCode();
        break;
      case 9: 
        localObject = zznd.zzo(paramT, l);
        if (localObject != null) {
          i = localObject.hashCode();
        }
        i = j * 53 + i;
        break;
      case 8: 
        i = j * 53;
        j = ((String)zznd.zzo(paramT, l)).hashCode();
        break;
      case 7: 
        i = j * 53;
        j = zzkm.zze(zznd.zzl(paramT, l));
        break;
      case 6: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 5: 
        i = j * 53;
        j = zzkm.zzu(zznd.zzk(paramT, l));
        break;
      case 4: 
        i = j * 53;
        j = zznd.zzj(paramT, l);
        break;
      case 3: 
        i = j * 53;
        j = zzkm.zzu(zznd.zzk(paramT, l));
        break;
      case 2: 
        i = j * 53;
        j = zzkm.zzu(zznd.zzk(paramT, l));
        break;
      case 1: 
        i = j * 53;
        j = Float.floatToIntBits(zznd.zzm(paramT, l));
        break;
      }
      i = j * 53;
      j = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(paramT, l)));
      i += j;
      label1289:
      k += 3;
    }
    j = j * 53 + this.zzur.zzr(paramT).hashCode();
    int i = j;
    if (this.zzui) {
      i = j * 53 + this.zzus.zzb(paramT).hashCode();
    }
    return i;
  }
  
  public final T newInstance()
  {
    return (T)this.zzup.newInstance(this.zzuh);
  }
  
  final int zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zziz paramzziz)
    throws IOException
  {
    Object localObject1 = paramT;
    int i = paramInt2;
    int m = paramInt3;
    localObject1 = paramzziz;
    Object localObject2 = zzuc;
    int j = -1;
    int i1 = 0;
    i = 0;
    int k = 0;
    int n = -1;
    Object localObject3;
    for (;;)
    {
      localObject3 = paramT;
      int i2 = paramInt2;
      if (paramInt1 >= i2) {
        break;
      }
      i2 = paramInt1 + 1;
      paramInt1 = paramArrayOfByte[paramInt1];
      if (paramInt1 < 0)
      {
        i2 = zziy.zza(paramInt1, paramArrayOfByte, i2, (zziz)localObject1);
        paramInt1 = ((zziz)localObject1).zznk;
      }
      i = paramInt1 >>> 3;
      int i5 = paramInt1 & 0x7;
      if (i > j) {
        j = zzp(i, i1 / 3);
      } else {
        j = zzau(i);
      }
      if (j == -1)
      {
        j = i;
        j = paramInt1;
        j = m;
        i1 = 0;
        m = i2;
      }
      else
      {
        Object localObject4 = this.zzud;
        int i7 = localObject4[(j + 1)];
        int i6 = (i7 & 0xFF00000) >>> 20;
        long l = i7 & 0xFFFFF;
        if (i6 <= 17)
        {
          m = localObject4[(j + 2)];
          int i4 = 1 << (m >>> 20);
          i3 = m & 0xFFFFF;
          i1 = k;
          m = n;
          if (i3 != n)
          {
            if (n != -1) {
              ((Unsafe)localObject2).putInt(localObject3, n, k);
            }
            i1 = ((Unsafe)localObject2).getInt(localObject3, i3);
            m = i3;
          }
          switch (i6)
          {
          }
          for (;;)
          {
            break label1192;
            if (i5 == 3)
            {
              i3 = zziy.zza(zzap(j), paramArrayOfByte, i2, paramInt2, i << 3 | 0x4, paramzziz);
              if ((i1 & i4) == 0) {
                ((Unsafe)localObject2).putObject(localObject3, l, paramzziz.zznm);
              } else {
                ((Unsafe)localObject2).putObject(localObject3, l, zzkm.zza(((Unsafe)localObject2).getObject(localObject3, l), paramzziz.zznm));
              }
              n = i1 | i4;
              k = paramInt2;
              k = paramInt1;
              i1 = j;
              i2 = paramInt3;
              localObject1 = paramzziz;
              paramInt1 = i3;
              j = i;
              i = k;
              k = n;
              n = m;
              m = i2;
              break;
            }
            if (i5 == 0)
            {
              k = zziy.zzb(paramArrayOfByte, i2, paramzziz);
              ((Unsafe)localObject2).putLong(paramT, l, zzjo.zzk(paramzziz.zznl));
              n = i1 | i4;
            }
            else
            {
              break label984;
              if (i5 == 0)
              {
                k = zziy.zza(paramArrayOfByte, i2, paramzziz);
                ((Unsafe)localObject2).putInt(localObject3, l, zzjo.zzw(paramzziz.zznk));
                if (i5 == 0)
                {
                  k = zziy.zza(paramArrayOfByte, i2, paramzziz);
                  n = paramzziz.zznk;
                  localObject1 = zzar(j);
                  if ((localObject1 != null) && (!((zzko)localObject1).zzan(n)))
                  {
                    zzo(paramT).zzb(paramInt1, Long.valueOf(n));
                    n = i1;
                    break label1133;
                  }
                  ((Unsafe)localObject2).putInt(localObject3, l, n);
                  if (i5 == 2)
                  {
                    k = zziy.zze(paramArrayOfByte, i2, paramzziz);
                    ((Unsafe)localObject2).putObject(localObject3, l, paramzziz.zznm);
                    n = i1 | i4;
                    break label1133;
                    if (i5 == 2)
                    {
                      k = zziy.zza(zzap(j), paramArrayOfByte, i2, paramInt2, paramzziz);
                      if ((i1 & i4) == 0) {
                        ((Unsafe)localObject2).putObject(localObject3, l, paramzziz.zznm);
                      } else {
                        ((Unsafe)localObject2).putObject(localObject3, l, zzkm.zza(((Unsafe)localObject2).getObject(localObject3, l), paramzziz.zznm));
                      }
                    }
                    else
                    {
                      break label984;
                      if (i5 != 2) {
                        break label984;
                      }
                      if ((i7 & 0x20000000) == 0) {
                        k = zziy.zzc(paramArrayOfByte, i2, paramzziz);
                      } else {
                        k = zziy.zzd(paramArrayOfByte, i2, paramzziz);
                      }
                      ((Unsafe)localObject2).putObject(localObject3, l, paramzziz.zznm);
                      break label910;
                      if (i5 != 0) {
                        break label984;
                      }
                      k = zziy.zzb(paramArrayOfByte, i2, paramzziz);
                      boolean bool;
                      if (paramzziz.zznl != 0L) {
                        bool = true;
                      } else {
                        bool = false;
                      }
                      zznd.zza(localObject3, l, bool);
                      n = i1 | i4;
                      break label917;
                      if (i5 != 5) {
                        break label984;
                      }
                      ((Unsafe)localObject2).putInt(localObject3, l, zziy.zza(paramArrayOfByte, i2));
                      k = i2 + 4;
                    }
                    label910:
                    n = i1 | i4;
                    label917:
                    i3 = paramInt1;
                    i1 = j;
                    localObject1 = paramzziz;
                    i2 = paramInt3;
                    paramInt1 = paramInt2;
                    paramInt1 = k;
                    j = i;
                    i = i3;
                    k = n;
                    n = m;
                    m = i2;
                    break;
                    if (i5 == 1)
                    {
                      ((Unsafe)localObject2).putLong(paramT, l, zziy.zzb(paramArrayOfByte, i2));
                      break label1119;
                    }
                  }
                }
              }
              label984:
              continue;
              if (i5 != 0) {
                break label1192;
              }
              k = zziy.zza(paramArrayOfByte, i2, paramzziz);
              ((Unsafe)localObject2).putInt(localObject3, l, paramzziz.zznk);
              break label1126;
              if (i5 != 0) {
                break label1192;
              }
              k = zziy.zzb(paramArrayOfByte, i2, paramzziz);
              ((Unsafe)localObject2).putLong(paramT, l, paramzziz.zznl);
              n = i1 | i4;
              i1 = paramInt1;
              i1 = j;
              i1 = i;
              localObject1 = paramzziz;
              break label1148;
              if (i5 != 5) {
                break label1192;
              }
              zznd.zza(localObject3, l, zziy.zzd(paramArrayOfByte, i2));
              k = i2 + 4;
              break label1126;
              if (i5 != 1) {
                break label1192;
              }
              zznd.zza(localObject3, l, zziy.zzc(paramArrayOfByte, i2));
              label1119:
              k = i2 + 8;
              label1126:
              n = i1 | i4;
            }
            label1133:
            i1 = paramInt1;
            i1 = j;
            i1 = i;
            localObject1 = paramzziz;
            label1148:
            localObject1 = paramzziz;
            i3 = paramInt1;
            i1 = j;
            paramInt1 = paramInt2;
            i2 = paramInt3;
            paramInt1 = k;
            j = i;
            i = i3;
            k = n;
            n = m;
            m = i2;
            break;
          }
          label1192:
          k = i2;
          i2 = j;
          j = i;
          n = m;
          j = paramInt1;
          j = paramInt3;
          m = k;
          k = i1;
          i1 = i2;
        }
        else
        {
          if (i6 == 27)
          {
            if (i5 == 2)
            {
              zzkp localzzkp = (zzkp)((Unsafe)localObject2).getObject(localObject3, l);
              localObject4 = localzzkp;
              if (!localzzkp.zzbo())
              {
                m = localzzkp.size();
                if (m == 0) {
                  m = 10;
                } else {
                  m <<= 1;
                }
                localObject4 = localzzkp.zzr(m);
                ((Unsafe)localObject2).putObject(localObject3, l, localObject4);
              }
              i3 = zziy.zza(zzap(j), paramInt1, paramArrayOfByte, i2, paramInt2, (zzkp)localObject4, paramzziz);
              m = paramInt3;
              i1 = i;
              i = paramInt1;
              i2 = j;
              paramInt1 = paramInt2;
              paramInt1 = i3;
              j = i1;
              i1 = i2;
              continue;
            }
          }
          else
          {
            if (i6 <= 49)
            {
              i1 = zza(paramT, paramArrayOfByte, i2, paramInt2, paramInt1, i, i5, j, i7, i6, l, paramzziz);
              m = i1;
              if (i1 == i2)
              {
                m = i1;
                break label1574;
              }
            }
            do
            {
              localObject1 = paramT;
              i1 = paramInt2;
              i2 = paramInt3;
              localObject1 = paramzziz;
              i1 = j;
              j = i;
              i = paramInt1;
              paramInt1 = m;
              m = i2;
              break;
              if (i6 != 50) {
                break label1536;
              }
              if (i5 != 2) {
                break label1514;
              }
              i1 = zza(paramT, paramArrayOfByte, i2, paramInt2, j, l, paramzziz);
              m = i1;
            } while (i1 != i2);
            m = i1;
            break label1574;
          }
          label1514:
          label1536:
          label1574:
          for (m = i2;; m = i1)
          {
            i1 = i;
            i1 = j;
            j = paramInt3;
            i2 = paramInt1;
            break;
            i1 = zza(paramT, paramArrayOfByte, i2, paramInt2, paramInt1, i, i5, i7, i6, l, j, paramzziz);
            if (i1 != i2) {
              break label1754;
            }
          }
        }
      }
      i2 = i;
      if ((paramInt1 == j) && (j != 0))
      {
        paramArrayOfByte = this;
        paramInt3 = m;
        paramArrayOfByte = paramT;
        break label1817;
      }
      if (this.zzui) {
        if (paramzziz.zznn != zzjx.zzci())
        {
          localObject1 = this.zzuh;
          if (paramzziz.zznn.zza((zzlq)localObject1, i2) == null)
          {
            i = zziy.zza(paramInt1, paramArrayOfByte, m, paramInt2, zzo(paramT), paramzziz);
            localObject1 = paramT;
            localObject1 = paramzziz;
            break label1722;
          }
          paramT = (zzkk.zzc)paramT;
          paramT.zzdg();
          paramT = paramT.zzrw;
          throw new NoSuchMethodError();
        }
      }
      i = zziy.zza(paramInt1, paramArrayOfByte, m, paramInt2, zzo(paramT), paramzziz);
      localObject1 = paramzziz;
      localObject1 = paramT;
      label1722:
      localObject1 = paramT;
      localObject1 = paramzziz;
      m = paramInt2;
      int i3 = paramInt1;
      m = j;
      paramInt1 = i;
      j = i2;
      i = i3;
      continue;
      label1754:
      localObject1 = paramT;
      m = paramInt2;
      m = paramInt3;
      i2 = paramInt1;
      i3 = n;
      n = j;
      localObject1 = paramzziz;
      paramInt1 = i1;
      j = i;
      i1 = n;
      i = i2;
      n = i3;
    }
    j = m;
    paramArrayOfByte = (byte[])localObject3;
    paramT = this;
    paramInt3 = paramInt1;
    paramInt1 = i;
    label1817:
    paramzziz = this;
    if (n != -1) {
      ((Unsafe)localObject2).putInt(paramArrayOfByte, n, k);
    }
    i = paramzziz.zzun;
    paramT = null;
    while (i < paramzziz.zzuo)
    {
      m = paramzziz.zzum[i];
      localObject2 = paramzziz.zzur;
      k = paramzziz.zzud[m];
      localObject3 = zznd.zzo(paramArrayOfByte, paramzziz.zzas(m) & 0xFFFFF);
      if (localObject3 != null)
      {
        localObject1 = paramzziz.zzar(m);
        if (localObject1 != null) {
          paramT = zza(m, k, paramzziz.zzut.zzh(localObject3), (zzko)localObject1, paramT, (zzmx)localObject2);
        }
      }
      paramT = (zzmy)paramT;
      i++;
    }
    if (paramT != null) {
      paramzziz.zzur.zzf(paramArrayOfByte, paramT);
    }
    if (j == 0)
    {
      if (paramInt3 != paramInt2) {
        throw zzkq.zzdm();
      }
    }
    else {
      if ((paramInt3 > paramInt2) || (paramInt1 != j)) {
        break label2011;
      }
    }
    return paramInt3;
    label2011:
    throw zzkq.zzdm();
  }
  
  public final void zza(T paramT, zzns paramzzns)
    throws IOException
  {
    Object localObject1;
    Iterator localIterator;
    label77:
    int i;
    Object localObject2;
    int j;
    int k;
    if (paramzzns.zzcd() == zzkk.zze.zzsj)
    {
      zza(this.zzur, paramT, paramzzns);
      if (this.zzui)
      {
        localObject1 = this.zzus.zzb(paramT);
        if (!((zzkb)localObject1).zzos.isEmpty())
        {
          localIterator = ((zzkb)localObject1).descendingIterator();
          localObject1 = (Map.Entry)localIterator.next();
          break label77;
        }
      }
      localIterator = null;
      localObject1 = null;
      i = this.zzud.length - 3;
      localObject2 = localObject1;
      for (;;)
      {
        localObject1 = localObject2;
        if (i < 0) {
          break;
        }
        j = zzas(i);
        k = this.zzud[i];
        while ((localObject2 != null) && (this.zzus.zza((Map.Entry)localObject2) > k))
        {
          this.zzus.zza(paramzzns, (Map.Entry)localObject2);
          if (localIterator.hasNext()) {
            localObject2 = (Map.Entry)localIterator.next();
          } else {
            localObject2 = null;
          }
        }
        switch ((j & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zznd.zzo(paramT, j & 0xFFFFF), zzap(i));
          }
          break;
        case 67: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zzh(paramT, j & 0xFFFFF));
          }
          break;
        case 66: 
          if (zza(paramT, k, i)) {
            paramzzns.zze(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 65: 
          if (zza(paramT, k, i)) {
            paramzzns.zzj(k, zzh(paramT, j & 0xFFFFF));
          }
          break;
        case 64: 
          if (zza(paramT, k, i)) {
            paramzzns.zzm(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 63: 
          if (zza(paramT, k, i)) {
            paramzzns.zzn(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 62: 
          if (zza(paramT, k, i)) {
            paramzzns.zzd(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 61: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, (zzjc)zznd.zzo(paramT, j & 0xFFFFF));
          }
          break;
        case 60: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zznd.zzo(paramT, j & 0xFFFFF), zzap(i));
          }
          break;
        case 59: 
          if (zza(paramT, k, i)) {
            zza(k, zznd.zzo(paramT, j & 0xFFFFF), paramzzns);
          }
          break;
        case 58: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zzi(paramT, j & 0xFFFFF));
          }
          break;
        case 57: 
          if (zza(paramT, k, i)) {
            paramzzns.zzf(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 56: 
          if (zza(paramT, k, i)) {
            paramzzns.zzc(k, zzh(paramT, j & 0xFFFFF));
          }
          break;
        case 55: 
          if (zza(paramT, k, i)) {
            paramzzns.zzc(k, zzg(paramT, j & 0xFFFFF));
          }
          break;
        case 54: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zzh(paramT, j & 0xFFFFF));
          }
          break;
        case 53: 
          if (zza(paramT, k, i)) {
            paramzzns.zzi(k, zzh(paramT, j & 0xFFFFF));
          }
          break;
        case 52: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zzf(paramT, j & 0xFFFFF));
          }
          break;
        case 51: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zze(paramT, j & 0xFFFFF));
          }
          break;
        case 50: 
          zza(paramzzns, k, zznd.zzo(paramT, j & 0xFFFFF), i);
          break;
        case 49: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, zzap(i));
          break;
        case 48: 
          zzmh.zze(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 47: 
          zzmh.zzj(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 46: 
          zzmh.zzg(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 45: 
          zzmh.zzl(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 44: 
          zzmh.zzm(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 43: 
          zzmh.zzi(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 42: 
          zzmh.zzn(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 41: 
          zzmh.zzk(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 40: 
          zzmh.zzf(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 39: 
          zzmh.zzh(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 38: 
          zzmh.zzd(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 37: 
          zzmh.zzc(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 36: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 35: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, true);
          break;
        case 34: 
          zzmh.zze(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 33: 
          zzmh.zzj(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 32: 
          zzmh.zzg(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 31: 
          zzmh.zzl(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 30: 
          zzmh.zzm(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 29: 
          zzmh.zzi(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 28: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns);
          break;
        case 27: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, zzap(i));
          break;
        case 26: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns);
          break;
        case 25: 
          zzmh.zzn(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 24: 
          zzmh.zzk(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 23: 
          zzmh.zzf(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 22: 
          zzmh.zzh(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 21: 
          zzmh.zzd(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 20: 
          zzmh.zzc(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 19: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 18: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, j & 0xFFFFF), paramzzns, false);
          break;
        case 17: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzo(paramT, j & 0xFFFFF), zzap(i));
          }
          break;
        case 16: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzk(paramT, j & 0xFFFFF));
          }
          break;
        case 15: 
          if (zza(paramT, i)) {
            paramzzns.zze(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 14: 
          if (zza(paramT, i)) {
            paramzzns.zzj(k, zznd.zzk(paramT, j & 0xFFFFF));
          }
          break;
        case 13: 
          if (zza(paramT, i)) {
            paramzzns.zzm(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 12: 
          if (zza(paramT, i)) {
            paramzzns.zzn(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 11: 
          if (zza(paramT, i)) {
            paramzzns.zzd(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 10: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, (zzjc)zznd.zzo(paramT, j & 0xFFFFF));
          }
          break;
        case 9: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzo(paramT, j & 0xFFFFF), zzap(i));
          }
          break;
        case 8: 
          if (zza(paramT, i)) {
            zza(k, zznd.zzo(paramT, j & 0xFFFFF), paramzzns);
          }
          break;
        case 7: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzl(paramT, j & 0xFFFFF));
          }
          break;
        case 6: 
          if (zza(paramT, i)) {
            paramzzns.zzf(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 5: 
          if (zza(paramT, i)) {
            paramzzns.zzc(k, zznd.zzk(paramT, j & 0xFFFFF));
          }
          break;
        case 4: 
          if (zza(paramT, i)) {
            paramzzns.zzc(k, zznd.zzj(paramT, j & 0xFFFFF));
          }
          break;
        case 3: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzk(paramT, j & 0xFFFFF));
          }
          break;
        case 2: 
          if (zza(paramT, i)) {
            paramzzns.zzi(k, zznd.zzk(paramT, j & 0xFFFFF));
          }
          break;
        case 1: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzm(paramT, j & 0xFFFFF));
          }
          break;
        case 0: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzn(paramT, j & 0xFFFFF));
          }
          break;
        }
        i -= 3;
      }
      while (localObject1 != null)
      {
        this.zzus.zza(paramzzns, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      return;
    }
    if (this.zzuk)
    {
      if (this.zzui)
      {
        localObject1 = this.zzus.zzb(paramT);
        if (!((zzkb)localObject1).zzos.isEmpty())
        {
          localIterator = ((zzkb)localObject1).iterator();
          localObject2 = (Map.Entry)localIterator.next();
          break label2617;
        }
      }
      localIterator = null;
      localObject2 = null;
      label2617:
      j = this.zzud.length;
      for (i = 0;; i += 3)
      {
        localObject1 = localObject2;
        if (i >= j) {
          break;
        }
        int m = zzas(i);
        k = this.zzud[i];
        while ((localObject2 != null) && (this.zzus.zza((Map.Entry)localObject2) <= k))
        {
          this.zzus.zza(paramzzns, (Map.Entry)localObject2);
          if (localIterator.hasNext()) {
            localObject2 = (Map.Entry)localIterator.next();
          } else {
            localObject2 = null;
          }
        }
        switch ((m & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zznd.zzo(paramT, m & 0xFFFFF), zzap(i));
          }
          break;
        case 67: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zzh(paramT, m & 0xFFFFF));
          }
          break;
        case 66: 
          if (zza(paramT, k, i)) {
            paramzzns.zze(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 65: 
          if (zza(paramT, k, i)) {
            paramzzns.zzj(k, zzh(paramT, m & 0xFFFFF));
          }
          break;
        case 64: 
          if (zza(paramT, k, i)) {
            paramzzns.zzm(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 63: 
          if (zza(paramT, k, i)) {
            paramzzns.zzn(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 62: 
          if (zza(paramT, k, i)) {
            paramzzns.zzd(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 61: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, (zzjc)zznd.zzo(paramT, m & 0xFFFFF));
          }
          break;
        case 60: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zznd.zzo(paramT, m & 0xFFFFF), zzap(i));
          }
          break;
        case 59: 
          if (zza(paramT, k, i)) {
            zza(k, zznd.zzo(paramT, m & 0xFFFFF), paramzzns);
          }
          break;
        case 58: 
          if (zza(paramT, k, i)) {
            paramzzns.zzb(k, zzi(paramT, m & 0xFFFFF));
          }
          break;
        case 57: 
          if (zza(paramT, k, i)) {
            paramzzns.zzf(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 56: 
          if (zza(paramT, k, i)) {
            paramzzns.zzc(k, zzh(paramT, m & 0xFFFFF));
          }
          break;
        case 55: 
          if (zza(paramT, k, i)) {
            paramzzns.zzc(k, zzg(paramT, m & 0xFFFFF));
          }
          break;
        case 54: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zzh(paramT, m & 0xFFFFF));
          }
          break;
        case 53: 
          if (zza(paramT, k, i)) {
            paramzzns.zzi(k, zzh(paramT, m & 0xFFFFF));
          }
          break;
        case 52: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zzf(paramT, m & 0xFFFFF));
          }
          break;
        case 51: 
          if (zza(paramT, k, i)) {
            paramzzns.zza(k, zze(paramT, m & 0xFFFFF));
          }
          break;
        case 50: 
          zza(paramzzns, k, zznd.zzo(paramT, m & 0xFFFFF), i);
          break;
        case 49: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, zzap(i));
          break;
        case 48: 
          zzmh.zze(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 47: 
          zzmh.zzj(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 46: 
          zzmh.zzg(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 45: 
          zzmh.zzl(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 44: 
          zzmh.zzm(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 43: 
          zzmh.zzi(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 42: 
          zzmh.zzn(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 41: 
          zzmh.zzk(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 40: 
          zzmh.zzf(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 39: 
          zzmh.zzh(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 38: 
          zzmh.zzd(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 37: 
          zzmh.zzc(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 36: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 35: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, true);
          break;
        case 34: 
          zzmh.zze(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 33: 
          zzmh.zzj(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 32: 
          zzmh.zzg(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 31: 
          zzmh.zzl(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 30: 
          zzmh.zzm(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 29: 
          zzmh.zzi(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 28: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns);
          break;
        case 27: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, zzap(i));
          break;
        case 26: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns);
          break;
        case 25: 
          zzmh.zzn(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 24: 
          zzmh.zzk(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 23: 
          zzmh.zzf(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 22: 
          zzmh.zzh(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 21: 
          zzmh.zzd(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 20: 
          zzmh.zzc(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 19: 
          zzmh.zzb(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 18: 
          zzmh.zza(this.zzud[i], (List)zznd.zzo(paramT, m & 0xFFFFF), paramzzns, false);
          break;
        case 17: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzo(paramT, m & 0xFFFFF), zzap(i));
          }
          break;
        case 16: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzk(paramT, m & 0xFFFFF));
          }
          break;
        case 15: 
          if (zza(paramT, i)) {
            paramzzns.zze(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 14: 
          if (zza(paramT, i)) {
            paramzzns.zzj(k, zznd.zzk(paramT, m & 0xFFFFF));
          }
          break;
        case 13: 
          if (zza(paramT, i)) {
            paramzzns.zzm(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 12: 
          if (zza(paramT, i)) {
            paramzzns.zzn(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 11: 
          if (zza(paramT, i)) {
            paramzzns.zzd(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 10: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, (zzjc)zznd.zzo(paramT, m & 0xFFFFF));
          }
          break;
        case 9: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzo(paramT, m & 0xFFFFF), zzap(i));
          }
          break;
        case 8: 
          if (zza(paramT, i)) {
            zza(k, zznd.zzo(paramT, m & 0xFFFFF), paramzzns);
          }
          break;
        case 7: 
          if (zza(paramT, i)) {
            paramzzns.zzb(k, zznd.zzl(paramT, m & 0xFFFFF));
          }
          break;
        case 6: 
          if (zza(paramT, i)) {
            paramzzns.zzf(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 5: 
          if (zza(paramT, i)) {
            paramzzns.zzc(k, zznd.zzk(paramT, m & 0xFFFFF));
          }
          break;
        case 4: 
          if (zza(paramT, i)) {
            paramzzns.zzc(k, zznd.zzj(paramT, m & 0xFFFFF));
          }
          break;
        case 3: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzk(paramT, m & 0xFFFFF));
          }
          break;
        case 2: 
          if (zza(paramT, i)) {
            paramzzns.zzi(k, zznd.zzk(paramT, m & 0xFFFFF));
          }
          break;
        case 1: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzm(paramT, m & 0xFFFFF));
          }
          break;
        case 0: 
          if (zza(paramT, i)) {
            paramzzns.zza(k, zznd.zzn(paramT, m & 0xFFFFF));
          }
          break;
        }
      }
      while (localObject1 != null)
      {
        this.zzus.zza(paramzzns, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      zza(this.zzur, paramT, paramzzns);
      return;
    }
    zzb(paramT, paramzzns);
  }
  
  public final void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zziz paramzziz)
    throws IOException
  {
    zzlu localzzlu = this;
    T ? = paramT;
    byte[] arrayOfByte = paramArrayOfByte;
    int k = paramInt2;
    zziz localzziz = paramzziz;
    if (localzzlu.zzuk)
    {
      Unsafe localUnsafe = zzuc;
      int j = paramInt1;
      int m = -1;
      int i;
      for (paramInt1 = 0; j < k; paramInt1 = i)
      {
        i = j + 1;
        int n = arrayOfByte[j];
        if (n < 0)
        {
          i = zziy.zza(n, arrayOfByte, i, localzziz);
          n = localzziz.zznk;
        }
        j = n >>> 3;
        int i1 = n & 0x7;
        if (j > m) {
          paramInt1 = localzzlu.zzp(j, paramInt1 / 3);
        } else {
          paramInt1 = localzzlu.zzau(j);
        }
        if (paramInt1 == -1)
        {
          paramInt1 = 0;
        }
        else
        {
          m = localzzlu.zzud[(paramInt1 + 1)];
          int i2 = (0xFF00000 & m) >>> 20;
          long l = 0xFFFFF & m;
          Object localObject;
          if (i2 <= 17)
          {
            boolean bool = true;
            switch (i2)
            {
            default: 
              break;
            case 16: 
              if (i1 != 0) {
                break label912;
              }
              i = zziy.zzb(arrayOfByte, i, localzziz);
              localUnsafe.putLong(paramT, l, zzjo.zzk(localzziz.zznl));
              break;
            case 15: 
              if (i1 != 0) {
                break label781;
              }
              i = zziy.zza(arrayOfByte, i, localzziz);
              localUnsafe.putInt(?, l, zzjo.zzw(localzziz.zznk));
              break;
            case 12: 
              if (i1 != 0) {
                break label781;
              }
              i = zziy.zza(arrayOfByte, i, localzziz);
              localUnsafe.putInt(?, l, localzziz.zznk);
              break;
            case 10: 
              if (i1 != 2) {
                break label912;
              }
              i = zziy.zze(arrayOfByte, i, localzziz);
              localUnsafe.putObject(?, l, localzziz.zznm);
              break;
            case 9: 
              if (i1 != 2) {
                break label912;
              }
              i = zziy.zza(localzzlu.zzap(paramInt1), arrayOfByte, i, k, localzziz);
              localObject = localUnsafe.getObject(?, l);
              if (localObject == null) {
                localUnsafe.putObject(?, l, localzziz.zznm);
              } else {
                localUnsafe.putObject(?, l, zzkm.zza(localObject, localzziz.zznm));
              }
              break;
            case 8: 
              if (i1 != 2) {
                break label912;
              }
              if ((0x20000000 & m) == 0) {
                i = zziy.zzc(arrayOfByte, i, localzziz);
              } else {
                i = zziy.zzd(arrayOfByte, i, localzziz);
              }
              localUnsafe.putObject(?, l, localzziz.zznm);
              break;
            case 7: 
              if (i1 != 0) {
                break label912;
              }
              i = zziy.zzb(arrayOfByte, i, localzziz);
              if (localzziz.zznl == 0L) {
                bool = false;
              }
              zznd.zza(?, l, bool);
              break;
            case 6: 
            case 13: 
              if (i1 != 5) {
                break label912;
              }
              localUnsafe.putInt(?, l, zziy.zza(arrayOfByte, i));
              i += 4;
              m = paramInt1;
              paramInt1 = j;
              paramInt1 = i;
              i = m;
              break;
            case 5: 
            case 14: 
              if (i1 != 1) {
                break label912;
              }
              localUnsafe.putLong(paramT, l, zziy.zzb(arrayOfByte, i));
              break;
            case 4: 
            case 11: 
              if (i1 != 0) {
                break label781;
              }
              i = zziy.zza(arrayOfByte, i, localzziz);
              localUnsafe.putInt(?, l, localzziz.zznk);
              break;
            case 2: 
            case 3: 
              if (i1 != 0) {
                break label781;
              }
              i = zziy.zzb(arrayOfByte, i, localzziz);
              localUnsafe.putLong(paramT, l, localzziz.zznl);
              break;
            case 1: 
              if (i1 != 5) {
                break label781;
              }
              zznd.zza(?, l, zziy.zzd(arrayOfByte, i));
              i += 4;
              break;
            }
            if (i1 == 1)
            {
              zznd.zza(?, l, zziy.zzc(arrayOfByte, i));
              i += 8;
              m = j;
              m = paramInt1;
              paramInt1 = i;
              i = m;
              break label1134;
            }
            label781:
            k = paramInt1;
          }
          else
          {
            if (i2 != 27) {
              break label921;
            }
            if (i1 == 2)
            {
              zzkp localzzkp = (zzkp)localUnsafe.getObject(?, l);
              localObject = localzzkp;
              if (!localzzkp.zzbo())
              {
                m = localzzkp.size();
                if (m == 0) {
                  m = 10;
                } else {
                  m <<= 1;
                }
                localObject = localzzkp.zzr(m);
                localUnsafe.putObject(?, l, localObject);
              }
              m = zziy.zza(localzzlu.zzap(paramInt1), n, paramArrayOfByte, i, paramInt2, (zzkp)localObject, paramzziz);
              i = j;
              i = paramInt1;
              paramInt1 = m;
              break label1134;
            }
            label912:
            k = paramInt1;
          }
          k = paramInt1;
          break label1031;
          label921:
          k = paramInt1;
          if (i2 <= 49)
          {
            i1 = zza(paramT, paramArrayOfByte, i, paramInt2, n, j, i1, k, m, i2, l, paramzziz);
            paramInt1 = i1;
            m = k;
            if (i1 != i) {
              break label1109;
            }
            paramInt1 = i1;
          }
          else if (i2 == 50)
          {
            if (i1 == 2)
            {
              i1 = zza(paramT, paramArrayOfByte, i, paramInt2, k, l, paramzziz);
              paramInt1 = i1;
              m = k;
              if (i1 != i) {
                break label1109;
              }
              paramInt1 = i1;
            }
            else
            {
              label1031:
              break label1085;
            }
          }
          else
          {
            i1 = zza(paramT, paramArrayOfByte, i, paramInt2, n, j, i1, m, i2, l, k, paramzziz);
            paramInt1 = i1;
            m = k;
            if (i1 != i) {
              break label1109;
            }
            paramInt1 = i1;
          }
          i = paramInt1;
          paramInt1 = k;
        }
        label1085:
        i = zziy.zza(n, paramArrayOfByte, i, paramInt2, zzo(paramT), paramzziz);
        m = paramInt1;
        paramInt1 = i;
        label1109:
        localzzlu = this;
        ? = paramT;
        arrayOfByte = paramArrayOfByte;
        k = paramInt2;
        localzziz = paramzziz;
        i = m;
        m = j;
        label1134:
        m = j;
        j = paramInt1;
      }
      if (j == k) {
        return;
      }
      throw zzkq.zzdm();
    }
    zza(paramT, paramArrayOfByte, paramInt1, paramInt2, 0, paramzziz);
  }
  
  public final void zzc(T paramT1, T paramT2)
  {
    Objects.requireNonNull(paramT2);
    for (int i = 0; i < this.zzud.length; i += 3)
    {
      int k = zzas(i);
      long l = 0xFFFFF & k;
      int j = this.zzud[i];
      switch ((k & 0xFF00000) >>> 20)
      {
      default: 
        break;
      case 68: 
        zzb(paramT1, paramT2, i);
        break;
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 67: 
        if (zza(paramT2, j, i))
        {
          zznd.zza(paramT1, l, zznd.zzo(paramT2, l));
          zzb(paramT1, j, i);
        }
        break;
      case 60: 
        zzb(paramT1, paramT2, i);
        break;
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 57: 
      case 58: 
      case 59: 
        if (zza(paramT2, j, i))
        {
          zznd.zza(paramT1, l, zznd.zzo(paramT2, l));
          zzb(paramT1, j, i);
        }
        break;
      case 50: 
        zzmh.zza(this.zzut, paramT1, paramT2, l);
        break;
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
        this.zzuq.zza(paramT1, paramT2, l);
        break;
      case 17: 
        zza(paramT1, paramT2, i);
        break;
      case 16: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzk(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 15: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 14: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzk(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 13: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 12: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 11: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 10: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzo(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 9: 
        zza(paramT1, paramT2, i);
        break;
      case 8: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzo(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 7: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzl(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 6: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 5: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzk(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 4: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzj(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 3: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzk(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 2: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzk(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 1: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzm(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      case 0: 
        if (zza(paramT2, i))
        {
          zznd.zza(paramT1, l, zznd.zzn(paramT2, l));
          zzb(paramT1, i);
        }
        break;
      }
    }
    if (!this.zzuk)
    {
      zzmh.zza(this.zzur, paramT1, paramT2);
      if (this.zzui) {
        zzmh.zza(this.zzus, paramT1, paramT2);
      }
    }
  }
  
  public final void zzd(T paramT)
  {
    int j;
    for (int i = this.zzun;; i++)
    {
      j = this.zzuo;
      if (i >= j) {
        break;
      }
      long l = zzas(this.zzum[i]) & 0xFFFFF;
      Object localObject = zznd.zzo(paramT, l);
      if (localObject != null) {
        zznd.zza(paramT, l, this.zzut.zzk(localObject));
      }
    }
    int k = this.zzum.length;
    for (i = j; i < k; i++) {
      this.zzuq.zza(paramT, this.zzum[i]);
    }
    this.zzur.zzd(paramT);
    if (this.zzui) {
      this.zzus.zzd(paramT);
    }
  }
  
  public final int zzn(T paramT)
  {
    int i2;
    long l;
    Object localObject2;
    int i1;
    if (this.zzuk)
    {
      localObject1 = zzuc;
      n = 0;
      for (m = 0; n < this.zzud.length; m = i)
      {
        j = zzas(n);
        i = (j & 0xFF00000) >>> 20;
        i2 = this.zzud[n];
        l = j & 0xFFFFF;
        if ((i >= zzke.zzqh.id()) && (i <= zzke.zzqu.id())) {
          j = this.zzud[(n + 2)] & 0xFFFFF;
        } else {
          j = 0;
        }
        switch (i)
        {
        default: 
          i = m;
          break;
        case 68: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzc(i2, (zzlq)zznd.zzo(paramT, l), zzap(n));
          break;
        case 67: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzf(i2, zzh(paramT, l));
          break;
        case 66: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzi(i2, zzg(paramT, l));
          break;
        case 65: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzh(i2, 0L);
          break;
        case 64: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzk(i2, 0);
          break;
        case 63: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzl(i2, zzg(paramT, l));
          break;
        case 62: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzh(i2, zzg(paramT, l));
          break;
        case 61: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzc(i2, (zzjc)zznd.zzo(paramT, l));
          break;
        case 60: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzmh.zzc(i2, zznd.zzo(paramT, l), zzap(n));
          break;
        case 59: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          localObject2 = zznd.zzo(paramT, l);
          if ((localObject2 instanceof zzjc)) {
            i = zzjr.zzc(i2, (zzjc)localObject2);
          } else {
            i = zzjr.zzb(i2, (String)localObject2);
          }
          break;
        case 58: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzc(i2, true);
          break;
        case 57: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzj(i2, 0);
          break;
        case 56: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzg(i2, 0L);
          break;
        case 55: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzg(i2, zzg(paramT, l));
          break;
        case 54: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zze(i2, zzh(paramT, l));
          break;
        case 53: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzd(i2, zzh(paramT, l));
          break;
        case 52: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzb(i2, 0.0F);
          break;
        case 51: 
          i = m;
          if (!zza(paramT, i2, n)) {
            break label2689;
          }
          i = zzjr.zzb(i2, 0.0D);
          break;
        case 50: 
          i = this.zzut.zzb(i2, zznd.zzo(paramT, l), zzaq(n));
          break;
        case 49: 
          i = zzmh.zzd(i2, zzd(paramT, l), zzap(n));
          break;
        case 48: 
          k = zzmh.zzc((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 47: 
          k = zzmh.zzg((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 46: 
          k = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 45: 
          k = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 44: 
          k = zzmh.zzd((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 43: 
          k = zzmh.zzf((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 42: 
          k = zzmh.zzj((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 41: 
          k = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 40: 
          k = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 39: 
          k = zzmh.zze((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 38: 
          k = zzmh.zzb((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 37: 
          k = zzmh.zza((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 36: 
          k = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (k <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, k);
          }
          i = zzjr.zzab(i2);
          i1 = zzjr.zzad(k);
          j = k;
          k = i1;
          break;
        case 35: 
          i1 = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
          i = m;
          if (i1 <= 0) {
            break label2689;
          }
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, j, i1);
          }
          i = zzjr.zzab(i2);
          k = zzjr.zzad(i1);
          j = i1;
          i = i + k + j;
          break;
        case 34: 
          i = zzmh.zzq(i2, zzd(paramT, l), false);
          break;
        case 33: 
          i = zzmh.zzu(i2, zzd(paramT, l), false);
          break;
        case 32: 
          i = zzmh.zzw(i2, zzd(paramT, l), false);
          break;
        case 31: 
          i = zzmh.zzv(i2, zzd(paramT, l), false);
          break;
        case 30: 
          i = zzmh.zzr(i2, zzd(paramT, l), false);
          break;
        case 29: 
          i = zzmh.zzt(i2, zzd(paramT, l), false);
          break;
        case 28: 
          i = zzmh.zzd(i2, zzd(paramT, l));
          break;
        case 27: 
          i = zzmh.zzc(i2, zzd(paramT, l), zzap(n));
          break;
        case 26: 
          i = zzmh.zzc(i2, zzd(paramT, l));
          break;
        case 25: 
          i = zzmh.zzx(i2, zzd(paramT, l), false);
          break;
        case 24: 
          i = zzmh.zzv(i2, zzd(paramT, l), false);
          break;
        case 23: 
          i = zzmh.zzw(i2, zzd(paramT, l), false);
          break;
        case 22: 
          i = zzmh.zzs(i2, zzd(paramT, l), false);
          break;
        case 21: 
          i = zzmh.zzp(i2, zzd(paramT, l), false);
          break;
        case 20: 
          i = zzmh.zzo(i2, zzd(paramT, l), false);
          break;
        case 19: 
          i = zzmh.zzv(i2, zzd(paramT, l), false);
          break;
        case 18: 
          i = zzmh.zzw(i2, zzd(paramT, l), false);
        }
        for (;;)
        {
          i = m + i;
          break;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzc(i2, (zzlq)zznd.zzo(paramT, l), zzap(n));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzf(i2, zznd.zzk(paramT, l));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzi(i2, zznd.zzj(paramT, l));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzh(i2, 0L);
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzk(i2, 0);
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzl(i2, zznd.zzj(paramT, l));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzh(i2, zznd.zzj(paramT, l));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzjr.zzc(i2, (zzjc)zznd.zzo(paramT, l));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          i = zzmh.zzc(i2, zznd.zzo(paramT, l), zzap(n));
          continue;
          i = m;
          if (!zza(paramT, n)) {
            break;
          }
          localObject2 = zznd.zzo(paramT, l);
          if ((localObject2 instanceof zzjc))
          {
            i = zzjr.zzc(i2, (zzjc)localObject2);
          }
          else
          {
            i = zzjr.zzb(i2, (String)localObject2);
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzc(i2, true);
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzj(i2, 0);
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzg(i2, 0L);
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzg(i2, zznd.zzj(paramT, l));
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zze(i2, zznd.zzk(paramT, l));
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzd(i2, zznd.zzk(paramT, l));
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzb(i2, 0.0F);
            continue;
            i = m;
            if (!zza(paramT, n)) {
              break;
            }
            i = zzjr.zzb(i2, 0.0D);
          }
        }
        label2689:
        n += 3;
      }
      return m + zza(this.zzur, paramT);
    }
    Object localObject1 = zzuc;
    int j = -1;
    int n = 0;
    int m = 0;
    for (int i = 0; n < this.zzud.length; i = i2)
    {
      int i5 = zzas(n);
      localObject2 = this.zzud;
      int i4 = localObject2[n];
      int i6 = (i5 & 0xFF00000) >>> 20;
      int i3;
      if (i6 <= 17)
      {
        i1 = localObject2[(n + 2)];
        i2 = i1 & 0xFFFFF;
        i3 = 1 << (i1 >>> 20);
        k = j;
        if (i2 != j)
        {
          i = ((Unsafe)localObject1).getInt(paramT, i2);
          k = i2;
        }
        j = i1;
        i1 = k;
        k = j;
        i2 = i;
      }
      else
      {
        if ((this.zzul) && (i6 >= zzke.zzqh.id()) && (i6 <= zzke.zzqu.id())) {
          k = this.zzud[(n + 2)] & 0xFFFFF;
        } else {
          k = 0;
        }
        i3 = 0;
        i2 = i;
        i1 = j;
      }
      l = i5 & 0xFFFFF;
      switch (i6)
      {
      default: 
        i = m;
        break;
      case 68: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzc(i4, (zzlq)((Unsafe)localObject1).getObject(paramT, l), zzap(n));
        }
        break;
      case 67: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzf(i4, zzh(paramT, l));
        }
        break;
      case 66: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzi(i4, zzg(paramT, l));
        }
        break;
      case 65: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzh(i4, 0L);
        }
        break;
      case 64: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzk(i4, 0);
        }
        break;
      case 63: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzl(i4, zzg(paramT, l));
        }
        break;
      case 62: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzh(i4, zzg(paramT, l));
        }
        break;
      case 61: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzc(i4, (zzjc)((Unsafe)localObject1).getObject(paramT, l));
        }
        break;
      case 60: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzmh.zzc(i4, ((Unsafe)localObject1).getObject(paramT, l), zzap(n));
        }
        break;
      case 59: 
        i = m;
        if (zza(paramT, i4, n))
        {
          localObject2 = ((Unsafe)localObject1).getObject(paramT, l);
          if ((localObject2 instanceof zzjc)) {
            i = zzjr.zzc(i4, (zzjc)localObject2);
          } else {
            i = zzjr.zzb(i4, (String)localObject2);
          }
        }
        break;
      case 58: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzc(i4, true);
        }
        break;
      case 57: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzj(i4, 0);
        }
        break;
      case 56: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzg(i4, 0L);
        }
        break;
      case 55: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzg(i4, zzg(paramT, l));
        }
        break;
      case 54: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zze(i4, zzh(paramT, l));
        }
        break;
      case 53: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzd(i4, zzh(paramT, l));
        }
        break;
      case 52: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzb(i4, 0.0F);
        }
        break;
      case 51: 
        i = m;
        if (zza(paramT, i4, n)) {
          i = zzjr.zzb(i4, 0.0D);
        }
        break;
      case 50: 
        i = this.zzut.zzb(i4, ((Unsafe)localObject1).getObject(paramT, l), zzaq(n));
        break;
      case 49: 
        i = zzmh.zzd(i4, (List)((Unsafe)localObject1).getObject(paramT, l), zzap(n));
        break;
      case 48: 
        j = zzmh.zzc((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 47: 
        j = zzmh.zzg((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 46: 
        j = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 45: 
        j = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 44: 
        j = zzmh.zzd((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 43: 
        j = zzmh.zzf((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 42: 
        j = zzmh.zzj((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 41: 
        j = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 40: 
        j = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 39: 
        j = zzmh.zze((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 38: 
        j = zzmh.zzb((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 37: 
        j = zzmh.zza((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 36: 
        j = zzmh.zzh((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (j > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, j);
          }
          i3 = zzjr.zzab(i4);
          k = zzjr.zzad(j);
          i = j;
          j = i3;
        }
        break;
      case 35: 
        i3 = zzmh.zzi((List)((Unsafe)localObject1).getObject(paramT, l));
        i = m;
        if (i3 > 0)
        {
          if (this.zzul) {
            ((Unsafe)localObject1).putInt(paramT, k, i3);
          }
          j = zzjr.zzab(i4);
          k = zzjr.zzad(i3);
          i = i3;
          i = j + k + i;
        }
        break;
      case 34: 
        i = zzmh.zzq(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 33: 
        i = zzmh.zzu(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 32: 
        i = zzmh.zzw(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 31: 
        i = zzmh.zzv(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 30: 
        i = zzmh.zzr(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 29: 
        i = zzmh.zzt(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 28: 
        i = zzmh.zzd(i4, (List)((Unsafe)localObject1).getObject(paramT, l));
        break;
      case 27: 
        i = zzmh.zzc(i4, (List)((Unsafe)localObject1).getObject(paramT, l), zzap(n));
        break;
      case 26: 
        i = zzmh.zzc(i4, (List)((Unsafe)localObject1).getObject(paramT, l));
        break;
      case 25: 
        i = zzmh.zzx(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 24: 
        i = zzmh.zzv(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 23: 
        i = zzmh.zzw(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 22: 
        i = zzmh.zzs(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 21: 
        i = zzmh.zzp(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 20: 
        i = zzmh.zzo(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        break;
      case 19: 
        i = zzmh.zzv(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        i = m + i;
        break;
      case 18: 
        i = zzmh.zzw(i4, (List)((Unsafe)localObject1).getObject(paramT, l), false);
        i = m + i;
      }
      for (;;)
      {
        break label5556;
        i = m;
        if ((i2 & i3) != 0)
        {
          i = zzjr.zzc(i4, (zzlq)((Unsafe)localObject1).getObject(paramT, l), zzap(n));
          break;
          i = m;
          if ((i2 & i3) != 0)
          {
            i = zzjr.zzf(i4, ((Unsafe)localObject1).getLong(paramT, l));
            break;
            i = m;
            if ((i2 & i3) != 0)
            {
              i = zzjr.zzi(i4, ((Unsafe)localObject1).getInt(paramT, l));
              break;
              i = m;
              if ((i2 & i3) != 0)
              {
                i = zzjr.zzh(i4, 0L);
                break;
                i = m;
                if ((i2 & i3) != 0)
                {
                  i = zzjr.zzk(i4, 0);
                  i = m + i;
                  continue;
                  i = m;
                  if ((i2 & i3) != 0)
                  {
                    i = zzjr.zzl(i4, ((Unsafe)localObject1).getInt(paramT, l));
                    break;
                    i = m;
                    if ((i2 & i3) != 0)
                    {
                      i = zzjr.zzh(i4, ((Unsafe)localObject1).getInt(paramT, l));
                      break;
                      i = m;
                      if ((i2 & i3) != 0)
                      {
                        i = zzjr.zzc(i4, (zzjc)((Unsafe)localObject1).getObject(paramT, l));
                        break;
                        i = m;
                        if ((i2 & i3) != 0)
                        {
                          i = zzmh.zzc(i4, ((Unsafe)localObject1).getObject(paramT, l), zzap(n));
                          break;
                          i = m;
                          if ((i2 & i3) != 0)
                          {
                            localObject2 = ((Unsafe)localObject1).getObject(paramT, l);
                            if ((localObject2 instanceof zzjc))
                            {
                              i = zzjr.zzc(i4, (zzjc)localObject2);
                              break;
                            }
                            i = zzjr.zzb(i4, (String)localObject2);
                            break;
                            i = m;
                            if ((i2 & i3) != 0)
                            {
                              i = m + zzjr.zzc(i4, true);
                              continue;
                              i = m;
                              if ((i2 & i3) != 0)
                              {
                                i = m + zzjr.zzj(i4, 0);
                                continue;
                                i = m;
                                if ((i2 & i3) != 0)
                                {
                                  i = zzjr.zzg(i4, 0L);
                                  break label5503;
                                  i = m;
                                  if ((i2 & i3) != 0)
                                  {
                                    i = zzjr.zzg(i4, ((Unsafe)localObject1).getInt(paramT, l));
                                    break label5503;
                                    i = m;
                                    if ((i2 & i3) != 0)
                                    {
                                      i = zzjr.zze(i4, ((Unsafe)localObject1).getLong(paramT, l));
                                      break label5503;
                                      i = m;
                                      if ((i2 & i3) != 0)
                                      {
                                        i = zzjr.zzd(i4, ((Unsafe)localObject1).getLong(paramT, l));
                                        label5503:
                                        i = m + i;
                                      }
                                    }
                                  }
                                }
                                for (;;)
                                {
                                  break;
                                  i = m;
                                  if ((i2 & i3) != 0) {
                                    i = m + zzjr.zzb(i4, 0.0F);
                                  }
                                }
                                for (;;)
                                {
                                  break;
                                  i = m;
                                  if ((i2 & i3) != 0) {
                                    i = m + zzjr.zzb(i4, 0.0D);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      label5556:
      n += 3;
      j = i1;
      m = i;
    }
    n = 0;
    int k = m + zza(this.zzur, paramT);
    i = k;
    if (this.zzui)
    {
      localObject1 = this.zzus.zzb(paramT);
      j = 0;
      i = n;
      while (j < ((zzkb)localObject1).zzos.zzer())
      {
        paramT = ((zzkb)localObject1).zzos.zzaw(j);
        i += zzkb.zzb((zzkd)paramT.getKey(), paramT.getValue());
        j++;
      }
      localObject1 = ((zzkb)localObject1).zzos.zzes().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramT = (Map.Entry)((Iterator)localObject1).next();
        i += zzkb.zzb((zzkd)paramT.getKey(), paramT.getValue());
      }
      i = k + i;
    }
    return i;
  }
  
  public final boolean zzp(T paramT)
  {
    int m = -1;
    int i = 0;
    int k = 0;
    for (;;)
    {
      int j = this.zzun;
      int i1 = 1;
      int i2 = 1;
      if (i >= j) {
        break;
      }
      int i5 = this.zzum[i];
      int i6 = this.zzud[i5];
      int i7 = zzas(i5);
      int n;
      if (!this.zzuk)
      {
        j = this.zzud[(i5 + 2)];
        int i3 = j & 0xFFFFF;
        int i4 = 1 << (j >>> 20);
        j = m;
        n = i4;
        if (i3 != m)
        {
          k = zzuc.getInt(paramT, i3);
          j = i3;
          n = i4;
        }
      }
      else
      {
        n = 0;
        j = m;
      }
      if ((0x10000000 & i7) != 0) {
        m = 1;
      } else {
        m = 0;
      }
      if ((m != 0) && (!zza(paramT, i5, k, n))) {
        return false;
      }
      m = (0xFF00000 & i7) >>> 20;
      if ((m != 9) && (m != 17))
      {
        Object localObject2;
        if (m != 27) {
          if ((m != 60) && (m != 68))
          {
            if (m != 49)
            {
              if (m != 50) {
                break label536;
              }
              localObject2 = this.zzut.zzi(zznd.zzo(paramT, i7 & 0xFFFFF));
              m = i2;
              if (!((Map)localObject2).isEmpty())
              {
                localObject1 = zzaq(i5);
                m = i2;
                if (this.zzut.zzm(localObject1).zztw.zzfj() == zznr.zzxx)
                {
                  localObject1 = null;
                  Iterator localIterator = ((Map)localObject2).values().iterator();
                  Object localObject3;
                  do
                  {
                    m = i2;
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = localIterator.next();
                    localObject2 = localObject1;
                    if (localObject1 == null) {
                      localObject2 = zzmd.zzej().zzf(localObject3.getClass());
                    }
                    localObject1 = localObject2;
                  } while (((zzmf)localObject2).zzp(localObject3));
                  m = 0;
                }
              }
              if (m != 0) {
                break label536;
              }
              return false;
            }
          }
          else
          {
            if ((!zza(paramT, i6, i5)) || (zza(paramT, i7, zzap(i5)))) {
              break label536;
            }
            return false;
          }
        }
        Object localObject1 = (List)zznd.zzo(paramT, i7 & 0xFFFFF);
        m = i1;
        if (!((List)localObject1).isEmpty())
        {
          localObject2 = zzap(i5);
          for (n = 0;; n++)
          {
            m = i1;
            if (n >= ((List)localObject1).size()) {
              break;
            }
            if (!((zzmf)localObject2).zzp(((List)localObject1).get(n)))
            {
              m = 0;
              break;
            }
          }
        }
        if (m == 0) {
          return false;
        }
      }
      else if ((zza(paramT, i5, k, n)) && (!zza(paramT, i7, zzap(i5))))
      {
        return false;
      }
      label536:
      i++;
      m = j;
    }
    return (!this.zzui) || (this.zzus.zzb(paramT).isInitialized());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */