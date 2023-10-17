package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzadw
  extends zzaef
{
  public static final Parcelable.Creator<zzadw> CREATOR = new zzadv();
  public final String zza;
  public final boolean zzb;
  public final boolean zzc;
  public final String[] zzd;
  private final zzaef[] zze;
  
  zzadw(Parcel paramParcel)
  {
    super("CTOC");
    String str = paramParcel.readString();
    int i = zzfn.zza;
    this.zza = str;
    int j = paramParcel.readByte();
    boolean bool2 = true;
    i = 0;
    boolean bool1;
    if (j != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    this.zzb = bool1;
    if (paramParcel.readByte() != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    this.zzc = bool1;
    this.zzd = paramParcel.createStringArray();
    j = paramParcel.readInt();
    this.zze = new zzaef[j];
    while (i < j)
    {
      this.zze[i] = ((zzaef)paramParcel.readParcelable(zzaef.class.getClassLoader()));
      i++;
    }
  }
  
  public zzadw(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, zzaef[] paramArrayOfzzaef)
  {
    super("CTOC");
    this.zza = paramString;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramArrayOfString;
    this.zze = paramArrayOfzzaef;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzadw)paramObject;
      if ((this.zzb == ((zzadw)paramObject).zzb) && (this.zzc == ((zzadw)paramObject).zzc) && (zzfn.zzB(this.zza, ((zzadw)paramObject).zza)) && (Arrays.equals(this.zzd, ((zzadw)paramObject).zzd)) && (Arrays.equals(this.zze, ((zzadw)paramObject).zze))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int k = this.zzb;
    int j = this.zzc;
    String str = this.zza;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return ((k + 527) * 31 + j) * 31 + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zza);
    paramParcel.writeByte(this.zzb);
    paramParcel.writeByte(this.zzc);
    paramParcel.writeStringArray(this.zzd);
    paramParcel.writeInt(this.zze.length);
    zzaef[] arrayOfzzaef = this.zze;
    int i = arrayOfzzaef.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfzzaef[paramInt], 0);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */