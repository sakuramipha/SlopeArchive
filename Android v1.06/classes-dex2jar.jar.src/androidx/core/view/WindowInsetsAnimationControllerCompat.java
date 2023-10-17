package androidx.core.view;

import android.os.Build.VERSION;
import android.view.WindowInsetsAnimationController;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationControllerCompat
{
  private final Impl mImpl;
  
  WindowInsetsAnimationControllerCompat()
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      this.mImpl = new Impl();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("On API 30+, the constructor taking a ");
    localStringBuilder.append("WindowInsetsAnimationController");
    localStringBuilder.append(" as parameter");
    throw new UnsupportedOperationException(localStringBuilder.toString());
  }
  
  WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController paramWindowInsetsAnimationController)
  {
    this.mImpl = new Impl30(paramWindowInsetsAnimationController);
  }
  
  public void finish(boolean paramBoolean)
  {
    this.mImpl.finish(paramBoolean);
  }
  
  public float getCurrentAlpha()
  {
    return this.mImpl.getCurrentAlpha();
  }
  
  public float getCurrentFraction()
  {
    return this.mImpl.getCurrentFraction();
  }
  
  public Insets getCurrentInsets()
  {
    return this.mImpl.getCurrentInsets();
  }
  
  public Insets getHiddenStateInsets()
  {
    return this.mImpl.getHiddenStateInsets();
  }
  
  public Insets getShownStateInsets()
  {
    return this.mImpl.getShownStateInsets();
  }
  
  public int getTypes()
  {
    return this.mImpl.getTypes();
  }
  
  public boolean isCancelled()
  {
    return this.mImpl.isCancelled();
  }
  
  public boolean isFinished()
  {
    return this.mImpl.isFinished();
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!isFinished()) && (!isCancelled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setInsetsAndAlpha(Insets paramInsets, float paramFloat1, float paramFloat2)
  {
    this.mImpl.setInsetsAndAlpha(paramInsets, paramFloat1, paramFloat2);
  }
  
  private static class Impl
  {
    void finish(boolean paramBoolean) {}
    
    public float getCurrentAlpha()
    {
      return 0.0F;
    }
    
    public float getCurrentFraction()
    {
      return 0.0F;
    }
    
    public Insets getCurrentInsets()
    {
      return Insets.NONE;
    }
    
    public Insets getHiddenStateInsets()
    {
      return Insets.NONE;
    }
    
    public Insets getShownStateInsets()
    {
      return Insets.NONE;
    }
    
    public int getTypes()
    {
      return 0;
    }
    
    boolean isCancelled()
    {
      return true;
    }
    
    boolean isFinished()
    {
      return false;
    }
    
    public boolean isReady()
    {
      return false;
    }
    
    public void setInsetsAndAlpha(Insets paramInsets, float paramFloat1, float paramFloat2) {}
  }
  
  private static class Impl30
    extends WindowInsetsAnimationControllerCompat.Impl
  {
    private final WindowInsetsAnimationController mController;
    
    Impl30(WindowInsetsAnimationController paramWindowInsetsAnimationController)
    {
      this.mController = paramWindowInsetsAnimationController;
    }
    
    void finish(boolean paramBoolean)
    {
      this.mController.finish(paramBoolean);
    }
    
    public float getCurrentAlpha()
    {
      return this.mController.getCurrentAlpha();
    }
    
    public float getCurrentFraction()
    {
      return this.mController.getCurrentFraction();
    }
    
    public Insets getCurrentInsets()
    {
      return Insets.toCompatInsets(this.mController.getCurrentInsets());
    }
    
    public Insets getHiddenStateInsets()
    {
      return Insets.toCompatInsets(this.mController.getHiddenStateInsets());
    }
    
    public Insets getShownStateInsets()
    {
      return Insets.toCompatInsets(this.mController.getShownStateInsets());
    }
    
    public int getTypes()
    {
      return this.mController.getTypes();
    }
    
    boolean isCancelled()
    {
      return this.mController.isCancelled();
    }
    
    boolean isFinished()
    {
      return this.mController.isFinished();
    }
    
    public boolean isReady()
    {
      return this.mController.isReady();
    }
    
    public void setInsetsAndAlpha(Insets paramInsets, float paramFloat1, float paramFloat2)
    {
      WindowInsetsAnimationController localWindowInsetsAnimationController = this.mController;
      if (paramInsets == null) {
        paramInsets = null;
      } else {
        paramInsets = paramInsets.toPlatformInsets();
      }
      localWindowInsetsAnimationController.setInsetsAndAlpha(paramInsets, paramFloat1, paramFloat2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\WindowInsetsAnimationControllerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */