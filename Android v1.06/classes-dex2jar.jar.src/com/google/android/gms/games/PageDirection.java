package com.google.android.gms.games;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PageDirection
{
  public static final int NEXT = 0;
  public static final int NONE = -1;
  public static final int PREV = 1;
  
  private PageDirection()
  {
    throw new AssertionError("Uninstantiable");
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Direction {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\PageDirection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */