package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class zzf
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzf> CREATOR = new zzg();
  private final String fieldName;
  private final boolean zzmc;
  
  public zzf(String paramString, boolean paramBoolean)
  {
    this.fieldName = paramString;
    this.zzmc = paramBoolean;
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    String str2 = this.fieldName;
    String str1;
    if (this.zzmc) {
      str1 = "ASC";
    } else {
      str1 = "DESC";
    }
    return String.format(localLocale, "FieldWithSortOrder[%s %s]", new Object[] { str2, str1 });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.fieldName, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzmc);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */