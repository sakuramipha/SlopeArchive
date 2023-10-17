package com.google.android.gms.common.api;

public class ApiException
  extends Exception
{
  @Deprecated
  protected final Status mStatus;
  
  public ApiException(Status paramStatus)
  {
    super(localStringBuilder.toString());
    this.mStatus = paramStatus;
  }
  
  public Status getStatus()
  {
    return this.mStatus;
  }
  
  public int getStatusCode()
  {
    return this.mStatus.getStatusCode();
  }
  
  @Deprecated
  public String getStatusMessage()
  {
    return this.mStatus.getStatusMessage();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\ApiException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */