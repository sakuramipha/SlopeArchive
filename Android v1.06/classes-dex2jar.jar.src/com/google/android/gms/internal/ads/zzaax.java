package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzaax
{
  public static int zza(zzfd paramzzfd, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
      return 256 << paramInt - 8;
    case 7: 
      return paramzzfd.zzo() + 1;
    case 6: 
      return paramzzfd.zzk() + 1;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 576 << paramInt - 2;
    }
    return 192;
  }
  
  public static long zzb(zzaap paramzzaap, zzabb paramzzabb)
    throws IOException
  {
    paramzzaap.zzj();
    Object localObject = (zzaae)paramzzaap;
    ((zzaae)localObject).zzl(1, false);
    byte[] arrayOfByte = new byte[1];
    ((zzaae)localObject).zzm(arrayOfByte, 0, 1, false);
    int i = arrayOfByte[0] & 0x1;
    boolean bool;
    if (1 != i) {
      bool = false;
    } else {
      bool = true;
    }
    ((zzaae)localObject).zzl(2, false);
    if (1 != i) {
      i = 6;
    } else {
      i = 7;
    }
    localObject = new zzfd(i);
    ((zzfd)localObject).zzE(zzaas.zza(paramzzaap, ((zzfd)localObject).zzH(), 0, i));
    paramzzaap.zzj();
    paramzzaap = new zzaaw();
    if (zzd((zzfd)localObject, paramzzabb, bool, paramzzaap)) {
      return paramzzaap.zza;
    }
    throw zzce.zza(null, null);
  }
  
  public static boolean zzc(zzfd paramzzfd, zzabb paramzzabb, int paramInt, zzaaw paramzzaaw)
  {
    int j = paramzzfd.zzc();
    long l1 = paramzzfd.zzs();
    long l2 = l1 >>> 16;
    if (l2 != paramInt) {
      return false;
    }
    boolean bool;
    if ((l2 & 1L) == 1L) {
      bool = true;
    } else {
      bool = false;
    }
    paramInt = (int)(l1 >> 4 & 0xF);
    if (paramInt <= 7 ? paramInt == paramzzabb.zzg - 1 : (paramInt <= 10) && (paramzzabb.zzg == 2))
    {
      paramInt = (int)(l1 >> 1 & 0x7);
      if (((paramInt == 0) || (paramInt == paramzzabb.zzi)) && ((l1 & 1L) != 1L) && (zzd(paramzzfd, paramzzabb, bool, paramzzaaw)))
      {
        paramInt = zza(paramzzfd, (int)(l1 >> 12 & 0xF));
        if ((paramInt != -1) && (paramInt <= paramzzabb.zzb))
        {
          int k = paramzzabb.zze;
          int m = (int)(l1 >> 8 & 0xF);
          if (m != 0) {
            if (m <= 11)
            {
              if (m != paramzzabb.zzf) {
                break label297;
              }
            }
            else if (m == 12)
            {
              if (paramzzfd.zzk() * 1000 != k) {
                break label297;
              }
            }
            else
            {
              if (m > 14) {
                break label297;
              }
              i = paramzzfd.zzo();
              paramInt = i;
              if (m == 14) {
                paramInt = i * 10;
              }
              if (paramInt != k) {
                break label297;
              }
            }
          }
          int i = paramzzfd.zzk();
          paramInt = paramzzfd.zzc();
          if (i == zzfn.zze(paramzzfd.zzH(), j, paramInt - 1, 0)) {
            return true;
          }
        }
      }
    }
    label297:
    return false;
  }
  
  private static boolean zzd(zzfd paramzzfd, zzabb paramzzabb, boolean paramBoolean, zzaaw paramzzaaw)
  {
    try
    {
      long l = paramzzfd.zzu();
      if (!paramBoolean) {
        l *= paramzzabb.zzb;
      }
      paramzzaaw.zza = l;
      return true;
    }
    catch (NumberFormatException paramzzfd) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */