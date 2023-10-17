package androidx.collection;

public class SparseArrayCompat<E>
  implements Cloneable
{
  private static final Object DELETED = new Object();
  private boolean mGarbage = false;
  private int[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  public SparseArrayCompat()
  {
    this(10);
  }
  
  public SparseArrayCompat(int paramInt)
  {
    if (paramInt == 0)
    {
      this.mKeys = ContainerHelpers.EMPTY_INTS;
      this.mValues = ContainerHelpers.EMPTY_OBJECTS;
    }
    else
    {
      paramInt = ContainerHelpers.idealIntArraySize(paramInt);
      this.mKeys = new int[paramInt];
      this.mValues = new Object[paramInt];
    }
  }
  
  private void gc()
  {
    int m = this.mSize;
    int[] arrayOfInt = this.mKeys;
    Object[] arrayOfObject = this.mValues;
    int k = 0;
    int j;
    for (int i = 0; k < m; i = j)
    {
      Object localObject = arrayOfObject[k];
      j = i;
      if (localObject != DELETED)
      {
        if (k != i)
        {
          arrayOfInt[i] = arrayOfInt[k];
          arrayOfObject[i] = localObject;
          arrayOfObject[k] = null;
        }
        j = i + 1;
      }
      k++;
    }
    this.mGarbage = false;
    this.mSize = i;
  }
  
  public void append(int paramInt, E paramE)
  {
    int i = this.mSize;
    if ((i != 0) && (paramInt <= this.mKeys[(i - 1)]))
    {
      put(paramInt, paramE);
      return;
    }
    if ((this.mGarbage) && (i >= this.mKeys.length)) {
      gc();
    }
    i = this.mSize;
    if (i >= this.mKeys.length)
    {
      int j = ContainerHelpers.idealIntArraySize(i + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      Object localObject = this.mKeys;
      System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
      localObject = this.mValues;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      this.mKeys = arrayOfInt;
      this.mValues = arrayOfObject;
    }
    this.mKeys[i] = paramInt;
    this.mValues[i] = paramE;
    this.mSize = (i + 1);
  }
  
  public void clear()
  {
    int j = this.mSize;
    Object[] arrayOfObject = this.mValues;
    for (int i = 0; i < j; i++) {
      arrayOfObject[i] = null;
    }
    this.mSize = 0;
    this.mGarbage = false;
  }
  
  public SparseArrayCompat<E> clone()
  {
    try
    {
      SparseArrayCompat localSparseArrayCompat = (SparseArrayCompat)super.clone();
      localSparseArrayCompat.mKeys = ((int[])this.mKeys.clone());
      localSparseArrayCompat.mValues = ((Object[])this.mValues.clone());
      return localSparseArrayCompat;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public boolean containsKey(int paramInt)
  {
    boolean bool;
    if (indexOfKey(paramInt) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(E paramE)
  {
    boolean bool;
    if (indexOfValue(paramE) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public void delete(int paramInt)
  {
    remove(paramInt);
  }
  
  public E get(int paramInt)
  {
    return (E)get(paramInt, null);
  }
  
  public E get(int paramInt, E paramE)
  {
    paramInt = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      if (arrayOfObject[paramInt] != DELETED) {
        return (E)arrayOfObject[paramInt];
      }
    }
    return paramE;
  }
  
  public int indexOfKey(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
  }
  
  public int indexOfValue(E paramE)
  {
    if (this.mGarbage) {
      gc();
    }
    for (int i = 0; i < this.mSize; i++) {
      if (this.mValues[i] == paramE) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int keyAt(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(int paramInt, E paramE)
  {
    int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    if (i >= 0)
    {
      this.mValues[i] = paramE;
    }
    else
    {
      int j = i ^ 0xFFFFFFFF;
      int k = this.mSize;
      Object localObject1;
      if (j < k)
      {
        localObject1 = this.mValues;
        if (localObject1[j] == DELETED)
        {
          this.mKeys[j] = paramInt;
          localObject1[j] = paramE;
          return;
        }
      }
      i = j;
      if (this.mGarbage)
      {
        i = j;
        if (k >= this.mKeys.length)
        {
          gc();
          i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt) ^ 0xFFFFFFFF;
        }
      }
      j = this.mSize;
      if (j >= this.mKeys.length)
      {
        j = ContainerHelpers.idealIntArraySize(j + 1);
        int[] arrayOfInt = new int[j];
        localObject1 = new Object[j];
        Object localObject2 = this.mKeys;
        System.arraycopy(localObject2, 0, arrayOfInt, 0, localObject2.length);
        localObject2 = this.mValues;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        this.mKeys = arrayOfInt;
        this.mValues = ((Object[])localObject1);
      }
      k = this.mSize;
      if (k - i != 0)
      {
        localObject1 = this.mKeys;
        j = i + 1;
        System.arraycopy(localObject1, i, localObject1, j, k - i);
        localObject1 = this.mValues;
        System.arraycopy(localObject1, i, localObject1, j, this.mSize - i);
      }
      this.mKeys[i] = paramInt;
      this.mValues[i] = paramE;
      this.mSize += 1;
    }
  }
  
  public void putAll(SparseArrayCompat<? extends E> paramSparseArrayCompat)
  {
    int j = paramSparseArrayCompat.size();
    for (int i = 0; i < j; i++) {
      put(paramSparseArrayCompat.keyAt(i), paramSparseArrayCompat.valueAt(i));
    }
  }
  
  public E putIfAbsent(int paramInt, E paramE)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      put(paramInt, paramE);
    }
    return (E)localObject;
  }
  
  public void remove(int paramInt)
  {
    paramInt = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      Object localObject1 = arrayOfObject[paramInt];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        arrayOfObject[paramInt] = localObject2;
        this.mGarbage = true;
      }
    }
  }
  
  public boolean remove(int paramInt, Object paramObject)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object localObject = valueAt(paramInt);
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
      {
        removeAt(paramInt);
        return true;
      }
    }
    return false;
  }
  
  public void removeAt(int paramInt)
  {
    Object[] arrayOfObject = this.mValues;
    Object localObject1 = arrayOfObject[paramInt];
    Object localObject2 = DELETED;
    if (localObject1 != localObject2)
    {
      arrayOfObject[paramInt] = localObject2;
      this.mGarbage = true;
    }
  }
  
  public void removeAtRange(int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(this.mSize, paramInt2 + paramInt1);
    while (paramInt1 < paramInt2)
    {
      removeAt(paramInt1);
      paramInt1++;
    }
  }
  
  public E replace(int paramInt, E paramE)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramE;
      return (E)localObject;
    }
    return null;
  }
  
  public boolean replace(int paramInt, E paramE1, E paramE2)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object localObject = this.mValues[paramInt];
      if ((localObject == paramE1) || ((paramE1 != null) && (paramE1.equals(localObject))))
      {
        this.mValues[paramInt] = paramE2;
        return true;
      }
    }
    return false;
  }
  
  public void setValueAt(int paramInt, E paramE)
  {
    if (this.mGarbage) {
      gc();
    }
    this.mValues[paramInt] = paramE;
  }
  
  public int size()
  {
    if (this.mGarbage) {
      gc();
    }
    return this.mSize;
  }
  
  public String toString()
  {
    if (size() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.mSize * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < this.mSize; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(keyAt(i));
      localStringBuilder.append('=');
      Object localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public E valueAt(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return (E)this.mValues[paramInt];
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\collection\SparseArrayCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */