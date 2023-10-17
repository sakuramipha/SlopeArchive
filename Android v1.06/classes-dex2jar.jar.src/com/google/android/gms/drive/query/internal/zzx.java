package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzx
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzx> CREATOR = new zzy();
  public static final zzx zzmq = new zzx("=");
  public static final zzx zzmr = new zzx("<");
  public static final zzx zzms = new zzx("<=");
  public static final zzx zzmt = new zzx(">");
  public static final zzx zzmu = new zzx(">=");
  public static final zzx zzmv = new zzx("and");
  public static final zzx zzmw = new zzx("or");
  private static final zzx zzmx = new zzx("not");
  public static final zzx zzmy = new zzx("contains");
  private final String tag;
  
  zzx(String paramString)
  {
    this.tag = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzx)paramObject;
      String str = this.tag;
      if (str == null)
      {
        if (((zzx)paramObject).tag != null) {
          return false;
        }
      }
      else if (!str.equals(((zzx)paramObject).tag)) {
        return false;
      }
      return true;
    }
    return false;
  }
  
  public final String getTag()
  {
    return this.tag;
  }
  
  public final int hashCode()
  {
    String str = this.tag;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return i + 31;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.tag, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */