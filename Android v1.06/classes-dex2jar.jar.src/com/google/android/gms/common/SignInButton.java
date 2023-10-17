package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.base.R.styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_AUTO = 2;
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private int zaa;
  private int zab;
  private View zac;
  private View.OnClickListener zad = null;
  
  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.SignInButton, 0, 0);
    try
    {
      this.zaa = paramAttributeSet.getInt(R.styleable.SignInButton_buttonSize, 0);
      this.zab = paramAttributeSet.getInt(R.styleable.SignInButton_colorScheme, 2);
      paramAttributeSet.recycle();
      setStyle(this.zaa, this.zab);
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  private final void zaa(Context paramContext)
  {
    View localView = this.zac;
    if (localView != null) {
      removeView(localView);
    }
    try
    {
      this.zac = zaz.zaa(paramContext, this.zaa, this.zab);
    }
    catch (RemoteCreator.RemoteCreatorException localRemoteCreatorException)
    {
      Log.w("SignInButton", "Sign in button not found, using placeholder instead");
      int j = this.zaa;
      int i = this.zab;
      zaaa localzaaa = new zaaa(paramContext, null);
      localzaaa.zaa(paramContext.getResources(), j, i);
      this.zac = localzaaa;
    }
    addView(this.zac);
    this.zac.setEnabled(isEnabled());
    this.zac.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    View.OnClickListener localOnClickListener = this.zad;
    if ((localOnClickListener != null) && (paramView == this.zac)) {
      localOnClickListener.onClick(this);
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    setStyle(this.zaa, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.zac.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.zad = paramOnClickListener;
    paramOnClickListener = this.zac;
    if (paramOnClickListener != null) {
      paramOnClickListener.setOnClickListener(this);
    }
  }
  
  @Deprecated
  public void setScopes(Scope[] paramArrayOfScope)
  {
    setStyle(this.zaa, this.zab);
  }
  
  public void setSize(int paramInt)
  {
    setStyle(paramInt, this.zab);
  }
  
  public void setStyle(int paramInt1, int paramInt2)
  {
    this.zaa = paramInt1;
    this.zab = paramInt2;
    zaa(getContext());
  }
  
  @Deprecated
  public void setStyle(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    setStyle(paramInt1, paramInt2);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ButtonSize {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ColorScheme {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\SignInButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */