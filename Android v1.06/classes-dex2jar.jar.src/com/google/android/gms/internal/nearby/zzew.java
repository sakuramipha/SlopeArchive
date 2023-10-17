package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzew
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzew> CREATOR = new zzex();
  private String zza;
  private String zzb;
  private String zzc;
  private boolean zzd;
  private byte[] zze;
  private byte[] zzf;
  private byte[] zzg;
  private boolean zzh;
  
  private zzew() {}
  
  zzew(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, boolean paramBoolean2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramBoolean1;
    this.zze = paramArrayOfByte1;
    this.zzf = paramArrayOfByte2;
    this.zzg = paramArrayOfByte3;
    this.zzh = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzew))
    {
      paramObject = (zzew)paramObject;
      if ((Objects.equal(this.zza, ((zzew)paramObject).zza)) && (Objects.equal(this.zzb, ((zzew)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzew)paramObject).zzc)) && (Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(((zzew)paramObject).zzd))) && (Arrays.equals(this.zze, ((zzew)paramObject).zze)) && (Arrays.equals(this.zzf, ((zzew)paramObject).zzf)) && (Arrays.equals(this.zzg, ((zzew)paramObject).zzg)) && (Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(((zzew)paramObject).zzh)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd), Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), Integer.valueOf(Arrays.hashCode(this.zzg)), Boolean.valueOf(this.zzh) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeByteArray(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeByteArray(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeByteArray(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzc;
  }
  
  public final boolean zzd()
  {
    return this.zzd;
  }
  
  public final byte[] zze()
  {
    return this.zzf;
  }
  
  public final byte[] zzf()
  {
    return this.zzg;
  }
  
  public final boolean zzg()
  {
    return this.zzh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */