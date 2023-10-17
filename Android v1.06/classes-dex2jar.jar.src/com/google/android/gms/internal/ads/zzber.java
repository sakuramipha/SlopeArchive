package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzber
  extends NativeAd.Image
{
  private final zzbeq zza;
  private final Drawable zzb;
  private final Uri zzc;
  private final double zzd;
  private final int zze;
  private final int zzf;
  
  public zzber(zzbeq paramzzbeq)
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
    int j = -1;
    int i;
    try
    {
      i = this.zza.zzd();
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
      i = -1;
    }
    this.zze = i;
    try
    {
      i = this.zza.zzc();
    }
    catch (RemoteException paramzzbeq)
    {
      zzbzt.zzh("", paramzzbeq);
      i = j;
    }
    this.zzf = i;
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
  
  public final int zza()
  {
    return this.zzf;
  }
  
  public final int zzb()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */