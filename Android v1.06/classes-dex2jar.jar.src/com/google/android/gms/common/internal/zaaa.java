package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.R.color;
import com.google.android.gms.base.R.drawable;
import com.google.android.gms.base.R.string;
import com.google.android.gms.common.util.DeviceProperties;

public final class zaaa
  extends Button
{
  public zaaa(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null, 16842824);
  }
  
  private static final int zab(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 == 2) {
          return paramInt4;
        }
        StringBuilder localStringBuilder = new StringBuilder(33);
        localStringBuilder.append("Unknown color scheme: ");
        localStringBuilder.append(paramInt1);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      return paramInt3;
    }
    return paramInt2;
  }
  
  public final void zaa(Resources paramResources, int paramInt1, int paramInt2)
  {
    setTypeface(Typeface.DEFAULT_BOLD);
    setTextSize(14.0F);
    int i = (int)(paramResources.getDisplayMetrics().density * 48.0F + 0.5F);
    setMinHeight(i);
    setMinWidth(i);
    int j = zab(paramInt2, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
    i = zab(paramInt2, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      if (paramInt1 == 2)
      {
        i = j;
      }
      else
      {
        paramResources = new StringBuilder(32);
        paramResources.append("Unknown button size: ");
        paramResources.append(paramInt1);
        throw new IllegalStateException(paramResources.toString());
      }
    }
    Drawable localDrawable = DrawableCompat.wrap(paramResources.getDrawable(i));
    DrawableCompat.setTintList(localDrawable, paramResources.getColorStateList(R.color.common_google_signin_btn_tint));
    DrawableCompat.setTintMode(localDrawable, PorterDuff.Mode.SRC_ATOP);
    setBackgroundDrawable(localDrawable);
    setTextColor((ColorStateList)Preconditions.checkNotNull(paramResources.getColorStateList(zab(paramInt2, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light))));
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 == 2)
        {
          setText(null);
        }
        else
        {
          paramResources = new StringBuilder(32);
          paramResources.append("Unknown button size: ");
          paramResources.append(paramInt1);
          throw new IllegalStateException(paramResources.toString());
        }
      }
      else {
        setText(paramResources.getString(R.string.common_signin_button_text_long));
      }
    }
    else {
      setText(paramResources.getString(R.string.common_signin_button_text));
    }
    setTransformationMethod(null);
    if (DeviceProperties.isWearable(getContext())) {
      setGravity(19);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zaaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */