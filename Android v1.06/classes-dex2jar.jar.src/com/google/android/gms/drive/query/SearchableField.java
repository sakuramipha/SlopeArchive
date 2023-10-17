package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.drive.zzhs;
import com.google.android.gms.internal.drive.zzif;
import java.util.Date;

public class SearchableField
{
  public static final SearchableMetadataField<Boolean> IS_PINNED = zzhs.zzka;
  public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME;
  public static final SearchableMetadataField<String> MIME_TYPE;
  public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE;
  public static final SearchableCollectionMetadataField<DriveId> PARENTS;
  public static final SearchableMetadataField<Boolean> STARRED;
  public static final SearchableMetadataField<String> TITLE = zzhs.zzkr;
  public static final SearchableMetadataField<Boolean> TRASHED;
  public static final SearchableOrderedMetadataField<Date> zzlu;
  public static final SearchableMetadataField<AppVisibleCustomProperties> zzlv = zzhs.zzjn;
  
  static
  {
    MIME_TYPE = zzhs.zzki;
    TRASHED = zzhs.zzks;
    PARENTS = zzhs.zzkn;
    zzlu = zzif.zzlh;
    STARRED = zzhs.zzkp;
    MODIFIED_DATE = zzif.zzlf;
    LAST_VIEWED_BY_ME = zzif.zzle;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\SearchableField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */