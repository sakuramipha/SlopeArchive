package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class zzuv
{
  private final zzfd zza;
  private zzuu zzb;
  private zzuu zzc;
  private zzuu zzd;
  private long zze;
  private final zzxm zzf;
  
  public zzuv(zzxm paramzzxm)
  {
    this.zzf = paramzzxm;
    this.zza = new zzfd(32);
    paramzzxm = new zzuu(0L, 65536);
    this.zzb = paramzzxm;
    this.zzc = paramzzxm;
    this.zzd = paramzzxm;
  }
  
  private final int zzi(int paramInt)
  {
    zzuu localzzuu2 = this.zzd;
    if (localzzuu2.zzc == null)
    {
      zzxf localzzxf = this.zzf.zzb();
      zzuu localzzuu1 = new zzuu(this.zzd.zzb, 65536);
      localzzuu2.zzc = localzzxf;
      localzzuu2.zzd = localzzuu1;
    }
    return Math.min(paramInt, (int)(this.zzd.zzb - this.zze));
  }
  
  private static zzuu zzj(zzuu paramzzuu, long paramLong)
  {
    while (paramLong >= paramzzuu.zzb) {
      paramzzuu = paramzzuu.zzd;
    }
    return paramzzuu;
  }
  
  private static zzuu zzk(zzuu paramzzuu, long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    paramzzuu = zzj(paramzzuu, paramLong);
    while (paramInt > 0)
    {
      int j = Math.min(paramInt, (int)(paramzzuu.zzb - paramLong));
      paramByteBuffer.put(paramzzuu.zzc.zza, paramzzuu.zza(paramLong), j);
      int i = paramInt - j;
      long l = paramLong + j;
      paramLong = l;
      paramInt = i;
      if (l == paramzzuu.zzb)
      {
        paramzzuu = paramzzuu.zzd;
        paramLong = l;
        paramInt = i;
      }
    }
    return paramzzuu;
  }
  
  private static zzuu zzl(zzuu paramzzuu, long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    paramzzuu = zzj(paramzzuu, paramLong);
    int i = paramInt;
    while (i > 0)
    {
      int k = Math.min(i, (int)(paramzzuu.zzb - paramLong));
      System.arraycopy(paramzzuu.zzc.zza, paramzzuu.zza(paramLong), paramArrayOfByte, paramInt - i, k);
      int j = i - k;
      long l = paramLong + k;
      i = j;
      paramLong = l;
      if (l == paramzzuu.zzb)
      {
        paramzzuu = paramzzuu.zzd;
        i = j;
        paramLong = l;
      }
    }
    return paramzzuu;
  }
  
  private static zzuu zzm(zzuu paramzzuu, zzhi paramzzhi, zzux paramzzux, zzfd paramzzfd)
  {
    int i;
    if (paramzzhi.zzl())
    {
      long l1 = paramzzux.zzb;
      paramzzfd.zzC(1);
      paramzzuu = zzl(paramzzuu, l1, paramzzfd.zzH(), 1);
      l1 += 1L;
      Object localObject1 = paramzzfd.zzH();
      int k = 0;
      int j = localObject1[0];
      i = j & 0x7F;
      zzhf localzzhf = paramzzhi.zza;
      localObject1 = localzzhf.zza;
      if (localObject1 == null) {
        localzzhf.zza = new byte[16];
      } else {
        Arrays.fill((byte[])localObject1, (byte)0);
      }
      if ((j & 0x80) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      paramzzuu = zzl(paramzzuu, l1, localzzhf.zza, i);
      l1 += i;
      if (j != 0)
      {
        paramzzfd.zzC(2);
        paramzzuu = zzl(paramzzuu, l1, paramzzfd.zzH(), 2);
        l1 += 2L;
        i = paramzzfd.zzo();
      }
      else
      {
        i = 1;
      }
      Object localObject2 = localzzhf.zzd;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (localObject2.length >= i) {}
      }
      else
      {
        localObject1 = new int[i];
      }
      Object localObject3 = localzzhf.zze;
      if (localObject3 != null)
      {
        localObject2 = localObject3;
        if (localObject3.length >= i) {}
      }
      else
      {
        localObject2 = new int[i];
      }
      if (j != 0)
      {
        j = i * 6;
        paramzzfd.zzC(j);
        localObject3 = zzl(paramzzuu, l1, paramzzfd.zzH(), j);
        l2 = l1 + j;
        paramzzfd.zzF(0);
        for (j = k;; j++)
        {
          l1 = l2;
          paramzzuu = (zzuu)localObject3;
          if (j >= i) {
            break;
          }
          localObject1[j] = paramzzfd.zzo();
          localObject2[j] = paramzzfd.zzn();
        }
      }
      localObject1[0] = 0;
      localObject2[0] = (paramzzux.zza - (int)(l1 - paramzzux.zzb));
      localObject3 = paramzzux.zzc;
      j = zzfn.zza;
      localzzhf.zzc(i, (int[])localObject1, (int[])localObject2, ((zzabq)localObject3).zzb, localzzhf.zza, ((zzabq)localObject3).zza, ((zzabq)localObject3).zzc, ((zzabq)localObject3).zzd);
      long l2 = paramzzux.zzb;
      i = (int)(l1 - l2);
      paramzzux.zzb = (l2 + i);
      paramzzux.zza -= i;
    }
    if (paramzzhi.zze())
    {
      paramzzfd.zzC(4);
      paramzzuu = zzl(paramzzuu, paramzzux.zzb, paramzzfd.zzH(), 4);
      i = paramzzfd.zzn();
      paramzzux.zzb += 4L;
      paramzzux.zza -= 4;
      paramzzhi.zzj(i);
      paramzzfd = zzk(paramzzuu, paramzzux.zzb, paramzzhi.zzb, i);
      paramzzux.zzb += i;
      i = paramzzux.zza - i;
      paramzzux.zza = i;
      paramzzuu = paramzzhi.zze;
      if ((paramzzuu != null) && (paramzzuu.capacity() >= i)) {
        paramzzhi.zze.clear();
      } else {
        paramzzhi.zze = ByteBuffer.allocate(i);
      }
      paramzzuu = zzk(paramzzfd, paramzzux.zzb, paramzzhi.zze, paramzzux.zza);
    }
    else
    {
      paramzzhi.zzj(paramzzux.zza);
      paramzzuu = zzk(paramzzuu, paramzzux.zzb, paramzzhi.zzb, paramzzux.zza);
    }
    return paramzzuu;
  }
  
  private final void zzn(int paramInt)
  {
    long l = this.zze + paramInt;
    this.zze = l;
    zzuu localzzuu = this.zzd;
    if (l == localzzuu.zzb) {
      this.zzd = localzzuu.zzd;
    }
  }
  
  public final int zza(zzt paramzzt, int paramInt, boolean paramBoolean)
    throws IOException
  {
    paramInt = zzi(paramInt);
    zzuu localzzuu = this.zzd;
    paramInt = paramzzt.zza(localzzuu.zzc.zza, localzzuu.zza(this.zze), paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    zzn(paramInt);
    return paramInt;
  }
  
  public final long zzb()
  {
    return this.zze;
  }
  
  public final void zzc(long paramLong)
  {
    if (paramLong != -1L)
    {
      zzuu localzzuu;
      for (;;)
      {
        localzzuu = this.zzb;
        if (paramLong < localzzuu.zzb) {
          break;
        }
        this.zzf.zzc(localzzuu.zzc);
        this.zzb = this.zzb.zzb();
      }
      if (this.zzc.zza < localzzuu.zza) {
        this.zzc = localzzuu;
      }
    }
  }
  
  public final void zzd(zzhi paramzzhi, zzux paramzzux)
  {
    zzm(this.zzc, paramzzhi, paramzzux, this.zza);
  }
  
  public final void zze(zzhi paramzzhi, zzux paramzzux)
  {
    this.zzc = zzm(this.zzc, paramzzhi, paramzzux, this.zza);
  }
  
  public final void zzf()
  {
    zzuu localzzuu = this.zzb;
    if (localzzuu.zzc != null)
    {
      this.zzf.zzd(localzzuu);
      localzzuu.zzb();
    }
    this.zzb.zze(0L, 65536);
    localzzuu = this.zzb;
    this.zzc = localzzuu;
    this.zzd = localzzuu;
    this.zze = 0L;
    this.zzf.zzg();
  }
  
  public final void zzg()
  {
    this.zzc = this.zzb;
  }
  
  public final void zzh(zzfd paramzzfd, int paramInt)
  {
    while (paramInt > 0)
    {
      int i = zzi(paramInt);
      zzuu localzzuu = this.zzd;
      paramzzfd.zzB(localzzuu.zzc.zza, localzzuu.zza(this.zze), i);
      paramInt -= i;
      zzn(i);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzuv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */