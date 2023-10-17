package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ArrayCreatingInputMerger
  extends InputMerger
{
  private Object concatenateArrayAndNonArray(Object paramObject1, Object paramObject2)
  {
    int i = Array.getLength(paramObject1);
    Object localObject = Array.newInstance(paramObject2.getClass(), i + 1);
    System.arraycopy(paramObject1, 0, localObject, 0, i);
    Array.set(localObject, i, paramObject2);
    return localObject;
  }
  
  private Object concatenateArrays(Object paramObject1, Object paramObject2)
  {
    int j = Array.getLength(paramObject1);
    int i = Array.getLength(paramObject2);
    Object localObject = Array.newInstance(paramObject1.getClass().getComponentType(), j + i);
    System.arraycopy(paramObject1, 0, localObject, 0, j);
    System.arraycopy(paramObject2, 0, localObject, j, i);
    return localObject;
  }
  
  private Object concatenateNonArrays(Object paramObject1, Object paramObject2)
  {
    Object localObject = Array.newInstance(paramObject1.getClass(), 2);
    Array.set(localObject, 0, paramObject1);
    Array.set(localObject, 1, paramObject2);
    return localObject;
  }
  
  private Object createArrayFor(Object paramObject)
  {
    Object localObject = Array.newInstance(paramObject.getClass(), 1);
    Array.set(localObject, 0, paramObject);
    return localObject;
  }
  
  public Data merge(List<Data> paramList)
  {
    Data.Builder localBuilder = new Data.Builder();
    HashMap localHashMap = new HashMap();
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
    {
      Iterator localIterator1 = ((Data)localIterator2.next()).getKeyValueMap().entrySet().iterator();
      while (localIterator1.hasNext())
      {
        paramList = (Map.Entry)localIterator1.next();
        String str = (String)paramList.getKey();
        paramList = paramList.getValue();
        Class localClass1 = paramList.getClass();
        Object localObject = localHashMap.get(str);
        if (localObject == null)
        {
          if (!localClass1.isArray()) {
            paramList = createArrayFor(paramList);
          }
        }
        else
        {
          Class localClass2 = localObject.getClass();
          if (localClass2.equals(localClass1))
          {
            if (localClass2.isArray()) {
              paramList = concatenateArrays(localObject, paramList);
            } else {
              paramList = concatenateNonArrays(localObject, paramList);
            }
          }
          else if ((localClass2.isArray()) && (localClass2.getComponentType().equals(localClass1)))
          {
            paramList = concatenateArrayAndNonArray(localObject, paramList);
          }
          else
          {
            if ((!localClass1.isArray()) || (!localClass1.getComponentType().equals(localClass2))) {
              break label260;
            }
            paramList = concatenateArrayAndNonArray(paramList, localObject);
          }
        }
        localHashMap.put(str, paramList);
      }
      continue;
      label260:
      throw new IllegalArgumentException();
    }
    localBuilder.putAll(localHashMap);
    return localBuilder.build();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\ArrayCreatingInputMerger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */