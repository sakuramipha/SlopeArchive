package com.google.android.ump;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FormError
{
  private final int zza;
  private final String zzb;
  
  public FormError(int paramInt, String paramString)
  {
    this.zza = paramInt;
    this.zzb = paramString;
  }
  
  public int getErrorCode()
  {
    return this.zza;
  }
  
  public String getMessage()
  {
    return this.zzb;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ErrorCode
  {
    public static final int INTERNAL_ERROR = 1;
    public static final int INTERNET_ERROR = 2;
    public static final int INVALID_OPERATION = 3;
    public static final int TIME_OUT = 4;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\FormError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */