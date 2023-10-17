package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

final class zzgnz
  extends zzgod
{
  private final byte[] zza;
  private final int zzb;
  private int zzc;
  
  zzgnz(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(null);
    Objects.requireNonNull(paramArrayOfByte, "buffer");
    paramInt1 = paramArrayOfByte.length;
    if ((paramInt1 - paramInt2 | paramInt2) >= 0)
    {
      this.zza = paramArrayOfByte;
      this.zzc = 0;
      this.zzb = paramInt2;
      return;
    }
    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2) }));
  }
  
  public final void zzI() {}
  
  public final void zzJ(byte paramByte)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zza;
      int i = this.zzc;
      this.zzc = (i + 1);
      arrayOfByte[i] = paramByte;
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzK(int paramInt, boolean paramBoolean)
    throws IOException
  {
    zzs(paramInt << 3);
    zzJ(paramBoolean);
  }
  
  public final void zzL(int paramInt, zzgno paramzzgno)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzs(paramzzgno.zzd());
    paramzzgno.zzo(this);
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zze(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int zzb()
  {
    return this.zzb - this.zzc;
  }
  
  public final void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.zza, this.zzc, paramInt2);
      this.zzc += paramInt2;
      return;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(paramInt2) }), paramArrayOfByte);
    }
  }
  
  public final void zzh(int paramInt1, int paramInt2)
    throws IOException
  {
    zzs(paramInt1 << 3 | 0x5);
    zzi(paramInt2);
  }
  
  public final void zzi(int paramInt)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zza;
      int i = this.zzc;
      int j = i + 1;
      this.zzc = j;
      arrayOfByte[i] = ((byte)(paramInt & 0xFF));
      i = j + 1;
      this.zzc = i;
      arrayOfByte[j] = ((byte)(paramInt >> 8 & 0xFF));
      j = i + 1;
      this.zzc = j;
      arrayOfByte[i] = ((byte)(paramInt >> 16 & 0xFF));
      this.zzc = (j + 1);
      arrayOfByte[j] = ((byte)(paramInt >> 24 & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzj(int paramInt, long paramLong)
    throws IOException
  {
    zzs(paramInt << 3 | 0x1);
    zzk(paramLong);
  }
  
  public final void zzk(long paramLong)
    throws IOException
  {
    try
    {
      byte[] arrayOfByte = this.zza;
      int j = this.zzc;
      int i = j + 1;
      this.zzc = i;
      arrayOfByte[j] = ((byte)((int)paramLong & 0xFF));
      j = i + 1;
      this.zzc = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 8) & 0xFF));
      i = j + 1;
      this.zzc = i;
      arrayOfByte[j] = ((byte)((int)(paramLong >> 16) & 0xFF));
      j = i + 1;
      this.zzc = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 24) & 0xFF));
      int k = j + 1;
      this.zzc = k;
      arrayOfByte[j] = ((byte)((int)(paramLong >> 32) & 0xFF));
      i = k + 1;
      this.zzc = i;
      arrayOfByte[k] = ((byte)((int)(paramLong >> 40) & 0xFF));
      j = i + 1;
      this.zzc = j;
      arrayOfByte[i] = ((byte)((int)(paramLong >> 48) & 0xFF));
      this.zzc = (j + 1);
      arrayOfByte[j] = ((byte)((int)(paramLong >> 56) & 0xFF));
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(1) }), localIndexOutOfBoundsException);
    }
  }
  
  public final void zzl(int paramInt1, int paramInt2)
    throws IOException
  {
    zzs(paramInt1 << 3);
    zzm(paramInt2);
  }
  
  public final void zzm(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      zzs(paramInt);
      return;
    }
    zzu(paramInt);
  }
  
  final void zzn(int paramInt, zzgqg paramzzgqg, zzgqz paramzzgqz)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzs(((zzgmx)paramzzgqg).zzat(paramzzgqz));
    paramzzgqz.zzm(paramzzgqg, this.zze);
  }
  
  public final void zzo(int paramInt, String paramString)
    throws IOException
  {
    zzs(paramInt << 3 | 0x2);
    zzp(paramString);
  }
  
  public final void zzp(String paramString)
    throws IOException
  {
    int i = this.zzc;
    try
    {
      int k = zzA(paramString.length() * 3);
      int j = zzA(paramString.length());
      if (j == k)
      {
        k = i + j;
        this.zzc = k;
        k = zzgsf.zzd(paramString, this.zza, k, this.zzb - k);
        this.zzc = i;
        zzs(k - i - j);
        this.zzc = k;
        return;
      }
      zzs(zzgsf.zze(paramString));
      byte[] arrayOfByte = this.zza;
      j = this.zzc;
      this.zzc = zzgsf.zzd(paramString, arrayOfByte, j, this.zzb - j);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzgoa(paramString);
    }
    catch (zzgse localzzgse)
    {
      this.zzc = i;
      zzE(paramString, localzzgse);
    }
  }
  
  public final void zzq(int paramInt1, int paramInt2)
    throws IOException
  {
    zzs(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzr(int paramInt1, int paramInt2)
    throws IOException
  {
    zzs(paramInt1 << 3);
    zzs(paramInt2);
  }
  
  public final void zzs(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0) {}
      try
      {
        arrayOfByte = this.zza;
        i = this.zzc;
        this.zzc = (i + 1);
        arrayOfByte[i] = ((byte)paramInt);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        byte[] arrayOfByte;
        int i;
        throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = this.zza;
      i = this.zzc;
      this.zzc = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt & 0x7F | 0x80));
      paramInt >>>= 7;
    }
  }
  
  public final void zzt(int paramInt, long paramLong)
    throws IOException
  {
    zzs(paramInt << 3);
    zzu(paramLong);
  }
  
  public final void zzu(long paramLong)
    throws IOException
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (zzgod.zzF())
    {
      l = paramLong;
      if (this.zzb - this.zzc >= 10) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
          {
            arrayOfByte = this.zza;
            i = this.zzc;
            this.zzc = (i + 1);
            zzgsa.zzq(arrayOfByte, i, (byte)(int)paramLong);
            return;
          }
          arrayOfByte = this.zza;
          i = this.zzc;
          this.zzc = (i + 1);
          zzgsa.zzq(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
          paramLong >>>= 7;
        }
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L) {}
      try
      {
        arrayOfByte = this.zza;
        i = this.zzc;
        this.zzc = (i + 1);
        arrayOfByte[i] = ((byte)(int)l);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", new Object[] { Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(1) }), localIndexOutOfBoundsException);
      }
      arrayOfByte = this.zza;
      i = this.zzc;
      this.zzc = (i + 1);
      arrayOfByte[i] = ((byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */