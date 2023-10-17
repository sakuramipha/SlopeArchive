package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.zzm;
import com.google.android.gms.drive.metadata.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class zzim
  extends zzm<DriveId>
{
  public static final zzim zzlj = new zzim();
  
  private zzim()
  {
    super("driveId", Arrays.asList(new String[] { "sqlId", "resourceId", "mimeType" }), Arrays.asList(new String[] { "dbInstanceId" }), 4100000);
  }
  
  protected final boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Iterator localIterator = zzaz().iterator();
    while (localIterator.hasNext()) {
      if (!paramDataHolder.hasColumn((String)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */