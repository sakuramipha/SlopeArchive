package androidx.browser.trusted;

public abstract interface TokenStore
{
  public abstract Token load();
  
  public abstract void store(Token paramToken);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TokenStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */