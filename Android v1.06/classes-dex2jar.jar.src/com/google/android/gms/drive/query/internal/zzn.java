package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzn<T>
  extends zza
{
  public static final zzo CREATOR = new zzo();
  private final MetadataBundle zzma;
  private final MetadataField<T> zzmb;
  
  public zzn(SearchableMetadataField<T> paramSearchableMetadataField, T paramT)
  {
    this(MetadataBundle.zza(paramSearchableMetadataField, paramT));
  }
  
  zzn(MetadataBundle paramMetadataBundle)
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
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    MetadataField localMetadataField = this.zzmb;
    return (F)paramzzj.zzc(localMetadataField, this.zzma.zza(localMetadataField));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */