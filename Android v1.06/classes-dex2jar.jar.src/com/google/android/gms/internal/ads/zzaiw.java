package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzaiw
{
  public byte[] zza;
  public int zzb;
  private final int zzc;
  private boolean zzd;
  private boolean zze;
  
  public zzaiw(int paramInt1, int paramInt2)
  {
    this.zzc = paramInt1;
    byte[] arrayOfByte = new byte[''];
    this.zza = arrayOfByte;
    arrayOfByte[2] = 1;
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.zzd) {
      return;
    }
    int j = paramInt2 - paramInt1;
    byte[] arrayOfByte = this.zza;
    paramInt2 = arrayOfByte.length;
    int i = this.zzb + j;
    if (paramInt2 < i) {
      this.zza = Arrays.copyOf(arrayOfByte, i + i);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.zza, this.zzb, j);
    this.zzb += j;
  }
  
  public final void zzb()
  {
    this.zzd = false;
    this.zze = false;
  }
  
  public final void zzc(int paramInt)
  {
    boolean bool2 = this.zzd;
    boolean bool1 = true;
    zzdy.zzf(bool2 ^ true);
    if (paramInt != this.zzc) {
      bool1 = false;
    }
    this.zzd = bool1;
    if (bool1)
    {
      this.zzb = 3;
      this.zze = false;
    }
  }
  
  public final boolean zzd(int paramInt)
  {
    if (!this.zzd) {
      return false;
    }
    this.zzb -= paramInt;
    this.zzd = false;
    this.zze = true;
    return true;
  }
  
  public final boolean zze()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */