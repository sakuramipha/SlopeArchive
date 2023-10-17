package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzgq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgq> CREATOR = new zzgr();
  private zzen zza;
  private String[] zzb;
  private zzgd zzc;
  private boolean zzd;
  
  private zzgq() {}
  
  zzgq(IBinder paramIBinder, String[] paramArrayOfString, zzgd paramzzgd, boolean paramBoolean)
  {
    this.zza = paramIBinder;
    this.zzb = paramArrayOfString;
    this.zzc = paramzzgd;
    this.zzd = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgq))
    {
      paramObject = (zzgq)paramObject;
      if ((Objects.equal(this.zza, ((zzgq)paramObject).zza)) && (Arrays.equals(this.zzb, ((zzgq)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzgq)paramObject).zzc)) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((zzgq)paramObject).zzd)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, Boolean.valueOf(this.zzd) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Object localObject = this.zza;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzen)localObject).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 1, (IBinder)localObject, false);
    SafeParcelWriter.writeStringArray(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */