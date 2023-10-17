package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat.Builder;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;

public final class zzebn
  extends zzbrn
{
  private final Context zza;
  private final zzdqc zzb;
  private final zzbzy zzc;
  private final zzebc zzd;
  private final zzfen zze;
  
  public zzebn(Context paramContext, zzebc paramzzebc, zzbzy paramzzbzy, zzdqc paramzzdqc, zzfen paramzzfen)
  {
    this.zza = paramContext;
    this.zzb = paramzzdqc;
    this.zzc = paramzzbzy;
    this.zzd = paramzzebc;
    this.zze = paramzzfen;
  }
  
  public static void zzc(Context paramContext, zzdqc paramzzdqc, zzfen paramzzfen, zzebc paramzzebc, String paramString1, String paramString2)
  {
    zzd(paramContext, paramzzdqc, paramzzfen, paramzzebc, paramString1, paramString2, new HashMap());
  }
  
  public static void zzd(Context paramContext, zzdqc paramzzdqc, zzfen paramzzfen, zzebc paramzzebc, String paramString1, String paramString2, Map paramMap)
  {
    if (true != zzt.zzo().zzx(paramContext)) {
      paramContext = "offline";
    } else {
      paramContext = "online";
    }
    zzbbc localzzbbc = zzbbk.zzid;
    if ((!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (paramzzdqc != null))
    {
      paramzzdqc = paramzzdqc.zza();
      paramzzdqc.zzb("gqi", paramString1);
      paramzzdqc.zzb("action", paramString2);
      paramzzdqc.zzb("device_connectivity", paramContext);
      paramzzdqc.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
      paramContext = paramMap.entrySet().iterator();
      while (paramContext.hasNext())
      {
        paramzzfen = (Map.Entry)paramContext.next();
        paramzzdqc.zzb((String)paramzzfen.getKey(), (String)paramzzfen.getValue());
      }
      paramContext = paramzzdqc.zzf();
    }
    else
    {
      paramzzdqc = zzfem.zzb(paramString2);
      paramzzdqc.zza("gqi", paramString1);
      paramzzdqc.zza("device_connectivity", paramContext);
      paramzzdqc.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
      paramContext = paramMap.entrySet().iterator();
      while (paramContext.hasNext())
      {
        paramString2 = (Map.Entry)paramContext.next();
        paramzzdqc.zza((String)paramString2.getKey(), (String)paramString2.getValue());
      }
      paramContext = paramzzfen.zza(paramzzdqc);
    }
    paramzzebc.zzd(new zzebe(zzt.zzB().currentTimeMillis(), paramString1, paramContext, 2));
  }
  
  public static void zzh(String[] paramArrayOfString, int[] paramArrayOfInt, zzebp paramzzebp)
  {
    int i = 0;
    while (i < paramArrayOfString.length) {
      if (!paramArrayOfString[i].equals("android.permission.POST_NOTIFICATIONS"))
      {
        i++;
      }
      else
      {
        Activity localActivity = paramzzebp.zza();
        zzdqc localzzdqc = paramzzebp.zzd();
        zzebc localzzebc = paramzzebp.zze();
        paramArrayOfString = paramzzebp.zzf();
        zzbr localzzbr = paramzzebp.zzc();
        String str2 = paramzzebp.zzg();
        String str1 = paramzzebp.zzh();
        paramzzebp = paramzzebp.zzb();
        HashMap localHashMap = new HashMap();
        if (paramArrayOfInt[i] == 0)
        {
          localHashMap.put("dialog_action", "confirm");
          zzn(localActivity, localzzbr, localzzebc, localzzdqc, paramArrayOfString, str2, str1);
          zzo(localActivity, paramzzebp);
        }
        else
        {
          localHashMap.put("dialog_action", "dismiss");
          if (paramzzebp != null) {
            paramzzebp.zzb();
          }
        }
        zzd(localActivity, localzzdqc, paramArrayOfString, localzzebc, str2, "asnpdc", localHashMap);
      }
    }
  }
  
  public static void zzk(Activity paramActivity, zzl paramzzl, zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2, boolean paramBoolean)
  {
    zzt.zzp();
    AlertDialog.Builder localBuilder = zzs.zzG(paramActivity);
    localBuilder.setTitle(zzl(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzl(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzl(R.string.offline_opt_in_confirm, "OK"), new zzebj(paramActivity, paramzzdqc, paramzzfen, paramzzebc, paramString1, paramzzbr, paramString2, paramzzl, paramBoolean)).setNegativeButton(zzl(R.string.offline_opt_in_decline, "No thanks"), new zzebk(paramzzebc, paramString1, paramActivity, paramzzdqc, paramzzfen, paramzzl)).setOnCancelListener(new zzebl(paramzzebc, paramString1, paramActivity, paramzzdqc, paramzzfen, paramzzl));
    localBuilder.create().show();
  }
  
  private static String zzl(int paramInt, String paramString)
  {
    Resources localResources = zzt.zzo().zzd();
    if (localResources == null) {
      return paramString;
    }
    return localResources.getString(paramInt);
  }
  
  private final void zzm(String paramString1, String paramString2, Map paramMap)
  {
    zzd(this.zza, this.zzb, this.zze, this.zzd, paramString1, paramString2, paramMap);
  }
  
  private static void zzn(Context paramContext, zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2)
  {
    try
    {
      boolean bool = paramzzbr.zzf(ObjectWrapper.wrap(paramContext), paramString2, paramString1);
      if (bool) {
        return;
      }
    }
    catch (RemoteException paramzzbr)
    {
      zzbzt.zzh("Failed to schedule offline notification poster.", paramzzbr);
      paramzzebc.zzc(paramString1);
      zzc(paramContext, paramzzdqc, paramzzfen, paramzzebc, paramString1, "offline_notification_worker_not_scheduled");
    }
  }
  
  private static void zzo(Context paramContext, zzl paramzzl)
  {
    Object localObject = zzl(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
    zzt.zzp();
    paramContext = zzs.zzG(paramContext);
    paramContext.setMessage((CharSequence)localObject).setOnCancelListener(new zzebi(paramzzl));
    paramContext = paramContext.create();
    paramContext.show();
    localObject = new Timer();
    ((Timer)localObject).schedule(new zzebm(paramContext, (Timer)localObject, paramzzl), 3000L);
  }
  
  private static final PendingIntent zzp(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdService");
    localIntent.setAction(paramString1);
    localIntent.putExtra("offline_notification_action", paramString1);
    localIntent.putExtra("gws_query_id", paramString2);
    localIntent.putExtra("uri", paramString3);
    return zzfme.zza(paramContext, 0, localIntent, zzfme.zza | 0x40000000, 0);
  }
  
  public final void zze(Intent paramIntent)
  {
    Object localObject = paramIntent.getStringExtra("offline_notification_action");
    if ((!((String)localObject).equals("offline_notification_clicked")) && (!((String)localObject).equals("offline_notification_dismissed"))) {
      return;
    }
    String str1 = paramIntent.getStringExtra("gws_query_id");
    String str2 = paramIntent.getStringExtra("uri");
    boolean bool1 = zzt.zzo().zzx(this.zza);
    HashMap localHashMap = new HashMap();
    boolean bool2 = ((String)localObject).equals("offline_notification_clicked");
    int i = 2;
    if (bool2)
    {
      localHashMap.put("offline_notification_action", "offline_notification_clicked");
      if (true == bool1) {
        i = 1;
      }
      localHashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
      localHashMap.put("olaih", String.valueOf(str2.startsWith("http")));
      try
      {
        Context localContext = this.zza;
        localObject = localContext.getPackageManager().getLaunchIntentForPackage(str2);
        paramIntent = (Intent)localObject;
        if (localObject == null)
        {
          paramIntent = new android/content/Intent;
          paramIntent.<init>("android.intent.action.VIEW");
          paramIntent.setData(Uri.parse(str2));
        }
        paramIntent.addFlags(268435456);
        localContext.startActivity(paramIntent);
        localHashMap.put("olaa", "olas");
      }
      catch (ActivityNotFoundException paramIntent)
      {
        localHashMap.put("olaa", "olaf");
      }
    }
    localHashMap.put("offline_notification_action", "offline_notification_dismissed");
    zzm(str1, "offline_notification_action", localHashMap);
    try
    {
      paramIntent = this.zzd.getWritableDatabase();
      if (i == 1)
      {
        this.zzd.zzg(paramIntent, this.zzc, str1);
        return;
      }
      zzebc.zzi(paramIntent, str1);
      return;
    }
    catch (SQLiteException paramIntent)
    {
      zzbzt.zzg("Failed to get writable offline buffering database: ".concat(paramIntent.toString()));
    }
  }
  
  public final void zzf()
  {
    this.zzd.zze(new zzeay(this.zzc));
  }
  
  public final void zzg(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
  {
    paramIObjectWrapper = (Context)ObjectWrapper.unwrap(paramIObjectWrapper);
    zzt.zzq().zzh(paramIObjectWrapper, "offline_notification_channel", "AdMob Offline Notifications");
    Object localObject = zzp(paramIObjectWrapper, "offline_notification_clicked", paramString2, paramString1);
    paramString1 = zzp(paramIObjectWrapper, "offline_notification_dismissed", paramString2, paramString1);
    localObject = new NotificationCompat.Builder(paramIObjectWrapper, "offline_notification_channel").setContentTitle(zzl(R.string.offline_notification_title, "View the ad you saved when you were offline")).setContentText(zzl(R.string.offline_notification_text, "Tap to open ad")).setAutoCancel(true).setDeleteIntent(paramString1).setContentIntent((PendingIntent)localObject).setSmallIcon(paramIObjectWrapper.getApplicationInfo().icon);
    paramIObjectWrapper = (NotificationManager)paramIObjectWrapper.getSystemService("notification");
    paramString1 = new HashMap();
    try
    {
      paramIObjectWrapper.notify(paramString2, 54321, ((NotificationCompat.Builder)localObject).build());
      paramIObjectWrapper = "offline_notification_impression";
    }
    catch (IllegalArgumentException paramIObjectWrapper)
    {
      paramString1.put("notification_not_shown_reason", paramIObjectWrapper.getMessage());
      paramIObjectWrapper = "offline_notification_failed";
    }
    zzm(paramString2, paramIObjectWrapper, paramString1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzebn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */