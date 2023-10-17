package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcnv
  implements zzbmr
{
  private final Context zza;
  private final zzatu zzb;
  private final PowerManager zzc;
  
  public zzcnv(Context paramContext, zzatu paramzzatu)
  {
    this.zza = paramContext;
    this.zzb = paramzzatu;
    this.zzc = ((PowerManager)paramContext.getSystemService("power"));
  }
  
  public final JSONObject zza(zzcny paramzzcny)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject2 = new JSONObject();
    Object localObject2 = paramzzcny.zzf;
    if (localObject2 == null)
    {
      paramzzcny = new JSONObject();
    }
    else
    {
      if (this.zzb.zzd() == null) {
        break label952;
      }
      boolean bool2 = ((zzatx)localObject2).zza;
      JSONObject localJSONObject1 = new JSONObject();
      Object localObject1 = localJSONObject1.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", paramzzcny.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
      boolean bool1 = paramzzcny.zzc;
      localObject1 = ((JSONObject)localObject1).put("isStopped", false).put("isPaused", paramzzcny.zzb).put("isNative", this.zzb.zze());
      if (Build.VERSION.SDK_INT >= 20) {
        bool1 = this.zzc.isInteractive();
      } else {
        bool1 = this.zzc.isScreenOn();
      }
      ((JSONObject)localObject1).put("isScreenOn", bool1).put("appMuted", zzt.zzr().zze()).put("appVolume", zzt.zzr().zza()).put("deviceVolume", zzab.zzb(this.zza.getApplicationContext()));
      localObject1 = zzbbk.zzft;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = (AudioManager)this.zza.getApplicationContext().getSystemService("audio");
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = Integer.valueOf(((AudioManager)localObject1).getMode());
        }
        if (localObject1 != null) {
          localJSONObject1.put("audioMode", localObject1);
        }
      }
      localObject1 = new Rect();
      Object localObject3 = ((WindowManager)this.zza.getSystemService("window")).getDefaultDisplay();
      ((Rect)localObject1).right = ((Display)localObject3).getWidth();
      ((Rect)localObject1).bottom = ((Display)localObject3).getHeight();
      localObject1 = this.zza.getResources().getDisplayMetrics();
      localJSONObject1.put("windowVisibility", ((zzatx)localObject2).zzb).put("isAttachedToWindow", bool2).put("viewBox", new JSONObject().put("top", ((zzatx)localObject2).zzc.top).put("bottom", ((zzatx)localObject2).zzc.bottom).put("left", ((zzatx)localObject2).zzc.left).put("right", ((zzatx)localObject2).zzc.right)).put("adBox", new JSONObject().put("top", ((zzatx)localObject2).zzd.top).put("bottom", ((zzatx)localObject2).zzd.bottom).put("left", ((zzatx)localObject2).zzd.left).put("right", ((zzatx)localObject2).zzd.right)).put("globalVisibleBox", new JSONObject().put("top", ((zzatx)localObject2).zze.top).put("bottom", ((zzatx)localObject2).zze.bottom).put("left", ((zzatx)localObject2).zze.left).put("right", ((zzatx)localObject2).zze.right)).put("globalVisibleBoxVisible", ((zzatx)localObject2).zzf).put("localVisibleBox", new JSONObject().put("top", ((zzatx)localObject2).zzg.top).put("bottom", ((zzatx)localObject2).zzg.bottom).put("left", ((zzatx)localObject2).zzg.left).put("right", ((zzatx)localObject2).zzg.right)).put("localVisibleBoxVisible", ((zzatx)localObject2).zzh).put("hitBox", new JSONObject().put("top", ((zzatx)localObject2).zzi.top).put("bottom", ((zzatx)localObject2).zzi.bottom).put("left", ((zzatx)localObject2).zzi.left).put("right", ((zzatx)localObject2).zzi.right)).put("screenDensity", ((DisplayMetrics)localObject1).density);
      localJSONObject1.put("isVisible", paramzzcny.zza);
      localObject1 = zzbbk.zzbl;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
      {
        localObject1 = new JSONArray();
        localObject2 = ((zzatx)localObject2).zzk;
        if (localObject2 != null)
        {
          localObject3 = ((List)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject2 = (Rect)((Iterator)localObject3).next();
            ((JSONArray)localObject1).put(new JSONObject().put("top", ((Rect)localObject2).top).put("bottom", ((Rect)localObject2).bottom).put("left", ((Rect)localObject2).left).put("right", ((Rect)localObject2).right));
          }
        }
        localJSONObject1.put("scrollableContainerBoxes", localObject1);
      }
      if (!TextUtils.isEmpty(paramzzcny.zze)) {
        localJSONObject1.put("doneReasonCode", "u");
      }
      paramzzcny = localJSONObject1;
    }
    localJSONArray.put(paramzzcny);
    localJSONObject2.put("units", localJSONArray);
    return localJSONObject2;
    label952:
    throw new JSONException("Active view Info cannot be null.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */