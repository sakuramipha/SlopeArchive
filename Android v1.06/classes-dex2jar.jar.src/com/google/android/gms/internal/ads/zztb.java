package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

final class zztb
  implements zzfx
{
  private final zzfx zza;
  private final int zzb;
  private final zzta zzc;
  private final byte[] zzd;
  private int zze;
  
  public zztb(zzfx paramzzfx, int paramInt, zzta paramzzta)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    this.zza = paramzzfx;
    this.zzb = paramInt;
    this.zzc = paramzzta;
    this.zzd = new byte[1];
    this.zze = paramInt;
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int j = this.zze;
    int i = j;
    if (j == 0)
    {
      Object localObject = this.zza;
      byte[] arrayOfByte = this.zzd;
      j = 0;
      int m;
      if (((zzfx)localObject).zza(arrayOfByte, 0, 1) != -1)
      {
        i = (this.zzd[0] & 0xFF) << 4;
        if (i != 0)
        {
          localObject = new byte[i];
          int k = i;
          for (;;)
          {
            m = i;
            if (k <= 0) {
              break label131;
            }
            m = this.zza.zza((byte[])localObject, j, k);
            if (m == -1) {
              break;
            }
            j += m;
            k -= m;
          }
        }
      }
      else
      {
        return -1;
        label131:
        while (m > 0)
        {
          i = m - 1;
          if (localObject[i] != 0) {
            break;
          }
          m = i;
        }
        if (m > 0) {
          this.zzc.zza(new zzfd((byte[])localObject, m));
        }
      }
      i = this.zzb;
      this.zze = i;
    }
    paramInt1 = this.zza.zza(paramArrayOfByte, paramInt1, Math.min(i, paramInt2));
    if (paramInt1 != -1) {
      this.zze -= paramInt1;
    }
    return paramInt1;
  }
  
  public final long zzb(zzgc paramzzgc)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Uri zzc()
  {
    return this.zza.zzc();
  }
  
  public final void zzd()
  {
    throw new UnsupportedOperationException();
  }
  
  public final Map zze()
  {
    return this.zza.zze();
  }
  
  public final void zzf(zzgz paramzzgz)
  {
    Objects.requireNonNull(paramzzgz);
    this.zza.zzf(paramzzgz);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zztb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */