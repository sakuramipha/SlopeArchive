package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public abstract class DataBufferRef
{
  protected final DataHolder mDataHolder;
  protected int mDataRow;
  private int zaa;
  
  public DataBufferRef(DataHolder paramDataHolder, int paramInt)
  {
    this.mDataHolder = ((DataHolder)Preconditions.checkNotNull(paramDataHolder));
    zaa(paramInt);
  }
  
  protected void copyToBuffer(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.mDataHolder.zac(paramString, this.mDataRow, this.zaa, paramCharArrayBuffer);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof DataBufferRef))
    {
      paramObject = (DataBufferRef)paramObject;
      if ((Objects.equal(Integer.valueOf(((DataBufferRef)paramObject).mDataRow), Integer.valueOf(this.mDataRow))) && (Objects.equal(Integer.valueOf(((DataBufferRef)paramObject).zaa), Integer.valueOf(this.zaa))) && (((DataBufferRef)paramObject).mDataHolder == this.mDataHolder)) {
        return true;
      }
    }
    return false;
  }
  
  protected boolean getBoolean(String paramString)
  {
    return this.mDataHolder.getBoolean(paramString, this.mDataRow, this.zaa);
  }
  
  protected byte[] getByteArray(String paramString)
  {
    return this.mDataHolder.getByteArray(paramString, this.mDataRow, this.zaa);
  }
  
  protected int getDataRow()
  {
    return this.mDataRow;
  }
  
  protected double getDouble(String paramString)
  {
    return this.mDataHolder.zaa(paramString, this.mDataRow, this.zaa);
  }
  
  protected float getFloat(String paramString)
  {
    return this.mDataHolder.zab(paramString, this.mDataRow, this.zaa);
  }
  
  protected int getInteger(String paramString)
  {
    return this.mDataHolder.getInteger(paramString, this.mDataRow, this.zaa);
  }
  
  protected long getLong(String paramString)
  {
    return this.mDataHolder.getLong(paramString, this.mDataRow, this.zaa);
  }
  
  protected String getString(String paramString)
  {
    return this.mDataHolder.getString(paramString, this.mDataRow, this.zaa);
  }
  
  public boolean hasColumn(String paramString)
  {
    return this.mDataHolder.hasColumn(paramString);
  }
  
  protected boolean hasNull(String paramString)
  {
    return this.mDataHolder.hasNull(paramString, this.mDataRow, this.zaa);
  }
  
  public int hashCode()
  {
    return Objects.hashCode(new Object[] { Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder });
  }
  
  public boolean isDataValid()
  {
    return !this.mDataHolder.isClosed();
  }
  
  protected Uri parseUri(String paramString)
  {
    paramString = this.mDataHolder.getString(paramString, this.mDataRow, this.zaa);
    if (paramString == null) {
      return null;
    }
    return Uri.parse(paramString);
  }
  
  protected final void zaa(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      if (paramInt < this.mDataHolder.getCount()) {
        bool1 = true;
      }
    }
    Preconditions.checkState(bool1);
    this.mDataRow = paramInt;
    this.zaa = this.mDataHolder.getWindowIndex(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\DataBufferRef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */