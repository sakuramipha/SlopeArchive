package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import java.io.File;

class FrameworkSQLiteOpenHelper
  implements SupportSQLiteOpenHelper
{
  private final SupportSQLiteOpenHelper.Callback mCallback;
  private final Context mContext;
  private OpenHelper mDelegate;
  private final Object mLock;
  private final String mName;
  private final boolean mUseNoBackupDirectory;
  private boolean mWriteAheadLoggingEnabled;
  
  FrameworkSQLiteOpenHelper(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback)
  {
    this(paramContext, paramString, paramCallback, false);
  }
  
  FrameworkSQLiteOpenHelper(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mName = paramString;
    this.mCallback = paramCallback;
    this.mUseNoBackupDirectory = paramBoolean;
    this.mLock = new Object();
  }
  
  private OpenHelper getDelegate()
  {
    synchronized (this.mLock)
    {
      if (this.mDelegate == null)
      {
        localObject2 = new FrameworkSQLiteDatabase[1];
        OpenHelper localOpenHelper;
        if ((Build.VERSION.SDK_INT >= 23) && (this.mName != null) && (this.mUseNoBackupDirectory))
        {
          File localFile = new java/io/File;
          localFile.<init>(this.mContext.getNoBackupFilesDir(), this.mName);
          localOpenHelper = new androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;
          localOpenHelper.<init>(this.mContext, localFile.getAbsolutePath(), (FrameworkSQLiteDatabase[])localObject2, this.mCallback);
          this.mDelegate = localOpenHelper;
        }
        else
        {
          localOpenHelper = new androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;
          localOpenHelper.<init>(this.mContext, this.mName, (FrameworkSQLiteDatabase[])localObject2, this.mCallback);
          this.mDelegate = localOpenHelper;
        }
        if (Build.VERSION.SDK_INT >= 16) {
          this.mDelegate.setWriteAheadLoggingEnabled(this.mWriteAheadLoggingEnabled);
        }
      }
      Object localObject2 = this.mDelegate;
      return (OpenHelper)localObject2;
    }
  }
  
  public void close()
  {
    getDelegate().close();
  }
  
  public String getDatabaseName()
  {
    return this.mName;
  }
  
  public SupportSQLiteDatabase getReadableDatabase()
  {
    return getDelegate().getReadableSupportDatabase();
  }
  
  public SupportSQLiteDatabase getWritableDatabase()
  {
    return getDelegate().getWritableSupportDatabase();
  }
  
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    synchronized (this.mLock)
    {
      OpenHelper localOpenHelper = this.mDelegate;
      if (localOpenHelper != null) {
        localOpenHelper.setWriteAheadLoggingEnabled(paramBoolean);
      }
      this.mWriteAheadLoggingEnabled = paramBoolean;
      return;
    }
  }
  
  static class OpenHelper
    extends SQLiteOpenHelper
  {
    final SupportSQLiteOpenHelper.Callback mCallback;
    final FrameworkSQLiteDatabase[] mDbRef;
    private boolean mMigrated;
    
    OpenHelper(Context paramContext, String paramString, final FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, SupportSQLiteOpenHelper.Callback paramCallback)
    {
      super(paramString, null, paramCallback.version, new DatabaseErrorHandler()
      {
        public void onCorruption(SQLiteDatabase paramAnonymousSQLiteDatabase)
        {
          FrameworkSQLiteOpenHelper.OpenHelper.this.onCorruption(FrameworkSQLiteOpenHelper.OpenHelper.getWrappedDb(paramArrayOfFrameworkSQLiteDatabase, paramAnonymousSQLiteDatabase));
        }
      });
      this.mCallback = paramCallback;
      this.mDbRef = paramArrayOfFrameworkSQLiteDatabase;
    }
    
    static FrameworkSQLiteDatabase getWrappedDb(FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, SQLiteDatabase paramSQLiteDatabase)
    {
      FrameworkSQLiteDatabase localFrameworkSQLiteDatabase = paramArrayOfFrameworkSQLiteDatabase[0];
      if ((localFrameworkSQLiteDatabase == null) || (!localFrameworkSQLiteDatabase.isDelegate(paramSQLiteDatabase))) {
        paramArrayOfFrameworkSQLiteDatabase[0] = new FrameworkSQLiteDatabase(paramSQLiteDatabase);
      }
      return paramArrayOfFrameworkSQLiteDatabase[0];
    }
    
    public void close()
    {
      try
      {
        super.close();
        this.mDbRef[0] = null;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    SupportSQLiteDatabase getReadableSupportDatabase()
    {
      try
      {
        this.mMigrated = false;
        Object localObject1 = super.getReadableDatabase();
        if (this.mMigrated)
        {
          close();
          localObject1 = getReadableSupportDatabase();
          return (SupportSQLiteDatabase)localObject1;
        }
        localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
        return (SupportSQLiteDatabase)localObject1;
      }
      finally {}
    }
    
    FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase paramSQLiteDatabase)
    {
      return getWrappedDb(this.mDbRef, paramSQLiteDatabase);
    }
    
    SupportSQLiteDatabase getWritableSupportDatabase()
    {
      try
      {
        this.mMigrated = false;
        Object localObject1 = super.getWritableDatabase();
        if (this.mMigrated)
        {
          close();
          localObject1 = getWritableSupportDatabase();
          return (SupportSQLiteDatabase)localObject1;
        }
        localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
        return (SupportSQLiteDatabase)localObject1;
      }
      finally {}
    }
    
    public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mCallback.onConfigure(getWrappedDb(paramSQLiteDatabase));
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      this.mCallback.onCreate(getWrappedDb(paramSQLiteDatabase));
    }
    
    public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      this.mMigrated = true;
      this.mCallback.onDowngrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
    }
    
    public void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      if (!this.mMigrated) {
        this.mCallback.onOpen(getWrappedDb(paramSQLiteDatabase));
      }
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      this.mMigrated = true;
      this.mCallback.onUpgrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\framework\FrameworkSQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */