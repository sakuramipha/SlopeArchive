package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter<T>
  extends BaseAdapter
{
  private static final GmsLogger zzbz = new GmsLogger("DataBufferAdapter", "");
  private final int fieldId;
  private final int resource;
  private final Context zzgw;
  private int zzmz;
  private final List<DataBuffer<T>> zzna;
  private final LayoutInflater zznb;
  private boolean zznc = true;
  
  public DataBufferAdapter(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0, new ArrayList());
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, new ArrayList());
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, List<DataBuffer<T>> paramList)
  {
    this.zzgw = paramContext;
    this.zzmz = paramInt1;
    this.resource = paramInt1;
    this.fieldId = paramInt2;
    this.zzna = paramList;
    this.zznb = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, DataBuffer<T>... paramVarArgs)
  {
    this(paramContext, paramInt1, paramInt2, Arrays.asList(paramVarArgs));
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, List<DataBuffer<T>> paramList)
  {
    this(paramContext, paramInt, 0, paramList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, DataBuffer<T>... paramVarArgs)
  {
    this(paramContext, paramInt, 0, Arrays.asList(paramVarArgs));
  }
  
  private final View zza(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = this.zznb.inflate(paramInt2, paramViewGroup, false);
    }
    try
    {
      paramInt2 = this.fieldId;
      if (paramInt2 == 0) {
        paramView = (TextView)localView;
      } else {
        paramView = (TextView)localView.findViewById(paramInt2);
      }
      paramViewGroup = getItem(paramInt1);
      if ((paramViewGroup instanceof CharSequence)) {
        paramView.setText((CharSequence)paramViewGroup);
      } else {
        paramView.setText(paramViewGroup.toString());
      }
      return localView;
    }
    catch (ClassCastException paramView)
    {
      zzbz.e("DataBufferAdapter", "You must supply a resource ID for a TextView", paramView);
      throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", paramView);
    }
  }
  
  public void append(DataBuffer<T> paramDataBuffer)
  {
    this.zzna.add(paramDataBuffer);
    if (this.zznc) {
      notifyDataSetChanged();
    }
  }
  
  public void clear()
  {
    Iterator localIterator = this.zzna.iterator();
    while (localIterator.hasNext()) {
      ((DataBuffer)localIterator.next()).release();
    }
    this.zzna.clear();
    if (this.zznc) {
      notifyDataSetChanged();
    }
  }
  
  public Context getContext()
  {
    return this.zzgw;
  }
  
  public int getCount()
  {
    Iterator localIterator = this.zzna.iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      i += ((DataBuffer)localIterator.next()).getCount();
    }
    return i;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return zza(paramInt, paramView, paramViewGroup, this.zzmz);
  }
  
  public T getItem(int paramInt)
    throws CursorIndexOutOfBoundsException
  {
    Iterator localIterator = this.zzna.iterator();
    int i = paramInt;
    while (localIterator.hasNext())
    {
      Object localObject = (DataBuffer)localIterator.next();
      int j = ((DataBuffer)localObject).getCount();
      if (j <= i) {
        i -= j;
      } else {
        try
        {
          localObject = ((DataBuffer)localObject).get(i);
          return (T)localObject;
        }
        catch (CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException)
        {
          throw new CursorIndexOutOfBoundsException(paramInt, getCount());
        }
      }
    }
    throw new CursorIndexOutOfBoundsException(paramInt, getCount());
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return zza(paramInt, paramView, paramViewGroup, this.resource);
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.zznc = true;
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    this.zzmz = paramInt;
  }
  
  public void setNotifyOnChange(boolean paramBoolean)
  {
    this.zznc = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\widget\DataBufferAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */