package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

public final class zzcdb
  implements zzbii
{
  private boolean zza;
  
  private static int zzb(Context paramContext, Map paramMap, String paramString, int paramInt)
  {
    paramMap = (String)paramMap.get(paramString);
    int i = paramInt;
    if (paramMap != null) {
      try
      {
        zzay.zzb();
        i = zzbzm.zzx(paramContext, Integer.parseInt(paramMap));
      }
      catch (NumberFormatException paramContext)
      {
        paramContext = new StringBuilder();
        paramContext.append("Could not parse ");
        paramContext.append(paramString);
        paramContext.append(" in a video GMSG: ");
        paramContext.append(paramMap);
        zzbzt.zzj(paramContext.toString());
        i = paramInt;
      }
    }
    if (zze.zzc())
    {
      paramContext = new StringBuilder();
      paramContext.append("Parse pixels for ");
      paramContext.append(paramString);
      paramContext.append(", got string ");
      paramContext.append(paramMap);
      paramContext.append(", int ");
      paramContext.append(i);
      paramContext.append(".");
      zze.zza(paramContext.toString());
    }
    return i;
  }
  
  private static void zzc(zzcbq paramzzcbq, Map paramMap)
  {
    String str2 = (String)paramMap.get("minBufferMs");
    String str1 = (String)paramMap.get("maxBufferMs");
    String str3 = (String)paramMap.get("bufferForPlaybackMs");
    String str4 = (String)paramMap.get("bufferForPlaybackAfterRebufferMs");
    paramMap = (String)paramMap.get("socketReceiveBufferSize");
    if (str2 != null) {}
    try
    {
      paramzzcbq.zzB(Integer.parseInt(str2));
      if (str1 != null) {
        paramzzcbq.zzA(Integer.parseInt(str1));
      }
      if (str3 != null) {
        paramzzcbq.zzy(Integer.parseInt(str3));
      }
      if (str4 != null) {
        paramzzcbq.zzz(Integer.parseInt(str4));
      }
      if (paramMap != null)
      {
        paramzzcbq.zzD(Integer.parseInt(paramMap));
        return;
      }
    }
    catch (NumberFormatException paramzzcbq)
    {
      zzbzt.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[] { str2, str1 }));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */