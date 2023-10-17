package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgpi
  extends IOException
{
  private zzgqg zza = null;
  private boolean zzb;
  
  public zzgpi(IOException paramIOException)
  {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  public zzgpi(String paramString)
  {
    super(paramString);
  }
  
  static zzgph zza()
  {
    return new zzgph("Protocol message tag had invalid wire type.");
  }
  
  static zzgpi zzb()
  {
    return new zzgpi("Protocol message end-group tag did not match expected tag.");
  }
  
  static zzgpi zzc()
  {
    return new zzgpi("Protocol message contained an invalid tag (zero).");
  }
  
  static zzgpi zzd()
  {
    return new zzgpi("Protocol message had invalid UTF-8.");
  }
  
  static zzgpi zze()
  {
    return new zzgpi("CodedInputStream encountered a malformed varint.");
  }
  
  static zzgpi zzf()
  {
    return new zzgpi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static zzgpi zzg()
  {
    return new zzgpi("Failed to parse the message.");
  }
  
  static zzgpi zzi()
  {
    return new zzgpi("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  static zzgpi zzj()
  {
    return new zzgpi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final zzgpi zzh(zzgqg paramzzgqg)
  {
    this.zza = paramzzgqg;
    return this;
  }
  
  final void zzk()
  {
    this.zzb = true;
  }
  
  final boolean zzl()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */