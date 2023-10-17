package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.zzb;
import com.google.android.gms.drive.events.zzo;
import com.google.android.gms.drive.events.zzr;
import com.google.android.gms.drive.events.zzv;

public final class zzfp
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();
  private final int zzda;
  private final ChangeEvent zzib;
  private final CompletionEvent zzic;
  private final zzo zzid;
  private final zzb zzie;
  private final zzv zzif;
  private final zzr zzig;
  
  zzfp(int paramInt, ChangeEvent paramChangeEvent, CompletionEvent paramCompletionEvent, zzo paramzzo, zzb paramzzb, zzv paramzzv, zzr paramzzr)
  {
    this.zzda = paramInt;
    this.zzib = paramChangeEvent;
    this.zzic = paramCompletionEvent;
    this.zzid = paramzzo;
    this.zzie = paramzzb;
    this.zzif = paramzzv;
    this.zzig = paramzzr;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzda);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzib, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 5, this.zzic, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzid, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 7, this.zzie, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 9, this.zzif, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 10, this.zzig, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final DriveEvent zzat()
  {
    int i = this.zzda;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 7)
            {
              if (i == 8) {
                return this.zzig;
              }
              i = this.zzda;
              StringBuilder localStringBuilder = new StringBuilder(33);
              localStringBuilder.append("Unexpected event type ");
              localStringBuilder.append(i);
              throw new IllegalStateException(localStringBuilder.toString());
            }
            return this.zzif;
          }
          return this.zzie;
        }
        return this.zzid;
      }
      return this.zzic;
    }
    return this.zzib;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */