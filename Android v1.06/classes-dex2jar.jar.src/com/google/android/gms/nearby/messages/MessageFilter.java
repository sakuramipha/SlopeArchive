package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhl;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MessageFilter
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();
  public static final MessageFilter INCLUDE_ALL_MY_TYPES;
  final int zza;
  private final List<zzac> zzb;
  private final List<zzhl> zzc;
  private final boolean zzd;
  private final List<zzhg> zze;
  private final int zzf;
  
  static
  {
    Builder localBuilder = new Builder();
    localBuilder.includeAllMyTypes();
    INCLUDE_ALL_MY_TYPES = localBuilder.build();
  }
  
  MessageFilter(int paramInt1, List<zzac> paramList, List<zzhl> paramList1, boolean paramBoolean, List<zzhg> paramList2, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = Collections.unmodifiableList((List)Preconditions.checkNotNull(paramList));
    this.zzd = paramBoolean;
    paramList = paramList1;
    if (paramList1 == null) {
      paramList = Collections.emptyList();
    }
    this.zzc = Collections.unmodifiableList(paramList);
    paramList = paramList2;
    if (paramList2 == null) {
      paramList = Collections.emptyList();
    }
    this.zze = Collections.unmodifiableList(paramList);
    this.zzf = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof MessageFilter)) {
      return false;
    }
    paramObject = (MessageFilter)paramObject;
    return (this.zzd == ((MessageFilter)paramObject).zzd) && (Objects.equal(this.zzb, ((MessageFilter)paramObject).zzb)) && (Objects.equal(this.zzc, ((MessageFilter)paramObject).zzc)) && (Objects.equal(this.zze, ((MessageFilter)paramObject).zze));
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, this.zzc, Boolean.valueOf(this.zzd), this.zze });
  }
  
  public String toString()
  {
    boolean bool = this.zzd;
    String str = String.valueOf(this.zzb);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 53);
    localStringBuilder.append("MessageFilter{includeAllMyTypes=");
    localStringBuilder.append(bool);
    localStringBuilder.append(", messageTypes=");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 1, this.zzb, false);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzc, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzd);
    SafeParcelWriter.writeTypedList(paramParcel, 4, this.zze, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzf);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zza);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final List<zzac> zza()
  {
    return this.zzb;
  }
  
  public final boolean zzb()
  {
    return this.zzd;
  }
  
  final List<zzhl> zzc()
  {
    return this.zzc;
  }
  
  public final List<zzhg> zzd()
  {
    return this.zze;
  }
  
  public static final class Builder
  {
    private final Set<zzac> zza = new HashSet();
    private final List<zzhl> zzb = new ArrayList();
    private final Set<zzhg> zzc = new HashSet();
    private boolean zzd;
    private int zze = 0;
    
    private final Builder zza(String paramString1, String paramString2)
    {
      this.zza.add(new zzac(paramString1, paramString2));
      return this;
    }
    
    public MessageFilter build()
    {
      boolean bool3 = this.zzd;
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!bool3) {
        if (!this.zza.isEmpty()) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      Preconditions.checkState(bool1, "At least one of the include methods must be called.");
      return new MessageFilter(2, new ArrayList(this.zza), this.zzb, this.zzd, new ArrayList(this.zzc), this.zze);
    }
    
    public Builder includeAllMyTypes()
    {
      this.zzd = true;
      return this;
    }
    
    public Builder includeAudioBytes(int paramInt)
    {
      int i = this.zze;
      boolean bool2 = true;
      boolean bool1;
      if (i == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "includeAudioBytes() can only be called once per MessageFilter instance.");
      if (paramInt > 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      StringBuilder localStringBuilder = new StringBuilder(44);
      localStringBuilder.append("Invalid value for numAudioBytes: ");
      localStringBuilder.append(paramInt);
      Preconditions.checkArgument(bool1, localStringBuilder.toString());
      if (paramInt <= 10) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "numAudioBytes is capped by AudioBytes.MAX_SIZE = 10");
      zza("__reserved_namespace", "__audio_bytes");
      this.zze = paramInt;
      return this;
    }
    
    public Builder includeEddystoneUids(String paramString1, String paramString2)
    {
      zza("__reserved_namespace", "__eddystone_uid");
      this.zzb.add(zzhl.zza(paramString1, paramString2));
      return this;
    }
    
    public Builder includeFilter(MessageFilter paramMessageFilter)
    {
      this.zza.addAll(paramMessageFilter.zza());
      this.zzb.addAll(paramMessageFilter.zzc());
      this.zzc.addAll(paramMessageFilter.zzd());
      boolean bool = this.zzd;
      this.zzd = (paramMessageFilter.zzb() | bool);
      return this;
    }
    
    public Builder includeIBeaconIds(UUID paramUUID, Short paramShort1, Short paramShort2)
    {
      zza("__reserved_namespace", "__i_beacon_id");
      this.zzb.add(zzhl.zzb(paramUUID, paramShort1, paramShort2));
      return this;
    }
    
    public Builder includeNamespacedType(String paramString1, String paramString2)
    {
      boolean bool;
      if ((paramString1 != null) && (!paramString1.isEmpty()) && (!paramString1.contains("*"))) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "namespace(%s) cannot be null, empty or contain (*).", new Object[] { paramString1 });
      if ((paramString2 != null) && (!paramString2.contains("*"))) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "type(%s) cannot be null or contain (*).", new Object[] { paramString2 });
      zza(paramString1, paramString2);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\MessageFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */