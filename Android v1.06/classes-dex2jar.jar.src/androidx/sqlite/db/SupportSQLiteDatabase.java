package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

public abstract interface SupportSQLiteDatabase
  extends Closeable
{
  public abstract void beginTransaction();
  
  public abstract void beginTransactionNonExclusive();
  
  public abstract void beginTransactionWithListener(SQLiteTransactionListener paramSQLiteTransactionListener);
  
  public abstract void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener paramSQLiteTransactionListener);
  
  public abstract SupportSQLiteStatement compileStatement(String paramString);
  
  public abstract int delete(String paramString1, String paramString2, Object[] paramArrayOfObject);
  
  public abstract void disableWriteAheadLogging();
  
  public abstract boolean enableWriteAheadLogging();
  
  public abstract void endTransaction();
  
  public abstract void execSQL(String paramString)
    throws SQLException;
  
  public abstract void execSQL(String paramString, Object[] paramArrayOfObject)
    throws SQLException;
  
  public abstract List<Pair<String, String>> getAttachedDbs();
  
  public abstract long getMaximumSize();
  
  public abstract long getPageSize();
  
  public abstract String getPath();
  
  public abstract int getVersion();
  
  public abstract boolean inTransaction();
  
  public abstract long insert(String paramString, int paramInt, ContentValues paramContentValues)
    throws SQLException;
  
  public abstract boolean isDatabaseIntegrityOk();
  
  public abstract boolean isDbLockedByCurrentThread();
  
  public abstract boolean isOpen();
  
  public abstract boolean isReadOnly();
  
  public abstract boolean isWriteAheadLoggingEnabled();
  
  public abstract boolean needUpgrade(int paramInt);
  
  public abstract Cursor query(SupportSQLiteQuery paramSupportSQLiteQuery);
  
  public abstract Cursor query(SupportSQLiteQuery paramSupportSQLiteQuery, CancellationSignal paramCancellationSignal);
  
  public abstract Cursor query(String paramString);
  
  public abstract Cursor query(String paramString, Object[] paramArrayOfObject);
  
  public abstract void setForeignKeyConstraintsEnabled(boolean paramBoolean);
  
  public abstract void setLocale(Locale paramLocale);
  
  public abstract void setMaxSqlCacheSize(int paramInt);
  
  public abstract long setMaximumSize(long paramLong);
  
  public abstract void setPageSize(long paramLong);
  
  public abstract void setTransactionSuccessful();
  
  public abstract void setVersion(int paramInt);
  
  public abstract int update(String paramString1, int paramInt, ContentValues paramContentValues, String paramString2, Object[] paramArrayOfObject);
  
  public abstract boolean yieldIfContendedSafely();
  
  public abstract boolean yieldIfContendedSafely(long paramLong);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\SupportSQLiteDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */