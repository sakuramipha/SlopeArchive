package com.google.android.gms.nearby.messages;

import com.google.android.gms.nearby.messages.internal.zze;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface Distance
  extends Comparable<Distance>
{
  public static final Distance UNKNOWN = new zze(1, NaN.0D);
  
  public abstract int compareTo(Distance paramDistance);
  
  public abstract int getAccuracy();
  
  public abstract double getMeters();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Accuracy
  {
    public static final int LOW = 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\Distance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */