package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;

public final class CursorWindowCompat
{
  public static CursorWindow create(String paramString, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new CursorWindow(paramString, paramLong);
    }
    if (Build.VERSION.SDK_INT >= 15) {
      return new CursorWindow(paramString);
    }
    return new CursorWindow(false);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\database\CursorWindowCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */