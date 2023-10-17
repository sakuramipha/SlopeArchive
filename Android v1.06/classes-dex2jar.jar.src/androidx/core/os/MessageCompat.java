package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Message;

public final class MessageCompat
{
  private static boolean sTryIsAsynchronous = true;
  private static boolean sTrySetAsynchronous = true;
  
  public static boolean isAsynchronous(Message paramMessage)
  {
    if (Build.VERSION.SDK_INT >= 22) {
      return paramMessage.isAsynchronous();
    }
    if ((sTryIsAsynchronous) && (Build.VERSION.SDK_INT >= 16)) {
      try
      {
        boolean bool = paramMessage.isAsynchronous();
        return bool;
      }
      catch (NoSuchMethodError paramMessage)
      {
        sTryIsAsynchronous = false;
      }
    }
    return false;
  }
  
  public static void setAsynchronous(Message paramMessage, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      paramMessage.setAsynchronous(paramBoolean);
      return;
    }
    if ((sTrySetAsynchronous) && (Build.VERSION.SDK_INT >= 16)) {
      try
      {
        paramMessage.setAsynchronous(paramBoolean);
      }
      catch (NoSuchMethodError paramMessage)
      {
        sTrySetAsynchronous = false;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\MessageCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */