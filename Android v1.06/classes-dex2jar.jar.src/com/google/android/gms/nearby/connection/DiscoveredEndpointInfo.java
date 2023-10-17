package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;

public final class DiscoveredEndpointInfo
{
  private final String zza;
  private final String zzb;
  private final BluetoothDevice zzc;
  private final byte[] zzd;
  
  @Deprecated
  public DiscoveredEndpointInfo(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzd = paramString2.getBytes();
    this.zzc = null;
  }
  
  public byte[] getEndpointInfo()
  {
    return this.zzd;
  }
  
  public String getEndpointName()
  {
    return this.zzb;
  }
  
  public String getServiceId()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\DiscoveredEndpointInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */