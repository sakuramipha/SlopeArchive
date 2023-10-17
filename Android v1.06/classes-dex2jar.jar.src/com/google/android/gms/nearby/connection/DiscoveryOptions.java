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

public final class DiscoveryOptions
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzp();
  private Strategy zza;
  private boolean zzb;
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private ParcelUuid zzf;
  private boolean zzg;
  private boolean zzh;
  private boolean zzi;
  private boolean zzj;
  private int zzk;
  private int zzl;
  private byte[] zzm;
  private long zzn;
  
  private DiscoveryOptions()
  {
    this.zzb = false;
    this.zzc = true;
    this.zzd = true;
    this.zze = false;
    this.zzg = true;
    this.zzh = true;
    this.zzi = true;
    this.zzj = false;
    this.zzk = 0;
    this.zzl = 0;
    this.zzn = 0L;
  }
  
  @Deprecated
  public DiscoveryOptions(Strategy paramStrategy)
  {
    this.zzb = false;
    this.zzc = true;
    this.zzd = true;
    this.zze = false;
    this.zzg = true;
    this.zzh = true;
    this.zzi = true;
    this.zzj = false;
    this.zzk = 0;
    this.zzl = 0;
    this.zzn = 0L;
    this.zza = paramStrategy;
  }
  
  DiscoveryOptions(Strategy paramStrategy, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, ParcelUuid paramParcelUuid, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, int paramInt1, int paramInt2, byte[] paramArrayOfByte, long paramLong)
  {
    this.zza = paramStrategy;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramBoolean3;
    this.zze = paramBoolean4;
    this.zzf = paramParcelUuid;
    this.zzg = paramBoolean5;
    this.zzh = paramBoolean6;
    this.zzi = paramBoolean7;
    this.zzj = paramBoolean8;
    this.zzk = paramInt1;
    this.zzl = paramInt2;
    this.zzm = paramArrayOfByte;
    this.zzn = paramLong;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof DiscoveryOptions))
    {
      paramObject = (DiscoveryOptions)paramObject;
      if ((Objects.equal(this.zza, ((DiscoveryOptions)paramObject).zza)) && (Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(((DiscoveryOptions)paramObject).zzb))) && (Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(((DiscoveryOptions)paramObject).zzc))) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((DiscoveryOptions)paramObject).zzd))) && (Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(((DiscoveryOptions)paramObject).zze))) && (Objects.equal(this.zzf, ((DiscoveryOptions)paramObject).zzf)) && (Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(((DiscoveryOptions)paramObject).zzg))) && (Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(((DiscoveryOptions)paramObject).zzh))) && (Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(((DiscoveryOptions)paramObject).zzi))) && (Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(((DiscoveryOptions)paramObject).zzj))) && (Objects.equal(Integer.valueOf(this.zzk), Integer.valueOf(((DiscoveryOptions)paramObject).zzk))) && (Objects.equal(Integer.valueOf(this.zzl), Integer.valueOf(((DiscoveryOptions)paramObject).zzl))) && (Arrays.equals(this.zzm, ((DiscoveryOptions)paramObject).zzm)) && (Objects.equal(Long.valueOf(this.zzn), Long.valueOf(((DiscoveryOptions)paramObject).zzn)))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean getLowPower()
  {
    return this.zze;
  }
  
  public Strategy getStrategy()
  {
    return this.zza;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Long.valueOf(this.zzn) });
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Strategy localStrategy = this.zza;
    boolean bool6 = this.zzb;
    boolean bool7 = this.zzc;
    boolean bool2 = this.zzd;
    boolean bool1 = this.zze;
    ParcelUuid localParcelUuid = this.zzf;
    boolean bool4 = this.zzg;
    boolean bool8 = this.zzh;
    boolean bool3 = this.zzi;
    boolean bool5 = this.zzj;
    int j = this.zzk;
    int i = this.zzl;
    Object localObject = this.zzm;
    if (localObject == null) {
      localObject = "null";
    } else {
      localObject = zzc.zza((byte[])localObject);
    }
    return String.format(localLocale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d}", new Object[] { localStrategy, Boolean.valueOf(bool6), Boolean.valueOf(bool7), Boolean.valueOf(bool2), Boolean.valueOf(bool1), localParcelUuid, Boolean.valueOf(bool4), Boolean.valueOf(bool8), Boolean.valueOf(bool3), Boolean.valueOf(bool5), Integer.valueOf(j), Integer.valueOf(i), localObject, Long.valueOf(this.zzn) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, getStrategy(), paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeBoolean(paramParcel, 5, getLowPower());
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzg);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzh);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 11, this.zzj);
    SafeParcelWriter.writeInt(paramParcel, 12, this.zzk);
    SafeParcelWriter.writeInt(paramParcel, 13, this.zzl);
    SafeParcelWriter.writeByteArray(paramParcel, 14, this.zzm, false);
    SafeParcelWriter.writeLong(paramParcel, 15, this.zzn);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final boolean zza()
  {
    return this.zzh;
  }
  
  public static final class Builder
  {
    private final DiscoveryOptions zza;
    
    public Builder()
    {
      this.zza = new DiscoveryOptions(null);
    }
    
    public Builder(DiscoveryOptions paramDiscoveryOptions)
    {
      DiscoveryOptions localDiscoveryOptions = new DiscoveryOptions(null);
      this.zza = localDiscoveryOptions;
      DiscoveryOptions.zzb(localDiscoveryOptions, DiscoveryOptions.zzc(paramDiscoveryOptions));
      DiscoveryOptions.zzd(localDiscoveryOptions, DiscoveryOptions.zze(paramDiscoveryOptions));
      DiscoveryOptions.zzf(localDiscoveryOptions, DiscoveryOptions.zzg(paramDiscoveryOptions));
      DiscoveryOptions.zzh(localDiscoveryOptions, DiscoveryOptions.zzi(paramDiscoveryOptions));
      DiscoveryOptions.zzj(localDiscoveryOptions, DiscoveryOptions.zzk(paramDiscoveryOptions));
      DiscoveryOptions.zzl(localDiscoveryOptions, DiscoveryOptions.zzm(paramDiscoveryOptions));
      DiscoveryOptions.zzn(localDiscoveryOptions, DiscoveryOptions.zzo(paramDiscoveryOptions));
      DiscoveryOptions.zzp(localDiscoveryOptions, DiscoveryOptions.zzq(paramDiscoveryOptions));
      DiscoveryOptions.zzr(localDiscoveryOptions, DiscoveryOptions.zzs(paramDiscoveryOptions));
      DiscoveryOptions.zzt(localDiscoveryOptions, DiscoveryOptions.zzu(paramDiscoveryOptions));
      DiscoveryOptions.zzv(localDiscoveryOptions, DiscoveryOptions.zzw(paramDiscoveryOptions));
      DiscoveryOptions.zzx(localDiscoveryOptions, DiscoveryOptions.zzy(paramDiscoveryOptions));
      DiscoveryOptions.zzz(localDiscoveryOptions, DiscoveryOptions.zzA(paramDiscoveryOptions));
      DiscoveryOptions.zzB(localDiscoveryOptions, DiscoveryOptions.zzC(paramDiscoveryOptions));
    }
    
    public DiscoveryOptions build()
    {
      return this.zza;
    }
    
    public Builder setLowPower(boolean paramBoolean)
    {
      DiscoveryOptions.zzj(this.zza, paramBoolean);
      return this;
    }
    
    public Builder setStrategy(Strategy paramStrategy)
    {
      DiscoveryOptions.zzb(this.zza, paramStrategy);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\DiscoveryOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */