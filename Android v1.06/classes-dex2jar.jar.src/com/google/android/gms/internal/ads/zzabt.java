package com.google.android.gms.internal.ads;

public final class zzabt
{
  private final byte[] zza;
  private final int zzb;
  private int zzc;
  private int zzd;
  
  public zzabt(byte[] paramArrayOfByte)
  {
    this.zza = paramArrayOfByte;
    this.zzb = paramArrayOfByte.length;
  }
  
  public final int zza()
  {
    return this.zzc * 8 + this.zzd;
  }
  
  public final int zzb(int paramInt)
  {
    int k = this.zzc;
    int j = this.zzd;
    int i = k + 1;
    j = Math.min(paramInt, 8 - j);
    k = (this.zza[k] & 0xFF) >> this.zzd & 255 >> 8 - j;
    while (j < paramInt)
    {
      k |= (this.zza[i] & 0xFF) << j;
      j += 8;
      i++;
    }
    zzc(paramInt);
    return k & -1 >>> 32 - paramInt;
  }
  
  public final void zzc(int paramInt)
  {
    int j = this.zzc;
    int i = paramInt / 8;
    j += i;
    this.zzc = j;
    int k = this.zzd + (paramInt - i * 8);
    this.zzd = k;
    i = j;
    paramInt = k;
    if (k > 7)
    {
      i = j + 1;
      this.zzc = i;
      paramInt = k - 8;
      this.zzd = paramInt;
    }
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 0)
    {
      j = this.zzb;
      if (i >= j)
      {
        bool1 = bool2;
        if (i == j)
        {
          bool1 = bool2;
          if (paramInt != 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    zzdy.zzf(bool1);
  }
  
  public final boolean zzd()
  {
    int i = this.zza[this.zzc];
    int j = this.zzd;
    zzc(1);
    return 1 == ((i & 0xFF) >> j & 0x1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */