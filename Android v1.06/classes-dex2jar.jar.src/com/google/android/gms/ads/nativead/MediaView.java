package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbzt;

public class MediaView
  extends FrameLayout
{
  private MediaContent zza;
  private boolean zzb;
  private ImageView.ScaleType zzc;
  private boolean zzd;
  private zzb zze;
  private zzc zzf;
  
  public MediaView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public MediaContent getMediaContent()
  {
    return this.zza;
  }
  
  public void setImageScaleType(ImageView.ScaleType paramScaleType)
  {
    this.zzd = true;
    this.zzc = paramScaleType;
    zzc localzzc = this.zzf;
    if (localzzc != null) {
      localzzc.zza.zzc(paramScaleType);
    }
  }
  
  public void setMediaContent(MediaContent paramMediaContent)
  {
    this.zzb = true;
    this.zza = paramMediaContent;
    Object localObject = this.zze;
    if (localObject != null) {
      ((zzb)localObject).zza.zzb(paramMediaContent);
    }
    if (paramMediaContent == null) {
      return;
    }
    try
    {
      localObject = paramMediaContent.zza();
      if (localObject != null)
      {
        boolean bool;
        if (paramMediaContent.hasVideoContent())
        {
          bool = ((zzbfk)localObject).zzs(ObjectWrapper.wrap(this));
        }
        else
        {
          if (!paramMediaContent.zzb()) {
            break label90;
          }
          bool = ((zzbfk)localObject).zzr(ObjectWrapper.wrap(this));
        }
        if (!bool) {
          label90:
          removeAllViews();
        }
      }
      return;
    }
    catch (RemoteException paramMediaContent)
    {
      removeAllViews();
      zzbzt.zzh("", paramMediaContent);
    }
  }
  
  protected final void zza(zzb paramzzb)
  {
    try
    {
      this.zze = paramzzb;
      if (this.zzb)
      {
        MediaContent localMediaContent = this.zza;
        paramzzb.zza.zzb(localMediaContent);
        return;
      }
      return;
    }
    finally
    {
      paramzzb = finally;
      throw paramzzb;
    }
  }
  
  protected final void zzb(zzc paramzzc)
  {
    try
    {
      this.zzf = paramzzc;
      if (this.zzd)
      {
        ImageView.ScaleType localScaleType = this.zzc;
        paramzzc.zza.zzc(localScaleType);
        return;
      }
      return;
    }
    finally
    {
      paramzzc = finally;
      throw paramzzc;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nativead\MediaView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */