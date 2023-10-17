package com.google.android.gms.ads;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AdInspectorError
  extends AdError
{
  public static final int ERROR_CODE_ALREADY_OPEN = 3;
  public static final int ERROR_CODE_FAILED_TO_LOAD = 1;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_NOT_IN_TEST_MODE = 2;
  
  public AdInspectorError(int paramInt, String paramString1, String paramString2)
  {
    super(paramInt, paramString1, paramString2);
  }
  
  public int getCode()
  {
    return super.getCode();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AdInspectorErrorCode {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdInspectorError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */