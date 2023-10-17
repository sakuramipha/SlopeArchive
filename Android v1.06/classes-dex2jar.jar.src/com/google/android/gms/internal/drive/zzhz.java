package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class zzhz
  extends zzl<DriveSpace>
{
  public zzhz(int paramInt)
  {
    super("spaces", Arrays.asList(new String[] { "inDriveSpace", "isAppData", "inGooglePhotosSpace" }), Collections.emptySet(), 7000000);
  }
  
  protected final Collection<DriveSpace> zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramDataHolder.getBoolean("inDriveSpace", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzah);
    }
    if (paramDataHolder.getBoolean("isAppData", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzai);
    }
    if (paramDataHolder.getBoolean("inGooglePhotosSpace", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzaj);
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */