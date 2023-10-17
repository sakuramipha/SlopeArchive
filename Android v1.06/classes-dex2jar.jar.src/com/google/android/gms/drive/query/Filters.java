package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.query.internal.zzb;
import com.google.android.gms.drive.query.internal.zzd;
import com.google.android.gms.drive.query.internal.zzn;
import com.google.android.gms.drive.query.internal.zzp;
import com.google.android.gms.drive.query.internal.zzr;
import com.google.android.gms.drive.query.internal.zzv;
import com.google.android.gms.drive.query.internal.zzx;
import com.google.android.gms.drive.query.internal.zzz;

public class Filters
{
  public static Filter and(Filter paramFilter, Filter... paramVarArgs)
  {
    Preconditions.checkNotNull(paramFilter, "Filter may not be null.");
    Preconditions.checkNotNull(paramVarArgs, "Additional filters may not be null.");
    return new zzr(zzx.zzmv, paramFilter, paramVarArgs);
  }
  
  public static Filter and(Iterable<Filter> paramIterable)
  {
    Preconditions.checkNotNull(paramIterable, "Filters may not be null");
    return new zzr(zzx.zzmv, paramIterable);
  }
  
  public static Filter contains(SearchableMetadataField<String> paramSearchableMetadataField, String paramString)
  {
    Preconditions.checkNotNull(paramSearchableMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramString, "Value may not be null.");
    return new zzb(zzx.zzmy, paramSearchableMetadataField, paramString);
  }
  
  public static Filter eq(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    Preconditions.checkNotNull(paramCustomPropertyKey, "Custom property key may not be null.");
    Preconditions.checkNotNull(paramString, "Custom property value may not be null.");
    return new zzn(SearchableField.zzlv, new AppVisibleCustomProperties.zza().zza(paramCustomPropertyKey, paramString).zzbb());
  }
  
  public static <T> Filter eq(SearchableMetadataField<T> paramSearchableMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzb(zzx.zzmq, paramSearchableMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter greaterThan(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableOrderedMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzb(zzx.zzmt, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter greaterThanEquals(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableOrderedMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzb(zzx.zzmu, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T> Filter in(SearchableCollectionMetadataField<T> paramSearchableCollectionMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableCollectionMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzp(paramSearchableCollectionMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter lessThan(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableOrderedMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzb(zzx.zzmr, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static <T extends Comparable<T>> Filter lessThanEquals(SearchableOrderedMetadataField<T> paramSearchableOrderedMetadataField, T paramT)
  {
    Preconditions.checkNotNull(paramSearchableOrderedMetadataField, "Field may not be null.");
    Preconditions.checkNotNull(paramT, "Value may not be null.");
    return new zzb(zzx.zzms, paramSearchableOrderedMetadataField, paramT);
  }
  
  public static Filter not(Filter paramFilter)
  {
    Preconditions.checkNotNull(paramFilter, "Filter may not be null");
    return new zzv(paramFilter);
  }
  
  public static Filter openedByMe()
  {
    return new zzd(SearchableField.LAST_VIEWED_BY_ME);
  }
  
  public static Filter or(Filter paramFilter, Filter... paramVarArgs)
  {
    Preconditions.checkNotNull(paramFilter, "Filter may not be null.");
    Preconditions.checkNotNull(paramVarArgs, "Additional filters may not be null.");
    return new zzr(zzx.zzmw, paramFilter, paramVarArgs);
  }
  
  public static Filter or(Iterable<Filter> paramIterable)
  {
    Preconditions.checkNotNull(paramIterable, "Filters may not be null");
    return new zzr(zzx.zzmw, paramIterable);
  }
  
  public static Filter ownedByMe()
  {
    return new zzz();
  }
  
  public static Filter sharedWithMe()
  {
    return new zzd(SearchableField.zzlu);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\Filters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */