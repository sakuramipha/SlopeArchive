package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.zzr;
import com.google.android.gms.drive.query.internal.zzt;
import com.google.android.gms.drive.query.internal.zzx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Query> CREATOR = new zzb();
  private final List<DriveSpace> zzby;
  private final zzr zzlm;
  private final String zzln;
  private final SortOrder zzlo;
  final List<String> zzlp;
  final boolean zzlq;
  final boolean zzlr;
  
  Query(zzr paramzzr, String paramString, SortOrder paramSortOrder, List<String> paramList, boolean paramBoolean1, List<DriveSpace> paramList1, boolean paramBoolean2)
  {
    this.zzlm = paramzzr;
    this.zzln = paramString;
    this.zzlo = paramSortOrder;
    this.zzlp = paramList;
    this.zzlq = paramBoolean1;
    this.zzby = paramList1;
    this.zzlr = paramBoolean2;
  }
  
  private Query(zzr paramzzr, String paramString, SortOrder paramSortOrder, List<String> paramList, boolean paramBoolean1, Set<DriveSpace> paramSet, boolean paramBoolean2)
  {
    this(paramzzr, paramString, paramSortOrder, paramList, paramBoolean1, new ArrayList(paramSet), paramBoolean2);
  }
  
  public Filter getFilter()
  {
    return this.zzlm;
  }
  
  @Deprecated
  public String getPageToken()
  {
    return this.zzln;
  }
  
  public SortOrder getSortOrder()
  {
    return this.zzlo;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] { this.zzlm, this.zzlo, this.zzln, this.zzby });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzlm, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzln, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzlo, paramInt, false);
    SafeParcelWriter.writeStringList(paramParcel, 5, this.zzlp, false);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zzlq);
    SafeParcelWriter.writeTypedList(paramParcel, 7, this.zzby, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzlr);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final Set<DriveSpace> zzbi()
  {
    if (this.zzby == null) {
      return new HashSet();
    }
    return new HashSet(this.zzby);
  }
  
  public static class Builder
  {
    private String zzln;
    private SortOrder zzlo;
    private List<String> zzlp;
    private boolean zzlq;
    private boolean zzlr;
    private final List<Filter> zzls;
    private Set<DriveSpace> zzlt;
    
    public Builder()
    {
      this.zzls = new ArrayList();
      this.zzlp = Collections.emptyList();
      this.zzlt = Collections.emptySet();
    }
    
    public Builder(Query paramQuery)
    {
      ArrayList localArrayList = new ArrayList();
      this.zzls = localArrayList;
      this.zzlp = Collections.emptyList();
      this.zzlt = Collections.emptySet();
      localArrayList.add(paramQuery.getFilter());
      this.zzln = paramQuery.getPageToken();
      this.zzlo = paramQuery.getSortOrder();
      this.zzlp = paramQuery.zzlp;
      this.zzlq = paramQuery.zzlq;
      paramQuery.zzbi();
      this.zzlt = paramQuery.zzbi();
      this.zzlr = paramQuery.zzlr;
    }
    
    public Builder addFilter(Filter paramFilter)
    {
      Preconditions.checkNotNull(paramFilter, "Filter may not be null.");
      if (!(paramFilter instanceof zzt)) {
        this.zzls.add(paramFilter);
      }
      return this;
    }
    
    public Query build()
    {
      return new Query(new zzr(zzx.zzmv, this.zzls), this.zzln, this.zzlo, this.zzlp, this.zzlq, this.zzlt, this.zzlr, null);
    }
    
    @Deprecated
    public Builder setPageToken(String paramString)
    {
      this.zzln = paramString;
      return this;
    }
    
    public Builder setSortOrder(SortOrder paramSortOrder)
    {
      this.zzlo = paramSortOrder;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\Query.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */