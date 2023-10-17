package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException
  extends UnsupportedOperationException
{
  private final Feature zza;
  
  public UnsupportedApiCallException(Feature paramFeature)
  {
    this.zza = paramFeature;
  }
  
  public String getMessage()
  {
    String str = String.valueOf(this.zza);
    String.valueOf(str).length();
    return "Missing ".concat(String.valueOf(str));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\UnsupportedApiCallException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */