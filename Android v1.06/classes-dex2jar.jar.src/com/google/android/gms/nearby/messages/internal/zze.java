package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;

public final class zze
  extends AbstractSafeParcelable
  implements Distance
{
  public static final Parcelable.Creator<zze> CREATOR = new zzf();
  final int zza;
  public final int zzb;
  public final double zzc;
  
  public zze(int paramInt, double paramDouble)
  {
    this(1, 1, NaN.0D);
  }
  
  zze(int paramInt1, int paramInt2, double paramDouble)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramDouble;
  }
  
  public final int compareTo(Distance paramDistance)
  {
    if ((Double.isNaN(this.zzc)) && (Double.isNaN(paramDistance.getMeters()))) {
      return 0;
    }
    return Double.compare(this.zzc, paramDistance.getMeters());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zze)) {
      return false;
    }
    paramObject = (zze)paramObject;
    return (this.zzb == ((zze)paramObject).zzb) && (compareTo((Distance)paramObject) == 0);
  }
  
  public final int getAccuracy()
  {
    return this.zzb;
  }
  
  public final double getMeters()
  {
    return this.zzc;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zzb), Double.valueOf(this.zzc) });
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    double d = this.zzc;
    String str;
    if (this.zzb != 1) {
      str = "UNKNOWN";
    } else {
      str = "LOW";
    }
    return String.format(localLocale, "(%.1fm, %s)", new Object[] { Double.valueOf(d), str });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeDouble(paramParcel, 3, this.zzc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */