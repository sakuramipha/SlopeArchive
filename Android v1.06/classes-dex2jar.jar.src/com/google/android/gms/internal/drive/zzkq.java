package com.google.android.gms.internal.drive;

import java.io.IOException;

public class zzkq
  extends IOException
{
  private zzlq zzsq = null;
  
  public zzkq(String paramString)
  {
    super(paramString);
  }
  
  static zzkq zzdi()
  {
    return new zzkq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static zzkq zzdj()
  {
    return new zzkq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static zzkq zzdk()
  {
    return new zzkq("Protocol message contained an invalid tag (zero).");
  }
  
  static zzkr zzdl()
  {
    return new zzkr("Protocol message tag had invalid wire type.");
  }
  
  static zzkq zzdm()
  {
    return new zzkq("Failed to parse the message.");
  }
  
  static zzkq zzdn()
  {
    return new zzkq("Protocol message had invalid UTF-8.");
  }
  
  public final zzkq zzg(zzlq paramzzlq)
  {
    this.zzsq = paramzzlq;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */