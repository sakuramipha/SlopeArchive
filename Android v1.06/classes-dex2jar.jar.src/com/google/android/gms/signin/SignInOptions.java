package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public final class SignInOptions
  implements Api.ApiOptions.Optional
{
  public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
  private final boolean zab;
  private final boolean zac;
  private final String zad;
  private final boolean zae;
  private final String zaf;
  private final String zag;
  private final boolean zah;
  private final Long zai;
  private final Long zaj;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof SignInOptions)) {
      return false;
    }
    paramObject = (SignInOptions)paramObject;
    boolean bool = ((SignInOptions)paramObject).zab;
    bool = ((SignInOptions)paramObject).zac;
    Object localObject = ((SignInOptions)paramObject).zad;
    if (Objects.equal(null, null))
    {
      bool = ((SignInOptions)paramObject).zae;
      bool = ((SignInOptions)paramObject).zah;
      localObject = ((SignInOptions)paramObject).zaf;
      if (Objects.equal(null, null))
      {
        localObject = ((SignInOptions)paramObject).zag;
        if (Objects.equal(null, null))
        {
          localObject = ((SignInOptions)paramObject).zai;
          if (Objects.equal(null, null))
          {
            paramObject = ((SignInOptions)paramObject).zaj;
            if (Objects.equal(null, null)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Boolean localBoolean = Boolean.valueOf(false);
    return Objects.hashCode(new Object[] { localBoolean, localBoolean, null, localBoolean, localBoolean, null, null, null, null });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\SignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */