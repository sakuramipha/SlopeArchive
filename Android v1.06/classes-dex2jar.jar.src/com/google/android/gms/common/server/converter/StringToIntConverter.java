package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class StringToIntConverter
  extends AbstractSafeParcelable
  implements FastJsonResponse.FieldConverter<String, Integer>
{
  public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
  final int zaa;
  private final HashMap<String, Integer> zab;
  private final SparseArray<String> zac;
  
  public StringToIntConverter()
  {
    this.zaa = 1;
    this.zab = new HashMap();
    this.zac = new SparseArray();
  }
  
  StringToIntConverter(int paramInt, ArrayList<zac> paramArrayList)
  {
    this.zaa = paramInt;
    this.zab = new HashMap();
    this.zac = new SparseArray();
    int i = paramArrayList.size();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      zac localzac = (zac)paramArrayList.get(paramInt);
      add(localzac.zab, localzac.zac);
    }
  }
  
  public StringToIntConverter add(String paramString, int paramInt)
  {
    this.zab.put(paramString, Integer.valueOf(paramInt));
    this.zac.put(paramInt, paramString);
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zab.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new zac(str, ((Integer)this.zab.get(str)).intValue()));
    }
    SafeParcelWriter.writeTypedList(paramParcel, 2, localArrayList, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zaa()
  {
    return 7;
  }
  
  public final int zab()
  {
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\converter\StringToIntConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */