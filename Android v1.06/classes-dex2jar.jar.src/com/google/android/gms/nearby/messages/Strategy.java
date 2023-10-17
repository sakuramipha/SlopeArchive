package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

public class Strategy
  extends AbstractSafeParcelable
{
  public static final Strategy BLE_ONLY;
  public static final Parcelable.Creator<Strategy> CREATOR = new zzf();
  public static final Strategy DEFAULT = new Builder().build();
  public static final int DISCOVERY_MODE_BROADCAST = 1;
  public static final int DISCOVERY_MODE_DEFAULT = 3;
  public static final int DISCOVERY_MODE_SCAN = 2;
  public static final int DISTANCE_TYPE_DEFAULT = 0;
  public static final int DISTANCE_TYPE_EARSHOT = 1;
  public static final int TTL_SECONDS_DEFAULT = 300;
  public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
  public static final int TTL_SECONDS_MAX = 86400;
  @Deprecated
  public static final Strategy zza;
  final int zzb;
  @Deprecated
  final int zzc;
  final int zzd;
  final int zze;
  @Deprecated
  final boolean zzf;
  final int zzg;
  final int zzh;
  private final int zzi;
  
  static
  {
    Object localObject = new Builder();
    ((Builder)localObject).zza(2);
    ((Builder)localObject).setTtlSeconds(Integer.MAX_VALUE);
    localObject = ((Builder)localObject).build();
    BLE_ONLY = (Strategy)localObject;
    zza = (Strategy)localObject;
  }
  
  Strategy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7)
  {
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    if (paramInt2 == 0) {}
    do
    {
      this.zzh = paramInt6;
      break label56;
      if (paramInt2 == 2) {
        break;
      }
      paramInt6 = 3;
    } while (paramInt2 != 3);
    this.zzh = 2;
    break label56;
    this.zzh = 1;
    label56:
    this.zze = paramInt4;
    this.zzf = paramBoolean;
    if (paramBoolean)
    {
      this.zzg = 2;
      this.zzd = Integer.MAX_VALUE;
    }
    else
    {
      this.zzd = paramInt3;
      if ((paramInt5 != -1) && (paramInt5 != 0) && (paramInt5 != 1) && (paramInt5 != 6)) {
        this.zzg = paramInt5;
      } else {
        this.zzg = -1;
      }
    }
    this.zzi = paramInt7;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Strategy)) {
      return false;
    }
    paramObject = (Strategy)paramObject;
    return (this.zzb == ((Strategy)paramObject).zzb) && (this.zzh == ((Strategy)paramObject).zzh) && (this.zzd == ((Strategy)paramObject).zzd) && (this.zze == ((Strategy)paramObject).zze) && (this.zzg == ((Strategy)paramObject).zzg) && (this.zzi == ((Strategy)paramObject).zzi);
  }
  
  public int hashCode()
  {
    return ((((this.zzb * 31 + this.zzh) * 31 + this.zzd) * 31 + this.zze) * 31 + this.zzg) * 31 + this.zzi;
  }
  
  public String toString()
  {
    int i = this.zzd;
    int j = this.zze;
    Object localObject4 = "DEFAULT";
    Object localObject1;
    if (j != 0)
    {
      if (j != 1)
      {
        localObject1 = new StringBuilder(19);
        ((StringBuilder)localObject1).append("UNKNOWN:");
        ((StringBuilder)localObject1).append(j);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      else
      {
        localObject1 = "EARSHOT";
      }
    }
    else {
      localObject1 = "DEFAULT";
    }
    j = this.zzg;
    Object localObject2;
    if (j == -1)
    {
      localObject2 = "DEFAULT";
    }
    else
    {
      localObject2 = new ArrayList();
      if ((j & 0x4) > 0) {
        ((List)localObject2).add("ULTRASOUND");
      }
      if ((j & 0x2) > 0) {
        ((List)localObject2).add("BLE");
      }
      if (((List)localObject2).isEmpty())
      {
        localObject2 = new StringBuilder(19);
        ((StringBuilder)localObject2).append("UNKNOWN:");
        ((StringBuilder)localObject2).append(j);
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      else
      {
        localObject2 = localObject2.toString();
      }
    }
    j = this.zzh;
    Object localObject3;
    if (j == 3)
    {
      localObject3 = "DEFAULT";
    }
    else
    {
      localObject3 = new ArrayList();
      if ((j & 0x1) > 0) {
        ((List)localObject3).add("BROADCAST");
      }
      if ((j & 0x2) > 0) {
        ((List)localObject3).add("SCAN");
      }
      if (((List)localObject3).isEmpty())
      {
        localObject3 = new StringBuilder(19);
        ((StringBuilder)localObject3).append("UNKNOWN:");
        ((StringBuilder)localObject3).append(j);
        localObject3 = ((StringBuilder)localObject3).toString();
      }
      else
      {
        localObject3 = localObject3.toString();
      }
    }
    j = this.zzi;
    if (j != 0) {
      if (j != 1)
      {
        localObject4 = new StringBuilder(20);
        ((StringBuilder)localObject4).append("UNKNOWN: ");
        ((StringBuilder)localObject4).append(j);
        localObject4 = ((StringBuilder)localObject4).toString();
      }
      else
      {
        localObject4 = "ALWAYS_ON";
      }
    }
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1).length() + 102 + String.valueOf(localObject2).length() + String.valueOf(localObject3).length() + String.valueOf(localObject4).length());
    localStringBuilder.append("Strategy{ttlSeconds=");
    localStringBuilder.append(i);
    localStringBuilder.append(", distanceType=");
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", discoveryMedium=");
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(", discoveryMode=");
    localStringBuilder.append((String)localObject3);
    localStringBuilder.append(", backgroundScanMode=");
    localStringBuilder.append((String)localObject4);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzc);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zze);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzf);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzg);
    SafeParcelWriter.writeInt(paramParcel, 6, this.zzh);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzi);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return this.zzi;
  }
  
  public static class Builder
  {
    private int zza = 3;
    private int zzb = 300;
    private int zzc = 0;
    private int zzd = -1;
    
    public Strategy build()
    {
      int i = this.zzd;
      if ((i == 2) && (this.zzc == 1)) {
        throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
      }
      return new Strategy(2, 0, this.zzb, this.zzc, false, i, this.zza, 0);
    }
    
    public Builder setDiscoveryMode(int paramInt)
    {
      this.zza = paramInt;
      return this;
    }
    
    public Builder setDistanceType(int paramInt)
    {
      this.zzc = paramInt;
      return this;
    }
    
    public Builder setTtlSeconds(int paramInt)
    {
      boolean bool;
      if ((paramInt != Integer.MAX_VALUE) && ((paramInt <= 0) || (paramInt > 86400))) {
        bool = false;
      } else {
        bool = true;
      }
      Preconditions.checkArgument(bool, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(86400) });
      this.zzb = paramInt;
      return this;
    }
    
    public final Builder zza(int paramInt)
    {
      this.zzd = 2;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\Strategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */