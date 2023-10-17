package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzgnu
  extends zzgnw
{
  private final InputStream zze;
  private final byte[] zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private int zzk;
  private int zzl;
  
  private final List zzJ(int paramInt)
    throws IOException
  {
    ArrayList localArrayList = new ArrayList();
    while (paramInt > 0)
    {
      int j = Math.min(paramInt, 4096);
      byte[] arrayOfByte = new byte[j];
      int i = 0;
      while (i < j)
      {
        int k = this.zze.read(arrayOfByte, i, j - i);
        if (k != -1)
        {
          this.zzk += k;
          i += k;
        }
        else
        {
          throw zzgpi.zzj();
        }
      }
      paramInt -= j;
      localArrayList.add(arrayOfByte);
    }
    return localArrayList;
  }
  
  private final void zzK()
  {
    int i = this.zzg + this.zzh;
    this.zzg = i;
    int k = this.zzk + i;
    int j = this.zzl;
    if (k > j)
    {
      j = k - j;
      this.zzh = j;
      this.zzg = (i - j);
      return;
    }
    this.zzh = 0;
  }
  
  private final void zzL(int paramInt)
    throws IOException
  {
    if (!zzM(paramInt))
    {
      if (paramInt > Integer.MAX_VALUE - this.zzk - this.zzi) {
        throw zzgpi.zzi();
      }
      throw zzgpi.zzj();
    }
  }
  
  private final boolean zzM(int paramInt)
    throws IOException
  {
    int m = this.zzi;
    int k = this.zzg;
    if (m + paramInt > k)
    {
      int j = this.zzk;
      if (paramInt > Integer.MAX_VALUE - j - m) {
        return false;
      }
      if (j + m + paramInt > this.zzl) {
        return false;
      }
      int i = k;
      if (m > 0)
      {
        if (k > m)
        {
          localObject1 = this.zzf;
          System.arraycopy(localObject1, m, localObject1, 0, k - m);
        }
        j = this.zzk + m;
        this.zzk = j;
        i = this.zzg - m;
        this.zzg = i;
        this.zzi = 0;
      }
      Object localObject2 = this.zze;
      Object localObject1 = this.zzf;
      j = Math.min(4096 - i, Integer.MAX_VALUE - j - i);
      try
      {
        i = ((InputStream)localObject2).read((byte[])localObject1, i, j);
        if ((i != 0) && (i >= -1) && (i <= 4096))
        {
          if (i > 0)
          {
            this.zzg += i;
            zzK();
            if (this.zzg >= paramInt) {
              return true;
            }
            return zzM(paramInt);
          }
          return false;
        }
        localObject2 = String.valueOf(this.zze.getClass());
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append("#read(byte[]) returned invalid result: ");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
      catch (zzgpi localzzgpi)
      {
        localzzgpi.zzk();
        throw localzzgpi;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("refillBuffer() called when ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" bytes were already available in buffer");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private final byte[] zzN(int paramInt, boolean paramBoolean)
    throws IOException
  {
    byte[] arrayOfByte1 = zzO(paramInt);
    if (arrayOfByte1 != null) {
      return arrayOfByte1;
    }
    int j = this.zzi;
    int k = this.zzg;
    int i = k - j;
    this.zzk += k;
    this.zzi = 0;
    this.zzg = 0;
    Object localObject = zzJ(paramInt - i);
    arrayOfByte1 = new byte[paramInt];
    System.arraycopy(this.zzf, j, arrayOfByte1, 0, i);
    localObject = ((List)localObject).iterator();
    paramInt = i;
    while (((Iterator)localObject).hasNext())
    {
      byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
      i = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, i);
      paramInt += i;
    }
    return arrayOfByte1;
  }
  
  private final byte[] zzO(int paramInt)
    throws IOException
  {
    if (paramInt == 0) {
      return zzgpg.zzd;
    }
    if (paramInt >= 0)
    {
      int j = this.zzk;
      int i = this.zzi;
      int k = j + i + paramInt;
      if (-2147483647 + k <= 0)
      {
        int m = this.zzl;
        if (k <= m)
        {
          i = this.zzg - i;
          j = paramInt - i;
          if (j >= 4096)
          {
            InputStream localInputStream1 = this.zze;
            try
            {
              k = localInputStream1.available();
              if (j > k) {
                return null;
              }
            }
            catch (zzgpi localzzgpi1)
            {
              localzzgpi1.zzk();
              throw localzzgpi1;
            }
          }
          byte[] arrayOfByte = new byte[paramInt];
          System.arraycopy(this.zzf, this.zzi, arrayOfByte, 0, i);
          this.zzk += this.zzg;
          this.zzi = 0;
          this.zzg = 0;
          while (i < paramInt)
          {
            InputStream localInputStream2 = this.zze;
            try
            {
              j = localInputStream2.read(arrayOfByte, i, paramInt - i);
              if (j != -1)
              {
                this.zzk += j;
                i += j;
              }
              else
              {
                throw zzgpi.zzj();
              }
            }
            catch (zzgpi localzzgpi2)
            {
              localzzgpi2.zzk();
              throw localzzgpi2;
            }
          }
          return localzzgpi2;
        }
        zzB(m - j - i);
        throw zzgpi.zzj();
      }
      throw zzgpi.zzi();
    }
    throw zzgpi.zzf();
  }
  
  public final void zzA(int paramInt)
  {
    this.zzl = paramInt;
    zzK();
  }
  
  public final void zzB(int paramInt)
    throws IOException
  {
    int i = this.zzg;
    int j = this.zzi;
    i -= j;
    if ((paramInt <= i) && (paramInt >= 0))
    {
      this.zzi = (j + paramInt);
      return;
    }
    if (paramInt >= 0)
    {
      int m = this.zzk;
      int n = m + j;
      int i1 = this.zzl;
      int k;
      if (n + paramInt <= i1)
      {
        this.zzk = n;
        this.zzg = 0;
        this.zzi = 0;
        while (i < paramInt) {
          try
          {
            Object localObject1 = this.zze;
            long l1 = paramInt - i;
            try
            {
              long l2 = ((InputStream)localObject1).skip(l1);
              boolean bool = l2 < 0L;
              if ((!bool) && (l2 <= l1))
              {
                if (bool) {
                  i += (int)l2;
                }
              }
              else
              {
                IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
                String str = String.valueOf(this.zze.getClass());
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                ((StringBuilder)localObject1).append(str);
                ((StringBuilder)localObject1).append("#skip returned invalid result: ");
                ((StringBuilder)localObject1).append(l2);
                ((StringBuilder)localObject1).append("\nThe InputStream implementation is buggy.");
                localIllegalStateException.<init>(((StringBuilder)localObject1).toString());
                throw localIllegalStateException;
              }
            }
            catch (zzgpi localzzgpi)
            {
              localzzgpi.zzk();
              throw localzzgpi;
            }
            this.zzk += i;
          }
          finally
          {
            this.zzk += i;
            zzK();
          }
        }
        zzK();
        if (i < paramInt)
        {
          k = this.zzg;
          i = k - this.zzi;
          this.zzi = k;
          zzL(1);
          for (;;)
          {
            m = paramInt - i;
            k = this.zzg;
            if (m <= k) {
              break;
            }
            i += k;
            this.zzi = k;
            zzL(1);
          }
          this.zzi = m;
        }
        return;
      }
      zzB(i1 - m - k);
      throw zzgpi.zzj();
    }
    throw zzgpi.zzf();
  }
  
  public final boolean zzC()
    throws IOException
  {
    return (this.zzi == this.zzg) && (!zzM(1));
  }
  
  public final boolean zzD()
    throws IOException
  {
    return zzr() != 0L;
  }
  
  public final boolean zzE(int paramInt)
    throws IOException
  {
    int k = paramInt & 0x7;
    int j = 0;
    int i = 0;
    if (k != 0)
    {
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k == 5)
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
    paramInt = j;
    if (this.zzg - this.zzi >= 10)
    {
      for (paramInt = i; paramInt < 10; paramInt++)
      {
        byte[] arrayOfByte = this.zzf;
        i = this.zzi;
        this.zzi = (i + 1);
        if (arrayOfByte[i] >= 0) {
          break label187;
        }
      }
      throw zzgpi.zze();
    }
    for (;;)
    {
      if (paramInt >= 10) {
        break label189;
      }
      if (zza() >= 0) {
        break;
      }
      paramInt++;
    }
    label187:
    return true;
    label189:
    throw zzgpi.zze();
  }
  
  public final byte zza()
    throws IOException
  {
    if (this.zzi == this.zzg) {
      zzL(1);
    }
    byte[] arrayOfByte = this.zzf;
    int i = this.zzi;
    this.zzi = (i + 1);
    return arrayOfByte[i];
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
    return this.zzk + this.zzi;
  }
  
  public final int zze(int paramInt)
    throws zzgpi
  {
    if (paramInt >= 0)
    {
      int k = this.zzk;
      int j = this.zzi;
      int i = this.zzl;
      paramInt += k + j;
      if (paramInt <= i)
      {
        this.zzl = paramInt;
        zzK();
        return i;
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
    int j = this.zzi;
    int i = j;
    if (this.zzg - j < 4)
    {
      zzL(4);
      i = this.zzi;
    }
    byte[] arrayOfByte = this.zzf;
    this.zzi = (i + 4);
    j = arrayOfByte[i];
    int k = arrayOfByte[(i + 1)];
    int m = arrayOfByte[(i + 2)];
    return (arrayOfByte[(i + 3)] & 0xFF) << 24 | (k & 0xFF) << 8 | j & 0xFF | (m & 0xFF) << 16;
  }
  
  public final int zzj()
    throws IOException
  {
    int k = this.zzi;
    int i = this.zzg;
    if (i != k)
    {
      byte[] arrayOfByte = this.zzf;
      int j = k + 1;
      k = arrayOfByte[k];
      if (k >= 0)
      {
        this.zzi = j;
        return k;
      }
      if (i - j >= 9)
      {
        i = j + 1;
        k ^= arrayOfByte[j] << 7;
        if (k < 0)
        {
          j = k ^ 0xFFFFFF80;
        }
        else
        {
          j = i + 1;
          k ^= arrayOfByte[i] << 14;
          if (k >= 0)
          {
            k ^= 0x3F80;
            i = j;
            j = k;
          }
          for (;;)
          {
            break;
            i = j + 1;
            j = k ^ arrayOfByte[j] << 21;
            if (j < 0)
            {
              j ^= 0xFFE03F80;
            }
            else
            {
              int m = i + 1;
              int n = arrayOfByte[i];
              k = j ^ n << 28 ^ 0xFE03F80;
              j = k;
              i = m;
              if (n < 0)
              {
                n = m + 1;
                j = k;
                i = n;
                if (arrayOfByte[m] < 0)
                {
                  m = n + 1;
                  j = k;
                  i = m;
                  if (arrayOfByte[n] < 0)
                  {
                    n = m + 1;
                    j = k;
                    i = n;
                    if (arrayOfByte[m] < 0)
                    {
                      m = n + 1;
                      j = k;
                      i = m;
                      if (arrayOfByte[n] < 0)
                      {
                        i = m + 1;
                        j = k;
                        if (arrayOfByte[m] < 0) {
                          break label268;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.zzi = i;
        return j;
      }
    }
    label268:
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
      this.zzj = 0;
      return 0;
    }
    int i = zzj();
    this.zzj = i;
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
    int j = this.zzi;
    int i = j;
    if (this.zzg - j < 8)
    {
      zzL(8);
      i = this.zzi;
    }
    byte[] arrayOfByte = this.zzf;
    this.zzi = (i + 8);
    long l6 = arrayOfByte[i];
    long l7 = arrayOfByte[(i + 1)];
    long l3 = arrayOfByte[(i + 2)];
    long l5 = arrayOfByte[(i + 3)];
    long l1 = arrayOfByte[(i + 4)];
    long l2 = arrayOfByte[(i + 5)];
    long l4 = arrayOfByte[(i + 6)];
    return (arrayOfByte[(i + 7)] & 0xFF) << 56 | l6 & 0xFF | (l7 & 0xFF) << 8 | (l3 & 0xFF) << 16 | (l5 & 0xFF) << 24 | (l1 & 0xFF) << 32 | (l2 & 0xFF) << 40 | (l4 & 0xFF) << 48;
  }
  
  public final long zzr()
    throws IOException
  {
    int k = this.zzi;
    int i = this.zzg;
    if (i != k)
    {
      byte[] arrayOfByte = this.zzf;
      int j = k + 1;
      k = arrayOfByte[k];
      if (k >= 0)
      {
        this.zzi = j;
        return k;
      }
      if (i - j >= 9)
      {
        i = j + 1;
        k ^= arrayOfByte[j] << 7;
        long l1;
        if (k < 0)
        {
          j = k ^ 0xFFFFFF80;
          l1 = j;
        }
        else
        {
          j = i + 1;
          k ^= arrayOfByte[i] << 14;
          if (k >= 0)
          {
            l1 = k ^ 0x3F80;
            i = j;
          }
          for (;;)
          {
            break label345;
            i = j + 1;
            k ^= arrayOfByte[j] << 21;
            if (k < 0)
            {
              j = k ^ 0xFFE03F80;
              break;
            }
            j = i + 1;
            l1 = arrayOfByte[i];
            long l2 = k ^ l1 << 28;
            if (l2 >= 0L)
            {
              l1 = 266354560L;
              i = j;
              label175:
              l1 = l2 ^ l1;
            }
            else
            {
              i = j + 1;
              l1 = l2 ^ arrayOfByte[j] << 35;
              if (l1 < 0L) {
                l2 = -34093383808L;
              }
              label214:
              for (l1 = l2 ^ l1;; l1 = l2)
              {
                break;
                j = i + 1;
                l2 = l1 ^ arrayOfByte[i] << 42;
                if (l2 >= 0L)
                {
                  l1 = 4363953127296L;
                  i = j;
                  break label175;
                }
                i = j + 1;
                l1 = l2 ^ arrayOfByte[j] << 49;
                if (l1 < 0L)
                {
                  l2 = -558586000294016L;
                  break label214;
                }
                j = i + 1;
                l2 = l1 ^ arrayOfByte[i] << 56 ^ 0xFE03F80FE03F80;
                l1 = l2;
                i = j;
                if (l2 >= 0L) {
                  break;
                }
                i = j + 1;
                if (arrayOfByte[j] < 0L) {
                  break label353;
                }
              }
            }
          }
        }
        label345:
        this.zzi = i;
        return l1;
      }
    }
    label353:
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
    int j = zzj();
    int i = this.zzg;
    int k = this.zzi;
    Object localObject1;
    if ((j <= i - k) && (j > 0))
    {
      localObject1 = zzgno.zzv(this.zzf, k, j);
      this.zzi += j;
      return (zzgno)localObject1;
    }
    if (j != 0)
    {
      localObject1 = zzO(j);
      if (localObject1 != null)
      {
        localObject1 = zzgno.zzv((byte[])localObject1, 0, localObject1.length);
      }
      else
      {
        int m = this.zzi;
        k = this.zzg;
        i = k - m;
        this.zzk += k;
        this.zzi = 0;
        this.zzg = 0;
        Object localObject2 = zzJ(j - i);
        localObject1 = new byte[j];
        System.arraycopy(this.zzf, m, localObject1, 0, i);
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          byte[] arrayOfByte = (byte[])((Iterator)localObject2).next();
          j = arrayOfByte.length;
          System.arraycopy(arrayOfByte, 0, localObject1, i, j);
          i += j;
        }
        localObject1 = new zzgnk((byte[])localObject1);
      }
      return (zzgno)localObject1;
    }
    return zzgno.zzb;
  }
  
  public final String zzx()
    throws IOException
  {
    int i = zzj();
    String str;
    if (i > 0)
    {
      int k = this.zzg;
      int j = this.zzi;
      if (i <= k - j)
      {
        str = new String(this.zzf, j, i, zzgpg.zzb);
        this.zzi += i;
        return str;
      }
    }
    if (i == 0) {
      return "";
    }
    if (i <= this.zzg)
    {
      zzL(i);
      str = new String(this.zzf, this.zzi, i, zzgpg.zzb);
      this.zzi += i;
      return str;
    }
    return new String(zzN(i, false), zzgpg.zzb);
  }
  
  public final String zzy()
    throws IOException
  {
    int j = zzj();
    int i = this.zzi;
    int k = this.zzg;
    byte[] arrayOfByte;
    if ((j <= k - i) && (j > 0))
    {
      arrayOfByte = this.zzf;
      this.zzi = (i + j);
    }
    else
    {
      if (j == 0) {
        return "";
      }
      if (j <= k)
      {
        zzL(j);
        arrayOfByte = this.zzf;
        this.zzi = j;
      }
      else
      {
        arrayOfByte = zzN(j, false);
      }
      i = 0;
    }
    return zzgsf.zzh(arrayOfByte, i, j);
  }
  
  public final void zzz(int paramInt)
    throws zzgpi
  {
    if (this.zzj == paramInt) {
      return;
    }
    throw zzgpi.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */