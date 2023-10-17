package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

public final class zzezi
{
  public final List zza;
  public final String zzb;
  public final int zzc;
  public final String zzd;
  public final int zze;
  public final long zzf;
  public final boolean zzg;
  public final String zzh;
  public final zzezh zzi;
  public final Bundle zzj;
  public final String zzk;
  public final String zzl;
  public final String zzm;
  
  zzezi(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException, NumberFormatException
  {
    List localList = Collections.emptyList();
    Object localObject7 = new Bundle();
    paramJsonReader.beginObject();
    int j = 0;
    Object localObject4 = "";
    Object localObject3 = "";
    Object localObject2 = localObject3;
    Object localObject8 = localObject2;
    Object localObject1 = null;
    long l = 0L;
    boolean bool = false;
    Object localObject6 = localObject8;
    Object localObject5 = localObject6;
    int i = 0;
    Object localObject9;
    Object localObject12;
    Object localObject14;
    Object localObject13;
    if (paramJsonReader.hasNext())
    {
      localObject9 = paramJsonReader.nextName();
      if ("nofill_urls".equals(localObject9)) {
        localList = zzbu.zzd(paramJsonReader);
      }
      for (;;)
      {
        break label644;
        if ("refresh_interval".equals(localObject9))
        {
          j = paramJsonReader.nextInt();
        }
        else if ("gws_query_id".equals(localObject9))
        {
          localObject6 = paramJsonReader.nextString();
        }
        else if ("analytics_query_ad_event_id".equals(localObject9))
        {
          localObject5 = paramJsonReader.nextString();
        }
        else if ("is_idless".equals(localObject9))
        {
          bool = paramJsonReader.nextBoolean();
        }
        else if ("response_code".equals(localObject9))
        {
          i = paramJsonReader.nextInt();
        }
        else if ("latency".equals(localObject9))
        {
          l = paramJsonReader.nextLong();
        }
        else
        {
          localObject12 = zzbbk.zzhO;
          if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject12)).booleanValue()) && ("public_error".equals(localObject9)) && (paramJsonReader.peek() == JsonToken.BEGIN_OBJECT))
          {
            localObject12 = new zzezh(paramJsonReader);
            localObject14 = localObject4;
            localObject13 = localObject3;
            localObject9 = localObject8;
          }
          else
          {
            if (!"bidding_data".equals(localObject9)) {
              break label317;
            }
            localObject14 = paramJsonReader.nextString();
            localObject9 = localObject8;
            localObject12 = localObject1;
            localObject13 = localObject3;
          }
        }
      }
    }
    for (;;)
    {
      localObject4 = localObject14;
      localObject3 = localObject13;
      localObject1 = localObject12;
      localObject8 = localObject9;
      label317:
      if ("adapter_response_replacement_key".equals(localObject9))
      {
        localObject9 = paramJsonReader.nextString();
        localObject14 = localObject4;
        localObject13 = localObject3;
        localObject12 = localObject1;
      }
      else
      {
        if ("response_info_extras".equals(localObject9))
        {
          localObject9 = zzbbk.zzgB;
          if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject9)).booleanValue()) {}
        }
        try
        {
          Bundle localBundle = zzbu.zza(zzbu.zzh(paramJsonReader));
          localObject14 = localObject4;
          localObject13 = localObject3;
          localObject12 = localObject1;
          localObject9 = localObject8;
          if (localBundle != null)
          {
            localObject7 = localBundle;
            localObject14 = localObject4;
            localObject13 = localObject3;
            localObject12 = localObject1;
            localObject9 = localObject8;
          }
        }
        catch (IllegalStateException localIllegalStateException)
        {
          paramJsonReader.skipValue();
          localObject14 = localObject4;
          localObject13 = localObject3;
          localObject12 = localObject1;
          Object localObject10 = localObject8;
          continue;
          paramJsonReader.skipValue();
          localObject14 = localObject4;
          localObject13 = localObject3;
          localObject12 = localObject1;
          localObject10 = localObject8;
          continue;
          if ("adRequestPostBody".equals(localObject10))
          {
            localObject10 = zzbbk.zziK;
            if (((Boolean)zzba.zzc().zzb((zzbbc)localObject10)).booleanValue())
            {
              localObject2 = paramJsonReader.nextString();
            }
            else
            {
              paramJsonReader.skipValue();
              localObject14 = localObject4;
              localObject13 = localObject3;
              localObject12 = localObject1;
              localObject10 = localObject8;
            }
          }
          else
          {
            if ("adRequestUrl".equals(localObject10))
            {
              localObject10 = zzbbk.zziK;
              if (((Boolean)zzba.zzc().zzb((zzbbc)localObject10)).booleanValue())
              {
                localObject13 = paramJsonReader.nextString();
                localObject14 = localObject4;
                localObject12 = localObject1;
                localObject10 = localObject8;
                continue;
              }
              paramJsonReader.skipValue();
              localObject14 = localObject4;
              localObject13 = localObject3;
              localObject12 = localObject1;
              localObject10 = localObject8;
              continue;
            }
            paramJsonReader.skipValue();
            localObject14 = localObject4;
            localObject13 = localObject3;
            localObject12 = localObject1;
            localObject10 = localObject8;
            continue;
          }
          break;
          paramJsonReader.endObject();
          this.zza = localList;
          this.zzc = j;
          this.zzb = ((String)localObject6);
          this.zzd = ((String)localObject5);
          this.zze = i;
          this.zzf = l;
          this.zzi = ((zzezh)localObject1);
          this.zzg = bool;
          this.zzh = ((String)localObject4);
          this.zzj = ((Bundle)localObject7);
          this.zzk = ((String)localObject3);
          this.zzl = ((String)localObject2);
          this.zzm = ((String)localObject8);
          return;
        }
        catch (JSONException|IOException localJSONException)
        {
          label644:
          localObject14 = localObject4;
          localObject13 = localObject3;
          localObject12 = localObject1;
          Object localObject11 = localObject8;
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */