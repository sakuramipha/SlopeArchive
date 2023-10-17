package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.CommonStatusCodes;

public class NearbyMessagesStatusCodes
  extends CommonStatusCodes
{
  public static final int APP_NOT_OPTED_IN = 2802;
  public static final int APP_QUOTA_LIMIT_REACHED = 2804;
  public static final int BLE_ADVERTISING_UNSUPPORTED = 2821;
  public static final int BLE_SCANNING_UNSUPPORTED = 2822;
  public static final int BLUETOOTH_OFF = 2820;
  public static final int DISALLOWED_CALLING_CONTEXT = 2803;
  public static final int FORBIDDEN = 2806;
  public static final int MISSING_PERMISSIONS = 2807;
  public static final int NOT_AUTHORIZED = 2805;
  public static final int TOO_MANY_PENDING_INTENTS = 2801;
  
  public static String getStatusCodeString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      switch (paramInt)
      {
      default: 
        return CommonStatusCodes.getStatusCodeString(paramInt);
      case 2822: 
        return "BLE_SCANNING_UNSUPPORTED";
      case 2821: 
        return "BLE_ADVERTISING_UNSUPPORTED";
      }
      return "BLUETOOTH_OFF";
    case 2807: 
      return "MISSING_PERMISSIONS";
    case 2806: 
      return "FORBIDDEN";
    case 2805: 
      return "NOT_AUTHORIZED";
    case 2804: 
      return "APP_QUOTA_LIMIT_REACHED";
    case 2803: 
      return "DISALLOWED_CALLING_CONTEXT";
    case 2802: 
      return "APP_NOT_OPTED_IN";
    }
    return "TOO_MANY_PENDING_INTENTS";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\NearbyMessagesStatusCodes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */