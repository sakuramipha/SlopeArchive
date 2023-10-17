package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public final class zzeak
{
  public static int zza(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    int i = 0;
    if (paramInt == 2) {
      return 0;
    }
    paramSQLiteDatabase = zzh(paramSQLiteDatabase, paramInt);
    paramInt = i;
    if (paramSQLiteDatabase.getCount() > 0)
    {
      paramSQLiteDatabase.moveToNext();
      paramInt = paramSQLiteDatabase.getInt(paramSQLiteDatabase.getColumnIndexOrThrow("value"));
    }
    paramSQLiteDatabase.close();
    return paramInt;
  }
  
  public static long zzb(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    paramSQLiteDatabase = zzh(paramSQLiteDatabase, 2);
    long l;
    if (paramSQLiteDatabase.getCount() > 0)
    {
      paramSQLiteDatabase.moveToNext();
      l = paramSQLiteDatabase.getLong(paramSQLiteDatabase.getColumnIndexOrThrow("value"));
    }
    else
    {
      l = 0L;
    }
    paramSQLiteDatabase.close();
    return l;
  }
  
  public static ArrayList zzc(SQLiteDatabase paramSQLiteDatabase)
  {
    ArrayList localArrayList = new ArrayList();
    paramSQLiteDatabase = paramSQLiteDatabase.query("offline_signal_contents", new String[] { "serialized_proto_data" }, null, null, null, null, null);
    while (paramSQLiteDatabase.moveToNext())
    {
      byte[] arrayOfByte = paramSQLiteDatabase.getBlob(paramSQLiteDatabase.getColumnIndexOrThrow("serialized_proto_data"));
      try
      {
        localArrayList.add(zzazg.zzi(arrayOfByte));
      }
      catch (zzgpi localzzgpi)
      {
        zzbzt.zzg("Unable to deserialize proto from offline signals database:");
        zzbzt.zzg(localzzgpi.getMessage());
      }
    }
    paramSQLiteDatabase.close();
    return localArrayList;
  }
  
  public static void zzd(SQLiteDatabase paramSQLiteDatabase, long paramLong, byte[] paramArrayOfByte)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("timestamp", Long.valueOf(paramLong));
    localContentValues.put("serialized_proto_data", paramArrayOfByte);
    if (paramSQLiteDatabase.update("offline_signal_contents", localContentValues, "timestamp = ?", new String[] { String.valueOf(paramLong) }) == 0) {
      paramSQLiteDatabase.insert("offline_signal_contents", null, localContentValues);
    }
  }
  
  public static void zze(SQLiteDatabase paramSQLiteDatabase)
  {
    zzi(paramSQLiteDatabase, "failed_requests", 0);
    zzi(paramSQLiteDatabase, "total_requests", 0);
    zzi(paramSQLiteDatabase, "completed_requests", 0);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("statistic_name", "last_successful_request_time");
    localContentValues.put("value", Long.valueOf(0L));
    paramSQLiteDatabase.insert("offline_signal_statistics", null, localContentValues);
  }
  
  public static void zzf(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.delete("offline_signal_contents", null, null);
    zzj(paramSQLiteDatabase, "failed_requests", 0);
    zzj(paramSQLiteDatabase, "total_requests", 0);
    zzj(paramSQLiteDatabase, "completed_requests", 0);
  }
  
  public static void zzg(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean2)
    {
      paramSQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[] { "total_requests" }));
      return;
    }
    paramSQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[] { "completed_requests" }));
    if (!paramBoolean1) {
      paramSQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[] { "failed_requests" }));
    }
  }
  
  private static Cursor zzh(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    String[] arrayOfString = new String[1];
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          arrayOfString[0] = "completed_requests";
        } else {
          arrayOfString[0] = "last_successful_request_time";
        }
      }
      else {
        arrayOfString[0] = "total_requests";
      }
    }
    else {
      arrayOfString[0] = "failed_requests";
    }
    return paramSQLiteDatabase.query("offline_signal_statistics", new String[] { "value" }, "statistic_name = ?", arrayOfString, null, null, null);
  }
  
  private static void zzi(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("statistic_name", paramString);
    localContentValues.put("value", Integer.valueOf(0));
    paramSQLiteDatabase.insert("offline_signal_statistics", null, localContentValues);
  }
  
  private static void zzj(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("value", Integer.valueOf(0));
    paramSQLiteDatabase.update("offline_signal_statistics", localContentValues, "statistic_name = ?", new String[] { paramString });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */