package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzr
  extends zza
{
  public static final Parcelable.Creator<zzr> CREATOR = new zzs();
  private List<Filter> zzls;
  private final zzx zzlz;
  private final List<FilterHolder> zzmo;
  
  public zzr(zzx paramzzx, Filter paramFilter, Filter... paramVarArgs)
  {
    this.zzlz = paramzzx;
    paramzzx = new ArrayList(paramVarArgs.length + 1);
    this.zzmo = paramzzx;
    paramzzx.add(new FilterHolder(paramFilter));
    paramzzx = new ArrayList(paramVarArgs.length + 1);
    this.zzls = paramzzx;
    paramzzx.add(paramFilter);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
    {
      paramzzx = paramVarArgs[i];
      this.zzmo.add(new FilterHolder(paramzzx));
      this.zzls.add(paramzzx);
    }
  }
  
  public zzr(zzx paramzzx, Iterable<Filter> paramIterable)
  {
    this.zzlz = paramzzx;
    this.zzls = new ArrayList();
    this.zzmo = new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      paramzzx = (Filter)paramIterable.next();
      this.zzls.add(paramzzx);
      this.zzmo.add(new FilterHolder(paramzzx));
    }
  }
  
  zzr(zzx paramzzx, List<FilterHolder> paramList)
  {
    this.zzlz = paramzzx;
    this.zzmo = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzlz, paramInt, false);
    SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzmo, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final <T> T zza(zzj<T> paramzzj)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.zzmo.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((FilterHolder)localIterator.next()).getFilter().zza(paramzzj));
    }
    return (T)paramzzj.zza(this.zzlz, localArrayList);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */