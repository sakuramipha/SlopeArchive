package androidx.core.location;

import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public final class LocationCompat
{
  private static final String EXTRA_IS_MOCK = "mockLocation";
  private static Method sSetIsFromMockProviderMethod;
  
  public static long getElapsedRealtimeMillis(Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return TimeUnit.NANOSECONDS.toMillis(Api17Impl.getElapsedRealtimeNanos(paramLocation));
    }
    long l1 = System.currentTimeMillis() - paramLocation.getTime();
    long l2 = SystemClock.elapsedRealtime();
    if (l1 < 0L) {
      return l2;
    }
    if (l1 > l2) {
      return 0L;
    }
    return l2 - l1;
  }
  
  public static long getElapsedRealtimeNanos(Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return Api17Impl.getElapsedRealtimeNanos(paramLocation);
    }
    return TimeUnit.MILLISECONDS.toNanos(getElapsedRealtimeMillis(paramLocation));
  }
  
  private static Method getSetIsFromMockProviderMethod()
    throws NoSuchMethodException
  {
    if (sSetIsFromMockProviderMethod == null)
    {
      Method localMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[] { Boolean.TYPE });
      sSetIsFromMockProviderMethod = localMethod;
      localMethod.setAccessible(true);
    }
    return sSetIsFromMockProviderMethod;
  }
  
  public static boolean isMock(Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return Api18Impl.isMock(paramLocation);
    }
    paramLocation = paramLocation.getExtras();
    if (paramLocation == null) {
      return false;
    }
    return paramLocation.getBoolean("mockLocation", false);
  }
  
  public static void setMock(Location paramLocation, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 18)
    {
      try
      {
        getSetIsFromMockProviderMethod().invoke(paramLocation, new Object[] { Boolean.valueOf(paramBoolean) });
      }
      catch (InvocationTargetException paramLocation)
      {
        throw new RuntimeException(paramLocation);
      }
      catch (IllegalAccessException paramLocation)
      {
        IllegalAccessError localIllegalAccessError = new IllegalAccessError();
        localIllegalAccessError.initCause(paramLocation);
        throw localIllegalAccessError;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramLocation = new NoSuchMethodError();
        paramLocation.initCause(localNoSuchMethodException);
        throw paramLocation;
      }
    }
    else
    {
      Bundle localBundle = paramLocation.getExtras();
      if (localBundle == null)
      {
        localBundle = new Bundle();
        localBundle.putBoolean("mockLocation", true);
        paramLocation.setExtras(localBundle);
      }
      else
      {
        localBundle.putBoolean("mockLocation", true);
      }
    }
  }
  
  private static class Api17Impl
  {
    static long getElapsedRealtimeNanos(Location paramLocation)
    {
      return paramLocation.getElapsedRealtimeNanos();
    }
  }
  
  private static class Api18Impl
  {
    static boolean isMock(Location paramLocation)
    {
      return paramLocation.isFromMockProvider();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\location\LocationCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */