package com.google.android.gms.games;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

public final class FriendsResolutionRequiredException
  extends ResolvableApiException
{
  private FriendsResolutionRequiredException(Status paramStatus)
  {
    super(paramStatus);
  }
  
  public static FriendsResolutionRequiredException zza(Status paramStatus)
  {
    return new FriendsResolutionRequiredException(paramStatus);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\FriendsResolutionRequiredException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */