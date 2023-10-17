package androidx.core.text;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.Layout.Alignment;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class PrecomputedTextCompat
  implements Spannable
{
  private static final char LINE_FEED = '\n';
  private static Executor sExecutor;
  private static final Object sLock = new Object();
  private final int[] mParagraphEnds;
  private final Params mParams;
  private final Spannable mText;
  private final PrecomputedText mWrapped;
  
  private PrecomputedTextCompat(PrecomputedText paramPrecomputedText, Params paramParams)
  {
    this.mText = paramPrecomputedText;
    this.mParams = paramParams;
    this.mParagraphEnds = null;
    if (Build.VERSION.SDK_INT < 29) {
      paramPrecomputedText = null;
    }
    this.mWrapped = paramPrecomputedText;
  }
  
  private PrecomputedTextCompat(CharSequence paramCharSequence, Params paramParams, int[] paramArrayOfInt)
  {
    this.mText = new SpannableString(paramCharSequence);
    this.mParams = paramParams;
    this.mParagraphEnds = paramArrayOfInt;
    this.mWrapped = null;
  }
  
  public static PrecomputedTextCompat create(CharSequence paramCharSequence, Params paramParams)
  {
    Preconditions.checkNotNull(paramCharSequence);
    Preconditions.checkNotNull(paramParams);
    try
    {
      TraceCompat.beginSection("PrecomputedText");
      if ((Build.VERSION.SDK_INT >= 29) && (paramParams.mWrapped != null))
      {
        paramCharSequence = new PrecomputedTextCompat(PrecomputedText.create(paramCharSequence, paramParams.mWrapped), paramParams);
        return paramCharSequence;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = paramCharSequence.length();
      int i = 0;
      while (i < j)
      {
        i = TextUtils.indexOf(paramCharSequence, '\n', i, j);
        if (i < 0) {
          i = j;
        } else {
          i++;
        }
        localArrayList.add(Integer.valueOf(i));
      }
      int[] arrayOfInt = new int[localArrayList.size()];
      for (i = 0; i < localArrayList.size(); i++) {
        arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      }
      if (Build.VERSION.SDK_INT >= 23) {
        StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramParams.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(paramParams.getBreakStrategy()).setHyphenationFrequency(paramParams.getHyphenationFrequency()).setTextDirection(paramParams.getTextDirection()).build();
      } else if (Build.VERSION.SDK_INT >= 21) {
        new StaticLayout(paramCharSequence, paramParams.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      }
      paramCharSequence = new PrecomputedTextCompat(paramCharSequence, paramParams, arrayOfInt);
      return paramCharSequence;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  public static Future<PrecomputedTextCompat> getTextFuture(CharSequence paramCharSequence, Params paramParams, Executor arg2)
  {
    paramParams = new PrecomputedTextFutureTask(paramParams, paramCharSequence);
    paramCharSequence = ???;
    if (??? == null) {
      synchronized (sLock)
      {
        if (sExecutor == null) {
          sExecutor = Executors.newFixedThreadPool(1);
        }
        paramCharSequence = sExecutor;
      }
    }
    paramCharSequence.execute(paramParams);
    return paramParams;
  }
  
  public char charAt(int paramInt)
  {
    return this.mText.charAt(paramInt);
  }
  
  public int getParagraphCount()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return this.mWrapped.getParagraphCount();
    }
    return this.mParagraphEnds.length;
  }
  
  public int getParagraphEnd(int paramInt)
  {
    Preconditions.checkArgumentInRange(paramInt, 0, getParagraphCount(), "paraIndex");
    if (Build.VERSION.SDK_INT >= 29) {
      return this.mWrapped.getParagraphEnd(paramInt);
    }
    return this.mParagraphEnds[paramInt];
  }
  
  public int getParagraphStart(int paramInt)
  {
    int j = getParagraphCount();
    int i = 0;
    Preconditions.checkArgumentInRange(paramInt, 0, j, "paraIndex");
    if (Build.VERSION.SDK_INT >= 29) {
      return this.mWrapped.getParagraphStart(paramInt);
    }
    if (paramInt == 0) {
      paramInt = i;
    } else {
      paramInt = this.mParagraphEnds[(paramInt - 1)];
    }
    return paramInt;
  }
  
  public Params getParams()
  {
    return this.mParams;
  }
  
  public PrecomputedText getPrecomputedText()
  {
    Spannable localSpannable = this.mText;
    if ((localSpannable instanceof PrecomputedText)) {
      return (PrecomputedText)localSpannable;
    }
    return null;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return this.mText.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return this.mText.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return this.mText.getSpanStart(paramObject);
  }
  
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return this.mWrapped.getSpans(paramInt1, paramInt2, paramClass);
    }
    return this.mText.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public int length()
  {
    return this.mText.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.mText.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 29) {
        this.mWrapped.removeSpan(paramObject);
      } else {
        this.mText.removeSpan(paramObject);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 29) {
        this.mWrapped.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      } else {
        this.mText.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.mText.subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.mText.toString();
  }
  
  public static final class Params
  {
    private final int mBreakStrategy;
    private final int mHyphenationFrequency;
    private final TextPaint mPaint;
    private final TextDirectionHeuristic mTextDir;
    final PrecomputedText.Params mWrapped;
    
    public Params(PrecomputedText.Params paramParams)
    {
      this.mPaint = paramParams.getTextPaint();
      this.mTextDir = paramParams.getTextDirection();
      this.mBreakStrategy = paramParams.getBreakStrategy();
      this.mHyphenationFrequency = paramParams.getHyphenationFrequency();
      if (Build.VERSION.SDK_INT < 29) {
        paramParams = null;
      }
      this.mWrapped = paramParams;
    }
    
    Params(TextPaint paramTextPaint, TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        this.mWrapped = new PrecomputedText.Params.Builder(paramTextPaint).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build();
      } else {
        this.mWrapped = null;
      }
      this.mPaint = paramTextPaint;
      this.mTextDir = paramTextDirectionHeuristic;
      this.mBreakStrategy = paramInt1;
      this.mHyphenationFrequency = paramInt2;
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof Params)) {
        return false;
      }
      paramObject = (Params)paramObject;
      if (!equalsWithoutTextDirection((Params)paramObject)) {
        return false;
      }
      return (Build.VERSION.SDK_INT < 18) || (this.mTextDir == ((Params)paramObject).getTextDirection());
    }
    
    public boolean equalsWithoutTextDirection(Params paramParams)
    {
      if (Build.VERSION.SDK_INT >= 23)
      {
        if (this.mBreakStrategy != paramParams.getBreakStrategy()) {
          return false;
        }
        if (this.mHyphenationFrequency != paramParams.getHyphenationFrequency()) {
          return false;
        }
      }
      if (this.mPaint.getTextSize() != paramParams.getTextPaint().getTextSize()) {
        return false;
      }
      if (this.mPaint.getTextScaleX() != paramParams.getTextPaint().getTextScaleX()) {
        return false;
      }
      if (this.mPaint.getTextSkewX() != paramParams.getTextPaint().getTextSkewX()) {
        return false;
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.mPaint.getLetterSpacing() != paramParams.getTextPaint().getLetterSpacing()) {
          return false;
        }
        if (!TextUtils.equals(this.mPaint.getFontFeatureSettings(), paramParams.getTextPaint().getFontFeatureSettings())) {
          return false;
        }
      }
      if (this.mPaint.getFlags() != paramParams.getTextPaint().getFlags()) {
        return false;
      }
      if (Build.VERSION.SDK_INT >= 24)
      {
        if (!this.mPaint.getTextLocales().equals(paramParams.getTextPaint().getTextLocales())) {
          return false;
        }
      }
      else if ((Build.VERSION.SDK_INT >= 17) && (!this.mPaint.getTextLocale().equals(paramParams.getTextPaint().getTextLocale()))) {
        return false;
      }
      if (this.mPaint.getTypeface() == null)
      {
        if (paramParams.getTextPaint().getTypeface() != null) {
          return false;
        }
      }
      else if (!this.mPaint.getTypeface().equals(paramParams.getTextPaint().getTypeface())) {
        return false;
      }
      return true;
    }
    
    public int getBreakStrategy()
    {
      return this.mBreakStrategy;
    }
    
    public int getHyphenationFrequency()
    {
      return this.mHyphenationFrequency;
    }
    
    public TextDirectionHeuristic getTextDirection()
    {
      return this.mTextDir;
    }
    
    public TextPaint getTextPaint()
    {
      return this.mPaint;
    }
    
    public int hashCode()
    {
      if (Build.VERSION.SDK_INT >= 24) {
        return ObjectsCompat.hash(new Object[] { Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocales(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency) });
      }
      if (Build.VERSION.SDK_INT >= 21) {
        return ObjectsCompat.hash(new Object[] { Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency) });
      }
      if (Build.VERSION.SDK_INT >= 18) {
        return ObjectsCompat.hash(new Object[] { Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency) });
      }
      if (Build.VERSION.SDK_INT >= 17) {
        return ObjectsCompat.hash(new Object[] { Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency) });
      }
      return ObjectsCompat.hash(new Object[] { Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTypeface(), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency) });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("{");
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("textSize=");
      localStringBuilder2.append(this.mPaint.getTextSize());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textScaleX=");
      localStringBuilder2.append(this.mPaint.getTextScaleX());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textSkewX=");
      localStringBuilder2.append(this.mPaint.getTextSkewX());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (Build.VERSION.SDK_INT >= 21)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", letterSpacing=");
        localStringBuilder2.append(this.mPaint.getLetterSpacing());
        localStringBuilder1.append(localStringBuilder2.toString());
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", elegantTextHeight=");
        localStringBuilder2.append(this.mPaint.isElegantTextHeight());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      if (Build.VERSION.SDK_INT >= 24)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
        localStringBuilder2.append(this.mPaint.getTextLocales());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      else if (Build.VERSION.SDK_INT >= 17)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", textLocale=");
        localStringBuilder2.append(this.mPaint.getTextLocale());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", typeface=");
      localStringBuilder2.append(this.mPaint.getTypeface());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (Build.VERSION.SDK_INT >= 26)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append(", variationSettings=");
        localStringBuilder2.append(this.mPaint.getFontVariationSettings());
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textDir=");
      localStringBuilder2.append(this.mTextDir);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", breakStrategy=");
      localStringBuilder2.append(this.mBreakStrategy);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", hyphenationFrequency=");
      localStringBuilder2.append(this.mHyphenationFrequency);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
    }
    
    public static class Builder
    {
      private int mBreakStrategy;
      private int mHyphenationFrequency;
      private final TextPaint mPaint;
      private TextDirectionHeuristic mTextDir;
      
      public Builder(TextPaint paramTextPaint)
      {
        this.mPaint = paramTextPaint;
        if (Build.VERSION.SDK_INT >= 23)
        {
          this.mBreakStrategy = 1;
          this.mHyphenationFrequency = 1;
        }
        else
        {
          this.mHyphenationFrequency = 0;
          this.mBreakStrategy = 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
          this.mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
          this.mTextDir = null;
        }
      }
      
      public PrecomputedTextCompat.Params build()
      {
        return new PrecomputedTextCompat.Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
      }
      
      public Builder setBreakStrategy(int paramInt)
      {
        this.mBreakStrategy = paramInt;
        return this;
      }
      
      public Builder setHyphenationFrequency(int paramInt)
      {
        this.mHyphenationFrequency = paramInt;
        return this;
      }
      
      public Builder setTextDirection(TextDirectionHeuristic paramTextDirectionHeuristic)
      {
        this.mTextDir = paramTextDirectionHeuristic;
        return this;
      }
    }
  }
  
  private static class PrecomputedTextFutureTask
    extends FutureTask<PrecomputedTextCompat>
  {
    PrecomputedTextFutureTask(PrecomputedTextCompat.Params paramParams, CharSequence paramCharSequence)
    {
      super();
    }
    
    private static class PrecomputedTextCallback
      implements Callable<PrecomputedTextCompat>
    {
      private PrecomputedTextCompat.Params mParams;
      private CharSequence mText;
      
      PrecomputedTextCallback(PrecomputedTextCompat.Params paramParams, CharSequence paramCharSequence)
      {
        this.mParams = paramParams;
        this.mText = paramCharSequence;
      }
      
      public PrecomputedTextCompat call()
        throws Exception
      {
        return PrecomputedTextCompat.create(this.mText, this.mParams);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\text\PrecomputedTextCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */