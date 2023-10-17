package com.google.android.gms.games;

public final class GamesCallbackStatusCodes
{
  @Deprecated
  public static final int CLIENT_RECONNECT_REQUIRED = 2;
  public static final int INTERNAL_ERROR = 1;
  public static final int OK = 0;
  
  public static String getStatusCodeString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 6003)
          {
            if (paramInt != 7004)
            {
              if (paramInt != 7000)
              {
                if (paramInt != 7001)
                {
                  StringBuilder localStringBuilder = new StringBuilder(47);
                  localStringBuilder.append("unknown games callback status code: ");
                  localStringBuilder.append(paramInt);
                  return localStringBuilder.toString();
                }
                return "REAL_TIME_MESSAGE_SEND_FAILED";
              }
              return "REAL_TIME_CONNECTION_FAILED";
            }
            return "REAL_TIME_ROOM_NOT_JOINED";
          }
          return "MULTIPLAYER_DISABLED";
        }
        return "CLIENT_RECONNECT_REQUIRED";
      }
      return "INTERNAL_ERROR";
    }
    return "OK";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesCallbackStatusCodes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */