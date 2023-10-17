package androidx.room.util;

import android.database.Cursor;
import android.database.MatrixCursor;

public class CursorUtil
{
  public static Cursor copyAndClose(Cursor paramCursor)
  {
    try
    {
      Object localObject1 = new android/database/MatrixCursor;
      ((MatrixCursor)localObject1).<init>(paramCursor.getColumnNames(), paramCursor.getCount());
      while (paramCursor.moveToNext())
      {
        Object[] arrayOfObject = new Object[paramCursor.getColumnCount()];
        for (int i = 0; i < paramCursor.getColumnCount(); i++)
        {
          int j = paramCursor.getType(i);
          if (j != 0)
          {
            if (j != 1)
            {
              if (j != 2)
              {
                if (j != 3)
                {
                  if (j == 4)
                  {
                    arrayOfObject[i] = paramCursor.getBlob(i);
                  }
                  else
                  {
                    localObject1 = new java/lang/IllegalStateException;
                    ((IllegalStateException)localObject1).<init>();
                    throw ((Throwable)localObject1);
                  }
                }
                else {
                  arrayOfObject[i] = paramCursor.getString(i);
                }
              }
              else {
                arrayOfObject[i] = Double.valueOf(paramCursor.getDouble(i));
              }
            }
            else {
              arrayOfObject[i] = Long.valueOf(paramCursor.getLong(i));
            }
          }
          else {
            arrayOfObject[i] = null;
          }
        }
        ((MatrixCursor)localObject1).addRow(arrayOfObject);
      }
      return (Cursor)localObject1;
    }
    finally
    {
      paramCursor.close();
    }
  }
  
  public static int getColumnIndex(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("`");
    localStringBuilder.append(paramString);
    localStringBuilder.append("`");
    return paramCursor.getColumnIndex(localStringBuilder.toString());
  }
  
  public static int getColumnIndexOrThrow(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("`");
    localStringBuilder.append(paramString);
    localStringBuilder.append("`");
    return paramCursor.getColumnIndexOrThrow(localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\roo\\util\CursorUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */