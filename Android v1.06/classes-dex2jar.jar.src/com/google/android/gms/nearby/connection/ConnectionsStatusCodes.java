package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class ConnectionsStatusCodes
  extends CommonStatusCodes
{
  public static final int API_CONNECTION_FAILED_ALREADY_IN_USE = 8050;
  public static final int MISSING_PERMISSION_ACCESS_COARSE_LOCATION = 8034;
  public static final int MISSING_PERMISSION_ACCESS_FINE_LOCATION = 8036;
  public static final int MISSING_PERMISSION_ACCESS_WIFI_STATE = 8032;
  public static final int MISSING_PERMISSION_BLUETOOTH = 8030;
  public static final int MISSING_PERMISSION_BLUETOOTH_ADMIN = 8031;
  public static final int MISSING_PERMISSION_CHANGE_WIFI_STATE = 8033;
  public static final int MISSING_PERMISSION_RECORD_AUDIO = 8035;
  @Deprecated
  public static final int MISSING_SETTING_LOCATION_MUST_BE_ON = 8025;
  public static final int STATUS_ALREADY_ADVERTISING = 8001;
  public static final int STATUS_ALREADY_CONNECTED_TO_ENDPOINT = 8003;
  public static final int STATUS_ALREADY_DISCOVERING = 8002;
  public static final int STATUS_ALREADY_HAVE_ACTIVE_STRATEGY = 8008;
  @Deprecated
  public static final int STATUS_BLUETOOTH_ERROR = 8007;
  public static final int STATUS_CONNECTION_REJECTED = 8004;
  public static final int STATUS_ENDPOINT_IO_ERROR = 8012;
  public static final int STATUS_ENDPOINT_UNKNOWN = 8011;
  public static final int STATUS_ERROR = 13;
  @Deprecated
  public static final int STATUS_NETWORK_NOT_CONNECTED = 8000;
  public static final int STATUS_NOT_CONNECTED_TO_ENDPOINT = 8005;
  public static final int STATUS_OK = 0;
  public static final int STATUS_OUT_OF_ORDER_API_CALL = 8009;
  public static final int STATUS_PAYLOAD_IO_ERROR = 8013;
  public static final int STATUS_RADIO_ERROR = 8007;
  
  public static String getStatusCodeString(int paramInt)
  {
    if (paramInt != 8025)
    {
      if (paramInt != 8050)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              return CommonStatusCodes.getStatusCodeString(paramInt);
            case 8036: 
              return "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
            case 8035: 
              return "MISSING_PERMISSION_RECORD_AUDIO";
            case 8034: 
              return "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
            case 8033: 
              return "MISSING_PERMISSION_CHANGE_WIFI_STATE";
            case 8032: 
              return "MISSING_PERMISSION_ACCESS_WIFI_STATE";
            case 8031: 
              return "MISSING_PERMISSION_BLUETOOTH_ADMIN";
            }
            return "MISSING_PERMISSION_BLUETOOTH";
          case 8014: 
            return "STATUS_PAYLOAD_UNKNOWN";
          case 8013: 
            return "STATUS_PAYLOAD_IO_ERROR";
          case 8012: 
            return "STATUS_ENDPOINT_IO_ERROR";
          case 8011: 
            return "STATUS_ENDPOINT_UNKNOWN";
          case 8010: 
            return "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
          case 8009: 
            return "STATUS_OUT_OF_ORDER_API_CALL";
          case 8008: 
            return "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
          }
          return "STATUS_RADIO_ERROR";
        case 8005: 
          return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
        case 8004: 
          return "STATUS_CONNECTION_REJECTED";
        case 8003: 
          return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
        case 8002: 
          return "STATUS_ALREADY_DISCOVERING";
        case 8001: 
          return "STATUS_ALREADY_ADVERTISING";
        }
        return "STATUS_NETWORK_NOT_CONNECTED";
      }
      return "API_CONNECTION_FAILED_ALREADY_IN_USE";
    }
    return "MISSING_SETTING_LOCATION_MUST_BE_ON";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\ConnectionsStatusCodes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */