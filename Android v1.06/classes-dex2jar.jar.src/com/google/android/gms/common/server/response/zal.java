package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zal
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zal> CREATOR = new zap();
  final int zaa;
  final String zab;
  final ArrayList<zam> zac;
  
  zal(int paramInt, String paramString, ArrayList<zam> paramArrayList)
  {
    this.zaa = paramInt;
    this.zab = paramString;
    this.zac = paramArrayList;
  }
  
  zal(String paramString, Map<String, FastJsonResponse.Field<?, ?>> paramMap)
  {
    this.zaa = 1;
    this.zab = paramString;
    if (paramMap == null)
    {
      paramString = null;
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramMap.keySet().iterator();
      for (;;)
      {
        paramString = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        paramString = (String)localIterator.next();
        localArrayList.add(new zam(paramString, (FastJsonResponse.Field)paramMap.get(paramString)));
      }
    }
    this.zac = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zaa);
    SafeParcelWriter.writeString(paramParcel, 2, this.zab, false);
    SafeParcelWriter.writeTypedList(paramParcel, 3, this.zac, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */