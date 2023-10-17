package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

public final class zzs
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzs> CREATOR = new zzt();
  private final String zza;
  @Nullable
  private final zzi zzb;
  private final boolean zzc;
  private final boolean zzd;
  
  zzs(String paramString, @Nullable IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramString;
    Object localObject = null;
    if (paramIBinder == null) {
      paramString = (String)localObject;
    } else {
      try
      {
        paramString = zzy.zzg(paramIBinder).zzd();
        if (paramString == null) {
          paramString = null;
        } else {
          paramString = (byte[])ObjectWrapper.unwrap(paramString);
        }
        if (paramString != null)
        {
          paramString = new zzj(paramString);
        }
        else
        {
          Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
          paramString = (String)localObject;
        }
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", paramString);
        paramString = (String)localObject;
      }
    }
    this.zzb = paramString;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
  }
  
  zzs(String paramString, @Nullable zzi paramzzi, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramString;
    this.zzb = paramzzi;
    this.zzc = paramBoolean1;
    this.zzd = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zza, false);
    zzi localzzi2 = this.zzb;
    zzi localzzi1 = localzzi2;
    if (localzzi2 == null)
    {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      localzzi1 = null;
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, localzzi1, false);
    SafeParcelWriter.writeBoolean(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */