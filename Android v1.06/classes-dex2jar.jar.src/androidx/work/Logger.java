package androidx.work;

import android.util.Log;

public abstract class Logger
{
  private static final int MAX_PREFIXED_TAG_LENGTH = 20;
  private static final int MAX_TAG_LENGTH = 23;
  private static final String TAG_PREFIX = "WM-";
  private static Logger sLogger;
  
  public Logger(int paramInt) {}
  
  public static Logger get()
  {
    try
    {
      if (sLogger == null)
      {
        localObject1 = new androidx/work/Logger$LogcatLogger;
        ((LogcatLogger)localObject1).<init>(3);
        sLogger = (Logger)localObject1;
      }
      Object localObject1 = sLogger;
      return (Logger)localObject1;
    }
    finally {}
  }
  
  public static void setLogger(Logger paramLogger)
  {
    try
    {
      sLogger = paramLogger;
      return;
    }
    finally
    {
      paramLogger = finally;
      throw paramLogger;
    }
  }
  
  public static String tagWithPrefix(String paramString)
  {
    int j = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(23);
    localStringBuilder.append("WM-");
    int i = MAX_PREFIXED_TAG_LENGTH;
    if (j >= i) {
      localStringBuilder.append(paramString.substring(0, i));
    } else {
      localStringBuilder.append(paramString);
    }
    return localStringBuilder.toString();
  }
  
  public abstract void debug(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void error(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void info(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void verbose(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void warning(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public static class LogcatLogger
    extends Logger
  {
    private int mLoggingLevel;
    
    public LogcatLogger(int paramInt)
    {
      super();
      this.mLoggingLevel = paramInt;
    }
    
    public void debug(String paramString1, String paramString2, Throwable... paramVarArgs)
    {
      if (this.mLoggingLevel <= 3) {
        if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
          Log.d(paramString1, paramString2, paramVarArgs[0]);
        } else {
          Log.d(paramString1, paramString2);
        }
      }
    }
    
    public void error(String paramString1, String paramString2, Throwable... paramVarArgs)
    {
      if (this.mLoggingLevel <= 6) {
        if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
          Log.e(paramString1, paramString2, paramVarArgs[0]);
        } else {
          Log.e(paramString1, paramString2);
        }
      }
    }
    
    public void info(String paramString1, String paramString2, Throwable... paramVarArgs)
    {
      if (this.mLoggingLevel <= 4) {
        if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
          Log.i(paramString1, paramString2, paramVarArgs[0]);
        } else {
          Log.i(paramString1, paramString2);
        }
      }
    }
    
    public void verbose(String paramString1, String paramString2, Throwable... paramVarArgs)
    {
      if (this.mLoggingLevel <= 2) {
        if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
          Log.v(paramString1, paramString2, paramVarArgs[0]);
        } else {
          Log.v(paramString1, paramString2);
        }
      }
    }
    
    public void warning(String paramString1, String paramString2, Throwable... paramVarArgs)
    {
      if (this.mLoggingLevel <= 5) {
        if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
          Log.w(paramString1, paramString2, paramVarArgs[0]);
        } else {
          Log.w(paramString1, paramString2);
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */