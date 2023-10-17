package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

public final class zzfwy
{
  private final OutputStream zza;
  
  private zzfwy(OutputStream paramOutputStream)
  {
    this.zza = paramOutputStream;
  }
  
  public static zzfwy zzb(OutputStream paramOutputStream)
  {
    return new zzfwy(paramOutputStream);
  }
  
  public final void zza(zzgkh paramzzgkh)
    throws IOException
  {
    try
    {
      paramzzgkh.zzaw(this.zza);
      return;
    }
    finally
    {
      this.zza.close();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */