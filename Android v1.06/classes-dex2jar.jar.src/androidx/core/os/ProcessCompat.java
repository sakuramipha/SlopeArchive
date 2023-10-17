package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

public final class ProcessCompat
{
  public static boolean isApplicationUid(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Api24Impl.isApplicationUid(paramInt);
    }
    if (Build.VERSION.SDK_INT >= 17) {
      return Api17Impl.isApplicationUid(paramInt);
    }
    if (Build.VERSION.SDK_INT == 16) {
      return Api16Impl.isApplicationUid(paramInt);
    }
    return true;
  }
  
  static class Api16Impl
  {
    private static Method sMethodUserIdIsAppMethod;
    private static boolean sResolved;
    private static final Object sResolvedLock = new Object();
    
    static boolean isApplicationUid(int paramInt)
    {
      try
      {
        synchronized (sResolvedLock)
        {
          if (!sResolved)
          {
            sResolved = true;
            sMethodUserIdIsAppMethod = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[] { Integer.TYPE });
          }
          Object localObject1 = sMethodUserIdIsAppMethod;
          if (localObject1 != null)
          {
            localObject1 = (Boolean)((Method)localObject1).invoke(null, new Object[] { Integer.valueOf(paramInt) });
            if (localObject1 != null) {
              return ((Boolean)localObject1).booleanValue();
            }
            localObject1 = new java/lang/NullPointerException;
            ((NullPointerException)localObject1).<init>();
            throw ((Throwable)localObject1);
          }
        }
        return true;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  static class Api17Impl
  {
    private static Method sMethodUserHandleIsAppMethod;
    private static boolean sResolved;
    private static final Object sResolvedLock = new Object();
    
    static boolean isApplicationUid(int paramInt)
    {
      try
      {
        synchronized (sResolvedLock)
        {
          if (!sResolved)
          {
            sResolved = true;
            sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", new Class[] { Integer.TYPE });
          }
          ??? = sMethodUserHandleIsAppMethod;
          if (??? != null) {
            if ((Boolean)((Method)???).invoke(null, new Object[] { Integer.valueOf(paramInt) }) == null)
            {
              ??? = new java/lang/NullPointerException;
              ((NullPointerException)???).<init>();
              throw ((Throwable)???);
            }
          }
        }
        return true;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  static class Api24Impl
  {
    static boolean isApplicationUid(int paramInt)
    {
      return Process.isApplicationUid(paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\ProcessCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */