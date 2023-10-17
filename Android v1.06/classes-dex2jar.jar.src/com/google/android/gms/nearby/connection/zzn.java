package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;

public final class zzn
{
  private String zza;
  private String zzb;
  private BluetoothDevice zzc;
  private byte[] zzd;
  
  public final zzn zza(String paramString)
  {
    this.zza = paramString;
    return this;
  }
  
  public final zzn zzb(String paramString)
  {
    this.zzb = paramString;
    return this;
  }
  
  public final zzn zzc(BluetoothDevice paramBluetoothDevice)
  {
    this.zzc = paramBluetoothDevice;
    this.zzb = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
    this.zzd = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
    return this;
  }
  
  public final zzn zzd(byte[] paramArrayOfByte)
  {
    this.zzd = paramArrayOfByte;
    return this;
  }
  
  public final DiscoveredEndpointInfo zze()
  {
    return new DiscoveredEndpointInfo(this.zza, this.zzb, this.zzc, this.zzd, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */