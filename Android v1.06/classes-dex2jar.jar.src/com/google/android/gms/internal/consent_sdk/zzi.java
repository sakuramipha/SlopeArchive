package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

public final class zzi
  extends Exception
{
  private final int zza;
  
  public zzi(int paramInt, String paramString)
  {
    super(paramString);
    this.zza = paramInt;
  }
  
  public zzi(int paramInt, String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.zza = paramInt;
  }
  
  public final FormError zza()
  {
    if (getCause() == null) {
      Log.w("UserMessagingPlatform", getMessage());
    } else {
      Log.w("UserMessagingPlatform", getMessage(), getCause());
    }
    return new FormError(this.zza, getMessage());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */