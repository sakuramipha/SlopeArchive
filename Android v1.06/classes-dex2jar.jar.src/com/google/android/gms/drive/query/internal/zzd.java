package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzd
  extends zza
{
  public static final Parcelable.Creator<zzd> CREATOR = new zze();
  private final MetadataBundle zzma;
  private final MetadataField<?> zzmb;
  
  public zzd(SearchableMetadataField<?> paramSearchableMetadataField)
  {
    this(MetadataBundle.zza(paramSearchableMetadataField, null));
  }
  
  zzd(MetadataBundle paramMetadataBundle)
  {
    this.zzma = paramMetadataBundle;
    this.zzmb = zzi.zza(paramMetadataBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzma, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final <T> T zza(zzj<T> paramzzj)
  {
    return (T)paramzzj.zze(this.zzmb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */