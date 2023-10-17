package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzb<T>
  extends zza
{
  public static final zzc CREATOR = new zzc();
  private final zzx zzlz;
  private final MetadataBundle zzma;
  private final MetadataField<T> zzmb;
  
  public zzb(zzx paramzzx, SearchableMetadataField<T> paramSearchableMetadataField, T paramT)
  {
    this(paramzzx, MetadataBundle.zza(paramSearchableMetadataField, paramT));
  }
  
  zzb(zzx paramzzx, MetadataBundle paramMetadataBundle)
  {
    this.zzlz = paramzzx;
    this.zzma = paramMetadataBundle;
    this.zzmb = zzi.zza(paramMetadataBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzlz, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzma, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    zzx localzzx = this.zzlz;
    MetadataField localMetadataField = this.zzmb;
    return (F)paramzzj.zza(localzzx, localMetadataField, this.zzma.zza(localMetadataField));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */