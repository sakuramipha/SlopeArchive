package com.google.android.gms.games;

import android.app.PendingIntent;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;

public final class GamesClientStatusCodes
  extends CommonStatusCodes
{
  public static final int ACHIEVEMENT_NOT_INCREMENTAL = 26562;
  public static final int ACHIEVEMENT_UNKNOWN = 26561;
  public static final int ACHIEVEMENT_UNLOCKED = 26563;
  public static final int ACHIEVEMENT_UNLOCK_FAILURE = 26560;
  public static final int APP_MISCONFIGURED = 26508;
  public static final int CONSENT_REQUIRED = 26703;
  public static final int GAME_NOT_FOUND = 26509;
  public static final int LICENSE_CHECK_FAILED = 26507;
  public static final int NETWORK_ERROR_NO_DATA = 26504;
  public static final int NETWORK_ERROR_OPERATION_FAILED = 26506;
  public static final int OPERATION_IN_FLIGHT = 26607;
  public static final int SNAPSHOT_COMMIT_FAILED = 26573;
  public static final int SNAPSHOT_CONFLICT_MISSING = 26576;
  public static final int SNAPSHOT_CONTENTS_UNAVAILABLE = 26572;
  public static final int SNAPSHOT_CREATION_FAILED = 26571;
  public static final int SNAPSHOT_FOLDER_UNAVAILABLE = 26575;
  public static final int SNAPSHOT_NOT_FOUND = 26570;
  public static final int VIDEO_ALREADY_CAPTURING = 26625;
  public static final int VIDEO_NOT_ACTIVE = 26620;
  public static final int VIDEO_OUT_OF_DISK_SPACE = 26626;
  public static final int VIDEO_PERMISSION_ERROR = 26622;
  public static final int VIDEO_STORAGE_ERROR = 26623;
  public static final int VIDEO_UNEXPECTED_CAPTURE_ERROR = 26624;
  public static final int VIDEO_UNSUPPORTED = 26621;
  
  public static String getStatusCodeString(int paramInt)
  {
    if (paramInt != 26540)
    {
      if (paramInt != 26541)
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
              switch (paramInt)
              {
              default: 
                switch (paramInt)
                {
                default: 
                  switch (paramInt)
                  {
                  default: 
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
                        case 26613: 
                          return "QUEST_NOT_STARTED";
                        case 26612: 
                          return "QUEST_NO_LONGER_AVAILABLE";
                        case 26611: 
                          return "MILESTONE_CLAIM_FAILED";
                        }
                        return "MILESTONE_CLAIMED_PREVIOUSLY";
                      case 26607: 
                        return "OPERATION_IN_FLIGHT";
                      case 26606: 
                        return "REAL_TIME_SERVICE_NOT_CONNECTED";
                      case 26605: 
                        return "REAL_TIME_INACTIVE_ROOM";
                      case 26604: 
                        return "REAL_TIME_ROOM_NOT_JOINED";
                      case 26603: 
                        return "PARTICIPANT_NOT_CONNECTED";
                      case 26602: 
                        return "INVALID_REAL_TIME_ROOM_ID";
                      case 26601: 
                        return "REAL_TIME_MESSAGE_SEND_FAILED";
                      }
                      return "REAL_TIME_CONNECTION_FAILED";
                    case 26597: 
                      return "MATCH_ERROR_LOCALLY_MODIFIED";
                    case 26596: 
                      return "MATCH_NOT_FOUND";
                    case 26595: 
                      return "MATCH_ERROR_ALREADY_REMATCHED";
                    case 26594: 
                      return "MATCH_ERROR_INVALID_MATCH_RESULTS";
                    case 26593: 
                      return "MATCH_ERROR_OUT_OF_DATE_VERSION";
                    case 26592: 
                      return "MATCH_ERROR_INVALID_MATCH_STATE";
                    case 26591: 
                      return "MATCH_ERROR_INACTIVE_MATCH";
                    }
                    return "MATCH_ERROR_INVALID_PARTICIPANT_STATE";
                  case 26584: 
                    return "MULTIPLAYER_ERROR_INVALID_OPERATION";
                  case 26583: 
                    return "MULTIPLAYER_DISABLED";
                  case 26582: 
                    return "MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
                  case 26581: 
                    return "MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
                  }
                  return "MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
                case 26576: 
                  return "SNAPSHOT_CONFLICT_MISSING";
                case 26575: 
                  return "SNAPSHOT_FOLDER_UNAVAILABLE";
                case 26574: 
                  return "SNAPSHOT_CONFLICT";
                case 26573: 
                  return "SNAPSHOT_COMMIT_FAILED";
                case 26572: 
                  return "SNAPSHOT_CONTENTS_UNAVAILABLE";
                case 26571: 
                  return "SNAPSHOT_CREATION_FAILED";
                }
                return "SNAPSHOT_NOT_FOUND";
              case 26563: 
                return "ACHIEVEMENT_UNLOCKED";
              case 26562: 
                return "ACHIEVEMENT_NOT_INCREMENTAL";
              case 26561: 
                return "ACHIEVEMENT_UNKNOWN";
              }
              return "ACHIEVEMENT_UNLOCK_FAILURE";
            case 26552: 
              return "REQUEST_TOO_MANY_RECIPIENTS";
            case 26551: 
              return "REQUEST_UPDATE_TOTAL_FAILURE";
            }
            return "REQUEST_UPDATE_PARTIAL_SUCCESS";
          case 26536: 
            return "AUTH_ERROR_SERVICE_CACHE_MISTAKE";
          case 26535: 
            return "AUTH_ERROR_ACCOUNT_UNICORN";
          case 26534: 
            return "AUTH_ERROR_ACCOUNT_NOT_USABLE";
          case 26533: 
            return "AUTH_ERROR_API_ACCESS_DENIED";
          case 26532: 
            return "AUTH_ERROR_UNREGISTERED_CLIENT_ID";
          case 26531: 
            return "AUTH_ERROR_USER_RECOVERABLE";
          }
          return "AUTH_ERROR_HARD";
        case 26704: 
          return "PLAYER_NOT_FOUND";
        case 26703: 
          return "CONSENT_REQUIRED";
        case 26702: 
          return "CLIENT_HIDDEN";
        case 26701: 
          return "CLIENT_EMPTY";
        case 26700: 
          return "CLIENT_LOADING";
        case 26652: 
          return "VIDEO_CAPTURE_OVERLAY_VISIBLE";
        case 26650: 
          return "VIDEO_MISSING_OVERLAY_PERMISSION";
        case 26632: 
          return "CAPTURE_ALREADY_PAUSED";
        case 26631: 
          return "VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
        case 26630: 
          return "VIDEO_RELEASE_TIMEOUT";
        case 26629: 
          return "VIDEO_SCREEN_OFF";
        case 26628: 
          return "VIDEO_NO_CAMERA";
        case 26627: 
          return "VIDEO_NO_MIC";
        case 26626: 
          return "VIDEO_OUT_OF_DISK_SPACE";
        case 26625: 
          return "VIDEO_ALREADY_CAPTURING";
        case 26624: 
          return "VIDEO_UNEXPECTED_CAPTURE_ERROR";
        case 26623: 
          return "VIDEO_STORAGE_ERROR";
        case 26622: 
          return "VIDEO_PERMISSION_ERROR";
        case 26621: 
          return "VIDEO_UNSUPPORTED";
        case 26620: 
          return "VIDEO_NOT_ACTIVE";
        case 26520: 
          return "RESOLVE_STALE_OR_NO_DATA";
        case 26509: 
          return "GAME_NOT_FOUND";
        case 26508: 
          return "APP_MISCONFIGURED";
        case 26507: 
          return "LICENSE_CHECK_FAILED";
        case 26506: 
          return "NETWORK_ERROR_OPERATION_FAILED";
        case 26505: 
          return "NETWORK_ERROR_OPERATION_DEFERRED";
        case 26504: 
          return "NETWORK_ERROR_NO_DATA";
        case 26503: 
          return "NETWORK_ERROR_STALE_DATA";
        }
        return "CLIENT_RECONNECT_REQUIRED";
      }
      return "PLAYER_LEVEL_UP";
    }
    return "PLAYER_OOB_REQUIRED";
  }
  
  public static Status zza(int paramInt)
  {
    return new Status(4, getStatusCodeString(4));
  }
  
  public static Status zzb(int paramInt, PendingIntent paramPendingIntent)
  {
    return new Status(paramInt, getStatusCodeString(paramInt), paramPendingIntent);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesClientStatusCodes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */