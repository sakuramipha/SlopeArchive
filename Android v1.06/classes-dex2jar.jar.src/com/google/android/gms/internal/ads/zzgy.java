package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public final class zzgy
  implements zzfx
{
  private final zzfx zza;
  private long zzb;
  private Uri zzc;
  private Map zzd;
  
  public zzgy(zzfx paramzzfx)
  {
    Objects.requireNonNull(paramzzfx);
    this.zza = paramzzfx;
    this.zzc = Uri.EMPTY;
    this.zzd = Collections.emptyMap();
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = this.zza.zza(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      this.zzb += paramInt1;
    }
    return paramInt1;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    this.zzc = paramzzgc.zza;
    this.zzd = Collections.emptyMap();
    long l = this.zza.zzb(paramzzgc);
    paramzzgc = zzc();
    Objects.requireNonNull(paramzzgc);
    this.zzc = paramzzgc;
    this.zzd = zze();
    return l;
  }
  
  public final Uri zzc()
  {
    return this.zza.zzc();
  }
  
  public final void zzd()
    throws IOException
  {
    this.zza.zzd();
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
  
  public final long zzg()
  {
    return this.zzb;
  }
  
  public final Uri zzh()
  {
    return this.zzc;
  }
  
  public final Map zzi()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */