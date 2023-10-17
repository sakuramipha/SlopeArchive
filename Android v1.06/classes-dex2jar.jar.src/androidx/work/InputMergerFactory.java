package androidx.work;

public abstract class InputMergerFactory
{
  public static InputMergerFactory getDefaultInputMergerFactory()
  {
    new InputMergerFactory()
    {
      public InputMerger createInputMerger(String paramAnonymousString)
      {
        return null;
      }
    };
  }
  
  public abstract InputMerger createInputMerger(String paramString);
  
  public final InputMerger createInputMergerWithDefaultFallback(String paramString)
  {
    InputMerger localInputMerger2 = createInputMerger(paramString);
    InputMerger localInputMerger1 = localInputMerger2;
    if (localInputMerger2 == null) {
      localInputMerger1 = InputMerger.fromClassName(paramString);
    }
    return localInputMerger1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\InputMergerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */