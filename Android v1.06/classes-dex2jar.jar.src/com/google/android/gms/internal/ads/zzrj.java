package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzrj
{
  private int zza = 0;
  private int zzb = -1;
  private int zzc = 0;
  private int[] zzd;
  private int zze;
  
  public zzrj()
  {
    int[] arrayOfInt = new int[16];
    this.zzd = arrayOfInt;
    this.zze = (arrayOfInt.length - 1);
  }
  
  public final int zza()
  {
    int k = this.zzc;
    if (k != 0)
    {
      int[] arrayOfInt = this.zzd;
      int j = this.zza;
      int i = arrayOfInt[j];
      this.zza = (j + 1 & this.zze);
      this.zzc = (k - 1);
      return i;
    }
    throw new NoSuchElementException();
  }
  
  public final void zzb(int paramInt)
  {
    int j = this.zzc;
    int[] arrayOfInt2 = this.zzd;
    int i = arrayOfInt2.length;
    int[] arrayOfInt1 = arrayOfInt2;
    if (j == i)
    {
      j = i + i;
      if (j >= 0)
      {
        arrayOfInt1 = new int[j];
        j = this.zza;
        i -= j;
        System.arraycopy(arrayOfInt2, j, arrayOfInt1, 0, i);
        System.arraycopy(this.zzd, 0, arrayOfInt1, i, j);
        this.zza = 0;
        this.zzb = (this.zzc - 1);
        this.zzd = arrayOfInt1;
        this.zze = (arrayOfInt1.length - 1);
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    i = this.zzb + 1 & this.zze;
    this.zzb = i;
    arrayOfInt1[i] = paramInt;
    this.zzc += 1;
  }
  
  public final void zzc()
  {
    this.zza = 0;
    this.zzb = -1;
    this.zzc = 0;
  }
  
  public final boolean zzd()
  {
    return this.zzc == 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */