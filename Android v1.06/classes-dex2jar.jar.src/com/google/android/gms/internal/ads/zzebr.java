package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzebr
  implements zzebs
{
  private static zzfgt zzf(String paramString)
  {
    int i = paramString.hashCode();
    if (i != -382745961)
    {
      if (i != 112202875)
      {
        if ((i == 714893483) && (paramString.equals("nativeDisplay")))
        {
          i = 1;
          break label70;
        }
      }
      else if (paramString.equals("video"))
      {
        i = 2;
        break label70;
      }
    }
    else if (paramString.equals("htmlDisplay"))
    {
      i = 0;
      break label70;
    }
    i = -1;
    label70:
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return null;
        }
        return zzfgt.zzd;
      }
      return zzfgt.zzc;
    }
    return zzfgt.zzb;
  }
  
  private static zzfgv zzg(String paramString)
  {
    int i = paramString.hashCode();
    if (i != -1104128070)
    {
      if (i != 1318088141)
      {
        if ((i == 1988248512) && (paramString.equals("onePixel")))
        {
          i = 2;
          break label70;
        }
      }
      else if (paramString.equals("definedByJavascript"))
      {
        i = 1;
        break label70;
      }
    }
    else if (paramString.equals("beginToRender"))
    {
      i = 0;
      break label70;
    }
    i = -1;
    label70:
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return zzfgv.zzb;
        }
        return zzfgv.zze;
      }
      return zzfgv.zza;
    }
    return zzfgv.zzd;
  }
  
  private static zzfgw zzh(String paramString)
  {
    if ("native".equals(paramString)) {
      return zzfgw.zza;
    }
    if ("javascript".equals(paramString)) {
      return zzfgw.zzb;
    }
    return zzfgw.zzc;
  }
  
  public final zzfgo zza(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, zzebu paramzzebu, zzebt paramzzebt, String paramString5)
  {
    paramString2 = zzbbk.zzeK;
    boolean bool = ((Boolean)zzba.zzc().zzb(paramString2)).booleanValue();
    paramString3 = null;
    paramString2 = paramString3;
    if (bool) {
      if (!zzfgm.zzb())
      {
        paramString2 = paramString3;
      }
      else
      {
        zzfgx localzzfgx = zzfgx.zza("Google", paramString1);
        paramString2 = zzh("javascript");
        paramString1 = zzf(paramzzebt.toString());
        if (paramString2 == zzfgw.zzc)
        {
          zzbzt.zzj("Omid html session error; Unable to parse impression owner: javascript");
          paramString2 = paramString3;
        }
        else if (paramString1 == null)
        {
          zzbzt.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(paramzzebt))));
          paramString2 = paramString3;
        }
        else
        {
          paramzzebt = zzh(paramString4);
          if ((paramString1 == zzfgt.zzd) && (paramzzebt == zzfgw.zzc))
          {
            zzbzt.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(paramString4)));
            paramString2 = paramString3;
          }
          else
          {
            paramWebView = zzfgq.zzb(localzzfgx, paramWebView, paramString5, "");
            paramString2 = zzfgo.zza(zzfgp.zza(paramString1, zzg(paramzzebu.toString()), paramString2, paramzzebt, true), paramWebView);
          }
        }
      }
    }
    return paramString2;
  }
  
  public final zzfgo zzb(String paramString1, WebView paramWebView, String paramString2, String paramString3, String paramString4, String paramString5, zzebu paramzzebu, zzebt paramzzebt, String paramString6)
  {
    paramString2 = zzbbk.zzeK;
    if ((((Boolean)zzba.zzc().zzb(paramString2)).booleanValue()) && (zzfgm.zzb()))
    {
      paramString5 = zzfgx.zza(paramString5, paramString1);
      paramString1 = zzh("javascript");
      paramString3 = zzh(paramString4);
      paramString2 = zzf(paramzzebt.toString());
      if (paramString1 == zzfgw.zzc)
      {
        zzbzt.zzj("Omid js session error; Unable to parse impression owner: javascript");
        return null;
      }
      if (paramString2 == null)
      {
        zzbzt.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(paramzzebt))));
        return null;
      }
      if ((paramString2 == zzfgt.zzd) && (paramString3 == zzfgw.zzc))
      {
        zzbzt.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(paramString4)));
        return null;
      }
      paramWebView = zzfgq.zzc(paramString5, paramWebView, paramString6, "");
      return zzfgo.zza(zzfgp.zza(paramString2, zzg(paramzzebu.toString()), paramString1, paramString3, true), paramWebView);
    }
    return null;
  }
  
  public final void zzc(zzfgo paramzzfgo, View paramView)
  {
    zzbbc localzzbbc = zzbbk.zzeK;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (zzfgm.zzb())) {
      paramzzfgo.zzd(paramView);
    }
  }
  
  public final void zzd(zzfgo paramzzfgo)
  {
    zzbbc localzzbbc = zzbbk.zzeK;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (zzfgm.zzb())) {
      paramzzfgo.zze();
    }
  }
  
  public final boolean zze(Context paramContext)
  {
    zzbbc localzzbbc = zzbbk.zzeK;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      zzbzt.zzj("Omid flag is disabled");
      return false;
    }
    if (zzfgm.zzb()) {
      return true;
    }
    zzfgm.zza(paramContext);
    return zzfgm.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzebr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */