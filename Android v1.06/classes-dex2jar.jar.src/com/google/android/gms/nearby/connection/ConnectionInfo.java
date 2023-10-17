package com.google.android.gms.nearby.connection;

import java.util.Locale;

public final class ConnectionInfo
{
  private final String zza;
  private final String zzb;
  private final byte[] zzc;
  private final boolean zzd;
  private final boolean zze;
  private final byte[] zzf;
  
  @Deprecated
  public ConnectionInfo(String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramString2.getBytes(), paramBoolean, false, paramString1.getBytes());
  }
  
  private ConnectionInfo(String paramString1, String paramString2, byte[] paramArrayOfByte1, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramArrayOfByte1;
    this.zzd = paramBoolean1;
    this.zze = paramBoolean2;
    this.zzf = paramArrayOfByte2;
  }
  
  public String getAuthenticationDigits()
  {
    byte[] arrayOfByte = this.zzc;
    int m = arrayOfByte.length;
    int k = 0;
    int j = 0;
    int i = 1;
    while (k < m)
    {
      j = (j + arrayOfByte[k] * i) % 9973;
      i = i * 31 % 9973;
      k++;
    }
    return String.format(Locale.US, "%04d", new Object[] { Integer.valueOf(Math.abs(j)) });
  }
  
  @Deprecated
  public String getAuthenticationToken()
  {
    return this.zzb;
  }
  
  public byte[] getEndpointInfo()
  {
    return this.zzf;
  }
  
  public String getEndpointName()
  {
    return this.zza;
  }
  
  public byte[] getRawAuthenticationToken()
  {
    return this.zzc;
  }
  
  @Deprecated
  public boolean isConnectionVerified()
  {
    return this.zze;
  }
  
  public boolean isIncomingConnection()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\ConnectionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */