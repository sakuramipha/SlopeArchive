package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public abstract class EntityBuffer<T>
  extends AbstractDataBuffer<T>
{
  private boolean zaa = false;
  private ArrayList<Integer> zab;
  
  protected EntityBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private final void zab()
  {
    try
    {
      if (!this.zaa)
      {
        int j = ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getCount();
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.zab = ((ArrayList)localObject1);
        if (j > 0)
        {
          ((ArrayList)localObject1).add(Integer.valueOf(0));
          String str2 = getPrimaryDataMarkerColumn();
          int i = this.mDataHolder.getWindowIndex(0);
          Object localObject3 = this.mDataHolder.getString(str2, 0, i);
          i = 1;
          while (i < j)
          {
            int k = this.mDataHolder.getWindowIndex(i);
            String str1 = this.mDataHolder.getString(str2, i, k);
            if (str1 != null)
            {
              localObject1 = localObject3;
              if (!str1.equals(localObject3))
              {
                this.zab.add(Integer.valueOf(i));
                localObject1 = str1;
              }
              i++;
              localObject3 = localObject1;
            }
            else
            {
              localObject3 = new java/lang/NullPointerException;
              j = String.valueOf(str2).length();
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>(j + 78);
              ((StringBuilder)localObject1).append("Missing value for markerColumn: ");
              ((StringBuilder)localObject1).append(str2);
              ((StringBuilder)localObject1).append(", at row: ");
              ((StringBuilder)localObject1).append(i);
              ((StringBuilder)localObject1).append(", for window: ");
              ((StringBuilder)localObject1).append(k);
              ((NullPointerException)localObject3).<init>(((StringBuilder)localObject1).toString());
              throw ((Throwable)localObject3);
            }
          }
        }
        this.zaa = true;
      }
      return;
    }
    finally {}
  }
  
  public final T get(int paramInt)
  {
    zab();
    int m = zaa(paramInt);
    int k = 0;
    int i = k;
    if (paramInt >= 0) {
      if (paramInt == this.zab.size())
      {
        i = k;
      }
      else
      {
        int j;
        if (paramInt == this.zab.size() - 1)
        {
          i = ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getCount();
          j = ((Integer)this.zab.get(paramInt)).intValue();
        }
        else
        {
          i = ((Integer)this.zab.get(paramInt + 1)).intValue();
          j = ((Integer)this.zab.get(paramInt)).intValue();
        }
        i -= j;
        if (i == 1)
        {
          i = zaa(paramInt);
          paramInt = ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(i);
          String str = getChildDataMarkerColumn();
          if ((str != null) && (this.mDataHolder.getString(str, i, paramInt) == null)) {
            i = k;
          } else {
            i = 1;
          }
        }
      }
    }
    return (T)getEntry(m, i);
  }
  
  protected String getChildDataMarkerColumn()
  {
    return null;
  }
  
  public int getCount()
  {
    zab();
    return this.zab.size();
  }
  
  protected abstract T getEntry(int paramInt1, int paramInt2);
  
  protected abstract String getPrimaryDataMarkerColumn();
  
  final int zaa(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.zab.size())) {
      return ((Integer)this.zab.get(paramInt)).intValue();
    }
    StringBuilder localStringBuilder = new StringBuilder(53);
    localStringBuilder.append("Position ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is out of bounds for this buffer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\EntityBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */