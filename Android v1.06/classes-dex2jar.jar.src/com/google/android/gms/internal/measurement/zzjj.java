package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzjj
  extends zzir
{
  private static final Logger zzb = Logger.getLogger(zzjj.class.getName());
  private static final boolean zzc = zzmv.zzx();
  zzjk zza;
  
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
      paramLong >>>= 28;
      j = 6;
    }
    else
    {
      j = 2;
    }
    int i = j;
    long l = paramLong;
    if ((0xFFFFFFFFFFE00000 & paramLong) != 0L)
    {
      i = j + 2;
      l = paramLong >>> 14;
    }
    int j = i;
    if ((l & 0xFFFFFFFFFFFFC000) != 0L) {
      j = i + 1;
    }
    return j;
  }
  
  public static zzjj zzC(byte[] paramArrayOfByte)
  {
    return new zzjg(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int zzt(zzjb paramzzjb)
  {
    int i = paramzzjb.zzd();
    return zzA(i) + i;
  }
  
  @Deprecated
  static int zzu(int paramInt, zzlj paramzzlj, zzlu paramzzlu)
  {
    int j = zzA(paramInt << 3);
    paramzzlj = (zzil)paramzzlj;
    int i = paramzzlj.zzbu();
    paramInt = i;
    if (i == -1)
    {
      paramInt = paramzzlu.zza(paramzzlj);
      paramzzlj.zzbx(paramInt);
    }
    return j + j + paramInt;
  }
  
  public static int zzv(int paramInt)
  {
    if (paramInt >= 0) {
      return zzA(paramInt);
    }
    return 10;
  }
  
  public static int zzw(zzkp paramzzkp)
  {
    int i = paramzzkp.zza();
    return zzA(i) + i;
  }
  
  static int zzx(zzlj paramzzlj, zzlu paramzzlu)
  {
    paramzzlj = (zzil)paramzzlj;
    int j = paramzzlj.zzbu();
    int i = j;
    if (j == -1)
    {
      i = paramzzlu.zza(paramzzlj);
      paramzzlj.zzbx(i);
    }
    return zzA(i) + i;
  }
  
  public static int zzy(String paramString)
  {
    int i;
    try
    {
      i = zzna.zzc(paramString);
    }
    catch (zzmz localzzmz)
    {
      i = paramString.getBytes(zzkk.zzb).length;
    }
    return zzA(i) + i;
  }
  
  public static int zzz(int paramInt)
  {
    return zzA(paramInt << 3);
  }
  
  public final void zzD()
  {
    if (zza() == 0) {
      return;
    }
    throw new IllegalStateException("Did not write as much data as expected.");
  }
  
  final void zzE(String paramString, zzmz paramzzmz)
    throws IOException
  {
    zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramzzmz);
    paramString = paramString.getBytes(zzkk.zzb);
    try
    {
      int i = paramString.length;
      zzq(i);
      zzl(paramString, 0, i);
      return;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      throw new zzjh(paramString);
    }
  }
  
  public abstract int zza();
  
  public abstract void zzb(byte paramByte)
    throws IOException;
  
  public abstract void zzd(int paramInt, boolean paramBoolean)
    throws IOException;
  
  public abstract void zze(int paramInt, zzjb paramzzjb)
    throws IOException;
  
  public abstract void zzf(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzg(int paramInt)
    throws IOException;
  
  public abstract void zzh(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void zzi(long paramLong)
    throws IOException;
  
  public abstract void zzj(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzk(int paramInt)
    throws IOException;
  
  public abstract void zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzm(int paramInt, String paramString)
    throws IOException;
  
  public abstract void zzo(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzp(int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract void zzq(int paramInt)
    throws IOException;
  
  public abstract void zzr(int paramInt, long paramLong)
    throws IOException;
  
  public abstract void zzs(long paramLong)
    throws IOException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */