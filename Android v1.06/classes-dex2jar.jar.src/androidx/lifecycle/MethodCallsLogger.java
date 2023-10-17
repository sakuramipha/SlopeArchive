package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class MethodCallsLogger
{
  private Map<String, Integer> mCalledMethods = new HashMap();
  
  public boolean approveCall(String paramString, int paramInt)
  {
    Integer localInteger = (Integer)this.mCalledMethods.get(paramString);
    int j = 0;
    int i;
    if (localInteger != null) {
      i = localInteger.intValue();
    } else {
      i = 0;
    }
    if ((i & paramInt) != 0) {
      j = 1;
    }
    this.mCalledMethods.put(paramString, Integer.valueOf(paramInt | i));
    return j ^ 0x1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\MethodCallsLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */