package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class zzaae
  implements zzaap
{
  private final byte[] zza;
  private final zzt zzb;
  private final long zzc;
  private long zzd;
  private byte[] zze;
  private int zzf;
  private int zzg;
  
  static
  {
    zzbr.zzb("media3.extractor");
  }
  
  public zzaae(zzt paramzzt, long paramLong1, long paramLong2)
  {
    this.zzb = paramzzt;
    this.zzd = paramLong1;
    this.zzc = paramLong2;
    this.zze = new byte[65536];
    this.zza = new byte['က'];
  }
  
  private final int zzp(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.zzg;
    if (i == 0) {
      return 0;
    }
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(this.zze, 0, paramArrayOfByte, paramInt1, paramInt2);
    zzu(paramInt2);
    return paramInt2;
  }
  
  private final int zzq(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws IOException
  {
    if (!Thread.interrupted())
    {
      paramInt1 = this.zzb.zza(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
      if (paramInt1 == -1)
      {
        if ((paramInt3 == 0) && (paramBoolean)) {
          return -1;
        }
        throw new EOFException();
      }
      return paramInt3 + paramInt1;
    }
    throw new InterruptedIOException();
  }
  
  private final int zzr(int paramInt)
  {
    paramInt = Math.min(this.zzg, paramInt);
    zzu(paramInt);
    return paramInt;
  }
  
  private final void zzs(int paramInt)
  {
    if (paramInt != -1) {
      this.zzd += paramInt;
    }
  }
  
  private final void zzt(int paramInt)
  {
    int i = this.zzf + paramInt;
    paramInt = this.zze.length;
    if (i > paramInt)
    {
      paramInt = Math.max(65536 + i, Math.min(paramInt + paramInt, i + 524288));
      this.zze = Arrays.copyOf(this.zze, paramInt);
    }
  }
  
  private final void zzu(int paramInt)
  {
    int i = this.zzg - paramInt;
    this.zzg = i;
    this.zzf = 0;
    byte[] arrayOfByte2 = this.zze;
    byte[] arrayOfByte1;
    if (i < arrayOfByte2.length - 524288) {
      arrayOfByte1 = new byte[65536 + i];
    } else {
      arrayOfByte1 = arrayOfByte2;
    }
    System.arraycopy(arrayOfByte2, paramInt, arrayOfByte1, 0, i);
    this.zze = arrayOfByte1;
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int j = zzp(paramArrayOfByte, paramInt1, paramInt2);
    int i = j;
    if (j == 0) {
      i = zzq(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    zzs(i);
    return i;
  }
  
  public final int zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzt(paramInt2);
    int j = this.zzg;
    int i = this.zzf;
    j -= i;
    if (j == 0)
    {
      paramInt2 = zzq(this.zze, i, paramInt2, 0, true);
      if (paramInt2 == -1) {
        return -1;
      }
      this.zzg += paramInt2;
    }
    else
    {
      paramInt2 = Math.min(paramInt2, j);
    }
    System.arraycopy(this.zze, this.zzf, paramArrayOfByte, paramInt1, paramInt2);
    this.zzf += paramInt2;
    return paramInt2;
  }
  
  public final int zzc(int paramInt)
    throws IOException
  {
    int i = zzr(1);
    paramInt = i;
    if (i == 0) {
      paramInt = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
    }
    zzs(paramInt);
    return paramInt;
  }
  
  public final long zzd()
  {
    return this.zzc;
  }
  
  public final long zze()
  {
    return this.zzd + this.zzf;
  }
  
  public final long zzf()
  {
    return this.zzd;
  }
  
  public final void zzg(int paramInt)
    throws IOException
  {
    zzl(paramInt, false);
  }
  
  public final void zzh(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzm(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public final void zzi(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    zzn(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public final void zzj()
  {
    this.zzf = 0;
  }
  
  public final void zzk(int paramInt)
    throws IOException
  {
    zzo(paramInt, false);
  }
  
  public final boolean zzl(int paramInt, boolean paramBoolean)
    throws IOException
  {
    zzt(paramInt);
    int i = this.zzg - this.zzf;
    while (i < paramInt)
    {
      i = zzq(this.zze, this.zzf, paramInt, i, paramBoolean);
      if (i == -1) {
        return false;
      }
      this.zzg = (this.zzf + i);
    }
    this.zzf += paramInt;
    return true;
  }
  
  public final boolean zzm(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException
  {
    if (!zzl(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(this.zze, this.zzf - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public final boolean zzn(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException
  {
    for (int i = zzp(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = zzq(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean)) {}
    zzs(i);
    return i != -1;
  }
  
  public final boolean zzo(int paramInt, boolean paramBoolean)
    throws IOException
  {
    int j;
    for (int i = zzr(paramInt); (i < paramInt) && (i != -1); i = zzq(this.zza, -i, j, i, false)) {
      j = Math.min(paramInt, i + 4096);
    }
    zzs(i);
    return i != -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */