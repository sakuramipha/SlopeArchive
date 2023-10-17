package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.drive.zzhs;
import com.google.android.gms.internal.drive.zzif;
import java.util.Date;

public class SortableField
{
  public static final SortableMetadataField<Date> CREATED_DATE;
  public static final SortableMetadataField<Date> LAST_VIEWED_BY_ME;
  public static final SortableMetadataField<Date> MODIFIED_BY_ME_DATE;
  public static final SortableMetadataField<Date> MODIFIED_DATE;
  public static final SortableMetadataField<Long> QUOTA_USED = zzhs.zzko;
  public static final SortableMetadataField<Date> SHARED_WITH_ME_DATE;
  public static final SortableMetadataField<String> TITLE = zzhs.zzkr;
  private static final SortableMetadataField<Date> zzly = zzif.zzli;
  
  static
  {
    CREATED_DATE = zzif.zzld;
    MODIFIED_DATE = zzif.zzlf;
    MODIFIED_BY_ME_DATE = zzif.zzlg;
    LAST_VIEWED_BY_ME = zzif.zzle;
    SHARED_WITH_ME_DATE = zzif.zzlh;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\SortableField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */