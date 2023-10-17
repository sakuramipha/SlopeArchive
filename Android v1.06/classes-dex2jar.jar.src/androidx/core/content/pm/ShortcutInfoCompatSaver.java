package androidx.core.content.pm;

import java.util.ArrayList;
import java.util.List;

public abstract class ShortcutInfoCompatSaver<T>
{
  public abstract T addShortcuts(List<ShortcutInfoCompat> paramList);
  
  public List<ShortcutInfoCompat> getShortcuts()
    throws Exception
  {
    return new ArrayList();
  }
  
  public abstract T removeAllShortcuts();
  
  public abstract T removeShortcuts(List<String> paramList);
  
  public static class NoopImpl
    extends ShortcutInfoCompatSaver<Void>
  {
    public Void addShortcuts(List<ShortcutInfoCompat> paramList)
    {
      return null;
    }
    
    public Void removeAllShortcuts()
    {
      return null;
    }
    
    public Void removeShortcuts(List<String> paramList)
    {
      return null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\pm\ShortcutInfoCompatSaver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */