package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzamc
  extends FilterInputStream
{
  private final long zza;
  private long zzb;
  
  zzamc(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.zza = paramLong;
  }
  
  public final int read()
    throws IOException
  {
    int i = super.read();
    if (i != -1) {
      this.zzb += 1L;
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      this.zzb += paramInt1;
    }
    return paramInt1;
  }
  
  final long zza()
  {
    return this.zza - this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */