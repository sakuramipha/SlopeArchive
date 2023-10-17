package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbbi
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  volatile boolean zza = false;
  private final Object zzb = new Object();
  private final ConditionVariable zzc = new ConditionVariable();
  private volatile boolean zzd = false;
  private SharedPreferences zze = null;
  private Bundle zzf = new Bundle();
  private Context zzg;
  private JSONObject zzh = new JSONObject();
  
  private final void zzf()
  {
    if (this.zze == null) {
      return;
    }
    try
    {
      Object localObject = new com/google/android/gms/internal/ads/zzbbg;
      ((zzbbg)localObject).<init>(this);
      String str = (String)zzbbp.zza((zzfpp)localObject);
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(str);
      this.zzh = ((JSONObject)localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ("flag_configuration".equals(paramString)) {
      zzf();
    }
  }
  
  public final Object zzb(zzbbc paramzzbbc)
  {
    if (!this.zzc.block(5000L)) {
      synchronized (this.zzb)
      {
        if (!this.zza)
        {
          paramzzbbc = new java/lang/IllegalStateException;
          paramzzbbc.<init>("Flags.initialize() was not called!");
          throw paramzzbbc;
        }
      }
    }
    if ((!this.zzd) || (this.zze == null)) {}
    synchronized (this.zzb)
    {
      if ((this.zzd) && (this.zze != null))
      {
        if (paramzzbbc.zze() == 2)
        {
          ??? = this.zzf;
          if (??? == null) {
            return paramzzbbc.zzm();
          }
          return paramzzbbc.zzb((Bundle)???);
        }
        if ((paramzzbbc.zze() == 1) && (this.zzh.has(paramzzbbc.zzn()))) {
          return paramzzbbc.zza(this.zzh);
        }
        return zzbbp.zza(new zzbbf(this, paramzzbbc));
      }
      paramzzbbc = paramzzbbc.zzm();
      return paramzzbbc;
    }
  }
  
  public final void zze(Context paramContext)
  {
    if (this.zzd) {
      return;
    }
    Object localObject1;
    synchronized (this.zzb)
    {
      if (this.zzd) {
        return;
      }
      if (!this.zza) {
        this.zza = true;
      }
      if (paramContext.getApplicationContext() == null) {
        localObject1 = paramContext;
      } else {
        localObject1 = paramContext.getApplicationContext();
      }
      this.zzg = ((Context)localObject1);
    }
    try
    {
      this.zzf = Wrappers.packageManager((Context)localObject1).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
      try
      {
        Context localContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
        localObject1 = localContext;
        if (localContext == null)
        {
          localObject1 = localContext;
          if (paramContext != null)
          {
            localObject1 = paramContext.getApplicationContext();
            if (localObject1 == null) {
              break label114;
            }
          }
        }
        paramContext = (Context)localObject1;
        label114:
        if (paramContext == null)
        {
          this.zza = false;
          this.zzc.open();
          return;
        }
        zzba.zzb();
        paramContext = zzbbe.zza(paramContext);
        this.zze = paramContext;
        if (paramContext != null) {
          paramContext.registerOnSharedPreferenceChangeListener(this);
        }
        paramContext = new com/google/android/gms/internal/ads/zzbbh;
        paramContext.<init>(this);
        zzbdv.zzc(paramContext);
        zzf();
        this.zzd = true;
        this.zza = false;
        this.zzc.open();
        return;
      }
      finally
      {
        this.zza = false;
        this.zzc.open();
      }
      paramContext = finally;
      throw paramContext;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */