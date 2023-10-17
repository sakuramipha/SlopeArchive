package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.Preconditions;

public final class zzcbr
{
  private final Context zza;
  private final zzccc zzb;
  private final ViewGroup zzc;
  private zzcbq zzd;
  
  public zzcbr(Context paramContext, ViewGroup paramViewGroup, zzcfb paramzzcfb)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.zza = localContext;
    this.zzc = paramViewGroup;
    this.zzb = paramzzcfb;
    this.zzd = null;
  }
  
  public final zzcbq zza()
  {
    return this.zzd;
  }
  
  public final Integer zzb()
  {
    zzcbq localzzcbq = this.zzd;
    if (localzzcbq != null) {
      return localzzcbq.zzl();
    }
    return null;
  }
  
  public final void zzc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
    zzcbq localzzcbq = this.zzd;
    if (localzzcbq != null) {
      localzzcbq.zzF(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void zzd(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, zzccb paramzzccb)
  {
    if (this.zzd != null) {
      return;
    }
    zzbbu.zza(this.zzb.zzm().zza(), this.zzb.zzk(), new String[] { "vpr2" });
    Context localContext = this.zza;
    zzccc localzzccc = this.zzb;
    paramzzccb = new zzcbq(localContext, localzzccc, paramInt5, paramBoolean, localzzccc.zzm().zza(), paramzzccb);
    this.zzd = paramzzccb;
    this.zzc.addView(paramzzccb, 0, new ViewGroup.LayoutParams(-1, -1));
    this.zzd.zzF(paramInt1, paramInt2, paramInt3, paramInt4);
    this.zzb.zzz(false);
  }
  
  public final void zze()
  {
    Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
    zzcbq localzzcbq = this.zzd;
    if (localzzcbq != null)
    {
      localzzcbq.zzo();
      this.zzc.removeView(this.zzd);
      this.zzd = null;
    }
  }
  
  public final void zzf()
  {
    Preconditions.checkMainThread("onPause must be called from the UI thread.");
    zzcbq localzzcbq = this.zzd;
    if (localzzcbq != null) {
      localzzcbq.zzu();
    }
  }
  
  public final void zzg(int paramInt)
  {
    zzcbq localzzcbq = this.zzd;
    if (localzzcbq != null) {
      localzzcbq.zzC(paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */