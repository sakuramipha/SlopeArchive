package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortOrder
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SortOrder> CREATOR = new zzc();
  private final List<zzf> zzlw;
  private final boolean zzlx;
  
  SortOrder(List<zzf> paramList, boolean paramBoolean)
  {
    this.zzlw = paramList;
    this.zzlx = paramBoolean;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "SortOrder[%s, %s]", new Object[] { TextUtils.join(",", this.zzlw), Boolean.valueOf(this.zzlx) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeTypedList(paramParcel, 1, this.zzlw, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, this.zzlx);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public static class Builder
  {
    private final List<zzf> zzlw = new ArrayList();
    private boolean zzlx = false;
    
    public Builder addSortAscending(SortableMetadataField paramSortableMetadataField)
    {
      this.zzlw.add(new zzf(paramSortableMetadataField.getName(), true));
      return this;
    }
    
    public Builder addSortDescending(SortableMetadataField paramSortableMetadataField)
    {
      this.zzlw.add(new zzf(paramSortableMetadataField.getName(), false));
      return this;
    }
    
    public SortOrder build()
    {
      return new SortOrder(this.zzlw, false);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\SortOrder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */