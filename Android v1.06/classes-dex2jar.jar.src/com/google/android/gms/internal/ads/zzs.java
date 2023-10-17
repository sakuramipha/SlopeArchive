package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

public final class zzs
{
  public static final zzs zza = new zzs(1, 2, 3, null);
  public static final zzs zzb;
  public static final zzn zzc = zzp.zza;
  private static final String zzh;
  private static final String zzi;
  private static final String zzj;
  private static final String zzk;
  public final int zzd;
  public final int zze;
  public final int zzf;
  public final byte[] zzg;
  private int zzl;
  
  static
  {
    zzr localzzr = new zzr();
    localzzr.zzb(1);
    localzzr.zza(1);
    localzzr.zzc(2);
    zzb = localzzr.zzd();
    zzh = Integer.toString(0, 36);
    zzi = Integer.toString(1, 36);
    zzj = Integer.toString(2, 36);
    zzk = Integer.toString(3, 36);
  }
  
  @Deprecated
  public zzs(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.zzd = paramInt1;
    this.zze = paramInt2;
    this.zzf = paramInt3;
    this.zzg = paramArrayOfByte;
  }
  
  @Pure
  public static int zza(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 9)
      {
        if ((paramInt != 4) && (paramInt != 5) && (paramInt != 6) && (paramInt != 7)) {
          return -1;
        }
        return 2;
      }
      return 6;
    }
    return 1;
  }
  
  @Pure
  public static int zzb(int paramInt)
  {
    if (paramInt != 1) {
      if (paramInt != 4)
      {
        if (paramInt != 13)
        {
          if (paramInt != 16)
          {
            if (paramInt != 18)
            {
              if ((paramInt != 6) && (paramInt != 7)) {
                return -1;
              }
            }
            else {
              return 7;
            }
          }
          else {
            return 6;
          }
        }
        else {
          return 2;
        }
      }
      else {
        return 10;
      }
    }
    return 3;
  }
  
  private static String zzf(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return "Undefined color range";
        }
        return "Limited range";
      }
      return "Full range";
    }
    return "Unset color range";
  }
  
  private static String zzg(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 6)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return "Undefined color space";
          }
          return "BT601";
        }
        return "BT709";
      }
      return "BT2020";
    }
    return "Unset color space";
  }
  
  private static String zzh(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 10)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 6)
              {
                if (paramInt != 7) {
                  return "Undefined color transfer";
                }
                return "HLG";
              }
              return "ST2084 PQ";
            }
            return "SDR SMPTE 170M";
          }
          return "sRGB";
        }
        return "Linear";
      }
      return "Gamma 2.2";
    }
    return "Unset color transfer";
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzs)paramObject;
      if ((this.zzd == ((zzs)paramObject).zzd) && (this.zze == ((zzs)paramObject).zze) && (this.zzf == ((zzs)paramObject).zzf) && (Arrays.equals(this.zzg, ((zzs)paramObject).zzg))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzl;
    int i = j;
    if (j == 0)
    {
      i = (((this.zzd + 527) * 31 + this.zze) * 31 + this.zzf) * 31 + Arrays.hashCode(this.zzg);
      this.zzl = i;
    }
    return i;
  }
  
  public final String toString()
  {
    String str2 = zzg(this.zzd);
    String str3 = zzf(this.zze);
    String str1 = zzh(this.zzf);
    byte[] arrayOfByte = this.zzg;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ColorInfo(");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", ");
    boolean bool;
    if (arrayOfByte != null) {
      bool = true;
    } else {
      bool = false;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final zzr zzc()
  {
    return new zzr(this, null);
  }
  
  public final String zzd()
  {
    if (!zze()) {
      return "NA";
    }
    String str1 = zzg(this.zzd);
    String str2 = zzf(this.zze);
    String str3 = zzh(this.zzf);
    return String.format(Locale.US, "%s/%s/%s", new Object[] { str1, str2, str3 });
  }
  
  public final boolean zze()
  {
    return (this.zzd != -1) && (this.zze != -1) && (this.zzf != -1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */