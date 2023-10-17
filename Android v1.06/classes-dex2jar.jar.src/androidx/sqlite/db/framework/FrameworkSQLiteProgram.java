package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;

class FrameworkSQLiteProgram
  implements SupportSQLiteProgram
{
  private final SQLiteProgram mDelegate;
  
  FrameworkSQLiteProgram(SQLiteProgram paramSQLiteProgram)
  {
    this.mDelegate = paramSQLiteProgram;
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    this.mDelegate.bindBlob(paramInt, paramArrayOfByte);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    this.mDelegate.bindDouble(paramInt, paramDouble);
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    this.mDelegate.bindLong(paramInt, paramLong);
  }
  
  public void bindNull(int paramInt)
  {
    this.mDelegate.bindNull(paramInt);
  }
  
  public void bindString(int paramInt, String paramString)
  {
    this.mDelegate.bindString(paramInt, paramString);
  }
  
  public void clearBindings()
  {
    this.mDelegate.clearBindings();
  }
  
  public void close()
  {
    this.mDelegate.close();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\sqlite\db\framework\FrameworkSQLiteProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */