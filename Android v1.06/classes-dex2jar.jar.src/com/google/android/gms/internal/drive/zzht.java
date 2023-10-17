package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.zzb;
import java.util.Collection;

final class zzht
  extends zzb
{
  zzht(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, 7000000);
  }
  
  protected final Boolean zze(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramDataHolder.getInteger("trashed", paramInt1, paramInt2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */