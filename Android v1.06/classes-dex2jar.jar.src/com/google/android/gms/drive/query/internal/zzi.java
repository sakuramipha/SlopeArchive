package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

final class zzi
{
  static MetadataField<?> zza(MetadataBundle paramMetadataBundle)
  {
    paramMetadataBundle = paramMetadataBundle.zzbg();
    if (paramMetadataBundle.size() == 1) {
      return (MetadataField)paramMetadataBundle.iterator().next();
    }
    throw new IllegalArgumentException("bundle should have exactly 1 populated field");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */