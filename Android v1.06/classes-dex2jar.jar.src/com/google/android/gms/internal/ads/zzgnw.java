package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

public abstract class zzgnw
{
  public static final int zzd = 0;
  private static volatile int zze = 100;
  int zza;
  final int zzb;
  zzgnx zzc;
  
  public static int zzF(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }
  
  public static long zzG(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }
  
  public static zzgnw zzH(InputStream paramInputStream, int paramInt)
  {
    return new zzgnu(paramInputStream, 4096, null);
  }
  
  static zzgnw zzI(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new zzgnq(paramArrayOfByte, paramInt1, paramInt2, paramBoolean, null);
    try
    {
      paramArrayOfByte.zze(paramInt2);
      return paramArrayOfByte;
    }
    catch (zzgpi paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public abstract void zzA(int paramInt);
  
  public abstract boolean zzC()
    throws IOException;
  
  public abstract boolean zzD()
    throws IOException;
  
  public abstract boolean zzE(int paramInt)
    throws IOException;
  
  public abstract double zzb()
    throws IOException;
  
  public abstract float zzc()
    throws IOException;
  
  public abstract int zzd();
  
  public abstract int zze(int paramInt)
    throws zzgpi;
  
  public abstract int zzf()
    throws IOException;
  
  public abstract int zzg()
    throws IOException;
  
  public abstract int zzh()
    throws IOException;
  
  public abstract int zzk()
    throws IOException;
  
  public abstract int zzl()
    throws IOException;
  
  public abstract int zzm()
    throws IOException;
  
  public abstract int zzn()
    throws IOException;
  
  public abstract long zzo()
    throws IOException;
  
  public abstract long zzp()
    throws IOException;
  
  public abstract long zzt()
    throws IOException;
  
  public abstract long zzu()
    throws IOException;
  
  public abstract long zzv()
    throws IOException;
  
  public abstract zzgno zzw()
    throws IOException;
  
  public abstract String zzx()
    throws IOException;
  
  public abstract String zzy()
    throws IOException;
  
  public abstract void zzz(int paramInt)
    throws zzgpi;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */