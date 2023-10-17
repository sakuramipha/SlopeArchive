package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzbfk;

public abstract interface MediaContent
{
  public abstract float getAspectRatio();
  
  public abstract float getCurrentTime();
  
  public abstract float getDuration();
  
  public abstract Drawable getMainImage();
  
  public abstract VideoController getVideoController();
  
  public abstract boolean hasVideoContent();
  
  public abstract void setMainImage(Drawable paramDrawable);
  
  public abstract zzbfk zza();
  
  public abstract boolean zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\MediaContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */