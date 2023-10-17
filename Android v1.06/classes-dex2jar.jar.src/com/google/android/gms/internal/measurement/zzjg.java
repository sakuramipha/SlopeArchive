package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

final class zzjg
  extends zzjj
{
  private final byte[] zzb;
  private final int zzc;
  private int zzd;
  
  zzjg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    Objects.requireNonNull(paramArrayOfByte, "buffer");
    paramInt1 = paramArrayOfByte.length;
    if ((paramInt1 - paramInt2 | paramInt2) >= 0)
    {
      this.zzb = paramArrayOfByte;
      this.zzd = 0;
      this.zzc = paramInt2;
      return;
    }
    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
  }
  
  public final int zza()
  {
    return this.zzc - this.zzd;
  }
  
  public final void zzb(byte paramByte)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zzb;
      int i = this.zzd;
      this.zzd = (i + 1);
      arrayOfByte[i] = paramByte;
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      System.arraycopy(paramArrayOfByte, 0, this.zzb, this.zzd, paramInt2);
      this.zzd += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void zzd(int paramInt, boolean paramBoolean)
    throws IOException
  {
    zzq(paramInt << 3);
    zzb(paramBoolean);
  }
  
  public final void zze(int paramInt, zzjb paramzzjb)
    throws IOException
  {
    zzq(paramInt << 3 | 0x2);
    zzq(paramzzjb.zzd());
    paramzzjb.zzh(this);
  }
  
  public final void zzf(int paramInt1, int paramInt2)
    throws IOException
  {
    zzq(paramInt1 << 3 | 0x5);
    zzg(paramInt2);
  }
  
  public final void zzg(int paramInt)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zzb;
      int i = this.zzd;
      int j = i + 1;
      this.zzd = j;
      arrayOfByte[i] = ((byte)(paramInt & 0xFF));
      i = j + 1;
      this.zzd = i;
      arrayOfByte[j] = ((byte)(paramInt >> 8 & 0xFF));
      j = i + 1;
      this.zzd = j;
      arrayOfByte[i] = ((byte)(paramInt >> 16 & 0xFF));
      this.zzd = (j + 1);
      arrayOfByte[j] = ((byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzh(int paramInt, long paramLong)
    throws IOException
  {
    zzq(paramInt << 3 | 0x1);
    zzi(paramLong);
  }
  
  public final void zzi(long paramLong)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zzb;
      int j = this.zzd;
      int i = j + 1;
      this.zzd = i;
      arrayOfByte[j] = ((byte)((int)paramLong & 0xFF));
      j = i + 1;
      this.zzd = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 8) & 0xFF));
      i = j + 1;
      this.zzd = i;
      arrayOfByte[j] = ((byte)((int)(paramLong >> 16) & 0xFF));
      j = i + 1;
      this.zzd = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 24) & 0xFF));
      int k = j + 1;
      this.zzd = k;
      arrayOfByte[j] = ((byte)((int)(paramLong >> 32) & 0xFF));
      i = k + 1;
      this.zzd = i;
      arrayOfByte[k] = ((byte)((int)(paramLong >> 40) & 0xFF));
      j = i + 1;
      this.zzd = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 48) & 0xFF));
      this.zzd = (j + 1);
      arrayOfByte[j] = ((byte)((int)(paramLong >> 56) & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzj(int paramInt1, int paramInt2)
    throws IOException
  {
    zzq(paramInt1 << 3);
    zzk(paramInt2);
  }
  
  public final void zzk(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      zzq(paramInt);
      return;
    }
    zzs(paramInt);
  }
  
  public final void zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzc(paramArrayOfByte, 0, paramInt2);
  }
  
  public final void zzm(int paramInt, String paramString)
    throws IOException
  {
    zzq(paramInt << 3 | 0x2);
    zzn(paramString);
  }
  
  public final void zzn(String paramString)
    throws IOException
  {
    int i = this.zzd;
    try
    {
      int k = zzA(paramString.length() * 3);
      int j = zzA(paramString.length());
      if (j == k)
      {
        k = i + j;
        this.zzd = k;
        k = zzna.zzb(paramString, this.zzb, k, this.zzc - k);
        this.zzd = i;
        zzq(k - i - j);
        this.zzd = k;
        return;
      }
      zzq(zzna.zzc(paramString));
      byte[] arrayOfByte = this.zzb;
      j = this.zzd;
      this.zzd = zzna.zzb(paramString, arrayOfByte, j, this.zzc - j);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzjh(paramString);
    }
    catch (zzmz localzzmz)
    {
      this.zzd = i;
      zzE(paramString, localzzmz);
    }
  }
  
  public final void zzo(int paramInt1, int paramInt2)
    throws IOException
  {
    zzq(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzp(int paramInt1, int paramInt2)
    throws IOException
  {
    zzq(paramInt1 << 3);
    zzq(paramInt2);
  }
  
  public final void zzq(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = this.zzb;
        i = this.zzd;
        this.zzd = (i + 1);
        arrayOfByte[i] = ((byte)paramInt);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        byte[] arrayOfByte;
        int i;
        throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = this.zzb;
      i = this.zzd;
      this.zzd = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }
  
  public final void zzr(int paramInt, long paramLong)
    throws IOException
  {
    zzq(paramInt << 3);
    zzs(paramLong);
  }
  
  public final void zzs(long paramLong)
    throws IOException
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (zzjj.zzF())
    {
      l = paramLong;
      if (this.zzc - this.zzd >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = this.zzb;
            i = this.zzd;
            this.zzd = (i + 1);
            zzmv.zzn(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = this.zzb;
          i = this.zzd;
          this.zzd = (i + 1);
          zzmv.zzn(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
      try
      {
        arrayOfByte = this.zzb;
        i = this.zzd;
        this.zzd = (i + 1);
        arrayOfByte[i] = ((byte)(int)l);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = this.zzb;
      i = this.zzd;
      this.zzd = (i + 1);
      arrayOfByte[i] = ((byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */