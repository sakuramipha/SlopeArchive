package androidx.work;

import java.util.List;

public abstract class InputMerger
{
  private static final String TAG = Logger.tagWithPrefix("InputMerger");
  
  public static InputMerger fromClassName(String paramString)
  {
    try
    {
      InputMerger localInputMerger = (InputMerger)Class.forName(paramString).newInstance();
      return localInputMerger;
    }
    catch (Exception localException)
    {
      Logger localLogger = Logger.get();
      String str = TAG;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Trouble instantiating + ");
      localStringBuilder.append(paramString);
      localLogger.error(str, localStringBuilder.toString(), new Throwable[] { localException });
    }
    return null;
  }
  
  public abstract Data merge(List<Data> paramList);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\InputMerger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */