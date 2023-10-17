package androidx.room;

public class FtsOptions
{
  public static final String TOKENIZER_ICU = "icu";
  public static final String TOKENIZER_PORTER = "porter";
  public static final String TOKENIZER_SIMPLE = "simple";
  public static final String TOKENIZER_UNICODE61 = "unicode61";
  
  public static enum MatchInfo
  {
    private static final MatchInfo[] $VALUES;
    
    static
    {
      MatchInfo localMatchInfo1 = new MatchInfo("FTS3", 0);
      FTS3 = localMatchInfo1;
      MatchInfo localMatchInfo2 = new MatchInfo("FTS4", 1);
      FTS4 = localMatchInfo2;
      $VALUES = new MatchInfo[] { localMatchInfo1, localMatchInfo2 };
    }
    
    private MatchInfo() {}
  }
  
  public static enum Order
  {
    private static final Order[] $VALUES;
    
    static
    {
      Order localOrder2 = new Order("ASC", 0);
      ASC = localOrder2;
      Order localOrder1 = new Order("DESC", 1);
      DESC = localOrder1;
      $VALUES = new Order[] { localOrder2, localOrder1 };
    }
    
    private Order() {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\FtsOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */