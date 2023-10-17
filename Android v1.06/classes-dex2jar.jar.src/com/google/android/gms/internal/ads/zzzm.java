package com.google.android.gms.internal.ads;

public final class zzzm
{
  public static final int zza = 0;
  private static final int[] zzb = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  private static final int[] zzc = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  public static zzzl zza(byte[] paramArrayOfByte)
    throws zzce
  {
    return zzb(new zzfc(paramArrayOfByte, paramArrayOfByte.length), false);
  }
  
  public static zzzl zzb(zzfc paramzzfc, boolean paramBoolean)
    throws zzce
  {
    int i1 = zzc(paramzzfc);
    int k = zzd(paramzzfc);
    int j = paramzzfc.zzd(4);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mp4a.40.");
    ((StringBuilder)localObject).append(i1);
    localObject = ((StringBuilder)localObject).toString();
    int n = 22;
    int m;
    if (i1 != 5)
    {
      i = i1;
      m = j;
      if (i1 != 29) {}
    }
    else
    {
      i1 = zzd(paramzzfc);
      int i2 = zzc(paramzzfc);
      i = i2;
      k = i1;
      m = j;
      if (i2 == 22)
      {
        m = paramzzfc.zzd(4);
        k = i1;
        i = i2;
      }
    }
    if (paramBoolean)
    {
      i1 = 3;
      if ((i != 1) && (i != 2) && (i != 3) && (i != 4) && (i != 6) && (i != 7) && (i != 17)) {
        switch (i)
        {
        default: 
          paramzzfc = new StringBuilder();
          paramzzfc.append("Unsupported audio object type: ");
          paramzzfc.append(i);
          throw zzce.zzc(paramzzfc.toString());
        }
      }
      if (paramzzfc.zzn()) {
        zzer.zze("AacUtil", "Unexpected frameLengthFlag = 1");
      }
      if (paramzzfc.zzn()) {
        paramzzfc.zzl(14);
      }
      paramBoolean = paramzzfc.zzn();
      if (m != 0)
      {
        j = i;
        if (i != 6)
        {
          j = i;
          if (i == 20) {
            j = 20;
          }
        }
        else
        {
          paramzzfc.zzl(3);
        }
        if (paramBoolean)
        {
          if (j == 22)
          {
            paramzzfc.zzl(16);
            i = n;
          }
          else
          {
            i = j;
          }
          if ((i == 17) || (i == 19) || (i == 20) || (i == 23)) {
            paramzzfc.zzl(3);
          }
          paramzzfc.zzl(1);
        }
        switch (j)
        {
        case 18: 
        default: 
          break;
        case 17: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
          j = paramzzfc.zzd(2);
          if (j != 2)
          {
            i = i1;
            if (j != 3) {
              break;
            }
          }
          else
          {
            i = j;
          }
          paramzzfc = new StringBuilder();
          paramzzfc.append("Unsupported epConfig: ");
          paramzzfc.append(i);
          throw zzce.zzc(paramzzfc.toString());
        }
      }
      else
      {
        throw new UnsupportedOperationException();
      }
    }
    int i = zzc[m];
    if (i != -1) {
      return new zzzl(k, i, (String)localObject, null);
    }
    throw zzce.zza(null, null);
  }
  
  private static int zzc(zzfc paramzzfc)
  {
    int i = paramzzfc.zzd(5);
    if (i == 31) {
      return paramzzfc.zzd(6) + 32;
    }
    return i;
  }
  
  private static int zzd(zzfc paramzzfc)
    throws zzce
  {
    int i = paramzzfc.zzd(4);
    if (i == 15)
    {
      if (paramzzfc.zza() >= 24) {
        i = paramzzfc.zzd(24);
      } else {
        throw zzce.zza("AAC header insufficient data", null);
      }
    }
    else
    {
      if (i >= 13) {
        break label52;
      }
      i = zzb[i];
    }
    return i;
    label52:
    throw zzce.zza("AAC header wrong Sampling Frequency Index", null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */