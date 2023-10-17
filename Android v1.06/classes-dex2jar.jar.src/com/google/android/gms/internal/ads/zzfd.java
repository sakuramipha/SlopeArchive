package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzfd
{
  private static final zzfrw zza = zzfrw.zzo(zzfol.zza, zzfol.zzc, zzfol.zzf, zzfol.zzd, zzfol.zze);
  private byte[] zzb;
  private int zzc;
  private int zzd;
  
  public zzfd()
  {
    this.zzb = zzfn.zzf;
  }
  
  public zzfd(int paramInt)
  {
    this.zzb = new byte[paramInt];
    this.zzd = paramInt;
  }
  
  public zzfd(byte[] paramArrayOfByte)
  {
    this.zzb = paramArrayOfByte;
    this.zzd = paramArrayOfByte.length;
  }
  
  public zzfd(byte[] paramArrayOfByte, int paramInt)
  {
    this.zzb = paramArrayOfByte;
    this.zzd = paramInt;
  }
  
  public final void zzA(zzfc paramzzfc, int paramInt)
  {
    zzB(paramzzfc.zza, 0, paramInt);
    paramzzfc.zzj(0);
  }
  
  public final void zzB(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(this.zzb, this.zzc, paramArrayOfByte, paramInt1, paramInt2);
    this.zzc += paramInt2;
  }
  
  public final void zzC(int paramInt)
  {
    byte[] arrayOfByte2 = this.zzb;
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2.length < paramInt) {
      arrayOfByte1 = new byte[paramInt];
    }
    zzD(arrayOfByte1, paramInt);
  }
  
  public final void zzD(byte[] paramArrayOfByte, int paramInt)
  {
    this.zzb = paramArrayOfByte;
    this.zzd = paramInt;
    this.zzc = 0;
  }
  
  public final void zzE(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      if (paramInt <= this.zzb.length) {
        bool1 = true;
      }
    }
    zzdy.zzd(bool1);
    this.zzd = paramInt;
  }
  
  public final void zzF(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      if (paramInt <= this.zzd) {
        bool1 = true;
      }
    }
    zzdy.zzd(bool1);
    this.zzc = paramInt;
  }
  
  public final void zzG(int paramInt)
  {
    zzF(this.zzc + paramInt);
  }
  
  public final byte[] zzH()
  {
    return this.zzb;
  }
  
  public final int zza()
  {
    return this.zzd - this.zzc;
  }
  
  public final int zzb()
  {
    return this.zzb.length;
  }
  
  public final int zzc()
  {
    return this.zzc;
  }
  
  public final int zzd()
  {
    return this.zzd;
  }
  
  public final int zze()
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    int k = i + 1;
    this.zzc = k;
    i = arrayOfByte[i];
    int j = k + 1;
    this.zzc = j;
    k = arrayOfByte[k];
    int m = j + 1;
    this.zzc = m;
    j = arrayOfByte[j];
    this.zzc = (m + 1);
    return arrayOfByte[m] & 0xFF | (i & 0xFF) << 24 | (k & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public final int zzf()
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    int k = i + 1;
    this.zzc = k;
    int j = arrayOfByte[i];
    i = k + 1;
    this.zzc = i;
    k = arrayOfByte[k];
    this.zzc = (i + 1);
    return arrayOfByte[i] & 0xFF | (j & 0xFF) << 24 >> 8 | (k & 0xFF) << 8;
  }
  
  public final int zzg()
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    int j = i + 1;
    this.zzc = j;
    i = arrayOfByte[i];
    int m = j + 1;
    this.zzc = m;
    j = arrayOfByte[j];
    int k = m + 1;
    this.zzc = k;
    m = arrayOfByte[m];
    this.zzc = (k + 1);
    return (arrayOfByte[k] & 0xFF) << 24 | i & 0xFF | (j & 0xFF) << 8 | (m & 0xFF) << 16;
  }
  
  public final int zzh()
  {
    int i = zzg();
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(i);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final int zzi()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    j = arrayOfByte[j];
    this.zzc = (i + 1);
    return (arrayOfByte[i] & 0xFF) << 8 | j & 0xFF;
  }
  
  public final int zzj()
  {
    return zzk() << 21 | zzk() << 14 | zzk() << 7 | zzk();
  }
  
  public final int zzk()
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    this.zzc = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final int zzl()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    int k = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    i = arrayOfByte[i];
    this.zzc = (j + 2);
    return i & 0xFF | (k & 0xFF) << 8;
  }
  
  public final int zzm()
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    int j = i + 1;
    this.zzc = j;
    int k = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    j = arrayOfByte[j];
    this.zzc = (i + 1);
    return arrayOfByte[i] & 0xFF | (k & 0xFF) << 16 | (j & 0xFF) << 8;
  }
  
  public final int zzn()
  {
    int i = zze();
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(i);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final int zzo()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    j = arrayOfByte[j];
    this.zzc = (i + 1);
    return arrayOfByte[i] & 0xFF | (j & 0xFF) << 8;
  }
  
  public final long zzp()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    long l5 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l6 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l2 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l3 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l7 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l4 = arrayOfByte[j];
    this.zzc = (i + 1);
    return (arrayOfByte[i] & 0xFF) << 56 | (l4 & 0xFF) << 48 | l5 & 0xFF | (l6 & 0xFF) << 8 | (l2 & 0xFF) << 16 | (l1 & 0xFF) << 24 | (l3 & 0xFF) << 32 | (l7 & 0xFF) << 40;
  }
  
  public final long zzq()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    long l2 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l3 = arrayOfByte[j];
    this.zzc = (i + 1);
    return (arrayOfByte[i] & 0xFF) << 24 | l2 & 0xFF | (l1 & 0xFF) << 8 | (l3 & 0xFF) << 16;
  }
  
  public final long zzr()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    long l3 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l6 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l5 = arrayOfByte[j];
    int k = i + 1;
    this.zzc = k;
    long l1 = arrayOfByte[i];
    j = k + 1;
    this.zzc = j;
    long l2 = arrayOfByte[k];
    i = j + 1;
    this.zzc = i;
    long l4 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l7 = arrayOfByte[i];
    this.zzc = (j + 1);
    return arrayOfByte[j] & 0xFF | (l3 & 0xFF) << 56 | (l6 & 0xFF) << 48 | (l5 & 0xFF) << 40 | (l1 & 0xFF) << 32 | (l2 & 0xFF) << 24 | (l4 & 0xFF) << 16 | (l7 & 0xFF) << 8;
  }
  
  public final long zzs()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    long l2 = arrayOfByte[j];
    j = i + 1;
    this.zzc = j;
    long l1 = arrayOfByte[i];
    i = j + 1;
    this.zzc = i;
    long l3 = arrayOfByte[j];
    this.zzc = (i + 1);
    return arrayOfByte[i] & 0xFF | (l2 & 0xFF) << 24 | (l1 & 0xFF) << 16 | (l3 & 0xFF) << 8;
  }
  
  public final long zzt()
  {
    long l = zzr();
    if (l >= 0L) {
      return l;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Top bit not zero: ");
    localStringBuilder.append(l);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final long zzu()
  {
    long l2 = this.zzb[this.zzc];
    int k;
    long l1;
    int i;
    for (int j = 7;; j--)
    {
      int m = 0;
      k = 1;
      l1 = l2;
      i = m;
      if (j < 0) {
        break;
      }
      i = 1 << j;
      if ((i & l2) == 0L)
      {
        if (j < 6)
        {
          l1 = l2 & i - 1;
          i = 7 - j;
          break;
        }
        l1 = l2;
        i = m;
        if (j != 7) {
          break;
        }
        i = 1;
        l1 = l2;
        break;
      }
    }
    if (i != 0)
    {
      j = k;
      while (j < i)
      {
        k = this.zzb[(this.zzc + j)];
        if ((k & 0xC0) == 128)
        {
          l1 = l1 << 6 | k & 0x3F;
          j++;
        }
        else
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Invalid UTF-8 sequence continuation byte: ");
          localStringBuilder.append(l1);
          throw new NumberFormatException(localStringBuilder.toString());
        }
      }
      this.zzc += i;
      return l1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid UTF-8 sequence first byte: ");
    localStringBuilder.append(l1);
    throw new NumberFormatException(localStringBuilder.toString());
  }
  
  public final String zzv(char paramChar)
  {
    char c = this.zzd;
    paramChar = this.zzc;
    if (c - paramChar != 0)
    {
      while ((paramChar < this.zzd) && (this.zzb[paramChar] != 0)) {
        paramChar++;
      }
      Object localObject = this.zzb;
      c = this.zzc;
      localObject = zzfn.zzv((byte[])localObject, c, paramChar - c);
      this.zzc = paramChar;
      if (paramChar < this.zzd) {
        this.zzc = (paramChar + '\001');
      }
      return (String)localObject;
    }
    return null;
  }
  
  public final String zzw(int paramInt)
  {
    if (paramInt == 0) {
      return "";
    }
    int j = this.zzc;
    int i = j + paramInt - 1;
    if ((i < this.zzd) && (this.zzb[i] == 0)) {
      i = paramInt - 1;
    } else {
      i = paramInt;
    }
    String str = zzfn.zzv(this.zzb, j, i);
    this.zzc += paramInt;
    return str;
  }
  
  public final String zzx(int paramInt, Charset paramCharset)
  {
    byte[] arrayOfByte = this.zzb;
    int i = this.zzc;
    paramCharset = new String(arrayOfByte, i, paramInt, paramCharset);
    this.zzc = (i + paramInt);
    return paramCharset;
  }
  
  public final short zzy()
  {
    byte[] arrayOfByte = this.zzb;
    int j = this.zzc;
    int i = j + 1;
    this.zzc = i;
    j = arrayOfByte[j];
    this.zzc = (i + 1);
    return (short)(arrayOfByte[i] & 0xFF | (j & 0xFF) << 8);
  }
  
  public final void zzz(int paramInt)
  {
    byte[] arrayOfByte = this.zzb;
    if (paramInt > arrayOfByte.length) {
      this.zzb = Arrays.copyOf(arrayOfByte, paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */