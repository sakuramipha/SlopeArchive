package com.google.android.gms.common.api;

public class Response<T extends Result>
{
  private T zza;
  
  public Response() {}
  
  protected Response(T paramT)
  {
    this.zza = paramT;
  }
  
  protected T getResult()
  {
    return this.zza;
  }
  
  public void setResult(T paramT)
  {
    this.zza = paramT;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */