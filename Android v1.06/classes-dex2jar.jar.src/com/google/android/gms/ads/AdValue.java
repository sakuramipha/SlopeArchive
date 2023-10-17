package com.google.android.gms.ads;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AdValue
{
  private final int zza;
  private final String zzb;
  private final long zzc;
  
  private AdValue(int paramInt, String paramString, long paramLong)
  {
    this.zza = paramInt;
    this.zzb = paramString;
    this.zzc = paramLong;
  }
  
  public static AdValue zza(int paramInt, String paramString, long paramLong)
  {
    return new AdValue(paramInt, paramString, paramLong);
  }
  
  public String getCurrencyCode()
  {
    return this.zzb;
  }
  
  public int getPrecisionType()
  {
    return this.zza;
  }
  
  public long getValueMicros()
  {
    return this.zzc;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PrecisionType
  {
    public static final int ESTIMATED = 1;
    public static final int PRECISE = 3;
    public static final int PUBLISHER_PROVIDED = 2;
    public static final int UNKNOWN = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */