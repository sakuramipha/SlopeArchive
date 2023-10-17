package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class zzfwx
{
  private final InputStream zza;
  
  private zzfwx(InputStream paramInputStream)
  {
    this.zza = paramInputStream;
  }
  
  public static zzfwx zzb(byte[] paramArrayOfByte)
  {
    return new zzfwx(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public final zzgkh zza()
    throws IOException
  {
    try
    {
      zzgkh localzzgkh = zzgkh.zzg(this.zza, zzgoi.zza());
      return localzzgkh;
    }
    finally
    {
      this.zza.close();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */