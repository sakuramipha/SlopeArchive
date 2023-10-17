package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbrc
  extends NativeAd.Image
{
  private final zzbeq zza;
  private final Drawable zzb;
  private final Uri zzc;
  private final double zzd;
  
  public zzbrc(zzbeq paramzzbeq)
  {
    this.zza = paramzzbeq;
    Object localObject = null;
    try
    {
      paramzzbeq = paramzzbeq.zzf();
      if (paramzzbeq != null) {
        paramzzbeq = (Drawable)ObjectWrapper.unwrap(paramzzbeq);
      }
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
      paramzzbeq = null;
    }
    this.zzb = paramzzbeq;
    try
    {
      paramzzbeq = this.zza.zze();
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
      paramzzbeq = (zzbeq)localObject;
    }
    this.zzc = paramzzbeq;
    double d;
    try
    {
      d = this.zza.zzb();
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
      d = 1.0D;
    }
    this.zzd = d;
    try
    {
      this.zza.zzd();
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
    }
    try
    {
      this.zza.zzc();
      return;
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
    }
  }
  
  public final Drawable getDrawable()
  {
    return this.zzb;
  }
  
  public final double getScale()
  {
    return this.zzd;
  }
  
  public final Uri getUri()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */