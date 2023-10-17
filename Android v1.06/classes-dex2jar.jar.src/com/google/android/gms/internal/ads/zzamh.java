package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

final class zzamh
  extends FilterInputStream
{
  private final HttpURLConnection zza;
  
  zzamh(HttpURLConnection paramHttpURLConnection)
  {
    super(localInputStream2);
    this.zza = paramHttpURLConnection;
  }
  
  public final void close()
    throws IOException
  {
    super.close();
    this.zza.disconnect();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */