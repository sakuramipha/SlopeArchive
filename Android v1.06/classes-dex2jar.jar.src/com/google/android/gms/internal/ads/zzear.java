package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class zzear
{
  private final zzawx zza;
  private final Context zzb;
  private final zzdzv zzc;
  private final zzbzz zzd;
  private final String zze;
  private final zzfen zzf;
  private final zzg zzg;
  
  public zzear(Context paramContext, zzbzz paramzzbzz, zzawx paramzzawx, zzdzv paramzzdzv, String paramString, zzfen paramzzfen)
  {
    this.zzb = paramContext;
    this.zzd = paramzzbzz;
    this.zza = paramzzawx;
    this.zzc = paramzzdzv;
    this.zze = paramString;
    this.zzf = paramzzfen;
    this.zzg = zzt.zzo().zzh();
  }
  
  private static final void zzc(SQLiteDatabase paramSQLiteDatabase, ArrayList paramArrayList)
  {
    int j = paramArrayList.size();
    int i = 0;
    long l2;
    for (long l1 = 0L; i < j; l1 = l2)
    {
      zzazg localzzazg = (zzazg)paramArrayList.get(i);
      l2 = l1;
      if (localzzazg.zzw() == 2)
      {
        l2 = l1;
        if (localzzazg.zze() > l1) {
          l2 = localzzazg.zze();
        }
      }
      i++;
    }
    if (l1 != 0L)
    {
      paramArrayList = new ContentValues();
      paramArrayList.put("value", Long.valueOf(l1));
      paramSQLiteDatabase.update("offline_signal_statistics", paramArrayList, "statistic_name = 'last_successful_request_time'", null);
    }
  }
  
  public final void zzb(boolean paramBoolean)
  {
    try
    {
      zzdzv localzzdzv = this.zzc;
      zzean localzzean = new com/google/android/gms/internal/ads/zzean;
      localzzean.<init>(this, paramBoolean);
      localzzdzv.zza(localzzean);
      return;
    }
    catch (Exception localException)
    {
      zzbzt.zzg("Error in offline signals database startup: ".concat(String.valueOf(localException.getMessage())));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzear.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */