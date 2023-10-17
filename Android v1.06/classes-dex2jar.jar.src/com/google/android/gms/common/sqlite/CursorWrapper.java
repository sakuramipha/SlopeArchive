package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

public class CursorWrapper
  extends android.database.CursorWrapper
  implements CrossProcessCursor
{
  private AbstractWindowedCursor zza;
  
  public CursorWrapper(Cursor paramCursor)
  {
    super(paramCursor);
    for (int i = 0; (i < 10) && ((paramCursor instanceof android.database.CursorWrapper)); i++) {
      paramCursor = ((android.database.CursorWrapper)paramCursor).getWrappedCursor();
    }
    if (!(paramCursor instanceof AbstractWindowedCursor))
    {
      paramCursor = String.valueOf(paramCursor.getClass().getName());
      if (paramCursor.length() != 0) {
        paramCursor = "Unknown type: ".concat(paramCursor);
      } else {
        paramCursor = new String("Unknown type: ");
      }
      throw new IllegalArgumentException(paramCursor);
    }
    this.zza = ((AbstractWindowedCursor)paramCursor);
  }
  
  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    this.zza.fillWindow(paramInt, paramCursorWindow);
  }
  
  public CursorWindow getWindow()
  {
    return this.zza.getWindow();
  }
  
  public final boolean onMove(int paramInt1, int paramInt2)
  {
    return this.zza.onMove(paramInt1, paramInt2);
  }
  
  public void setWindow(CursorWindow paramCursorWindow)
  {
    this.zza.setWindow(paramCursorWindow);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\sqlite\CursorWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */