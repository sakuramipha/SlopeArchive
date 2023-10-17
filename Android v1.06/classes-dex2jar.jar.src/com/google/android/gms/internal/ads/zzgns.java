package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzgns
  extends zzgnw
{
  private final Iterable zze;
  private final Iterator zzf;
  private ByteBuffer zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private int zzk;
  private int zzl;
  private long zzm;
  private long zzn;
  private long zzo;
  
  private final int zzJ()
  {
    return (int)(this.zzh - this.zzl - this.zzm + this.zzn);
  }
  
  private final void zzK()
    throws zzgpi
  {
    if (this.zzf.hasNext())
    {
      zzN();
      return;
    }
    throw zzgpi.zzj();
  }
  
  private final void zzL(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 <= zzJ())
    {
      paramInt1 = paramInt2;
      while (paramInt1 > 0)
      {
        if (this.zzo - this.zzm == 0L) {
          zzK();
        }
        int i = Math.min(paramInt1, (int)(this.zzo - this.zzm));
        long l1 = this.zzm;
        long l2 = i;
        zzgsa.zzo(l1, paramArrayOfByte, paramInt2 - paramInt1, l2);
        paramInt1 -= i;
        this.zzm += l2;
      }
      return;
    }
    if (paramInt2 <= 0) {
      return;
    }
    throw zzgpi.zzj();
  }
  
  private final void zzM()
  {
    int i = this.zzh + this.zzi;
    this.zzh = i;
    int j = this.zzj;
    if (i > j)
    {
      j = i - j;
      this.zzi = j;
      this.zzh = (i - j);
      return;
    }
    this.zzi = 0;
  }
  
  private final void zzN()
  {
    ByteBuffer localByteBuffer = (ByteBuffer)this.zzf.next();
    this.zzg = localByteBuffer;
    this.zzl += (int)(this.zzm - this.zzn);
    long l = localByteBuffer.position();
    this.zzm = l;
    this.zzn = l;
    this.zzo = this.zzg.limit();
    l = zzgsa.zze(this.zzg);
    this.zzm += l;
    this.zzn += l;
    this.zzo += l;
  }
  
  public final void zzA(int paramInt)
  {
    this.zzj = paramInt;
    zzM();
  }
  
  public final void zzB(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      int i = this.zzh;
      int j = this.zzl;
      long l1 = this.zzm;
      long l3 = i - j;
      long l2 = this.zzn;
      if (paramInt <= l3 - l1 + l2)
      {
        while (paramInt > 0)
        {
          if (this.zzo - this.zzm == 0L) {
            zzK();
          }
          i = Math.min(paramInt, (int)(this.zzo - this.zzm));
          paramInt -= i;
          this.zzm += i;
        }
        return;
      }
    }
    if (paramInt < 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final boolean zzC()
    throws IOException
  {
    return this.zzl + this.zzm - this.zzn == this.zzh;
  }
  
  public final boolean zzD()
    throws IOException
  {
    return zzr() != 0L;
  }
  
  public final boolean zzE(int paramInt)
    throws IOException
  {
    int j = paramInt & 0x7;
    int i = 0;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j == 5)
              {
                zzB(4);
                return true;
              }
              throw zzgpi.zza();
            }
            return false;
          }
          do
          {
            i = zzm();
          } while ((i != 0) && (zzE(i)));
          zzz(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        zzB(zzj());
        return true;
      }
      zzB(8);
      return true;
    }
    while (i < 10)
    {
      if (zza() >= 0) {
        return true;
      }
      i++;
    }
    throw zzgpi.zze();
  }
  
  public final byte zza()
    throws IOException
  {
    if (this.zzo - this.zzm == 0L) {
      zzK();
    }
    long l = this.zzm;
    this.zzm = (1L + l);
    return zzgsa.zza(l);
  }
  
  public final double zzb()
    throws IOException
  {
    return Double.longBitsToDouble(zzq());
  }
  
  public final float zzc()
    throws IOException
  {
    return Float.intBitsToFloat(zzi());
  }
  
  public final int zzd()
  {
    return (int)(this.zzl + this.zzm - this.zzn);
  }
  
  public final int zze(int paramInt)
    throws zzgpi
  {
    if (paramInt >= 0)
    {
      int i = paramInt + zzd();
      paramInt = this.zzj;
      if (i <= paramInt)
      {
        this.zzj = i;
        zzM();
        return paramInt;
      }
      throw zzgpi.zzj();
    }
    throw zzgpi.zzf();
  }
  
  public final int zzf()
    throws IOException
  {
    return zzj();
  }
  
  public final int zzg()
    throws IOException
  {
    return zzi();
  }
  
  public final int zzh()
    throws IOException
  {
    return zzj();
  }
  
  public final int zzi()
    throws IOException
  {
    long l2 = this.zzo;
    long l1 = this.zzm;
    if (l2 - l1 >= 4L)
    {
      this.zzm = (4L + l1);
      return zzgsa.zza(l1) & 0xFF | (zzgsa.zza(1L + l1) & 0xFF) << 8 | (zzgsa.zza(2L + l1) & 0xFF) << 16 | (zzgsa.zza(l1 + 3L) & 0xFF) << 24;
    }
    return zza() & 0xFF | (zza() & 0xFF) << 8 | (zza() & 0xFF) << 16 | (zza() & 0xFF) << 24;
  }
  
  public final int zzj()
    throws IOException
  {
    long l2 = this.zzm;
    if (this.zzo != l2)
    {
      long l1 = l2 + 1L;
      int i = zzgsa.zza(l2);
      if (i >= 0)
      {
        this.zzm += 1L;
        return i;
      }
      if (this.zzo - this.zzm >= 10L)
      {
        l2 = l1 + 1L;
        i ^= zzgsa.zza(l1) << 7;
        if (i < 0)
        {
          i ^= 0xFFFFFF80;
          l1 = l2;
        }
        else
        {
          l1 = l2 + 1L;
          i ^= zzgsa.zza(l2) << 14;
          if (i >= 0) {
            i ^= 0x3F80;
          }
          for (;;)
          {
            break;
            long l3 = l1 + 1L;
            i ^= zzgsa.zza(l1) << 21;
            if (i < 0)
            {
              i ^= 0xFFE03F80;
              l1 = l3;
            }
            else
            {
              l2 = l3 + 1L;
              int k = zzgsa.zza(l3);
              int j = i ^ k << 28 ^ 0xFE03F80;
              i = j;
              l1 = l2;
              if (k < 0)
              {
                l3 = l2 + 1L;
                i = j;
                l1 = l3;
                if (zzgsa.zza(l2) < 0)
                {
                  l2 = l3 + 1L;
                  i = j;
                  l1 = l2;
                  if (zzgsa.zza(l3) < 0)
                  {
                    l3 = l2 + 1L;
                    i = j;
                    l1 = l3;
                    if (zzgsa.zza(l2) < 0)
                    {
                      l2 = l3 + 1L;
                      i = j;
                      l1 = l2;
                      if (zzgsa.zza(l3) < 0)
                      {
                        l1 = l2 + 1L;
                        if (zzgsa.zza(l2) < 0) {
                          break label295;
                        }
                        i = j;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.zzm = l1;
        return i;
      }
    }
    label295:
    return (int)zzs();
  }
  
  public final int zzk()
    throws IOException
  {
    return zzi();
  }
  
  public final int zzl()
    throws IOException
  {
    return zzF(zzj());
  }
  
  public final int zzm()
    throws IOException
  {
    if (zzC())
    {
      this.zzk = 0;
      return 0;
    }
    int i = zzj();
    this.zzk = i;
    if (i >>> 3 != 0) {
      return i;
    }
    throw zzgpi.zzc();
  }
  
  public final int zzn()
    throws IOException
  {
    return zzj();
  }
  
  public final long zzo()
    throws IOException
  {
    return zzq();
  }
  
  public final long zzp()
    throws IOException
  {
    return zzr();
  }
  
  public final long zzq()
    throws IOException
  {
    long l2 = this.zzo;
    long l1 = this.zzm;
    if (l2 - l1 >= 8L)
    {
      this.zzm = (8L + l1);
      return zzgsa.zza(l1) & 0xFF | (zzgsa.zza(1L + l1) & 0xFF) << 8 | (zzgsa.zza(l1 + 2L) & 0xFF) << 16 | (zzgsa.zza(l1 + 3L) & 0xFF) << 24 | (zzgsa.zza(4L + l1) & 0xFF) << 32 | (zzgsa.zza(l1 + 5L) & 0xFF) << 40 | (zzgsa.zza(l1 + 6L) & 0xFF) << 48 | (zzgsa.zza(l1 + 7L) & 0xFF) << 56;
    }
    return zza() & 0xFF | (zza() & 0xFF) << 8 | (zza() & 0xFF) << 16 | (zza() & 0xFF) << 24 | (zza() & 0xFF) << 32 | (zza() & 0xFF) << 40 | (zza() & 0xFF) << 48 | (zza() & 0xFF) << 56;
  }
  
  public final long zzr()
    throws IOException
  {
    long l1 = this.zzm;
    if (this.zzo != l1)
    {
      long l2 = l1 + 1L;
      int i = zzgsa.zza(l1);
      if (i >= 0)
      {
        this.zzm += 1L;
        return i;
      }
      if (this.zzo - this.zzm >= 10L)
      {
        l1 = l2 + 1L;
        i ^= zzgsa.zza(l2) << 7;
        if (i < 0)
        {
          i ^= 0xFFFFFF80;
          l2 = l1;
          l1 = i;
        }
        else
        {
          l2 = l1 + 1L;
          i ^= zzgsa.zza(l1) << 14;
          if (i >= 0) {
            l1 = i ^ 0x3F80;
          }
          for (;;)
          {
            break label378;
            l1 = l2 + 1L;
            i ^= zzgsa.zza(l2) << 21;
            if (i < 0)
            {
              i ^= 0xFFE03F80;
              l2 = l1;
              break;
            }
            l2 = l1 + 1L;
            l1 = zzgsa.zza(l1);
            l1 = i ^ l1 << 28;
            long l3;
            if (l1 >= 0L)
            {
              l3 = 266354560L;
              l1 ^= l3;
            }
            else
            {
              l3 = l2 + 1L;
              long l4 = l1 ^ zzgsa.zza(l2) << 35;
              if (l4 < 0L)
              {
                l2 = -34093383808L;
                l1 = l3;
                l3 = l2;
                l2 = l4;
              }
              for (;;)
              {
                l3 = l2 ^ l3;
                l2 = l1;
                l1 = l3;
                break label378;
                l2 = l3 + 1L;
                l4 ^= zzgsa.zza(l3) << 42;
                if (l4 >= 0L)
                {
                  l3 = 4363953127296L;
                  l1 = l4;
                  break;
                }
                l1 = l2 + 1L;
                l2 = l4 ^ zzgsa.zza(l2) << 49;
                if (l2 >= 0L) {
                  break label322;
                }
                l3 = -558586000294016L;
              }
              label322:
              l4 = l1 + 1L;
              l3 = l2 ^ zzgsa.zza(l1) << 56 ^ 0xFE03F80FE03F80;
              l1 = l3;
              l2 = l4;
              if (l3 < 0L)
              {
                if (zzgsa.zza(l4) < 0L) {
                  break label386;
                }
                l2 = 1L + l4;
                l1 = l3;
              }
            }
          }
        }
        label378:
        this.zzm = l2;
        return l1;
      }
    }
    label386:
    return zzs();
  }
  
  final long zzs()
    throws IOException
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = zza();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw zzgpi.zze();
  }
  
  public final long zzt()
    throws IOException
  {
    return zzq();
  }
  
  public final long zzu()
    throws IOException
  {
    return zzG(zzr());
  }
  
  public final long zzv()
    throws IOException
  {
    return zzr();
  }
  
  public final zzgno zzw()
    throws IOException
  {
    int i = zzj();
    byte[] arrayOfByte;
    if (i > 0)
    {
      long l1 = this.zzo;
      long l3 = this.zzm;
      long l2 = i;
      if (l2 <= l1 - l3)
      {
        arrayOfByte = new byte[i];
        zzgsa.zzo(l3, arrayOfByte, 0L, l2);
        this.zzm += l2;
        return new zzgnk(arrayOfByte);
      }
    }
    if ((i > 0) && (i <= zzJ()))
    {
      arrayOfByte = new byte[i];
      zzL(arrayOfByte, 0, i);
      return new zzgnk(arrayOfByte);
    }
    if (i == 0) {
      return zzgno.zzb;
    }
    if (i < 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final String zzx()
    throws IOException
  {
    int i = zzj();
    Object localObject;
    if (i > 0)
    {
      long l1 = this.zzo;
      long l2 = this.zzm;
      long l3 = i;
      if (l3 <= l1 - l2)
      {
        localObject = new byte[i];
        zzgsa.zzo(l2, (byte[])localObject, 0L, l3);
        localObject = new String((byte[])localObject, zzgpg.zzb);
        this.zzm += l3;
        return (String)localObject;
      }
    }
    if ((i > 0) && (i <= zzJ()))
    {
      localObject = new byte[i];
      zzL((byte[])localObject, 0, i);
      return new String((byte[])localObject, zzgpg.zzb);
    }
    if (i == 0) {
      return "";
    }
    if (i < 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final String zzy()
    throws IOException
  {
    int i = zzj();
    Object localObject;
    if (i > 0)
    {
      long l3 = this.zzo;
      long l1 = this.zzm;
      long l2 = i;
      if (l2 <= l3 - l1)
      {
        l3 = this.zzn;
        localObject = zzgsf.zzg(this.zzg, (int)(l1 - l3), i);
        this.zzm += l2;
        return (String)localObject;
      }
    }
    if ((i >= 0) && (i <= zzJ()))
    {
      localObject = new byte[i];
      zzL((byte[])localObject, 0, i);
      return zzgsf.zzh((byte[])localObject, 0, i);
    }
    if (i == 0) {
      return "";
    }
    if (i <= 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final void zzz(int paramInt)
    throws zzgpi
  {
    if (this.zzk == paramInt) {
      return;
    }
    throw zzgpi.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */