package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class zzaan
  implements zzabr
{
  private final byte[] zza = new byte['က'];
  
  public final int zzf(zzt paramzzt, int paramInt1, boolean paramBoolean, int paramInt2)
    throws IOException
  {
    paramInt1 = Math.min(4096, paramInt1);
    paramInt1 = paramzzt.zza(this.zza, 0, paramInt1);
    if (paramInt1 == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt1;
  }
  
  public final void zzk(zzam paramzzam) {}
  
  public final void zzr(zzfd paramzzfd, int paramInt1, int paramInt2)
  {
    paramzzfd.zzG(paramInt1);
  }
  
  public final void zzs(long paramLong, int paramInt1, int paramInt2, int paramInt3, zzabq paramzzabq) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */