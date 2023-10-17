package androidx.tracing;

import android.os.Trace;

final class TraceApi29Impl
{
  public static void beginAsyncSection(String paramString, int paramInt)
  {
    Trace.beginAsyncSection(paramString, paramInt);
  }
  
  public static void endAsyncSection(String paramString, int paramInt)
  {
    Trace.endAsyncSection(paramString, paramInt);
  }
  
  public static void setCounter(String paramString, int paramInt)
  {
    Trace.setCounter(paramString, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\tracing\TraceApi29Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */