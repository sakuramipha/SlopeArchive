package androidx.collection;

public final class CircularArray<E>
{
  private int mCapacityBitmask;
  private E[] mElements;
  private int mHead;
  private int mTail;
  
  public CircularArray()
  {
    this(8);
  }
  
  public CircularArray(int paramInt)
  {
    if (paramInt >= 1)
    {
      if (paramInt <= 1073741824)
      {
        int i = paramInt;
        if (Integer.bitCount(paramInt) != 1) {
          i = Integer.highestOneBit(paramInt - 1) << 1;
        }
        this.mCapacityBitmask = (i - 1);
        this.mElements = ((Object[])new Object[i]);
        return;
      }
      throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    throw new IllegalArgumentException("capacity must be >= 1");
  }
  
  private void doubleCapacity()
  {
    Object[] arrayOfObject2 = this.mElements;
    int m = arrayOfObject2.length;
    int k = this.mHead;
    int j = m - k;
    int i = m << 1;
    if (i >= 0)
    {
      Object[] arrayOfObject1 = new Object[i];
      System.arraycopy(arrayOfObject2, k, arrayOfObject1, 0, j);
      System.arraycopy(this.mElements, 0, arrayOfObject1, j, this.mHead);
      this.mElements = ((Object[])arrayOfObject1);
      this.mHead = 0;
      this.mTail = m;
      this.mCapacityBitmask = (i - 1);
      return;
    }
    throw new RuntimeException("Max array capacity exceeded");
  }
  
  public void addFirst(E paramE)
  {
    int i = this.mHead - 1 & this.mCapacityBitmask;
    this.mHead = i;
    this.mElements[i] = paramE;
    if (i == this.mTail) {
      doubleCapacity();
    }
  }
  
  public void addLast(E paramE)
  {
    Object[] arrayOfObject = this.mElements;
    int i = this.mTail;
    arrayOfObject[i] = paramE;
    i = this.mCapacityBitmask & i + 1;
    this.mTail = i;
    if (i == this.mHead) {
      doubleCapacity();
    }
  }
  
  public void clear()
  {
    removeFromStart(size());
  }
  
  public E get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size()))
    {
      Object[] arrayOfObject = this.mElements;
      int i = this.mHead;
      return (E)arrayOfObject[(this.mCapacityBitmask & i + paramInt)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E getFirst()
  {
    int i = this.mHead;
    if (i != this.mTail) {
      return (E)this.mElements[i];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E getLast()
  {
    int j = this.mHead;
    int i = this.mTail;
    if (j != i) {
      return (E)this.mElements[(i - 1 & this.mCapacityBitmask)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this.mHead == this.mTail) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public E popFirst()
  {
    int i = this.mHead;
    if (i != this.mTail)
    {
      Object[] arrayOfObject = this.mElements;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      this.mHead = (i + 1 & this.mCapacityBitmask);
      return (E)localObject;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E popLast()
  {
    int j = this.mHead;
    int i = this.mTail;
    if (j != i)
    {
      i = this.mCapacityBitmask & i - 1;
      Object[] arrayOfObject = this.mElements;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      this.mTail = i;
      return (E)localObject;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void removeFromEnd(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int i = 0;
      int j = this.mTail;
      if (paramInt < j) {
        i = j - paramInt;
      }
      int k;
      for (j = i;; j++)
      {
        k = this.mTail;
        if (j >= k) {
          break;
        }
        this.mElements[j] = null;
      }
      i = k - i;
      paramInt -= i;
      this.mTail = (k - i);
      if (paramInt > 0)
      {
        i = this.mElements.length;
        this.mTail = i;
        i -= paramInt;
        for (paramInt = i; paramInt < this.mTail; paramInt++) {
          this.mElements[paramInt] = null;
        }
        this.mTail = i;
      }
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void removeFromStart(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int m = this.mElements.length;
      int k = this.mHead;
      int i = m;
      int j = k;
      if (paramInt < m - k) {
        i = k + paramInt;
      }
      for (j = k; j < i; j++) {
        this.mElements[j] = null;
      }
      j = this.mHead;
      k = i - j;
      i = paramInt - k;
      this.mHead = (this.mCapacityBitmask & j + k);
      if (i > 0)
      {
        for (paramInt = 0; paramInt < i; paramInt++) {
          this.mElements[paramInt] = null;
        }
        this.mHead = i;
      }
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public int size()
  {
    return this.mTail - this.mHead & this.mCapacityBitmask;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\collection\CircularArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */