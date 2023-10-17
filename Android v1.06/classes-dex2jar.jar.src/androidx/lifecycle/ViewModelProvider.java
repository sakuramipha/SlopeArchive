package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ViewModelProvider
{
  private static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
  private final Factory mFactory;
  private final ViewModelStore mViewModelStore;
  
  public ViewModelProvider(ViewModelStore paramViewModelStore, Factory paramFactory)
  {
    this.mFactory = paramFactory;
    this.mViewModelStore = paramViewModelStore;
  }
  
  public ViewModelProvider(ViewModelStoreOwner paramViewModelStoreOwner, Factory paramFactory)
  {
    this(paramViewModelStoreOwner.getViewModelStore(), paramFactory);
  }
  
  public <T extends ViewModel> T get(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      return get(localStringBuilder.toString(), paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public <T extends ViewModel> T get(String paramString, Class<T> paramClass)
  {
    ViewModel localViewModel = this.mViewModelStore.get(paramString);
    if (paramClass.isInstance(localViewModel)) {
      return localViewModel;
    }
    paramClass = this.mFactory.create(paramClass);
    this.mViewModelStore.put(paramString, paramClass);
    return paramClass;
  }
  
  public static class AndroidViewModelFactory
    extends ViewModelProvider.NewInstanceFactory
  {
    private static AndroidViewModelFactory sInstance;
    private Application mApplication;
    
    public AndroidViewModelFactory(Application paramApplication)
    {
      this.mApplication = paramApplication;
    }
    
    public static AndroidViewModelFactory getInstance(Application paramApplication)
    {
      if (sInstance == null) {
        sInstance = new AndroidViewModelFactory(paramApplication);
      }
      return sInstance;
    }
    
    public <T extends ViewModel> T create(Class<T> paramClass)
    {
      if (AndroidViewModel.class.isAssignableFrom(paramClass)) {
        try
        {
          ViewModel localViewModel = (ViewModel)paramClass.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { this.mApplication });
          return localViewModel;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append("Cannot create an instance of ");
          localStringBuilder2.append(paramClass);
          throw new RuntimeException(localStringBuilder2.toString(), localInvocationTargetException);
        }
        catch (InstantiationException localInstantiationException)
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append("Cannot create an instance of ");
          localStringBuilder2.append(paramClass);
          throw new RuntimeException(localStringBuilder2.toString(), localInstantiationException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("Cannot create an instance of ");
          localStringBuilder1.append(paramClass);
          throw new RuntimeException(localStringBuilder1.toString(), localIllegalAccessException);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          StringBuilder localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("Cannot create an instance of ");
          localStringBuilder1.append(paramClass);
          throw new RuntimeException(localStringBuilder1.toString(), localNoSuchMethodException);
        }
      }
      return super.create(paramClass);
    }
  }
  
  public static abstract interface Factory
  {
    public abstract <T extends ViewModel> T create(Class<T> paramClass);
  }
  
  public static class NewInstanceFactory
    implements ViewModelProvider.Factory
  {
    public <T extends ViewModel> T create(Class<T> paramClass)
    {
      try
      {
        localObject = (ViewModel)paramClass.newInstance();
        return (T)localObject;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Cannot create an instance of ");
        ((StringBuilder)localObject).append(paramClass);
        throw new RuntimeException(((StringBuilder)localObject).toString(), localIllegalAccessException);
      }
      catch (InstantiationException localInstantiationException)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Cannot create an instance of ");
        ((StringBuilder)localObject).append(paramClass);
        throw new RuntimeException(((StringBuilder)localObject).toString(), localInstantiationException);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\ViewModelProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */