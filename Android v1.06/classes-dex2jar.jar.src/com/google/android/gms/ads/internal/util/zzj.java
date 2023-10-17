package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzfwb;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzj
  implements zzg
{
  private boolean zzA = false;
  private String zzB = "";
  private int zzC = -1;
  private int zzD = -1;
  private long zzE = 0L;
  private final Object zza = new Object();
  private boolean zzb;
  private final List zzc = new ArrayList();
  private zzfwb zzd;
  private zzaux zze = null;
  private SharedPreferences zzf;
  private SharedPreferences.Editor zzg;
  private boolean zzh = true;
  private String zzi;
  private String zzj;
  private boolean zzk = true;
  private String zzl = "-1";
  private String zzm = "-1";
  private String zzn = "-1";
  private int zzo = -1;
  private zzbyw zzp = new zzbyw("", 0L);
  private long zzq = 0L;
  private long zzr = 0L;
  private int zzs = -1;
  private int zzt = 0;
  private Set zzu = Collections.emptySet();
  private JSONObject zzv = new JSONObject();
  private boolean zzw = true;
  private boolean zzx = true;
  private String zzy = null;
  private String zzz = "";
  
  private final void zzR()
  {
    zzfwb localzzfwb = this.zzd;
    if (localzzfwb == null) {
      return;
    }
    if (localzzfwb.isDone()) {
      return;
    }
    try
    {
      try
      {
        this.zzd.get(1L, TimeUnit.SECONDS);
        return;
      }
      catch (TimeoutException localTimeoutException) {}catch (ExecutionException localExecutionException) {}catch (CancellationException localCancellationException) {}
      zzbzt.zzh("Fail to initialize AdSharedPreferenceManager.", localCancellationException);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      zzbzt.zzk("Interrupted while waiting for preferences loaded.", localInterruptedException);
    }
  }
  
  private final void zzS()
  {
    zzcag.zza.execute(new zzi(this));
  }
  
  public final void zzA(String paramString)
  {
    ??? = zzbbk.zziG;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
      return;
    }
    zzR();
    synchronized (this.zza)
    {
      if (this.zzB.equals(paramString)) {
        return;
      }
      this.zzB = paramString;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putString("linked_ad_unit", paramString);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzB(boolean paramBoolean)
  {
    ??? = zzbbk.zziG;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
      return;
    }
    zzR();
    synchronized (this.zza)
    {
      if (this.zzA == paramBoolean) {
        return;
      }
      this.zzA = paramBoolean;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putBoolean("linked_device", paramBoolean);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzC(String paramString)
  {
    zzR();
    synchronized (this.zza)
    {
      if (TextUtils.equals(this.zzy, paramString)) {
        return;
      }
      this.zzy = paramString;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putString("display_cutout", paramString);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzD(long paramLong)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzr == paramLong) {
        return;
      }
      this.zzr = paramLong;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putLong("first_ad_req_time_ms", paramLong);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzE(int paramInt)
  {
    zzR();
    synchronized (this.zza)
    {
      this.zzo = paramInt;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        if (paramInt == -1) {
          localEditor.remove("gad_has_consent_for_cookies");
        } else {
          localEditor.putInt("gad_has_consent_for_cookies", paramInt);
        }
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzF(String paramString1, String paramString2)
  {
    zzR();
    synchronized (this.zza)
    {
      int i = paramString1.hashCode();
      if (i != -2004976699)
      {
        if (i != 83641339)
        {
          if ((i == 1218895378) && (paramString1.equals("IABTCF_TCString")))
          {
            i = 1;
            break label89;
          }
        }
        else if (paramString1.equals("IABTCF_gdprApplies"))
        {
          i = 0;
          break label89;
        }
      }
      else if (paramString1.equals("IABTCF_PurposeConsents"))
      {
        i = 2;
        break label89;
      }
      i = -1;
      label89:
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            return;
          }
          this.zzn = paramString2;
        }
        else
        {
          this.zzm = paramString2;
        }
      }
      else {
        this.zzl = paramString2;
      }
      if (this.zzg != null)
      {
        if (paramString2.equals("-1")) {
          this.zzg.remove(paramString1);
        } else {
          this.zzg.putString(paramString1, paramString2);
        }
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzG(String paramString)
  {
    ??? = zzbbk.zzir;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
      return;
    }
    zzR();
    synchronized (this.zza)
    {
      if (this.zzz.equals(paramString)) {
        return;
      }
      this.zzz = paramString;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putString("inspector_info", paramString);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzH(boolean paramBoolean)
  {
    zzR();
    synchronized (this.zza)
    {
      if (paramBoolean == this.zzk) {
        return;
      }
      this.zzk = paramBoolean;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putBoolean("gad_idless", paramBoolean);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzI(String paramString1, String paramString2, boolean paramBoolean)
  {
    zzR();
    synchronized (this.zza)
    {
      Object localObject2 = this.zzv.optJSONArray(paramString1);
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>();
      }
      int k = ((JSONArray)localObject1).length();
      int j;
      for (int i = 0;; i++)
      {
        j = k;
        if (i >= ((JSONArray)localObject1).length()) {
          break;
        }
        localObject2 = ((JSONArray)localObject1).optJSONObject(i);
        if (localObject2 == null) {
          return;
        }
        if (paramString2.equals(((JSONObject)localObject2).optString("template_id")))
        {
          if ((paramBoolean) && (((JSONObject)localObject2).optBoolean("uses_media_view", false))) {
            return;
          }
          j = i;
          break;
        }
      }
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        ((JSONObject)localObject2).put("template_id", paramString2);
        ((JSONObject)localObject2).put("uses_media_view", paramBoolean);
        ((JSONObject)localObject2).put("timestamp_ms", zzt.zzB().currentTimeMillis());
        ((JSONArray)localObject1).put(j, localObject2);
        this.zzv.put(paramString1, localObject1);
      }
      catch (JSONException paramString1)
      {
        zzbzt.zzk("Could not update native advanced settings", paramString1);
      }
      paramString1 = this.zzg;
      if (paramString1 != null)
      {
        paramString1.putString("native_advanced_settings", this.zzv.toString());
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzJ(int paramInt)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzs == paramInt) {
        return;
      }
      this.zzs = paramInt;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putInt("request_in_session_count", paramInt);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzK(int paramInt)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzD == paramInt) {
        return;
      }
      this.zzD = paramInt;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putInt("sd_app_measure_npa", paramInt);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzL(long paramLong)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzE == paramLong) {
        return;
      }
      this.zzE = paramLong;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putLong("sd_app_measure_npa_ts", paramLong);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final boolean zzM()
  {
    zzR();
    synchronized (this.zza)
    {
      boolean bool = this.zzw;
      return bool;
    }
  }
  
  public final boolean zzN()
  {
    zzR();
    synchronized (this.zza)
    {
      boolean bool = this.zzx;
      return bool;
    }
  }
  
  public final boolean zzO()
  {
    zzR();
    synchronized (this.zza)
    {
      boolean bool = this.zzA;
      return bool;
    }
  }
  
  public final boolean zzP()
  {
    ??? = zzbbk.zzau;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)???)).booleanValue()) {
      return false;
    }
    zzR();
    synchronized (this.zza)
    {
      boolean bool = this.zzk;
      return bool;
    }
  }
  
  public final int zza()
  {
    zzR();
    synchronized (this.zza)
    {
      int i = this.zzt;
      return i;
    }
  }
  
  public final int zzb()
  {
    zzR();
    synchronized (this.zza)
    {
      int i = this.zzo;
      return i;
    }
  }
  
  public final int zzc()
  {
    zzR();
    synchronized (this.zza)
    {
      int i = this.zzs;
      return i;
    }
  }
  
  public final long zzd()
  {
    zzR();
    synchronized (this.zza)
    {
      long l = this.zzq;
      return l;
    }
  }
  
  public final long zze()
  {
    zzR();
    synchronized (this.zza)
    {
      long l = this.zzr;
      return l;
    }
  }
  
  public final long zzf()
  {
    zzR();
    synchronized (this.zza)
    {
      long l = this.zzE;
      return l;
    }
  }
  
  public final zzaux zzg()
  {
    if (!this.zzb) {
      return null;
    }
    if ((zzM()) && (zzN())) {
      return null;
    }
    if (!((Boolean)zzbcv.zzb.zze()).booleanValue()) {
      return null;
    }
    synchronized (this.zza)
    {
      if (Looper.getMainLooper() == null) {
        return null;
      }
      if (this.zze == null)
      {
        localzzaux = new com/google/android/gms/internal/ads/zzaux;
        localzzaux.<init>();
        this.zze = localzzaux;
      }
      this.zze.zze();
      zzbzt.zzi("start fetching content...");
      zzaux localzzaux = this.zze;
      return localzzaux;
    }
  }
  
  public final zzbyw zzh()
  {
    zzR();
    synchronized (this.zza)
    {
      zzbyw localzzbyw = this.zzp;
      return localzzbyw;
    }
  }
  
  public final zzbyw zzi()
  {
    synchronized (this.zza)
    {
      zzbyw localzzbyw = this.zzp;
      return localzzbyw;
    }
  }
  
  public final String zzj()
  {
    zzR();
    synchronized (this.zza)
    {
      String str = this.zzi;
      return str;
    }
  }
  
  public final String zzk()
  {
    zzR();
    synchronized (this.zza)
    {
      String str = this.zzj;
      return str;
    }
  }
  
  public final String zzl()
  {
    zzR();
    synchronized (this.zza)
    {
      String str = this.zzB;
      return str;
    }
  }
  
  public final String zzm()
  {
    zzR();
    synchronized (this.zza)
    {
      String str = this.zzy;
      return str;
    }
  }
  
  public final String zzn(String paramString)
  {
    zzR();
    synchronized (this.zza)
    {
      int i = paramString.hashCode();
      if (i != -2004976699)
      {
        if (i != 83641339)
        {
          if ((i == 1218895378) && (paramString.equals("IABTCF_TCString")))
          {
            i = 1;
            break label87;
          }
        }
        else if (paramString.equals("IABTCF_gdprApplies"))
        {
          i = 0;
          break label87;
        }
      }
      else if (paramString.equals("IABTCF_PurposeConsents"))
      {
        i = 2;
        break label87;
      }
      i = -1;
      label87:
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            return null;
          }
          paramString = this.zzn;
          return paramString;
        }
        paramString = this.zzm;
        return paramString;
      }
      paramString = this.zzl;
      return paramString;
    }
  }
  
  public final String zzo()
  {
    zzR();
    synchronized (this.zza)
    {
      String str = this.zzz;
      return str;
    }
  }
  
  public final JSONObject zzp()
  {
    zzR();
    synchronized (this.zza)
    {
      JSONObject localJSONObject = this.zzv;
      return localJSONObject;
    }
  }
  
  public final void zzq(Runnable paramRunnable)
  {
    this.zzc.add(paramRunnable);
  }
  
  public final void zzr(Context paramContext)
  {
    synchronized (this.zza)
    {
      if (this.zzf != null) {
        return;
      }
      this.zzd = zzcag.zza.zza(new zzh(this, paramContext, "admob"));
      this.zzb = true;
      return;
    }
  }
  
  public final void zzs()
  {
    zzR();
    synchronized (this.zza)
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      this.zzv = ((JSONObject)localObject2);
      localObject2 = this.zzg;
      if (localObject2 != null)
      {
        ((SharedPreferences.Editor)localObject2).remove("native_advanced_settings");
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzt(long paramLong)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzq == paramLong) {
        return;
      }
      this.zzq = paramLong;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putLong("app_last_background_time_ms", paramLong);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzu(String paramString)
  {
    zzR();
    synchronized (this.zza)
    {
      long l = zzt.zzB().currentTimeMillis();
      if ((paramString != null) && (!paramString.equals(this.zzp.zzc())))
      {
        Object localObject2 = new com/google/android/gms/internal/ads/zzbyw;
        ((zzbyw)localObject2).<init>(paramString, l);
        this.zzp = ((zzbyw)localObject2);
        localObject2 = this.zzg;
        if (localObject2 != null)
        {
          ((SharedPreferences.Editor)localObject2).putString("app_settings_json", paramString);
          this.zzg.putLong("app_settings_last_update_ms", l);
          this.zzg.apply();
        }
        zzS();
        paramString = this.zzc.iterator();
        while (paramString.hasNext()) {
          ((Runnable)paramString.next()).run();
        }
        return;
      }
      this.zzp.zzg(l);
      return;
    }
  }
  
  public final void zzv(int paramInt)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzt == paramInt) {
        return;
      }
      this.zzt = paramInt;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putInt("version_code", paramInt);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzw(String paramString)
  {
    zzR();
    synchronized (this.zza)
    {
      if (paramString.equals(this.zzi)) {
        return;
      }
      this.zzi = paramString;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putString("content_url_hashes", paramString);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzx(boolean paramBoolean)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzw == paramBoolean) {
        return;
      }
      this.zzw = paramBoolean;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putBoolean("content_url_opted_out", paramBoolean);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzy(String paramString)
  {
    zzR();
    synchronized (this.zza)
    {
      if (paramString.equals(this.zzj)) {
        return;
      }
      this.zzj = paramString;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putString("content_vertical_hashes", paramString);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
  
  public final void zzz(boolean paramBoolean)
  {
    zzR();
    synchronized (this.zza)
    {
      if (this.zzx == paramBoolean) {
        return;
      }
      this.zzx = paramBoolean;
      SharedPreferences.Editor localEditor = this.zzg;
      if (localEditor != null)
      {
        localEditor.putBoolean("content_vertical_opted_out", paramBoolean);
        this.zzg.apply();
      }
      zzS();
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */