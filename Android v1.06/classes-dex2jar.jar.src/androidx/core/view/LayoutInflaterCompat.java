package androidx.core.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;

public final class LayoutInflaterCompat
{
  private static final String TAG = "LayoutInflaterCompatHC";
  private static boolean sCheckedField;
  private static Field sLayoutInflaterFactory2Field;
  
  private static void forceSetFactory2(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!sCheckedField)
    {
      try
      {
        Field localField1 = LayoutInflater.class.getDeclaredField("mFactory2");
        sLayoutInflaterFactory2Field = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
        localStringBuilder.append(LayoutInflater.class.getName());
        localStringBuilder.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", localStringBuilder.toString(), localNoSuchFieldException);
      }
      sCheckedField = true;
    }
    Field localField2 = sLayoutInflaterFactory2Field;
    if (localField2 != null) {
      try
      {
        localField2.set(paramLayoutInflater, paramFactory2);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramFactory2 = new StringBuilder();
        paramFactory2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
        paramFactory2.append(paramLayoutInflater);
        paramFactory2.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", paramFactory2.toString(), localIllegalAccessException);
      }
    }
  }
  
  @Deprecated
  public static LayoutInflaterFactory getFactory(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.getFactory();
    if ((paramLayoutInflater instanceof Factory2Wrapper)) {
      return ((Factory2Wrapper)paramLayoutInflater).mDelegateFactory;
    }
    return null;
  }
  
  @Deprecated
  public static void setFactory(LayoutInflater paramLayoutInflater, LayoutInflaterFactory paramLayoutInflaterFactory)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject2 = null;
    Object localObject1 = null;
    if (i >= 21)
    {
      if (paramLayoutInflaterFactory != null) {
        localObject1 = new Factory2Wrapper(paramLayoutInflaterFactory);
      }
      paramLayoutInflater.setFactory2((LayoutInflater.Factory2)localObject1);
    }
    else
    {
      localObject1 = localObject2;
      if (paramLayoutInflaterFactory != null) {
        localObject1 = new Factory2Wrapper(paramLayoutInflaterFactory);
      }
      paramLayoutInflater.setFactory2((LayoutInflater.Factory2)localObject1);
      paramLayoutInflaterFactory = paramLayoutInflater.getFactory();
      if ((paramLayoutInflaterFactory instanceof LayoutInflater.Factory2)) {
        forceSetFactory2(paramLayoutInflater, (LayoutInflater.Factory2)paramLayoutInflaterFactory);
      } else {
        forceSetFactory2(paramLayoutInflater, (LayoutInflater.Factory2)localObject1);
      }
    }
  }
  
  public static void setFactory2(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    paramLayoutInflater.setFactory2(paramFactory2);
    if (Build.VERSION.SDK_INT < 21)
    {
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if ((localFactory instanceof LayoutInflater.Factory2)) {
        forceSetFactory2(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      } else {
        forceSetFactory2(paramLayoutInflater, paramFactory2);
      }
    }
  }
  
  static class Factory2Wrapper
    implements LayoutInflater.Factory2
  {
    final LayoutInflaterFactory mDelegateFactory;
    
    Factory2Wrapper(LayoutInflaterFactory paramLayoutInflaterFactory)
    {
      this.mDelegateFactory = paramLayoutInflaterFactory;
    }
    
    public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return this.mDelegateFactory.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    
    public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return this.mDelegateFactory.onCreateView(null, paramString, paramContext, paramAttributeSet);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getClass().getName());
      localStringBuilder.append("{");
      localStringBuilder.append(this.mDelegateFactory);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\LayoutInflaterCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */