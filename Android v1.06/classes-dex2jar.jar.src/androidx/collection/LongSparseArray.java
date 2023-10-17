package androidx.collection;

public class LongSparseArray<E>
  implements Cloneable
{
  private static final Object DELETED = new Object();
  private boolean mGarbage = false;
  private long[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  public LongSparseArray()
  {
    this(10);
  }
  
  public LongSparseArray(int paramInt)
  {
    if (paramInt == 0)
    {
      this.mKeys = ContainerHelpers.EMPTY_LONGS;
      this.mValues = ContainerHelpers.EMPTY_OBJECTS;
    }
    else
    {
      paramInt = ContainerHelpers.idealLongArraySize(paramInt);
      this.mKeys = new long[paramInt];
      this.mValues = new Object[paramInt];
    }
  }
  
  private void gc()
  {
    int m = this.mSize;
    long[] arrayOfLong = this.mKeys;
    Object[] arrayOfObject = this.mValues;
    int i = 0;
    int j;
    for (int k = 0; i < m; k = j)
    {
      Object localObject = arrayOfObject[i];
      j = k;
      if (localObject != DELETED)
      {
        if (i != k)
        {
          arrayOfLong[k] = arrayOfLong[i];
          arrayOfObject[k] = localObject;
          arrayOfObject[i] = null;
        }
        j = k + 1;
      }
      i++;
    }
    this.mGarbage = false;
    this.mSize = k;
  }
  
  public void append(long paramLong, E paramE)
  {
    int i = this.mSize;
    if ((i != 0) && (paramLong <= this.mKeys[(i - 1)]))
    {
      put(paramLong, paramE);
      return;
    }
    if ((this.mGarbage) && (i >= this.mKeys.length)) {
      gc();
    }
    i = this.mSize;
    if (i >= this.mKeys.length)
    {
      int j = ContainerHelpers.idealLongArraySize(i + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
      Object localObject = this.mKeys;
      System.arraycopy(localObject, 0, arrayOfLong, 0, localObject.length);
      localObject = this.mValues;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      this.mKeys = arrayOfLong;
      this.mValues = arrayOfObject;
    }
    this.mKeys[i] = paramLong;
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
  
  public LongSparseArray<E> clone()
  {
    try
    {
      LongSparseArray localLongSparseArray = (LongSparseArray)super.clone();
      localLongSparseArray.mKeys = ((long[])this.mKeys.clone());
      localLongSparseArray.mValues = ((Object[])this.mValues.clone());
      return localLongSparseArray;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public boolean containsKey(long paramLong)
  {
    boolean bool;
    if (indexOfKey(paramLong) >= 0) {
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
  public void delete(long paramLong)
  {
    remove(paramLong);
  }
  
  public E get(long paramLong)
  {
    return (E)get(paramLong, null);
  }
  
  public E get(long paramLong, E paramE)
  {
    int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      if (arrayOfObject[i] != DELETED) {
        return (E)arrayOfObject[i];
      }
    }
    return paramE;
  }
  
  public int indexOfKey(long paramLong)
  {
    if (this.mGarbage) {
      gc();
    }
    return ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramLong);
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
  
  public long keyAt(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(long paramLong, E paramE)
  {
    int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramLong);
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
          this.mKeys[j] = paramLong;
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
          i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramLong) ^ 0xFFFFFFFF;
        }
      }
      j = this.mSize;
      if (j >= this.mKeys.length)
      {
        j = ContainerHelpers.idealLongArraySize(j + 1);
        localObject1 = new long[j];
        Object[] arrayOfObject = new Object[j];
        Object localObject2 = this.mKeys;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        localObject2 = this.mValues;
        System.arraycopy(localObject2, 0, arrayOfObject, 0, localObject2.length);
        this.mKeys = ((long[])localObject1);
        this.mValues = arrayOfObject;
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
      this.mKeys[i] = paramLong;
      this.mValues[i] = paramE;
      this.mSize += 1;
    }
  }
  
  public void putAll(LongSparseArray<? extends E> paramLongSparseArray)
  {
    int j = paramLongSparseArray.size();
    for (int i = 0; i < j; i++) {
      put(paramLongSparseArray.keyAt(i), paramLongSparseArray.valueAt(i));
    }
  }
  
  public E putIfAbsent(long paramLong, E paramE)
  {
    Object localObject = get(paramLong);
    if (localObject == null) {
      put(paramLong, paramE);
    }
    return (E)localObject;
  }
  
  public void remove(long paramLong)
  {
    int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      Object localObject1 = arrayOfObject[i];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        arrayOfObject[i] = localObject2;
        this.mGarbage = true;
      }
    }
  }
  
  public boolean remove(long paramLong, Object paramObject)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object localObject = valueAt(i);
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
      {
        removeAt(i);
        return true;
      }
    }
    return false;
  }
  
  public void removeAt(int paramInt)
  {
    Object[] arrayOfObject = this.mValues;
    Object localObject2 = arrayOfObject[paramInt];
    Object localObject1 = DELETED;
    if (localObject2 != localObject1)
    {
      arrayOfObject[paramInt] = localObject1;
      this.mGarbage = true;
    }
  }
  
  public E replace(long paramLong, E paramE)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = this.mValues;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = paramE;
      return (E)localObject;
    }
    return null;
  }
  
  public boolean replace(long paramLong, E paramE1, E paramE2)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object localObject = this.mValues[i];
      if ((localObject == paramE1) || ((paramE1 != null) && (paramE1.equals(localObject))))
      {
        this.mValues[i] = paramE2;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\collection\LongSparseArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */