package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import javax.annotation.Nullable;

public final class zzdsl
  implements SensorEventListener
{
  @Nullable
  private final SensorManager zza;
  @Nullable
  private final Sensor zzb;
  private float zzc = 0.0F;
  private Float zzd = Float.valueOf(0.0F);
  private long zze = zzt.zzB().currentTimeMillis();
  private int zzf = 0;
  private boolean zzg = false;
  private boolean zzh = false;
  @Nullable
  private zzdsk zzi = null;
  private boolean zzj = false;
  
  zzdsl(Context paramContext)
  {
    paramContext = (SensorManager)paramContext.getSystemService("sensor");
    this.zza = paramContext;
    if (paramContext != null)
    {
      this.zzb = paramContext.getDefaultSensor(4);
      return;
    }
    this.zzb = null;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    Object localObject = zzbbk.zziA;
    if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      return;
    }
    long l1 = zzt.zzB().currentTimeMillis();
    long l2 = this.zze;
    localObject = zzbbk.zziC;
    if (l2 + ((Integer)zzba.zzc().zzb((zzbbc)localObject)).intValue() < l1)
    {
      this.zzf = 0;
      this.zze = l1;
      this.zzg = false;
      this.zzh = false;
      this.zzc = this.zzd.floatValue();
    }
    float f1 = paramSensorEvent.values[1];
    paramSensorEvent = Float.valueOf(this.zzd.floatValue() + f1 * 4.0F);
    this.zzd = paramSensorEvent;
    float f2 = paramSensorEvent.floatValue();
    f1 = this.zzc;
    paramSensorEvent = zzbbk.zziB;
    if (f2 > f1 + ((Float)zzba.zzc().zzb(paramSensorEvent)).floatValue())
    {
      this.zzc = this.zzd.floatValue();
      this.zzh = true;
    }
    else
    {
      f1 = this.zzd.floatValue();
      f2 = this.zzc;
      paramSensorEvent = zzbbk.zziB;
      if (f1 < f2 - ((Float)zzba.zzc().zzb(paramSensorEvent)).floatValue())
      {
        this.zzc = this.zzd.floatValue();
        this.zzg = true;
      }
    }
    if (this.zzd.isInfinite())
    {
      this.zzd = Float.valueOf(0.0F);
      this.zzc = 0.0F;
    }
    if ((this.zzg) && (this.zzh))
    {
      zze.zza("Flick detected.");
      this.zze = l1;
      int i = this.zzf + 1;
      this.zzf = i;
      this.zzg = false;
      this.zzh = false;
      localObject = this.zzi;
      if (localObject != null)
      {
        paramSensorEvent = zzbbk.zziD;
        if (i == ((Integer)zzba.zzc().zzb(paramSensorEvent)).intValue())
        {
          paramSensorEvent = (zzdsz)localObject;
          paramSensorEvent.zzh(new zzdsx(paramSensorEvent), zzdsy.zzc);
        }
      }
    }
  }
  
  public final void zza()
  {
    try
    {
      if (this.zzj)
      {
        SensorManager localSensorManager = this.zza;
        if (localSensorManager != null)
        {
          Sensor localSensor = this.zzb;
          if (localSensor != null)
          {
            localSensorManager.unregisterListener(this, localSensor);
            this.zzj = false;
            zze.zza("Stopped listening for flick gestures.");
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzb()
  {
    try
    {
      Object localObject1 = zzbbk.zziA;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
        return;
      }
      if (!this.zzj)
      {
        SensorManager localSensorManager = this.zza;
        if (localSensorManager != null)
        {
          localObject1 = this.zzb;
          if (localObject1 != null)
          {
            localSensorManager.registerListener(this, (Sensor)localObject1, 2);
            this.zzj = true;
            zze.zza("Listening for flick gestures.");
          }
        }
      }
      if ((this.zza != null) && (this.zzb != null)) {
        return;
      }
      zzbzt.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
      return;
    }
    finally {}
  }
  
  public final void zzc(zzdsk paramzzdsk)
  {
    this.zzi = paramzzdsk;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */