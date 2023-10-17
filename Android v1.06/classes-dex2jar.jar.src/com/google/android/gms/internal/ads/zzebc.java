package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzebc
  extends SQLiteOpenHelper
{
  private final Context zza;
  private final zzfwc zzb;
  
  public zzebc(Context paramContext, zzfwc paramzzfwc)
  {
    super(paramContext, "AdMobOfflineBufferedPings.db", null, ((Integer)zzba.zzc().zzb(localzzbbc)).intValue());
    this.zza = paramContext;
    this.zzb = paramzzfwc;
  }
  
  static final void zzi(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramSQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[] { paramString, Integer.toString(0) });
  }
  
  private static void zzj(SQLiteDatabase paramSQLiteDatabase, zzbzy paramzzbzy)
  {
    paramSQLiteDatabase.beginTransaction();
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("event_state = ");
      ((StringBuilder)localObject).append(1);
      localObject = ((StringBuilder)localObject).toString();
      Cursor localCursor = paramSQLiteDatabase.query("offline_buffered_pings", new String[] { "url" }, (String)localObject, null, null, null, "timestamp ASC", null);
      int k = localCursor.getCount();
      localObject = new String[k];
      int j = 0;
      for (int i = 0; localCursor.moveToNext(); i++)
      {
        int m = localCursor.getColumnIndex("url");
        if (m != -1) {
          localObject[i] = localCursor.getString(m);
        }
      }
      localCursor.close();
      paramSQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[] { Integer.toString(1) });
      paramSQLiteDatabase.setTransactionSuccessful();
      paramSQLiteDatabase.endTransaction();
      for (i = j; i < k; i++) {
        paramzzbzy.zza(localObject[i]);
      }
      return;
    }
    finally
    {
      paramSQLiteDatabase.endTransaction();
    }
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
  }
  
  public final void zzc(String paramString)
  {
    zze(new zzeaz(this, paramString));
  }
  
  public final void zzd(zzebe paramzzebe)
  {
    zze(new zzeax(this, paramzzebe));
  }
  
  final void zze(zzfdg paramzzfdg)
  {
    zzfvr.zzq(this.zzb.zzb(new zzeav(this)), new zzebb(this, paramzzfdg), this.zzb);
  }
  
  final void zzg(SQLiteDatabase paramSQLiteDatabase, zzbzy paramzzbzy, String paramString)
  {
    this.zzb.execute(new zzeaw(paramSQLiteDatabase, paramString, paramzzbzy));
  }
  
  public final void zzh(zzbzy paramzzbzy, String paramString)
  {
    zze(new zzeba(this, paramzzbzy, paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzebc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */