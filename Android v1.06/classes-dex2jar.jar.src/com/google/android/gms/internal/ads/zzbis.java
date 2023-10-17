package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzbis
  implements zzbii
{
  private final zzb zza;
  private final zzdqc zzb;
  private final zzfen zzc;
  private final zzbzy zzd;
  private final zzbqs zze;
  private final zzebc zzf;
  private zzx zzg = null;
  
  public zzbis(zzb paramzzb, zzbqs paramzzbqs, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen)
  {
    this.zza = paramzzb;
    this.zze = paramzzbqs;
    this.zzf = paramzzebc;
    this.zzb = paramzzdqc;
    this.zzc = paramzzfen;
    this.zzd = new zzbzy(null);
  }
  
  public static int zzb(Map paramMap)
  {
    paramMap = (String)paramMap.get("o");
    if (paramMap != null)
    {
      if ("p".equalsIgnoreCase(paramMap)) {
        return 7;
      }
      if ("l".equalsIgnoreCase(paramMap)) {
        return 6;
      }
      if ("c".equalsIgnoreCase(paramMap)) {
        return 14;
      }
    }
    return -1;
  }
  
  static Uri zzc(Context paramContext, zzaqq paramzzaqq, Uri paramUri, View paramView, Activity paramActivity)
  {
    if (paramzzaqq == null) {
      return paramUri;
    }
    localUri = paramUri;
    try
    {
      try
      {
        if (paramzzaqq.zze(paramUri)) {
          localUri = paramzzaqq.zza(paramUri, paramContext, paramView, paramActivity);
        }
      }
      catch (Exception paramContext)
      {
        zzt.zzo().zzu(paramContext, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        localUri = paramUri;
      }
    }
    catch (zzaqr paramContext)
    {
      for (;;)
      {
        localUri = paramUri;
      }
    }
    return localUri;
  }
  
  static Uri zzd(Uri paramUri)
  {
    try
    {
      if (paramUri.getQueryParameter("aclk_ms") != null)
      {
        long l = SystemClock.uptimeMillis();
        Uri localUri = paramUri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(l)).build();
        return localUri;
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      zzbzt.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(paramUri.toString())), localUnsupportedOperationException);
    }
    return paramUri;
  }
  
  public static boolean zzf(Map paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private final void zzh(zza paramzza, Map paramMap, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    int j = 1;
    zzi(true);
    zzcfb localzzcfb = (zzcfb)paramzza;
    Context localContext = localzzcfb.getContext();
    zzaqq localzzaqq = localzzcfb.zzI();
    View localView = localzzcfb.zzF();
    Object localObject2 = (ActivityManager)localContext.getSystemService("activity");
    Object localObject3 = (String)paramMap.get("u");
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject3);
    Object localObject1 = null;
    Intent localIntent = null;
    if (bool1)
    {
      paramMap = (Map)localObject1;
    }
    else
    {
      localObject1 = zzd(zzc(localContext, localzzaqq, Uri.parse((String)localObject3), localView, null));
      boolean bool2 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
      bool1 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
      int i = j;
      if (!Boolean.parseBoolean((String)paramMap.get("use_custom_tabs")))
      {
        paramMap = zzbbk.zzej;
        if (((Boolean)zzba.zzc().zzb(paramMap)).booleanValue()) {
          i = j;
        } else {
          i = 0;
        }
      }
      if ("http".equalsIgnoreCase(((Uri)localObject1).getScheme()))
      {
        paramMap = ((Uri)localObject1).buildUpon().scheme("https").build();
      }
      else
      {
        paramMap = localIntent;
        if ("https".equalsIgnoreCase(((Uri)localObject1).getScheme())) {
          paramMap = ((Uri)localObject1).buildUpon().scheme("http").build();
        }
      }
      localObject3 = new ArrayList();
      localIntent = zzbir.zza((Uri)localObject1, localContext, localzzaqq, localView);
      paramMap = zzbir.zza(paramMap, localContext, localzzaqq, localView);
      if (i != 0)
      {
        zzt.zzp();
        zzs.zzm(localContext, localIntent);
        zzt.zzp();
        zzs.zzm(localContext, paramMap);
      }
      localObject1 = zzbir.zzd(localIntent, (ArrayList)localObject3, localContext, localzzaqq, localView);
      if (localObject1 != null)
      {
        paramMap = zzbir.zzb(localIntent, (ResolveInfo)localObject1, localContext, localzzaqq, localView);
      }
      else
      {
        if (paramMap != null)
        {
          paramMap = zzbir.zzc(paramMap, localContext, localzzaqq, localView);
          if (paramMap != null)
          {
            localObject1 = zzbir.zzb(localIntent, paramMap, localContext, localzzaqq, localView);
            paramMap = (Map)localObject1;
            if (zzbir.zzc((Intent)localObject1, localContext, localzzaqq, localView) != null) {
              break label563;
            }
          }
        }
        if (!((ArrayList)localObject3).isEmpty())
        {
          if ((bool1) && (localObject2 != null))
          {
            localObject1 = ((ActivityManager)localObject2).getRunningAppProcesses();
            if (localObject1 != null)
            {
              j = ((List)localObject3).size();
              for (i = 0; i < j; i++)
              {
                paramMap = (ResolveInfo)((List)localObject3).get(i);
                localObject2 = ((List)localObject1).iterator();
                while (((Iterator)localObject2).hasNext()) {
                  if (((ActivityManager.RunningAppProcessInfo)((Iterator)localObject2).next()).processName.equals(paramMap.activityInfo.packageName))
                  {
                    paramMap = zzbir.zzb(localIntent, paramMap, localContext, localzzaqq, localView);
                    break label563;
                  }
                }
              }
            }
          }
          if (bool2)
          {
            paramMap = zzbir.zzb(localIntent, (ResolveInfo)((ArrayList)localObject3).get(0), localContext, localzzaqq, localView);
            break label563;
          }
        }
        paramMap = localIntent;
      }
    }
    label563:
    if ((paramBoolean1) && (this.zzf != null) && (paramMap != null) && (zzj(paramzza, localzzcfb.getContext(), paramMap.getData().toString(), paramString))) {
      return;
    }
    try
    {
      paramzza = (zzcgg)paramzza;
      paramString = new com/google/android/gms/ads/internal/overlay/zzc;
      paramString.<init>(paramMap, this.zzg);
      paramzza.zzaD(paramString, paramBoolean2);
      return;
    }
    catch (ActivityNotFoundException paramzza)
    {
      zzbzt.zzj(paramzza.getMessage());
    }
  }
  
  private final void zzi(boolean paramBoolean)
  {
    zzbqs localzzbqs = this.zze;
    if (localzzbqs != null) {
      localzzbqs.zza(paramBoolean);
    }
  }
  
  private final boolean zzj(zza paramzza, Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = this.zzb;
    if (localObject != null) {
      zzebn.zzc(paramContext, (zzdqc)localObject, this.zzc, this.zzf, paramString2, "offline_open");
    }
    if (zzt.zzo().zzx(paramContext))
    {
      this.zzf.zzh(this.zzd, paramString2);
      return false;
    }
    zzt.zzp();
    localObject = zzs.zzv(paramContext);
    zzt.zzp();
    boolean bool2 = NotificationManagerCompat.from(paramContext).areNotificationsEnabled();
    boolean bool3 = zzt.zzq().zzi(paramContext, "offline_notification_channel");
    zzcfb localzzcfb = (zzcfb)paramzza;
    int i;
    if ((localzzcfb.zzO().zzi()) && (localzzcfb.zzi() == null)) {
      i = 1;
    } else {
      i = 0;
    }
    zzbbc localzzbbc;
    if (!bool2)
    {
      zzt.zzp();
      if (!NotificationManagerCompat.from(paramContext).areNotificationsEnabled())
      {
        boolean bool1;
        if (Build.VERSION.SDK_INT < 33)
        {
          localzzbbc = zzbbk.zzhW;
          bool1 = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
        }
        else
        {
          localzzbbc = zzbbk.zzhV;
          bool1 = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
        }
        if (!bool1) {}
      }
    }
    else if ((!bool3) && (localObject != null) && (i == 0))
    {
      localzzbbc = zzbbk.zzhT;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        if (localzzcfb.zzO().zzi()) {
          zzebn.zzk(localzzcfb.zzi(), null, (zzbr)localObject, this.zzf, this.zzb, this.zzc, paramString2, paramString1, true);
        } else {
          ((zzcgg)paramzza).zzaE((zzbr)localObject, this.zzf, this.zzb, this.zzc, paramString2, paramString1, 14);
        }
        paramString1 = this.zzb;
        if (paramString1 != null) {
          zzebn.zzc(paramContext, paramString1, this.zzc, this.zzf, paramString2, "dialog_impression");
        }
        paramzza.onAdClicked();
        return true;
      }
    }
    this.zzf.zzc(paramString2);
    if (this.zzb != null)
    {
      paramzza = new HashMap();
      if (!bool2)
      {
        paramzza.put("dialog_not_shown_reason", "notifications_disabled");
      }
      else if (bool3)
      {
        paramzza.put("dialog_not_shown_reason", "notification_channel_disabled");
      }
      else if (localObject == null)
      {
        paramzza.put("dialog_not_shown_reason", "work_manager_unavailable");
      }
      else
      {
        paramString1 = zzbbk.zzhT;
        if (!((Boolean)zzba.zzc().zzb(paramString1)).booleanValue()) {
          paramzza.put("dialog_not_shown_reason", "notification_flow_disabled");
        } else if (i != 0) {
          paramzza.put("dialog_not_shown_reason", "fullscreen_no_activity");
        }
      }
      zzebn.zzd(paramContext, this.zzb, this.zzc, this.zzf, paramString2, "dialog_not_shown", paramzza);
    }
    return false;
  }
  
  private final void zzk(int paramInt)
  {
    if (this.zzb == null) {
      return;
    }
    Object localObject = zzbbk.zzid;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzfen localzzfen = this.zzc;
      String str = zzbck.zza(paramInt);
      localObject = zzfem.zzb("cct_action");
      ((zzfem)localObject).zza("cct_open_status", str);
      localzzfen.zzb((zzfem)localObject);
      return;
    }
    localObject = this.zzb.zza();
    ((zzdqb)localObject).zzb("action", "cct_action");
    ((zzdqb)localObject).zzb("cct_open_status", zzbck.zza(paramInt));
    ((zzdqb)localObject).zzg();
  }
  
  public final void zze(zza paramzza, Map paramMap)
  {
    Object localObject2 = (String)paramMap.get("u");
    zzcfb localzzcfb = (zzcfb)paramzza;
    Object localObject1 = localzzcfb.getContext();
    Boolean localBoolean = Boolean.valueOf(true);
    String str1 = zzbya.zzc((String)localObject2, (Context)localObject1, true);
    String str2 = (String)paramMap.get("a");
    if (str2 == null)
    {
      zzbzt.zzj("Action missing from an open GMSG.");
      return;
    }
    localObject1 = this.zza;
    if ((localObject1 != null) && (!((zzb)localObject1).zzc()))
    {
      this.zza.zzb(str1);
      return;
    }
    localObject2 = localzzcfb.zzD();
    localObject1 = localzzcfb.zzP();
    int j = 0;
    boolean bool2;
    if ((localObject2 != null) && (localObject1 != null))
    {
      bool2 = ((zzezf)localObject2).zzaj;
      localObject1 = ((zzezi)localObject1).zzb;
    }
    else
    {
      localObject1 = "";
      bool2 = false;
    }
    localObject2 = zzbbk.zzjn;
    boolean bool1;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue()) && (paramMap.containsKey("sc")) && (((String)paramMap.get("sc")).equals("0"))) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    if ("expand".equalsIgnoreCase(str2))
    {
      if (localzzcfb.zzaA())
      {
        zzbzt.zzj("Cannot expand WebView that is already expanded.");
        return;
      }
      zzi(false);
      ((zzcgg)paramzza).zzaF(zzf(paramMap), zzb(paramMap), bool1);
      return;
    }
    if ("webapp".equalsIgnoreCase(str2))
    {
      zzi(false);
      if (str1 != null)
      {
        ((zzcgg)paramzza).zzaG(zzf(paramMap), zzb(paramMap), str1, bool1);
        return;
      }
      ((zzcgg)paramzza).zzaH(zzf(paramMap), zzb(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"), bool1);
      return;
    }
    int i;
    if ("chrome_custom_tab".equalsIgnoreCase(str2))
    {
      localObject2 = localzzcfb.getContext();
      localObject4 = zzbbk.zzel;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue())
      {
        i = j;
      }
      else
      {
        localObject4 = zzbbk.zzer;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue())
        {
          zze.zza("User opt out chrome custom tab.");
          i = j;
        }
        else
        {
          localObject4 = zzbbk.zzep;
          if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue()) {}
          for (;;)
          {
            i = 1;
            break;
            localObject4 = zzbbk.zzeq;
            localObject4 = (String)zzba.zzc().zzb((zzbbc)localObject4);
            i = j;
            if (((String)localObject4).isEmpty()) {
              break;
            }
            if (localObject2 == null)
            {
              i = j;
              break;
            }
            localObject2 = ((Context)localObject2).getPackageName();
            localObject4 = zzfpm.zzc(zzfok.zzc(';')).zzd((CharSequence)localObject4).iterator();
            do
            {
              i = j;
              if (!((Iterator)localObject4).hasNext()) {
                break;
              }
            } while (!((String)((Iterator)localObject4).next()).equals(localObject2));
          }
        }
      }
      bool3 = zzbcl.zzg(localzzcfb.getContext());
      if (i != 0) {
        if (!bool3)
        {
          zzk(4);
        }
        else
        {
          zzi(true);
          if (TextUtils.isEmpty(str1))
          {
            zzbzt.zzj("Cannot open browser with null or empty url");
            zzk(7);
            return;
          }
          paramMap = Uri.parse(str1);
          paramMap = zzd(zzc(localzzcfb.getContext(), localzzcfb.zzI(), paramMap, localzzcfb.zzF(), localzzcfb.zzi()));
          if ((bool2) && (this.zzf != null) && (zzj(paramzza, localzzcfb.getContext(), paramMap.toString(), (String)localObject1))) {
            return;
          }
          this.zzg = new zzbip(this);
          ((zzcgg)paramzza).zzaD(new zzc(null, paramMap.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), bool1);
          return;
        }
      }
      paramMap.put("use_first_package", "true");
      paramMap.put("use_running_process", "true");
      zzh(paramzza, paramMap, bool2, (String)localObject1, bool1);
      return;
    }
    if (("app".equalsIgnoreCase(str2)) && ("true".equalsIgnoreCase((String)paramMap.get("system_browser"))))
    {
      zzh(paramzza, paramMap, bool2, (String)localObject1, bool1);
      return;
    }
    if ("open_app".equalsIgnoreCase(str2))
    {
      localObject2 = zzbbk.zzhL;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject2)).booleanValue()) {
        return;
      }
      zzi(true);
      paramMap = (String)paramMap.get("p");
      if (paramMap == null)
      {
        zzbzt.zzj("Package name missing from open app action.");
        return;
      }
      if ((bool2) && (this.zzf != null) && (zzj(paramzza, localzzcfb.getContext(), paramMap, (String)localObject1))) {
        return;
      }
      localObject1 = localzzcfb.getContext().getPackageManager();
      if (localObject1 == null)
      {
        zzbzt.zzj("Cannot get package manager from open app action.");
        return;
      }
      paramMap = ((PackageManager)localObject1).getLaunchIntentForPackage(paramMap);
      if (paramMap != null) {
        ((zzcgg)paramzza).zzaD(new zzc(paramMap, this.zzg), bool1);
      }
      return;
    }
    zzi(true);
    Object localObject5 = (String)paramMap.get("intent_url");
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject5);
    Object localObject4 = null;
    localObject2 = localObject4;
    Object localObject3;
    if (!bool3) {
      try
      {
        localObject2 = Intent.parseUri((String)localObject5, 0);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        zzbzt.zzh("Error parsing the url: ".concat(String.valueOf(localObject5)), localURISyntaxException);
        localObject3 = localObject4;
      }
    }
    if ((localObject3 != null) && (((Intent)localObject3).getData() != null))
    {
      localObject4 = ((Intent)localObject3).getData();
      if (!Uri.EMPTY.equals(localObject4))
      {
        localObject5 = zzd(zzc(localzzcfb.getContext(), localzzcfb.zzI(), (Uri)localObject4, localzzcfb.zzF(), localzzcfb.zzi()));
        if (!TextUtils.isEmpty(((Intent)localObject3).getType()))
        {
          localObject4 = zzbbk.zzhM;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue())
          {
            ((Intent)localObject3).setDataAndType((Uri)localObject5, ((Intent)localObject3).getType());
            break label1198;
          }
        }
        ((Intent)localObject3).setData((Uri)localObject5);
      }
    }
    label1198:
    localObject4 = zzbbk.zzhZ;
    if ((((Boolean)zzba.zzc().zzb((zzbbc)localObject4)).booleanValue()) && ("intent_async".equalsIgnoreCase(str2)) && (paramMap.containsKey("event_id"))) {
      i = 1;
    } else {
      i = 0;
    }
    localObject4 = new HashMap();
    if (i != 0)
    {
      this.zzg = new zzbiq(this, bool1, paramzza, (Map)localObject4, paramMap);
      bool1 = false;
    }
    if (localObject3 != null)
    {
      if ((bool2) && (this.zzf != null) && (zzj(paramzza, localzzcfb.getContext(), ((Intent)localObject3).getData().toString(), (String)localObject1)))
      {
        if (i != 0)
        {
          ((Map)localObject4).put((String)paramMap.get("event_id"), localBoolean);
          ((zzblb)paramzza).zzd("openIntentAsync", (Map)localObject4);
        }
        return;
      }
      ((zzcgg)paramzza).zzaD(new zzc((Intent)localObject3, this.zzg), bool1);
      return;
    }
    if (!TextUtils.isEmpty(str1))
    {
      localObject3 = Uri.parse(str1);
      localObject3 = zzd(zzc(localzzcfb.getContext(), localzzcfb.zzI(), (Uri)localObject3, localzzcfb.zzF(), localzzcfb.zzi())).toString();
    }
    else
    {
      localObject3 = str1;
    }
    if ((bool2) && (this.zzf != null) && (zzj(paramzza, localzzcfb.getContext(), (String)localObject3, (String)localObject1)))
    {
      if (i != 0)
      {
        ((Map)localObject4).put((String)paramMap.get("event_id"), localBoolean);
        ((zzblb)paramzza).zzd("openIntentAsync", (Map)localObject4);
      }
      return;
    }
    ((zzcgg)paramzza).zzaD(new zzc((String)paramMap.get("i"), (String)localObject3, (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e"), this.zzg), bool1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */