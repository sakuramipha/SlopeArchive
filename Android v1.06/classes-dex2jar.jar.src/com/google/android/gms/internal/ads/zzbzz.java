package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzbzz
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbzz> CREATOR = new zzcaa();
  public String zza;
  public int zzb;
  public int zzc;
  public boolean zzd;
  public boolean zze;
  
  public zzbzz(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(231700000, paramInt2, true, false, paramBoolean2);
  }
  
  public zzbzz(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(localStringBuilder.toString(), paramInt1, paramInt2, paramBoolean1, paramBoolean3);
  }
  
  zzbzz(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramString;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramBoolean1;
    this.zze = paramBoolean2;
  }
  
  public static zzbzz zza()
  {
    return new zzbzz(12451000, 12451000, true, false, false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzb);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 5, this.zzd);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zze);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */