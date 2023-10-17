package com.google.android.gms.internal.drive;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzaa
  extends Metadata
{
  private final MetadataBundle zzdt;
  
  public zzaa(MetadataBundle paramMetadataBundle)
  {
    this.zzdt = paramMetadataBundle;
  }
  
  public final boolean isDataValid()
  {
    return this.zzdt != null;
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zzdt);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 17);
    localStringBuilder.append("Metadata [mImpl=");
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final <T> T zza(MetadataField<T> paramMetadataField)
  {
    return (T)this.zzdt.zza(paramMetadataField);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */