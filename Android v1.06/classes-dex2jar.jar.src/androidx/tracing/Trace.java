package androidx.tracing;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Trace
{
  static final String TAG = "Trace";
  private static Method sAsyncTraceBeginMethod;
  private static Method sAsyncTraceEndMethod;
  private static Method sIsTagEnabledMethod;
  private static Method sTraceCounterMethod;
  private static long sTraceTagApp;
  
  public static void beginAsyncSection(String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceBeginMethod == null)
      {
        TraceApi29Impl.beginAsyncSection(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    beginAsyncSectionFallback(paramString, paramInt);
  }
  
  private static void beginAsyncSectionFallback(String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      try
      {
        if (sAsyncTraceBeginMethod == null) {
          sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", new Class[] { Long.TYPE, String.class, Integer.TYPE });
        }
        sAsyncTraceBeginMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        handleException("asyncTraceBegin", paramString);
      }
    }
  }
  
  public static void beginSection(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      TraceApi18Impl.beginSection(paramString);
    }
  }
  
  public static void endAsyncSection(String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceEndMethod == null)
      {
        TraceApi29Impl.endAsyncSection(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    endAsyncSectionFallback(paramString, paramInt);
  }
  
  private static void endAsyncSectionFallback(String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      try
      {
        if (sAsyncTraceEndMethod == null) {
          sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", new Class[] { Long.TYPE, String.class, Integer.TYPE });
        }
        sAsyncTraceEndMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        handleException("asyncTraceEnd", paramString);
      }
    }
  }
  
  public static void endSection()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      TraceApi18Impl.endSection();
    }
  }
  
  private static void handleException(String paramString, Exception paramException)
  {
    if ((paramException instanceof InvocationTargetException))
    {
      paramString = paramException.getCause();
      if ((paramString instanceof RuntimeException)) {
        throw ((RuntimeException)paramString);
      }
      throw new RuntimeException(paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unable to call ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" via reflection");
    Log.v("Trace", localStringBuilder.toString(), paramException);
  }
  
  public static boolean isEnabled()
  {
    try
    {
      if (sIsTagEnabledMethod == null)
      {
        boolean bool = android.os.Trace.isEnabled();
        return bool;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    return isEnabledFallback();
  }
  
  private static boolean isEnabledFallback()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      try
      {
        if (sIsTagEnabledMethod == null)
        {
          sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
          sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", new Class[] { Long.TYPE });
        }
        boolean bool = ((Boolean)sIsTagEnabledMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp) })).booleanValue();
        return bool;
      }
      catch (Exception localException)
      {
        handleException("isTagEnabled", localException);
      }
    }
    return false;
  }
  
  public static void setCounter(String paramString, int paramInt)
  {
    try
    {
      if (sTraceCounterMethod == null)
      {
        TraceApi29Impl.setCounter(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    setCounterFallback(paramString, paramInt);
  }
  
  private static void setCounterFallback(String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      try
      {
        if (sTraceCounterMethod == null) {
          sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", new Class[] { Long.TYPE, String.class, Integer.TYPE });
        }
        sTraceCounterMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        handleException("traceCounter", paramString);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\tracing\Trace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */