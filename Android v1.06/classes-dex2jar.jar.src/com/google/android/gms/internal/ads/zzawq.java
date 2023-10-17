package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class zzawq
  extends PushbackInputStream
{
  final zzawr zza;
  
  zzawq(zzawr paramzzawr, InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream, 1);
  }
  
  public final void close()
    throws IOException
  {
    try
    {
      zzawt.zze(this.zza.zzc);
      super.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */