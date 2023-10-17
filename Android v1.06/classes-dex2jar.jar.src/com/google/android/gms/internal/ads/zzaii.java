package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzaii
{
  private static final byte[] zzd = { 0, 0, 1 };
  public int zza;
  public int zzb;
  public byte[] zzc = new byte[''];
  private boolean zze;
  
  public zzaii(int paramInt) {}
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.zze) {
      return;
    }
    int j = paramInt2 - paramInt1;
    byte[] arrayOfByte = this.zzc;
    int i = arrayOfByte.length;
    paramInt2 = this.zza + j;
    if (i < paramInt2) {
      this.zzc = Arrays.copyOf(arrayOfByte, paramInt2 + paramInt2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.zzc, this.zza, j);
    this.zza += j;
  }
  
  public final void zzb()
  {
    this.zze = false;
    this.zza = 0;
    this.zzb = 0;
  }
  
  public final boolean zzc(int paramInt1, int paramInt2)
  {
    if (this.zze)
    {
      paramInt2 = this.zza - paramInt2;
      this.zza = paramInt2;
      if ((this.zzb == 0) && (paramInt1 == 181))
      {
        this.zzb = paramInt2;
      }
      else
      {
        this.zze = false;
        return true;
      }
    }
    else if (paramInt1 == 179)
    {
      this.zze = true;
    }
    zza(zzd, 0, 3);
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */