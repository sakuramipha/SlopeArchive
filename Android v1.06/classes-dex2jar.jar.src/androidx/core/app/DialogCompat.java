package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;

public class DialogCompat
{
  public static View requireViewById(Dialog paramDialog, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramDialog.requireViewById(paramInt);
    }
    paramDialog = paramDialog.findViewById(paramInt);
    if (paramDialog != null) {
      return paramDialog;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\DialogCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */