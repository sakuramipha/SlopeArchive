package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract interface SupportSQLiteOpenHelper
  extends Closeable
{
  public abstract void close();
  
  public abstract String getDatabaseName();
  
  public abstract SupportSQLiteDatabase getReadableDatabase();
  
  public abstract SupportSQLiteDatabase getWritableDatabase();
  
  public abstract void setWriteAheadLoggingEnabled(boolean paramBoolean);
  
  public static abstract class Callback
  {
    private static final String TAG = "SupportSQLite";
    public final int version;
    
    public Callback(int paramInt)
    {
      this.version = paramInt;
    }
    
    private void deleteDatabaseFile(String paramString)
    {
      if ((!paramString.equalsIgnoreCase(":memory:")) && (paramString.trim().length() != 0))
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("deleting the database file: ");
        ((StringBuilder)localObject).append(paramString);
        Log.w("SupportSQLite", ((StringBuilder)localObject).toString());
        try
        {
          if (Build.VERSION.SDK_INT >= 16)
          {
            localObject = new java/io/File;
            ((File)localObject).<init>(paramString);
            SQLiteDatabase.deleteDatabase((File)localObject);
          }
          else
          {
            try
            {
              localObject = new java/io/File;
              ((File)localObject).<init>(paramString);
              if (!((File)localObject).delete())
              {
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>();
                ((StringBuilder)localObject).append("Could not delete the database file ");
                ((StringBuilder)localObject).append(paramString);
                Log.e("SupportSQLite", ((StringBuilder)localObject).toString());
              }
            }
            catch (Exception paramString)
            {
              Log.e("SupportSQLite", "error while deleting corrupted database file", paramString);
            }
          }
          return;
        }
        catch (Exception paramString)
        {
          Log.w("SupportSQLite", "delete failed: ", paramString);
        }
      }
    }
    
    public void onConfigure(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onCorruption(SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Corruption reported by sqlite on database: ");
      ((StringBuilder)localObject1).append(paramSupportSQLiteDatabase.getPath());
      Log.e("SupportSQLite", ((StringBuilder)localObject1).toString());
      if (!paramSupportSQLiteDatabase.isOpen())
      {
        deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
        return;
      }
      localObject1 = null;
      Object localObject3 = null;
      try
      {
        try
        {
          List localList = paramSupportSQLiteDatabase.getAttachedDbs();
          localObject1 = localList;
        }
        finally
        {
          break label89;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;) {}
      }
      localObject3 = localObject2;
      try
      {
        paramSupportSQLiteDatabase.close();
      }
      catch (IOException localIOException)
      {
        label89:
        if (localObject2 == null) {
          break label186;
        }
        paramSupportSQLiteDatabase = ((List)localObject2).iterator();
        while (paramSupportSQLiteDatabase.hasNext()) {
          deleteDatabaseFile((String)((Pair)paramSupportSQLiteDatabase.next()).second);
        }
        deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
        return;
      }
      if (localObject3 != null)
      {
        paramSupportSQLiteDatabase = ((List)localObject3).iterator();
        while (paramSupportSQLiteDatabase.hasNext()) {
          deleteDatabaseFile((String)((Pair)paramSupportSQLiteDatabase.next()).second);
        }
      }
      deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
      throw ((Throwable)localObject2);
    }
    
    public abstract void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public void onDowngrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("Can't downgrade database from version ");
      paramSupportSQLiteDatabase.append(paramInt1);
      paramSupportSQLiteDatabase.append(" to ");
      paramSupportSQLiteDatabase.append(paramInt2);
      throw new SQLiteException(paramSupportSQLiteDatabase.toString());
    }
    
    public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public abstract void onUpgrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2);
  }
  
  public static class Configuration
  {
    public final SupportSQLiteOpenHelper.Callback callback;
    public final Context context;
    public final String name;
    public final boolean useNoBackupDirectory;
    
    Configuration(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback)
    {
      this(paramContext, paramString, paramCallback, false);
    }
    
    Configuration(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback, boolean paramBoolean)
    {
      this.context = paramContext;
      this.name = paramString;
      this.callback = paramCallback;
      this.useNoBackupDirectory = paramBoolean;
    }
    
    public static Builder builder(Context paramContext)
    {
      return new Builder(paramContext);
    }
    
    public static class Builder
    {
      SupportSQLiteOpenHelper.Callback mCallback;
      Context mContext;
      String mName;
      boolean mUseNoBackUpDirectory;
      
      Builder(Context paramContext)
      {
        this.mContext = paramContext;
      }
      
      public SupportSQLiteOpenHelper.Configuration build()
      {
        if (this.mCallback != null)
        {
          if (this.mContext != null)
          {
            if ((this.mUseNoBackUpDirectory) && (TextUtils.isEmpty(this.mName))) {
              throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            return new SupportSQLiteOpenHelper.Configuration(this.mContext, this.mName, this.mCallback, this.mUseNoBackUpDirectory);
          }
          throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
      }
      
      public Builder callback(SupportSQLiteOpenHelper.Callback paramCallback)
      {
        this.mCallback = paramCallback;
        return this;
      }
      
      public Builder name(String paramString)
      {
        this.mName = paramString;
        return this;
      }
      
      public Builder noBackupDirectory(boolean paramBoolean)
      {
        this.mUseNoBackUpDirectory = paramBoolean;
        return this;
      }
    }
  }
  
  public static abstract interface Factory
  {
    public abstract SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration paramConfiguration);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\SupportSQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */