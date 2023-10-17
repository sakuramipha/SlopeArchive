package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

final class zzakm
  extends zzakn
{
  private final byte[] zza;
  
  public zzakm(X509Certificate paramX509Certificate, byte[] paramArrayOfByte)
  {
    super(paramX509Certificate);
    this.zza = paramArrayOfByte;
  }
  
  public final byte[] getEncoded()
    throws CertificateEncodingException
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */