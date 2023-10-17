package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable
  extends Drawable
  implements Animatable
{
  private static final int ANIMATION_DURATION = 1332;
  private static final int ARROW_HEIGHT = 5;
  private static final int ARROW_HEIGHT_LARGE = 6;
  private static final int ARROW_WIDTH = 10;
  private static final int ARROW_WIDTH_LARGE = 12;
  private static final float CENTER_RADIUS = 7.5F;
  private static final float CENTER_RADIUS_LARGE = 11.0F;
  private static final int[] COLORS = { -16777216 };
  private static final float COLOR_CHANGE_OFFSET = 0.75F;
  public static final int DEFAULT = 1;
  private static final float GROUP_FULL_ROTATION = 216.0F;
  public static final int LARGE = 0;
  private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
  private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
  private static final float MAX_PROGRESS_ARC = 0.8F;
  private static final float MIN_PROGRESS_ARC = 0.01F;
  private static final float RING_ROTATION = 0.20999998F;
  private static final float SHRINK_OFFSET = 0.5F;
  private static final float STROKE_WIDTH = 2.5F;
  private static final float STROKE_WIDTH_LARGE = 3.0F;
  private Animator mAnimator;
  boolean mFinishing;
  private Resources mResources;
  private final Ring mRing;
  private float mRotation;
  float mRotationCount;
  
  public CircularProgressDrawable(Context paramContext)
  {
    this.mResources = ((Context)Preconditions.checkNotNull(paramContext)).getResources();
    paramContext = new Ring();
    this.mRing = paramContext;
    paramContext.setColors(COLORS);
    setStrokeWidth(2.5F);
    setupAnimators();
  }
  
  private void applyFinishTranslation(float paramFloat, Ring paramRing)
  {
    updateRingColor(paramFloat, paramRing);
    float f = (float)(Math.floor(paramRing.getStartingRotation() / 0.8F) + 1.0D);
    paramRing.setStartTrim(paramRing.getStartingStartTrim() + (paramRing.getStartingEndTrim() - 0.01F - paramRing.getStartingStartTrim()) * paramFloat);
    paramRing.setEndTrim(paramRing.getStartingEndTrim());
    paramRing.setRotation(paramRing.getStartingRotation() + (f - paramRing.getStartingRotation()) * paramFloat);
  }
  
  private int evaluateColorChange(float paramFloat, int paramInt1, int paramInt2)
  {
    int j = paramInt1 >> 24 & 0xFF;
    int i = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    return j + (int)(((paramInt2 >> 24 & 0xFF) - j) * paramFloat) << 24 | i + (int)(((paramInt2 >> 16 & 0xFF) - i) * paramFloat) << 16 | k + (int)(((paramInt2 >> 8 & 0xFF) - k) * paramFloat) << 8 | paramInt1 + (int)(paramFloat * ((paramInt2 & 0xFF) - paramInt1));
  }
  
  private float getRotation()
  {
    return this.mRotation;
  }
  
  private void setRotation(float paramFloat)
  {
    this.mRotation = paramFloat;
  }
  
  private void setSizeParameters(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Ring localRing = this.mRing;
    float f = this.mResources.getDisplayMetrics().density;
    localRing.setStrokeWidth(paramFloat2 * f);
    localRing.setCenterRadius(paramFloat1 * f);
    localRing.setColorIndex(0);
    localRing.setArrowDimensions(paramFloat3 * f, paramFloat4 * f);
  }
  
  private void setupAnimators()
  {
    final Ring localRing = this.mRing;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        CircularProgressDrawable.this.updateRingColor(f, localRing);
        CircularProgressDrawable.this.applyTransformation(f, localRing, false);
        CircularProgressDrawable.this.invalidateSelf();
      }
    });
    localValueAnimator.setRepeatCount(-1);
    localValueAnimator.setRepeatMode(1);
    localValueAnimator.setInterpolator(LINEAR_INTERPOLATOR);
    localValueAnimator.addListener(new Animator.AnimatorListener()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public void onAnimationEnd(Animator paramAnonymousAnimator) {}
      
      public void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        CircularProgressDrawable.this.applyTransformation(1.0F, localRing, true);
        localRing.storeOriginals();
        localRing.goToNextColor();
        if (CircularProgressDrawable.this.mFinishing)
        {
          CircularProgressDrawable.this.mFinishing = false;
          paramAnonymousAnimator.cancel();
          paramAnonymousAnimator.setDuration(1332L);
          paramAnonymousAnimator.start();
          localRing.setShowArrow(false);
        }
        else
        {
          paramAnonymousAnimator = CircularProgressDrawable.this;
          paramAnonymousAnimator.mRotationCount += 1.0F;
        }
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        CircularProgressDrawable.this.mRotationCount = 0.0F;
      }
    });
    this.mAnimator = localValueAnimator;
  }
  
  void applyTransformation(float paramFloat, Ring paramRing, boolean paramBoolean)
  {
    if (this.mFinishing)
    {
      applyFinishTranslation(paramFloat, paramRing);
    }
    else if ((paramFloat != 1.0F) || (paramBoolean))
    {
      float f3 = paramRing.getStartingRotation();
      float f2;
      float f1;
      if (paramFloat < 0.5F)
      {
        f2 = paramFloat / 0.5F;
        f1 = paramRing.getStartingStartTrim();
        f2 = MATERIAL_INTERPOLATOR.getInterpolation(f2) * 0.79F + 0.01F + f1;
      }
      else
      {
        f1 = (paramFloat - 0.5F) / 0.5F;
        f2 = paramRing.getStartingStartTrim() + 0.79F;
        f1 = f2 - ((1.0F - MATERIAL_INTERPOLATOR.getInterpolation(f1)) * 0.79F + 0.01F);
      }
      float f4 = this.mRotationCount;
      paramRing.setStartTrim(f1);
      paramRing.setEndTrim(f2);
      paramRing.setRotation(f3 + 0.20999998F * paramFloat);
      setRotation((paramFloat + f4) * 216.0F);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(this.mRotation, localRect.exactCenterX(), localRect.exactCenterY());
    this.mRing.draw(paramCanvas, localRect);
    paramCanvas.restore();
  }
  
  public int getAlpha()
  {
    return this.mRing.getAlpha();
  }
  
  public boolean getArrowEnabled()
  {
    return this.mRing.getShowArrow();
  }
  
  public float getArrowHeight()
  {
    return this.mRing.getArrowHeight();
  }
  
  public float getArrowScale()
  {
    return this.mRing.getArrowScale();
  }
  
  public float getArrowWidth()
  {
    return this.mRing.getArrowWidth();
  }
  
  public int getBackgroundColor()
  {
    return this.mRing.getBackgroundColor();
  }
  
  public float getCenterRadius()
  {
    return this.mRing.getCenterRadius();
  }
  
  public int[] getColorSchemeColors()
  {
    return this.mRing.getColors();
  }
  
  public float getEndTrim()
  {
    return this.mRing.getEndTrim();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public float getProgressRotation()
  {
    return this.mRing.getRotation();
  }
  
  public float getStartTrim()
  {
    return this.mRing.getStartTrim();
  }
  
  public Paint.Cap getStrokeCap()
  {
    return this.mRing.getStrokeCap();
  }
  
  public float getStrokeWidth()
  {
    return this.mRing.getStrokeWidth();
  }
  
  public boolean isRunning()
  {
    return this.mAnimator.isRunning();
  }
  
  public void setAlpha(int paramInt)
  {
    this.mRing.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setArrowDimensions(float paramFloat1, float paramFloat2)
  {
    this.mRing.setArrowDimensions(paramFloat1, paramFloat2);
    invalidateSelf();
  }
  
  public void setArrowEnabled(boolean paramBoolean)
  {
    this.mRing.setShowArrow(paramBoolean);
    invalidateSelf();
  }
  
  public void setArrowScale(float paramFloat)
  {
    this.mRing.setArrowScale(paramFloat);
    invalidateSelf();
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.mRing.setBackgroundColor(paramInt);
    invalidateSelf();
  }
  
  public void setCenterRadius(float paramFloat)
  {
    this.mRing.setCenterRadius(paramFloat);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mRing.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    this.mRing.setColors(paramVarArgs);
    this.mRing.setColorIndex(0);
    invalidateSelf();
  }
  
  public void setProgressRotation(float paramFloat)
  {
    this.mRing.setRotation(paramFloat);
    invalidateSelf();
  }
  
  public void setStartEndTrim(float paramFloat1, float paramFloat2)
  {
    this.mRing.setStartTrim(paramFloat1);
    this.mRing.setEndTrim(paramFloat2);
    invalidateSelf();
  }
  
  public void setStrokeCap(Paint.Cap paramCap)
  {
    this.mRing.setStrokeCap(paramCap);
    invalidateSelf();
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    this.mRing.setStrokeWidth(paramFloat);
    invalidateSelf();
  }
  
  public void setStyle(int paramInt)
  {
    if (paramInt == 0) {
      setSizeParameters(11.0F, 3.0F, 12.0F, 6.0F);
    } else {
      setSizeParameters(7.5F, 2.5F, 10.0F, 5.0F);
    }
    invalidateSelf();
  }
  
  public void start()
  {
    this.mAnimator.cancel();
    this.mRing.storeOriginals();
    if (this.mRing.getEndTrim() != this.mRing.getStartTrim())
    {
      this.mFinishing = true;
      this.mAnimator.setDuration(666L);
      this.mAnimator.start();
    }
    else
    {
      this.mRing.setColorIndex(0);
      this.mRing.resetOriginals();
      this.mAnimator.setDuration(1332L);
      this.mAnimator.start();
    }
  }
  
  public void stop()
  {
    this.mAnimator.cancel();
    setRotation(0.0F);
    this.mRing.setShowArrow(false);
    this.mRing.setColorIndex(0);
    this.mRing.resetOriginals();
    invalidateSelf();
  }
  
  void updateRingColor(float paramFloat, Ring paramRing)
  {
    if (paramFloat > 0.75F) {
      paramRing.setColor(evaluateColorChange((paramFloat - 0.75F) / 0.25F, paramRing.getStartingColor(), paramRing.getNextColor()));
    } else {
      paramRing.setColor(paramRing.getStartingColor());
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ProgressDrawableSize {}
  
  private static class Ring
  {
    int mAlpha;
    Path mArrow;
    int mArrowHeight;
    final Paint mArrowPaint;
    float mArrowScale;
    int mArrowWidth;
    final Paint mCirclePaint;
    int mColorIndex;
    int[] mColors;
    int mCurrentColor;
    float mEndTrim;
    final Paint mPaint;
    float mRingCenterRadius;
    float mRotation;
    boolean mShowArrow;
    float mStartTrim;
    float mStartingEndTrim;
    float mStartingRotation;
    float mStartingStartTrim;
    float mStrokeWidth;
    final RectF mTempBounds = new RectF();
    
    Ring()
    {
      Paint localPaint2 = new Paint();
      this.mPaint = localPaint2;
      Paint localPaint1 = new Paint();
      this.mArrowPaint = localPaint1;
      Paint localPaint3 = new Paint();
      this.mCirclePaint = localPaint3;
      this.mStartTrim = 0.0F;
      this.mEndTrim = 0.0F;
      this.mRotation = 0.0F;
      this.mStrokeWidth = 5.0F;
      this.mArrowScale = 1.0F;
      this.mAlpha = 255;
      localPaint2.setStrokeCap(Paint.Cap.SQUARE);
      localPaint2.setAntiAlias(true);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setStyle(Paint.Style.FILL);
      localPaint1.setAntiAlias(true);
      localPaint3.setColor(0);
    }
    
    void draw(Canvas paramCanvas, Rect paramRect)
    {
      RectF localRectF = this.mTempBounds;
      float f2 = this.mRingCenterRadius;
      float f1 = this.mStrokeWidth / 2.0F + f2;
      if (f2 <= 0.0F) {
        f1 = Math.min(paramRect.width(), paramRect.height()) / 2.0F - Math.max(this.mArrowWidth * this.mArrowScale / 2.0F, this.mStrokeWidth / 2.0F);
      }
      localRectF.set(paramRect.centerX() - f1, paramRect.centerY() - f1, paramRect.centerX() + f1, paramRect.centerY() + f1);
      f1 = this.mStartTrim;
      f2 = this.mRotation;
      f1 = (f1 + f2) * 360.0F;
      f2 = (this.mEndTrim + f2) * 360.0F - f1;
      this.mPaint.setColor(this.mCurrentColor);
      this.mPaint.setAlpha(this.mAlpha);
      float f3 = this.mStrokeWidth / 2.0F;
      localRectF.inset(f3, f3);
      paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, this.mCirclePaint);
      f3 = -f3;
      localRectF.inset(f3, f3);
      paramCanvas.drawArc(localRectF, f1, f2, false, this.mPaint);
      drawTriangle(paramCanvas, f1, f2, localRectF);
    }
    
    void drawTriangle(Canvas paramCanvas, float paramFloat1, float paramFloat2, RectF paramRectF)
    {
      if (this.mShowArrow)
      {
        Path localPath = this.mArrow;
        if (localPath == null)
        {
          localPath = new Path();
          this.mArrow = localPath;
          localPath.setFillType(Path.FillType.EVEN_ODD);
        }
        else
        {
          localPath.reset();
        }
        float f2 = Math.min(paramRectF.width(), paramRectF.height()) / 2.0F;
        float f4 = this.mArrowWidth * this.mArrowScale / 2.0F;
        this.mArrow.moveTo(0.0F, 0.0F);
        this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0F);
        localPath = this.mArrow;
        float f3 = this.mArrowWidth;
        float f1 = this.mArrowScale;
        localPath.lineTo(f3 * f1 / 2.0F, this.mArrowHeight * f1);
        this.mArrow.offset(f2 + paramRectF.centerX() - f4, paramRectF.centerY() + this.mStrokeWidth / 2.0F);
        this.mArrow.close();
        this.mArrowPaint.setColor(this.mCurrentColor);
        this.mArrowPaint.setAlpha(this.mAlpha);
        paramCanvas.save();
        paramCanvas.rotate(paramFloat1 + paramFloat2, paramRectF.centerX(), paramRectF.centerY());
        paramCanvas.drawPath(this.mArrow, this.mArrowPaint);
        paramCanvas.restore();
      }
    }
    
    int getAlpha()
    {
      return this.mAlpha;
    }
    
    float getArrowHeight()
    {
      return this.mArrowHeight;
    }
    
    float getArrowScale()
    {
      return this.mArrowScale;
    }
    
    float getArrowWidth()
    {
      return this.mArrowWidth;
    }
    
    int getBackgroundColor()
    {
      return this.mCirclePaint.getColor();
    }
    
    float getCenterRadius()
    {
      return this.mRingCenterRadius;
    }
    
    int[] getColors()
    {
      return this.mColors;
    }
    
    float getEndTrim()
    {
      return this.mEndTrim;
    }
    
    int getNextColor()
    {
      return this.mColors[getNextColorIndex()];
    }
    
    int getNextColorIndex()
    {
      return (this.mColorIndex + 1) % this.mColors.length;
    }
    
    float getRotation()
    {
      return this.mRotation;
    }
    
    boolean getShowArrow()
    {
      return this.mShowArrow;
    }
    
    float getStartTrim()
    {
      return this.mStartTrim;
    }
    
    int getStartingColor()
    {
      return this.mColors[this.mColorIndex];
    }
    
    float getStartingEndTrim()
    {
      return this.mStartingEndTrim;
    }
    
    float getStartingRotation()
    {
      return this.mStartingRotation;
    }
    
    float getStartingStartTrim()
    {
      return this.mStartingStartTrim;
    }
    
    Paint.Cap getStrokeCap()
    {
      return this.mPaint.getStrokeCap();
    }
    
    float getStrokeWidth()
    {
      return this.mStrokeWidth;
    }
    
    void goToNextColor()
    {
      setColorIndex(getNextColorIndex());
    }
    
    void resetOriginals()
    {
      this.mStartingStartTrim = 0.0F;
      this.mStartingEndTrim = 0.0F;
      this.mStartingRotation = 0.0F;
      setStartTrim(0.0F);
      setEndTrim(0.0F);
      setRotation(0.0F);
    }
    
    void setAlpha(int paramInt)
    {
      this.mAlpha = paramInt;
    }
    
    void setArrowDimensions(float paramFloat1, float paramFloat2)
    {
      this.mArrowWidth = ((int)paramFloat1);
      this.mArrowHeight = ((int)paramFloat2);
    }
    
    void setArrowScale(float paramFloat)
    {
      if (paramFloat != this.mArrowScale) {
        this.mArrowScale = paramFloat;
      }
    }
    
    void setBackgroundColor(int paramInt)
    {
      this.mCirclePaint.setColor(paramInt);
    }
    
    void setCenterRadius(float paramFloat)
    {
      this.mRingCenterRadius = paramFloat;
    }
    
    void setColor(int paramInt)
    {
      this.mCurrentColor = paramInt;
    }
    
    void setColorFilter(ColorFilter paramColorFilter)
    {
      this.mPaint.setColorFilter(paramColorFilter);
    }
    
    void setColorIndex(int paramInt)
    {
      this.mColorIndex = paramInt;
      this.mCurrentColor = this.mColors[paramInt];
    }
    
    void setColors(int[] paramArrayOfInt)
    {
      this.mColors = paramArrayOfInt;
      setColorIndex(0);
    }
    
    void setEndTrim(float paramFloat)
    {
      this.mEndTrim = paramFloat;
    }
    
    void setRotation(float paramFloat)
    {
      this.mRotation = paramFloat;
    }
    
    void setShowArrow(boolean paramBoolean)
    {
      if (this.mShowArrow != paramBoolean) {
        this.mShowArrow = paramBoolean;
      }
    }
    
    void setStartTrim(float paramFloat)
    {
      this.mStartTrim = paramFloat;
    }
    
    void setStrokeCap(Paint.Cap paramCap)
    {
      this.mPaint.setStrokeCap(paramCap);
    }
    
    void setStrokeWidth(float paramFloat)
    {
      this.mStrokeWidth = paramFloat;
      this.mPaint.setStrokeWidth(paramFloat);
    }
    
    void storeOriginals()
    {
      this.mStartingStartTrim = this.mStartTrim;
      this.mStartingEndTrim = this.mEndTrim;
      this.mStartingRotation = this.mRotation;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\swiperefreshlayout\widget\CircularProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */