package com.google.android.gms.internal.drive;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.zzc;
import com.google.android.gms.drive.metadata.internal.zzg;
import com.google.android.gms.drive.metadata.internal.zzm;
import java.util.Arrays;

public class zzid
  extends zzm<AppVisibleCustomProperties>
{
  public static final zzg zzlc = new zzie();
  
  public zzid(int paramInt)
  {
    super("customProperties", Arrays.asList(new String[] { "hasCustomProperties", "sqlId" }), Arrays.asList(new String[] { "customPropertiesExtra", "customPropertiesExtraHolder" }), 5000000);
  }
  
  private static void zzc(DataHolder paramDataHolder)
  {
    Bundle localBundle = paramDataHolder.getMetadata();
    if (localBundle == null) {
      return;
    }
    try
    {
      DataHolder localDataHolder = (DataHolder)localBundle.getParcelable("customPropertiesExtraHolder");
      if (localDataHolder != null)
      {
        localDataHolder.close();
        localBundle.remove("customPropertiesExtraHolder");
      }
      return;
    }
    finally {}
  }
  
  private static AppVisibleCustomProperties zzf(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Bundle localBundle = paramDataHolder.getMetadata();
    Object localObject1 = localBundle.getSparseParcelableArray("customPropertiesExtra");
    Object localObject4 = localObject1;
    if (localObject1 == null)
    {
      if (localBundle.getParcelable("customPropertiesExtraHolder") != null) {
        try
        {
          DataHolder localDataHolder = (DataHolder)paramDataHolder.getMetadata().getParcelable("customPropertiesExtraHolder");
          if (localDataHolder == null) {
            break label348;
          }
          try
          {
            localObject1 = localDataHolder.getMetadata();
            String str1 = ((Bundle)localObject1).getString("entryIdColumn");
            String str2 = ((Bundle)localObject1).getString("keyColumn");
            String str3 = ((Bundle)localObject1).getString("visibilityColumn");
            String str4 = ((Bundle)localObject1).getString("valueColumn");
            LongSparseArray localLongSparseArray = new androidx/collection/LongSparseArray;
            localLongSparseArray.<init>();
            for (paramInt2 = 0; paramInt2 < localDataHolder.getCount(); paramInt2++)
            {
              int i = localDataHolder.getWindowIndex(paramInt2);
              long l = localDataHolder.getLong(str1, paramInt2, i);
              localObject1 = localDataHolder.getString(str2, paramInt2, i);
              int j = localDataHolder.getInteger(str3, paramInt2, i);
              String str5 = localDataHolder.getString(str4, paramInt2, i);
              zzc localzzc = new com/google/android/gms/drive/metadata/internal/zzc;
              localObject4 = new com/google/android/gms/drive/metadata/CustomPropertyKey;
              ((CustomPropertyKey)localObject4).<init>((String)localObject1, j);
              localzzc.<init>((CustomPropertyKey)localObject4, str5);
              localObject4 = (AppVisibleCustomProperties.zza)localLongSparseArray.get(l);
              localObject1 = localObject4;
              if (localObject4 == null)
              {
                localObject1 = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$zza;
                ((AppVisibleCustomProperties.zza)localObject1).<init>();
                localLongSparseArray.put(l, localObject1);
              }
              ((AppVisibleCustomProperties.zza)localObject1).zza(localzzc);
            }
            localObject4 = new android/util/SparseArray;
            ((SparseArray)localObject4).<init>();
            for (paramInt2 = 0; paramInt2 < paramDataHolder.getCount(); paramInt2++)
            {
              localObject1 = (AppVisibleCustomProperties.zza)localLongSparseArray.get(paramDataHolder.getLong("sqlId", paramInt2, paramDataHolder.getWindowIndex(paramInt2)));
              if (localObject1 != null) {
                ((SparseArray)localObject4).append(paramInt2, ((AppVisibleCustomProperties.zza)localObject1).zzbb());
              }
            }
            paramDataHolder.getMetadata().putSparseParcelableArray("customPropertiesExtra", (SparseArray)localObject4);
            localDataHolder.close();
            paramDataHolder.getMetadata().remove("customPropertiesExtraHolder");
            label348:
            localObject1 = localBundle.getSparseParcelableArray("customPropertiesExtra");
          }
          finally
          {
            localDataHolder.close();
            paramDataHolder.getMetadata().remove("customPropertiesExtraHolder");
          }
          localObject4 = localObject3;
        }
        finally {}
      }
      if (localObject3 == null) {
        return AppVisibleCustomProperties.zzjb;
      }
    }
    return (AppVisibleCustomProperties)((SparseArray)localObject4).get(paramInt1, AppVisibleCustomProperties.zzjb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */