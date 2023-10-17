package androidx.core.telephony;

import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TelephonyManagerCompat
{
  private static Method sGetDeviceIdMethod;
  private static Method sGetSubIdMethod;
  
  public static String getImei(TelephonyManager paramTelephonyManager)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getImei(paramTelephonyManager);
    }
    if (Build.VERSION.SDK_INT >= 22)
    {
      int i = getSubscriptionId(paramTelephonyManager);
      if ((i != Integer.MAX_VALUE) && (i != -1))
      {
        i = SubscriptionManagerCompat.getSlotIndex(i);
        if (Build.VERSION.SDK_INT >= 23) {
          return Api23Impl.getDeviceId(paramTelephonyManager, i);
        }
        try
        {
          if (sGetDeviceIdMethod == null)
          {
            Method localMethod = TelephonyManager.class.getDeclaredMethod("getDeviceId", new Class[] { Integer.TYPE });
            sGetDeviceIdMethod = localMethod;
            localMethod.setAccessible(true);
          }
          paramTelephonyManager = (String)sGetDeviceIdMethod.invoke(paramTelephonyManager, new Object[] { Integer.valueOf(i) });
          return paramTelephonyManager;
        }
        catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramTelephonyManager)
        {
          return null;
        }
      }
    }
    return paramTelephonyManager.getDeviceId();
  }
  
  public static int getSubscriptionId(TelephonyManager paramTelephonyManager)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getSubscriptionId(paramTelephonyManager);
    }
    if (Build.VERSION.SDK_INT >= 22) {}
    try
    {
      if (sGetSubIdMethod == null)
      {
        Method localMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
        sGetSubIdMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramTelephonyManager = (Integer)sGetSubIdMethod.invoke(paramTelephonyManager, new Object[0]);
      if ((paramTelephonyManager != null) && (paramTelephonyManager.intValue() != -1))
      {
        int i = paramTelephonyManager.intValue();
        return i;
      }
    }
    catch (InvocationTargetException|IllegalAccessException|NoSuchMethodException paramTelephonyManager)
    {
      for (;;) {}
    }
    return Integer.MAX_VALUE;
  }
  
  private static class Api23Impl
  {
    static String getDeviceId(TelephonyManager paramTelephonyManager, int paramInt)
    {
      return paramTelephonyManager.getDeviceId(paramInt);
    }
  }
  
  private static class Api26Impl
  {
    static String getImei(TelephonyManager paramTelephonyManager)
    {
      return paramTelephonyManager.getImei();
    }
  }
  
  private static class Api30Impl
  {
    static int getSubscriptionId(TelephonyManager paramTelephonyManager)
    {
      return paramTelephonyManager.getSubscriptionId();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\telephony\TelephonyManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */