package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class zzp<T>
  extends zza
{
  public static final zzq CREATOR = new zzq();
  private final MetadataBundle zzma;
  private final zzb<T> zzmn;
  
  public zzp(SearchableCollectionMetadataField<T> paramSearchableCollectionMetadataField, T paramT)
  {
    this(MetadataBundle.zza(paramSearchableCollectionMetadataField, Collections.singleton(paramT)));
  }
  
  zzp(MetadataBundle paramMetadataBundle)
  {
    this.zzma = paramMetadataBundle;
    this.zzmn = ((zzb)zzi.zza(paramMetadataBundle));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzma, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final <F> F zza(zzj<F> paramzzj)
  {
    zzb localzzb = this.zzmn;
    return (F)paramzzj.zza(localzzb, ((Collection)this.zzma.zza(localzzb)).iterator().next());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */