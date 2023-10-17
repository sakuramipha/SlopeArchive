package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.internal.zzb;
import com.google.android.gms.drive.metadata.zza;

public final class zzic
  extends zzb
  implements SearchableMetadataField<Boolean>
{
  public zzic(String paramString, int paramInt)
  {
    super(paramString, 4100000);
  }
  
  protected final Boolean zze(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramDataHolder.getInteger(getName(), paramInt1, paramInt2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */