package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

public final class zzgd
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzgd> CREATOR = new zzge();
  private long zza;
  private int zzb;
  private byte[] zzc;
  private ParcelFileDescriptor zzd;
  private String zze;
  private long zzf;
  private ParcelFileDescriptor zzg;
  private Uri zzh;
  private long zzi;
  private boolean zzj;
  private zzfz zzk;
  
  private zzgd()
  {
    this.zzf = -1L;
    this.zzi = 0L;
    this.zzj = false;
  }
  
  zzgd(long paramLong1, int paramInt, byte[] paramArrayOfByte, ParcelFileDescriptor paramParcelFileDescriptor1, String paramString, long paramLong2, ParcelFileDescriptor paramParcelFileDescriptor2, Uri paramUri, long paramLong3, boolean paramBoolean, zzfz paramzzfz)
  {
    this.zza = paramLong1;
    this.zzb = paramInt;
    this.zzc = paramArrayOfByte;
    this.zzd = paramParcelFileDescriptor1;
    this.zze = paramString;
    this.zzf = paramLong2;
    this.zzg = paramParcelFileDescriptor2;
    this.zzh = paramUri;
    this.zzi = paramLong3;
    this.zzj = paramBoolean;
    this.zzk = paramzzfz;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzgd))
    {
      paramObject = (zzgd)paramObject;
      if ((Objects.equal(Long.valueOf(this.zza), Long.valueOf(((zzgd)paramObject).zza))) && (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(((zzgd)paramObject).zzb))) && (Arrays.equals(this.zzc, ((zzgd)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzgd)paramObject).zzd)) && (Objects.equal(this.zze, ((zzgd)paramObject).zze)) && (Objects.equal(Long.valueOf(this.zzf), Long.valueOf(((zzgd)paramObject).zzf))) && (Objects.equal(this.zzg, ((zzgd)paramObject).zzg)) && (Objects.equal(this.zzh, ((zzgd)paramObject).zzh)) && (Objects.equal(Long.valueOf(this.zzi), Long.valueOf(((zzgd)paramObject).zzi))) && (Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(((zzgd)paramObject).zzj))) && (Objects.equal(this.zzk, ((zzgd)paramObject).zzk))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, Long.valueOf(this.zzf), this.zzg, this.zzh, Long.valueOf(this.zzi), Boolean.valueOf(this.zzj), this.zzk });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeLong(paramParcel, 1, this.zza);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeByteArray(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeLong(paramParcel, 6, this.zzf);
    SafeParcelWriter.writeParcelable(paramParcel, 7, this.zzg, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 8, this.zzh, paramInt, false);
    SafeParcelWriter.writeLong(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeBoolean(paramParcel, 10, this.zzj);
    SafeParcelWriter.writeParcelable(paramParcel, 11, this.zzk, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final long zza()
  {
    return this.zza;
  }
  
  public final int zzb()
  {
    return this.zzb;
  }
  
  public final byte[] zzc()
  {
    return this.zzc;
  }
  
  public final ParcelFileDescriptor zzd()
  {
    return this.zzd;
  }
  
  public final String zze()
  {
    return this.zze;
  }
  
  public final long zzf()
  {
    return this.zzf;
  }
  
  public final ParcelFileDescriptor zzg()
  {
    return this.zzg;
  }
  
  public final Uri zzh()
  {
    return this.zzh;
  }
  
  public final zzfz zzi()
  {
    return this.zzk;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */