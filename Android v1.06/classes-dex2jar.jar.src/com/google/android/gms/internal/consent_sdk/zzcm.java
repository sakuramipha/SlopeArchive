package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzcm
{
  public String zza;
  public String zzb;
  public String zzc;
  public List zzd = Collections.emptyList();
  public List zze = Collections.emptyList();
  public int zzf = 1;
  public int zzg = 1;
  
  public static zzcm zza(JsonReader paramJsonReader)
    throws IOException
  {
    zzcm localzzcm = new zzcm();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      Object localObject = paramJsonReader.nextName();
      int i = ((String)localObject).hashCode();
      int j = 4;
      int k = 3;
      int n = 0;
      int m = 0;
      switch (i)
      {
      default: 
        break;
      case -790907624: 
        if (((String)localObject).equals("consent_form_payload")) {
          i = 1;
        }
        break;
      case -986806987: 
        if (((String)localObject).equals("request_info_keys")) {
          i = 4;
        }
        break;
      case -1161803523: 
        if (((String)localObject).equals("actions")) {
          i = 5;
        }
        break;
      case -1324537865: 
        if (((String)localObject).equals("privacy_options_required")) {
          i = 6;
        }
        break;
      case -1851537225: 
        if (((String)localObject).equals("consent_form_base_url")) {
          i = 2;
        }
        break;
      case -1938755376: 
        if (((String)localObject).equals("error_message")) {
          i = 3;
        }
        break;
      case -2001388947: 
        if (((String)localObject).equals("consent_signal")) {
          i = 0;
        }
        break;
      }
      i = -1;
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 6: 
        localObject = paramJsonReader.nextString();
        i = ((String)localObject).hashCode();
        if (i != -1888946261)
        {
          if (i != 389487519)
          {
            if ((i == 433141802) && (((String)localObject).equals("UNKNOWN")))
            {
              i = m;
              break label352;
            }
          }
          else if (((String)localObject).equals("REQUIRED"))
          {
            i = 1;
            break label352;
          }
        }
        else if (((String)localObject).equals("NOT_REQUIRED"))
        {
          i = 2;
          break label352;
        }
        i = -1;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i == 2) {
              i = k;
            } else {
              throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(String.valueOf(localObject)));
            }
          }
          else {
            i = 2;
          }
        }
        else {
          i = 1;
        }
        localzzcm.zzg = i;
        break;
      case 5: 
        localzzcm.zze = new ArrayList();
        paramJsonReader.beginArray();
        while (paramJsonReader.hasNext())
        {
          localObject = new zzcl();
          paramJsonReader.beginObject();
          while (paramJsonReader.hasNext())
          {
            String str = paramJsonReader.nextName();
            i = str.hashCode();
            if (i != -2105551094)
            {
              if ((i == 1583758243) && (str.equals("action_type")))
              {
                i = 0;
                break label507;
              }
            }
            else if (str.equals("args_json"))
            {
              i = 1;
              break label507;
            }
            i = -1;
            if (i != 0)
            {
              if (i != 1) {
                paramJsonReader.skipValue();
              } else {
                ((zzcl)localObject).zza = paramJsonReader.nextString();
              }
            }
            else
            {
              str = paramJsonReader.nextString();
              i = str.hashCode();
              if (i != 64208429)
              {
                if (i != 82862015)
                {
                  if ((i == 1856333582) && (str.equals("UNKNOWN_ACTION_TYPE")))
                  {
                    i = 0;
                    break label615;
                  }
                }
                else if (str.equals("WRITE"))
                {
                  i = 1;
                  break label615;
                }
              }
              else if (str.equals("CLEAR"))
              {
                i = 2;
                break label615;
              }
              i = -1;
              if (i != 0)
              {
                if (i != 1)
                {
                  if (i == 2) {
                    i = 3;
                  } else {
                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(String.valueOf(str)));
                  }
                }
                else {
                  i = 2;
                }
              }
              else {
                i = 1;
              }
              ((zzcl)localObject).zzb = i;
            }
          }
          paramJsonReader.endObject();
          localzzcm.zze.add(localObject);
        }
        paramJsonReader.endArray();
        break;
      case 4: 
        localzzcm.zzd = new ArrayList();
        paramJsonReader.beginArray();
        while (paramJsonReader.hasNext())
        {
          localObject = paramJsonReader.nextString();
          localzzcm.zzd.add(localObject);
        }
        paramJsonReader.endArray();
        break;
      case 3: 
        localzzcm.zzc = paramJsonReader.nextString();
        break;
      case 2: 
        localzzcm.zzb = paramJsonReader.nextString();
        break;
      case 1: 
        localzzcm.zza = paramJsonReader.nextString();
        break;
      case 0: 
        label352:
        label507:
        label615:
        localObject = paramJsonReader.nextString();
        switch (((String)localObject).hashCode())
        {
        default: 
          break;
        case 1725474845: 
          if (((String)localObject).equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
            i = 5;
          }
          break;
        case 467888915: 
          if (((String)localObject).equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
            i = 1;
          }
          break;
        case 429411856: 
          if (((String)localObject).equals("CONSENT_SIGNAL_SUFFICIENT")) {
            i = 3;
          }
          break;
        case -918677260: 
          if (((String)localObject).equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
            i = 7;
          }
          break;
        case -954325659: 
          if (((String)localObject).equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
            i = 2;
          }
          break;
        case -1263695752: 
          if (((String)localObject).equals("CONSENT_SIGNAL_UNKNOWN")) {
            i = n;
          }
          break;
        case -1969035850: 
          if (((String)localObject).equals("CONSENT_SIGNAL_ERROR")) {
            i = 6;
          }
          break;
        case -2058725357: 
          if (((String)localObject).equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
            i = 4;
          }
          break;
        }
        i = -1;
        switch (i)
        {
        default: 
          throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(String.valueOf(localObject)));
        case 7: 
          j = 8;
          break;
        case 6: 
          j = 7;
          break;
        case 5: 
          j = 6;
          break;
        case 4: 
          j = 5;
          break;
        case 2: 
          j = 3;
          break;
        case 1: 
          j = 2;
          break;
        case 0: 
          j = 1;
        }
        localzzcm.zzf = j;
      }
    }
    paramJsonReader.endObject();
    return localzzcm;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */