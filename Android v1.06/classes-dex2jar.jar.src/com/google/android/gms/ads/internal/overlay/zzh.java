package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.ads.zzcfb;

public final class zzh
{
  public final int zza;
  public final ViewGroup.LayoutParams zzb;
  public final ViewGroup zzc;
  public final Context zzd;
  
  public zzh(zzcfb paramzzcfb)
    throws zzf
  {
    this.zzb = paramzzcfb.getLayoutParams();
    Object localObject = paramzzcfb.getParent();
    this.zzd = paramzzcfb.zzE();
    if ((localObject != null) && ((localObject instanceof ViewGroup)))
    {
      localObject = (ViewGroup)localObject;
      this.zzc = ((ViewGroup)localObject);
      this.zza = ((ViewGroup)localObject).indexOfChild(paramzzcfb.zzF());
      ((ViewGroup)localObject).removeView(paramzzcfb.zzF());
      paramzzcfb.zzan(true);
      return;
    }
    throw new zzf("Could not get the parent of the WebView for an overlay.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */