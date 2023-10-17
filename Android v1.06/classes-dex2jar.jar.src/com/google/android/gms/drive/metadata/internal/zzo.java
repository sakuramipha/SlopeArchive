package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzo
  extends zzl<DriveId>
  implements SearchableCollectionMetadataField<DriveId>
{
  public static final zzg zzjk = new zzp();
  
  public zzo(int paramInt)
  {
    super("parents", Collections.emptySet(), Arrays.asList(new String[] { "parentsExtra", "dbInstanceId", "parentsExtraHolder" }), 4100000);
  }
  
  private static void zzc(DataHolder paramDataHolder)
  {
    Bundle localBundle = paramDataHolder.getMetadata();
    if (localBundle == null) {
      return;
    }
    try
    {
      DataHolder localDataHolder = (DataHolder)localBundle.getParcelable("parentsExtraHolder");
      if (localDataHolder != null)
      {
        localDataHolder.close();
        localBundle.remove("parentsExtraHolder");
      }
      return;
    }
    finally {}
  }
  
  protected final Collection<DriveId> zzc(Bundle paramBundle)
  {
    paramBundle = super.zzc(paramBundle);
    if (paramBundle == null) {
      return null;
    }
    return new HashSet(paramBundle);
  }
  
  protected final Collection<DriveId> zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Bundle localBundle = paramDataHolder.getMetadata();
    Object localObject1 = localBundle.getParcelableArrayList("parentsExtra");
    Object localObject4 = localObject1;
    if (localObject1 == null)
    {
      if (localBundle.getParcelable("parentsExtraHolder") != null) {
        try
        {
          localObject1 = (DataHolder)paramDataHolder.getMetadata().getParcelable("parentsExtraHolder");
          if (localObject1 == null) {
            break label314;
          }
          try
          {
            int j = paramDataHolder.getCount();
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>(j);
            HashMap localHashMap = new java/util/HashMap;
            localHashMap.<init>(j);
            int i = 0;
            for (paramInt2 = 0; paramInt2 < j; paramInt2++)
            {
              int k = paramDataHolder.getWindowIndex(paramInt2);
              localObject7 = new com/google/android/gms/drive/metadata/internal/ParentDriveIdSet;
              ((ParentDriveIdSet)localObject7).<init>();
              ((ArrayList)localObject4).add(localObject7);
              localHashMap.put(Long.valueOf(paramDataHolder.getLong("sqlId", paramInt2, k)), localObject7);
            }
            Object localObject8 = ((DataHolder)localObject1).getMetadata();
            String str1 = ((Bundle)localObject8).getString("childSqlIdColumn");
            Object localObject7 = ((Bundle)localObject8).getString("parentSqlIdColumn");
            String str2 = ((Bundle)localObject8).getString("parentResIdColumn");
            j = ((DataHolder)localObject1).getCount();
            for (paramInt2 = i; paramInt2 < j; paramInt2++)
            {
              i = ((DataHolder)localObject1).getWindowIndex(paramInt2);
              ParentDriveIdSet localParentDriveIdSet = (ParentDriveIdSet)localHashMap.get(Long.valueOf(((DataHolder)localObject1).getLong(str1, paramInt2, i)));
              localObject8 = new com/google/android/gms/drive/metadata/internal/zzq;
              ((zzq)localObject8).<init>(((DataHolder)localObject1).getString(str2, paramInt2, i), ((DataHolder)localObject1).getLong((String)localObject7, paramInt2, i), 1);
              localParentDriveIdSet.zzjj.add(localObject8);
            }
            paramDataHolder.getMetadata().putParcelableArrayList("parentsExtra", (ArrayList)localObject4);
            ((DataHolder)localObject1).close();
            paramDataHolder.getMetadata().remove("parentsExtraHolder");
            label314:
            localObject1 = localBundle.getParcelableArrayList("parentsExtra");
          }
          finally
          {
            ((DataHolder)localObject1).close();
            paramDataHolder.getMetadata().remove("parentsExtraHolder");
          }
          localObject6 = localObject2;
        }
        finally {}
      }
      if (localObject2 == null) {
        return null;
      }
    }
    long l = localBundle.getLong("dbInstanceId");
    Object localObject3 = (ParentDriveIdSet)((List)localObject6).get(paramInt1);
    paramDataHolder = new HashSet();
    Object localObject6 = ((ParentDriveIdSet)localObject3).zzjj.iterator();
    while (((Iterator)localObject6).hasNext())
    {
      localObject3 = (zzq)((Iterator)localObject6).next();
      paramDataHolder.add(new DriveId(((zzq)localObject3).zzad, ((zzq)localObject3).zzae, l, ((zzq)localObject3).zzaf));
    }
    return paramDataHolder;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */