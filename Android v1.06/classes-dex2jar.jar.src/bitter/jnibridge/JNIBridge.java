package bitter.jnibridge;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JNIBridge
{
  static void disableInterfaceProxy(Object arg0)
  {
    if (??? != null)
    {
      a locala = (a)Proxy.getInvocationHandler(???);
      synchronized (a.-$$Nest$fgeta(locala))
      {
        a.-$$Nest$fputb(locala, 0L);
      }
    }
  }
  
  static native Object invoke(long paramLong, Class paramClass, Method paramMethod, Object[] paramArrayOfObject);
  
  static Object newInterfaceProxy(long paramLong, Class[] paramArrayOfClass)
  {
    return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), paramArrayOfClass, new a(paramLong));
  }
  
  private static class a
    implements InvocationHandler
  {
    private Object a = new Object[0];
    private long b;
    private Constructor c;
    
    public a(long paramLong)
    {
      this.b = paramLong;
      try
      {
        Constructor localConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[] { Class.class, Integer.TYPE });
        this.c = localConstructor;
        localConstructor.setAccessible(true);
      }
      catch (NoClassDefFoundError|NoSuchMethodException localNoClassDefFoundError)
      {
        this.c = null;
      }
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      synchronized (this.a)
      {
        long l = this.b;
        if (l == 0L) {
          return null;
        }
        try
        {
          Object localObject1 = JNIBridge.invoke(l, paramMethod.getDeclaringClass(), paramMethod, paramArrayOfObject);
          return localObject1;
        }
        catch (NoSuchMethodError localNoSuchMethodError)
        {
          Object[] arrayOfObject;
          if (this.c != null)
          {
            if ((paramMethod.getModifiers() & 0x400) == 0)
            {
              arrayOfObject = paramArrayOfObject;
              if (paramArrayOfObject == null) {
                arrayOfObject = new Object[0];
              }
              paramArrayOfObject = paramMethod.getDeclaringClass();
              paramObject = ((MethodHandles.Lookup)this.c.newInstance(new Object[] { paramArrayOfObject, Integer.valueOf(2) })).in(paramArrayOfObject).unreflectSpecial(paramMethod, paramArrayOfObject).bindTo(paramObject).invokeWithArguments(arrayOfObject);
              return paramObject;
            }
            throw arrayOfObject;
          }
          System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
          throw arrayOfObject;
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\bitter\jnibridge\JNIBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */