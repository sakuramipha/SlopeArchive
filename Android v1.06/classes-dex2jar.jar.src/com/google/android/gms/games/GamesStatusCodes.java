package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

@Deprecated
public final class GamesStatusCodes
{
  public static Status zza(int paramInt)
  {
    return new Status(paramInt, zzb(paramInt));
  }
  
  public static String zzb(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5)
              {
                if (paramInt != 6)
                {
                  if (paramInt != 7)
                  {
                    if (paramInt != 14) {
                      if (paramInt != 15) {
                        if (paramInt != 6500) {
                          if (paramInt == 6501) {}
                        }
                      }
                    }
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
                                    return String.format(Locale.US, "Status code (%d) not found!", new Object[] { Integer.valueOf(paramInt) });
                                  case 7007: 
                                    return "STATUS_OPERATION_IN_FLIGHT";
                                  case 7006: 
                                    return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
                                  case 7005: 
                                    return "STATUS_REAL_TIME_INACTIVE_ROOM";
                                  case 7004: 
                                    return "STATUS_REAL_TIME_ROOM_NOT_JOINED";
                                  case 7003: 
                                    return "STATUS_PARTICIPANT_NOT_CONNECTED";
                                  case 7002: 
                                    return "STATUS_INVALID_REAL_TIME_ROOM_ID";
                                  case 7001: 
                                    return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
                                  }
                                  return "STATUS_REAL_TIME_CONNECTION_FAILED";
                                case 6507: 
                                  return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
                                case 6506: 
                                  return "STATUS_MATCH_NOT_FOUND";
                                case 6505: 
                                  return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
                                case 6504: 
                                  return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
                                }
                                return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
                              case 6003: 
                                return "STATUS_MULTIPLAYER_DISABLED";
                              case 6002: 
                                return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
                              case 6001: 
                                return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
                              }
                              return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
                            case 4004: 
                              return "STATUS_SNAPSHOT_CONFLICT";
                            case 4003: 
                              return "STATUS_SNAPSHOT_COMMIT_FAILED";
                            case 4002: 
                              return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
                            case 4001: 
                              return "STATUS_SNAPSHOT_CREATION_FAILED";
                            }
                            return "STATUS_SNAPSHOT_NOT_FOUND";
                          case 3003: 
                            return "STATUS_ACHIEVEMENT_UNLOCKED";
                          case 3002: 
                            return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
                          case 3001: 
                            return "STATUS_ACHIEVEMENT_UNKNOWN";
                          }
                          return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
                        case 2002: 
                          return "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
                        case 2001: 
                          return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
                        }
                        return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
                      case 1006: 
                        return "STATUS_AUTH_ERROR_SERVICE_CACHE_MISTAKE";
                      case 1005: 
                        return "STATUS_AUTH_ERROR_ACCOUNT_UNICORN";
                      case 1004: 
                        return "STATUS_AUTH_ERROR_ACCOUNT_NOT_USABLE";
                      case 1003: 
                        return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
                      case 1002: 
                        return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
                      case 1001: 
                        return "STATUS_AUTH_ERROR_USER_RECOVERABLE";
                      }
                      return "STATUS_AUTH_ERROR_HARD";
                    case 10003: 
                      return "STATUS_CONSENT_REQUIRED";
                    case 10002: 
                      return "STATUS_CLIENT_HIDDEN";
                    case 10001: 
                      return "STATUS_CLIENT_EMPTY";
                    case 10000: 
                      return "STATUS_CLIENT_LOADING";
                    case 9200: 
                      return "STATUS_VIDEO_MISSING_OVERLAY_PERMISSION";
                    case 9017: 
                      return "STATUS_VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
                    case 9016: 
                      return "STATUS_VIDEO_RELEASE_TIMEOUT";
                    case 9012: 
                      return "STATUS_VIDEO_SCREEN_OFF";
                    case 9011: 
                      return "STATUS_VIDEO_NO_CAMERA";
                    case 9010: 
                      return "STATUS_VIDEO_NO_MIC";
                    case 9009: 
                      return "STATUS_VIDEO_OUT_OF_DISK_SPACE";
                    case 9006: 
                      return "STATUS_VIDEO_ALREADY_CAPTURING";
                    case 9004: 
                      return "STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR";
                    case 9003: 
                      return "STATUS_VIDEO_STORAGE_ERROR";
                    case 9002: 
                      return "STATUS_VIDEO_PERMISSION_ERROR";
                    case 9001: 
                      return "STATUS_VIDEO_UNSUPPORTED";
                    case 9000: 
                      return "STATUS_VIDEO_NOT_ACTIVE";
                    case 8003: 
                      return "STATUS_QUEST_NOT_STARTED";
                    case 8002: 
                      return "STATUS_QUEST_NO_LONGER_AVAILABLE";
                    case 8001: 
                      return "STATUS_MILESTONE_CLAIM_FAILED";
                    case 8000: 
                      return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
                    case 4006: 
                      return "STATUS_SNAPSHOT_CONFLICT_MISSING";
                    case 1500: 
                      return "STATUS_PLAYER_OOB_REQUIRED";
                    case 500: 
                      return "STATUS_RESOLVE_STALE_OR_NO_DATA";
                    case 9: 
                      return "STATUS_GAME_NOT_FOUND";
                    case 8: 
                      return "STATUS_APP_MISCONFIGURED";
                      return "STATUS_MATCH_ERROR_INACTIVE_MATCH";
                      return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
                      return "STATUS_TIMEOUT";
                      return "STATUS_INTERRUPTED";
                    }
                  }
                  return "STATUS_LICENSE_CHECK_FAILED";
                }
                return "STATUS_NETWORK_ERROR_OPERATION_FAILED";
              }
              return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
            }
            return "STATUS_NETWORK_ERROR_NO_DATA";
          }
          return "STATUS_NETWORK_ERROR_STALE_DATA";
        }
        return "STATUS_CLIENT_RECONNECT_REQUIRED";
      }
      return "STATUS_INTERNAL_ERROR";
    }
    return "STATUS_OK";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\GamesStatusCodes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */