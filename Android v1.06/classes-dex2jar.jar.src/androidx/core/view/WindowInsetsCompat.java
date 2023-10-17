package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets.Type;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class WindowInsetsCompat
{
  public static final WindowInsetsCompat CONSUMED;
  private static final String TAG = "WindowInsetsCompat";
  private final Impl mImpl;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 30) {
      CONSUMED = Impl30.CONSUMED;
    } else {
      CONSUMED = Impl.CONSUMED;
    }
  }
  
  private WindowInsetsCompat(WindowInsets paramWindowInsets)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      this.mImpl = new Impl30(this, paramWindowInsets);
    } else if (Build.VERSION.SDK_INT >= 29) {
      this.mImpl = new Impl29(this, paramWindowInsets);
    } else if (Build.VERSION.SDK_INT >= 28) {
      this.mImpl = new Impl28(this, paramWindowInsets);
    } else if (Build.VERSION.SDK_INT >= 21) {
      this.mImpl = new Impl21(this, paramWindowInsets);
    } else if (Build.VERSION.SDK_INT >= 20) {
      this.mImpl = new Impl20(this, paramWindowInsets);
    } else {
      this.mImpl = new Impl(this);
    }
  }
  
  public WindowInsetsCompat(WindowInsetsCompat paramWindowInsetsCompat)
  {
    if (paramWindowInsetsCompat != null)
    {
      paramWindowInsetsCompat = paramWindowInsetsCompat.mImpl;
      if ((Build.VERSION.SDK_INT >= 30) && ((paramWindowInsetsCompat instanceof Impl30))) {
        this.mImpl = new Impl30(this, (Impl30)paramWindowInsetsCompat);
      } else if ((Build.VERSION.SDK_INT >= 29) && ((paramWindowInsetsCompat instanceof Impl29))) {
        this.mImpl = new Impl29(this, (Impl29)paramWindowInsetsCompat);
      } else if ((Build.VERSION.SDK_INT >= 28) && ((paramWindowInsetsCompat instanceof Impl28))) {
        this.mImpl = new Impl28(this, (Impl28)paramWindowInsetsCompat);
      } else if ((Build.VERSION.SDK_INT >= 21) && ((paramWindowInsetsCompat instanceof Impl21))) {
        this.mImpl = new Impl21(this, (Impl21)paramWindowInsetsCompat);
      } else if ((Build.VERSION.SDK_INT >= 20) && ((paramWindowInsetsCompat instanceof Impl20))) {
        this.mImpl = new Impl20(this, (Impl20)paramWindowInsetsCompat);
      } else {
        this.mImpl = new Impl(this);
      }
      paramWindowInsetsCompat.copyWindowDataInto(this);
    }
    else
    {
      this.mImpl = new Impl(this);
    }
  }
  
  static Insets insetInsets(Insets paramInsets, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(0, paramInsets.left - paramInt1);
    int k = Math.max(0, paramInsets.top - paramInt2);
    int m = Math.max(0, paramInsets.right - paramInt3);
    int j = Math.max(0, paramInsets.bottom - paramInt4);
    if ((i == paramInt1) && (k == paramInt2) && (m == paramInt3) && (j == paramInt4)) {
      return paramInsets;
    }
    return Insets.of(i, k, m, j);
  }
  
  public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets paramWindowInsets)
  {
    return toWindowInsetsCompat(paramWindowInsets, null);
  }
  
  public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets paramWindowInsets, View paramView)
  {
    paramWindowInsets = new WindowInsetsCompat((WindowInsets)Preconditions.checkNotNull(paramWindowInsets));
    if ((paramView != null) && (paramView.isAttachedToWindow()))
    {
      paramWindowInsets.setRootWindowInsets(ViewCompat.getRootWindowInsets(paramView));
      paramWindowInsets.copyRootViewBounds(paramView.getRootView());
    }
    return paramWindowInsets;
  }
  
  @Deprecated
  public WindowInsetsCompat consumeDisplayCutout()
  {
    return this.mImpl.consumeDisplayCutout();
  }
  
  @Deprecated
  public WindowInsetsCompat consumeStableInsets()
  {
    return this.mImpl.consumeStableInsets();
  }
  
  @Deprecated
  public WindowInsetsCompat consumeSystemWindowInsets()
  {
    return this.mImpl.consumeSystemWindowInsets();
  }
  
  void copyRootViewBounds(View paramView)
  {
    this.mImpl.copyRootViewBounds(paramView);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof WindowInsetsCompat)) {
      return false;
    }
    paramObject = (WindowInsetsCompat)paramObject;
    return ObjectsCompat.equals(this.mImpl, ((WindowInsetsCompat)paramObject).mImpl);
  }
  
  public DisplayCutoutCompat getDisplayCutout()
  {
    return this.mImpl.getDisplayCutout();
  }
  
  public Insets getInsets(int paramInt)
  {
    return this.mImpl.getInsets(paramInt);
  }
  
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return this.mImpl.getInsetsIgnoringVisibility(paramInt);
  }
  
  @Deprecated
  public Insets getMandatorySystemGestureInsets()
  {
    return this.mImpl.getMandatorySystemGestureInsets();
  }
  
  @Deprecated
  public int getStableInsetBottom()
  {
    return this.mImpl.getStableInsets().bottom;
  }
  
  @Deprecated
  public int getStableInsetLeft()
  {
    return this.mImpl.getStableInsets().left;
  }
  
  @Deprecated
  public int getStableInsetRight()
  {
    return this.mImpl.getStableInsets().right;
  }
  
  @Deprecated
  public int getStableInsetTop()
  {
    return this.mImpl.getStableInsets().top;
  }
  
  @Deprecated
  public Insets getStableInsets()
  {
    return this.mImpl.getStableInsets();
  }
  
  @Deprecated
  public Insets getSystemGestureInsets()
  {
    return this.mImpl.getSystemGestureInsets();
  }
  
  @Deprecated
  public int getSystemWindowInsetBottom()
  {
    return this.mImpl.getSystemWindowInsets().bottom;
  }
  
  @Deprecated
  public int getSystemWindowInsetLeft()
  {
    return this.mImpl.getSystemWindowInsets().left;
  }
  
  @Deprecated
  public int getSystemWindowInsetRight()
  {
    return this.mImpl.getSystemWindowInsets().right;
  }
  
  @Deprecated
  public int getSystemWindowInsetTop()
  {
    return this.mImpl.getSystemWindowInsets().top;
  }
  
  @Deprecated
  public Insets getSystemWindowInsets()
  {
    return this.mImpl.getSystemWindowInsets();
  }
  
  @Deprecated
  public Insets getTappableElementInsets()
  {
    return this.mImpl.getTappableElementInsets();
  }
  
  public boolean hasInsets()
  {
    boolean bool;
    if ((getInsets(Type.all()).equals(Insets.NONE)) && (getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(Insets.NONE)) && (getDisplayCutout() == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Deprecated
  public boolean hasStableInsets()
  {
    return this.mImpl.getStableInsets().equals(Insets.NONE) ^ true;
  }
  
  @Deprecated
  public boolean hasSystemWindowInsets()
  {
    return this.mImpl.getSystemWindowInsets().equals(Insets.NONE) ^ true;
  }
  
  public int hashCode()
  {
    Impl localImpl = this.mImpl;
    int i;
    if (localImpl == null) {
      i = 0;
    } else {
      i = localImpl.hashCode();
    }
    return i;
  }
  
  public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.mImpl.inset(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public WindowInsetsCompat inset(Insets paramInsets)
  {
    return inset(paramInsets.left, paramInsets.top, paramInsets.right, paramInsets.bottom);
  }
  
  public boolean isConsumed()
  {
    return this.mImpl.isConsumed();
  }
  
  public boolean isRound()
  {
    return this.mImpl.isRound();
  }
  
  public boolean isVisible(int paramInt)
  {
    return this.mImpl.isVisible(paramInt);
  }
  
  @Deprecated
  public WindowInsetsCompat replaceSystemWindowInsets(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new Builder(this).setSystemWindowInsets(Insets.of(paramInt1, paramInt2, paramInt3, paramInt4)).build();
  }
  
  @Deprecated
  public WindowInsetsCompat replaceSystemWindowInsets(Rect paramRect)
  {
    return new Builder(this).setSystemWindowInsets(Insets.of(paramRect)).build();
  }
  
  void setOverriddenInsets(Insets[] paramArrayOfInsets)
  {
    this.mImpl.setOverriddenInsets(paramArrayOfInsets);
  }
  
  void setRootViewData(Insets paramInsets)
  {
    this.mImpl.setRootViewData(paramInsets);
  }
  
  void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat)
  {
    this.mImpl.setRootWindowInsets(paramWindowInsetsCompat);
  }
  
  void setStableInsets(Insets paramInsets)
  {
    this.mImpl.setStableInsets(paramInsets);
  }
  
  public WindowInsets toWindowInsets()
  {
    Object localObject = this.mImpl;
    if ((localObject instanceof Impl20)) {
      localObject = ((Impl20)localObject).mPlatformInsets;
    } else {
      localObject = null;
    }
    return (WindowInsets)localObject;
  }
  
  static class Api21ReflectionHolder
  {
    private static Field sContentInsets;
    private static boolean sReflectionSucceeded;
    private static Field sStableInsets;
    private static Field sViewAttachInfoField;
    
    static
    {
      try
      {
        Object localObject1 = View.class.getDeclaredField("mAttachInfo");
        sViewAttachInfoField = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
        localObject1 = Class.forName("android.view.View$AttachInfo");
        localObject2 = ((Class)localObject1).getDeclaredField("mStableInsets");
        sStableInsets = (Field)localObject2;
        ((Field)localObject2).setAccessible(true);
        localObject1 = ((Class)localObject1).getDeclaredField("mContentInsets");
        sContentInsets = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
        sReflectionSucceeded = true;
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Failed to get visible insets from AttachInfo ");
        ((StringBuilder)localObject2).append(localReflectiveOperationException.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject2).toString(), localReflectiveOperationException);
      }
    }
    
    public static WindowInsetsCompat getRootWindowInsets(View paramView)
    {
      if ((sReflectionSucceeded) && (paramView.isAttachedToWindow()))
      {
        Object localObject1 = paramView.getRootView();
        try
        {
          Object localObject2 = sViewAttachInfoField.get(localObject1);
          if (localObject2 != null)
          {
            localObject1 = (Rect)sStableInsets.get(localObject2);
            localObject2 = (Rect)sContentInsets.get(localObject2);
            if ((localObject1 != null) && (localObject2 != null))
            {
              WindowInsetsCompat.Builder localBuilder = new androidx/core/view/WindowInsetsCompat$Builder;
              localBuilder.<init>();
              localObject1 = localBuilder.setStableInsets(Insets.of((Rect)localObject1)).setSystemWindowInsets(Insets.of((Rect)localObject2)).build();
              ((WindowInsetsCompat)localObject1).setRootWindowInsets((WindowInsetsCompat)localObject1);
              ((WindowInsetsCompat)localObject1).copyRootViewBounds(paramView.getRootView());
              return (WindowInsetsCompat)localObject1;
            }
          }
        }
        catch (IllegalAccessException paramView)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Failed to get insets from AttachInfo. ");
          ((StringBuilder)localObject1).append(paramView.getMessage());
          Log.w("WindowInsetsCompat", ((StringBuilder)localObject1).toString(), paramView);
        }
      }
      return null;
    }
  }
  
  public static final class Builder
  {
    private final WindowInsetsCompat.BuilderImpl mImpl;
    
    public Builder()
    {
      if (Build.VERSION.SDK_INT >= 30) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl30();
      } else if (Build.VERSION.SDK_INT >= 29) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl29();
      } else if (Build.VERSION.SDK_INT >= 20) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl20();
      } else {
        this.mImpl = new WindowInsetsCompat.BuilderImpl();
      }
    }
    
    public Builder(WindowInsetsCompat paramWindowInsetsCompat)
    {
      if (Build.VERSION.SDK_INT >= 30) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl30(paramWindowInsetsCompat);
      } else if (Build.VERSION.SDK_INT >= 29) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl29(paramWindowInsetsCompat);
      } else if (Build.VERSION.SDK_INT >= 20) {
        this.mImpl = new WindowInsetsCompat.BuilderImpl20(paramWindowInsetsCompat);
      } else {
        this.mImpl = new WindowInsetsCompat.BuilderImpl(paramWindowInsetsCompat);
      }
    }
    
    public WindowInsetsCompat build()
    {
      return this.mImpl.build();
    }
    
    public Builder setDisplayCutout(DisplayCutoutCompat paramDisplayCutoutCompat)
    {
      this.mImpl.setDisplayCutout(paramDisplayCutoutCompat);
      return this;
    }
    
    public Builder setInsets(int paramInt, Insets paramInsets)
    {
      this.mImpl.setInsets(paramInt, paramInsets);
      return this;
    }
    
    public Builder setInsetsIgnoringVisibility(int paramInt, Insets paramInsets)
    {
      this.mImpl.setInsetsIgnoringVisibility(paramInt, paramInsets);
      return this;
    }
    
    @Deprecated
    public Builder setMandatorySystemGestureInsets(Insets paramInsets)
    {
      this.mImpl.setMandatorySystemGestureInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    public Builder setStableInsets(Insets paramInsets)
    {
      this.mImpl.setStableInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    public Builder setSystemGestureInsets(Insets paramInsets)
    {
      this.mImpl.setSystemGestureInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    public Builder setSystemWindowInsets(Insets paramInsets)
    {
      this.mImpl.setSystemWindowInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    public Builder setTappableElementInsets(Insets paramInsets)
    {
      this.mImpl.setTappableElementInsets(paramInsets);
      return this;
    }
    
    public Builder setVisible(int paramInt, boolean paramBoolean)
    {
      this.mImpl.setVisible(paramInt, paramBoolean);
      return this;
    }
  }
  
  private static class BuilderImpl
  {
    private final WindowInsetsCompat mInsets;
    Insets[] mInsetsTypeMask;
    
    BuilderImpl()
    {
      this(new WindowInsetsCompat(null));
    }
    
    BuilderImpl(WindowInsetsCompat paramWindowInsetsCompat)
    {
      this.mInsets = paramWindowInsetsCompat;
    }
    
    protected final void applyInsetTypes()
    {
      Object localObject1 = this.mInsetsTypeMask;
      if (localObject1 != null)
      {
        Object localObject3 = localObject1[WindowInsetsCompat.Type.indexOf(1)];
        Object localObject2 = this.mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(2)];
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = this.mInsets.getInsets(2);
        }
        localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = this.mInsets.getInsets(1);
        }
        setSystemWindowInsets(Insets.max((Insets)localObject2, (Insets)localObject1));
        localObject1 = this.mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(16)];
        if (localObject1 != null) {
          setSystemGestureInsets((Insets)localObject1);
        }
        localObject1 = this.mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(32)];
        if (localObject1 != null) {
          setMandatorySystemGestureInsets((Insets)localObject1);
        }
        localObject1 = this.mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(64)];
        if (localObject1 != null) {
          setTappableElementInsets((Insets)localObject1);
        }
      }
    }
    
    WindowInsetsCompat build()
    {
      applyInsetTypes();
      return this.mInsets;
    }
    
    void setDisplayCutout(DisplayCutoutCompat paramDisplayCutoutCompat) {}
    
    void setInsets(int paramInt, Insets paramInsets)
    {
      if (this.mInsetsTypeMask == null) {
        this.mInsetsTypeMask = new Insets[9];
      }
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          this.mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(i)] = paramInsets;
        }
        i <<= 1;
      }
    }
    
    void setInsetsIgnoringVisibility(int paramInt, Insets paramInsets)
    {
      if (paramInt != 8) {
        return;
      }
      throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
    }
    
    void setMandatorySystemGestureInsets(Insets paramInsets) {}
    
    void setStableInsets(Insets paramInsets) {}
    
    void setSystemGestureInsets(Insets paramInsets) {}
    
    void setSystemWindowInsets(Insets paramInsets) {}
    
    void setTappableElementInsets(Insets paramInsets) {}
    
    void setVisible(int paramInt, boolean paramBoolean) {}
  }
  
  private static class BuilderImpl20
    extends WindowInsetsCompat.BuilderImpl
  {
    private static Constructor<WindowInsets> sConstructor;
    private static boolean sConstructorFetched = false;
    private static Field sConsumedField;
    private static boolean sConsumedFieldFetched = false;
    private WindowInsets mPlatformInsets;
    private Insets mStableInsets;
    
    BuilderImpl20()
    {
      this.mPlatformInsets = createWindowInsetsInstance();
    }
    
    BuilderImpl20(WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
      this.mPlatformInsets = paramWindowInsetsCompat.toWindowInsets();
    }
    
    private static WindowInsets createWindowInsetsInstance()
    {
      if (!sConsumedFieldFetched)
      {
        try
        {
          sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
        }
        catch (ReflectiveOperationException localReflectiveOperationException1)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
        }
        sConsumedFieldFetched = true;
      }
      Object localObject1 = sConsumedField;
      if (localObject1 != null) {
        try
        {
          localObject1 = (WindowInsets)((Field)localObject1).get(null);
          if (localObject1 != null)
          {
            localObject1 = new WindowInsets((WindowInsets)localObject1);
            return (WindowInsets)localObject1;
          }
        }
        catch (ReflectiveOperationException localReflectiveOperationException2)
        {
          Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
        }
      }
      if (!sConstructorFetched)
      {
        try
        {
          sConstructor = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        }
        catch (ReflectiveOperationException localReflectiveOperationException3)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
        }
        sConstructorFetched = true;
      }
      Object localObject2 = sConstructor;
      if (localObject2 != null) {
        try
        {
          Rect localRect = new android/graphics/Rect;
          localRect.<init>();
          localObject2 = (WindowInsets)((Constructor)localObject2).newInstance(new Object[] { localRect });
          return (WindowInsets)localObject2;
        }
        catch (ReflectiveOperationException localReflectiveOperationException4)
        {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
        }
      }
      return null;
    }
    
    WindowInsetsCompat build()
    {
      applyInsetTypes();
      WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
      localWindowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
      localWindowInsetsCompat.setStableInsets(this.mStableInsets);
      return localWindowInsetsCompat;
    }
    
    void setStableInsets(Insets paramInsets)
    {
      this.mStableInsets = paramInsets;
    }
    
    void setSystemWindowInsets(Insets paramInsets)
    {
      WindowInsets localWindowInsets = this.mPlatformInsets;
      if (localWindowInsets != null) {
        this.mPlatformInsets = localWindowInsets.replaceSystemWindowInsets(paramInsets.left, paramInsets.top, paramInsets.right, paramInsets.bottom);
      }
    }
  }
  
  private static class BuilderImpl29
    extends WindowInsetsCompat.BuilderImpl
  {
    final WindowInsets.Builder mPlatBuilder;
    
    BuilderImpl29()
    {
      this.mPlatBuilder = new WindowInsets.Builder();
    }
    
    BuilderImpl29(WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
      paramWindowInsetsCompat = paramWindowInsetsCompat.toWindowInsets();
      if (paramWindowInsetsCompat != null) {
        paramWindowInsetsCompat = new WindowInsets.Builder(paramWindowInsetsCompat);
      } else {
        paramWindowInsetsCompat = new WindowInsets.Builder();
      }
      this.mPlatBuilder = paramWindowInsetsCompat;
    }
    
    WindowInsetsCompat build()
    {
      applyInsetTypes();
      WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build());
      localWindowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
      return localWindowInsetsCompat;
    }
    
    void setDisplayCutout(DisplayCutoutCompat paramDisplayCutoutCompat)
    {
      WindowInsets.Builder localBuilder = this.mPlatBuilder;
      if (paramDisplayCutoutCompat != null) {
        paramDisplayCutoutCompat = paramDisplayCutoutCompat.unwrap();
      } else {
        paramDisplayCutoutCompat = null;
      }
      localBuilder.setDisplayCutout(paramDisplayCutoutCompat);
    }
    
    void setMandatorySystemGestureInsets(Insets paramInsets)
    {
      this.mPlatBuilder.setMandatorySystemGestureInsets(paramInsets.toPlatformInsets());
    }
    
    void setStableInsets(Insets paramInsets)
    {
      this.mPlatBuilder.setStableInsets(paramInsets.toPlatformInsets());
    }
    
    void setSystemGestureInsets(Insets paramInsets)
    {
      this.mPlatBuilder.setSystemGestureInsets(paramInsets.toPlatformInsets());
    }
    
    void setSystemWindowInsets(Insets paramInsets)
    {
      this.mPlatBuilder.setSystemWindowInsets(paramInsets.toPlatformInsets());
    }
    
    void setTappableElementInsets(Insets paramInsets)
    {
      this.mPlatBuilder.setTappableElementInsets(paramInsets.toPlatformInsets());
    }
  }
  
  private static class BuilderImpl30
    extends WindowInsetsCompat.BuilderImpl29
  {
    BuilderImpl30() {}
    
    BuilderImpl30(WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
    }
    
    void setInsets(int paramInt, Insets paramInsets)
    {
      this.mPlatBuilder.setInsets(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
    }
    
    void setInsetsIgnoringVisibility(int paramInt, Insets paramInsets)
    {
      this.mPlatBuilder.setInsetsIgnoringVisibility(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
    }
    
    void setVisible(int paramInt, boolean paramBoolean)
    {
      this.mPlatBuilder.setVisible(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramBoolean);
    }
  }
  
  private static class Impl
  {
    static final WindowInsetsCompat CONSUMED = new WindowInsetsCompat.Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    final WindowInsetsCompat mHost;
    
    Impl(WindowInsetsCompat paramWindowInsetsCompat)
    {
      this.mHost = paramWindowInsetsCompat;
    }
    
    WindowInsetsCompat consumeDisplayCutout()
    {
      return this.mHost;
    }
    
    WindowInsetsCompat consumeStableInsets()
    {
      return this.mHost;
    }
    
    WindowInsetsCompat consumeSystemWindowInsets()
    {
      return this.mHost;
    }
    
    void copyRootViewBounds(View paramView) {}
    
    void copyWindowDataInto(WindowInsetsCompat paramWindowInsetsCompat) {}
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Impl)) {
        return false;
      }
      paramObject = (Impl)paramObject;
      if ((isRound() != ((Impl)paramObject).isRound()) || (isConsumed() != ((Impl)paramObject).isConsumed()) || (!ObjectsCompat.equals(getSystemWindowInsets(), ((Impl)paramObject).getSystemWindowInsets())) || (!ObjectsCompat.equals(getStableInsets(), ((Impl)paramObject).getStableInsets())) || (!ObjectsCompat.equals(getDisplayCutout(), ((Impl)paramObject).getDisplayCutout()))) {
        bool = false;
      }
      return bool;
    }
    
    DisplayCutoutCompat getDisplayCutout()
    {
      return null;
    }
    
    Insets getInsets(int paramInt)
    {
      return Insets.NONE;
    }
    
    Insets getInsetsIgnoringVisibility(int paramInt)
    {
      if ((paramInt & 0x8) == 0) {
        return Insets.NONE;
      }
      throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }
    
    Insets getMandatorySystemGestureInsets()
    {
      return getSystemWindowInsets();
    }
    
    Insets getStableInsets()
    {
      return Insets.NONE;
    }
    
    Insets getSystemGestureInsets()
    {
      return getSystemWindowInsets();
    }
    
    Insets getSystemWindowInsets()
    {
      return Insets.NONE;
    }
    
    Insets getTappableElementInsets()
    {
      return getSystemWindowInsets();
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout() });
    }
    
    WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return CONSUMED;
    }
    
    boolean isConsumed()
    {
      return false;
    }
    
    boolean isRound()
    {
      return false;
    }
    
    boolean isVisible(int paramInt)
    {
      return true;
    }
    
    public void setOverriddenInsets(Insets[] paramArrayOfInsets) {}
    
    void setRootViewData(Insets paramInsets) {}
    
    void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat) {}
    
    public void setStableInsets(Insets paramInsets) {}
  }
  
  private static class Impl20
    extends WindowInsetsCompat.Impl
  {
    private static Class<?> sAttachInfoClass;
    private static Field sAttachInfoField;
    private static Method sGetViewRootImplMethod;
    private static Class<?> sViewRootImplClass;
    private static Field sVisibleInsetsField;
    private static boolean sVisibleRectReflectionFetched = false;
    private Insets[] mOverriddenInsets;
    final WindowInsets mPlatformInsets;
    Insets mRootViewVisibleInsets;
    private WindowInsetsCompat mRootWindowInsets;
    private Insets mSystemWindowInsets = null;
    
    Impl20(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
    {
      super();
      this.mPlatformInsets = paramWindowInsets;
    }
    
    Impl20(WindowInsetsCompat paramWindowInsetsCompat, Impl20 paramImpl20)
    {
      this(paramWindowInsetsCompat, new WindowInsets(paramImpl20.mPlatformInsets));
    }
    
    private Insets getInsets(int paramInt, boolean paramBoolean)
    {
      Insets localInsets = Insets.NONE;
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          localInsets = Insets.max(localInsets, getInsetsForType(i, paramBoolean));
        }
        i <<= 1;
      }
      return localInsets;
    }
    
    private Insets getRootStableInsets()
    {
      WindowInsetsCompat localWindowInsetsCompat = this.mRootWindowInsets;
      if (localWindowInsetsCompat != null) {
        return localWindowInsetsCompat.getStableInsets();
      }
      return Insets.NONE;
    }
    
    private Insets getVisibleInsets(View paramView)
    {
      if (Build.VERSION.SDK_INT < 30)
      {
        if (!sVisibleRectReflectionFetched) {
          loadReflectionField();
        }
        Object localObject = sGetViewRootImplMethod;
        StringBuilder localStringBuilder = null;
        if ((localObject != null) && (sAttachInfoClass != null) && (sVisibleInsetsField != null)) {
          try
          {
            paramView = ((Method)localObject).invoke(paramView, new Object[0]);
            if (paramView == null)
            {
              paramView = new java/lang/NullPointerException;
              paramView.<init>();
              Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", paramView);
              return null;
            }
            paramView = sAttachInfoField.get(paramView);
            localObject = (Rect)sVisibleInsetsField.get(paramView);
            paramView = localStringBuilder;
            if (localObject != null) {
              paramView = Insets.of((Rect)localObject);
            }
            return paramView;
          }
          catch (ReflectiveOperationException paramView)
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("Failed to get visible insets. (Reflection error). ");
            localStringBuilder.append(paramView.getMessage());
            Log.e("WindowInsetsCompat", localStringBuilder.toString(), paramView);
          }
        }
        return null;
      }
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    private static void loadReflectionField()
    {
      try
      {
        sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
        sViewRootImplClass = Class.forName("android.view.ViewRootImpl");
        Class localClass = Class.forName("android.view.View$AttachInfo");
        sAttachInfoClass = localClass;
        sVisibleInsetsField = localClass.getDeclaredField("mVisibleInsets");
        sAttachInfoField = sViewRootImplClass.getDeclaredField("mAttachInfo");
        sVisibleInsetsField.setAccessible(true);
        sAttachInfoField.setAccessible(true);
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to get visible insets. (Reflection error). ");
        localStringBuilder.append(localReflectiveOperationException.getMessage());
        Log.e("WindowInsetsCompat", localStringBuilder.toString(), localReflectiveOperationException);
      }
      sVisibleRectReflectionFetched = true;
    }
    
    void copyRootViewBounds(View paramView)
    {
      Insets localInsets = getVisibleInsets(paramView);
      paramView = localInsets;
      if (localInsets == null) {
        paramView = Insets.NONE;
      }
      setRootViewData(paramView);
    }
    
    void copyWindowDataInto(WindowInsetsCompat paramWindowInsetsCompat)
    {
      paramWindowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
      paramWindowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
    }
    
    public boolean equals(Object paramObject)
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (Impl20)paramObject;
      return Objects.equals(this.mRootViewVisibleInsets, ((Impl20)paramObject).mRootViewVisibleInsets);
    }
    
    public Insets getInsets(int paramInt)
    {
      return getInsets(paramInt, false);
    }
    
    protected Insets getInsetsForType(int paramInt, boolean paramBoolean)
    {
      if (paramInt != 1)
      {
        Object localObject1 = null;
        Insets localInsets = null;
        if (paramInt != 2)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32)
              {
                if (paramInt != 64)
                {
                  if (paramInt != 128) {
                    return Insets.NONE;
                  }
                  localObject1 = this.mRootWindowInsets;
                  if (localObject1 != null) {
                    localObject1 = ((WindowInsetsCompat)localObject1).getDisplayCutout();
                  } else {
                    localObject1 = getDisplayCutout();
                  }
                  if (localObject1 != null) {
                    return Insets.of(((DisplayCutoutCompat)localObject1).getSafeInsetLeft(), ((DisplayCutoutCompat)localObject1).getSafeInsetTop(), ((DisplayCutoutCompat)localObject1).getSafeInsetRight(), ((DisplayCutoutCompat)localObject1).getSafeInsetBottom());
                  }
                  return Insets.NONE;
                }
                return getTappableElementInsets();
              }
              return getMandatorySystemGestureInsets();
            }
            return getSystemGestureInsets();
          }
          localObject2 = this.mOverriddenInsets;
          localObject1 = localInsets;
          if (localObject2 != null) {
            localObject1 = localObject2[WindowInsetsCompat.Type.indexOf(8)];
          }
          if (localObject1 != null) {
            return (Insets)localObject1;
          }
          localInsets = getSystemWindowInsets();
          localObject1 = getRootStableInsets();
          if (localInsets.bottom > ((Insets)localObject1).bottom) {
            return Insets.of(0, 0, 0, localInsets.bottom);
          }
          localInsets = this.mRootViewVisibleInsets;
          if ((localInsets != null) && (!localInsets.equals(Insets.NONE)) && (this.mRootViewVisibleInsets.bottom > ((Insets)localObject1).bottom)) {
            return Insets.of(0, 0, 0, this.mRootViewVisibleInsets.bottom);
          }
          return Insets.NONE;
        }
        if (paramBoolean)
        {
          localInsets = getRootStableInsets();
          localObject1 = getStableInsets();
          return Insets.of(Math.max(localInsets.left, ((Insets)localObject1).left), 0, Math.max(localInsets.right, ((Insets)localObject1).right), Math.max(localInsets.bottom, ((Insets)localObject1).bottom));
        }
        localInsets = getSystemWindowInsets();
        Object localObject2 = this.mRootWindowInsets;
        if (localObject2 != null) {
          localObject1 = ((WindowInsetsCompat)localObject2).getStableInsets();
        }
        int i = localInsets.bottom;
        paramInt = i;
        if (localObject1 != null) {
          paramInt = Math.min(i, ((Insets)localObject1).bottom);
        }
        return Insets.of(localInsets.left, 0, localInsets.right, paramInt);
      }
      if (paramBoolean) {
        return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
      }
      return Insets.of(0, getSystemWindowInsets().top, 0, 0);
    }
    
    public Insets getInsetsIgnoringVisibility(int paramInt)
    {
      return getInsets(paramInt, true);
    }
    
    final Insets getSystemWindowInsets()
    {
      if (this.mSystemWindowInsets == null) {
        this.mSystemWindowInsets = Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
      }
      return this.mSystemWindowInsets;
    }
    
    WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      WindowInsetsCompat.Builder localBuilder = new WindowInsetsCompat.Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
      localBuilder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
      localBuilder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
      return localBuilder.build();
    }
    
    boolean isRound()
    {
      return this.mPlatformInsets.isRound();
    }
    
    protected boolean isTypeVisible(int paramInt)
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        if (paramInt != 4)
        {
          if ((paramInt != 8) && (paramInt != 128)) {
            return true;
          }
        }
        else {
          return false;
        }
      }
      return getInsetsForType(paramInt, false).equals(Insets.NONE) ^ true;
    }
    
    boolean isVisible(int paramInt)
    {
      int i = 1;
      while (i <= 256)
      {
        if (((paramInt & i) != 0) && (!isTypeVisible(i))) {
          return false;
        }
        i <<= 1;
      }
      return true;
    }
    
    public void setOverriddenInsets(Insets[] paramArrayOfInsets)
    {
      this.mOverriddenInsets = paramArrayOfInsets;
    }
    
    void setRootViewData(Insets paramInsets)
    {
      this.mRootViewVisibleInsets = paramInsets;
    }
    
    void setRootWindowInsets(WindowInsetsCompat paramWindowInsetsCompat)
    {
      this.mRootWindowInsets = paramWindowInsetsCompat;
    }
  }
  
  private static class Impl21
    extends WindowInsetsCompat.Impl20
  {
    private Insets mStableInsets = null;
    
    Impl21(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    Impl21(WindowInsetsCompat paramWindowInsetsCompat, Impl21 paramImpl21)
    {
      super(paramImpl21);
      this.mStableInsets = paramImpl21.mStableInsets;
    }
    
    WindowInsetsCompat consumeStableInsets()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
    }
    
    WindowInsetsCompat consumeSystemWindowInsets()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
    }
    
    final Insets getStableInsets()
    {
      if (this.mStableInsets == null) {
        this.mStableInsets = Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
      }
      return this.mStableInsets;
    }
    
    boolean isConsumed()
    {
      return this.mPlatformInsets.isConsumed();
    }
    
    public void setStableInsets(Insets paramInsets)
    {
      this.mStableInsets = paramInsets;
    }
  }
  
  private static class Impl28
    extends WindowInsetsCompat.Impl21
  {
    Impl28(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    Impl28(WindowInsetsCompat paramWindowInsetsCompat, Impl28 paramImpl28)
    {
      super(paramImpl28);
    }
    
    WindowInsetsCompat consumeDisplayCutout()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Impl28)) {
        return false;
      }
      paramObject = (Impl28)paramObject;
      if ((!Objects.equals(this.mPlatformInsets, ((Impl28)paramObject).mPlatformInsets)) || (!Objects.equals(this.mRootViewVisibleInsets, ((Impl28)paramObject).mRootViewVisibleInsets))) {
        bool = false;
      }
      return bool;
    }
    
    DisplayCutoutCompat getDisplayCutout()
    {
      return DisplayCutoutCompat.wrap(this.mPlatformInsets.getDisplayCutout());
    }
    
    public int hashCode()
    {
      return this.mPlatformInsets.hashCode();
    }
  }
  
  private static class Impl29
    extends WindowInsetsCompat.Impl28
  {
    private Insets mMandatorySystemGestureInsets = null;
    private Insets mSystemGestureInsets = null;
    private Insets mTappableElementInsets = null;
    
    Impl29(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    Impl29(WindowInsetsCompat paramWindowInsetsCompat, Impl29 paramImpl29)
    {
      super(paramImpl29);
    }
    
    Insets getMandatorySystemGestureInsets()
    {
      if (this.mMandatorySystemGestureInsets == null) {
        this.mMandatorySystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
      }
      return this.mMandatorySystemGestureInsets;
    }
    
    Insets getSystemGestureInsets()
    {
      if (this.mSystemGestureInsets == null) {
        this.mSystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
      }
      return this.mSystemGestureInsets;
    }
    
    Insets getTappableElementInsets()
    {
      if (this.mTappableElementInsets == null) {
        this.mTappableElementInsets = Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
      }
      return this.mTappableElementInsets;
    }
    
    WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(paramInt1, paramInt2, paramInt3, paramInt4));
    }
    
    public void setStableInsets(Insets paramInsets) {}
  }
  
  private static class Impl30
    extends WindowInsetsCompat.Impl29
  {
    static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
    
    Impl30(WindowInsetsCompat paramWindowInsetsCompat, WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    Impl30(WindowInsetsCompat paramWindowInsetsCompat, Impl30 paramImpl30)
    {
      super(paramImpl30);
    }
    
    final void copyRootViewBounds(View paramView) {}
    
    public Insets getInsets(int paramInt)
    {
      return Insets.toCompatInsets(this.mPlatformInsets.getInsets(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
    }
    
    public Insets getInsetsIgnoringVisibility(int paramInt)
    {
      return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
    }
    
    public boolean isVisible(int paramInt)
    {
      return this.mPlatformInsets.isVisible(WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt));
    }
  }
  
  public static final class Type
  {
    static final int CAPTION_BAR = 4;
    static final int DISPLAY_CUTOUT = 128;
    static final int FIRST = 1;
    static final int IME = 8;
    static final int LAST = 256;
    static final int MANDATORY_SYSTEM_GESTURES = 32;
    static final int NAVIGATION_BARS = 2;
    static final int SIZE = 9;
    static final int STATUS_BARS = 1;
    static final int SYSTEM_GESTURES = 16;
    static final int TAPPABLE_ELEMENT = 64;
    static final int WINDOW_DECOR = 256;
    
    static int all()
    {
      return -1;
    }
    
    public static int captionBar()
    {
      return 4;
    }
    
    public static int displayCutout()
    {
      return 128;
    }
    
    public static int ime()
    {
      return 8;
    }
    
    static int indexOf(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 4)
          {
            if (paramInt != 8)
            {
              if (paramInt != 16)
              {
                if (paramInt != 32)
                {
                  if (paramInt != 64)
                  {
                    if (paramInt != 128)
                    {
                      if (paramInt == 256) {
                        return 8;
                      }
                      StringBuilder localStringBuilder = new StringBuilder();
                      localStringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                      localStringBuilder.append(paramInt);
                      throw new IllegalArgumentException(localStringBuilder.toString());
                    }
                    return 7;
                  }
                  return 6;
                }
                return 5;
              }
              return 4;
            }
            return 3;
          }
          return 2;
        }
        return 1;
      }
      return 0;
    }
    
    public static int mandatorySystemGestures()
    {
      return 32;
    }
    
    public static int navigationBars()
    {
      return 2;
    }
    
    public static int statusBars()
    {
      return 1;
    }
    
    public static int systemBars()
    {
      return 7;
    }
    
    public static int systemGestures()
    {
      return 16;
    }
    
    public static int tappableElement()
    {
      return 64;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface InsetsType {}
  }
  
  private static final class TypeImpl30
  {
    static int toPlatformType(int paramInt)
    {
      int k = 0;
      int j = 1;
      while (j <= 256)
      {
        int i = k;
        if ((paramInt & j) != 0)
        {
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 4)
              {
                if (j != 8)
                {
                  if (j != 16)
                  {
                    if (j != 32)
                    {
                      if (j != 64)
                      {
                        if (j != 128)
                        {
                          i = k;
                          break label127;
                        }
                        i = WindowInsets.Type.displayCutout();
                      }
                      else
                      {
                        i = WindowInsets.Type.tappableElement();
                      }
                    }
                    else {
                      i = WindowInsets.Type.mandatorySystemGestures();
                    }
                  }
                  else {
                    i = WindowInsets.Type.systemGestures();
                  }
                }
                else {
                  i = WindowInsets.Type.ime();
                }
              }
              else {
                i = WindowInsets.Type.captionBar();
              }
            }
            else {
              i = WindowInsets.Type.navigationBars();
            }
          }
          else {
            i = WindowInsets.Type.statusBars();
          }
          i = k | i;
        }
        label127:
        j <<= 1;
        k = i;
      }
      return k;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\WindowInsetsCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */