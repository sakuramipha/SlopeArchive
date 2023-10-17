package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgod
  extends zzgnd
{
  private static final Logger zza = Logger.getLogger(zzgod.class.getName());
  private static final boolean zzb = zzgsa.zzA();
  public static final int zzf = 0;
  zzgoe zze;
  
  public static int zzA(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((paramInt & 0xF0000000) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int zzB(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if (paramLong < 0L) {
      return 10;
    }
    if ((0xFFFFFFF800000000 & paramLong) != 0L)
    {
      j = 6;
      paramLong >>>= 28;
    }
    else
    {
      j = 2;
    }
    int i = j;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      l = paramLong >>> 14;
      i = j + 2;
    }
    int j = i;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      j = i + 1;
    }
    return j;
  }
  
  public static zzgod zzC(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new zzgnz(paramArrayOfByte, 0, paramInt2);
  }
  
  @Deprecated
  static int zzw(int paramInt, zzgqg paramzzgqg, zzgqz paramzzgqz)
  {
    int i = ((zzgmx)paramzzgqg).zzat(paramzzgqz);
    paramInt = zzA(paramInt << 3);
    return paramInt + paramInt + i;
  }
  
  public static int zzx(int paramInt)
  {
    if (paramInt >= 0) {
      return zzA(paramInt);
    }
    return 10;
  }
  
  static int zzy(zzgqg paramzzgqg, zzgqz paramzzgqz)
  {
    int i = ((zzgmx)paramzzgqg).zzat(paramzzgqz);
    return zzA(i) + i;
  }
  
  public static int zzz(String paramString)
  {
    int i;
    try
    {
      i = zzgsf.zze(paramString);
    }
    catch (zzgse localzzgse)
    {
      i = paramString.getBytes(zzgpg.zzb).length;
    }
    return zzA(i) + i;
  }
  
  public final void zzD()
  {
    if (zzb() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  final void zzE(String paramString, zzgse paramzzgse)
    throws IOException
  {
    zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzzgse);
    paramString = paramString.getBytes(zzgpg.zzb);
    try
    {
      int i = paramString.length;
      zzs(i);
      zza(paramString, 0, i);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzgoa(paramString);
    }
  }
  
  public abstract void zzI()
    throws IOException;
  
  public abstract void zzJ(byte paramByte)
    throws IOException;
  
  public abstract void zzK(int paramInt, boolean paramBoolean)
    throws IOException;
  
  public abstract void zzL(int paramInt, zzgno paramzzgno)
    throws IOException;
  
  public abstract void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract int zzb();
  
  public abstract void zzh(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzi(int paramInt)
    throws IOException;
  
  public abstract void zzj(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void zzk(long paramLong)
    throws IOException;
  
  public abstract void zzl(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzm(int paramInt)
    throws IOException;
  
  abstract void zzn(int paramInt, zzgqg paramzzgqg, zzgqz paramzzgqz)
    throws IOException;
  
  public abstract void zzo(int paramInt, String paramString)
    throws IOException;
  
  public abstract void zzq(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzr(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzs(int paramInt)
    throws IOException;
  
  public abstract void zzt(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void zzu(long paramLong)
    throws IOException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */