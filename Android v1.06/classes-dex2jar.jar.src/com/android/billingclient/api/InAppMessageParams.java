package com.android.billingclient.api;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class InAppMessageParams
{
  private final ArrayList<Integer> mInAppMessageCategories;
  
  private InAppMessageParams(Set<Integer> paramSet)
  {
    this.mInAppMessageCategories = new ArrayList(Collections.unmodifiableList(new ArrayList(paramSet)));
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  ArrayList<Integer> getInAppMessageCategoriesToShow()
  {
    return this.mInAppMessageCategories;
  }
  
  public static final class Builder
  {
    private final Set<Integer> mInAppMessageCategories = new HashSet();
    
    public Builder addAllInAppMessageCategoriesToShow()
    {
      this.mInAppMessageCategories.add(Integer.valueOf(2));
      return this;
    }
    
    public Builder addInAppMessageCategoryToShow(int paramInt)
    {
      this.mInAppMessageCategories.add(Integer.valueOf(paramInt));
      return this;
    }
    
    public InAppMessageParams build()
    {
      return new InAppMessageParams(this.mInAppMessageCategories, null);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface InAppMessageCategoryId
  {
    public static final int TRANSACTIONAL = 2;
    public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\InAppMessageParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */