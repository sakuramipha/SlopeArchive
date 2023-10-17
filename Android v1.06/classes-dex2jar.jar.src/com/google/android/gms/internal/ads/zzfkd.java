package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfkd
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfkd> CREATOR = new zzfke();
  public final int zza;
  private zzaol zzb;
  private byte[] zzc;
  
  zzfkd(int paramInt, byte[] paramArrayOfByte)
  {
    this.zza = paramInt;
    this.zzb = null;
    this.zzc = paramArrayOfByte;
    zzb();
  }
  
  private final void zzb()
  {
    zzaol localzzaol = this.zzb;
    if ((localzzaol == null) && (this.zzc != null)) {
      return;
    }
    if ((localzzaol != null) && (this.zzc == null)) {
      return;
    }
    if ((localzzaol != null) && (this.zzc != null)) {
      throw new IllegalStateException("Invalid internal representation - full");
    }
    if ((localzzaol == null) && (this.zzc == null)) {
      throw new IllegalStateException("Invalid internal representation - empty");
    }
    throw new IllegalStateException("Impossible");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    byte[] arrayOfByte = this.zzc;
    if (arrayOfByte == null) {
      arrayOfByte = this.zzb.zzax();
    }
    SafeParcelWriter.writeByteArray(paramParcel, 2, arrayOfByte, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final zzaol zza()
  {
    if (this.zzb == null)
    {
      try
      {
        this.zzb = zzaol.zze(this.zzc, zzgoi.zza());
        this.zzc = null;
      }
      catch (NullPointerException localNullPointerException) {}catch (zzgpi localzzgpi) {}
      throw new IllegalStateException(localzzgpi);
    }
    zzb();
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */