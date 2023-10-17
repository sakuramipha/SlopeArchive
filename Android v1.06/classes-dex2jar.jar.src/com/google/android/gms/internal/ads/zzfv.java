package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;

public final class zzfv
  extends zzfr
{
  private zzgc zza;
  private byte[] zzb;
  private int zzc;
  private int zzd;
  
  public zzfv()
  {
    super(false);
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
    i = Math.min(paramInt2, i);
    byte[] arrayOfByte = this.zzb;
    paramInt2 = zzfn.zza;
    System.arraycopy(arrayOfByte, this.zzc, paramArrayOfByte, paramInt1, i);
    this.zzc += i;
    this.zzd -= i;
    zzg(i);
    return i;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    zzi(paramzzgc);
    this.zza = paramzzgc;
    Uri localUri = paramzzgc.zza;
    Object localObject = localUri.getScheme();
    zzdy.zze("data".equals(localObject), "Unsupported scheme: ".concat(String.valueOf(localObject)));
    localObject = localUri.getSchemeSpecificPart();
    int i = zzfn.zza;
    localObject = ((String)localObject).split(",", -1);
    if (localObject.length == 2)
    {
      localUri = localObject[1];
      if (localObject[0].contains(";base64")) {
        try
        {
          this.zzb = Base64.decode(localUri, 0);
        }
        catch (IllegalArgumentException paramzzgc)
        {
          throw zzce.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(localUri)), paramzzgc);
        }
      } else {
        this.zzb = URLDecoder.decode(localUri, zzfol.zza.name()).getBytes(zzfol.zzc);
      }
      long l = paramzzgc.zzf;
      i = this.zzb.length;
      if (l <= i)
      {
        int j = (int)l;
        this.zzc = j;
        i -= j;
        this.zzd = i;
        l = paramzzgc.zzg;
        if (l != -1L) {
          this.zzd = ((int)Math.min(i, l));
        }
        zzj(paramzzgc);
        l = paramzzgc.zzg;
        if (l != -1L) {
          return l;
        }
        return this.zzd;
      }
      this.zzb = null;
      throw new zzfy(2008);
    }
    throw zzce.zzb("Unexpected URI format: ".concat(String.valueOf(String.valueOf(localUri))), null);
  }
  
  public final Uri zzc()
  {
    zzgc localzzgc = this.zza;
    if (localzzgc != null) {
      return localzzgc.zza;
    }
    return null;
  }
  
  public final void zzd()
  {
    if (this.zzb != null)
    {
      this.zzb = null;
      zzh();
    }
    this.zza = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */