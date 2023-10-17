package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzr
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private int accountType;
  private String zzbg;
  private String zzbh;
  private String zzbi;
  private int zzbj;
  private boolean zzbk;
  
  public zzr(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean)
  {
    this.zzbg = paramString1;
    this.accountType = paramInt1;
    this.zzbh = paramString2;
    this.zzbi = paramString3;
    this.zzbj = paramInt2;
    this.zzbk = paramBoolean;
  }
  
  private static boolean zzb(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      if (paramObject == this) {
        return true;
      }
      paramObject = (zzr)paramObject;
      if ((Objects.equal(this.zzbg, ((zzr)paramObject).zzbg)) && (this.accountType == ((zzr)paramObject).accountType) && (this.zzbj == ((zzr)paramObject).zzbj) && (this.zzbk == ((zzr)paramObject).zzbk)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzbg, Integer.valueOf(this.accountType), Integer.valueOf(this.zzbj), Boolean.valueOf(this.zzbk) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = SafeParcelWriter.beginObjectHeader(paramParcel);
    String str;
    if (!zzb(this.accountType)) {
      str = null;
    } else {
      str = this.zzbg;
    }
    int j = 0;
    SafeParcelWriter.writeString(paramParcel, 2, str, false);
    boolean bool = zzb(this.accountType);
    int i = -1;
    if (!bool) {
      paramInt = -1;
    } else {
      paramInt = this.accountType;
    }
    SafeParcelWriter.writeInt(paramParcel, 3, paramInt);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzbh, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zzbi, false);
    int k = this.zzbj;
    if ((k != 0) && (k != 1) && (k != 2) && (k != 3)) {
      paramInt = j;
    } else {
      paramInt = 1;
    }
    if (paramInt == 0) {
      paramInt = i;
    } else {
      paramInt = k;
    }
    SafeParcelWriter.writeInt(paramParcel, 6, paramInt);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzbk);
    SafeParcelWriter.finishObjectHeader(paramParcel, m);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */