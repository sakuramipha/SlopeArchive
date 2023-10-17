package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzdxs
  extends zzbty
{
  final zzdxt zza;
  
  protected zzdxs(zzdxt paramzzdxt) {}
  
  public final void zze(zzaz paramzzaz)
  {
    this.zza.zza.zze(paramzzaz.zza());
  }
  
  public final void zzf(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdxs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */