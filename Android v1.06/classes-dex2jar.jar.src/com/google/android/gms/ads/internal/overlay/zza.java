package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzt;

public final class zza
{
  public static final boolean zza(Context paramContext, Intent paramIntent, zzz paramzzz, zzx paramzzx, boolean paramBoolean)
  {
    if (paramBoolean) {
      return zzc(paramContext, paramIntent.getData(), paramzzz, paramzzx);
    }
    try
    {
      String str = paramIntent.toURI();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Launching an intent: ");
      localStringBuilder.append(str);
      zze.zza(localStringBuilder.toString());
      zzt.zzp();
      zzs.zzP(paramContext, paramIntent);
      if (paramzzz != null) {
        paramzzz.zzg();
      }
      if (paramzzx != null) {
        paramzzx.zza(true);
      }
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      zzbzt.zzj(paramContext.getMessage());
      if (paramzzx != null) {
        paramzzx.zza(false);
      }
    }
    return false;
  }
  
  public static final boolean zzb(Context paramContext, zzc paramzzc, zzz paramzzz, zzx paramzzx)
  {
    int j = 0;
    if (paramzzc == null)
    {
      zzbzt.zzj("No intent data for launcher overlay.");
      return false;
    }
    zzbbk.zza(paramContext);
    Intent localIntent = paramzzc.zzh;
    if (localIntent != null) {
      return zza(paramContext, localIntent, paramzzz, paramzzx, paramzzc.zzj);
    }
    localIntent = new Intent();
    if (TextUtils.isEmpty(paramzzc.zzb))
    {
      zzbzt.zzj("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(paramzzc.zzc)) {
      localIntent.setDataAndType(Uri.parse(paramzzc.zzb), paramzzc.zzc);
    } else {
      localIntent.setData(Uri.parse(paramzzc.zzb));
    }
    localIntent.setAction("android.intent.action.VIEW");
    if (!TextUtils.isEmpty(paramzzc.zzd)) {
      localIntent.setPackage(paramzzc.zzd);
    }
    if (!TextUtils.isEmpty(paramzzc.zze))
    {
      localObject = paramzzc.zze.split("/", 2);
      if (localObject.length < 2)
      {
        zzbzt.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(paramzzc.zze)));
        return false;
      }
      localIntent.setClassName(localObject[0], localObject[1]);
    }
    Object localObject = paramzzc.zzf;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      int i;
      try
      {
        i = Integer.parseInt((String)localObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzbzt.zzj("Could not parse intent flags.");
        i = j;
      }
      localIntent.addFlags(i);
    }
    zzbbc localzzbbc = zzbbk.zzek;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      localIntent.addFlags(268435456);
      localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    }
    else
    {
      localzzbbc = zzbbk.zzej;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        zzt.zzp();
        zzs.zzm(paramContext, localIntent);
      }
    }
    return zza(paramContext, localIntent, paramzzz, paramzzx, paramzzc.zzj);
  }
  
  private static final boolean zzc(Context paramContext, Uri paramUri, zzz paramzzz, zzx paramzzx)
  {
    int i;
    try
    {
      int j = zzt.zzp().zzk(paramContext, paramUri);
      i = j;
      if (paramzzz != null)
      {
        paramzzz.zzg();
        i = j;
      }
    }
    catch (ActivityNotFoundException paramContext)
    {
      zzbzt.zzj(paramContext.getMessage());
      i = 6;
    }
    if (paramzzx != null) {
      paramzzx.zzb(i);
    }
    return i == 5;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */