package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class zzfhb
  extends ContentObserver
{
  private final Context zza;
  private final AudioManager zzb;
  private final zzfgz zzc;
  private float zzd;
  private final zzfhj zze;
  
  public zzfhb(Handler paramHandler, Context paramContext, zzfgz paramzzfgz, zzfhj paramzzfhj)
  {
    super(paramHandler);
    this.zza = paramContext;
    this.zzb = ((AudioManager)paramContext.getSystemService("audio"));
    this.zzc = paramzzfgz;
    this.zze = paramzzfhj;
  }
  
  private final float zzc()
  {
    int i = this.zzb.getStreamVolume(3);
    int j = this.zzb.getStreamMaxVolume(3);
    float f1 = 1.0F;
    if ((j > 0) && (i > 0))
    {
      float f2 = i / j;
      if (f2 <= 1.0F) {
        return f2;
      }
    }
    else
    {
      f1 = 0.0F;
    }
    return f1;
  }
  
  private final void zzd()
  {
    this.zze.zzd(this.zzd);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    float f = zzc();
    if (f != this.zzd)
    {
      this.zzd = f;
      zzd();
    }
  }
  
  public final void zza()
  {
    this.zzd = zzc();
    zzd();
    this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
  }
  
  public final void zzb()
  {
    this.zza.getContentResolver().unregisterContentObserver(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */