package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;

public final class AdView
  extends BaseAdView
{
  public AdView(Context paramContext)
  {
    super(paramContext, 0);
    Preconditions.checkNotNull(paramContext, "Context cannot be null");
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public final VideoController zza()
  {
    return this.zza.zzf();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */