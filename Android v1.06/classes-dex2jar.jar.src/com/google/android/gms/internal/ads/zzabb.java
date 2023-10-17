package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzabb
{
  public final int zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final int zzf;
  public final int zzg;
  public final int zzh;
  public final int zzi;
  public final long zzj;
  public final zzaba zzk;
  private final zzca zzl;
  
  private zzabb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, zzaba paramzzaba, zzca paramzzca)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    this.zzd = paramInt4;
    this.zze = paramInt5;
    this.zzf = zzi(paramInt5);
    this.zzg = paramInt6;
    this.zzh = paramInt7;
    this.zzi = zzh(paramInt7);
    this.zzj = paramLong;
    this.zzk = paramzzaba;
    this.zzl = paramzzca;
  }
  
  public zzabb(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new zzfc(paramArrayOfByte, paramArrayOfByte.length);
    paramArrayOfByte.zzj(paramInt * 8);
    this.zza = paramArrayOfByte.zzd(16);
    this.zzb = paramArrayOfByte.zzd(16);
    this.zzc = paramArrayOfByte.zzd(24);
    this.zzd = paramArrayOfByte.zzd(24);
    paramInt = paramArrayOfByte.zzd(20);
    this.zze = paramInt;
    this.zzf = zzi(paramInt);
    this.zzg = (paramArrayOfByte.zzd(3) + 1);
    paramInt = paramArrayOfByte.zzd(5) + 1;
    this.zzh = paramInt;
    this.zzi = zzh(paramInt);
    int j = paramArrayOfByte.zzd(4);
    paramInt = paramArrayOfByte.zzd(32);
    int i = zzfn.zza;
    long l = paramInt;
    this.zzj = ((j & 0xFFFFFFFF) << 32 | l & 0xFFFFFFFF);
    this.zzk = null;
    this.zzl = null;
  }
  
  private static int zzh(int paramInt)
  {
    if (paramInt != 8)
    {
      if (paramInt != 12)
      {
        if (paramInt != 16)
        {
          if (paramInt != 20)
          {
            if (paramInt != 24) {
              return -1;
            }
            return 6;
          }
          return 5;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  private static int zzi(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 192000: 
      return 3;
    case 176400: 
      return 2;
    case 96000: 
      return 11;
    case 88200: 
      return 1;
    case 48000: 
      return 10;
    case 44100: 
      return 9;
    case 32000: 
      return 8;
    case 24000: 
      return 7;
    case 22050: 
      return 6;
    case 16000: 
      return 5;
    }
    return 4;
  }
  
  public final long zza()
  {
    long l = this.zzj;
    if (l == 0L) {
      return -9223372036854775807L;
    }
    return l * 1000000L / this.zze;
  }
  
  public final long zzb(long paramLong)
  {
    long l1 = this.zze;
    long l2 = this.zzj;
    return Math.max(0L, Math.min(paramLong * l1 / 1000000L, l2 - 1L));
  }
  
  public final zzam zzc(byte[] paramArrayOfByte, zzca paramzzca)
  {
    paramArrayOfByte[4] = Byte.MIN_VALUE;
    int j = this.zzd;
    int i = j;
    if (j <= 0) {
      i = -1;
    }
    zzca localzzca = zzd(paramzzca);
    paramzzca = new zzak();
    paramzzca.zzS("audio/flac");
    paramzzca.zzL(i);
    paramzzca.zzw(this.zzg);
    paramzzca.zzT(this.zze);
    paramzzca.zzI(Collections.singletonList(paramArrayOfByte));
    paramzzca.zzM(localzzca);
    return paramzzca.zzY();
  }
  
  public final zzca zzd(zzca paramzzca)
  {
    zzca localzzca = this.zzl;
    if (localzzca == null) {
      return paramzzca;
    }
    return localzzca.zzd(paramzzca);
  }
  
  public final zzabb zze(List paramList)
  {
    paramList = zzd(new zzca(paramList));
    return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, paramList);
  }
  
  public final zzabb zzf(zzaba paramzzaba)
  {
    return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, paramzzaba, this.zzl);
  }
  
  public final zzabb zzg(List paramList)
  {
    paramList = zzd(zzabx.zzb(paramList));
    return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, paramList);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */