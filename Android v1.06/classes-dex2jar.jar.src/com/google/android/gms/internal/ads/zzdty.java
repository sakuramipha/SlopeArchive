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

public final class zzdty
  implements SensorEventListener
{
  private final Context zza;
  @Nullable
  private SensorManager zzb;
  private Sensor zzc;
  private long zzd;
  private int zze;
  private zzdtx zzf;
  private boolean zzg;
  
  zzdty(Context paramContext)
  {
    this.zza = paramContext;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    Object localObject = zzbbk.zziv;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      float f1 = paramSensorEvent.values[0];
      float f3 = paramSensorEvent.values[1];
      float f2 = paramSensorEvent.values[2];
      f1 /= 9.80665F;
      f3 /= 9.80665F;
      f2 /= 9.80665F;
      f1 = (float)Math.sqrt(f1 * f1 + f3 * f3 + f2 * f2);
      paramSensorEvent = zzbbk.zziw;
      if (f1 < ((Float)zzba.zzc().zzb(paramSensorEvent)).floatValue()) {
        return;
      }
      long l1 = zzt.zzB().currentTimeMillis();
      long l2 = this.zzd;
      paramSensorEvent = zzbbk.zzix;
      if (l2 + ((Integer)zzba.zzc().zzb(paramSensorEvent)).intValue() > l1) {
        return;
      }
      l2 = this.zzd;
      paramSensorEvent = zzbbk.zziy;
      if (l2 + ((Integer)zzba.zzc().zzb(paramSensorEvent)).intValue() < l1) {
        this.zze = 0;
      }
      zze.zza("Shake detected.");
      this.zzd = l1;
      int i = this.zze + 1;
      this.zze = i;
      localObject = this.zzf;
      if (localObject != null)
      {
        paramSensorEvent = zzbbk.zziz;
        if (i == ((Integer)zzba.zzc().zzb(paramSensorEvent)).intValue())
        {
          paramSensorEvent = (zzdsz)localObject;
          paramSensorEvent.zzh(new zzdsw(paramSensorEvent), zzdsy.zzc);
        }
      }
    }
  }
  
  public final void zza()
  {
    try
    {
      if (this.zzg)
      {
        SensorManager localSensorManager = this.zzb;
        if (localSensorManager != null)
        {
          localSensorManager.unregisterListener(this, this.zzc);
          zze.zza("Stopped listening for shake gestures.");
        }
        this.zzg = false;
      }
      return;
    }
    finally {}
  }
  
  public final void zzb()
  {
    try
    {
      Object localObject1 = zzbbk.zziv;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
        return;
      }
      if (this.zzb == null)
      {
        localObject1 = (SensorManager)this.zza.getSystemService("sensor");
        this.zzb = ((SensorManager)localObject1);
        if (localObject1 == null)
        {
          zzbzt.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
          return;
        }
        this.zzc = ((SensorManager)localObject1).getDefaultSensor(1);
      }
      if (!this.zzg)
      {
        localObject1 = this.zzb;
        if (localObject1 != null)
        {
          Sensor localSensor = this.zzc;
          if (localSensor != null)
          {
            ((SensorManager)localObject1).registerListener(this, localSensor, 2);
            long l = zzt.zzB().currentTimeMillis();
            localObject1 = zzbbk.zzix;
            this.zzd = (l - ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue());
            this.zzg = true;
            zze.zza("Listening for shake gestures.");
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void zzc(zzdtx paramzzdtx)
  {
    this.zzf = paramzzdtx;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */