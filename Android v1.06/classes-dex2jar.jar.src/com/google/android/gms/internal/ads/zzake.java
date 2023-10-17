package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

final class zzake
{
  public static Pair zza(zzaap paramzzaap)
    throws IOException
  {
    paramzzaap.zzj();
    zzakd localzzakd = zzd(1684108385, paramzzaap, new zzfd(8));
    ((zzaae)paramzzaap).zzo(8, false);
    return Pair.create(Long.valueOf(paramzzaap.zzf()), Long.valueOf(localzzakd.zzb));
  }
  
  public static zzakc zzb(zzaap paramzzaap)
    throws IOException
  {
    zzfd localzzfd = new zzfd(16);
    zzakd localzzakd = zzd(1718449184, paramzzaap, localzzfd);
    boolean bool;
    if (localzzakd.zzb >= 16L) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    byte[] arrayOfByte = localzzfd.zzH();
    zzaae localzzaae = (zzaae)paramzzaap;
    localzzaae.zzm(arrayOfByte, 0, 16, false);
    localzzfd.zzF(0);
    int k = localzzfd.zzi();
    int i1 = localzzfd.zzi();
    int j = localzzfd.zzh();
    int n = localzzfd.zzh();
    int m = localzzfd.zzi();
    int i2 = localzzfd.zzi();
    int i = (int)localzzakd.zzb - 16;
    if (i > 0)
    {
      arrayOfByte = new byte[i];
      localzzaae.zzm(arrayOfByte, 0, i, false);
    }
    else
    {
      arrayOfByte = zzfn.zzf;
    }
    localzzaae.zzo((int)(paramzzaap.zze() - paramzzaap.zzf()), false);
    return new zzakc(k, i1, j, n, m, i2, arrayOfByte);
  }
  
  public static boolean zzc(zzaap paramzzaap)
    throws IOException
  {
    zzfd localzzfd = new zzfd(8);
    int i = zzakd.zza(paramzzaap, localzzfd).zza;
    if ((i != 1380533830) && (i != 1380333108)) {
      return false;
    }
    byte[] arrayOfByte = localzzfd.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 4, false);
    localzzfd.zzF(0);
    i = localzzfd.zze();
    if (i != 1463899717)
    {
      paramzzaap = new StringBuilder();
      paramzzaap.append("Unsupported form type: ");
      paramzzaap.append(i);
      zzer.zzb("WavHeaderReader", paramzzaap.toString());
      return false;
    }
    return true;
  }
  
  private static zzakd zzd(int paramInt, zzaap paramzzaap, zzfd paramzzfd)
    throws IOException
  {
    for (zzakd localzzakd = zzakd.zza(paramzzaap, paramzzfd);; localzzakd = zzakd.zza(paramzzaap, paramzzfd))
    {
      int i = localzzakd.zza;
      if (i == paramInt) {
        break label131;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring unknown WAV chunk: ");
      localStringBuilder.append(i);
      zzer.zze("WavHeaderReader", localStringBuilder.toString());
      long l = localzzakd.zzb + 8L;
      if (l > 2147483647L) {
        break;
      }
      i = (int)l;
      ((zzaae)paramzzaap).zzo(i, false);
    }
    paramInt = localzzakd.zza;
    paramzzaap = new StringBuilder();
    paramzzaap.append("Chunk is too large (~2GB+) to skip; id: ");
    paramzzaap.append(paramInt);
    throw zzce.zzc(paramzzaap.toString());
    label131:
    return localzzakd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */