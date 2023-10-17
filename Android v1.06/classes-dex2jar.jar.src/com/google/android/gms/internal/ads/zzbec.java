package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbec
  extends zzbep
{
  private final Drawable zza;
  private final Uri zzb;
  private final double zzc;
  private final int zzd;
  private final int zze;
  
  public zzbec(Drawable paramDrawable, Uri paramUri, double paramDouble, int paramInt1, int paramInt2)
  {
    this.zza = paramDrawable;
    this.zzb = paramUri;
    this.zzc = paramDouble;
    this.zzd = paramInt1;
    this.zze = paramInt2;
  }
  
  public final double zzb()
  {
    return this.zzc;
  }
  
  public final int zzc()
  {
    return this.zze;
  }
  
  public final int zzd()
  {
    return this.zzd;
  }
  
  public final Uri zze()
    throws RemoteException
  {
    return this.zzb;
  }
  
  public final IObjectWrapper zzf()
    throws RemoteException
  {
    return ObjectWrapper.wrap(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */