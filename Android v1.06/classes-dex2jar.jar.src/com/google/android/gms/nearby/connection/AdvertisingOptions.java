package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.internal.zzc;
import java.util.Arrays;
import java.util.Locale;

public final class AdvertisingOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();
  private Strategy zza;
  private boolean zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private byte[] zzf;
  private boolean zzg;
  private ParcelUuid zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  private boolean zzn;
  private int zzo;
  private int zzp;
  private byte[] zzq;
  private long zzr;
  private zzv[] zzs;
  private boolean zzt;
  private boolean zzu;
  private boolean zzv;
  
  private AdvertisingOptions()
  {
    this.zzb = true;
    this.zzc = true;
    this.zzd = true;
    this.zze = true;
    this.zzg = false;
    this.zzi = true;
    this.zzj = true;
    this.zzk = true;
    this.zzl = false;
    this.zzm = false;
    this.zzn = false;
    this.zzo = 0;
    this.zzp = 0;
    this.zzr = 0L;
    this.zzt = false;
    this.zzu = true;
    this.zzv = false;
  }
  
  @Deprecated
  public AdvertisingOptions(Strategy paramStrategy)
  {
    this.zzb = true;
    this.zzc = true;
    this.zzd = true;
    this.zze = true;
    this.zzg = false;
    this.zzi = true;
    this.zzj = true;
    this.zzk = true;
    this.zzl = false;
    this.zzm = false;
    this.zzn = false;
    this.zzo = 0;
    this.zzp = 0;
    this.zzr = 0L;
    this.zzt = false;
    this.zzu = true;
    this.zzv = false;
    this.zza = paramStrategy;
  }
  
  AdvertisingOptions(Strategy paramStrategy, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, byte[] paramArrayOfByte1, boolean paramBoolean5, ParcelUuid paramParcelUuid, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, boolean paramBoolean11, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, long paramLong, zzv[] paramArrayOfzzv, boolean paramBoolean12, boolean paramBoolean13, boolean paramBoolean14)
  {
    this.zza = paramStrategy;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramBoolean3;
    this.zze = paramBoolean4;
    this.zzf = paramArrayOfByte1;
    this.zzg = paramBoolean5;
    this.zzh = paramParcelUuid;
    this.zzi = paramBoolean6;
    this.zzj = paramBoolean7;
    this.zzk = paramBoolean8;
    this.zzl = paramBoolean9;
    this.zzm = paramBoolean10;
    this.zzn = paramBoolean11;
    this.zzo = paramInt1;
    this.zzp = paramInt2;
    this.zzq = paramArrayOfByte2;
    this.zzr = paramLong;
    this.zzs = paramArrayOfzzv;
    this.zzt = paramBoolean12;
    this.zzu = paramBoolean13;
    this.zzv = paramBoolean14;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof AdvertisingOptions))
    {
      paramObject = (AdvertisingOptions)paramObject;
      if ((Objects.equal(this.zza, ((AdvertisingOptions)paramObject).zza)) && (Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(((AdvertisingOptions)paramObject).zzb))) && (Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(((AdvertisingOptions)paramObject).zzc))) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((AdvertisingOptions)paramObject).zzd))) && (Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(((AdvertisingOptions)paramObject).zze))) && (Arrays.equals(this.zzf, ((AdvertisingOptions)paramObject).zzf)) && (Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(((AdvertisingOptions)paramObject).zzg))) && (Objects.equal(this.zzh, ((AdvertisingOptions)paramObject).zzh)) && (Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(((AdvertisingOptions)paramObject).zzi))) && (Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(((AdvertisingOptions)paramObject).zzj))) && (Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(((AdvertisingOptions)paramObject).zzk))) && (Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(((AdvertisingOptions)paramObject).zzl))) && (Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(((AdvertisingOptions)paramObject).zzm))) && (Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(((AdvertisingOptions)paramObject).zzn))) && (Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(((AdvertisingOptions)paramObject).zzo))) && (Objects.equal(Integer.valueOf(this.zzp), Integer.valueOf(((AdvertisingOptions)paramObject).zzp))) && (Arrays.equals(this.zzq, ((AdvertisingOptions)paramObject).zzq)) && (Objects.equal(Long.valueOf(this.zzr), Long.valueOf(((AdvertisingOptions)paramObject).zzr))) && (Arrays.equals(this.zzs, ((AdvertisingOptions)paramObject).zzs)) && (Objects.equal(Boolean.valueOf(this.zzt), Boolean.valueOf(((AdvertisingOptions)paramObject).zzt))) && (Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(((AdvertisingOptions)paramObject).zzu))) && (Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(((AdvertisingOptions)paramObject).zzv)))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean getDisruptiveUpgrade()
  {
    return this.zzu;
  }
  
  public boolean getLowPower()
  {
    return this.zzg;
  }
  
  public Strategy getStrategy()
  {
    return this.zza;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)), Boolean.valueOf(this.zzg), this.zzh, Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzo), Integer.valueOf(this.zzp), Integer.valueOf(Arrays.hashCode(this.zzq)), Long.valueOf(this.zzr), Integer.valueOf(Arrays.hashCode(this.zzs)), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv) });
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Strategy localStrategy = this.zza;
    boolean bool11 = this.zzb;
    boolean bool5 = this.zzc;
    boolean bool6 = this.zzd;
    boolean bool9 = this.zze;
    Object localObject1 = this.zzf;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = zzc.zza((byte[])localObject1);
    }
    boolean bool8 = this.zzg;
    ParcelUuid localParcelUuid = this.zzh;
    boolean bool1 = this.zzi;
    boolean bool10 = this.zzj;
    boolean bool2 = this.zzk;
    boolean bool3 = this.zzl;
    boolean bool7 = this.zzm;
    boolean bool4 = this.zzn;
    int j = this.zzo;
    int i = this.zzp;
    Object localObject2 = this.zzq;
    if (localObject2 == null) {
      localObject2 = "null";
    } else {
      localObject2 = zzc.zza((byte[])localObject2);
    }
    return String.format(localLocale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s}", new Object[] { localStrategy, Boolean.valueOf(bool11), Boolean.valueOf(bool5), Boolean.valueOf(bool6), Boolean.valueOf(bool9), localObject1, Boolean.valueOf(bool8), localParcelUuid, Boolean.valueOf(bool1), Boolean.valueOf(bool10), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool7), Boolean.valueOf(bool4), Integer.valueOf(j), Integer.valueOf(i), localObject2, Long.valueOf(this.zzr), Arrays.toString(this.zzs), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, getStrategy(), paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zze);
    SafeParcelWriter.writeByteArray(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, getLowPower());
    SafeParcelWriter.writeParcelable(paramParcel, 8, this.zzh, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzk);
    SafeParcelWriter.writeBoolean(paramParcel, 12, this.zzl);
    SafeParcelWriter.writeBoolean(paramParcel, 13, this.zzm);
    SafeParcelWriter.writeBoolean(paramParcel, 14, this.zzn);
    SafeParcelWriter.writeInt(paramParcel, 15, this.zzo);
    SafeParcelWriter.writeInt(paramParcel, 16, this.zzp);
    SafeParcelWriter.writeByteArray(paramParcel, 17, this.zzq, false);
    SafeParcelWriter.writeLong(paramParcel, 18, this.zzr);
    SafeParcelWriter.writeTypedArray(paramParcel, 19, this.zzs, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 20, this.zzt);
    SafeParcelWriter.writeBoolean(paramParcel, 21, getDisruptiveUpgrade());
    SafeParcelWriter.writeBoolean(paramParcel, 22, this.zzv);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public static final class Builder
  {
    private final AdvertisingOptions zza;
    
    public Builder()
    {
      this.zza = new AdvertisingOptions(null);
    }
    
    public Builder(AdvertisingOptions paramAdvertisingOptions)
    {
      AdvertisingOptions localAdvertisingOptions = new AdvertisingOptions(null);
      this.zza = localAdvertisingOptions;
      AdvertisingOptions.zza(localAdvertisingOptions, AdvertisingOptions.zzb(paramAdvertisingOptions));
      AdvertisingOptions.zzc(localAdvertisingOptions, AdvertisingOptions.zzd(paramAdvertisingOptions));
      AdvertisingOptions.zze(localAdvertisingOptions, AdvertisingOptions.zzf(paramAdvertisingOptions));
      AdvertisingOptions.zzg(localAdvertisingOptions, AdvertisingOptions.zzh(paramAdvertisingOptions));
      AdvertisingOptions.zzi(localAdvertisingOptions, AdvertisingOptions.zzj(paramAdvertisingOptions));
      AdvertisingOptions.zzk(localAdvertisingOptions, AdvertisingOptions.zzl(paramAdvertisingOptions));
      AdvertisingOptions.zzm(localAdvertisingOptions, AdvertisingOptions.zzn(paramAdvertisingOptions));
      AdvertisingOptions.zzo(localAdvertisingOptions, AdvertisingOptions.zzp(paramAdvertisingOptions));
      AdvertisingOptions.zzq(localAdvertisingOptions, AdvertisingOptions.zzr(paramAdvertisingOptions));
      AdvertisingOptions.zzs(localAdvertisingOptions, AdvertisingOptions.zzt(paramAdvertisingOptions));
      AdvertisingOptions.zzu(localAdvertisingOptions, AdvertisingOptions.zzv(paramAdvertisingOptions));
      AdvertisingOptions.zzw(localAdvertisingOptions, AdvertisingOptions.zzx(paramAdvertisingOptions));
      AdvertisingOptions.zzy(localAdvertisingOptions, AdvertisingOptions.zzz(paramAdvertisingOptions));
      AdvertisingOptions.zzA(localAdvertisingOptions, AdvertisingOptions.zzB(paramAdvertisingOptions));
      AdvertisingOptions.zzC(localAdvertisingOptions, AdvertisingOptions.zzD(paramAdvertisingOptions));
      AdvertisingOptions.zzE(localAdvertisingOptions, AdvertisingOptions.zzF(paramAdvertisingOptions));
      AdvertisingOptions.zzG(localAdvertisingOptions, AdvertisingOptions.zzH(paramAdvertisingOptions));
      AdvertisingOptions.zzI(localAdvertisingOptions, AdvertisingOptions.zzJ(paramAdvertisingOptions));
      AdvertisingOptions.zzK(localAdvertisingOptions, AdvertisingOptions.zzL(paramAdvertisingOptions));
      AdvertisingOptions.zzM(localAdvertisingOptions, AdvertisingOptions.zzN(paramAdvertisingOptions));
      AdvertisingOptions.zzO(localAdvertisingOptions, AdvertisingOptions.zzP(paramAdvertisingOptions));
      AdvertisingOptions.zzQ(localAdvertisingOptions, AdvertisingOptions.zzR(paramAdvertisingOptions));
    }
    
    public AdvertisingOptions build()
    {
      return this.zza;
    }
    
    public Builder setDisruptiveUpgrade(boolean paramBoolean)
    {
      AdvertisingOptions.zzO(this.zza, paramBoolean);
      return this;
    }
    
    public Builder setLowPower(boolean paramBoolean)
    {
      AdvertisingOptions.zzm(this.zza, paramBoolean);
      return this;
    }
    
    public Builder setStrategy(Strategy paramStrategy)
    {
      AdvertisingOptions.zza(this.zza, paramStrategy);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\AdvertisingOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */