package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class Strategy
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Strategy> CREATOR = new zzs();
  public static final Strategy P2P_CLUSTER = new Strategy(1, 3);
  public static final Strategy P2P_POINT_TO_POINT = new Strategy(1, 1);
  public static final Strategy P2P_STAR = new Strategy(1, 2);
  private final int zza;
  private final int zzb;
  
  Strategy(int paramInt1, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
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
    return (this.zza == ((Strategy)paramObject).zza) && (this.zzb == ((Strategy)paramObject).zzb);
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.zza), Integer.valueOf(this.zzb) });
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    String str;
    if (P2P_CLUSTER.equals(this)) {
      str = "P2P_CLUSTER";
    } else if (P2P_STAR.equals(this)) {
      str = "P2P_STAR";
    } else if (P2P_POINT_TO_POINT.equals(this)) {
      str = "P2P_POINT_TO_POINT";
    } else {
      str = "UNKNOWN";
    }
    return String.format(localLocale, "Strategy(%s){connectionType=%d, topology=%d}", new Object[] { str, Integer.valueOf(this.zza), Integer.valueOf(this.zzb) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzb);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\Strategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */