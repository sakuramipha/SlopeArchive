package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.internal.zzc;
import java.util.Arrays;
import java.util.Locale;

public final class ConnectionOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzk();
  private boolean zza;
  private boolean zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private boolean zzf;
  private boolean zzg;
  private boolean zzh;
  private byte[] zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  
  private ConnectionOptions()
  {
    this.zza = false;
    this.zzb = true;
    this.zzc = true;
    this.zzd = true;
    this.zze = true;
    this.zzf = true;
    this.zzg = true;
    this.zzh = true;
    this.zzj = false;
    this.zzk = true;
    this.zzl = true;
  }
  
  ConnectionOptions(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, byte[] paramArrayOfByte, boolean paramBoolean9, boolean paramBoolean10, boolean paramBoolean11)
  {
    this.zza = paramBoolean1;
    this.zzb = paramBoolean2;
    this.zzc = paramBoolean3;
    this.zzd = paramBoolean4;
    this.zze = paramBoolean5;
    this.zzf = paramBoolean6;
    this.zzg = paramBoolean7;
    this.zzh = paramBoolean8;
    this.zzi = paramArrayOfByte;
    this.zzj = paramBoolean9;
    this.zzk = paramBoolean10;
    this.zzl = paramBoolean11;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof ConnectionOptions))
    {
      paramObject = (ConnectionOptions)paramObject;
      if ((Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(((ConnectionOptions)paramObject).zza))) && (Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(((ConnectionOptions)paramObject).zzb))) && (Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(((ConnectionOptions)paramObject).zzc))) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((ConnectionOptions)paramObject).zzd))) && (Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(((ConnectionOptions)paramObject).zze))) && (Objects.equal(Boolean.valueOf(this.zzf), Boolean.valueOf(((ConnectionOptions)paramObject).zzf))) && (Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(((ConnectionOptions)paramObject).zzg))) && (Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(((ConnectionOptions)paramObject).zzh))) && (Arrays.equals(this.zzi, ((ConnectionOptions)paramObject).zzi)) && (Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(((ConnectionOptions)paramObject).zzj))) && (Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(((ConnectionOptions)paramObject).zzk))) && (Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(((ConnectionOptions)paramObject).zzl)))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean getDisruptiveUpgrade()
  {
    return this.zzl;
  }
  
  public boolean getLowPower()
  {
    return this.zza;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(Arrays.hashCode(this.zzi)), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl) });
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    boolean bool3 = this.zza;
    boolean bool2 = this.zzb;
    boolean bool6 = this.zzc;
    boolean bool4 = this.zzd;
    boolean bool8 = this.zze;
    boolean bool5 = this.zzf;
    boolean bool1 = this.zzg;
    boolean bool7 = this.zzh;
    Object localObject = this.zzi;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = zzc.zza((byte[])localObject);
    }
    return String.format(localLocale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s}", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool6), Boolean.valueOf(bool4), Boolean.valueOf(bool8), Boolean.valueOf(bool5), Boolean.valueOf(bool1), Boolean.valueOf(bool7), localObject, Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBoolean(paramParcel, 1, getLowPower());
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zze);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zzf);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzg);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeByteArray(paramParcel, 9, this.zzi, false);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzk);
    SafeParcelWriter.writeBoolean(paramParcel, 12, getDisruptiveUpgrade());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public static final class Builder
  {
    private final ConnectionOptions zza;
    
    public Builder()
    {
      this.zza = new ConnectionOptions(null);
    }
    
    public Builder(ConnectionOptions paramConnectionOptions)
    {
      ConnectionOptions localConnectionOptions = new ConnectionOptions(null);
      this.zza = localConnectionOptions;
      ConnectionOptions.zza(localConnectionOptions, ConnectionOptions.zzb(paramConnectionOptions));
      ConnectionOptions.zzc(localConnectionOptions, ConnectionOptions.zzd(paramConnectionOptions));
      ConnectionOptions.zze(localConnectionOptions, ConnectionOptions.zzf(paramConnectionOptions));
      ConnectionOptions.zzg(localConnectionOptions, ConnectionOptions.zzh(paramConnectionOptions));
      ConnectionOptions.zzi(localConnectionOptions, ConnectionOptions.zzj(paramConnectionOptions));
      ConnectionOptions.zzk(localConnectionOptions, ConnectionOptions.zzl(paramConnectionOptions));
      ConnectionOptions.zzm(localConnectionOptions, ConnectionOptions.zzn(paramConnectionOptions));
      ConnectionOptions.zzo(localConnectionOptions, ConnectionOptions.zzp(paramConnectionOptions));
      ConnectionOptions.zzq(localConnectionOptions, ConnectionOptions.zzr(paramConnectionOptions));
      ConnectionOptions.zzs(localConnectionOptions, ConnectionOptions.zzt(paramConnectionOptions));
      ConnectionOptions.zzu(localConnectionOptions, ConnectionOptions.zzv(paramConnectionOptions));
      ConnectionOptions.zzw(localConnectionOptions, ConnectionOptions.zzx(paramConnectionOptions));
    }
    
    public ConnectionOptions build()
    {
      return this.zza;
    }
    
    public Builder setDisruptiveUpgrade(boolean paramBoolean)
    {
      ConnectionOptions.zzw(this.zza, paramBoolean);
      return this;
    }
    
    public Builder setLowPower(boolean paramBoolean)
    {
      ConnectionOptions.zza(this.zza, paramBoolean);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\ConnectionOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */