package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaej
  extends zzaef
{
  public static final Parcelable.Creator<zzaej> CREATOR = new zzaei();
  public final int zza;
  public final int zzb;
  public final int zzc;
  public final int[] zzd;
  public final int[] zze;
  
  public zzaej(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    super("MLLT");
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    this.zzd = paramArrayOfInt1;
    this.zze = paramArrayOfInt2;
  }
  
  zzaej(Parcel paramParcel)
  {
    super("MLLT");
    this.zza = paramParcel.readInt();
    this.zzb = paramParcel.readInt();
    this.zzc = paramParcel.readInt();
    int[] arrayOfInt = paramParcel.createIntArray();
    int i = zzfn.zza;
    this.zzd = arrayOfInt;
    this.zze = paramParcel.createIntArray();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaej)paramObject;
      if ((this.zza == ((zzaej)paramObject).zza) && (this.zzb == ((zzaej)paramObject).zzb) && (this.zzc == ((zzaej)paramObject).zzc) && (Arrays.equals(this.zzd, ((zzaej)paramObject).zzd)) && (Arrays.equals(this.zze, ((zzaej)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((((this.zza + 527) * 31 + this.zzb) * 31 + this.zzc) * 31 + Arrays.hashCode(this.zzd)) * 31 + Arrays.hashCode(this.zze);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.zza);
    paramParcel.writeInt(this.zzb);
    paramParcel.writeInt(this.zzc);
    paramParcel.writeIntArray(this.zzd);
    paramParcel.writeIntArray(this.zze);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */