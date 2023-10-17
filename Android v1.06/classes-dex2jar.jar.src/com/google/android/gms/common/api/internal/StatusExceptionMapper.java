package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

public abstract interface StatusExceptionMapper
{
  public abstract Exception getException(Status paramStatus);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\StatusExceptionMapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */