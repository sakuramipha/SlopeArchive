package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  private static final int MIN_DELAY_MS = 500;
  private static final int MIN_SHOW_TIME_MS = 500;
  private final Runnable mDelayedHide = new ContentLoadingProgressBar..ExternalSyntheticLambda0(this);
  private final Runnable mDelayedShow = new ContentLoadingProgressBar..ExternalSyntheticLambda1(this);
  boolean mDismissed = false;
  boolean mPostedHide = false;
  boolean mPostedShow = false;
  long mStartTime = -1L;
  
  public ContentLoadingProgressBar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private void hideOnUiThread()
  {
    this.mDismissed = true;
    removeCallbacks(this.mDelayedShow);
    this.mPostedShow = false;
    long l2 = System.currentTimeMillis();
    long l1 = this.mStartTime;
    l2 -= l1;
    if ((l2 < 500L) && (l1 != -1L))
    {
      if (!this.mPostedHide)
      {
        postDelayed(this.mDelayedHide, 500L - l2);
        this.mPostedHide = true;
      }
    }
    else {
      setVisibility(8);
    }
  }
  
  private void removeCallbacks()
  {
    removeCallbacks(this.mDelayedHide);
    removeCallbacks(this.mDelayedShow);
  }
  
  private void showOnUiThread()
  {
    this.mStartTime = -1L;
    this.mDismissed = false;
    removeCallbacks(this.mDelayedHide);
    this.mPostedHide = false;
    if (!this.mPostedShow)
    {
      postDelayed(this.mDelayedShow, 500L);
      this.mPostedShow = true;
    }
  }
  
  public void hide()
  {
    post(new ContentLoadingProgressBar..ExternalSyntheticLambda2(this));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    removeCallbacks();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks();
  }
  
  public void show()
  {
    post(new ContentLoadingProgressBar..ExternalSyntheticLambda3(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\ContentLoadingProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */