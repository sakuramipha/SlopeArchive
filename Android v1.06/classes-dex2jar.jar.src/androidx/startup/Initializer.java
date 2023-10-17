package androidx.startup;

import android.content.Context;
import java.util.List;

public abstract interface Initializer<T>
{
  public abstract T create(Context paramContext);
  
  public abstract List<Class<? extends Initializer<?>>> dependencies();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\startup\Initializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */