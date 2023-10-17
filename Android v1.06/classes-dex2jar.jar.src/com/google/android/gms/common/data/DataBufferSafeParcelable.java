package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DataBufferSafeParcelable<T extends SafeParcelable>
  extends AbstractDataBuffer<T>
{
  private static final String[] zaa = { "data" };
  private final Parcelable.Creator<T> zab;
  
  public DataBufferSafeParcelable(DataHolder paramDataHolder, Parcelable.Creator<T> paramCreator)
  {
    super(paramDataHolder);
    this.zab = paramCreator;
  }
  
  public static <T extends SafeParcelable> void addValue(DataHolder.Builder paramBuilder, T paramT)
  {
    Parcel localParcel = Parcel.obtain();
    paramT.writeToParcel(localParcel, 0);
    paramT = new ContentValues();
    paramT.put("data", localParcel.marshall());
    paramBuilder.withRow(paramT);
    localParcel.recycle();
  }
  
  public static DataHolder.Builder buildDataHolder()
  {
    return DataHolder.builder(zaa);
  }
  
  public T get(int paramInt)
  {
    Object localObject1 = (DataHolder)Preconditions.checkNotNull(this.mDataHolder);
    Object localObject2 = ((DataHolder)localObject1).getByteArray("data", paramInt, ((DataHolder)localObject1).getWindowIndex(paramInt));
    localObject1 = Parcel.obtain();
    ((Parcel)localObject1).unmarshall((byte[])localObject2, 0, localObject2.length);
    ((Parcel)localObject1).setDataPosition(0);
    localObject2 = (SafeParcelable)this.zab.createFromParcel((Parcel)localObject1);
    ((Parcel)localObject1).recycle();
    return (T)localObject2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\data\DataBufferSafeParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */