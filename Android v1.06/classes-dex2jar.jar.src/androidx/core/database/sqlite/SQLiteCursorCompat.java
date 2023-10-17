package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build.VERSION;

public final class SQLiteCursorCompat
{
  public static void setFillWindowForwardOnly(SQLiteCursor paramSQLiteCursor, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      paramSQLiteCursor.setFillWindowForwardOnly(paramBoolean);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\database\sqlite\SQLiteCursorCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */