package com.unity3d.player;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

final class ReflectionHelper
{
  protected static boolean LOG = false;
  protected static final boolean LOGV = false;
  private static b[] a = new b['က'];
  private static long b = 0L;
  private static long c = 0L;
  private static boolean d = false;
  
  private static float a(Class paramClass1, Class paramClass2)
  {
    if (paramClass1.equals(paramClass2)) {
      return 1.0F;
    }
    if ((!paramClass1.isPrimitive()) && (!paramClass2.isPrimitive())) {}
    for (;;)
    {
      try
      {
        Class localClass = paramClass1.asSubclass(paramClass2);
        if (localClass != null) {
          return 0.5F;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        continue;
      }
      try
      {
        paramClass1 = paramClass2.asSubclass(paramClass1);
        if (paramClass1 != null) {
          return 0.1F;
        }
      }
      catch (ClassCastException paramClass1) {}
    }
    return 0.0F;
  }
  
  private static float a(Class paramClass, Class[] paramArrayOfClass1, Class[] paramArrayOfClass2)
  {
    if (paramArrayOfClass2.length == 0) {
      return 0.1F;
    }
    int j = 0;
    int i;
    if (paramArrayOfClass1 == null) {
      i = 0;
    } else {
      i = paramArrayOfClass1.length;
    }
    if (i + 1 != paramArrayOfClass2.length) {
      return 0.0F;
    }
    float f = 1.0F;
    if (paramArrayOfClass1 != null)
    {
      int k = paramArrayOfClass1.length;
      i = 0;
      f = 1.0F;
      while (j < k)
      {
        f *= a(paramArrayOfClass1[j], paramArrayOfClass2[i]);
        j++;
        i++;
      }
    }
    return f * a(paramClass, paramArrayOfClass2[(paramArrayOfClass2.length - 1)]);
  }
  
  private static Class a(String paramString, int[] paramArrayOfInt)
  {
    while (paramArrayOfInt[0] < paramString.length())
    {
      int i = paramArrayOfInt[0];
      paramArrayOfInt[0] = (i + 1);
      char c1 = paramString.charAt(i);
      if ((c1 != '(') && (c1 != ')')) {
        if (c1 == 'L')
        {
          i = paramString.indexOf(';', paramArrayOfInt[0]);
          if (i == -1) {
            break;
          }
          paramString = paramString.substring(paramArrayOfInt[0], i);
          paramArrayOfInt[0] = (i + 1);
          paramString = paramString.replace('/', '.');
        }
      }
      try
      {
        paramString = Class.forName(paramString);
        return paramString;
      }
      catch (ClassNotFoundException paramString)
      {
        for (;;) {}
      }
      if (c1 == 'Z') {
        return Boolean.TYPE;
      }
      if (c1 == 'I') {
        return Integer.TYPE;
      }
      if (c1 == 'F') {
        return Float.TYPE;
      }
      if (c1 == 'V') {
        return Void.TYPE;
      }
      if (c1 == 'B') {
        return Byte.TYPE;
      }
      if (c1 == 'C') {
        return Character.TYPE;
      }
      if (c1 == 'S') {
        return Short.TYPE;
      }
      if (c1 == 'J') {
        return Long.TYPE;
      }
      if (c1 == 'D') {
        return Double.TYPE;
      }
      if (c1 == '[') {
        return Array.newInstance(a(paramString, paramArrayOfInt), 0).getClass();
      }
      paramString = new StringBuilder();
      paramString.append("! parseType; ");
      paramString.append(c1);
      paramString.append(" is not known!");
      u.Log(5, paramString.toString());
    }
    return null;
  }
  
  private static void a(b paramb, Member paramMember)
  {
    try
    {
      paramb.e = paramMember;
      paramMember = a;
      paramMember[(b.-$$Nest$fgetd(paramb) & paramMember.length - 1)] = paramb;
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  private static boolean a(b paramb)
  {
    try
    {
      Object localObject = a;
      localObject = localObject[(b.-$$Nest$fgetd(paramb) & localObject.length - 1)];
      boolean bool = paramb.equals(localObject);
      if (!bool) {
        return false;
      }
      paramb.e = ((b)localObject).e;
      return true;
    }
    finally {}
  }
  
  private static Class[] a(String paramString)
  {
    int[] arrayOfInt = new int[1];
    int i = 0;
    arrayOfInt[0] = 0;
    Object localObject = new ArrayList();
    while (arrayOfInt[0] < paramString.length())
    {
      Class localClass = a(paramString, arrayOfInt);
      if (localClass == null) {
        break;
      }
      ((ArrayList)localObject).add(localClass);
    }
    paramString = new Class[((ArrayList)localObject).size()];
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramString[i] = ((Class)((Iterator)localObject).next());
      i++;
    }
    return paramString;
  }
  
  /* Error */
  protected static boolean beginProxyCall(long paramLong)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: lload_0
    //   4: getstatic 28	com/unity3d/player/ReflectionHelper:b	J
    //   7: lcmp
    //   8: ifne +18 -> 26
    //   11: getstatic 204	com/unity3d/player/ReflectionHelper:c	J
    //   14: lconst_1
    //   15: ladd
    //   16: putstatic 204	com/unity3d/player/ReflectionHelper:c	J
    //   19: iconst_1
    //   20: istore_2
    //   21: ldc 2
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_2
    //   28: goto -7 -> 21
    //   31: astore_3
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_3
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramLong	long
    //   20	8	2	bool	boolean
    //   31	5	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	19	31	finally
  }
  
  protected static void endProxyCall()
  {
    try
    {
      long l = c - 1L;
      c = l;
      if ((0L == l) && (d)) {
        ReflectionHelper.class.notifyAll();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  protected static void endUnityLaunch()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 28	com/unity3d/player/ReflectionHelper:b	J
    //   6: lconst_1
    //   7: ladd
    //   8: putstatic 28	com/unity3d/player/ReflectionHelper:b	J
    //   11: iconst_1
    //   12: putstatic 207	com/unity3d/player/ReflectionHelper:d	Z
    //   15: getstatic 204	com/unity3d/player/ReflectionHelper:c	J
    //   18: lconst_0
    //   19: lcmp
    //   20: ifle +23 -> 43
    //   23: ldc 2
    //   25: invokevirtual 216	java/lang/Object:wait	()V
    //   28: goto -13 -> 15
    //   31: astore_0
    //   32: goto +19 -> 51
    //   35: astore_0
    //   36: bipush 6
    //   38: ldc -38
    //   40: invokestatic 166	com/unity3d/player/u:Log	(ILjava/lang/String;)V
    //   43: iconst_0
    //   44: putstatic 207	com/unity3d/player/ReflectionHelper:d	Z
    //   47: ldc 2
    //   49: monitorexit
    //   50: return
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_0
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   31	1	0	localObject	Object
    //   35	20	0	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   3	15	31	finally
    //   15	28	31	finally
    //   36	43	31	finally
    //   43	47	31	finally
    //   3	15	35	java/lang/InterruptedException
    //   15	28	35	java/lang/InterruptedException
  }
  
  protected static Constructor getConstructorID(Class paramClass, String paramString)
  {
    b localb = new b(paramClass, "", paramString);
    Object localObject2;
    if (a(localb))
    {
      localObject2 = (Constructor)localb.e;
    }
    else
    {
      Class[] arrayOfClass = a(paramString);
      float f2 = 0.0F;
      Constructor[] arrayOfConstructor = paramClass.getConstructors();
      int j = arrayOfConstructor.length;
      int i = 0;
      localObject1 = null;
      for (;;)
      {
        localObject2 = localObject1;
        if (i >= j) {
          break;
        }
        localObject2 = arrayOfConstructor[i];
        float f3 = a(Void.TYPE, ((Constructor)localObject2).getParameterTypes(), arrayOfClass);
        float f1 = f2;
        if (f3 > f2)
        {
          if (f3 == 1.0F) {
            break;
          }
          f1 = f3;
          localObject1 = localObject2;
        }
        i++;
        f2 = f1;
      }
      a(localb, (Member)localObject2);
    }
    if (localObject2 != null) {
      return (Constructor)localObject2;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("<init>");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(" in class ");
    ((StringBuilder)localObject1).append(paramClass.getName());
    throw new NoSuchMethodError(((StringBuilder)localObject1).toString());
  }
  
  protected static Field getFieldID(Class paramClass, String paramString1, String paramString2, boolean paramBoolean)
  {
    Class localClass1 = paramClass;
    b localb = new b(localClass1, paramString1, paramString2);
    if (a(localb))
    {
      paramClass = (Field)localb.e;
    }
    else
    {
      Class[] arrayOfClass = a(paramString2);
      float f1 = 0.0F;
      paramClass = null;
      Class localClass2;
      for (;;)
      {
        localClass2 = paramClass;
        if (localClass1 == null) {
          break;
        }
        Field[] arrayOfField = localClass1.getDeclaredFields();
        int j = arrayOfField.length;
        int i = 0;
        float f2;
        for (localClass2 = paramClass;; localClass2 = paramClass)
        {
          f2 = f1;
          paramClass = localClass2;
          if (i >= j) {
            break;
          }
          Field localField = arrayOfField[i];
          float f3;
          if (paramBoolean != Modifier.isStatic(localField.getModifiers()))
          {
            f3 = f1;
            paramClass = localClass2;
          }
          else if (localField.getName().compareTo(paramString1) != 0)
          {
            f3 = f1;
            paramClass = localClass2;
          }
          else
          {
            f2 = a(localField.getType(), null, arrayOfClass);
            f3 = f1;
            paramClass = localClass2;
            if (f2 > f1)
            {
              paramClass = localField;
              if (f2 == 1.0F) {
                break;
              }
              f3 = f2;
            }
          }
          i++;
          f1 = f3;
        }
        if (f2 == 1.0F)
        {
          localClass2 = paramClass;
          break;
        }
        localClass2 = paramClass;
        if (localClass1.isPrimitive()) {
          break;
        }
        localClass2 = paramClass;
        if (localClass1.isInterface()) {
          break;
        }
        localClass2 = paramClass;
        if (localClass1.equals(Object.class)) {
          break;
        }
        if (localClass1.equals(Void.TYPE))
        {
          localClass2 = paramClass;
          break;
        }
        localClass1 = localClass1.getSuperclass();
        f1 = f2;
      }
      a(localb, localClass2);
      paramClass = localClass2;
    }
    if (paramClass == null)
    {
      if (paramBoolean) {
        paramClass = "static";
      } else {
        paramClass = "non-static";
      }
      throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", new Object[] { paramClass, paramString1, paramString2, localClass1.getName() }));
    }
    return paramClass;
  }
  
  protected static String getFieldSignature(Field paramField)
  {
    paramField = paramField.getType();
    if (paramField.isPrimitive())
    {
      localObject = paramField.getName();
      if ("boolean".equals(localObject)) {
        return "Z";
      }
      if ("byte".equals(localObject)) {
        return "B";
      }
      if ("char".equals(localObject)) {
        return "C";
      }
      if ("double".equals(localObject)) {
        return "D";
      }
      if ("float".equals(localObject)) {
        return "F";
      }
      if ("int".equals(localObject)) {
        return "I";
      }
      if ("long".equals(localObject)) {
        return "J";
      }
      paramField = (Field)localObject;
      if ("short".equals(localObject)) {
        paramField = "S";
      }
      return paramField;
    }
    if (paramField.isArray()) {
      return paramField.getName().replace('.', '/');
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("L");
    ((StringBuilder)localObject).append(paramField.getName().replace('.', '/'));
    ((StringBuilder)localObject).append(";");
    return ((StringBuilder)localObject).toString();
  }
  
  protected static Method getMethodID(Class paramClass, String paramString1, String paramString2, boolean paramBoolean)
  {
    b localb = new b(paramClass, paramString1, paramString2);
    Object localObject;
    if (a(localb))
    {
      localObject = (Method)localb.e;
    }
    else
    {
      Class[] arrayOfClass = a(paramString2);
      float f1 = 0.0F;
      Class localClass = null;
      localObject = paramClass;
      paramClass = localClass;
      for (;;)
      {
        localClass = paramClass;
        if (localObject == null) {
          break;
        }
        Method[] arrayOfMethod = ((Class)localObject).getDeclaredMethods();
        int j = arrayOfMethod.length;
        int i = 0;
        float f2;
        for (localClass = paramClass;; localClass = paramClass)
        {
          f2 = f1;
          paramClass = localClass;
          if (i >= j) {
            break;
          }
          Method localMethod = arrayOfMethod[i];
          if (paramBoolean != Modifier.isStatic(localMethod.getModifiers()))
          {
            f2 = f1;
            paramClass = localClass;
          }
          else if (localMethod.getName().compareTo(paramString1) != 0)
          {
            f2 = f1;
            paramClass = localClass;
          }
          else
          {
            float f3 = a(localMethod.getReturnType(), localMethod.getParameterTypes(), arrayOfClass);
            f2 = f1;
            paramClass = localClass;
            if (f3 > f1)
            {
              paramClass = localMethod;
              if (f3 == 1.0F)
              {
                f2 = f3;
                break;
              }
              f2 = f3;
            }
          }
          i++;
          f1 = f2;
        }
        if (f2 == 1.0F)
        {
          localClass = paramClass;
          break;
        }
        localClass = paramClass;
        if (((Class)localObject).isPrimitive()) {
          break;
        }
        localClass = paramClass;
        if (((Class)localObject).isInterface()) {
          break;
        }
        localClass = paramClass;
        if (localObject.equals(Object.class)) {
          break;
        }
        if (localObject.equals(Void.TYPE))
        {
          localClass = paramClass;
          break;
        }
        localObject = ((Class)localObject).getSuperclass();
        f1 = f2;
      }
      a(localb, localClass);
      paramClass = (Class)localObject;
      localObject = localClass;
    }
    if (localObject == null)
    {
      if (paramBoolean) {
        localObject = "static";
      } else {
        localObject = "non-static";
      }
      throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", new Object[] { localObject, paramString1, paramString2, paramClass.getName() }));
    }
    return (Method)localObject;
  }
  
  private static native void nativeProxyFinalize(long paramLong);
  
  private static native Object nativeProxyInvoke(long paramLong, String paramString, Object[] paramArrayOfObject);
  
  private static native void nativeProxyLogJNIInvokeException(long paramLong);
  
  protected static Object newProxyInstance(UnityPlayer paramUnityPlayer, long paramLong, Class paramClass)
  {
    return newProxyInstance(paramUnityPlayer, paramLong, new Class[] { paramClass });
  }
  
  protected static Object newProxyInstance(UnityPlayer paramUnityPlayer, long paramLong, Class[] paramArrayOfClass)
  {
    return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), paramArrayOfClass, new a(paramLong, paramUnityPlayer, paramArrayOfClass));
  }
  
  protected static void setNativeExceptionOnProxy(Object paramObject, long paramLong, boolean paramBoolean)
  {
    paramObject = (a)Proxy.getInvocationHandler(paramObject);
    a.-$$Nest$fputd((a)paramObject, paramLong);
    a.-$$Nest$fpute((a)paramObject, paramBoolean);
  }
  
  class a
    implements ReflectionHelper.d
  {
    private Runnable a;
    private UnityPlayer b;
    private long c;
    private long d;
    private boolean e;
    final long f;
    
    a(UnityPlayer paramUnityPlayer, Class[] paramArrayOfClass)
    {
      long l = ReflectionHelper.-$$Nest$sfgetb();
      this.a = new ReflectionHelper.c(l, this$1);
      this.b = paramUnityPlayer;
      this.c = l;
    }
    
    private Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      Object[] arrayOfObject = paramArrayOfObject;
      if (paramArrayOfObject == null) {}
      try
      {
        arrayOfObject = new Object[0];
        paramArrayOfObject = paramMethod.getDeclaringClass();
        Constructor localConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[] { Class.class, Integer.TYPE });
        localConstructor.setAccessible(true);
        paramObject = ((MethodHandles.Lookup)localConstructor.newInstance(new Object[] { paramArrayOfObject, Integer.valueOf(2) })).in(paramArrayOfObject).unreflectSpecial(paramMethod, paramArrayOfObject).bindTo(paramObject).invokeWithArguments(arrayOfObject);
        return paramObject;
      }
      catch (NoClassDefFoundError paramObject)
      {
        u.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
        ReflectionHelper.-$$Nest$smnativeProxyLogJNIInvokeException(this.d);
      }
      return null;
    }
    
    protected void finalize()
    {
      this.b.queueGLThreadEvent(this.a);
      super.finalize();
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (!ReflectionHelper.beginProxyCall(this.c))
      {
        u.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
        return null;
      }
      try
      {
        this.d = 0L;
        this.e = false;
        Object localObject = ReflectionHelper.-$$Nest$smnativeProxyInvoke(this.f, paramMethod.getName(), paramArrayOfObject);
        long l;
        if (this.e)
        {
          if ((paramMethod.getModifiers() & 0x400) == 0)
          {
            paramObject = a(paramObject, paramMethod, paramArrayOfObject);
            return paramObject;
          }
          l = this.d;
        }
        do
        {
          ReflectionHelper.-$$Nest$smnativeProxyLogJNIInvokeException(l);
          break;
          l = this.d;
        } while (l != 0L);
        return localObject;
      }
      finally
      {
        ReflectionHelper.endProxyCall();
      }
    }
  }
  
  private static class b
  {
    private final Class a;
    private final String b;
    private final String c;
    private final int d;
    public volatile Member e;
    
    b(Class paramClass, String paramString1, String paramString2)
    {
      this.a = paramClass;
      this.b = paramString1;
      this.c = paramString2;
      this.d = (((paramClass.hashCode() + 527) * 31 + paramString1.hashCode()) * 31 + paramString2.hashCode());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((this.d != ((b)paramObject).d) || (!this.c.equals(((b)paramObject).c)) || (!this.b.equals(((b)paramObject).b)) || (!this.a.equals(((b)paramObject).a))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.d;
    }
  }
  
  private static class c
    implements Runnable
  {
    final long a;
    final long b;
    
    public c(long paramLong1, long paramLong2)
    {
      this.a = paramLong1;
      this.b = paramLong2;
    }
    
    public void run()
    {
      if (!ReflectionHelper.beginProxyCall(this.a)) {
        return;
      }
      try
      {
        ReflectionHelper.-$$Nest$smnativeProxyFinalize(this.b);
        return;
      }
      finally
      {
        ReflectionHelper.endProxyCall();
      }
    }
  }
  
  protected static abstract interface d
    extends InvocationHandler
  {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\ReflectionHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */