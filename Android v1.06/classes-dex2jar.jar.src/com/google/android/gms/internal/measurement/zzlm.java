package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class zzlm<T>
  implements zzlu<T>
{
  private static final int[] zza = new int[0];
  private static final Unsafe zzb = zzmv.zzg();
  private final int[] zzc;
  private final Object[] zzd;
  private final int zze;
  private final int zzf;
  private final zzlj zzg;
  private final boolean zzh;
  private final boolean zzi;
  private final int[] zzj;
  private final int zzk;
  private final int zzl;
  private final zzkx zzm;
  private final zzml zzn;
  private final zzjp zzo;
  private final zzlo zzp;
  private final zzle zzq;
  
  private zzlm(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, zzlj paramzzlj, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, zzlo paramzzlo, zzkx paramzzkx, zzml paramzzml, zzjp paramzzjp, zzle paramzzle, byte[] paramArrayOfByte)
  {
    this.zzc = paramArrayOfInt1;
    this.zzd = paramArrayOfObject;
    this.zze = paramInt1;
    this.zzf = paramInt2;
    this.zzi = paramBoolean1;
    paramBoolean2 = false;
    paramBoolean1 = paramBoolean2;
    if (paramzzjp != null)
    {
      paramBoolean1 = paramBoolean2;
      if (paramzzjp.zzc(paramzzlj)) {
        paramBoolean1 = true;
      }
    }
    this.zzh = paramBoolean1;
    this.zzj = paramArrayOfInt2;
    this.zzk = paramInt3;
    this.zzl = paramInt4;
    this.zzp = paramzzlo;
    this.zzm = paramzzkx;
    this.zzn = paramzzml;
    this.zzo = paramzzjp;
    this.zzg = paramzzlj;
    this.zzq = paramzzle;
  }
  
  private static int zzA(int paramInt)
  {
    return paramInt >>> 20 & 0xFF;
  }
  
  private final int zzB(int paramInt)
  {
    return this.zzc[(paramInt + 1)];
  }
  
  private static long zzC(Object paramObject, long paramLong)
  {
    return ((Long)zzmv.zzf(paramObject, paramLong)).longValue();
  }
  
  private final zzkg zzD(int paramInt)
  {
    paramInt /= 3;
    return (zzkg)this.zzd[(paramInt + paramInt + 1)];
  }
  
  private final zzlu zzE(int paramInt)
  {
    paramInt /= 3;
    paramInt += paramInt;
    zzlu localzzlu = (zzlu)this.zzd[paramInt];
    if (localzzlu != null) {
      return localzzlu;
    }
    localzzlu = zzlr.zza().zzb((Class)this.zzd[(paramInt + 1)]);
    this.zzd[paramInt] = localzzlu;
    return localzzlu;
  }
  
  private final Object zzF(int paramInt)
  {
    paramInt /= 3;
    return this.zzd[(paramInt + paramInt)];
  }
  
  private static Field zzG(Class paramClass, String paramString)
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
      ??? = Arrays.toString((Object[])???);
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Field ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" for ");
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append(" not found. Known fields are ");
      ((StringBuilder)localObject2).append((String)???);
      throw new RuntimeException(((StringBuilder)localObject2).toString());
    }
  }
  
  private final void zzH(Object paramObject1, Object paramObject2, int paramInt)
  {
    long l = zzB(paramInt) & 0xFFFFF;
    if (!zzO(paramObject2, paramInt)) {
      return;
    }
    Object localObject = zzmv.zzf(paramObject1, l);
    paramObject2 = zzmv.zzf(paramObject2, l);
    if ((localObject != null) && (paramObject2 != null))
    {
      zzmv.zzs(paramObject1, l, zzkk.zzg(localObject, paramObject2));
      zzJ(paramObject1, paramInt);
      return;
    }
    if (paramObject2 != null)
    {
      zzmv.zzs(paramObject1, l, paramObject2);
      zzJ(paramObject1, paramInt);
    }
  }
  
  private final void zzI(Object paramObject1, Object paramObject2, int paramInt)
  {
    int j = zzB(paramInt);
    int i = this.zzc[paramInt];
    long l = j & 0xFFFFF;
    if (!zzR(paramObject2, i, paramInt)) {
      return;
    }
    Object localObject;
    if (zzR(paramObject1, i, paramInt)) {
      localObject = zzmv.zzf(paramObject1, l);
    } else {
      localObject = null;
    }
    paramObject2 = zzmv.zzf(paramObject2, l);
    if ((localObject != null) && (paramObject2 != null))
    {
      zzmv.zzs(paramObject1, l, zzkk.zzg(localObject, paramObject2));
      zzK(paramObject1, i, paramInt);
      return;
    }
    if (paramObject2 != null)
    {
      zzmv.zzs(paramObject1, l, paramObject2);
      zzK(paramObject1, i, paramInt);
    }
  }
  
  private final void zzJ(Object paramObject, int paramInt)
  {
    paramInt = zzy(paramInt);
    long l = 0xFFFFF & paramInt;
    if (l == 1048575L) {
      return;
    }
    zzmv.zzq(paramObject, l, 1 << (paramInt >>> 20) | zzmv.zzc(paramObject, l));
  }
  
  private final void zzK(Object paramObject, int paramInt1, int paramInt2)
  {
    zzmv.zzq(paramObject, zzy(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  private final void zzL(Object paramObject, zznd paramzznd)
    throws IOException
  {
    if (!this.zzh)
    {
      int i1 = this.zzc.length;
      Object localObject = zzb;
      int m = 0;
      int j = 0;
      int i = 1048575;
      while (m < i1)
      {
        int i2 = zzB(m);
        int[] arrayOfInt = this.zzc;
        int i4 = arrayOfInt[m];
        int i3 = zzA(i2);
        int n;
        int k;
        if (i3 <= 17)
        {
          int i5 = arrayOfInt[(m + 2)];
          n = i5 & 0xFFFFF;
          k = j;
          j = i;
          if (n != i)
          {
            k = ((Unsafe)localObject).getInt(paramObject, n);
            j = n;
          }
          n = 1 << (i5 >>> 20);
          i = j;
        }
        else
        {
          n = 0;
          k = j;
        }
        long l = i2 & 0xFFFFF;
        switch (i3)
        {
        }
        for (;;)
        {
          break;
          if (zzR(paramObject, i4, m))
          {
            paramzznd.zzq(i4, ((Unsafe)localObject).getObject(paramObject, l), zzE(m));
            continue;
            if (zzR(paramObject, i4, m))
            {
              paramzznd.zzC(i4, zzC(paramObject, l));
              continue;
              if (zzR(paramObject, i4, m))
              {
                paramzznd.zzA(i4, zzr(paramObject, l));
                continue;
                if (zzR(paramObject, i4, m))
                {
                  paramzznd.zzy(i4, zzC(paramObject, l));
                  continue;
                  if (zzR(paramObject, i4, m))
                  {
                    paramzznd.zzw(i4, zzr(paramObject, l));
                    continue;
                    if (zzR(paramObject, i4, m))
                    {
                      paramzznd.zzi(i4, zzr(paramObject, l));
                      continue;
                      if (zzR(paramObject, i4, m))
                      {
                        paramzznd.zzH(i4, zzr(paramObject, l));
                        continue;
                        if (zzR(paramObject, i4, m))
                        {
                          paramzznd.zzd(i4, (zzjb)((Unsafe)localObject).getObject(paramObject, l));
                          continue;
                          if (zzR(paramObject, i4, m))
                          {
                            paramzznd.zzv(i4, ((Unsafe)localObject).getObject(paramObject, l), zzE(m));
                            continue;
                            if (zzR(paramObject, i4, m))
                            {
                              zzT(i4, ((Unsafe)localObject).getObject(paramObject, l), paramzznd);
                              continue;
                              if (zzR(paramObject, i4, m))
                              {
                                paramzznd.zzb(i4, zzS(paramObject, l));
                                continue;
                                if (zzR(paramObject, i4, m))
                                {
                                  paramzznd.zzk(i4, zzr(paramObject, l));
                                  continue;
                                  if (zzR(paramObject, i4, m))
                                  {
                                    paramzznd.zzm(i4, zzC(paramObject, l));
                                    continue;
                                    if (zzR(paramObject, i4, m))
                                    {
                                      paramzznd.zzr(i4, zzr(paramObject, l));
                                      continue;
                                      if (zzR(paramObject, i4, m))
                                      {
                                        paramzznd.zzJ(i4, zzC(paramObject, l));
                                        continue;
                                        if (zzR(paramObject, i4, m))
                                        {
                                          paramzznd.zzt(i4, zzC(paramObject, l));
                                          continue;
                                          if (zzR(paramObject, i4, m))
                                          {
                                            paramzznd.zzo(i4, zzo(paramObject, l));
                                            continue;
                                            if (zzR(paramObject, i4, m))
                                            {
                                              paramzznd.zzf(i4, zzn(paramObject, l));
                                              continue;
                                              zzM(paramzznd, i4, ((Unsafe)localObject).getObject(paramObject, l), m);
                                              continue;
                                              zzlw.zzO(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, zzE(m));
                                              continue;
                                              zzlw.zzV(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzU(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzT(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzS(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzK(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzX(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzH(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzL(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzM(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzP(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzY(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzQ(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzN(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzJ(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, true);
                                              continue;
                                              zzlw.zzV(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzU(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzT(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzS(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzK(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzX(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              continue;
                                              zzlw.zzI(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd);
                                              continue;
                                              zzlw.zzR(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, zzE(m));
                                              continue;
                                              zzlw.zzW(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd);
                                              continue;
                                              zzlw.zzH(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzL(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzM(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzP(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzY(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzQ(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzN(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              zzlw.zzJ(this.zzc[m], (List)((Unsafe)localObject).getObject(paramObject, l), paramzznd, false);
                                              break;
                                              if ((k & n) != 0)
                                              {
                                                paramzznd.zzq(i4, ((Unsafe)localObject).getObject(paramObject, l), zzE(m));
                                                break;
                                                if ((k & n) != 0)
                                                {
                                                  paramzznd.zzC(i4, ((Unsafe)localObject).getLong(paramObject, l));
                                                  break;
                                                  if ((k & n) != 0)
                                                  {
                                                    paramzznd.zzA(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                    break;
                                                    if ((k & n) != 0)
                                                    {
                                                      paramzznd.zzy(i4, ((Unsafe)localObject).getLong(paramObject, l));
                                                      break;
                                                      if ((k & n) != 0)
                                                      {
                                                        paramzznd.zzw(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                        break;
                                                        if ((k & n) != 0)
                                                        {
                                                          paramzznd.zzi(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                          break;
                                                          if ((k & n) != 0)
                                                          {
                                                            paramzznd.zzH(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                            break;
                                                            if ((k & n) != 0)
                                                            {
                                                              paramzznd.zzd(i4, (zzjb)((Unsafe)localObject).getObject(paramObject, l));
                                                              break;
                                                              if ((k & n) != 0)
                                                              {
                                                                paramzznd.zzv(i4, ((Unsafe)localObject).getObject(paramObject, l), zzE(m));
                                                                break;
                                                                if ((k & n) != 0)
                                                                {
                                                                  zzT(i4, ((Unsafe)localObject).getObject(paramObject, l), paramzznd);
                                                                  break;
                                                                  if ((k & n) != 0)
                                                                  {
                                                                    paramzznd.zzb(i4, zzmv.zzw(paramObject, l));
                                                                    break;
                                                                    if ((k & n) != 0)
                                                                    {
                                                                      paramzznd.zzk(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                                      break;
                                                                      if ((k & n) != 0)
                                                                      {
                                                                        paramzznd.zzm(i4, ((Unsafe)localObject).getLong(paramObject, l));
                                                                        break;
                                                                        if ((k & n) != 0)
                                                                        {
                                                                          paramzznd.zzr(i4, ((Unsafe)localObject).getInt(paramObject, l));
                                                                          break;
                                                                          if ((k & n) != 0)
                                                                          {
                                                                            paramzznd.zzJ(i4, ((Unsafe)localObject).getLong(paramObject, l));
                                                                            break;
                                                                            if ((k & n) != 0)
                                                                            {
                                                                              paramzznd.zzt(i4, ((Unsafe)localObject).getLong(paramObject, l));
                                                                              break;
                                                                              if ((k & n) != 0)
                                                                              {
                                                                                paramzznd.zzo(i4, zzmv.zzb(paramObject, l));
                                                                                break;
                                                                                if ((k & n) != 0) {
                                                                                  paramzznd.zzf(i4, zzmv.zza(paramObject, l));
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
        j = k;
      }
      localObject = this.zzn;
      ((zzml)localObject).zzi(((zzml)localObject).zzc(paramObject), paramzznd);
      return;
    }
    this.zzo.zza(paramObject);
    throw null;
  }
  
  private final void zzM(zznd paramzznd, int paramInt1, Object paramObject, int paramInt2)
    throws IOException
  {
    if (paramObject == null) {
      return;
    }
    paramzznd = (zzlc)zzF(paramInt2);
    throw null;
  }
  
  private final boolean zzN(Object paramObject1, Object paramObject2, int paramInt)
  {
    return zzO(paramObject1, paramInt) == zzO(paramObject2, paramInt);
  }
  
  private final boolean zzO(Object paramObject, int paramInt)
  {
    int i = zzy(paramInt);
    long l = i & 0xFFFFF;
    if (l == 1048575L)
    {
      paramInt = zzB(paramInt);
      l = paramInt & 0xFFFFF;
      switch (zzA(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return zzmv.zzf(paramObject, l) != null;
      case 16: 
        return zzmv.zzd(paramObject, l) != 0L;
      case 15: 
        return zzmv.zzc(paramObject, l) != 0;
      case 14: 
        return zzmv.zzd(paramObject, l) != 0L;
      case 13: 
        return zzmv.zzc(paramObject, l) != 0;
      case 12: 
        return zzmv.zzc(paramObject, l) != 0;
      case 11: 
        return zzmv.zzc(paramObject, l) != 0;
      case 10: 
        return !zzjb.zzb.equals(zzmv.zzf(paramObject, l));
      case 9: 
        return zzmv.zzf(paramObject, l) != null;
      case 8: 
        paramObject = zzmv.zzf(paramObject, l);
        if ((paramObject instanceof String)) {
          return !((String)paramObject).isEmpty();
        }
        if ((paramObject instanceof zzjb)) {
          return !zzjb.zzb.equals(paramObject);
        }
        throw new IllegalArgumentException();
      case 7: 
        return zzmv.zzw(paramObject, l);
      case 6: 
        return zzmv.zzc(paramObject, l) != 0;
      case 5: 
        return zzmv.zzd(paramObject, l) != 0L;
      case 4: 
        return zzmv.zzc(paramObject, l) != 0;
      case 3: 
        return zzmv.zzd(paramObject, l) != 0L;
      case 2: 
        return zzmv.zzd(paramObject, l) != 0L;
      case 1: 
        return Float.floatToRawIntBits(zzmv.zzb(paramObject, l)) != 0;
      }
      return Double.doubleToRawLongBits(zzmv.zza(paramObject, l)) != 0L;
    }
    return (zzmv.zzc(paramObject, l) & 1 << (i >>> 20)) != 0;
  }
  
  private final boolean zzP(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return zzO(paramObject, paramInt1);
    }
    return (paramInt3 & paramInt4) != 0;
  }
  
  private static boolean zzQ(Object paramObject, int paramInt, zzlu paramzzlu)
  {
    return paramzzlu.zzk(zzmv.zzf(paramObject, paramInt & 0xFFFFF));
  }
  
  private final boolean zzR(Object paramObject, int paramInt1, int paramInt2)
  {
    return zzmv.zzc(paramObject, zzy(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  private static boolean zzS(Object paramObject, long paramLong)
  {
    return ((Boolean)zzmv.zzf(paramObject, paramLong)).booleanValue();
  }
  
  private static final void zzT(int paramInt, Object paramObject, zznd paramzznd)
    throws IOException
  {
    if ((paramObject instanceof String))
    {
      paramzznd.zzF(paramInt, (String)paramObject);
      return;
    }
    paramzznd.zzd(paramInt, (zzjb)paramObject);
  }
  
  static zzmm zzd(Object paramObject)
  {
    zzkc localzzkc = (zzkc)paramObject;
    zzmm localzzmm = localzzkc.zzc;
    paramObject = localzzmm;
    if (localzzmm == zzmm.zzc())
    {
      paramObject = zzmm.zze();
      localzzkc.zzc = ((zzmm)paramObject);
    }
    return (zzmm)paramObject;
  }
  
  static zzlm zzl(Class paramClass, zzlg paramzzlg, zzlo paramzzlo, zzkx paramzzkx, zzml paramzzml, zzjp paramzzjp, zzle paramzzle)
  {
    if ((paramzzlg instanceof zzlt)) {
      return zzm((zzlt)paramzzlg, paramzzlo, paramzzkx, paramzzml, paramzzjp, paramzzle);
    }
    paramClass = (zzmi)paramzzlg;
    throw null;
  }
  
  static zzlm zzm(zzlt paramzzlt, zzlo paramzzlo, zzkx paramzzkx, zzml paramzzml, zzjp paramzzjp, zzle paramzzle)
  {
    boolean bool;
    if (paramzzlt.zzc() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    String str = paramzzlt.zzd();
    int i8 = str.length();
    if (str.charAt(0) >= 55296) {
      for (i = 1;; i = k)
      {
        k = i + 1;
        j = k;
        if (str.charAt(i) < 55296) {
          break;
        }
      }
    }
    int j = 1;
    int i = j + 1;
    int m = str.charAt(j);
    int k = i;
    j = m;
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
      j = k | m << j;
      k = i;
    }
    int[] arrayOfInt1;
    int i4;
    int i2;
    int n;
    if (j == 0)
    {
      arrayOfInt1 = zza;
      i4 = 0;
      i1 = 0;
      m = 0;
      i3 = 0;
      i2 = 0;
      j = 0;
      n = 0;
    }
    else
    {
      j = k + 1;
      k = str.charAt(k);
      i = k;
      m = j;
      if (k >= 55296)
      {
        k &= 0x1FFF;
        i = 13;
        for (m = j;; m = j)
        {
          j = m + 1;
          m = str.charAt(m);
          if (m < 55296) {
            break;
          }
          k |= (m & 0x1FFF) << i;
          i += 13;
        }
        i = k | m << i;
        m = j;
      }
      k = m + 1;
      m = str.charAt(m);
      i3 = m;
      j = k;
      if (m >= 55296)
      {
        m &= 0x1FFF;
        j = 13;
        for (n = k;; n = k)
        {
          k = n + 1;
          n = str.charAt(n);
          if (n < 55296) {
            break;
          }
          m |= (n & 0x1FFF) << j;
          j += 13;
        }
        i3 = m | n << j;
        j = k;
      }
      m = j + 1;
      n = str.charAt(j);
      k = n;
      j = m;
      if (n >= 55296)
      {
        k = n & 0x1FFF;
        j = 13;
        n = m;
        m = k;
        for (;;)
        {
          k = n + 1;
          n = str.charAt(n);
          if (n < 55296) {
            break;
          }
          m |= (n & 0x1FFF) << j;
          j += 13;
          n = k;
        }
        m |= n << j;
        j = k;
        k = m;
      }
      m = j + 1;
      n = str.charAt(j);
      j = n;
      i1 = m;
      if (n >= 55296)
      {
        j = n & 0x1FFF;
        n = 13;
        i1 = m;
        m = j;
        for (;;)
        {
          j = i1 + 1;
          i1 = str.charAt(i1);
          if (i1 < 55296) {
            break;
          }
          m |= (i1 & 0x1FFF) << n;
          n += 13;
          i1 = j;
        }
        m |= i1 << n;
        i1 = j;
        j = m;
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
      i4 = str.charAt(i2);
      n = i4;
      i2 = i1;
      if (i4 >= 55296)
      {
        i2 = i4 & 0x1FFF;
        n = 13;
        for (i4 = i1;; i4 = i1)
        {
          i1 = i4 + 1;
          i4 = str.charAt(i4);
          if (i4 < 55296) {
            break;
          }
          i2 |= (i4 & 0x1FFF) << n;
          n += 13;
        }
        n = i2 | i4 << n;
        i2 = i1;
      }
      i1 = i2 + 1;
      i5 = str.charAt(i2);
      i4 = i5;
      i2 = i1;
      if (i5 >= 55296)
      {
        i4 = i5 & 0x1FFF;
        i2 = 13;
        for (i5 = i1;; i5 = i1)
        {
          i1 = i5 + 1;
          i5 = str.charAt(i5);
          if (i5 < 55296) {
            break;
          }
          i4 |= (i5 & 0x1FFF) << i2;
          i2 += 13;
        }
        i4 |= i5 << i2;
        i2 = i1;
      }
      i5 = i2 + 1;
      i6 = str.charAt(i2);
      i1 = i6;
      i2 = i5;
      if (i6 >= 55296)
      {
        i2 = i6 & 0x1FFF;
        i1 = 13;
        i6 = i5;
        i5 = i2;
        for (;;)
        {
          i2 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i5 |= (i6 & 0x1FFF) << i1;
          i1 += 13;
          i6 = i2;
        }
        i1 = i5 | i6 << i1;
      }
      arrayOfInt1 = new int[i1 + n + i4];
      i3 = i + i + i3;
      i4 = i;
      i = i2;
      i2 = j;
      i5 = n;
      n = i3;
      j = i1;
      i3 = m;
      m = i5;
      i1 = k;
      k = i;
    }
    Unsafe localUnsafe = zzb;
    Object[] arrayOfObject2 = paramzzlt.zze();
    Class localClass = paramzzlt.zza().getClass();
    int[] arrayOfInt2 = new int[i3 * 3];
    Object[] arrayOfObject1 = new Object[i3 + i3];
    int i14 = j + m;
    i = j;
    m = i14;
    int i7 = 0;
    int i3 = 0;
    int i5 = j;
    j = i2;
    int i6 = i1;
    int i1 = k;
    k = i8;
    while (i1 < k)
    {
      int i9 = i1 + 1;
      i8 = str.charAt(i1);
      if (i8 >= 55296)
      {
        i8 &= 0x1FFF;
        i1 = 13;
        for (;;)
        {
          i2 = i9 + 1;
          i9 = str.charAt(i9);
          if (i9 < 55296) {
            break;
          }
          i8 |= (i9 & 0x1FFF) << i1;
          i1 += 13;
          i9 = i2;
        }
        i8 |= i9 << i1;
      }
      else
      {
        i2 = i9;
      }
      i1 = i2 + 1;
      int i10 = str.charAt(i2);
      if (i10 >= 55296)
      {
        i9 = i10 & 0x1FFF;
        i10 = i1;
        i1 = 13;
        for (;;)
        {
          i2 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i9 |= (i10 & 0x1FFF) << i1;
          i1 += 13;
          i10 = i2;
        }
        i10 = i9 | i10 << i1;
        i1 = i2;
      }
      int i15 = i10 & 0xFF;
      i9 = i3;
      if ((i10 & 0x400) != 0)
      {
        arrayOfInt1[i3] = i7;
        i9 = i3 + 1;
      }
      int i11;
      label1731:
      Object localObject;
      int i13;
      int i12;
      if (i15 >= 51)
      {
        i2 = i1 + 1;
        i3 = str.charAt(i1);
        if (i3 >= 55296)
        {
          i3 &= 0x1FFF;
          i1 = 13;
          i11 = i2;
          i2 = i3;
          for (;;)
          {
            i3 = i11 + 1;
            i11 = str.charAt(i11);
            if (i11 < 55296) {
              break;
            }
            i2 |= (i11 & 0x1FFF) << i1;
            i1 += 13;
            i11 = i3;
          }
          i2 |= i11 << i1;
          i1 = i3;
          i3 = i2;
        }
        else
        {
          i1 = i2;
        }
        i11 = i15 - 51;
        i2 = i1;
        if ((i11 != 9) && (i11 != 17))
        {
          i1 = n;
          if (i11 != 12) {
            break label1731;
          }
          i1 = n;
          if (bool) {
            break label1731;
          }
          i11 = i7 / 3;
          i1 = n + 1;
          arrayOfObject1[(i11 + i11 + 1)] = arrayOfObject2[n];
          n = i1;
        }
        else
        {
          i11 = i7 / 3;
          i1 = n + 1;
          arrayOfObject1[(i11 + i11 + 1)] = arrayOfObject2[n];
          n = i1;
        }
        i1 = n;
        n = i3 + i3;
        localObject = arrayOfObject2[n];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = zzG(localClass, (String)localObject);
          arrayOfObject2[n] = localObject;
        }
        i13 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        n++;
        localObject = arrayOfObject2[n];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = zzG(localClass, (String)localObject);
          arrayOfObject2[n] = localObject;
        }
        i12 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i3 = 0;
        n = i1;
        i11 = m;
        m = i2;
      }
      else
      {
        i11 = j;
        i2 = n + 1;
        localObject = zzG(localClass, (String)arrayOfObject2[n]);
        if ((i15 != 9) && (i15 != 17))
        {
          if ((i15 != 27) && (i15 != 49))
          {
            if ((i15 != 12) && (i15 != 30) && (i15 != 44))
            {
              n = i2;
              j = i;
              if (i15 == 50)
              {
                j = i + 1;
                arrayOfInt1[i] = i7;
                i = i7 / 3;
                i3 = i + i;
                n = i2 + 1;
                arrayOfObject1[i3] = arrayOfObject2[i2];
                if ((i10 & 0x800) == 0) {
                  break label2045;
                }
                i = n + 1;
                arrayOfObject1[(i3 + 1)] = arrayOfObject2[n];
                n = i;
              }
            }
            label2045:
            do
            {
              i = j;
              break;
              i = j;
              j = n;
              break label2158;
              n = i2;
              j = i;
            } while (bool);
            n = i7 / 3;
            j = i2 + 1;
            arrayOfObject1[(n + n + 1)] = arrayOfObject2[i2];
          }
          else
          {
            n = i7 / 3;
            j = i2 + 1;
            arrayOfObject1[(n + n + 1)] = arrayOfObject2[i2];
          }
        }
        else
        {
          j = i7 / 3;
          arrayOfObject1[(j + j + 1)] = ((Field)localObject).getType();
          n = i2;
          j = n;
        }
        label2158:
        i13 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        if (((i10 & 0x1000) == 4096) && (i15 <= 17))
        {
          i3 = i1 + 1;
          i1 = str.charAt(i1);
          if (i1 >= 55296)
          {
            i2 = i1 & 0x1FFF;
            i1 = 13;
            for (;;)
            {
              n = i3 + 1;
              i3 = str.charAt(i3);
              if (i3 < 55296) {
                break;
              }
              i2 |= (i3 & 0x1FFF) << i1;
              i1 += 13;
              i3 = n;
            }
            i1 = i2 | i3 << i1;
          }
          else
          {
            n = i3;
          }
          i2 = i4 + i4 + i1 / 32;
          localObject = arrayOfObject2[i2];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = zzG(localClass, (String)localObject);
            arrayOfObject2[i2] = localObject;
          }
          i3 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i2 = i1 % 32;
          i1 = i3;
        }
        else
        {
          n = i1;
          i1 = 1048575;
          i2 = 0;
        }
        i3 = m;
        if (i15 >= 18)
        {
          i3 = m;
          if (i15 <= 49)
          {
            arrayOfInt1[m] = i13;
            i3 = m + 1;
          }
        }
        i12 = j;
        j = i11;
        m = n;
        i11 = i3;
        n = i12;
        i3 = i2;
        i12 = i1;
      }
      int i16 = i7 + 1;
      arrayOfInt2[i7] = i8;
      i8 = i16 + 1;
      if ((i10 & 0x200) != 0) {
        i1 = 536870912;
      } else {
        i1 = 0;
      }
      if ((i10 & 0x100) != 0) {
        i2 = 268435456;
      } else {
        i2 = 0;
      }
      arrayOfInt2[i16] = (i2 | i1 | i15 << 20 | i13);
      i7 = i8 + 1;
      arrayOfInt2[i8] = (i3 << 20 | i12);
      i1 = m;
      i3 = i9;
      m = i11;
    }
    return new zzlm(arrayOfInt2, arrayOfObject1, i6, j, paramzzlt.zza(), bool, false, arrayOfInt1, i5, i14, paramzzlo, paramzzkx, paramzzml, paramzzjp, paramzzle, null);
  }
  
  private static double zzn(Object paramObject, long paramLong)
  {
    return ((Double)zzmv.zzf(paramObject, paramLong)).doubleValue();
  }
  
  private static float zzo(Object paramObject, long paramLong)
  {
    return ((Float)zzmv.zzf(paramObject, paramLong)).floatValue();
  }
  
  private final int zzp(Object paramObject)
  {
    Object localObject1 = zzb;
    int n = 0;
    int m = 0;
    int i1 = 0;
    int i2;
    for (int i = 1048575; n < this.zzc.length; i = i2)
    {
      int i5 = zzB(n);
      Object localObject2 = this.zzc;
      int i4 = localObject2[n];
      int i6 = zzA(i5);
      int j;
      int i3;
      int k;
      if (i6 <= 17)
      {
        j = localObject2[(n + 2)];
        i3 = j & 0xFFFFF;
        k = 1 << (j >>> 20);
        i2 = i;
        j = k;
        if (i3 != i)
        {
          i1 = ((Unsafe)localObject1).getInt(paramObject, i3);
          i2 = i3;
          j = k;
        }
      }
      else
      {
        j = 0;
        i2 = i;
      }
      long l = i5 & 0xFFFFF;
      switch (i6)
      {
      default: 
        i = m;
        break;
      case 68: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzu(i4, (zzlj)((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
        }
        break;
      case 67: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          l = zzC(paramObject, l);
          i = m + (zzjj.zzA(i4 << 3) + zzjj.zzB(l >> 63 ^ l + l));
        }
        break;
      case 66: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzr(paramObject, l);
          j = zzjj.zzA(i4 << 3);
          i = zzjj.zzA(i >> 31 ^ i + i);
        }
        break;
      case 65: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzA(i4 << 3);
        }
        break;
      case 64: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzA(i4 << 3);
        }
        break;
      case 63: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzr(paramObject, l);
          j = zzjj.zzA(i4 << 3);
          i = zzjj.zzv(i);
        }
        break;
      case 62: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzr(paramObject, l);
          j = zzjj.zzA(i4 << 3);
          i = zzjj.zzA(i);
        }
        break;
      case 61: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          localObject2 = (zzjb)((Unsafe)localObject1).getObject(paramObject, l);
          k = zzjj.zzA(i4 << 3);
          j = ((zzjb)localObject2).zzd();
        }
      case 60: 
      case 59: 
        for (i = zzjj.zzA(j);; i = zzjj.zzA(j))
        {
          i = k + (i + j);
          break label1802;
          i = m;
          if (!zzR(paramObject, i4, n)) {
            break label2004;
          }
          i = zzlw.zzo(i4, ((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
          break label1999;
          i = m;
          if (!zzR(paramObject, i4, n)) {
            break label2004;
          }
          localObject2 = ((Unsafe)localObject1).getObject(paramObject, l);
          if (!(localObject2 instanceof zzjb)) {
            break;
          }
          localObject2 = (zzjb)localObject2;
          k = zzjj.zzA(i4 << 3);
          j = ((zzjb)localObject2).zzd();
        }
        localObject2 = (String)localObject2;
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzy((String)localObject2);
        break;
      case 58: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzA(i4 << 3) + 1;
        }
        break;
      case 57: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzA(i4 << 3);
        }
        break;
      case 56: 
        i = m;
        if (zzR(paramObject, i4, n)) {
          i = zzjj.zzA(i4 << 3);
        }
        break;
      case 55: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzr(paramObject, l);
          j = zzjj.zzA(i4 << 3);
          i = zzjj.zzv(i);
        }
        break;
      case 54: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          l = zzC(paramObject, l);
          i = zzjj.zzA(i4 << 3);
          j = zzjj.zzB(l);
        }
        break;
      case 53: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          l = zzC(paramObject, l);
          i = zzjj.zzA(i4 << 3);
          j = zzjj.zzB(l);
          i = m + (i + j);
        }
        break;
      case 52: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzjj.zzA(i4 << 3);
          i += 4;
        }
        break;
      case 51: 
        i = m;
        if (zzR(paramObject, i4, n))
        {
          i = zzjj.zzA(i4 << 3);
          i += 8;
        }
        break;
      case 50: 
        zzle.zza(i4, ((Unsafe)localObject1).getObject(paramObject, l), zzF(n));
        i = m;
        break;
      case 49: 
        i = zzlw.zzj(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
        break;
      case 48: 
        j = zzlw.zzt((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 47: 
        j = zzlw.zzr((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 46: 
        j = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 45: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 44: 
        j = zzlw.zze((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 43: 
        j = zzlw.zzw((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 42: 
        j = zzlw.zzb((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 41: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 40: 
        j = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 39: 
        j = zzlw.zzl((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 38: 
        j = zzlw.zzy((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 37: 
        j = zzlw.zzn((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 36: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (j > 0)
        {
          i3 = zzjj.zzz(i4);
          k = zzjj.zzA(j);
          i = j;
          j = i3;
        }
        break;
      case 35: 
        i3 = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m;
        if (i3 > 0)
        {
          j = zzjj.zzz(i4);
          k = zzjj.zzA(i3);
          i = i3;
          j += k;
          i = j + i;
          i = m + i;
        }
        break;
      case 34: 
        i = zzlw.zzs(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 33: 
        i = zzlw.zzq(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 32: 
        i = zzlw.zzh(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 31: 
        i = zzlw.zzf(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 30: 
        i = zzlw.zzd(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 29: 
        i = zzlw.zzv(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 28: 
        i = zzlw.zzc(i4, (List)((Unsafe)localObject1).getObject(paramObject, l));
        break;
      case 27: 
        i = zzlw.zzp(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
        break;
      case 26: 
        i = zzlw.zzu(i4, (List)((Unsafe)localObject1).getObject(paramObject, l));
        i = m + i;
        break;
      case 25: 
        i = zzlw.zza(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 24: 
        i = zzlw.zzf(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 23: 
        i = zzlw.zzh(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 22: 
        i = zzlw.zzk(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 21: 
        i = zzlw.zzx(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 20: 
        i = zzlw.zzm(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 19: 
        i = zzlw.zzf(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
        break;
      case 18: 
        label1802:
        label1999:
        label2004:
        i = zzlw.zzh(i4, (List)((Unsafe)localObject1).getObject(paramObject, l), false);
      }
      for (;;)
      {
        i = m + i;
        break;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzu(i4, (zzlj)((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
        continue;
        i = m;
        if ((j & i1) == 0) {
          break;
        }
        l = ((Unsafe)localObject1).getLong(paramObject, l);
        i = m + (zzjj.zzA(i4 << 3) + zzjj.zzB(l >> 63 ^ l + l));
        break;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = ((Unsafe)localObject1).getInt(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzA(i >> 31 ^ i + i);
        break label2686;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        break label2821;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        break label2797;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = ((Unsafe)localObject1).getInt(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzv(i);
        break label2686;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = ((Unsafe)localObject1).getInt(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzA(i);
        break label2686;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        localObject2 = (zzjb)((Unsafe)localObject1).getObject(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        k = ((zzjb)localObject2).zzd();
        for (i = zzjj.zzA(k);; i = zzjj.zzA(k))
        {
          i = j + (i + k);
          break label2690;
          i = m;
          if ((i1 & j) == 0) {
            break label2827;
          }
          i = zzlw.zzo(i4, ((Unsafe)localObject1).getObject(paramObject, l), zzE(n));
          break;
          i = m;
          if ((i1 & j) == 0) {
            break label2827;
          }
          localObject2 = ((Unsafe)localObject1).getObject(paramObject, l);
          if (!(localObject2 instanceof zzjb)) {
            break label2565;
          }
          localObject2 = (zzjb)localObject2;
          j = zzjj.zzA(i4 << 3);
          k = ((zzjb)localObject2).zzd();
        }
        label2565:
        localObject2 = (String)localObject2;
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzy((String)localObject2);
        break label2686;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3) + 1;
        continue;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        break label2797;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        break label2821;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = ((Unsafe)localObject1).getInt(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzv(i);
        label2686:
        i = j + i;
        label2690:
        i = m + i;
        break;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        l = ((Unsafe)localObject1).getLong(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzB(l);
        break label2769;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        l = ((Unsafe)localObject1).getLong(paramObject, l);
        j = zzjj.zzA(i4 << 3);
        i = zzjj.zzB(l);
        label2769:
        i = m + (j + i);
        break;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        label2797:
        i += 4;
        continue;
        i = m;
        if ((i1 & j) == 0) {
          break;
        }
        i = zzjj.zzA(i4 << 3);
        label2821:
        i += 8;
      }
      label2827:
      n += 3;
      m = i;
    }
    localObject1 = this.zzn;
    i = ((zzml)localObject1).zza(((zzml)localObject1).zzc(paramObject));
    if (!this.zzh) {
      return m + i;
    }
    this.zzo.zza(paramObject);
    throw null;
  }
  
  private final int zzq(Object paramObject)
  {
    Object localObject1 = zzb;
    int m = 0;
    int i;
    for (int n = 0; m < this.zzc.length; n = i)
    {
      int j = zzB(m);
      i = zzA(j);
      int k = this.zzc[m];
      long l = j & 0xFFFFF;
      if ((i >= zzju.zzJ.zza()) && (i <= zzju.zzW.zza())) {
        j = this.zzc[(m + 2)];
      }
      Object localObject2;
      int i1;
      switch (i)
      {
      default: 
        i = n;
        break;
      case 68: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzu(k, (zzlj)zzmv.zzf(paramObject, l), zzE(m));
        break;
      case 67: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        l = zzC(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l >> 63 ^ l + l);
        break;
      case 66: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzr(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzA(i >> 31 ^ i + i);
        break;
      case 65: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 64: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 63: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzr(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzv(i);
        break;
      case 62: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzr(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzA(i);
        break;
      case 61: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        localObject2 = (zzjb)zzmv.zzf(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = ((zzjb)localObject2).zzd();
        k = zzjj.zzA(i);
        break;
      case 60: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzlw.zzo(k, zzmv.zzf(paramObject, l), zzE(m));
        break;
      case 59: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        localObject2 = zzmv.zzf(paramObject, l);
        if ((localObject2 instanceof zzjb))
        {
          localObject2 = (zzjb)localObject2;
          j = zzjj.zzA(k << 3);
          i = ((zzjb)localObject2).zzd();
          k = zzjj.zzA(i);
        }
        else
        {
          localObject2 = (String)localObject2;
          j = zzjj.zzA(k << 3);
          i = zzjj.zzy((String)localObject2);
        }
        break;
      case 58: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 57: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 56: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 55: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzr(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzv(i);
        break;
      case 54: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        l = zzC(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l);
        break;
      case 53: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        l = zzC(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l);
        break;
      case 52: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 51: 
        i = n;
        if (!zzR(paramObject, k, m)) {
          break label2718;
        }
        i = zzjj.zzA(k << 3);
        break;
      case 50: 
        zzle.zza(k, zzmv.zzf(paramObject, l), zzF(m));
        i = n;
        break;
      case 49: 
        i = zzlw.zzj(k, (List)zzmv.zzf(paramObject, l), zzE(m));
        break;
      case 48: 
        j = zzlw.zzt((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 47: 
        j = zzlw.zzr((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 46: 
        j = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 45: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 44: 
        j = zzlw.zze((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 43: 
        j = zzlw.zzw((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 42: 
        j = zzlw.zzb((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 41: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 40: 
        j = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 39: 
        j = zzlw.zzl((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 38: 
        j = zzlw.zzy((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 37: 
        j = zzlw.zzn((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 36: 
        j = zzlw.zzg((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (j <= 0) {
          break label2718;
        }
        i1 = zzjj.zzz(k);
        k = zzjj.zzA(j);
        i = j;
        j = i1;
        break;
      case 35: 
        i1 = zzlw.zzi((List)((Unsafe)localObject1).getObject(paramObject, l));
        i = n;
        if (i1 <= 0) {
          break label2718;
        }
        j = zzjj.zzz(k);
        k = zzjj.zzA(i1);
        i = i1;
        j += k;
        break;
      case 34: 
        i = zzlw.zzs(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 33: 
        i = zzlw.zzq(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 32: 
        i = zzlw.zzh(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 31: 
        i = zzlw.zzf(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 30: 
        i = zzlw.zzd(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 29: 
        i = zzlw.zzv(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 28: 
        i = zzlw.zzc(k, (List)zzmv.zzf(paramObject, l));
        break;
      case 27: 
        i = zzlw.zzp(k, (List)zzmv.zzf(paramObject, l), zzE(m));
        break;
      case 26: 
        i = zzlw.zzu(k, (List)zzmv.zzf(paramObject, l));
        break;
      case 25: 
        i = zzlw.zza(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 24: 
        i = zzlw.zzf(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 23: 
        i = zzlw.zzh(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 22: 
        i = zzlw.zzk(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 21: 
        i = zzlw.zzx(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 20: 
        i = zzlw.zzm(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 19: 
        i = zzlw.zzf(k, (List)zzmv.zzf(paramObject, l), false);
        break;
      case 18: 
        i = zzlw.zzh(k, (List)zzmv.zzf(paramObject, l), false);
      }
      for (;;)
      {
        i = n + i;
        break;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzu(k, (zzlj)zzmv.zzf(paramObject, l), zzE(m));
        continue;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        l = zzmv.zzd(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l >> 63 ^ l + l);
        break label2569;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzmv.zzc(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzA(i >> 31 ^ i + i);
        break label2569;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        break label2712;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        break label2685;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzmv.zzc(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzv(i);
        break label2569;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzmv.zzc(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzA(i);
        break label2569;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        localObject2 = (zzjb)zzmv.zzf(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = ((zzjb)localObject2).zzd();
        for (k = zzjj.zzA(i);; k = zzjj.zzA(i))
        {
          i = j + (k + i);
          break label2573;
          i = n;
          if (!zzO(paramObject, m)) {
            break label2718;
          }
          i = zzlw.zzo(k, zzmv.zzf(paramObject, l), zzE(m));
          break;
          i = n;
          if (!zzO(paramObject, m)) {
            break label2718;
          }
          localObject2 = zzmv.zzf(paramObject, l);
          if (!(localObject2 instanceof zzjb)) {
            break label2437;
          }
          localObject2 = (zzjb)localObject2;
          j = zzjj.zzA(k << 3);
          i = ((zzjb)localObject2).zzd();
        }
        label2437:
        localObject2 = (String)localObject2;
        j = zzjj.zzA(k << 3);
        i = zzjj.zzy((String)localObject2);
        break label2569;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        i++;
        continue;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        break label2685;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        break label2712;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzmv.zzc(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzv(i);
        label2569:
        i = j + i;
        label2573:
        i = n + i;
        break;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        l = zzmv.zzd(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l);
        break label2654;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        l = zzmv.zzd(paramObject, l);
        j = zzjj.zzA(k << 3);
        i = zzjj.zzB(l);
        label2654:
        i = n + (j + i);
        break;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        label2685:
        i += 4;
        continue;
        i = n;
        if (!zzO(paramObject, m)) {
          break;
        }
        i = zzjj.zzA(k << 3);
        label2712:
        i += 8;
      }
      label2718:
      m += 3;
    }
    localObject1 = this.zzn;
    return n + ((zzml)localObject1).zza(((zzml)localObject1).zzc(paramObject));
  }
  
  private static int zzr(Object paramObject, long paramLong)
  {
    return ((Integer)zzmv.zzf(paramObject, paramLong)).intValue();
  }
  
  private final int zzs(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong, zzio paramzzio)
    throws IOException
  {
    Unsafe localUnsafe = zzb;
    Object localObject = zzF(paramInt3);
    paramArrayOfByte = localUnsafe.getObject(paramObject, paramLong);
    if (!((zzld)paramArrayOfByte).zze())
    {
      paramzzio = zzld.zza().zzb();
      zzle.zzb(paramzzio, paramArrayOfByte);
      localUnsafe.putObject(paramObject, paramLong, paramzzio);
    }
    paramObject = (zzlc)localObject;
    throw null;
  }
  
  private final int zzt(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, zzio paramzzio)
    throws IOException
  {
    Unsafe localUnsafe = zzb;
    long l = this.zzc[(paramInt8 + 2)] & 0xFFFFF;
    switch (paramInt7)
    {
    default: 
      break;
    case 68: 
      if (paramInt5 == 3)
      {
        paramInt1 = zzip.zzc(zzE(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramInt3 & 0xFFFFFFF8 | 0x4, paramzzio);
        if (localUnsafe.getInt(paramObject, l) == paramInt4) {
          paramArrayOfByte = localUnsafe.getObject(paramObject, paramLong);
        } else {
          paramArrayOfByte = null;
        }
        if (paramArrayOfByte == null) {
          localUnsafe.putObject(paramObject, paramLong, paramzzio.zzc);
        } else {
          localUnsafe.putObject(paramObject, paramLong, zzkk.zzg(paramArrayOfByte, paramzzio.zzc));
        }
        localUnsafe.putInt(paramObject, l, paramInt4);
      }
      break;
    case 67: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
        localUnsafe.putObject(paramObject, paramLong, Long.valueOf(zzjf.zzc(paramzzio.zzb)));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 66: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        localUnsafe.putObject(paramObject, paramLong, Integer.valueOf(zzjf.zzb(paramzzio.zza)));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 63: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        paramInt2 = paramzzio.zza;
        paramArrayOfByte = zzD(paramInt8);
        if ((paramArrayOfByte != null) && (!paramArrayOfByte.zza(paramInt2)))
        {
          zzd(paramObject).zzh(paramInt3, Long.valueOf(paramInt2));
        }
        else
        {
          localUnsafe.putObject(paramObject, paramLong, Integer.valueOf(paramInt2));
          localUnsafe.putInt(paramObject, l, paramInt4);
        }
      }
      break;
    case 61: 
      if (paramInt5 == 2)
      {
        paramInt1 = zzip.zza(paramArrayOfByte, paramInt1, paramzzio);
        localUnsafe.putObject(paramObject, paramLong, paramzzio.zzc);
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 60: 
      if (paramInt5 == 2)
      {
        paramInt1 = zzip.zzd(zzE(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramzzio);
        if (localUnsafe.getInt(paramObject, l) == paramInt4) {
          paramArrayOfByte = localUnsafe.getObject(paramObject, paramLong);
        } else {
          paramArrayOfByte = null;
        }
        if (paramArrayOfByte == null) {
          localUnsafe.putObject(paramObject, paramLong, paramzzio.zzc);
        } else {
          localUnsafe.putObject(paramObject, paramLong, zzkk.zzg(paramArrayOfByte, paramzzio.zzc));
        }
        localUnsafe.putInt(paramObject, l, paramInt4);
      }
      break;
    case 59: 
      if (paramInt5 == 2)
      {
        paramInt1 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        paramInt2 = paramzzio.zza;
        if (paramInt2 == 0)
        {
          localUnsafe.putObject(paramObject, paramLong, "");
        }
        else
        {
          if (((paramInt6 & 0x20000000) != 0) && (!zzna.zzf(paramArrayOfByte, paramInt1, paramInt1 + paramInt2))) {
            throw zzkm.zzc();
          }
          localUnsafe.putObject(paramObject, paramLong, new String(paramArrayOfByte, paramInt1, paramInt2, zzkk.zzb));
          paramInt1 += paramInt2;
        }
        localUnsafe.putInt(paramObject, l, paramInt4);
      }
      break;
    case 58: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
        boolean bool;
        if (paramzzio.zzb != 0L) {
          bool = true;
        } else {
          bool = false;
        }
        localUnsafe.putObject(paramObject, paramLong, Boolean.valueOf(bool));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 57: 
    case 64: 
      if (paramInt5 == 5)
      {
        localUnsafe.putObject(paramObject, paramLong, Integer.valueOf(zzip.zzb(paramArrayOfByte, paramInt1)));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1 + 4;
      }
      break;
    case 56: 
    case 65: 
      if (paramInt5 == 1)
      {
        localUnsafe.putObject(paramObject, paramLong, Long.valueOf(zzip.zzn(paramArrayOfByte, paramInt1)));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1 + 8;
      }
      break;
    case 55: 
    case 62: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        localUnsafe.putObject(paramObject, paramLong, Integer.valueOf(paramzzio.zza));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 53: 
    case 54: 
      if (paramInt5 == 0)
      {
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
        localUnsafe.putObject(paramObject, paramLong, Long.valueOf(paramzzio.zzb));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1;
      }
      break;
    case 52: 
      if (paramInt5 == 5)
      {
        localUnsafe.putObject(paramObject, paramLong, Float.valueOf(Float.intBitsToFloat(zzip.zzb(paramArrayOfByte, paramInt1))));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1 + 4;
      }
      break;
    case 51: 
      if (paramInt5 == 1)
      {
        localUnsafe.putObject(paramObject, paramLong, Double.valueOf(Double.longBitsToDouble(zzip.zzn(paramArrayOfByte, paramInt1))));
        localUnsafe.putInt(paramObject, l, paramInt4);
        return paramInt1 + 8;
      }
      break;
    }
    return paramInt1;
  }
  
  private final int zzu(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzio paramzzio)
    throws IOException
  {
    zzlm localzzlm = this;
    Object localObject1 = paramObject;
    byte[] arrayOfByte = paramArrayOfByte;
    int i1 = paramInt2;
    zzio localzzio = paramzzio;
    Unsafe localUnsafe = zzb;
    int m = paramInt1;
    int n = -1;
    int i = 0;
    paramInt1 = 0;
    int j = 1048575;
    while (m < i1)
    {
      int k = m + 1;
      int i2 = arrayOfByte[m];
      if (i2 < 0)
      {
        m = zzip.zzk(i2, arrayOfByte, k, localzzio);
        i2 = localzzio.zza;
      }
      else
      {
        m = k;
      }
      k = i2 >>> 3;
      int i4 = i2 & 0x7;
      if (k > n) {
        i = localzzlm.zzx(k, i / 3);
      } else {
        i = localzzlm.zzw(k);
      }
      if (i == -1)
      {
        i = 0;
      }
      else
      {
        Object localObject2 = localzzlm.zzc;
        int i5 = localObject2[(i + 1)];
        int i6 = zzA(i5);
        long l = i5 & 0xFFFFF;
        if (i6 <= 17)
        {
          n = localObject2[(i + 2)];
          int i3 = 1 << (n >>> 20);
          n &= 0xFFFFF;
          if (n != j)
          {
            if (j != 1048575) {
              localUnsafe.putInt(localObject1, j, paramInt1);
            }
            if (n != 1048575) {
              paramInt1 = localUnsafe.getInt(localObject1, n);
            }
            localObject2 = localUnsafe;
            j = n;
            n = paramInt1;
          }
          else
          {
            localObject2 = localUnsafe;
            n = paramInt1;
          }
          switch (i6)
          {
          default: 
            break;
          case 16: 
            if (i4 == 0)
            {
              paramInt1 = zzip.zzm(arrayOfByte, m, localzzio);
              localUnsafe.putLong(paramObject, l, zzjf.zzc(localzzio.zzb));
              n |= i3;
              localObject2 = localUnsafe;
              m = i;
              break label912;
            }
            break;
          case 15: 
            if (i4 == 0)
            {
              paramInt1 = zzip.zzj(arrayOfByte, m, localzzio);
              localUnsafe.putInt(localObject1, l, zzjf.zzb(localzzio.zza));
            }
            break;
          case 12: 
            if (i4 == 0)
            {
              paramInt1 = zzip.zzj(arrayOfByte, m, localzzio);
              localUnsafe.putInt(localObject1, l, localzzio.zza);
            }
            break;
          case 10: 
            if (i4 == 2)
            {
              paramInt1 = zzip.zza(arrayOfByte, m, localzzio);
              localUnsafe.putObject(localObject1, l, localzzio.zzc);
            }
            break;
          case 9: 
            if (i4 == 2)
            {
              paramInt1 = zzip.zzd(localzzlm.zzE(i), arrayOfByte, m, i1, localzzio);
              localObject2 = localUnsafe.getObject(localObject1, l);
              if (localObject2 == null) {
                localUnsafe.putObject(localObject1, l, localzzio.zzc);
              } else {
                localUnsafe.putObject(localObject1, l, zzkk.zzg(localObject2, localzzio.zzc));
              }
            }
            break;
          case 8: 
            if (i4 == 2)
            {
              if ((i5 & 0x20000000) == 0) {
                paramInt1 = zzip.zzg(arrayOfByte, m, localzzio);
              } else {
                paramInt1 = zzip.zzh(arrayOfByte, m, localzzio);
              }
              localUnsafe.putObject(localObject1, l, localzzio.zzc);
            }
            break;
          case 7: 
            if (i4 == 0)
            {
              paramInt1 = zzip.zzm(arrayOfByte, m, localzzio);
              boolean bool;
              if (localzzio.zzb != 0L) {
                bool = true;
              } else {
                bool = false;
              }
              zzmv.zzm(localObject1, l, bool);
            }
            break;
          case 6: 
          case 13: 
            if (i4 == 5)
            {
              localUnsafe.putInt(localObject1, l, zzip.zzb(arrayOfByte, m));
              paramInt1 = m + 4;
            }
            break;
          case 5: 
          case 14: 
            if (i4 == 1)
            {
              localUnsafe.putLong(paramObject, l, zzip.zzn(arrayOfByte, m));
              paramInt1 = m + 8;
              break label897;
            }
            break;
          case 4: 
          case 11: 
            if (i4 != 0) {
              break;
            }
            paramInt1 = zzip.zzj(arrayOfByte, m, localzzio);
            localUnsafe.putInt(localObject1, l, localzzio.zza);
            break;
          case 2: 
          case 3: 
            if (i4 != 0) {
              break;
            }
            paramInt1 = zzip.zzm(arrayOfByte, m, localzzio);
            localUnsafe.putLong(paramObject, l, localzzio.zzb);
            n |= i3;
            localObject2 = localUnsafe;
            m = i;
            break;
          case 1: 
            if (i4 != 5) {
              break;
            }
            zzmv.zzp(localObject1, l, Float.intBitsToFloat(zzip.zzb(arrayOfByte, m)));
            paramInt1 = m + 4;
            break;
          }
          if (i4 == 1)
          {
            zzmv.zzo(localObject1, l, Double.longBitsToDouble(zzip.zzn(arrayOfByte, m)));
            paramInt1 = m + 8;
            label897:
            n |= i3;
            localObject2 = localUnsafe;
            m = i;
            label912:
            m = k;
            m = paramInt1;
            paramInt1 = n;
            break label1261;
          }
          paramInt1 = n;
        }
        else
        {
          if (i6 == 27)
          {
            if (i4 == 2)
            {
              zzkj localzzkj = (zzkj)localUnsafe.getObject(localObject1, l);
              localObject2 = localzzkj;
              if (!localzzkj.zzc())
              {
                n = localzzkj.size();
                if (n == 0) {
                  n = 10;
                } else {
                  n += n;
                }
                localObject2 = localzzkj.zzd(n);
                localUnsafe.putObject(localObject1, l, localObject2);
              }
              m = zzip.zze(localzzlm.zzE(i), i2, paramArrayOfByte, m, paramInt2, (zzkj)localObject2, paramzzio);
              n = k;
              break label1261;
            }
          }
          else if (i6 <= 49)
          {
            i1 = zzv(paramObject, paramArrayOfByte, m, paramInt2, i2, k, i4, i, i5, i6, l, paramzzio);
            n = i1;
            if (i1 != m) {
              m = i1;
            }
          }
          for (;;)
          {
            n = k;
            break label1240;
            label1172:
            do
            {
              do
              {
                m = n;
                break;
                if (i6 != 50) {
                  break label1172;
                }
                if (i4 != 2) {
                  break;
                }
                i1 = zzs(paramObject, paramArrayOfByte, m, paramInt2, i, l, paramzzio);
                n = i1;
              } while (i1 == m);
              m = i1;
              break;
              break label1218;
              i1 = zzt(paramObject, paramArrayOfByte, m, paramInt2, i2, k, i4, i5, i6, l, i, paramzzio);
              n = i1;
            } while (i1 == m);
            m = i1;
          }
        }
      }
      label1218:
      m = zzip.zzi(i2, paramArrayOfByte, m, paramInt2, zzd(paramObject), paramzzio);
      n = k;
      label1240:
      n = k;
      localzzlm = this;
      localObject1 = paramObject;
      i1 = paramInt2;
      arrayOfByte = paramArrayOfByte;
      localzzio = paramzzio;
      label1261:
      n = k;
    }
    if (j != 1048575) {
      localUnsafe.putInt(paramObject, j, paramInt1);
    }
    if (m == paramInt2) {
      return m;
    }
    throw zzkm.zze();
  }
  
  private final int zzv(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, zzio paramzzio)
    throws IOException
  {
    int i = paramInt1;
    Unsafe localUnsafe = zzb;
    zzkj localzzkj2 = (zzkj)localUnsafe.getObject(paramObject, paramLong2);
    zzkj localzzkj1 = localzzkj2;
    if (!localzzkj2.zzc())
    {
      int j = localzzkj2.size();
      if (j == 0) {
        j = 10;
      } else {
        j += j;
      }
      localzzkj1 = localzzkj2.zzd(j);
      localUnsafe.putObject(paramObject, paramLong2, localzzkj1);
    }
    switch (paramInt7)
    {
    default: 
      paramInt7 = i;
      if (paramInt5 != 3) {
        break label2365;
      }
      paramObject = zzE(paramInt6);
      paramInt4 = paramInt3 & 0xFFFFFFF8 | 0x4;
      paramInt1 = zzip.zzc((zzlu)paramObject, paramArrayOfByte, paramInt1, paramInt2, paramInt4, paramzzio);
      localzzkj1.add(paramzzio.zzc);
      break;
    case 34: 
    case 48: 
      if (paramInt5 == 2)
      {
        paramObject = (zzky)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
          ((zzky)paramObject).zzg(zzjf.zzc(paramzzio.zzb));
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2365;
      }
      paramObject = (zzky)localzzkj1;
      paramInt1 = zzip.zzm(paramArrayOfByte, i, paramzzio);
      ((zzky)paramObject).zzg(zzjf.zzc(paramzzio.zzb));
      while (paramInt1 < paramInt2)
      {
        paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt4, paramzzio);
        ((zzky)paramObject).zzg(zzjf.zzc(paramzzio.zzb));
      }
      return paramInt1;
    case 33: 
    case 47: 
      if (paramInt5 == 2)
      {
        paramObject = (zzkd)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
          ((zzkd)paramObject).zzh(zzjf.zzb(paramzzio.zza));
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2365;
      }
      paramObject = (zzkd)localzzkj1;
      paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
      ((zzkd)paramObject).zzh(zzjf.zzb(paramzzio.zza));
      while (paramInt1 < paramInt2)
      {
        paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        paramInt1 = zzip.zzj(paramArrayOfByte, paramInt4, paramzzio);
        ((zzkd)paramObject).zzh(zzjf.zzb(paramzzio.zza));
      }
      return paramInt1;
    case 30: 
    case 44: 
      if (paramInt5 == 2)
      {
        paramInt1 = zzip.zzf(paramArrayOfByte, i, localzzkj1, paramzzio);
      }
      else
      {
        paramInt7 = i;
        if (paramInt5 != 0) {
          break label2365;
        }
        paramInt1 = zzip.zzl(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkj1, paramzzio);
      }
      paramzzio = (zzkc)paramObject;
      paramArrayOfByte = paramzzio.zzc;
      paramObject = paramArrayOfByte;
      if (paramArrayOfByte == zzmm.zzc()) {
        paramObject = null;
      }
      paramObject = zzlw.zzC(paramInt4, localzzkj1, zzD(paramInt6), paramObject, this.zzn);
      if (paramObject != null)
      {
        paramzzio.zzc = ((zzmm)paramObject);
        return paramInt1;
      }
    case 28: 
      paramInt7 = i;
      if (paramInt5 != 2) {
        break label2365;
      }
      paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
      paramInt4 = paramzzio.zza;
      if (paramInt4 >= 0)
      {
        if (paramInt4 <= paramArrayOfByte.length - paramInt1)
        {
          if (paramInt4 == 0) {
            localzzkj1.add(zzjb.zzb);
          } else {
            localzzkj1.add(zzjb.zzl(paramArrayOfByte, paramInt1, paramInt4));
          }
          for (;;)
          {
            paramInt1 += paramInt4;
            for (;;)
            {
              if (paramInt1 >= paramInt2) {
                break label888;
              }
              paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
              if (paramInt3 != paramzzio.zza) {
                break label888;
              }
              paramInt1 = zzip.zzj(paramArrayOfByte, paramInt4, paramzzio);
              paramInt4 = paramzzio.zza;
              if (paramInt4 < 0) {
                break label884;
              }
              if (paramInt4 > paramArrayOfByte.length - paramInt1) {
                break label880;
              }
              if (paramInt4 != 0) {
                break;
              }
              localzzkj1.add(zzjb.zzb);
            }
            localzzkj1.add(zzjb.zzl(paramArrayOfByte, paramInt1, paramInt4));
          }
          throw zzkm.zzf();
          throw zzkm.zzd();
          return paramInt1;
        }
        throw zzkm.zzf();
      }
      throw zzkm.zzd();
    case 27: 
      if (paramInt5 != 2)
      {
        paramInt7 = i;
        break label2365;
      }
      return zzip.zze(zzE(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkj1, paramzzio);
    case 26: 
      paramInt7 = i;
      if (paramInt5 != 2) {
        break label2365;
      }
      if ((paramLong1 & 0x20000000) == 0L)
      {
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt4 = paramzzio.zza;
        if (paramInt4 >= 0)
        {
          if (paramInt4 == 0) {
            localzzkj1.add("");
          } else {
            localzzkj1.add(new String(paramArrayOfByte, paramInt1, paramInt4, zzkk.zzb));
          }
          for (;;)
          {
            paramInt1 += paramInt4;
            for (;;)
            {
              paramInt7 = paramInt1;
              if (paramInt1 >= paramInt2) {
                break label2365;
              }
              paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
              paramInt7 = paramInt1;
              if (paramInt3 != paramzzio.zza) {
                break label2365;
              }
              paramInt1 = zzip.zzj(paramArrayOfByte, paramInt4, paramzzio);
              paramInt4 = paramzzio.zza;
              if (paramInt4 < 0) {
                break label1115;
              }
              if (paramInt4 != 0) {
                break;
              }
              localzzkj1.add("");
            }
            localzzkj1.add(new String(paramArrayOfByte, paramInt1, paramInt4, zzkk.zzb));
          }
          throw zzkm.zzd();
        }
        throw zzkm.zzd();
      }
      paramInt4 = zzip.zzj(paramArrayOfByte, i, paramzzio);
      paramInt5 = paramzzio.zza;
      if (paramInt5 >= 0)
      {
        if (paramInt5 == 0)
        {
          localzzkj1.add("");
          paramInt1 = paramInt4;
        }
        else
        {
          paramInt1 = paramInt4 + paramInt5;
          if (!zzna.zzf(paramArrayOfByte, paramInt4, paramInt1)) {
            break label1329;
          }
          localzzkj1.add(new String(paramArrayOfByte, paramInt4, paramInt5, zzkk.zzb));
        }
        for (;;)
        {
          paramInt7 = paramInt1;
          if (paramInt1 >= paramInt2) {
            break label2365;
          }
          paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
          paramInt7 = paramInt1;
          if (paramInt3 != paramzzio.zza) {
            break label2365;
          }
          paramInt1 = zzip.zzj(paramArrayOfByte, paramInt4, paramzzio);
          paramInt5 = paramzzio.zza;
          if (paramInt5 < 0) {
            break label1325;
          }
          if (paramInt5 == 0)
          {
            localzzkj1.add("");
          }
          else
          {
            paramInt4 = paramInt1 + paramInt5;
            if (!zzna.zzf(paramArrayOfByte, paramInt1, paramInt4)) {
              break;
            }
            localzzkj1.add(new String(paramArrayOfByte, paramInt1, paramInt5, zzkk.zzb));
            paramInt1 = paramInt4;
          }
        }
        throw zzkm.zzc();
        throw zzkm.zzd();
        throw zzkm.zzc();
      }
      throw zzkm.zzd();
    case 25: 
    case 42: 
      boolean bool;
      if (paramInt5 == 2)
      {
        paramObject = (zziq)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
          if (paramzzio.zzb != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          ((zziq)paramObject).zze(bool);
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2365;
      }
      paramObject = (zziq)localzzkj1;
      paramInt1 = zzip.zzm(paramArrayOfByte, i, paramzzio);
      if (paramzzio.zzb != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      ((zziq)paramObject).zze(bool);
      while (paramInt1 < paramInt2)
      {
        paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt4, paramzzio);
        if (paramzzio.zzb != 0L) {
          bool = true;
        } else {
          bool = false;
        }
        ((zziq)paramObject).zze(bool);
      }
      return paramInt1;
    case 24: 
    case 31: 
    case 41: 
    case 45: 
      if (paramInt5 == 2)
      {
        paramObject = (zzkd)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          ((zzkd)paramObject).zzh(zzip.zzb(paramArrayOfByte, paramInt1));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 5) {
        break label2365;
      }
      paramObject = (zzkd)localzzkj1;
      ((zzkd)paramObject).zzh(zzip.zzb(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt1 = i + 4;
        if (paramInt1 >= paramInt2) {
          break;
        }
        i = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        ((zzkd)paramObject).zzh(zzip.zzb(paramArrayOfByte, i));
      }
      return paramInt1;
    case 23: 
    case 32: 
    case 40: 
    case 46: 
      if (paramInt5 == 2)
      {
        paramObject = (zzky)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          ((zzky)paramObject).zzg(zzip.zzn(paramArrayOfByte, paramInt1));
          paramInt1 += 8;
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 1) {
        break label2365;
      }
      paramObject = (zzky)localzzkj1;
      ((zzky)paramObject).zzg(zzip.zzn(paramArrayOfByte, paramInt1));
      for (;;)
      {
        paramInt1 = i + 8;
        if (paramInt1 >= paramInt2) {
          break;
        }
        i = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        ((zzky)paramObject).zzg(zzip.zzn(paramArrayOfByte, i));
      }
      return paramInt1;
    case 22: 
    case 29: 
    case 39: 
    case 43: 
      if (paramInt5 == 2)
      {
        paramInt1 = zzip.zzf(paramArrayOfByte, i, localzzkj1, paramzzio);
        break;
      }
      if (paramInt5 != 0)
      {
        paramInt7 = i;
        break label2365;
      }
      return zzip.zzl(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localzzkj1, paramzzio);
    case 20: 
    case 21: 
    case 37: 
    case 38: 
      if (paramInt5 == 2)
      {
        paramObject = (zzky)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt1 = zzip.zzm(paramArrayOfByte, paramInt1, paramzzio);
          ((zzky)paramObject).zzg(paramzzio.zzb);
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 0) {
        break label2365;
      }
      paramObject = (zzky)localzzkj1;
      paramInt1 = zzip.zzm(paramArrayOfByte, i, paramzzio);
      ((zzky)paramObject).zzg(paramzzio.zzb);
      while (paramInt1 < paramInt2)
      {
        paramInt4 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        paramInt1 = zzip.zzm(paramArrayOfByte, paramInt4, paramzzio);
        ((zzky)paramObject).zzg(paramzzio.zzb);
      }
      return paramInt1;
    case 19: 
    case 36: 
      label880:
      label884:
      label888:
      label1115:
      label1325:
      label1329:
      if (paramInt5 == 2)
      {
        paramObject = (zzjv)localzzkj1;
        paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
        paramInt2 = paramzzio.zza + paramInt1;
        while (paramInt1 < paramInt2)
        {
          ((zzjv)paramObject).zze(Float.intBitsToFloat(zzip.zzb(paramArrayOfByte, paramInt1)));
          paramInt1 += 4;
        }
        if (paramInt1 == paramInt2) {
          break;
        }
        throw zzkm.zzf();
      }
      paramInt7 = i;
      if (paramInt5 != 5) {
        break label2365;
      }
      paramObject = (zzjv)localzzkj1;
      ((zzjv)paramObject).zze(Float.intBitsToFloat(zzip.zzb(paramArrayOfByte, paramInt1)));
      for (;;)
      {
        paramInt1 = i + 4;
        if (paramInt1 >= paramInt2) {
          break;
        }
        i = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
        if (paramInt3 != paramzzio.zza) {
          break;
        }
        ((zzjv)paramObject).zze(Float.intBitsToFloat(zzip.zzb(paramArrayOfByte, i)));
      }
      return paramInt1;
    }
    if (paramInt5 == 2)
    {
      paramObject = (zzjl)localzzkj1;
      paramInt1 = zzip.zzj(paramArrayOfByte, i, paramzzio);
      paramInt2 = paramzzio.zza + paramInt1;
      while (paramInt1 < paramInt2)
      {
        ((zzjl)paramObject).zze(Double.longBitsToDouble(zzip.zzn(paramArrayOfByte, paramInt1)));
        paramInt1 += 8;
      }
      if (paramInt1 != paramInt2) {
        throw zzkm.zzf();
      }
    }
    else
    {
      paramInt7 = i;
      if (paramInt5 == 1)
      {
        paramObject = (zzjl)localzzkj1;
        ((zzjl)paramObject).zze(Double.longBitsToDouble(zzip.zzn(paramArrayOfByte, paramInt1)));
        for (;;)
        {
          paramInt1 = i + 8;
          if (paramInt1 >= paramInt2) {
            break;
          }
          i = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
          if (paramInt3 != paramzzio.zza) {
            break;
          }
          ((zzjl)paramObject).zze(Double.longBitsToDouble(zzip.zzn(paramArrayOfByte, i)));
        }
        return paramInt1;
        while (paramInt1 < paramInt2)
        {
          paramInt5 = zzip.zzj(paramArrayOfByte, paramInt1, paramzzio);
          if (paramInt3 != paramzzio.zza) {
            break;
          }
          paramInt1 = zzip.zzc((zzlu)paramObject, paramArrayOfByte, paramInt5, paramInt2, paramInt4, paramzzio);
          localzzkj1.add(paramzzio.zzc);
        }
        return paramInt1;
      }
      label2365:
      paramInt1 = paramInt7;
    }
    return paramInt1;
  }
  
  private final int zzw(int paramInt)
  {
    if ((paramInt >= this.zze) && (paramInt <= this.zzf)) {
      return zzz(paramInt, 0);
    }
    return -1;
  }
  
  private final int zzx(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= this.zze) && (paramInt1 <= this.zzf)) {
      return zzz(paramInt1, paramInt2);
    }
    return -1;
  }
  
  private final int zzy(int paramInt)
  {
    return this.zzc[(paramInt + 2)];
  }
  
  private final int zzz(int paramInt1, int paramInt2)
  {
    int i = this.zzc.length / 3 - 1;
    while (paramInt2 <= i)
    {
      int j = i + paramInt2 >>> 1;
      int m = j * 3;
      int k = this.zzc[m];
      if (paramInt1 == k) {
        return m;
      }
      if (paramInt1 < k) {
        i = j - 1;
      } else {
        paramInt2 = j + 1;
      }
    }
    return -1;
  }
  
  public final int zza(Object paramObject)
  {
    int i;
    if (this.zzi) {
      i = zzq(paramObject);
    } else {
      i = zzp(paramObject);
    }
    return i;
  }
  
  public final int zzb(Object paramObject)
  {
    int m = this.zzc.length;
    int k = 0;
    for (int j = 0; k < m; j = i)
    {
      i = zzB(k);
      int n = this.zzc[k];
      long l = 0xFFFFF & i;
      int i1 = zzA(i);
      i = 37;
      Object localObject;
      switch (i1)
      {
      default: 
        i = j;
        break;
      case 68: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzmv.zzf(paramObject, l).hashCode();
        break;
      case 67: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(zzC(paramObject, l));
        break;
      case 66: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 65: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(zzC(paramObject, l));
        break;
      case 64: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 63: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 62: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 61: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzmv.zzf(paramObject, l).hashCode();
        break;
      case 60: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzmv.zzf(paramObject, l).hashCode();
        break;
      case 59: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = ((String)zzmv.zzf(paramObject, l)).hashCode();
        break;
      case 58: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zza(zzS(paramObject, l));
        break;
      case 57: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 56: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(zzC(paramObject, l));
        break;
      case 55: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzr(paramObject, l);
        break;
      case 54: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(zzC(paramObject, l));
        break;
      case 53: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(zzC(paramObject, l));
        break;
      case 52: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = Float.floatToIntBits(zzo(paramObject, l));
        break;
      case 51: 
        i = j;
        if (!zzR(paramObject, n, k)) {
          break label1277;
        }
        i = j * 53;
        j = zzkk.zzc(Double.doubleToLongBits(zzn(paramObject, l)));
        break;
      case 50: 
        i = j * 53;
        j = zzmv.zzf(paramObject, l).hashCode();
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
        j = zzmv.zzf(paramObject, l).hashCode();
        break;
      case 17: 
        localObject = zzmv.zzf(paramObject, l);
        if (localObject != null) {
          i = localObject.hashCode();
        }
        break;
      case 16: 
        i = j * 53;
        j = zzkk.zzc(zzmv.zzd(paramObject, l));
        break;
      case 15: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 14: 
        i = j * 53;
        j = zzkk.zzc(zzmv.zzd(paramObject, l));
        break;
      case 13: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 12: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 11: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 10: 
        i = j * 53;
        j = zzmv.zzf(paramObject, l).hashCode();
        break;
      case 9: 
        localObject = zzmv.zzf(paramObject, l);
        if (localObject != null) {
          i = localObject.hashCode();
        }
        i = j * 53 + i;
        break;
      case 8: 
        i = j * 53;
        j = ((String)zzmv.zzf(paramObject, l)).hashCode();
        break;
      case 7: 
        i = j * 53;
        j = zzkk.zza(zzmv.zzw(paramObject, l));
        break;
      case 6: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 5: 
        i = j * 53;
        j = zzkk.zzc(zzmv.zzd(paramObject, l));
        break;
      case 4: 
        i = j * 53;
        j = zzmv.zzc(paramObject, l);
        break;
      case 3: 
        i = j * 53;
        j = zzkk.zzc(zzmv.zzd(paramObject, l));
        break;
      case 2: 
        i = j * 53;
        j = zzkk.zzc(zzmv.zzd(paramObject, l));
        break;
      case 1: 
        i = j * 53;
        j = Float.floatToIntBits(zzmv.zzb(paramObject, l));
        break;
      }
      i = j * 53;
      j = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(paramObject, l)));
      i += j;
      label1277:
      k += 3;
    }
    int i = this.zzn.zzc(paramObject).hashCode();
    if (!this.zzh) {
      return j * 53 + i;
    }
    this.zzo.zza(paramObject);
    throw null;
  }
  
  final int zzc(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zzio paramzzio)
    throws IOException
  {
    Object localObject1 = paramObject;
    localObject1 = paramArrayOfByte;
    int i1 = paramInt3;
    Object localObject2 = paramzzio;
    localObject2 = zzb;
    int i = 0;
    int i2 = -1;
    int i3 = 0;
    int k = 0;
    int n = 1048575;
    Object localObject3;
    int m;
    for (;;)
    {
      localObject3 = paramObject;
      Object localObject4 = paramzzio;
      if (paramInt1 >= paramInt2) {
        break;
      }
      m = paramInt1 + 1;
      j = localObject1[paramInt1];
      if (j < 0)
      {
        m = zzip.zzk(j, (byte[])localObject1, m, (zzio)localObject4);
        j = ((zzio)localObject4).zza;
      }
      i = j >>> 3;
      int i4 = j & 0x7;
      if (i > i2) {
        paramInt1 = zzx(i, i3 / 3);
      } else {
        paramInt1 = zzw(i);
      }
      if (paramInt1 == -1)
      {
        paramInt1 = i1;
        i1 = 0;
      }
      else
      {
        int[] arrayOfInt = this.zzc;
        int i6 = arrayOfInt[(paramInt1 + 1)];
        int i5 = zzA(i6);
        i2 = m;
        long l2 = i6 & 0xFFFFF;
        if (i5 <= 17)
        {
          i1 = arrayOfInt[(paramInt1 + 2)];
          boolean bool = true;
          i3 = 1 << (i1 >>> 20);
          i1 &= 0xFFFFF;
          if (i1 != n)
          {
            if (n != 1048575) {
              ((Unsafe)localObject2).putInt(localObject3, n, k);
            }
            k = ((Unsafe)localObject2).getInt(localObject3, i1);
            n = i1;
            i1 = k;
          }
          else
          {
            i1 = k;
          }
          k = j;
          switch (i5)
          {
          default: 
            if (i4 == 3)
            {
              m = zzip.zzc(zzE(paramInt1), paramArrayOfByte, i2, paramInt2, i << 3 | 0x4, paramzzio);
              if ((i1 & i3) != 0) {
                break label1132;
              }
              ((Unsafe)localObject2).putObject(localObject3, l2, ((zzio)localObject4).zzc);
            }
            break;
          case 16: 
            if (i4 == 0)
            {
              m = zzip.zzm((byte[])localObject1, i2, (zzio)localObject4);
              ((Unsafe)localObject2).putLong(paramObject, l2, zzjf.zzc(((zzio)localObject4).zzb));
              i1 |= i3;
              i2 = i;
            }
            else
            {
              k = paramInt1;
            }
            break;
          case 15: 
            if (i4 == 0)
            {
              m = zzip.zzj((byte[])localObject1, i2, (zzio)localObject4);
              ((Unsafe)localObject2).putInt(localObject3, l2, zzjf.zzb(((zzio)localObject4).zza));
            }
            break;
          case 12: 
            if (i4 == 0)
            {
              m = zzip.zzj((byte[])localObject1, i2, (zzio)localObject4);
              i2 = ((zzio)localObject4).zza;
              localObject4 = zzD(paramInt1);
              if ((localObject4 != null) && (!((zzkg)localObject4).zza(i2)))
              {
                zzd(paramObject).zzh(k, Long.valueOf(i2));
                i2 = i;
              }
              else
              {
                ((Unsafe)localObject2).putInt(localObject3, l2, i2);
              }
            }
            break;
          case 10: 
            if (i4 == 2)
            {
              m = zzip.zza((byte[])localObject1, i2, (zzio)localObject4);
              ((Unsafe)localObject2).putObject(localObject3, l2, ((zzio)localObject4).zzc);
            }
          case 9: 
            for (;;)
            {
              i1 |= i3;
              i2 = i;
              i2 = i;
              i2 = paramInt1;
              k = i1;
              break label871;
              if (i4 != 2) {
                break;
              }
              m = zzip.zzd(zzE(paramInt1), (byte[])localObject1, i2, paramInt2, (zzio)localObject4);
              if ((i1 & i3) == 0) {
                ((Unsafe)localObject2).putObject(localObject3, l2, ((zzio)localObject4).zzc);
              } else {
                ((Unsafe)localObject2).putObject(localObject3, l2, zzkk.zzg(((Unsafe)localObject2).getObject(localObject3, l2), ((zzio)localObject4).zzc));
              }
            }
            i2 = m;
            i2 = paramInt1;
            break;
          case 8: 
            if (i4 == 2)
            {
              if ((0x20000000 & i6) == 0) {
                m = zzip.zzg((byte[])localObject1, i2, (zzio)localObject4);
              } else {
                m = zzip.zzh((byte[])localObject1, i2, (zzio)localObject4);
              }
              ((Unsafe)localObject2).putObject(localObject3, l2, ((zzio)localObject4).zzc);
            }
            break;
          case 7: 
            if (i4 == 0)
            {
              m = zzip.zzm((byte[])localObject1, i2, (zzio)localObject4);
              if (((zzio)localObject4).zzb == 0L) {
                bool = false;
              }
              zzmv.zzm(localObject3, l2, bool);
            }
            break;
          case 6: 
          case 13: 
            if (i4 == 5)
            {
              ((Unsafe)localObject2).putInt(localObject3, l2, zzip.zzb((byte[])localObject1, i2));
              m = i2 + 4;
              i1 |= i3;
              i2 = paramInt1;
              k = i;
              k = i1;
              i3 = paramInt1;
              i2 = i;
              i = j;
              i1 = paramInt3;
              paramInt1 = m;
              continue;
            }
            i2 = paramInt1;
            i2 = m;
            i2 = m;
            i2 = paramInt1;
            break;
          case 5: 
          case 14: 
            if (i4 == 1)
            {
              long l1 = zzip.zzn((byte[])localObject1, i2);
              ((Unsafe)localObject2).putLong(paramObject, l2, l1);
            }
            else
            {
              i3 = paramInt1;
            }
            break;
          case 4: 
          case 11: 
            if (i4 == 0)
            {
              k = zzip.zzj((byte[])localObject1, i2, (zzio)localObject4);
              ((Unsafe)localObject2).putInt(localObject3, l2, ((zzio)localObject4).zza);
            }
            break;
          case 2: 
          case 3: 
            if (i4 == 0)
            {
              m = zzip.zzm((byte[])localObject1, i2, (zzio)localObject4);
              ((Unsafe)localObject2).putLong(paramObject, l2, ((zzio)localObject4).zzb);
              k = i1 | i3;
              i1 = i;
            }
            break;
          case 1: 
            if (i4 == 5)
            {
              zzmv.zzp(localObject3, l2, Float.intBitsToFloat(zzip.zzb((byte[])localObject1, i2)));
              k = i2 + 4;
            }
            break;
          case 0: 
            label871:
            if (i4 == 1)
            {
              zzmv.zzo(localObject3, l2, Double.longBitsToDouble(zzip.zzn((byte[])localObject1, i2)));
              k = j;
              k = m + 8;
              m = j;
              i1 |= i3;
              m = k;
            }
            for (;;)
            {
              k = j;
              k = i;
              k = i1;
              i1 = i;
              i1 = paramInt1;
              break label1322;
              k = paramInt1;
              k = m;
              break;
              label1132:
              ((Unsafe)localObject2).putObject(localObject3, l2, zzkk.zzg(((Unsafe)localObject2).getObject(localObject3, l2), ((zzio)localObject4).zzc));
              i1 |= i3;
              localObject1 = paramArrayOfByte;
            }
            i2 = m;
            m = paramInt1;
            paramInt1 = paramInt3;
            k = i1;
            i1 = m;
            m = i2;
            break;
          }
        }
        if (i5 == 27)
        {
          if (i4 == 2)
          {
            localObject4 = (zzkj)((Unsafe)localObject2).getObject(localObject3, l2);
            localObject1 = localObject4;
            if (!((zzkj)localObject4).zzc())
            {
              m = ((zzkj)localObject4).size();
              if (m == 0) {
                m = 10;
              } else {
                m += m;
              }
              localObject1 = ((zzkj)localObject4).zzd(m);
              ((Unsafe)localObject2).putObject(localObject3, l2, localObject1);
            }
            localObject3 = zzE(paramInt1);
            m = zzip.zze((zzlu)localObject3, j, paramArrayOfByte, i2, paramInt2, (zzkj)localObject1, paramzzio);
            localObject1 = paramArrayOfByte;
            i1 = i;
            i1 = paramInt1;
            label1322:
            i3 = paramInt1;
            i2 = i;
            i1 = paramInt3;
            paramInt1 = m;
            i = j;
            continue;
          }
        }
        else if (i5 <= 49)
        {
          i1 = zzv(paramObject, paramArrayOfByte, i2, paramInt2, j, i, i4, paramInt1, i6, i5, l2, paramzzio);
          m = i1;
          if (i1 != i2) {
            m = i1;
          }
        }
        for (;;)
        {
          localObject1 = paramObject;
          localObject1 = paramArrayOfByte;
          i2 = i;
          i1 = paramInt3;
          localObject3 = paramzzio;
          i = j;
          i3 = paramInt1;
          paramInt1 = m;
          break;
          label1478:
          label1487:
          do
          {
            for (;;)
            {
              break label1478;
              if (i5 != 50) {
                break label1487;
              }
              if (i4 == 2)
              {
                i1 = zzs(paramObject, paramArrayOfByte, i2, paramInt2, paramInt1, l2, paramzzio);
                m = i1;
                if (i1 != i2)
                {
                  m = i1;
                  break;
                }
              }
            }
            i1 = paramInt1;
            paramInt1 = paramInt3;
            break label1532;
            i1 = zzt(paramObject, paramArrayOfByte, i2, paramInt2, j, i, i4, i6, i5, l2, paramInt1, paramzzio);
            m = i1;
          } while (i1 == i2);
          m = i1;
        }
      }
      label1532:
      if ((j == paramInt1) && (paramInt1 != 0))
      {
        paramArrayOfByte = this;
        paramInt3 = m;
        i = j;
        j = paramInt1;
        break label1689;
      }
      if (this.zzh) {
        if (paramzzio.zzd != zzjo.zza())
        {
          localObject1 = this.zzg;
          if (paramzzio.zzd.zzc((zzlj)localObject1, i) == null)
          {
            m = zzip.zzi(j, paramArrayOfByte, m, paramInt2, zzd(paramObject), paramzzio);
            break label1646;
          }
          paramObject = (zzjz)paramObject;
          throw null;
        }
      }
      m = zzip.zzi(j, paramArrayOfByte, m, paramInt2, zzd(paramObject), paramzzio);
      label1646:
      localObject1 = paramzzio;
      i2 = i;
      localObject1 = paramObject;
      i3 = i1;
      localObject1 = paramArrayOfByte;
      i1 = paramInt1;
      paramInt1 = m;
      i = j;
    }
    int j = i1;
    paramObject = localObject3;
    paramArrayOfByte = this;
    paramInt3 = paramInt1;
    label1689:
    paramArrayOfByte = this;
    if (n != 1048575) {
      ((Unsafe)localObject2).putInt(paramObject, n, k);
    }
    paramInt1 = paramArrayOfByte.zzk;
    while (paramInt1 < paramArrayOfByte.zzl)
    {
      m = paramArrayOfByte.zzj[paramInt1];
      k = paramArrayOfByte.zzc[m];
      paramzzio = zzmv.zzf(paramObject, paramArrayOfByte.zzB(m) & 0xFFFFF);
      if ((paramzzio == null) || (paramArrayOfByte.zzD(m) == null))
      {
        paramInt1++;
      }
      else
      {
        paramObject = (zzld)paramzzio;
        paramObject = (zzlc)paramArrayOfByte.zzF(m);
        throw null;
      }
    }
    if (j == 0)
    {
      if (paramInt3 != paramInt2) {
        throw zzkm.zze();
      }
    }
    else {
      if ((paramInt3 > paramInt2) || (i != j)) {
        break label1832;
      }
    }
    return paramInt3;
    label1832:
    throw zzkm.zze();
  }
  
  public final Object zze()
  {
    return ((zzkc)this.zzg).zzl(4, null, null);
  }
  
  public final void zzf(Object paramObject)
  {
    int j;
    for (int i = this.zzk;; i++)
    {
      j = this.zzl;
      if (i >= j) {
        break;
      }
      long l = zzB(this.zzj[i]) & 0xFFFFF;
      Object localObject = zzmv.zzf(paramObject, l);
      if (localObject != null)
      {
        ((zzld)localObject).zzc();
        zzmv.zzs(paramObject, l, localObject);
      }
    }
    int k = this.zzj.length;
    for (i = j; i < k; i++) {
      this.zzm.zza(paramObject, this.zzj[i]);
    }
    this.zzn.zzg(paramObject);
    if (this.zzh) {
      this.zzo.zzb(paramObject);
    }
  }
  
  public final void zzg(Object paramObject1, Object paramObject2)
  {
    Objects.requireNonNull(paramObject2);
    for (int i = 0; i < this.zzc.length; i += 3)
    {
      int k = zzB(i);
      long l = 0xFFFFF & k;
      int j = this.zzc[i];
      switch (zzA(k))
      {
      default: 
        break;
      case 68: 
        zzI(paramObject1, paramObject2, i);
        break;
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 67: 
        if (zzR(paramObject2, j, i))
        {
          zzmv.zzs(paramObject1, l, zzmv.zzf(paramObject2, l));
          zzK(paramObject1, j, i);
        }
        break;
      case 60: 
        zzI(paramObject1, paramObject2, i);
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
        if (zzR(paramObject2, j, i))
        {
          zzmv.zzs(paramObject1, l, zzmv.zzf(paramObject2, l));
          zzK(paramObject1, j, i);
        }
        break;
      case 50: 
        zzlw.zzaa(this.zzq, paramObject1, paramObject2, l);
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
        this.zzm.zzb(paramObject1, paramObject2, l);
        break;
      case 17: 
        zzH(paramObject1, paramObject2, i);
        break;
      case 16: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzr(paramObject1, l, zzmv.zzd(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 15: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 14: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzr(paramObject1, l, zzmv.zzd(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 13: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 12: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 11: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 10: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzs(paramObject1, l, zzmv.zzf(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 9: 
        zzH(paramObject1, paramObject2, i);
        break;
      case 8: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzs(paramObject1, l, zzmv.zzf(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 7: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzm(paramObject1, l, zzmv.zzw(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 6: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 5: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzr(paramObject1, l, zzmv.zzd(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 4: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzq(paramObject1, l, zzmv.zzc(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 3: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzr(paramObject1, l, zzmv.zzd(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 2: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzr(paramObject1, l, zzmv.zzd(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 1: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzp(paramObject1, l, zzmv.zzb(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      case 0: 
        if (zzO(paramObject2, i))
        {
          zzmv.zzo(paramObject1, l, zzmv.zza(paramObject2, l));
          zzJ(paramObject1, i);
        }
        break;
      }
    }
    zzlw.zzF(this.zzn, paramObject1, paramObject2);
    if (this.zzh) {
      zzlw.zzE(this.zzo, paramObject1, paramObject2);
    }
  }
  
  public final void zzh(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzio paramzzio)
    throws IOException
  {
    if (this.zzi)
    {
      zzu(paramObject, paramArrayOfByte, paramInt1, paramInt2, paramzzio);
      return;
    }
    zzc(paramObject, paramArrayOfByte, paramInt1, paramInt2, 0, paramzzio);
  }
  
  public final void zzi(Object paramObject, zznd paramzznd)
    throws IOException
  {
    if (this.zzi)
    {
      if (!this.zzh)
      {
        int j = this.zzc.length;
        for (int i = 0; i < j; i += 3)
        {
          int k = zzB(i);
          int m = this.zzc[i];
          switch (zzA(k))
          {
          default: 
            break;
          case 68: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzq(m, zzmv.zzf(paramObject, k & 0xFFFFF), zzE(i));
            }
            break;
          case 67: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzC(m, zzC(paramObject, k & 0xFFFFF));
            }
            break;
          case 66: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzA(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 65: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzy(m, zzC(paramObject, k & 0xFFFFF));
            }
            break;
          case 64: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzw(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 63: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzi(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 62: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzH(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 61: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzd(m, (zzjb)zzmv.zzf(paramObject, k & 0xFFFFF));
            }
            break;
          case 60: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzv(m, zzmv.zzf(paramObject, k & 0xFFFFF), zzE(i));
            }
            break;
          case 59: 
            if (zzR(paramObject, m, i)) {
              zzT(m, zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd);
            }
            break;
          case 58: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzb(m, zzS(paramObject, k & 0xFFFFF));
            }
            break;
          case 57: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzk(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 56: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzm(m, zzC(paramObject, k & 0xFFFFF));
            }
            break;
          case 55: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzr(m, zzr(paramObject, k & 0xFFFFF));
            }
            break;
          case 54: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzJ(m, zzC(paramObject, k & 0xFFFFF));
            }
            break;
          case 53: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzt(m, zzC(paramObject, k & 0xFFFFF));
            }
            break;
          case 52: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzo(m, zzo(paramObject, k & 0xFFFFF));
            }
            break;
          case 51: 
            if (zzR(paramObject, m, i)) {
              paramzznd.zzf(m, zzn(paramObject, k & 0xFFFFF));
            }
            break;
          case 50: 
            zzM(paramzznd, m, zzmv.zzf(paramObject, k & 0xFFFFF), i);
            break;
          case 49: 
            zzlw.zzO(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, zzE(i));
            break;
          case 48: 
            zzlw.zzV(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 47: 
            zzlw.zzU(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 46: 
            zzlw.zzT(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 45: 
            zzlw.zzS(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 44: 
            zzlw.zzK(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 43: 
            zzlw.zzX(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 42: 
            zzlw.zzH(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 41: 
            zzlw.zzL(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 40: 
            zzlw.zzM(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 39: 
            zzlw.zzP(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 38: 
            zzlw.zzY(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 37: 
            zzlw.zzQ(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 36: 
            zzlw.zzN(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 35: 
            zzlw.zzJ(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, true);
            break;
          case 34: 
            zzlw.zzV(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 33: 
            zzlw.zzU(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 32: 
            zzlw.zzT(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 31: 
            zzlw.zzS(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 30: 
            zzlw.zzK(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 29: 
            zzlw.zzX(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 28: 
            zzlw.zzI(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd);
            break;
          case 27: 
            zzlw.zzR(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, zzE(i));
            break;
          case 26: 
            zzlw.zzW(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd);
            break;
          case 25: 
            zzlw.zzH(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 24: 
            zzlw.zzL(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 23: 
            zzlw.zzM(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 22: 
            zzlw.zzP(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 21: 
            zzlw.zzY(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 20: 
            zzlw.zzQ(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 19: 
            zzlw.zzN(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 18: 
            zzlw.zzJ(m, (List)zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd, false);
            break;
          case 17: 
            if (zzO(paramObject, i)) {
              paramzznd.zzq(m, zzmv.zzf(paramObject, k & 0xFFFFF), zzE(i));
            }
            break;
          case 16: 
            if (zzO(paramObject, i)) {
              paramzznd.zzC(m, zzmv.zzd(paramObject, k & 0xFFFFF));
            }
            break;
          case 15: 
            if (zzO(paramObject, i)) {
              paramzznd.zzA(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 14: 
            if (zzO(paramObject, i)) {
              paramzznd.zzy(m, zzmv.zzd(paramObject, k & 0xFFFFF));
            }
            break;
          case 13: 
            if (zzO(paramObject, i)) {
              paramzznd.zzw(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 12: 
            if (zzO(paramObject, i)) {
              paramzznd.zzi(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 11: 
            if (zzO(paramObject, i)) {
              paramzznd.zzH(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 10: 
            if (zzO(paramObject, i)) {
              paramzznd.zzd(m, (zzjb)zzmv.zzf(paramObject, k & 0xFFFFF));
            }
            break;
          case 9: 
            if (zzO(paramObject, i)) {
              paramzznd.zzv(m, zzmv.zzf(paramObject, k & 0xFFFFF), zzE(i));
            }
            break;
          case 8: 
            if (zzO(paramObject, i)) {
              zzT(m, zzmv.zzf(paramObject, k & 0xFFFFF), paramzznd);
            }
            break;
          case 7: 
            if (zzO(paramObject, i)) {
              paramzznd.zzb(m, zzmv.zzw(paramObject, k & 0xFFFFF));
            }
            break;
          case 6: 
            if (zzO(paramObject, i)) {
              paramzznd.zzk(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 5: 
            if (zzO(paramObject, i)) {
              paramzznd.zzm(m, zzmv.zzd(paramObject, k & 0xFFFFF));
            }
            break;
          case 4: 
            if (zzO(paramObject, i)) {
              paramzznd.zzr(m, zzmv.zzc(paramObject, k & 0xFFFFF));
            }
            break;
          case 3: 
            if (zzO(paramObject, i)) {
              paramzznd.zzJ(m, zzmv.zzd(paramObject, k & 0xFFFFF));
            }
            break;
          case 2: 
            if (zzO(paramObject, i)) {
              paramzznd.zzt(m, zzmv.zzd(paramObject, k & 0xFFFFF));
            }
            break;
          case 1: 
            if (zzO(paramObject, i)) {
              paramzznd.zzo(m, zzmv.zzb(paramObject, k & 0xFFFFF));
            }
            break;
          case 0: 
            if (zzO(paramObject, i)) {
              paramzznd.zzf(m, zzmv.zza(paramObject, k & 0xFFFFF));
            }
            break;
          }
        }
        zzml localzzml = this.zzn;
        localzzml.zzi(localzzml.zzc(paramObject), paramzznd);
        return;
      }
      this.zzo.zza(paramObject);
      throw null;
    }
    zzL(paramObject, paramzznd);
  }
  
  /* Error */
  public final boolean zzj(Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 53	com/google/android/gms/internal/measurement/zzlm:zzc	[I
    //   4: arraylength
    //   5: istore 4
    //   7: iconst_0
    //   8: istore_3
    //   9: iload_3
    //   10: iload 4
    //   12: if_icmpge +949 -> 961
    //   15: aload_0
    //   16: iload_3
    //   17: invokespecial 173	com/google/android/gms/internal/measurement/zzlm:zzB	(I)I
    //   20: istore 5
    //   22: iload 5
    //   24: ldc -82
    //   26: iand
    //   27: i2l
    //   28: lstore 6
    //   30: iload 5
    //   32: invokestatic 217	com/google/android/gms/internal/measurement/zzlm:zzA	(I)I
    //   35: tableswitch	default:+289->324, 0:+883->918, 1:+849->884, 2:+820->855, 3:+791->826, 4:+763->798, 5:+734->769, 6:+706->741, 7:+678->713, 8:+647->682, 9:+616->651, 10:+585->620, 11:+557->592, 12:+529->564, 13:+501->536, 14:+472->507, 15:+444->479, 16:+415->450, 17:+384->419, 18:+359->394, 19:+359->394, 20:+359->394, 21:+359->394, 22:+359->394, 23:+359->394, 24:+359->394, 25:+359->394, 26:+359->394, 27:+359->394, 28:+359->394, 29:+359->394, 30:+359->394, 31:+359->394, 32:+359->394, 33:+359->394, 34:+359->394, 35:+359->394, 36:+359->394, 37:+359->394, 38:+359->394, 39:+359->394, 40:+359->394, 41:+359->394, 42:+359->394, 43:+359->394, 44:+359->394, 45:+359->394, 46:+359->394, 47:+359->394, 48:+359->394, 49:+359->394, 50:+339->374, 51:+292->327, 52:+292->327, 53:+292->327, 54:+292->327, 55:+292->327, 56:+292->327, 57:+292->327, 58:+292->327, 59:+292->327, 60:+292->327, 61:+292->327, 62:+292->327, 63:+292->327, 64:+292->327, 65:+292->327, 66:+292->327, 67:+292->327, 68:+292->327
    //   324: goto +631 -> 955
    //   327: aload_0
    //   328: iload_3
    //   329: invokespecial 203	com/google/android/gms/internal/measurement/zzlm:zzy	(I)I
    //   332: ldc -82
    //   334: iand
    //   335: i2l
    //   336: lstore 8
    //   338: aload_1
    //   339: lload 8
    //   341: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   344: aload_2
    //   345: lload 8
    //   347: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   350: if_icmpne +603 -> 953
    //   353: aload_1
    //   354: lload 6
    //   356: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   359: aload_2
    //   360: lload 6
    //   362: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   365: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   368: ifne +587 -> 955
    //   371: goto +582 -> 953
    //   374: aload_1
    //   375: lload 6
    //   377: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   380: aload_2
    //   381: lload 6
    //   383: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   386: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   389: istore 10
    //   391: goto +20 -> 411
    //   394: aload_1
    //   395: lload 6
    //   397: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   400: aload_2
    //   401: lload 6
    //   403: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   406: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   409: istore 10
    //   411: iload 10
    //   413: ifne +542 -> 955
    //   416: goto +537 -> 953
    //   419: aload_0
    //   420: aload_1
    //   421: aload_2
    //   422: iload_3
    //   423: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   426: ifeq +527 -> 953
    //   429: aload_1
    //   430: lload 6
    //   432: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   435: aload_2
    //   436: lload 6
    //   438: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   441: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   444: ifeq +509 -> 953
    //   447: goto +508 -> 955
    //   450: aload_0
    //   451: aload_1
    //   452: aload_2
    //   453: iload_3
    //   454: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   457: ifeq +496 -> 953
    //   460: aload_1
    //   461: lload 6
    //   463: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   466: aload_2
    //   467: lload 6
    //   469: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   472: lcmp
    //   473: ifne +480 -> 953
    //   476: goto +479 -> 955
    //   479: aload_0
    //   480: aload_1
    //   481: aload_2
    //   482: iload_3
    //   483: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   486: ifeq +467 -> 953
    //   489: aload_1
    //   490: lload 6
    //   492: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   495: aload_2
    //   496: lload 6
    //   498: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   501: if_icmpne +452 -> 953
    //   504: goto +451 -> 955
    //   507: aload_0
    //   508: aload_1
    //   509: aload_2
    //   510: iload_3
    //   511: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   514: ifeq +439 -> 953
    //   517: aload_1
    //   518: lload 6
    //   520: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   523: aload_2
    //   524: lload 6
    //   526: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   529: lcmp
    //   530: ifne +423 -> 953
    //   533: goto +422 -> 955
    //   536: aload_0
    //   537: aload_1
    //   538: aload_2
    //   539: iload_3
    //   540: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   543: ifeq +410 -> 953
    //   546: aload_1
    //   547: lload 6
    //   549: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   552: aload_2
    //   553: lload 6
    //   555: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   558: if_icmpne +395 -> 953
    //   561: goto +394 -> 955
    //   564: aload_0
    //   565: aload_1
    //   566: aload_2
    //   567: iload_3
    //   568: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   571: ifeq +382 -> 953
    //   574: aload_1
    //   575: lload 6
    //   577: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   580: aload_2
    //   581: lload 6
    //   583: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   586: if_icmpne +367 -> 953
    //   589: goto +366 -> 955
    //   592: aload_0
    //   593: aload_1
    //   594: aload_2
    //   595: iload_3
    //   596: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   599: ifeq +354 -> 953
    //   602: aload_1
    //   603: lload 6
    //   605: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   608: aload_2
    //   609: lload 6
    //   611: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   614: if_icmpne +339 -> 953
    //   617: goto +338 -> 955
    //   620: aload_0
    //   621: aload_1
    //   622: aload_2
    //   623: iload_3
    //   624: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   627: ifeq +326 -> 953
    //   630: aload_1
    //   631: lload 6
    //   633: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   636: aload_2
    //   637: lload 6
    //   639: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   642: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   645: ifeq +308 -> 953
    //   648: goto +307 -> 955
    //   651: aload_0
    //   652: aload_1
    //   653: aload_2
    //   654: iload_3
    //   655: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   658: ifeq +295 -> 953
    //   661: aload_1
    //   662: lload 6
    //   664: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   667: aload_2
    //   668: lload 6
    //   670: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   673: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   676: ifeq +277 -> 953
    //   679: goto +276 -> 955
    //   682: aload_0
    //   683: aload_1
    //   684: aload_2
    //   685: iload_3
    //   686: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   689: ifeq +264 -> 953
    //   692: aload_1
    //   693: lload 6
    //   695: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   698: aload_2
    //   699: lload 6
    //   701: invokestatic 94	com/google/android/gms/internal/measurement/zzmv:zzf	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   704: invokestatic 869	com/google/android/gms/internal/measurement/zzlw:zzZ	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   707: ifeq +246 -> 953
    //   710: goto +245 -> 955
    //   713: aload_0
    //   714: aload_1
    //   715: aload_2
    //   716: iload_3
    //   717: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   720: ifeq +233 -> 953
    //   723: aload_1
    //   724: lload 6
    //   726: invokestatic 354	com/google/android/gms/internal/measurement/zzmv:zzw	(Ljava/lang/Object;J)Z
    //   729: aload_2
    //   730: lload 6
    //   732: invokestatic 354	com/google/android/gms/internal/measurement/zzmv:zzw	(Ljava/lang/Object;J)Z
    //   735: if_icmpne +218 -> 953
    //   738: goto +217 -> 955
    //   741: aload_0
    //   742: aload_1
    //   743: aload_2
    //   744: iload_3
    //   745: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   748: ifeq +205 -> 953
    //   751: aload_1
    //   752: lload 6
    //   754: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   757: aload_2
    //   758: lload 6
    //   760: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   763: if_icmpne +190 -> 953
    //   766: goto +189 -> 955
    //   769: aload_0
    //   770: aload_1
    //   771: aload_2
    //   772: iload_3
    //   773: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   776: ifeq +177 -> 953
    //   779: aload_1
    //   780: lload 6
    //   782: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   785: aload_2
    //   786: lload 6
    //   788: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   791: lcmp
    //   792: ifne +161 -> 953
    //   795: goto +160 -> 955
    //   798: aload_0
    //   799: aload_1
    //   800: aload_2
    //   801: iload_3
    //   802: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   805: ifeq +148 -> 953
    //   808: aload_1
    //   809: lload 6
    //   811: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   814: aload_2
    //   815: lload 6
    //   817: invokestatic 208	com/google/android/gms/internal/measurement/zzmv:zzc	(Ljava/lang/Object;J)I
    //   820: if_icmpne +133 -> 953
    //   823: goto +132 -> 955
    //   826: aload_0
    //   827: aload_1
    //   828: aload_2
    //   829: iload_3
    //   830: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   833: ifeq +120 -> 953
    //   836: aload_1
    //   837: lload 6
    //   839: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   842: aload_2
    //   843: lload 6
    //   845: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   848: lcmp
    //   849: ifne +104 -> 953
    //   852: goto +103 -> 955
    //   855: aload_0
    //   856: aload_1
    //   857: aload_2
    //   858: iload_3
    //   859: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   862: ifeq +91 -> 953
    //   865: aload_1
    //   866: lload 6
    //   868: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   871: aload_2
    //   872: lload 6
    //   874: invokestatic 379	com/google/android/gms/internal/measurement/zzmv:zzd	(Ljava/lang/Object;J)J
    //   877: lcmp
    //   878: ifne +75 -> 953
    //   881: goto +74 -> 955
    //   884: aload_0
    //   885: aload_1
    //   886: aload_2
    //   887: iload_3
    //   888: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   891: ifeq +62 -> 953
    //   894: aload_1
    //   895: lload 6
    //   897: invokestatic 356	com/google/android/gms/internal/measurement/zzmv:zzb	(Ljava/lang/Object;J)F
    //   900: invokestatic 800	java/lang/Float:floatToIntBits	(F)I
    //   903: aload_2
    //   904: lload 6
    //   906: invokestatic 356	com/google/android/gms/internal/measurement/zzmv:zzb	(Ljava/lang/Object;J)F
    //   909: invokestatic 800	java/lang/Float:floatToIntBits	(F)I
    //   912: if_icmpne +41 -> 953
    //   915: goto +40 -> 955
    //   918: aload_0
    //   919: aload_1
    //   920: aload_2
    //   921: iload_3
    //   922: invokespecial 871	com/google/android/gms/internal/measurement/zzlm:zzN	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   925: ifeq +28 -> 953
    //   928: aload_1
    //   929: lload 6
    //   931: invokestatic 358	com/google/android/gms/internal/measurement/zzmv:zza	(Ljava/lang/Object;J)D
    //   934: invokestatic 803	java/lang/Double:doubleToLongBits	(D)J
    //   937: aload_2
    //   938: lload 6
    //   940: invokestatic 358	com/google/android/gms/internal/measurement/zzmv:zza	(Ljava/lang/Object;J)D
    //   943: invokestatic 803	java/lang/Double:doubleToLongBits	(D)J
    //   946: lcmp
    //   947: ifne +6 -> 953
    //   950: goto +5 -> 955
    //   953: iconst_0
    //   954: ireturn
    //   955: iinc 3 3
    //   958: goto -949 -> 9
    //   961: aload_0
    //   962: getfield 80	com/google/android/gms/internal/measurement/zzlm:zzn	Lcom/google/android/gms/internal/measurement/zzml;
    //   965: aload_1
    //   966: invokevirtual 363	com/google/android/gms/internal/measurement/zzml:zzc	(Ljava/lang/Object;)Ljava/lang/Object;
    //   969: aload_0
    //   970: getfield 80	com/google/android/gms/internal/measurement/zzlm:zzn	Lcom/google/android/gms/internal/measurement/zzml;
    //   973: aload_2
    //   974: invokevirtual 363	com/google/android/gms/internal/measurement/zzml:zzc	(Ljava/lang/Object;)Ljava/lang/Object;
    //   977: invokevirtual 872	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   980: ifne +5 -> 985
    //   983: iconst_0
    //   984: ireturn
    //   985: aload_0
    //   986: getfield 68	com/google/android/gms/internal/measurement/zzlm:zzh	Z
    //   989: ifne +5 -> 994
    //   992: iconst_1
    //   993: ireturn
    //   994: aload_0
    //   995: getfield 82	com/google/android/gms/internal/measurement/zzlm:zzo	Lcom/google/android/gms/internal/measurement/zzjp;
    //   998: aload_1
    //   999: invokevirtual 368	com/google/android/gms/internal/measurement/zzjp:zza	(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzjt;
    //   1002: pop
    //   1003: aload_0
    //   1004: getfield 82	com/google/android/gms/internal/measurement/zzlm:zzo	Lcom/google/android/gms/internal/measurement/zzjp;
    //   1007: aload_2
    //   1008: invokevirtual 368	com/google/android/gms/internal/measurement/zzjp:zza	(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzjt;
    //   1011: pop
    //   1012: aconst_null
    //   1013: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1014	0	this	zzlm
    //   0	1014	1	paramObject1	Object
    //   0	1014	2	paramObject2	Object
    //   8	948	3	i	int
    //   5	8	4	j	int
    //   20	11	5	k	int
    //   28	911	6	l1	long
    //   336	10	8	l2	long
    //   389	23	10	bool	boolean
  }
  
  public final boolean zzk(Object paramObject)
  {
    int j = 1048575;
    int i = 0;
    for (int k = 0; k < this.zzk; k++)
    {
      int i2 = this.zzj[k];
      int n = this.zzc[i2];
      int i1 = zzB(i2);
      int i3 = this.zzc[(i2 + 2)];
      int m = i3 & 0xFFFFF;
      i3 = 1 << (i3 >>> 20);
      if (m != j)
      {
        if (m != 1048575) {
          i = zzb.getInt(paramObject, m);
        }
        j = m;
      }
      if (((0x10000000 & i1) != 0) && (!zzP(paramObject, i2, j, i, i3))) {
        return false;
      }
      m = zzA(i1);
      List localList;
      zzlu localzzlu;
      if ((m != 9) && (m != 17))
      {
        if (m != 27) {
          if ((m != 60) && (m != 68))
          {
            if (m != 49)
            {
              if ((m != 50) || (((zzld)zzmv.zzf(paramObject, i1 & 0xFFFFF)).isEmpty())) {
                continue;
              }
              paramObject = (zzlc)zzF(i2);
              throw null;
            }
          }
          else
          {
            if ((!zzR(paramObject, n, i2)) || (zzQ(paramObject, i1, zzE(i2)))) {
              continue;
            }
            return false;
          }
        }
        localList = (List)zzmv.zzf(paramObject, i1 & 0xFFFFF);
        if (!localList.isEmpty())
        {
          localzzlu = zzE(i2);
          m = 0;
        }
      }
      else
      {
        while (m < localList.size())
        {
          if (!localzzlu.zzk(localList.get(m))) {
            return false;
          }
          m++;
          continue;
          if ((zzP(paramObject, i2, j, i, i3)) && (!zzQ(paramObject, i1, zzE(i2)))) {
            return false;
          }
        }
      }
    }
    if (!this.zzh) {
      return true;
    }
    this.zzo.zza(paramObject);
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzlm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */