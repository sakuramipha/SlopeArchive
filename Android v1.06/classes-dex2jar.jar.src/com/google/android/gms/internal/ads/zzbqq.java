package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbqq
  extends zzbqy
{
  private final Map zza;
  private final Context zzb;
  private final String zzc;
  private final long zzd;
  private final long zze;
  private final String zzf;
  private final String zzg;
  
  public zzbqq(zzcfb paramzzcfb, Map paramMap)
  {
    super(paramzzcfb, "createCalendarEvent");
    this.zza = paramMap;
    this.zzb = paramzzcfb.zzi();
    this.zzc = zze("description");
    this.zzf = zze("summary");
    this.zzd = zzd("start_ticks");
    this.zze = zzd("end_ticks");
    this.zzg = zze("location");
  }
  
  private final long zzd(String paramString)
  {
    paramString = (String)this.zza.get(paramString);
    long l1 = -1L;
    if (paramString == null) {
      return -1L;
    }
    try
    {
      long l2 = Long.parseLong(paramString);
      l1 = l2;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return l1;
  }
  
  private final String zze(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)this.zza.get(paramString))) {
      paramString = "";
    } else {
      paramString = (String)this.zza.get(paramString);
    }
    return paramString;
  }
  
  final Intent zzb()
  {
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", this.zzc);
    localIntent.putExtra("eventLocation", this.zzg);
    localIntent.putExtra("description", this.zzf);
    long l = this.zzd;
    if (l > -1L) {
      localIntent.putExtra("beginTime", l);
    }
    l = this.zze;
    if (l > -1L) {
      localIntent.putExtra("endTime", l);
    }
    localIntent.setFlags(268435456);
    return localIntent;
  }
  
  public final void zzc()
  {
    if (this.zzb == null)
    {
      zzg("Activity context is not available.");
      return;
    }
    zzt.zzp();
    if (!new zzbau(this.zzb).zzb())
    {
      zzg("This feature is not available on the device.");
      return;
    }
    zzt.zzp();
    AlertDialog.Builder localBuilder = zzs.zzG(this.zzb);
    Resources localResources = zzt.zzo().zzd();
    String str;
    if (localResources != null) {
      str = localResources.getString(R.string.s5);
    } else {
      str = "Create calendar event";
    }
    localBuilder.setTitle(str);
    if (localResources != null) {
      str = localResources.getString(R.string.s6);
    } else {
      str = "Allow Ad to create a calendar event?";
    }
    localBuilder.setMessage(str);
    if (localResources != null) {
      str = localResources.getString(R.string.s3);
    } else {
      str = "Accept";
    }
    localBuilder.setPositiveButton(str, new zzbqo(this));
    if (localResources != null) {
      str = localResources.getString(R.string.s4);
    } else {
      str = "Decline";
    }
    localBuilder.setNegativeButton(str, new zzbqp(this));
    localBuilder.create().show();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */