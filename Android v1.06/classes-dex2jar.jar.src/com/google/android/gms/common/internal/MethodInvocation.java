package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class MethodInvocation
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
  private final int zaa;
  private final int zab;
  private final int zac;
  private final long zad;
  private final long zae;
  private final String zaf;
  private final String zag;
  private final int zah;
  private final int zai;
  
  @Deprecated
  public MethodInvocation(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt4)
  {
    this(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramString1, paramString2, paramInt4, -1);
  }
  
  public MethodInvocation(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString1, String paramString2, int paramInt4, int paramInt5)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
    this.zac = paramInt3;
    this.zad = paramLong1;
    this.zae = paramLong2;
    this.zaf = paramString1;
    this.zag = paramString2;
    this.zah = paramInt4;
    this.zai = paramInt5;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zab);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zac);
    SafeParcelWriter.writeLong(paramParcel, 4, this.zad);
    SafeParcelWriter.writeLong(paramParcel, 5, this.zae);
    SafeParcelWriter.writeString(paramParcel, 6, this.zaf, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zag, false);
    SafeParcelWriter.writeInt(paramParcel, 8, this.zah);
    SafeParcelWriter.writeInt(paramParcel, 9, this.zai);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\MethodInvocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */