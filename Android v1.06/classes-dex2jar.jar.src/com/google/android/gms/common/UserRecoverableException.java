package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException
  extends Exception
{
  private final Intent zza;
  
  public UserRecoverableException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.zza = paramIntent;
  }
  
  public Intent getIntent()
  {
    return new Intent(this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\UserRecoverableException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */