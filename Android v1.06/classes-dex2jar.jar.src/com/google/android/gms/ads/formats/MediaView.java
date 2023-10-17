package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.MediaContent;

@Deprecated
public class MediaView
  extends FrameLayout
{
  private MediaContent zza;
  private ImageView.ScaleType zzb;
  
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
  
  public void setImageScaleType(ImageView.ScaleType paramScaleType)
  {
    this.zzb = paramScaleType;
  }
  
  public void setMediaContent(MediaContent paramMediaContent)
  {
    this.zza = paramMediaContent;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\formats\MediaView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */