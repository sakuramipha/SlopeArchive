package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.io.File;

class SQLiteCopyOpenHelperFactory
  implements SupportSQLiteOpenHelper.Factory
{
  private final String mCopyFromAssetPath;
  private final File mCopyFromFile;
  private final SupportSQLiteOpenHelper.Factory mDelegate;
  
  SQLiteCopyOpenHelperFactory(String paramString, File paramFile, SupportSQLiteOpenHelper.Factory paramFactory)
  {
    this.mCopyFromAssetPath = paramString;
    this.mCopyFromFile = paramFile;
    this.mDelegate = paramFactory;
  }
  
  public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration paramConfiguration)
  {
    return new SQLiteCopyOpenHelper(paramConfiguration.context, this.mCopyFromAssetPath, this.mCopyFromFile, paramConfiguration.callback.version, this.mDelegate.create(paramConfiguration));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\SQLiteCopyOpenHelperFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */