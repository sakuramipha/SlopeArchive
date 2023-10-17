package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class zzgnx
  implements zzgqr
{
  private final zzgnw zza;
  private int zzb;
  private int zzc;
  private int zzd = 0;
  
  private zzgnx(zzgnw paramzzgnw)
  {
    byte[] arrayOfByte = zzgpg.zzd;
    this.zza = paramzzgnw;
    paramzzgnw.zzc = this;
  }
  
  private final void zzP(Object paramObject, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    int i = this.zzc;
    this.zzc = (this.zzb >>> 3 << 3 | 0x4);
    try
    {
      paramzzgqz.zzh(paramObject, this, paramzzgoi);
      int j = this.zzb;
      int k = this.zzc;
      if (j == k) {
        return;
      }
      throw zzgpi.zzg();
    }
    finally
    {
      this.zzc = i;
    }
  }
  
  private final void zzQ(Object paramObject, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    int i = this.zza.zzn();
    zzgnw localzzgnw = this.zza;
    if (localzzgnw.zza < localzzgnw.zzb)
    {
      i = localzzgnw.zze(i);
      localzzgnw = this.zza;
      localzzgnw.zza += 1;
      paramzzgqz.zzh(paramObject, this, paramzzgoi);
      this.zza.zzz(0);
      paramObject = this.zza;
      ((zzgnw)paramObject).zza -= 1;
      ((zzgnw)paramObject).zzA(i);
      return;
    }
    throw new zzgpi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  private final void zzR(int paramInt)
    throws IOException
  {
    if (this.zza.zzd() == paramInt) {
      return;
    }
    throw zzgpi.zzj();
  }
  
  private final void zzS(int paramInt)
    throws IOException
  {
    if ((this.zzb & 0x7) == paramInt) {
      return;
    }
    throw zzgpi.zza();
  }
  
  private static final void zzT(int paramInt)
    throws IOException
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw zzgpi.zzg();
  }
  
  private static final void zzU(int paramInt)
    throws IOException
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw zzgpi.zzg();
  }
  
  public static zzgnx zzq(zzgnw paramzzgnw)
  {
    zzgnx localzzgnx = paramzzgnw.zzc;
    if (localzzgnx != null) {
      return localzzgnx;
    }
    return new zzgnx(paramzzgnw);
  }
  
  public final void zzA(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = this.zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          zzU(i);
          j = this.zza.zzd();
          do
          {
            paramList.zzg(this.zza.zzo());
          } while (this.zza.zzd() < j + i);
        }
        else
        {
          throw zzgpi.zza();
        }
      }
      else
      {
        do
        {
          paramList.zzg(this.zza.zzo());
          if (this.zza.zzC()) {
            return;
          }
          i = this.zza.zzm();
        } while (i == this.zzb);
        this.zzd = i;
      }
    }
    else
    {
      i = this.zzb & 0x7;
      if (i == 1) {
        break label198;
      }
      if (i != 2) {
        break label194;
      }
      i = this.zza.zzn();
      zzU(i);
      j = this.zza.zzd();
      do
      {
        paramList.add(Long.valueOf(this.zza.zzo()));
      } while (this.zza.zzd() < j + i);
    }
    return;
    label194:
    throw zzgpi.zza();
    label198:
    do
    {
      paramList.add(Long.valueOf(this.zza.zzo()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzB(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgop))
    {
      paramList = (zzgop)paramList;
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zze(this.zza.zzc());
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      i = this.zza.zzn();
      zzT(i);
      j = this.zza.zzd();
      do
      {
        paramList.zze(this.zza.zzc());
      } while (this.zza.zzd() < j + i);
    }
    else
    {
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Float.valueOf(this.zza.zzc()));
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      j = this.zza.zzn();
      zzT(j);
      i = this.zza.zzd();
      do
      {
        paramList.add(Float.valueOf(this.zza.zzc()));
      } while (this.zza.zzd() < i + j);
    }
  }
  
  @Deprecated
  public final void zzC(List paramList, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    int j = this.zzb;
    if ((j & 0x7) == 3)
    {
      int i;
      do
      {
        Object localObject = paramzzgqz.zze();
        zzP(localObject, paramzzgqz, paramzzgoi);
        paramzzgqz.zzf(localObject);
        paramList.add(localObject);
        if ((this.zza.zzC()) || (this.zzd != 0)) {
          break;
        }
        i = this.zza.zzm();
      } while (i == j);
      this.zzd = i;
      return;
    }
    throw zzgpi.zza();
  }
  
  public final void zzD(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzh(this.zza.zzh());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzh(this.zza.zzh());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Integer.valueOf(this.zza.zzh()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(this.zza.zzh()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzE(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzg(this.zza.zzp());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzg(this.zza.zzp());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Long.valueOf(this.zza.zzp()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Long.valueOf(this.zza.zzp()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzF(List paramList, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    int j = this.zzb;
    if ((j & 0x7) == 2)
    {
      int i;
      do
      {
        Object localObject = paramzzgqz.zze();
        zzQ(localObject, paramzzgqz, paramzzgoi);
        paramzzgqz.zzf(localObject);
        paramList.add(localObject);
        if ((this.zza.zzC()) || (this.zzd != 0)) {
          break;
        }
        i = this.zza.zzm();
      } while (i == j);
      this.zzd = i;
      return;
    }
    throw zzgpi.zza();
  }
  
  public final void zzG(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zzh(this.zza.zzk());
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      j = this.zza.zzn();
      zzT(j);
      i = this.zza.zzd();
      do
      {
        paramList.zzh(this.zza.zzk());
      } while (this.zza.zzd() < i + j);
    }
    else
    {
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(this.zza.zzk()));
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      j = this.zza.zzn();
      zzT(j);
      i = this.zza.zzd();
      do
      {
        paramList.add(Integer.valueOf(this.zza.zzk()));
      } while (this.zza.zzd() < i + j);
    }
  }
  
  public final void zzH(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = this.zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          zzU(i);
          j = this.zza.zzd();
          do
          {
            paramList.zzg(this.zza.zzt());
          } while (this.zza.zzd() < j + i);
        }
        else
        {
          throw zzgpi.zza();
        }
      }
      else
      {
        do
        {
          paramList.zzg(this.zza.zzt());
          if (this.zza.zzC()) {
            return;
          }
          i = this.zza.zzm();
        } while (i == this.zzb);
        this.zzd = i;
      }
    }
    else
    {
      i = this.zzb & 0x7;
      if (i == 1) {
        break label198;
      }
      if (i != 2) {
        break label194;
      }
      i = this.zza.zzn();
      zzU(i);
      j = this.zza.zzd();
      do
      {
        paramList.add(Long.valueOf(this.zza.zzt()));
      } while (this.zza.zzd() < j + i);
    }
    return;
    label194:
    throw zzgpi.zza();
    label198:
    do
    {
      paramList.add(Long.valueOf(this.zza.zzt()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzI(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzh(this.zza.zzl());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzh(this.zza.zzl());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Integer.valueOf(this.zza.zzl()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(this.zza.zzl()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzJ(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzg(this.zza.zzu());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzg(this.zza.zzu());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Long.valueOf(this.zza.zzu()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Long.valueOf(this.zza.zzu()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzK(List paramList, boolean paramBoolean)
    throws IOException
  {
    if ((this.zzb & 0x7) == 2)
    {
      int i;
      if (((paramList instanceof zzgpo)) && (!paramBoolean))
      {
        paramList = (zzgpo)paramList;
        do
        {
          paramList.zzi(zzp());
          if (this.zza.zzC()) {
            return;
          }
          i = this.zza.zzm();
        } while (i == this.zzb);
        this.zzd = i;
        return;
      }
      do
      {
        String str;
        if (paramBoolean) {
          str = zzs();
        } else {
          str = zzr();
        }
        paramList.add(str);
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    throw zzgpi.zza();
  }
  
  public final void zzL(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzh(this.zza.zzn());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzh(this.zza.zzn());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Integer.valueOf(this.zza.zzn()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(this.zza.zzn()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzM(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgpv))
    {
      paramList = (zzgpv)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzg(this.zza.zzv());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzg(this.zza.zzv());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Long.valueOf(this.zza.zzv()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Long.valueOf(this.zza.zzv()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final boolean zzN()
    throws IOException
  {
    zzS(0);
    return this.zza.zzD();
  }
  
  public final boolean zzO()
    throws IOException
  {
    if (!this.zza.zzC())
    {
      int i = this.zzb;
      if (i != this.zzc) {
        return this.zza.zzE(i);
      }
    }
    return false;
  }
  
  public final double zza()
    throws IOException
  {
    zzS(1);
    return this.zza.zzb();
  }
  
  public final float zzb()
    throws IOException
  {
    zzS(5);
    return this.zza.zzc();
  }
  
  public final int zzc()
    throws IOException
  {
    int i = this.zzd;
    if (i != 0)
    {
      this.zzb = i;
      this.zzd = 0;
    }
    else
    {
      i = this.zza.zzm();
      this.zzb = i;
    }
    if ((i != 0) && (i != this.zzc)) {
      return i >>> 3;
    }
    return Integer.MAX_VALUE;
  }
  
  public final int zzd()
  {
    return this.zzb;
  }
  
  public final int zze()
    throws IOException
  {
    zzS(0);
    return this.zza.zzf();
  }
  
  public final int zzf()
    throws IOException
  {
    zzS(5);
    return this.zza.zzg();
  }
  
  public final int zzg()
    throws IOException
  {
    zzS(0);
    return this.zza.zzh();
  }
  
  public final int zzh()
    throws IOException
  {
    zzS(5);
    return this.zza.zzk();
  }
  
  public final int zzi()
    throws IOException
  {
    zzS(0);
    return this.zza.zzl();
  }
  
  public final int zzj()
    throws IOException
  {
    zzS(0);
    return this.zza.zzn();
  }
  
  public final long zzk()
    throws IOException
  {
    zzS(1);
    return this.zza.zzo();
  }
  
  public final long zzl()
    throws IOException
  {
    zzS(0);
    return this.zza.zzp();
  }
  
  public final long zzm()
    throws IOException
  {
    zzS(1);
    return this.zza.zzt();
  }
  
  public final long zzn()
    throws IOException
  {
    zzS(0);
    return this.zza.zzu();
  }
  
  public final long zzo()
    throws IOException
  {
    zzS(0);
    return this.zza.zzv();
  }
  
  public final zzgno zzp()
    throws IOException
  {
    zzS(2);
    return this.zza.zzw();
  }
  
  public final String zzr()
    throws IOException
  {
    zzS(2);
    return this.zza.zzx();
  }
  
  public final String zzs()
    throws IOException
  {
    zzS(2);
    return this.zza.zzy();
  }
  
  public final void zzt(Object paramObject, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    zzS(3);
    zzP(paramObject, paramzzgqz, paramzzgoi);
  }
  
  public final void zzu(Object paramObject, zzgqz paramzzgqz, zzgoi paramzzgoi)
    throws IOException
  {
    zzS(2);
    zzQ(paramObject, paramzzgqz, paramzzgoi);
  }
  
  public final void zzv(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgnc))
    {
      paramList = (zzgnc)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zze(this.zza.zzD());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zze(this.zza.zzD());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Boolean.valueOf(this.zza.zzD()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Boolean.valueOf(this.zza.zzD()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzw(List paramList)
    throws IOException
  {
    if ((this.zzb & 0x7) == 2)
    {
      int i;
      do
      {
        paramList.add(zzp());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    throw zzgpi.zza();
  }
  
  public final void zzx(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgof))
    {
      paramList = (zzgof)paramList;
      i = this.zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          zzU(i);
          j = this.zza.zzd();
          do
          {
            paramList.zze(this.zza.zzb());
          } while (this.zza.zzd() < j + i);
        }
        else
        {
          throw zzgpi.zza();
        }
      }
      else
      {
        do
        {
          paramList.zze(this.zza.zzb());
          if (this.zza.zzC()) {
            return;
          }
          i = this.zza.zzm();
        } while (i == this.zzb);
        this.zzd = i;
      }
    }
    else
    {
      i = this.zzb & 0x7;
      if (i == 1) {
        break label198;
      }
      if (i != 2) {
        break label194;
      }
      j = this.zza.zzn();
      zzU(j);
      i = this.zza.zzd();
      do
      {
        paramList.add(Double.valueOf(this.zza.zzb()));
      } while (this.zza.zzd() < i + j);
    }
    return;
    label194:
    throw zzgpi.zza();
    label198:
    do
    {
      paramList.add(Double.valueOf(this.zza.zzb()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzy(List paramList)
    throws IOException
  {
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = this.zza.zzn();
          i = this.zza.zzd() + i;
          do
          {
            paramList.zzh(this.zza.zzf());
          } while (this.zza.zzd() < i);
          zzR(i);
          return;
        }
        throw zzgpi.zza();
      }
      do
      {
        paramList.zzh(this.zza.zzf());
        if (this.zza.zzC()) {
          return;
        }
        i = this.zza.zzm();
      } while (i == this.zzb);
      this.zzd = i;
      return;
    }
    int i = this.zzb & 0x7;
    if (i != 0)
    {
      if (i == 2)
      {
        i = this.zza.zzn();
        i = this.zza.zzd() + i;
        do
        {
          paramList.add(Integer.valueOf(this.zza.zzf()));
        } while (this.zza.zzd() < i);
        zzR(i);
        return;
      }
      throw zzgpi.zza();
    }
    do
    {
      paramList.add(Integer.valueOf(this.zza.zzf()));
      if (this.zza.zzC()) {
        return;
      }
      i = this.zza.zzm();
    } while (i == this.zzb);
    this.zzd = i;
  }
  
  public final void zzz(List paramList)
    throws IOException
  {
    int i;
    int j;
    if ((paramList instanceof zzgox))
    {
      paramList = (zzgox)paramList;
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.zzh(this.zza.zzg());
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      i = this.zza.zzn();
      zzT(i);
      j = this.zza.zzd();
      do
      {
        paramList.zzh(this.zza.zzg());
      } while (this.zza.zzd() < j + i);
    }
    else
    {
      i = this.zzb & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(this.zza.zzg()));
            if (this.zza.zzC()) {
              return;
            }
            i = this.zza.zzm();
          } while (i == this.zzb);
          this.zzd = i;
          return;
        }
        throw zzgpi.zza();
      }
      i = this.zza.zzn();
      zzT(i);
      j = this.zza.zzd();
      do
      {
        paramList.add(Integer.valueOf(this.zza.zzg()));
      } while (this.zza.zzd() < j + i);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */