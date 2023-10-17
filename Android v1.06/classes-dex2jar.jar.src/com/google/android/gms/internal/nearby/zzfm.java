package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfm
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfm> CREATOR = new zzfn();
  private String zza;
  private zzgd zzb;
  private boolean zzc;
  
  private zzfm() {}
  
  zzfm(String paramString, zzgd paramzzgd, boolean paramBoolean)
  {
    this.zza = paramString;
    this.zzb = paramzzgd;
    this.zzc = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfm))
    {
      paramObject = (zzfm)paramObject;
      if ((Objects.equal(this.zza, ((zzfm)paramObject).zza)) && (Objects.equal(this.zzb, ((zzfm)paramObject).zzb)) && (Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(((zzfm)paramObject).zzc)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, Boolean.valueOf(this.zzc) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final zzgd zzb()
  {
    return this.zzb;
  }
  
  public final boolean zzc()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */