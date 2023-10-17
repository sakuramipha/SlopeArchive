package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.zzt;

public final class zzfg
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfg> CREATOR = new zzfh();
  private String zza;
  private int zzb;
  private zzt zzc;
  
  private zzfg() {}
  
  zzfg(String paramString, int paramInt, zzt paramzzt)
  {
    this.zza = paramString;
    this.zzb = paramInt;
    this.zzc = paramzzt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzfg))
    {
      paramObject = (zzfg)paramObject;
      if ((Objects.equal(this.zza, ((zzfg)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzfg)paramObject).zzb))) && (Objects.equal(this.zzc, ((zzfg)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb), this.zzc });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final zzt zzc()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */