package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

public final class zzfba
{
  public static zze zza(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof zzebz))
    {
      paramThrowable = (zzebz)paramThrowable;
      return zzc(paramThrowable.zza(), paramThrowable.zzb());
    }
    if ((paramThrowable instanceof zzdtz))
    {
      if (paramThrowable.getMessage() == null) {
        paramThrowable = zzd(((zzdtz)paramThrowable).zza(), null, null);
      } else {
        paramThrowable = zzd(((zzdtz)paramThrowable).zza(), paramThrowable.getMessage(), null);
      }
      return paramThrowable;
    }
    if ((paramThrowable instanceof zzay))
    {
      paramThrowable = (zzay)paramThrowable;
      return new zze(paramThrowable.zza(), zzfpo.zzc(paramThrowable.getMessage()), "com.google.android.gms.ads", null, null);
    }
    return zzd(1, null, null);
  }
  
  public static zze zzb(Throwable paramThrowable, zzeca paramzzeca)
  {
    zze localzze = zza(paramThrowable);
    int i = localzze.zza;
    if ((i == 3) || (i == 0))
    {
      paramThrowable = localzze.zzd;
      if ((paramThrowable != null) && (!paramThrowable.zzc.equals("com.google.android.gms.ads"))) {
        localzze.zzd = null;
      }
    }
    if (paramzzeca != null) {
      localzze.zze = paramzzeca.zzb();
    }
    return localzze;
  }
  
  public static zze zzc(int paramInt, zze paramzze)
  {
    if (paramInt != 0)
    {
      int i = paramInt;
      if (paramInt == 8)
      {
        zzbbc localzzbbc = zzbbk.zzhN;
        if (((Integer)zzba.zzc().zzb(localzzbbc)).intValue() <= 0) {
          i = 8;
        } else {
          return paramzze;
        }
      }
      return zzd(i, null, paramzze);
    }
    throw null;
  }
  
  public static zze zzd(int paramInt, String paramString, zze paramzze)
  {
    Object localObject = paramString;
    if (paramString == null) {
      if (paramInt != 0)
      {
        switch (paramInt - 1)
        {
        case 11: 
        default: 
          localObject = "Internal error.";
          break;
        case 18: 
          localObject = "Ad inspector cannot be opened because it is already open.";
          break;
        case 17: 
          localObject = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
          break;
        case 16: 
          localObject = "Ad inspector failed to load.";
          break;
        case 15: 
          localObject = "Ad inspector had an internal error.";
          break;
        case 14: 
          localObject = "Invalid ad string.";
          break;
        case 13: 
          localObject = "Mismatch request IDs.";
          break;
        case 12: 
          paramString = zzbbk.zzhQ;
          if (((Integer)zzba.zzc().zzb(paramString)).intValue() <= 0) {
            localObject = "The mediation adapter did not return an ad.";
          }
          break;
        case 10: 
          localObject = "The ad can not be shown when app is not in foreground.";
          break;
        case 9: 
          localObject = "The ad has already been shown.";
          break;
        case 8: 
          localObject = "The ad is not ready.";
          break;
        case 7: 
          localObject = "A mediation adapter failed to show the ad.";
          break;
        case 6: 
          localObject = "Invalid request: Invalid ad size.";
          break;
        case 5: 
          localObject = "Invalid request: Invalid ad unit ID.";
          break;
        case 4: 
          localObject = "Network error.";
          break;
        case 3: 
          localObject = "App ID missing.";
          break;
        case 2: 
          paramString = "No fill.";
          break;
        }
        localObject = "Invalid request.";
      }
      else
      {
        throw null;
      }
    }
    paramString = (String)localObject;
    if (paramInt != 0)
    {
      int i = 0;
      switch (paramInt - 1)
      {
      default: 
        switch (paramInt)
        {
        default: 
          paramString = "AD_INSPECTOR_ALREADY_OPEN";
        }
        break;
      case 14: 
        i = 11;
        break;
      case 13: 
        i = 10;
        break;
      case 12: 
        localObject = zzbbk.zzhQ;
        if (((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue() <= 0) {
          i = 9;
        }
        break;
      case 7: 
        i = 4;
        break;
      case 4: 
      case 8: 
      case 17: 
        i = 2;
        break;
      case 3: 
        i = 8;
        break;
      case 2: 
      case 10: 
      case 18: 
        i = 3;
        break;
      case 1: 
      case 5: 
      case 6: 
      case 9: 
      case 16: 
        i = 1;
      }
      return new zze(i, paramString, "com.google.android.gms.ads", paramzze, null);
      paramString = "AD_INSPECTOR_NOT_IN_TEST_MODE";
      break label624;
      paramString = "AD_INSPECTOR_FAILED_TO_LOAD";
      break label624;
      paramString = "AD_INSPECTOR_INTERNAL_ERROR";
      break label624;
      paramString = "INVALID_AD_STRING";
      break label624;
      paramString = "REQUEST_ID_MISMATCH";
      break label624;
      paramString = "MEDIATION_NO_FILL";
      break label624;
      paramString = "INTERNAL_SHOW_ERROR";
      break label624;
      paramString = "APP_NOT_FOREGROUND";
      break label624;
      paramString = "AD_REUSED";
      break label624;
      paramString = "NOT_READY";
      break label624;
      paramString = "MEDIATION_SHOW_ERROR";
      break label624;
      paramString = "INVALID_AD_SIZE";
      break label624;
      paramString = "INVALID_AD_UNIT_ID";
      break label624;
      paramString = "NETWORK_ERROR";
      break label624;
      paramString = "APP_ID_MISSING";
      break label624;
      paramString = "NO_FILL";
      break label624;
      paramString = "INVALID_REQUEST";
      break label624;
      paramString = "INTERNAL_ERROR";
      label624:
      throw new AssertionError("Unknown SdkError: ".concat(paramString));
    }
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */