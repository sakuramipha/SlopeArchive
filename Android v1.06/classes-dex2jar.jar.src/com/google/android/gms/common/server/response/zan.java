package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zan
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zan> CREATOR = new zao();
  final int zaa;
  private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zab;
  private final String zac;
  
  zan(int paramInt, ArrayList<zal> paramArrayList, String paramString)
  {
    this.zaa = paramInt;
    HashMap localHashMap1 = new HashMap();
    int j = paramArrayList.size();
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      zal localzal = (zal)paramArrayList.get(paramInt);
      String str = localzal.zab;
      HashMap localHashMap2 = new HashMap();
      int k = ((ArrayList)Preconditions.checkNotNull(localzal.zac)).size();
      for (int i = 0; i < k; i++)
      {
        zam localzam = (zam)localzal.zac.get(i);
        localHashMap2.put(localzam.zab, localzam.zac);
      }
      localHashMap1.put(str, localHashMap2);
    }
    this.zab = localHashMap1;
    this.zac = ((String)Preconditions.checkNotNull(paramString));
    zad();
  }
  
  public zan(Class<? extends FastJsonResponse> paramClass)
  {
    this.zaa = 1;
    this.zab = new HashMap();
    this.zac = ((String)Preconditions.checkNotNull(paramClass.getCanonicalName()));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.zab.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      localStringBuilder.append(str);
      localStringBuilder.append(":\n");
      Map localMap = (Map)this.zab.get(str);
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        str = (String)localIterator2.next();
        localStringBuilder.append("  ");
        localStringBuilder.append(str);
        localStringBuilder.append(": ");
        localStringBuilder.append(localMap.get(str));
      }
    }
    return localStringBuilder.toString();
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
      localArrayList.add(new zal(str, (Map)this.zab.get(str)));
    }
    SafeParcelWriter.writeTypedList(paramParcel, 2, localArrayList, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zac, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final String zaa()
  {
    return this.zac;
  }
  
  public final Map<String, FastJsonResponse.Field<?, ?>> zab(String paramString)
  {
    return (Map)this.zab.get(paramString);
  }
  
  public final void zac()
  {
    Iterator localIterator1 = this.zab.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str2 = (String)localIterator1.next();
      Map localMap = (Map)this.zab.get(str2);
      HashMap localHashMap = new HashMap();
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str1 = (String)localIterator2.next();
        localHashMap.put(str1, ((FastJsonResponse.Field)localMap.get(str1)).zab());
      }
      this.zab.put(str2, localHashMap);
    }
  }
  
  public final void zad()
  {
    Iterator localIterator1 = this.zab.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localObject = (Map)this.zab.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext()) {
        ((FastJsonResponse.Field)((Map)localObject).get((String)localIterator2.next())).zai(this);
      }
    }
  }
  
  public final void zae(Class<? extends FastJsonResponse> paramClass, Map<String, FastJsonResponse.Field<?, ?>> paramMap)
  {
    this.zab.put((String)Preconditions.checkNotNull(paramClass.getCanonicalName()), paramMap);
  }
  
  public final boolean zaf(Class<? extends FastJsonResponse> paramClass)
  {
    return this.zab.containsKey(Preconditions.checkNotNull(paramClass.getCanonicalName()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\zan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */