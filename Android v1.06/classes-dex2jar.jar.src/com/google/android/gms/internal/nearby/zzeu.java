package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzeu
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzeu> CREATOR = new zzev();
  private String zza;
  private int zzb;
  private final int zzc;
  
  private zzeu()
  {
    this.zzc = 0;
  }
  
  zzeu(String paramString, int paramInt1, int paramInt2)
  {
    this.zza = paramString;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzeu))
    {
      paramObject = (zzeu)paramObject;
      if ((Objects.equal(this.zza, ((zzeu)paramObject).zza)) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzeu)paramObject).zzb))) && (Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(((zzeu)paramObject).zzc)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final int zzc()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */