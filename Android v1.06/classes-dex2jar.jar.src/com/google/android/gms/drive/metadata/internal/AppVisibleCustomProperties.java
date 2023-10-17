package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties
  extends AbstractSafeParcelable
  implements ReflectedParcelable, Iterable<zzc>
{
  public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new zza();
  public static final AppVisibleCustomProperties zzjb = new zza().zzbb();
  private final List<zzc> zzjc;
  
  AppVisibleCustomProperties(Collection<zzc> paramCollection)
  {
    Preconditions.checkNotNull(paramCollection);
    this.zzjc = new ArrayList(paramCollection);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == getClass())) {
      return zzba().equals(((AppVisibleCustomProperties)paramObject).zzba());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzjc });
  }
  
  public final Iterator<zzc> iterator()
  {
    return this.zzjc.iterator();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzjc, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final Map<CustomPropertyKey, String> zzba()
  {
    HashMap localHashMap = new HashMap(this.zzjc.size());
    Iterator localIterator = this.zzjc.iterator();
    while (localIterator.hasNext())
    {
      zzc localzzc = (zzc)localIterator.next();
      localHashMap.put(localzzc.zzje, localzzc.value);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public static final class zza
  {
    private final Map<CustomPropertyKey, zzc> zzjd = new HashMap();
    
    public final zza zza(CustomPropertyKey paramCustomPropertyKey, String paramString)
    {
      Preconditions.checkNotNull(paramCustomPropertyKey, "key");
      this.zzjd.put(paramCustomPropertyKey, new zzc(paramCustomPropertyKey, paramString));
      return this;
    }
    
    public final zza zza(zzc paramzzc)
    {
      Preconditions.checkNotNull(paramzzc, "property");
      this.zzjd.put(paramzzc.zzje, paramzzc);
      return this;
    }
    
    public final AppVisibleCustomProperties zzbb()
    {
      return new AppVisibleCustomProperties(this.zzjd.values());
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\AppVisibleCustomProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */