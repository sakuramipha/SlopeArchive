package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

public final class zzaas
{
  public static int zza(zzaap paramzzaap, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = paramzzaap.zzb(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    return i;
  }
  
  @Pure
  public static void zzb(boolean paramBoolean, String paramString)
    throws zzce
  {
    if (paramBoolean) {
      return;
    }
    throw zzce.zza(paramString, null);
  }
  
  public static boolean zzc(zzaap paramzzaap, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException
  {
    try
    {
      boolean bool = paramzzaap.zzm(paramArrayOfByte, 0, paramInt2, paramBoolean);
      return bool;
    }
    catch (EOFException paramzzaap)
    {
      if (paramBoolean) {
        return false;
      }
      throw paramzzaap;
    }
  }
  
  public static boolean zzd(zzaap paramzzaap, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    try
    {
      ((zzaae)paramzzaap).zzn(paramArrayOfByte, paramInt1, paramInt2, false);
      return true;
    }
    catch (EOFException paramzzaap) {}
    return false;
  }
  
  public static boolean zze(zzaap paramzzaap, int paramInt)
    throws IOException
  {
    try
    {
      ((zzaae)paramzzaap).zzo(paramInt, false);
      return true;
    }
    catch (EOFException paramzzaap) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */