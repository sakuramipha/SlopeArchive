package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PayloadTransferUpdate
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzr();
  private long zza;
  private int zzb;
  private long zzc;
  private long zzd;
  
  private PayloadTransferUpdate() {}
  
  PayloadTransferUpdate(long paramLong1, int paramInt, long paramLong2, long paramLong3)
  {
    this.zza = paramLong1;
    this.zzb = paramInt;
    this.zzc = paramLong2;
    this.zzd = paramLong3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof PayloadTransferUpdate))
    {
      paramObject = (PayloadTransferUpdate)paramObject;
      if ((Objects.equal(Long.valueOf(this.zza), Long.valueOf(((PayloadTransferUpdate)paramObject).zza))) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((PayloadTransferUpdate)paramObject).zzb))) && (Objects.equal(Long.valueOf(this.zzc), Long.valueOf(((PayloadTransferUpdate)paramObject).zzc))) && (Objects.equal(Long.valueOf(this.zzd), Long.valueOf(((PayloadTransferUpdate)paramObject).zzd)))) {
        return true;
      }
    }
    return false;
  }
  
  public long getBytesTransferred()
  {
    return this.zzd;
  }
  
  public long getPayloadId()
  {
    return this.zza;
  }
  
  public int getStatus()
  {
    return this.zzb;
  }
  
  public long getTotalBytes()
  {
    return this.zzc;
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Long.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), Long.valueOf(this.zzd) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 1, getPayloadId());
    SafeParcelWriter.writeInt(paramParcel, 2, getStatus());
    SafeParcelWriter.writeLong(paramParcel, 3, getTotalBytes());
    SafeParcelWriter.writeLong(paramParcel, 4, getBytesTransferred());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public static final class Builder
  {
    private final PayloadTransferUpdate zza;
    
    public Builder()
    {
      this.zza = new PayloadTransferUpdate(null);
    }
    
    public Builder(PayloadTransferUpdate paramPayloadTransferUpdate)
    {
      PayloadTransferUpdate localPayloadTransferUpdate = new PayloadTransferUpdate(null);
      this.zza = localPayloadTransferUpdate;
      PayloadTransferUpdate.zza(localPayloadTransferUpdate, PayloadTransferUpdate.zzb(paramPayloadTransferUpdate));
      PayloadTransferUpdate.zzc(localPayloadTransferUpdate, PayloadTransferUpdate.zzd(paramPayloadTransferUpdate));
      PayloadTransferUpdate.zze(localPayloadTransferUpdate, PayloadTransferUpdate.zzf(paramPayloadTransferUpdate));
      PayloadTransferUpdate.zzg(localPayloadTransferUpdate, PayloadTransferUpdate.zzh(paramPayloadTransferUpdate));
    }
    
    public PayloadTransferUpdate build()
    {
      return this.zza;
    }
    
    public Builder setBytesTransferred(long paramLong)
    {
      PayloadTransferUpdate.zzg(this.zza, paramLong);
      return this;
    }
    
    public Builder setPayloadId(long paramLong)
    {
      PayloadTransferUpdate.zza(this.zza, paramLong);
      return this;
    }
    
    public Builder setStatus(int paramInt)
    {
      PayloadTransferUpdate.zzc(this.zza, paramInt);
      return this;
    }
    
    public Builder setTotalBytes(long paramLong)
    {
      PayloadTransferUpdate.zze(this.zza, paramLong);
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Status
  {
    public static final int CANCELED = 4;
    public static final int FAILURE = 2;
    public static final int IN_PROGRESS = 3;
    public static final int SUCCESS = 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\PayloadTransferUpdate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */