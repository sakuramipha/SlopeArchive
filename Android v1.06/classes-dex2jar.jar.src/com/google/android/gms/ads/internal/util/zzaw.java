package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzdsz;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfwb;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzaw
{
  protected String zza = "";
  private final Object zzb = new Object();
  private String zzc = "";
  private String zzd = "";
  private boolean zze = false;
  private boolean zzf = false;
  private zzdsz zzg;
  
  protected static final String zzo(Context paramContext, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", zzt.zzp().zzc(paramContext, paramString2));
    paramContext = new zzbo(paramContext).zzb(0, paramString1, localHashMap, null);
    try
    {
      paramString2 = zzbbk.zzex;
      paramString2 = (String)paramContext.get(((Integer)zzba.zzc().zzb(paramString2)).intValue(), TimeUnit.MILLISECONDS);
      return paramString2;
    }
    catch (Exception paramContext)
    {
      zzbzt.zzh("Error retrieving a response from: ".concat(String.valueOf(paramString1)), paramContext);
    }
    catch (InterruptedException paramString2)
    {
      zzbzt.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(paramString1)), paramString2);
      paramContext.cancel(true);
    }
    catch (TimeoutException paramString2)
    {
      zzbzt.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(paramString1)), paramString2);
      paramContext.cancel(true);
    }
    return null;
  }
  
  private final Uri zzp(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    synchronized (this.zzb)
    {
      if (TextUtils.isEmpty(this.zzc))
      {
        zzt.zzp();
        try
        {
          FileInputStream localFileInputStream = paramContext.openFileInput("debug_signals_id.txt");
          paramString1 = new java/lang/String;
          paramString1.<init>(IOUtils.readInputStreamFully(localFileInputStream, true), "UTF-8");
        }
        catch (IOException paramString1)
        {
          zzbzt.zze("Error reading from internal storage.");
          paramString1 = "";
        }
        this.zzc = paramString1;
        if (TextUtils.isEmpty(paramString1))
        {
          zzt.zzp();
          this.zzc = UUID.randomUUID().toString();
          zzt.zzp();
          paramString1 = this.zzc;
          try
          {
            paramContext = paramContext.openFileOutput("debug_signals_id.txt", 0);
            paramContext.write(paramString1.getBytes("UTF-8"));
            paramContext.close();
          }
          catch (Exception paramContext)
          {
            zzbzt.zzh("Error writing to file in internal storage.", paramContext);
          }
        }
      }
      paramContext = this.zzc;
      localBuilder.appendQueryParameter("linkedDeviceId", paramContext);
      localBuilder.appendQueryParameter("adSlotPath", paramString2);
      localBuilder.appendQueryParameter("afmaVersion", paramString3);
      return localBuilder.build();
    }
  }
  
  public final zzdsz zza()
  {
    return this.zzg;
  }
  
  public final String zzb()
  {
    synchronized (this.zzb)
    {
      String str = this.zzd;
      return str;
    }
  }
  
  public final void zzc(Context paramContext)
  {
    Object localObject = zzbbk.zziG;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = this.zzg;
      if (localObject != null) {
        ((zzdsz)localObject).zzh(new zzat(this, paramContext), zzdsy.zzd);
      }
    }
  }
  
  public final void zzd(Context paramContext, String paramString1, String paramString2)
  {
    zzt.zzp();
    zzbbc localzzbbc = zzbbk.zzet;
    zzs.zzQ(paramContext, zzp(paramContext, (String)zzba.zzc().zzb(localzzbbc), paramString1, paramString2));
  }
  
  public final void zze(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    zzbbc localzzbbc = zzbbk.zzew;
    paramString3 = zzp(paramContext, (String)zzba.zzc().zzb(localzzbbc), paramString3, paramString1).buildUpon();
    paramString3.appendQueryParameter("debugData", paramString2);
    zzt.zzp();
    zzs.zzH(paramContext, paramString1, paramString3.build().toString());
  }
  
  public final void zzf(boolean paramBoolean)
  {
    synchronized (this.zzb)
    {
      this.zzf = paramBoolean;
      Object localObject2 = zzbbk.zziG;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue())
      {
        zzt.zzo().zzh().zzB(paramBoolean);
        localObject2 = this.zzg;
        if (localObject2 != null) {
          ((zzdsz)localObject2).zzj(paramBoolean);
        }
      }
      return;
    }
  }
  
  public final void zzg(zzdsz paramzzdsz)
  {
    this.zzg = paramzzdsz;
  }
  
  public final void zzh(boolean paramBoolean)
  {
    synchronized (this.zzb)
    {
      this.zze = paramBoolean;
      return;
    }
  }
  
  protected final void zzi(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!(paramContext instanceof Activity))
    {
      zzbzt.zzi("Can not create dialog without Activity Context");
      return;
    }
    zzs.zza.post(new zzav(this, paramContext, paramString, paramBoolean1, paramBoolean2));
  }
  
  public final boolean zzj(Context paramContext, String paramString1, String paramString2)
  {
    zzbbc localzzbbc = zzbbk.zzev;
    paramContext = zzo(paramContext, zzp(paramContext, (String)zzba.zzc().zzb(localzzbbc), paramString1, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(paramContext))
    {
      zzbzt.zze("Not linked for debug signals.");
      return false;
    }
    paramContext = paramContext.trim();
    try
    {
      paramString2 = new org/json/JSONObject;
      paramString2.<init>(paramContext);
      paramContext = paramString2.optString("debug_mode");
      boolean bool = "1".equals(paramContext);
      zzf(bool);
      paramContext = zzbbk.zziG;
      if (((Boolean)zzba.zzc().zzb(paramContext)).booleanValue())
      {
        paramContext = zzt.zzo().zzh();
        if (true != bool) {
          paramString1 = "";
        }
        paramContext.zzA(paramString1);
      }
      return bool;
    }
    catch (JSONException paramContext)
    {
      zzbzt.zzk("Fail to get debug mode response json.", paramContext);
    }
    return false;
  }
  
  final boolean zzk(Context paramContext, String arg2, String paramString2)
  {
    zzbbc localzzbbc = zzbbk.zzeu;
    paramContext = zzo(paramContext, zzp(paramContext, (String)zzba.zzc().zzb(localzzbbc), ???, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(paramContext))
    {
      zzbzt.zze("Not linked for in app preview.");
      return false;
    }
    paramContext = paramContext.trim();
    try
    {
      paramString2 = new org/json/JSONObject;
      paramString2.<init>(paramContext);
      paramContext = paramString2.optString("gct");
      this.zza = paramString2.optString("status");
      paramString2 = zzbbk.zziG;
      if (((Boolean)zzba.zzc().zzb(paramString2)).booleanValue())
      {
        boolean bool;
        if ((!"0".equals(this.zza)) && (!"2".equals(this.zza))) {
          bool = false;
        } else {
          bool = true;
        }
        zzf(bool);
        paramString2 = zzt.zzo().zzh();
        if (!bool) {
          ??? = "";
        }
        paramString2.zzA(???);
      }
      synchronized (this.zzb)
      {
        this.zzd = paramContext;
        return true;
      }
      return false;
    }
    catch (JSONException paramContext)
    {
      zzbzt.zzk("Fail to get in app preview response json.", paramContext);
    }
  }
  
  public final boolean zzl()
  {
    synchronized (this.zzb)
    {
      boolean bool = this.zzf;
      return bool;
    }
  }
  
  public final boolean zzm()
  {
    synchronized (this.zzb)
    {
      boolean bool = this.zze;
      return bool;
    }
  }
  
  public final boolean zzn(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if ((!TextUtils.isEmpty(paramString2)) && (zzm()))
    {
      zzbzt.zze("Sending troubleshooting signals to the server.");
      zze(paramContext, paramString1, paramString2, paramString3);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */