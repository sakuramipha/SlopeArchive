package com.google.android.gms.appset;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AppSetIdInfo
{
  public static final int SCOPE_APP = 1;
  public static final int SCOPE_DEVELOPER = 2;
  private final String zza;
  private final int zzb;
  
  public AppSetIdInfo(String paramString, int paramInt)
  {
    this.zza = paramString;
    this.zzb = paramInt;
  }
  
  public String getId()
  {
    return this.zza;
  }
  
  public int getScope()
  {
    return this.zzb;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Scope {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\appset\AppSetIdInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */