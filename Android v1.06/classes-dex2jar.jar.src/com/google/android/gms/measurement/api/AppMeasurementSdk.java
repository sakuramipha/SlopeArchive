package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import java.util.List;
import java.util.Map;

public class AppMeasurementSdk
{
  private final zzee zza;
  
  public AppMeasurementSdk(zzee paramzzee)
  {
    this.zza = paramzzee;
  }
  
  public static AppMeasurementSdk getInstance(Context paramContext)
  {
    return zzee.zzg(paramContext, null, null, null, null).zzd();
  }
  
  public static AppMeasurementSdk getInstance(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    return zzee.zzg(paramContext, paramString1, paramString2, paramString3, paramBundle).zzd();
  }
  
  public void beginAdUnitExposure(String paramString)
  {
    this.zza.zzu(paramString);
  }
  
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    this.zza.zzv(paramString1, paramString2, paramBundle);
  }
  
  public void endAdUnitExposure(String paramString)
  {
    this.zza.zzw(paramString);
  }
  
  public long generateEventId()
  {
    return this.zza.zzb();
  }
  
  public String getAppIdOrigin()
  {
    return this.zza.zzj();
  }
  
  public String getAppInstanceId()
  {
    return this.zza.zzl();
  }
  
  public List<Bundle> getConditionalUserProperties(String paramString1, String paramString2)
  {
    return this.zza.zzp(paramString1, paramString2);
  }
  
  public String getCurrentScreenClass()
  {
    return this.zza.zzm();
  }
  
  public String getCurrentScreenName()
  {
    return this.zza.zzn();
  }
  
  public String getGmpAppId()
  {
    return this.zza.zzo();
  }
  
  public int getMaxUserProperties(String paramString)
  {
    return this.zza.zza(paramString);
  }
  
  public Map<String, Object> getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    return this.zza.zzq(paramString1, paramString2, paramBoolean);
  }
  
  public void logEvent(String paramString1, String paramString2, Bundle paramBundle)
  {
    this.zza.zzy(paramString1, paramString2, paramBundle);
  }
  
  public void logEventNoInterceptor(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    this.zza.zzz(paramString1, paramString2, paramBundle, paramLong);
  }
  
  public void performAction(Bundle paramBundle)
  {
    this.zza.zzc(paramBundle, false);
  }
  
  public Bundle performActionWithResponse(Bundle paramBundle)
  {
    return this.zza.zzc(paramBundle, true);
  }
  
  public void registerOnMeasurementEventListener(OnEventListener paramOnEventListener)
  {
    this.zza.zzB(paramOnEventListener);
  }
  
  public void setConditionalUserProperty(Bundle paramBundle)
  {
    this.zza.zzD(paramBundle);
  }
  
  public void setConsent(Bundle paramBundle)
  {
    this.zza.zzE(paramBundle);
  }
  
  public void setCurrentScreen(Activity paramActivity, String paramString1, String paramString2)
  {
    this.zza.zzG(paramActivity, paramString1, paramString2);
  }
  
  public void setEventInterceptor(EventInterceptor paramEventInterceptor)
  {
    this.zza.zzJ(paramEventInterceptor);
  }
  
  public void setMeasurementEnabled(Boolean paramBoolean)
  {
    this.zza.zzK(paramBoolean);
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    this.zza.zzK(Boolean.valueOf(paramBoolean));
  }
  
  public void setUserProperty(String paramString1, String paramString2, Object paramObject)
  {
    this.zza.zzN(paramString1, paramString2, paramObject, true);
  }
  
  public void unregisterOnMeasurementEventListener(OnEventListener paramOnEventListener)
  {
    this.zza.zzO(paramOnEventListener);
  }
  
  public final void zza(boolean paramBoolean)
  {
    this.zza.zzH(paramBoolean);
  }
  
  public static final class ConditionalUserProperty
  {
    public static final String ACTIVE = "active";
    public static final String CREATION_TIMESTAMP = "creation_timestamp";
    public static final String EXPIRED_EVENT_NAME = "expired_event_name";
    public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
    public static final String NAME = "name";
    public static final String ORIGIN = "origin";
    public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
    public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
    public static final String TIME_TO_LIVE = "time_to_live";
    public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
    public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
    public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
    public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
    public static final String TRIGGER_TIMEOUT = "trigger_timeout";
    public static final String VALUE = "value";
  }
  
  public static abstract interface EventInterceptor
    extends zzhi
  {
    public abstract void interceptEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong);
  }
  
  public static abstract interface OnEventListener
    extends zzhj
  {
    public abstract void onEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\measurement\api\AppMeasurementSdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */