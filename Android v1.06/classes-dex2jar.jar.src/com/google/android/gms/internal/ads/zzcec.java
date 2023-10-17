package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

final class zzcec
  implements zzfx
{
  private final zzfx zza;
  private final long zzb;
  private final zzfx zzc;
  private long zzd;
  private Uri zze;
  
  zzcec(zzfx paramzzfx1, int paramInt, zzfx paramzzfx2)
  {
    this.zza = paramzzfx1;
    this.zzb = paramInt;
    this.zzc = paramzzfx2;
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    long l1 = this.zzd;
    long l2 = this.zzb;
    int i;
    if (l1 < l2)
    {
      i = (int)Math.min(paramInt2, l2 - l1);
      i = this.zza.zza(paramArrayOfByte, paramInt1, i);
      l1 = this.zzd + i;
      this.zzd = l1;
    }
    else
    {
      i = 0;
    }
    int j = i;
    if (l1 >= this.zzb)
    {
      paramInt1 = this.zzc.zza(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      j = i + paramInt1;
      this.zzd += paramInt1;
    }
    return j;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    this.zze = paramzzgc.zza;
    long l2 = paramzzgc.zzf;
    long l3 = this.zzb;
    zzgc localzzgc2 = null;
    zzgc localzzgc1;
    if (l2 >= l3)
    {
      localzzgc1 = null;
    }
    else
    {
      l1 = paramzzgc.zzg;
      if (l1 != -1L) {
        l1 = Math.min(l1, l3 - l2);
      } else {
        l1 = l3 - l2;
      }
      localzzgc1 = new zzgc(paramzzgc.zza, null, l2, l2, l1, null, 0);
    }
    long l1 = paramzzgc.zzg;
    if ((l1 == -1L) || (paramzzgc.zzf + l1 > this.zzb))
    {
      l2 = Math.max(this.zzb, paramzzgc.zzf);
      l1 = paramzzgc.zzg;
      if (l1 != -1L) {
        l1 = Math.min(l1, paramzzgc.zzf + l1 - this.zzb);
      } else {
        l1 = -1L;
      }
      localzzgc2 = new zzgc(paramzzgc.zza, null, l2, l2, l1, null, 0);
    }
    l2 = 0L;
    if (localzzgc1 != null) {
      l1 = this.zza.zzb(localzzgc1);
    } else {
      l1 = 0L;
    }
    if (localzzgc2 != null) {
      l2 = this.zzc.zzb(localzzgc2);
    }
    this.zzd = paramzzgc.zzf;
    if ((l1 != -1L) && (l2 != -1L)) {
      return l1 + l2;
    }
    return -1L;
  }
  
  public final Uri zzc()
  {
    return this.zze;
  }
  
  public final void zzd()
    throws IOException
  {
    this.zza.zzd();
    this.zzc.zzd();
  }
  
  public final Map zze()
  {
    return zzfru.zzd();
  }
  
  public final void zzf(zzgz paramzzgz) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */