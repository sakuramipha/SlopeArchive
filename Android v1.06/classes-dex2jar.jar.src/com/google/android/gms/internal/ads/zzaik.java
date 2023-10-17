package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzaik
{
  private static final byte[] zzd = { 0, 0, 1 };
  public int zza;
  public int zzb;
  public byte[] zzc = new byte[''];
  private boolean zze;
  private int zzf;
  
  public zzaik(int paramInt) {}
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.zze) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = this.zzc;
    paramInt2 = arrayOfByte.length;
    int j = this.zza + i;
    if (paramInt2 < j) {
      this.zzc = Arrays.copyOf(arrayOfByte, j + j);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.zzc, this.zza, i);
    this.zza += i;
  }
  
  public final void zzb()
  {
    this.zze = false;
    this.zza = 0;
    this.zzf = 0;
  }
  
  public final boolean zzc(int paramInt1, int paramInt2)
  {
    int i = this.zzf;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if ((paramInt1 == 179) || (paramInt1 == 181))
            {
              this.zza -= paramInt2;
              this.zze = false;
              return true;
            }
          }
          else if ((paramInt1 & 0xF0) != 32)
          {
            zzer.zze("H263Reader", "Unexpected start code value");
            zzb();
          }
          else
          {
            this.zzb = this.zza;
            this.zzf = 4;
          }
        }
        else if (paramInt1 > 31)
        {
          zzer.zze("H263Reader", "Unexpected start code value");
          zzb();
        }
        else
        {
          this.zzf = 3;
        }
      }
      else if (paramInt1 != 181)
      {
        zzer.zze("H263Reader", "Unexpected start code value");
        zzb();
      }
      else
      {
        this.zzf = 2;
      }
    }
    else if (paramInt1 == 176)
    {
      this.zzf = 1;
      this.zze = true;
    }
    zza(zzd, 0, 3);
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */