package com.google.android.gms.internal.ads;

public final class zzfe
{
  private byte[] zza;
  private int zzb;
  private int zzc;
  private int zzd;
  
  public zzfe(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.zza = paramArrayOfByte;
    this.zzc = paramInt1;
    this.zzb = paramInt2;
    this.zzd = 0;
    zzh();
  }
  
  private final int zzg()
  {
    int j = 0;
    for (int i = 0; !zzf(); i++) {}
    if (i > 0) {
      j = zza(i);
    }
    return (1 << i) - 1 + j;
  }
  
  private final void zzh()
  {
    int i = this.zzc;
    boolean bool2 = true;
    if (i >= 0)
    {
      int j = this.zzb;
      bool1 = bool2;
      if (i < j) {
        break label45;
      }
      if ((i == j) && (this.zzd == 0))
      {
        bool1 = bool2;
        break label45;
      }
    }
    boolean bool1 = false;
    label45:
    zzdy.zzf(bool1);
  }
  
  private final boolean zzi(int paramInt)
  {
    if ((paramInt >= 2) && (paramInt < this.zzb))
    {
      byte[] arrayOfByte = this.zza;
      if ((arrayOfByte[paramInt] == 3) && (arrayOfByte[(paramInt - 2)] == 0) && (arrayOfByte[(paramInt - 1)] == 0)) {
        return true;
      }
    }
    return false;
  }
  
  public final int zza(int paramInt)
  {
    this.zzd += paramInt;
    int i = 0;
    int k;
    int j;
    for (;;)
    {
      k = this.zzd;
      j = 2;
      if (k <= 8) {
        break;
      }
      m = k - 8;
      this.zzd = m;
      arrayOfByte = this.zza;
      k = this.zzc;
      i |= (arrayOfByte[k] & 0xFF) << m;
      if (true != zzi(k + 1)) {
        j = 1;
      }
      this.zzc = (k + j);
    }
    byte[] arrayOfByte = this.zza;
    int m = this.zzc;
    int n = arrayOfByte[m];
    if (k == 8)
    {
      this.zzd = 0;
      if (true != zzi(m + 1)) {
        j = 1;
      }
      this.zzc = (m + j);
    }
    zzh();
    return -1 >>> 32 - paramInt & (i | (n & 0xFF) >> 8 - k);
  }
  
  public final int zzb()
  {
    int j = zzg();
    int i = 1;
    if (j % 2 == 0) {
      i = -1;
    }
    return i * ((j + 1) / 2);
  }
  
  public final int zzc()
  {
    return zzg();
  }
  
  public final void zzd()
  {
    int j = this.zzd;
    int i = 1;
    j++;
    this.zzd = j;
    if (j == 8)
    {
      this.zzd = 0;
      j = this.zzc;
      if (true == zzi(j + 1)) {
        i = 2;
      }
      this.zzc = (j + i);
    }
    zzh();
  }
  
  public final void zze(int paramInt)
  {
    int i = this.zzc;
    int k = paramInt / 8;
    int j = i + k;
    this.zzc = j;
    k = this.zzd + (paramInt - k * 8);
    this.zzd = k;
    paramInt = i;
    if (k > 7)
    {
      this.zzc = (j + 1);
      this.zzd = (k - 8);
      paramInt = i;
    }
    for (;;)
    {
      i = paramInt + 1;
      if (i > this.zzc) {
        break;
      }
      paramInt = i;
      if (zzi(i))
      {
        this.zzc += 1;
        paramInt = i + 2;
      }
    }
    zzh();
  }
  
  public final boolean zzf()
  {
    int j = this.zza[this.zzc];
    int i = this.zzd;
    zzd();
    return (j & 128 >> i) != 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */