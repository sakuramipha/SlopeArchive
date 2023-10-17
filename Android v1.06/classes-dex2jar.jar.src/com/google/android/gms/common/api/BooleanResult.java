package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;

public class BooleanResult
  implements Result
{
  private final Status zaa;
  private final boolean zab;
  
  public BooleanResult(Status paramStatus, boolean paramBoolean)
  {
    this.zaa = ((Status)Preconditions.checkNotNull(paramStatus, "Status must not be null"));
    this.zab = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof BooleanResult)) {
      return false;
    }
    paramObject = (BooleanResult)paramObject;
    return (this.zaa.equals(((BooleanResult)paramObject).zaa)) && (this.zab == ((BooleanResult)paramObject).zab);
  }
  
  public Status getStatus()
  {
    return this.zaa;
  }
  
  public boolean getValue()
  {
    return this.zab;
  }
  
  public final int hashCode()
  {
    return (this.zaa.hashCode() + 527) * 31 + this.zab;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\BooleanResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */