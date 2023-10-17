package com.google.android.gms.internal.ads;

public final class zzfc
{
  public byte[] zza;
  private int zzb;
  private int zzc;
  private int zzd;
  
  public zzfc()
  {
    this.zza = zzfn.zzf;
  }
  
  public zzfc(byte[] paramArrayOfByte, int paramInt)
  {
    this.zza = paramArrayOfByte;
    this.zzd = paramInt;
  }
  
  private final void zzo()
  {
    int i = this.zzb;
    boolean bool2 = true;
    if (i >= 0)
    {
      int j = this.zzd;
      bool1 = bool2;
      if (i < j) {
        break label45;
      }
      if ((i == j) && (this.zzc == 0))
      {
        bool1 = bool2;
        break label45;
      }
    }
    boolean bool1 = false;
    label45:
    zzdy.zzf(bool1);
  }
  
  public final int zza()
  {
    return (this.zzd - this.zzb) * 8 - this.zzc;
  }
  
  public final int zzb()
  {
    boolean bool;
    if (this.zzc == 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    return this.zzb;
  }
  
  public final int zzc()
  {
    return this.zzb * 8 + this.zzc;
  }
  
  public final int zzd(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    this.zzc += paramInt;
    int i = 0;
    int k;
    for (;;)
    {
      k = this.zzc;
      if (k <= 8) {
        break;
      }
      k -= 8;
      this.zzc = k;
      arrayOfByte = this.zza;
      j = this.zzb;
      this.zzb = (j + 1);
      i |= (arrayOfByte[j] & 0xFF) << k;
    }
    byte[] arrayOfByte = this.zza;
    int j = this.zzb;
    int m = arrayOfByte[j];
    if (k == 8)
    {
      this.zzc = 0;
      this.zzb = (j + 1);
    }
    zzo();
    return -1 >>> 32 - paramInt & (i | (m & 0xFF) >> 8 - k);
  }
  
  public final void zze()
  {
    if (this.zzc == 0) {
      return;
    }
    this.zzc = 0;
    this.zzb += 1;
    zzo();
  }
  
  public final void zzf(int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(8 - this.zzc, 14);
    int k = this.zzc;
    int m = 8 - k - paramInt2;
    byte[] arrayOfByte = this.zza;
    int j = this.zzb;
    int i = (byte)((65280 >> k | (1 << m) - 1) & arrayOfByte[j]);
    arrayOfByte[j] = i;
    paramInt2 = 14 - paramInt2;
    k = paramInt1 & 0x3FFF;
    arrayOfByte[j] = ((byte)(i | k >>> paramInt2 << m));
    j++;
    paramInt1 = paramInt2;
    for (paramInt2 = j; paramInt1 > 8; paramInt2++)
    {
      arrayOfByte = this.zza;
      paramInt1 -= 8;
      arrayOfByte[paramInt2] = ((byte)(k >>> paramInt1));
    }
    j = 8 - paramInt1;
    arrayOfByte = this.zza;
    i = (byte)(arrayOfByte[paramInt2] & (1 << j) - 1);
    arrayOfByte[paramInt2] = i;
    arrayOfByte[paramInt2] = ((byte)((k & (1 << paramInt1) - 1) << j | i));
    zzl(14);
    zzo();
  }
  
  public final void zzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j;
    for (paramInt1 = 0;; paramInt1++)
    {
      j = paramInt2 >> 3;
      if (paramInt1 >= j) {
        break;
      }
      arrayOfByte = this.zza;
      k = this.zzb;
      j = k + 1;
      this.zzb = j;
      k = arrayOfByte[k];
      m = this.zzc;
      i = (byte)(k << m);
      paramArrayOfByte[paramInt1] = i;
      paramArrayOfByte[paramInt1] = ((byte)((arrayOfByte[j] & 0xFF) >> 8 - m | i));
    }
    int k = paramInt2 & 0x7;
    if (k == 0) {
      return;
    }
    int i = (byte)(paramArrayOfByte[j] & 255 >> k);
    paramArrayOfByte[j] = i;
    paramInt2 = this.zzc;
    int m = i;
    paramInt1 = paramInt2;
    if (paramInt2 + k > 8)
    {
      arrayOfByte = this.zza;
      paramInt1 = this.zzb;
      this.zzb = (paramInt1 + 1);
      i = (byte)(i | (arrayOfByte[paramInt1] & 0xFF) << paramInt2);
      paramArrayOfByte[j] = i;
      paramInt1 = paramInt2 - 8;
      m = i;
    }
    paramInt2 = paramInt1 + k;
    this.zzc = paramInt2;
    byte[] arrayOfByte = this.zza;
    paramInt1 = this.zzb;
    paramArrayOfByte[j] = ((byte)((byte)((0xFF & arrayOfByte[paramInt1]) >> 8 - paramInt2 << 8 - k) | m));
    if (paramInt2 == 8)
    {
      this.zzc = 0;
      this.zzb = (paramInt1 + 1);
    }
    zzo();
  }
  
  public final void zzh(zzfd paramzzfd)
  {
    zzi(paramzzfd.zzH(), paramzzfd.zzd());
    zzj(paramzzfd.zzc() * 8);
  }
  
  public final void zzi(byte[] paramArrayOfByte, int paramInt)
  {
    this.zza = paramArrayOfByte;
    this.zzb = 0;
    this.zzc = 0;
    this.zzd = paramInt;
  }
  
  public final void zzj(int paramInt)
  {
    int i = paramInt / 8;
    this.zzb = i;
    this.zzc = (paramInt - i * 8);
    zzo();
  }
  
  public final void zzk()
  {
    int i = this.zzc + 1;
    this.zzc = i;
    if (i == 8)
    {
      this.zzc = 0;
      this.zzb += 1;
    }
    zzo();
  }
  
  public final void zzl(int paramInt)
  {
    int j = this.zzb;
    int i = paramInt / 8;
    j += i;
    this.zzb = j;
    paramInt = this.zzc + (paramInt - i * 8);
    this.zzc = paramInt;
    if (paramInt > 7)
    {
      this.zzb = (j + 1);
      this.zzc = (paramInt - 8);
    }
    zzo();
  }
  
  public final void zzm(int paramInt)
  {
    boolean bool;
    if (this.zzc == 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    this.zzb += paramInt;
    zzo();
  }
  
  public final boolean zzn()
  {
    int i = this.zza[this.zzb];
    int j = this.zzc;
    zzk();
    return (i & 128 >> j) != 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */