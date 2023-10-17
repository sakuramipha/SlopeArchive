package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

public final class zzfs
  extends zzfr
{
  private final byte[] zza;
  private Uri zzb;
  private int zzc;
  private int zzd;
  private boolean zze;
  
  public zzfs(byte[] paramArrayOfByte)
  {
    super(false);
    Objects.requireNonNull(paramArrayOfByte);
    if (paramArrayOfByte.length > 0) {
      bool = true;
    }
    zzdy.zzd(bool);
    this.zza = paramArrayOfByte;
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = this.zzd;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(this.zza, this.zzc, paramArrayOfByte, paramInt1, paramInt2);
    this.zzc += paramInt2;
    this.zzd -= paramInt2;
    zzg(paramInt2);
    return paramInt2;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    this.zzb = paramzzgc.zza;
    zzi(paramzzgc);
    long l = paramzzgc.zzf;
    int j = this.zza.length;
    if (l <= j)
    {
      int i = (int)l;
      this.zzc = i;
      i = j - i;
      this.zzd = i;
      l = paramzzgc.zzg;
      if (l != -1L) {
        this.zzd = ((int)Math.min(i, l));
      }
      this.zze = true;
      zzj(paramzzgc);
      l = paramzzgc.zzg;
      if (l != -1L) {
        return l;
      }
      return this.zzd;
    }
    throw new zzfy(2008);
  }
  
  public final Uri zzc()
  {
    return this.zzb;
  }
  
  public final void zzd()
  {
    if (this.zze)
    {
      this.zze = false;
      zzh();
    }
    this.zzb = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */