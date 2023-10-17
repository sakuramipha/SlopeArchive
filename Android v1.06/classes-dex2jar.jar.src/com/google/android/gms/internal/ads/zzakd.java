package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzakd
{
  public final int zza;
  public final long zzb;
  
  private zzakd(int paramInt, long paramLong)
  {
    this.zza = paramInt;
    this.zzb = paramLong;
  }
  
  public static zzakd zza(zzaap paramzzaap, zzfd paramzzfd)
    throws IOException
  {
    byte[] arrayOfByte = paramzzfd.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 8, false);
    paramzzfd.zzF(0);
    return new zzakd(paramzzfd.zze(), paramzzfd.zzq());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */