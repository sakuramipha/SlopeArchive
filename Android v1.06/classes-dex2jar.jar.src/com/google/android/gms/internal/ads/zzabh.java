package com.google.android.gms.internal.ads;

public final class zzabh
{
  public int zza;
  public String zzb;
  public int zzc;
  public int zzd;
  public int zze;
  public int zzf;
  public int zzg;
  
  public final boolean zza(int paramInt)
  {
    if (!zzabi.zzd(paramInt)) {
      return false;
    }
    int i1 = paramInt >>> 19 & 0x3;
    if (i1 == 1) {
      return false;
    }
    int n = paramInt >>> 17 & 0x3;
    if (n == 0) {
      return false;
    }
    int i2 = paramInt >>> 12 & 0xF;
    if ((i2 != 0) && (i2 != 15))
    {
      int i = paramInt >>> 10 & 0x3;
      if (i == 3) {
        return false;
      }
      this.zza = i1;
      this.zzb = zzabi.zzk()[(3 - n)];
      int j = zzabi.zzj()[i];
      this.zzd = j;
      int k = 2;
      if (i1 == 2)
      {
        i = j / 2;
        this.zzd = i;
      }
      else
      {
        i = j;
        if (i1 == 0)
        {
          i = j / 4;
          this.zzd = i;
        }
      }
      int m = paramInt >>> 9 & 0x1;
      this.zzg = zzabi.zza(i1, n);
      if (n == 3)
      {
        if (i1 == 3) {
          j = zzabi.zze()[(i2 - 1)];
        } else {
          j = zzabi.zzi()[(i2 - 1)];
        }
        this.zzf = j;
        this.zzc = ((j * 12 / i + m) * 4);
      }
      else
      {
        j = 144;
        if (i1 == 3)
        {
          if (n == 2) {
            j = zzabi.zzf()[(i2 - 1)];
          } else {
            j = zzabi.zzg()[(i2 - 1)];
          }
          this.zzf = j;
          this.zzc = (j * 144 / i + m);
        }
        else
        {
          i1 = zzabi.zzh()[(i2 - 1)];
          this.zzf = i1;
          if (n == 1) {
            j = 72;
          }
          this.zzc = (j * i1 / i + m);
        }
      }
      i = k;
      if ((paramInt >> 6 & 0x3) == 3) {
        i = 1;
      }
      this.zze = i;
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */