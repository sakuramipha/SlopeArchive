package androidx.core.os;

import android.os.Build.VERSION;
import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserHandleCompat
{
  private static Method sGetUserIdMethod;
  private static Constructor<UserHandle> sUserHandleConstructor;
  
  private static Method getGetUserIdMethod()
    throws NoSuchMethodException
  {
    if (sGetUserIdMethod == null)
    {
      Method localMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[] { Integer.TYPE });
      sGetUserIdMethod = localMethod;
      localMethod.setAccessible(true);
    }
    return sGetUserIdMethod;
  }
  
  private static Constructor<UserHandle> getUserHandleConstructor()
    throws NoSuchMethodException
  {
    if (sUserHandleConstructor == null)
    {
      Constructor localConstructor = UserHandle.class.getDeclaredConstructor(new Class[] { Integer.TYPE });
      sUserHandleConstructor = localConstructor;
      localConstructor.setAccessible(true);
    }
    return sUserHandleConstructor;
  }
  
  public static UserHandle getUserHandleForUid(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return Api24Impl.getUserHandleForUid(paramInt);
    }
    try
    {
      Object localObject1 = (Integer)getGetUserIdMethod().invoke(null, new Object[] { Integer.valueOf(paramInt) });
      localObject1 = (UserHandle)getUserHandleConstructor().newInstance(new Object[] { localObject1 });
      return (UserHandle)localObject1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (InstantiationException localInstantiationException)
    {
      InstantiationError localInstantiationError = new InstantiationError();
      localInstantiationError.initCause(localInstantiationException);
      throw localInstantiationError;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new IllegalAccessError();
      ((Error)localObject2).initCause(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject2 = new NoSuchMethodError();
      ((Error)localObject2).initCause(localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
  }
  
  private static class Api24Impl
  {
    static UserHandle getUserHandleForUid(int paramInt)
    {
      return UserHandle.getUserHandleForUid(paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\os\UserHandleCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */