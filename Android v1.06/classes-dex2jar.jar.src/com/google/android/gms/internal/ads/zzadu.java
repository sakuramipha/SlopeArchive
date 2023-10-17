package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadu
  extends zzaef
{
  public static final Parcelable.Creator<zzadu> CREATOR = new zzadt();
  public final String zza;
  public final int zzb;
  public final int zzc;
  public final long zzd;
  public final long zze;
  private final zzaef[] zzg;
  
  zzadu(Parcel paramParcel)
  {
    super("CHAP");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    this.zzb = paramParcel.readInt();
    this.zzc = paramParcel.readInt();
    this.zzd = paramParcel.readLong();
    this.zze = paramParcel.readLong();
    int j = paramParcel.readInt();
    this.zzg = new zzaef[j];
    for (i = 0; i < j; i++) {
      this.zzg[i] = ((zzaef)paramParcel.readParcelable(zzaef.class.getClassLoader()));
    }
  }
  
  public zzadu(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, zzaef[] paramArrayOfzzaef)
  {
    super("CHAP");
    this.zza = paramString;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramLong1;
    this.zze = paramLong2;
    this.zzg = paramArrayOfzzaef;
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
      paramObject = (zzadu)paramObject;
      if ((this.zzb == ((zzadu)paramObject).zzb) && (this.zzc == ((zzadu)paramObject).zzc) && (this.zzd == ((zzadu)paramObject).zzd) && (this.zze == ((zzadu)paramObject).zze) && (zzfn.zzB(this.zza, ((zzadu)paramObject).zza)) && (Arrays.equals(this.zzg, ((zzadu)paramObject).zzg))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int m = this.zzb;
    int k = this.zzc;
    int n = (int)this.zzd;
    int j = (int)this.zze;
    String str = this.zza;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return ((((m + 527) * 31 + k) * 31 + n) * 31 + j) * 31 + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeInt(this.zzb);
    paramParcel.writeInt(this.zzc);
    paramParcel.writeLong(this.zzd);
    paramParcel.writeLong(this.zze);
    paramParcel.writeInt(this.zzg.length);
    zzaef[] arrayOfzzaef = this.zzg;
    int i = arrayOfzzaef.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfzzaef[paramInt], 0);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */