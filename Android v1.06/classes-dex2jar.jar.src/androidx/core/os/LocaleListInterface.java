package androidx.core.os;

import java.util.Locale;

abstract interface LocaleListInterface
{
  public abstract Locale get(int paramInt);
  
  public abstract Locale getFirstMatch(String[] paramArrayOfString);
  
  public abstract Object getLocaleList();
  
  public abstract int indexOf(Locale paramLocale);
  
  public abstract boolean isEmpty();
  
  public abstract int size();
  
  public abstract String toLanguageTags();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\LocaleListInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */