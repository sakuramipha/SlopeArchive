package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzdqj;
import com.google.android.gms.internal.ads.zzfaa;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.Map;

public final class zzf
{
  public static String zza(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "unspecified";
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1743582870: 
      if (paramString.equals("requester_type_8")) {
        i = 8;
      }
      break;
    case 1743582869: 
      if (paramString.equals("requester_type_7")) {
        i = 7;
      }
      break;
    case 1743582868: 
      if (paramString.equals("requester_type_6")) {
        i = 6;
      }
      break;
    case 1743582867: 
      if (paramString.equals("requester_type_5")) {
        i = 5;
      }
      break;
    case 1743582866: 
      if (paramString.equals("requester_type_4")) {
        i = 4;
      }
      break;
    case 1743582865: 
      if (paramString.equals("requester_type_3")) {
        i = 3;
      }
      break;
    case 1743582864: 
      if (paramString.equals("requester_type_2")) {
        i = 2;
      }
      break;
    case 1743582863: 
      if (paramString.equals("requester_type_1")) {
        i = 1;
      }
      break;
    case 1743582862: 
      if (paramString.equals("requester_type_0")) {
        i = 0;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      return paramString;
    case 8: 
      return "8";
    case 7: 
      return "7";
    case 6: 
      return "6";
    case 5: 
      return "5";
    case 4: 
      return "4";
    case 3: 
      return "3";
    case 2: 
      return "2";
    case 1: 
      return "1";
    }
    return "0";
  }
  
  public static String zzb(zzl paramzzl)
  {
    paramzzl = paramzzl.zzc;
    if (paramzzl == null) {
      return "unspecified";
    }
    return paramzzl.getString("query_info_type");
  }
  
  public static void zzc(zzdqh paramzzdqh, zzdpx paramzzdpx, String paramString, Pair... paramVarArgs)
  {
    zzbbc localzzbbc = zzbbk.zzgL;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      return;
    }
    zzcag.zza.execute(new zze(paramzzdqh, paramzzdpx, paramString, paramVarArgs));
  }
  
  static void zzd(zzdqh paramzzdqh, zzdpx paramzzdpx, String paramString, Pair... paramVarArgs)
  {
    if (paramzzdpx == null) {
      paramzzdpx = paramzzdqh.zzc();
    } else {
      paramzzdpx = paramzzdpx.zza();
    }
    zzf(paramzzdpx, "action", paramString);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
    {
      paramString = paramVarArgs[i];
      zzf(paramzzdpx, (String)paramString.first, (String)paramString.second);
    }
    paramzzdqh.zze(paramzzdpx);
  }
  
  public static int zze(zzfaa paramzzfaa)
  {
    if (paramzzfaa.zzq) {
      return 2;
    }
    paramzzfaa = paramzzfaa.zzd;
    zzc localzzc = paramzzfaa.zzs;
    if ((localzzc == null) && (paramzzfaa.zzx == null)) {
      return 1;
    }
    if ((localzzc != null) && (paramzzfaa.zzx != null)) {
      return 5;
    }
    if (localzzc != null) {
      return 3;
    }
    return 4;
  }
  
  private static void zzf(Map paramMap, String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      paramMap.put(paramString1, paramString2);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */