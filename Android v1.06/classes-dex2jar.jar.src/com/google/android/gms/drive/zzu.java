package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class zzu
  extends AbstractSafeParcelable
{
  private volatile transient boolean zzbt = false;
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Preconditions.checkState(this.zzbt ^ true);
    this.zzbt = true;
    zza(paramParcel, paramInt);
  }
  
  protected abstract void zza(Parcel paramParcel, int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */