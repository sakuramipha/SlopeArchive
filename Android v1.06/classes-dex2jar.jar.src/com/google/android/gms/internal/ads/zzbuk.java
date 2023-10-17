package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zzbuk
{
  private int zzA;
  private final String zzB;
  private boolean zzC;
  private int zza;
  private boolean zzb;
  private boolean zzc;
  private int zzd;
  private int zze;
  private int zzf;
  private String zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private boolean zzk;
  private int zzl;
  private double zzm;
  private boolean zzn;
  private String zzo;
  private String zzp;
  private final boolean zzq;
  private final boolean zzr;
  private final String zzs;
  private final boolean zzt;
  private final boolean zzu;
  private final boolean zzv;
  private final String zzw;
  private final String zzx;
  private float zzy;
  private int zzz;
  
  public zzbuk(Context paramContext)
  {
    Object localObject1 = paramContext.getPackageManager();
    zzbbk.zza(paramContext);
    zzc(paramContext);
    zze(paramContext);
    zzd(paramContext);
    Object localObject3 = Locale.getDefault();
    ResolveInfo localResolveInfo = zzb((PackageManager)localObject1, "geo:0,0?q=donuts");
    boolean bool2 = true;
    boolean bool1;
    if (localResolveInfo != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    this.zzq = bool1;
    if (zzb((PackageManager)localObject1, "http://www.google.com") != null) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    this.zzr = bool1;
    this.zzs = ((Locale)localObject3).getCountry();
    zzt.zzp();
    zzay.zzb();
    this.zzt = zzbzm.zzr();
    this.zzu = DeviceProperties.isLatchsky(paramContext);
    this.zzv = DeviceProperties.isSidewinder(paramContext);
    this.zzw = ((Locale)localObject3).getLanguage();
    localObject1 = zzb((PackageManager)localObject1, "market://details?id=com.google.android.gms.ads");
    localResolveInfo = null;
    if (localObject1 == null) {}
    for (;;)
    {
      localObject1 = null;
      break label246;
      localObject3 = ((ResolveInfo)localObject1).activityInfo;
      if (localObject3 != null) {
        try
        {
          localObject1 = Wrappers.packageManager(paramContext).getPackageInfo(((ActivityInfo)localObject3).packageName, 0);
          if (localObject1 != null)
          {
            int i = ((PackageInfo)localObject1).versionCode;
            localObject3 = ((ActivityInfo)localObject3).packageName;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append(i);
            ((StringBuilder)localObject1).append(".");
            ((StringBuilder)localObject1).append((String)localObject3);
            localObject1 = ((StringBuilder)localObject1).toString();
            label246:
            this.zzx = ((String)localObject1);
            Object localObject2;
            try
            {
              localObject3 = Wrappers.packageManager(paramContext).getPackageInfo("com.android.vending", 128);
              localObject1 = localResolveInfo;
              if (localObject3 != null)
              {
                i = ((PackageInfo)localObject3).versionCode;
                localObject1 = ((PackageInfo)localObject3).packageName;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append(i);
                ((StringBuilder)localObject3).append(".");
                ((StringBuilder)localObject3).append((String)localObject1);
                localObject1 = ((StringBuilder)localObject3).toString();
              }
            }
            catch (Exception localException)
            {
              localObject2 = localResolveInfo;
            }
            this.zzB = ((String)localObject2);
            paramContext = paramContext.getResources();
            if (paramContext == null) {
              return;
            }
            paramContext = paramContext.getDisplayMetrics();
            if (paramContext == null) {
              return;
            }
            this.zzy = paramContext.density;
            this.zzz = paramContext.widthPixels;
            this.zzA = paramContext.heightPixels;
            return;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
    }
  }
  
  public zzbuk(Context paramContext, zzbul paramzzbul)
  {
    zzbbk.zza(paramContext);
    zzc(paramContext);
    zze(paramContext);
    zzd(paramContext);
    this.zzo = Build.FINGERPRINT;
    this.zzp = Build.DEVICE;
    this.zzC = zzbcl.zzg(paramContext);
    this.zzq = paramzzbul.zza;
    this.zzr = paramzzbul.zzb;
    this.zzs = paramzzbul.zzd;
    this.zzt = paramzzbul.zze;
    this.zzu = paramzzbul.zzf;
    this.zzv = paramzzbul.zzg;
    this.zzw = paramzzbul.zzh;
    this.zzx = paramzzbul.zzi;
    this.zzB = paramzzbul.zzj;
    this.zzy = paramzzbul.zzm;
    this.zzz = paramzzbul.zzn;
    this.zzA = paramzzbul.zzo;
  }
  
  private static ResolveInfo zzb(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW", Uri.parse(paramString));
      paramPackageManager = paramPackageManager.resolveActivity(localIntent, 65536);
      return paramPackageManager;
    }
    finally
    {
      zzt.zzo().zzu(paramPackageManager, "DeviceInfo.getResolveInfo");
    }
    return null;
  }
  
  private final void zzc(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext != null) {
      try
      {
        this.zza = paramContext.getMode();
        this.zzb = paramContext.isMusicActive();
        this.zzc = paramContext.isSpeakerphoneOn();
        this.zzd = paramContext.getStreamVolume(3);
        this.zze = paramContext.getRingerMode();
        this.zzf = paramContext.getStreamVolume(2);
        return;
      }
      finally
      {
        zzt.zzo().zzu(paramContext, "DeviceInfo.gatherAudioInfo");
      }
    }
    this.zza = -2;
    this.zzb = false;
    this.zzc = false;
    this.zzd = 0;
    this.zze = 2;
    this.zzf = 0;
  }
  
  private final void zzd(Context paramContext)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    zzbbc localzzbbc = zzbbk.zzjx;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (Build.VERSION.SDK_INT >= 33)) {
      paramContext = paramContext.registerReceiver(null, localIntentFilter, 4);
    } else {
      paramContext = paramContext.registerReceiver(null, localIntentFilter);
    }
    boolean bool = false;
    if (paramContext != null)
    {
      int i = paramContext.getIntExtra("status", -1);
      int j = paramContext.getIntExtra("level", -1);
      int k = paramContext.getIntExtra("scale", -1);
      this.zzm = (j / k);
      if ((i == 2) || (i == 5)) {
        bool = true;
      }
      this.zzn = bool;
      return;
    }
    this.zzm = -1.0D;
    this.zzn = false;
  }
  
  private final void zze(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.zzg = localTelephonyManager.getNetworkOperator();
    if (PlatformVersion.isAtLeastR())
    {
      zzbbc localzzbbc = zzbbk.zzhY;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        i = 0;
        break label71;
      }
    }
    int i = localTelephonyManager.getNetworkType();
    label71:
    this.zzi = i;
    this.zzj = localTelephonyManager.getPhoneType();
    this.zzh = -2;
    this.zzk = false;
    this.zzl = -1;
    zzt.zzp();
    if (zzs.zzw(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      paramContext = localConnectivityManager.getActiveNetworkInfo();
      if (paramContext != null)
      {
        this.zzh = paramContext.getType();
        this.zzl = paramContext.getDetailedState().ordinal();
      }
      else
      {
        this.zzh = -1;
      }
      this.zzk = localConnectivityManager.isActiveNetworkMetered();
    }
  }
  
  public final zzbul zza()
  {
    return new zzbul(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */