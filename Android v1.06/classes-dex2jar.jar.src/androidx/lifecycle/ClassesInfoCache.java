package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ClassesInfoCache
{
  private static final int CALL_TYPE_NO_ARG = 0;
  private static final int CALL_TYPE_PROVIDER = 1;
  private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
  static ClassesInfoCache sInstance = new ClassesInfoCache();
  private final Map<Class, CallbackInfo> mCallbackMap = new HashMap();
  private final Map<Class, Boolean> mHasLifecycleMethods = new HashMap();
  
  private CallbackInfo createInfo(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null)
    {
      localObject1 = getInfo((Class)localObject1);
      if (localObject1 != null) {
        localHashMap.putAll(((CallbackInfo)localObject1).mHandlerToEvent);
      }
    }
    Object localObject3 = paramClass.getInterfaces();
    int j = localObject3.length;
    Object localObject2;
    for (int i = 0; i < j; i++)
    {
      localObject1 = getInfo(localObject3[i]).mHandlerToEvent.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        verifyAndPutHandler(localHashMap, (MethodReference)((Map.Entry)localObject2).getKey(), (Lifecycle.Event)((Map.Entry)localObject2).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod == null) {
      paramArrayOfMethod = getDeclaredMethods(paramClass);
    }
    int k = paramArrayOfMethod.length;
    j = 0;
    boolean bool = false;
    while (j < k)
    {
      localObject2 = paramArrayOfMethod[j];
      localObject3 = (OnLifecycleEvent)((Method)localObject2).getAnnotation(OnLifecycleEvent.class);
      if (localObject3 != null)
      {
        localObject1 = ((Method)localObject2).getParameterTypes();
        if (localObject1.length > 0)
        {
          if (localObject1[0].isAssignableFrom(LifecycleOwner.class)) {
            i = 1;
          } else {
            throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
          }
        }
        else {
          i = 0;
        }
        localObject3 = ((OnLifecycleEvent)localObject3).value();
        if (localObject1.length > 1) {
          if (localObject1[1].isAssignableFrom(Lifecycle.Event.class))
          {
            if (localObject3 == Lifecycle.Event.ON_ANY) {
              i = 2;
            } else {
              throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
            }
          }
          else {
            throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
          }
        }
        if (localObject1.length <= 2)
        {
          verifyAndPutHandler(localHashMap, new MethodReference(i, (Method)localObject2), (Lifecycle.Event)localObject3, paramClass);
          bool = true;
        }
      }
      else
      {
        j++;
        continue;
      }
      throw new IllegalArgumentException("cannot have more than 2 params");
    }
    paramArrayOfMethod = new CallbackInfo(localHashMap);
    this.mCallbackMap.put(paramClass, paramArrayOfMethod);
    this.mHasLifecycleMethods.put(paramClass, Boolean.valueOf(bool));
    return paramArrayOfMethod;
  }
  
  private Method[] getDeclaredMethods(Class paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethods();
      return paramClass;
    }
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
  
  private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> paramMap, MethodReference paramMethodReference, Lifecycle.Event paramEvent, Class paramClass)
  {
    Lifecycle.Event localEvent = (Lifecycle.Event)paramMap.get(paramMethodReference);
    if ((localEvent != null) && (paramEvent != localEvent))
    {
      paramMap = paramMethodReference.mMethod;
      paramMethodReference = new StringBuilder();
      paramMethodReference.append("Method ");
      paramMethodReference.append(paramMap.getName());
      paramMethodReference.append(" in ");
      paramMethodReference.append(paramClass.getName());
      paramMethodReference.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramMethodReference.append(localEvent);
      paramMethodReference.append(", new value ");
      paramMethodReference.append(paramEvent);
      throw new IllegalArgumentException(paramMethodReference.toString());
    }
    if (localEvent == null) {
      paramMap.put(paramMethodReference, paramEvent);
    }
  }
  
  CallbackInfo getInfo(Class paramClass)
  {
    CallbackInfo localCallbackInfo = (CallbackInfo)this.mCallbackMap.get(paramClass);
    if (localCallbackInfo != null) {
      return localCallbackInfo;
    }
    return createInfo(paramClass, null);
  }
  
  boolean hasLifecycleMethods(Class paramClass)
  {
    Object localObject = (Boolean)this.mHasLifecycleMethods.get(paramClass);
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    localObject = getDeclaredMethods(paramClass);
    int j = localObject.length;
    for (int i = 0; i < j; i++) {
      if ((OnLifecycleEvent)localObject[i].getAnnotation(OnLifecycleEvent.class) != null)
      {
        createInfo(paramClass, (Method[])localObject);
        return true;
      }
    }
    this.mHasLifecycleMethods.put(paramClass, Boolean.valueOf(false));
    return false;
  }
  
  static class CallbackInfo
  {
    final Map<Lifecycle.Event, List<ClassesInfoCache.MethodReference>> mEventToHandlers;
    final Map<ClassesInfoCache.MethodReference, Lifecycle.Event> mHandlerToEvent;
    
    CallbackInfo(Map<ClassesInfoCache.MethodReference, Lifecycle.Event> paramMap)
    {
      this.mHandlerToEvent = paramMap;
      this.mEventToHandlers = new HashMap();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Lifecycle.Event localEvent = (Lifecycle.Event)localEntry.getValue();
        List localList = (List)this.mEventToHandlers.get(localEvent);
        paramMap = localList;
        if (localList == null)
        {
          paramMap = new ArrayList();
          this.mEventToHandlers.put(localEvent, paramMap);
        }
        paramMap.add(localEntry.getKey());
      }
    }
    
    private static void invokeMethodsForEvent(List<ClassesInfoCache.MethodReference> paramList, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      if (paramList != null) {
        for (int i = paramList.size() - 1; i >= 0; i--) {
          ((ClassesInfoCache.MethodReference)paramList.get(i)).invokeCallback(paramLifecycleOwner, paramEvent, paramObject);
        }
      }
    }
    
    void invokeCallbacks(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      invokeMethodsForEvent((List)this.mEventToHandlers.get(paramEvent), paramLifecycleOwner, paramEvent, paramObject);
      invokeMethodsForEvent((List)this.mEventToHandlers.get(Lifecycle.Event.ON_ANY), paramLifecycleOwner, paramEvent, paramObject);
    }
  }
  
  static class MethodReference
  {
    final int mCallType;
    final Method mMethod;
    
    MethodReference(int paramInt, Method paramMethod)
    {
      this.mCallType = paramInt;
      this.mMethod = paramMethod;
      paramMethod.setAccessible(true);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (MethodReference)paramObject;
        if ((this.mCallType != ((MethodReference)paramObject).mCallType) || (!this.mMethod.getName().equals(((MethodReference)paramObject).mMethod.getName()))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.mCallType * 31 + this.mMethod.getName().hashCode();
    }
    
    void invokeCallback(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      try
      {
        int i = this.mCallType;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2) {
              this.mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner, paramEvent });
            }
          }
          else {
            this.mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner });
          }
        }
        else {
          this.mMethod.invoke(paramObject, new Object[0]);
        }
        return;
      }
      catch (IllegalAccessException paramLifecycleOwner)
      {
        throw new RuntimeException(paramLifecycleOwner);
      }
      catch (InvocationTargetException paramLifecycleOwner)
      {
        throw new RuntimeException("Failed to call observer method", paramLifecycleOwner.getCause());
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\lifecycle\ClassesInfoCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */