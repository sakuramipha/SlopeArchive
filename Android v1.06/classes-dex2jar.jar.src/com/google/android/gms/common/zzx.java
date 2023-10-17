package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

final class zzx
{
  private String zza = null;
  private long zzb = -1L;
  private zzag<byte[]> zzc = zzag.zzl();
  private zzag<byte[]> zzd = zzag.zzl();
  
  final zzx zza(long paramLong)
  {
    this.zzb = paramLong;
    return this;
  }
  
  final zzx zzb(List<byte[]> paramList)
  {
    Preconditions.checkNotNull(paramList);
    this.zzd = zzag.zzk(paramList);
    return this;
  }
  
  final zzx zzc(List<byte[]> paramList)
  {
    Preconditions.checkNotNull(paramList);
    this.zzc = zzag.zzk(paramList);
    return this;
  }
  
  final zzx zzd(String paramString)
  {
    this.zza = paramString;
    return this;
  }
  
  final zzz zze()
  {
    if (this.zza != null)
    {
      if (this.zzb >= 0L)
      {
        if ((this.zzc.isEmpty()) && (this.zzd.isEmpty())) {
          throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzz(this.zza, this.zzb, this.zzc, this.zzd, null);
      }
      throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
    }
    throw new IllegalStateException("packageName must be defined");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */