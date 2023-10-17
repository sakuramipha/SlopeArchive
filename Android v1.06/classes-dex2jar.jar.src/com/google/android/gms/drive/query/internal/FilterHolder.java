package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<FilterHolder> CREATOR = new zzh();
  private final Filter zzbc;
  private final zzb<?> zzmd;
  private final zzd zzme;
  private final zzr zzmf;
  private final zzv zzmg;
  private final zzp<?> zzmh;
  private final zzt zzmi;
  private final zzn zzmj;
  private final zzl zzmk;
  private final zzz zzml;
  
  public FilterHolder(Filter paramFilter)
  {
    Preconditions.checkNotNull(paramFilter, "Null filter.");
    boolean bool = paramFilter instanceof zzb;
    zzz localzzz = null;
    zzb localzzb;
    if (bool) {
      localzzb = (zzb)paramFilter;
    } else {
      localzzb = null;
    }
    this.zzmd = localzzb;
    zzd localzzd;
    if ((paramFilter instanceof zzd)) {
      localzzd = (zzd)paramFilter;
    } else {
      localzzd = null;
    }
    this.zzme = localzzd;
    zzr localzzr;
    if ((paramFilter instanceof zzr)) {
      localzzr = (zzr)paramFilter;
    } else {
      localzzr = null;
    }
    this.zzmf = localzzr;
    zzv localzzv;
    if ((paramFilter instanceof zzv)) {
      localzzv = (zzv)paramFilter;
    } else {
      localzzv = null;
    }
    this.zzmg = localzzv;
    zzp localzzp;
    if ((paramFilter instanceof zzp)) {
      localzzp = (zzp)paramFilter;
    } else {
      localzzp = null;
    }
    this.zzmh = localzzp;
    zzt localzzt;
    if ((paramFilter instanceof zzt)) {
      localzzt = (zzt)paramFilter;
    } else {
      localzzt = null;
    }
    this.zzmi = localzzt;
    zzn localzzn;
    if ((paramFilter instanceof zzn)) {
      localzzn = (zzn)paramFilter;
    } else {
      localzzn = null;
    }
    this.zzmj = localzzn;
    zzl localzzl;
    if ((paramFilter instanceof zzl)) {
      localzzl = (zzl)paramFilter;
    } else {
      localzzl = null;
    }
    this.zzmk = localzzl;
    if ((paramFilter instanceof zzz)) {
      localzzz = (zzz)paramFilter;
    }
    this.zzml = localzzz;
    if ((localzzb == null) && (localzzd == null) && (localzzr == null) && (localzzv == null) && (localzzp == null) && (localzzt == null) && (localzzn == null) && (localzzl == null) && (localzzz == null)) {
      throw new IllegalArgumentException("Invalid filter type.");
    }
    this.zzbc = paramFilter;
  }
  
  FilterHolder(zzb<?> paramzzb, zzd paramzzd, zzr paramzzr, zzv paramzzv, zzp<?> paramzzp, zzt paramzzt, zzn<?> paramzzn, zzl paramzzl, zzz paramzzz)
  {
    this.zzmd = paramzzb;
    this.zzme = paramzzd;
    this.zzmf = paramzzr;
    this.zzmg = paramzzv;
    this.zzmh = paramzzp;
    this.zzmi = paramzzt;
    this.zzmj = paramzzn;
    this.zzmk = paramzzl;
    this.zzml = paramzzz;
    if (paramzzb != null)
    {
      this.zzbc = paramzzb;
      return;
    }
    if (paramzzd != null)
    {
      this.zzbc = paramzzd;
      return;
    }
    if (paramzzr != null)
    {
      this.zzbc = paramzzr;
      return;
    }
    if (paramzzv != null)
    {
      this.zzbc = paramzzv;
      return;
    }
    if (paramzzp != null)
    {
      this.zzbc = paramzzp;
      return;
    }
    if (paramzzt != null)
    {
      this.zzbc = paramzzt;
      return;
    }
    if (paramzzn != null)
    {
      this.zzbc = paramzzn;
      return;
    }
    if (paramzzl != null)
    {
      this.zzbc = paramzzl;
      return;
    }
    if (paramzzz != null)
    {
      this.zzbc = paramzzz;
      return;
    }
    throw new IllegalArgumentException("At least one filter must be set.");
  }
  
  public final Filter getFilter()
  {
    return this.zzbc;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zzmd, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzme, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzmf, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzmg, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzmh, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzmi, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 7, this.zzmj, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 8, this.zzmk, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 9, this.zzml, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\FilterHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */