package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzezf
{
  public final String zzA;
  public final zzbwr zzB;
  public final String zzC;
  public final JSONObject zzD;
  public final JSONObject zzE;
  public final String zzF;
  public final String zzG;
  public final String zzH;
  public final String zzI;
  public final String zzJ;
  public final boolean zzK;
  public final boolean zzL;
  public final boolean zzM;
  public final boolean zzN;
  public final boolean zzO;
  public final boolean zzP;
  public final boolean zzQ;
  public final int zzR;
  public final int zzS;
  public final boolean zzT;
  public final boolean zzU;
  public final String zzV;
  public final zzfad zzW;
  public final boolean zzX;
  public final boolean zzY;
  public final int zzZ;
  public final List zza;
  public final String zzaa;
  public final int zzab;
  public final String zzac;
  public final boolean zzad;
  public final zzbsb zzae;
  public final zzs zzaf;
  public final String zzag;
  public final boolean zzah;
  public final JSONObject zzai;
  public final boolean zzaj;
  public final JSONObject zzak;
  public final boolean zzal;
  public final String zzam;
  public final boolean zzan;
  public final String zzao;
  public final String zzap;
  public final String zzaq;
  public final int zzb;
  public final List zzc;
  public final List zzd;
  public final List zze;
  public final int zzf;
  public final List zzg;
  public final List zzh;
  public final List zzi;
  public final List zzj;
  public final String zzk;
  public final String zzl;
  public final zzbvi zzm;
  public final List zzn;
  public final List zzo;
  public final List zzp;
  public final List zzq;
  public final int zzr;
  public final List zzs;
  public final zzezk zzt;
  public final List zzu;
  public final List zzv;
  public final JSONObject zzw;
  public final String zzx;
  public final String zzy;
  public final String zzz;
  
  zzezf(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException, NumberFormatException
  {
    List localList14 = Collections.emptyList();
    List localList13 = Collections.emptyList();
    List localList12 = Collections.emptyList();
    List localList11 = Collections.emptyList();
    List localList10 = Collections.emptyList();
    List localList9 = Collections.emptyList();
    List localList8 = Collections.emptyList();
    List localList7 = Collections.emptyList();
    List localList6 = Collections.emptyList();
    List localList1 = Collections.emptyList();
    List localList2 = Collections.emptyList();
    List localList3 = Collections.emptyList();
    List localList4 = Collections.emptyList();
    List localList5 = Collections.emptyList();
    JSONObject localJSONObject6 = new JSONObject();
    JSONObject localJSONObject5 = new JSONObject();
    JSONObject localJSONObject4 = new JSONObject();
    JSONObject localJSONObject3 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    JSONObject localJSONObject1 = new JSONObject();
    Object localObject4 = zzfrr.zzl();
    paramJsonReader.beginObject();
    zzezk localzzezk = null;
    zzbwr localzzbwr = null;
    Object localObject3 = localzzbwr;
    Object localObject2 = localObject3;
    Object localObject1 = localObject2;
    String str17 = "";
    String str16 = "";
    String str15 = str16;
    String str14 = str15;
    String str13 = str14;
    String str12 = str13;
    String str11 = str12;
    String str10 = str11;
    String str9 = str10;
    String str8 = str9;
    String str7 = str8;
    String str6 = str7;
    String str5 = str6;
    String str4 = str5;
    String str3 = str4;
    String str2 = str3;
    String str1 = str2;
    int i1 = 0;
    boolean bool16 = false;
    boolean bool15 = false;
    boolean bool14 = false;
    boolean bool13 = false;
    boolean bool12 = false;
    boolean bool11 = false;
    boolean bool10 = false;
    int n = -1;
    int m = 0;
    boolean bool9 = false;
    boolean bool8 = false;
    boolean bool7 = false;
    int k = 0;
    int j = -1;
    boolean bool6 = false;
    boolean bool5 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    Object localObject5 = localObject1;
    String str19 = str1;
    String str18 = str19;
    int i3 = 0;
    int i2 = 0;
    while (paramJsonReader.hasNext())
    {
      String str20 = paramJsonReader.nextName();
      if (str20 == null) {
        str20 = "";
      }
      switch (str20.hashCode())
      {
      default: 
        break;
      case 2072888499: 
        if (str20.equals("manual_tracking_urls")) {
          i = 15;
        }
        break;
      case 2068142375: 
        if (str20.equals("rule_line_external_id")) {
          i = 52;
        }
        break;
      case 1875425491: 
        if (str20.equals("is_analytics_logging_enabled")) {
          i = 42;
        }
        break;
      case 1839650832: 
        if (str20.equals("renderers")) {
          i = 0;
        }
        break;
      case 1799285870: 
        if (str20.equals("use_third_party_container_height")) {
          i = 48;
        }
        break;
      case 1688341040: 
        if (str20.equals("video_reward_urls")) {
          i = 7;
        }
        break;
      case 1686319423: 
        if (str20.equals("ad_network_class_name")) {
          i = 55;
        }
        break;
      case 1638957285: 
        if (str20.equals("video_start_urls")) {
          i = 6;
        }
        break;
      case 1637553475: 
        if (str20.equals("bid_response")) {
          i = 40;
        }
        break;
      case 1437255331: 
        if (str20.equals("ad_source_id")) {
          i = 58;
        }
        break;
      case 1321720943: 
        if (str20.equals("allow_pub_owned_ad_view")) {
          i = 31;
        }
        break;
      case 1186014765: 
        if (str20.equals("cache_hit_urls")) {
          i = 66;
        }
        break;
      case 1141602460: 
        if (str20.equals("adapter_response_info_key")) {
          i = 56;
        }
        break;
      case 1100650276: 
        if (str20.equals("rewards")) {
          i = 11;
        }
        break;
      case 1010584092: 
        if (str20.equals("transaction_id")) {
          i = 9;
        }
        break;
      case 791122864: 
        if (str20.equals("impression_type")) {
          i = 5;
        }
        break;
      case 754887508: 
        if (str20.equals("container_sizes")) {
          i = 17;
        }
        break;
      case 597473788: 
        if (str20.equals("debug_dialog_string")) {
          i = 27;
        }
        break;
      case 549176928: 
        if (str20.equals("presentation_error_timeout_ms")) {
          i = 16;
        }
        break;
      case 418392395: 
        if (str20.equals("is_closable_area_disabled")) {
          i = 36;
        }
        break;
      case 230323073: 
        if (str20.equals("ad_load_urls")) {
          i = 4;
        }
        break;
      case 107433883: 
        if (str20.equals("qdata")) {
          i = 24;
        }
        break;
      case 63195984: 
        if (str20.equals("render_test_label")) {
          i = 33;
        }
        break;
      case 37109963: 
        if (str20.equals("request_id")) {
          i = 68;
        }
        break;
      case 3076010: 
        if (str20.equals("data")) {
          i = 22;
        }
        break;
      case 3355: 
        if (str20.equals("id")) {
          i = 23;
        }
        break;
      case 3107: 
        if (str20.equals("ad")) {
          i = 18;
        }
        break;
      case -29338502: 
        if (str20.equals("allow_custom_click_gesture")) {
          i = 32;
        }
        break;
      case -154616268: 
        if (str20.equals("is_offline_ad")) {
          i = 61;
        }
        break;
      case -180214626: 
        if (str20.equals("native_required_asset_viewability")) {
          i = 63;
        }
        break;
      case -213424028: 
        if (str20.equals("watermark")) {
          i = 46;
        }
        break;
      case -213449460: 
        if (str20.equals("force_disable_hardware_acceleration")) {
          i = 65;
        }
        break;
      case -369773488: 
        if (str20.equals("is_close_button_enabled")) {
          i = 50;
        }
        break;
      case -388807511: 
        if (str20.equals("content_url")) {
          i = 64;
        }
        break;
      case -397704715: 
        if (str20.equals("ad_close_time_ms")) {
          i = 45;
        }
        break;
      case -404326515: 
        if (str20.equals("render_timeout_ms")) {
          i = 38;
        }
        break;
      case -404433734: 
        if (str20.equals("rtb_native_required_assets")) {
          i = 62;
        }
        break;
      case -437057161: 
        if (str20.equals("imp_urls")) {
          i = 3;
        }
        break;
      case -544216775: 
        if (str20.equals("safe_browsing")) {
          i = 26;
        }
        break;
      case -776859333: 
        if (str20.equals("click_urls")) {
          i = 2;
        }
        break;
      case -972056451: 
        if (str20.equals("ad_source_instance_id")) {
          i = 60;
        }
        break;
      case -982608540: 
        if (str20.equals("valid_from_timestamp")) {
          i = 10;
        }
        break;
      case -1051269058: 
        if (str20.equals("active_view")) {
          i = 25;
        }
        break;
      case -1078050970: 
        if (str20.equals("video_complete_urls")) {
          i = 8;
        }
        break;
      case -1081936678: 
        if (str20.equals("allocation_id")) {
          i = 21;
        }
        break;
      case -1115838944: 
        if (str20.equals("fill_urls")) {
          i = 12;
        }
        break;
      case -1146534047: 
        if (str20.equals("is_scroll_aware")) {
          i = 43;
        }
        break;
      case -1152230954: 
        if (str20.equals("ad_type")) {
          i = 1;
        }
        break;
      case -1168140544: 
        if (str20.equals("presentation_error_urls")) {
          i = 14;
        }
        break;
      case -1234181075: 
        if (str20.equals("allow_pub_rendered_attribution")) {
          i = 30;
        }
        break;
      case -1240082064: 
        if (str20.equals("ad_event_value")) {
          i = 51;
        }
        break;
      case -1289032093: 
        if (str20.equals("extras")) {
          i = 29;
        }
        break;
      case -1303332046: 
        if (str20.equals("test_mode_enabled")) {
          i = 34;
        }
        break;
      case -1306015996: 
        if (str20.equals("adapters")) {
          i = 20;
        }
        break;
      case -1360811658: 
        if (str20.equals("ad_sizes")) {
          i = 19;
        }
        break;
      case -1375413093: 
        if (str20.equals("ad_cover")) {
          i = 54;
        }
        break;
      case -1403779768: 
        if (str20.equals("showable_impression_type")) {
          i = 44;
        }
        break;
      case -1406227629: 
        if (str20.equals("buffer_click_url_as_ready_to_ping")) {
          i = 67;
        }
        break;
      case -1428969291: 
        if (str20.equals("enable_omid")) {
          i = 39;
        }
        break;
      case -1439500848: 
        if (str20.equals("orientation")) {
          i = 37;
        }
        break;
      case -1440104884: 
        if (str20.equals("is_custom_close_blocked")) {
          i = 35;
        }
        break;
      case -1550155393: 
        if (str20.equals("nofill_urls")) {
          i = 13;
        }
        break;
      case -1620470467: 
        if (str20.equals("backend_query_id")) {
          i = 47;
        }
        break;
      case -1662989631: 
        if (str20.equals("is_interscroller")) {
          i = 53;
        }
        break;
      case -1776946669: 
        if (str20.equals("ad_source_name")) {
          i = 57;
        }
        break;
      case -1812055556: 
        if (str20.equals("play_prewarm_options")) {
          i = 49;
        }
        break;
      case -1871425831: 
        if (str20.equals("recursive_server_response_data")) {
          i = 69;
        }
        break;
      case -1965512151: 
        if (str20.equals("omid_settings")) {
          i = 41;
        }
        break;
      case -1980587809: 
        if (str20.equals("debug_signals")) {
          i = 28;
        }
        break;
      case -2138196627: 
        if (str20.equals("ad_source_instance_name")) {
          i = 59;
        }
        break;
      }
      int i = -1;
      switch (i)
      {
      default: 
        paramJsonReader.skipValue();
        break;
      case 69: 
        str2 = paramJsonReader.nextString();
        break;
      case 68: 
        str3 = paramJsonReader.nextString();
        break;
      case 67: 
        bool1 = paramJsonReader.nextBoolean();
        break;
      case 66: 
        localObject4 = zzbu.zzd(paramJsonReader);
        break;
      case 65: 
        bool2 = paramJsonReader.nextBoolean();
        break;
      case 64: 
        localObject1 = paramJsonReader.nextString();
        break;
      case 63: 
        bool3 = paramJsonReader.nextBoolean();
        break;
      case 62: 
        localJSONObject1 = zzbu.zzh(paramJsonReader);
        break;
      case 61: 
        bool4 = paramJsonReader.nextBoolean();
        break;
      case 60: 
        if (((Boolean)zzbbk.zzgz.zzl()).booleanValue()) {
          str4 = paramJsonReader.nextString();
        } else {
          paramJsonReader.skipValue();
        }
        break;
      case 59: 
        if (((Boolean)zzbbk.zzgz.zzl()).booleanValue()) {
          str5 = paramJsonReader.nextString();
        } else {
          paramJsonReader.skipValue();
        }
        break;
      case 58: 
        if (((Boolean)zzbbk.zzgz.zzl()).booleanValue()) {
          str6 = paramJsonReader.nextString();
        } else {
          paramJsonReader.skipValue();
        }
        break;
      case 57: 
        if (((Boolean)zzbbk.zzgz.zzl()).booleanValue()) {
          str7 = paramJsonReader.nextString();
        } else {
          paramJsonReader.skipValue();
        }
        break;
      case 56: 
        str1 = paramJsonReader.nextString();
        break;
      case 55: 
        str8 = paramJsonReader.nextString();
        break;
      case 54: 
        localJSONObject2 = zzbu.zzh(paramJsonReader);
        break;
      case 53: 
        bool5 = paramJsonReader.nextBoolean();
        break;
      case 52: 
        str9 = paramJsonReader.nextString();
        break;
      case 51: 
        localObject2 = zzs.zza(zzbu.zzh(paramJsonReader));
        break;
      case 50: 
        paramJsonReader.nextBoolean();
        break;
      case 49: 
        localObject3 = zzbsb.zza(zzbu.zzh(paramJsonReader));
        break;
      case 48: 
        bool6 = paramJsonReader.nextBoolean();
        break;
      case 47: 
        str10 = paramJsonReader.nextString();
        break;
      case 46: 
        str11 = paramJsonReader.nextString();
        break;
      case 45: 
        j = paramJsonReader.nextInt();
        break;
      case 44: 
        k = paramJsonReader.nextInt();
        break;
      case 43: 
        bool7 = paramJsonReader.nextBoolean();
        break;
      case 42: 
        bool8 = paramJsonReader.nextBoolean();
        break;
      case 41: 
        localJSONObject3 = zzbu.zzh(paramJsonReader);
        break;
      case 40: 
        str12 = paramJsonReader.nextString();
        break;
      case 39: 
        bool9 = paramJsonReader.nextBoolean();
        break;
      case 38: 
        m = paramJsonReader.nextInt();
        break;
      case 37: 
        n = zzd(paramJsonReader.nextString());
        break;
      case 36: 
        bool10 = paramJsonReader.nextBoolean();
        break;
      case 35: 
        bool11 = paramJsonReader.nextBoolean();
        break;
      case 34: 
        bool12 = paramJsonReader.nextBoolean();
        break;
      case 33: 
        bool13 = paramJsonReader.nextBoolean();
        break;
      case 32: 
        bool14 = paramJsonReader.nextBoolean();
        break;
      case 31: 
        bool15 = paramJsonReader.nextBoolean();
        break;
      case 30: 
        bool16 = paramJsonReader.nextBoolean();
        break;
      case 29: 
        localJSONObject4 = zzbu.zzh(paramJsonReader);
        break;
      case 28: 
        localJSONObject5 = zzbu.zzh(paramJsonReader);
        break;
      case 27: 
        str13 = paramJsonReader.nextString();
        break;
      case 26: 
        localzzbwr = zzbwr.zza(zzbu.zzh(paramJsonReader));
        break;
      case 25: 
        str14 = zzbu.zzh(paramJsonReader).toString();
        break;
      case 24: 
        str15 = paramJsonReader.nextString();
        break;
      case 23: 
        str16 = paramJsonReader.nextString();
        break;
      case 22: 
        localJSONObject6 = zzbu.zzh(paramJsonReader);
        break;
      case 21: 
        str17 = paramJsonReader.nextString();
        break;
      case 20: 
        localList4 = zzbu.zzd(paramJsonReader);
        break;
      case 19: 
        localList5 = zzezg.zza(paramJsonReader);
        break;
      case 18: 
        localzzezk = new zzezk(paramJsonReader);
        break;
      case 17: 
        localList3 = zzezg.zza(paramJsonReader);
        break;
      case 16: 
        i1 = paramJsonReader.nextInt();
        break;
      case 15: 
        localList2 = zzbu.zzd(paramJsonReader);
        break;
      case 14: 
        localList1 = zzbu.zzd(paramJsonReader);
        break;
      case 13: 
        localList6 = zzbu.zzd(paramJsonReader);
        break;
      case 12: 
        localList7 = zzbu.zzd(paramJsonReader);
        break;
      case 11: 
        localObject5 = zzbvi.zza(zzbu.zze(paramJsonReader));
        break;
      case 10: 
        str19 = paramJsonReader.nextString();
        break;
      case 9: 
        str18 = paramJsonReader.nextString();
        break;
      case 8: 
        localList8 = zzbu.zzd(paramJsonReader);
        break;
      case 7: 
        localList9 = zzbu.zzd(paramJsonReader);
        break;
      case 6: 
        localList10 = zzbu.zzd(paramJsonReader);
        break;
      case 5: 
        i2 = zzc(paramJsonReader.nextInt());
        break;
      case 4: 
        localList11 = zzbu.zzd(paramJsonReader);
        break;
      case 3: 
        localList12 = zzbu.zzd(paramJsonReader);
        break;
      case 2: 
        localList13 = zzbu.zzd(paramJsonReader);
        break;
      case 1: 
        i3 = zzb(paramJsonReader.nextString());
        break;
      case 0: 
        localList14 = zzbu.zzd(paramJsonReader);
      }
    }
    paramJsonReader.endObject();
    this.zza = localList14;
    this.zzb = i3;
    this.zzc = localList13;
    this.zzd = localList12;
    this.zzg = localList11;
    this.zzf = i2;
    this.zzh = localList10;
    this.zzi = localList9;
    this.zzj = localList8;
    this.zzk = str18;
    this.zzl = str19;
    this.zzm = ((zzbvi)localObject5);
    this.zzn = localList7;
    this.zzo = localList6;
    this.zzp = localList1;
    this.zzq = localList2;
    this.zzr = i1;
    this.zzs = localList3;
    this.zzt = localzzezk;
    this.zzu = localList4;
    this.zzv = localList5;
    this.zzx = str17;
    this.zzw = localJSONObject6;
    this.zzy = str16;
    this.zzz = str15;
    this.zzA = str14;
    this.zzB = localzzbwr;
    this.zzC = str13;
    this.zzD = localJSONObject5;
    this.zzE = localJSONObject4;
    this.zzK = bool16;
    this.zzL = bool15;
    this.zzM = bool14;
    this.zzN = bool13;
    this.zzO = bool12;
    this.zzP = bool11;
    this.zzQ = bool10;
    this.zzR = n;
    this.zzS = m;
    this.zzU = bool9;
    this.zzV = str12;
    this.zzW = new zzfad(localJSONObject3);
    this.zzX = bool8;
    this.zzY = bool7;
    this.zzZ = k;
    this.zzaa = str11;
    this.zzab = j;
    this.zzac = str10;
    this.zzad = bool6;
    this.zzae = ((zzbsb)localObject3);
    this.zzaf = ((zzs)localObject2);
    this.zzag = str9;
    this.zzah = bool5;
    this.zzai = localJSONObject2;
    this.zzF = str8;
    this.zzG = str7;
    this.zzH = str6;
    this.zzI = str5;
    this.zzJ = str4;
    this.zzaj = bool4;
    this.zzak = localJSONObject1;
    this.zzal = bool3;
    this.zzam = ((String)localObject1);
    this.zzan = bool2;
    this.zze = ((List)localObject4);
    this.zzT = bool1;
    this.zzao = str3;
    this.zzap = str2;
    this.zzaq = str1;
  }
  
  public static String zza(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 7: 
      return "REWARDED_INTERSTITIAL";
    case 6: 
      return "APP_OPEN_AD";
    case 5: 
      return "REWARDED";
    case 4: 
      return "NATIVE";
    case 3: 
      return "NATIVE_EXPRESS";
    case 2: 
      return "INTERSTITIAL";
    }
    return "BANNER";
  }
  
  private static int zzb(String paramString)
  {
    if ("banner".equals(paramString)) {
      return 1;
    }
    if ("interstitial".equals(paramString)) {
      return 2;
    }
    if ("native_express".equals(paramString)) {
      return 3;
    }
    if ("native".equals(paramString)) {
      return 4;
    }
    if ("rewarded".equals(paramString)) {
      return 5;
    }
    if ("app_open_ad".equals(paramString)) {
      return 6;
    }
    if ("rewarded_interstitial".equals(paramString)) {
      return 7;
    }
    return 0;
  }
  
  private static int zzc(int paramInt)
  {
    int i = paramInt;
    if (paramInt != 0) {
      if (paramInt == 1) {
        i = paramInt;
      } else {
        i = 0;
      }
    }
    return i;
  }
  
  private static final int zzd(String paramString)
  {
    if ("landscape".equalsIgnoreCase(paramString)) {
      return 6;
    }
    if ("portrait".equalsIgnoreCase(paramString)) {
      return 7;
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */