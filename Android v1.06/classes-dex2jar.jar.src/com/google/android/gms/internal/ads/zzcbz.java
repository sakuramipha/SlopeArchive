package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

final class zzcbz
  implements SensorEventListener
{
  private final SensorManager zza;
  private final Object zzb;
  private final Display zzc;
  private final float[] zzd;
  private final float[] zze;
  private float[] zzf;
  private Handler zzg;
  private zzcby zzh;
  
  zzcbz(Context paramContext)
  {
    this.zza = ((SensorManager)paramContext.getSystemService("sensor"));
    this.zzc = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.zzd = new float[9];
    this.zze = new float[9];
    this.zzb = new Object();
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent arg1)
  {
    float[] arrayOfFloat = ???.values;
    if ((arrayOfFloat[0] != 0.0F) || (arrayOfFloat[1] != 0.0F) || (arrayOfFloat[2] != 0.0F)) {}
    synchronized (this.zzb)
    {
      if (this.zzf == null) {
        this.zzf = new float[9];
      }
      SensorManager.getRotationMatrixFromVector(this.zzd, arrayOfFloat);
      int i = this.zzc.getRotation();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            System.arraycopy(this.zzd, 0, this.zze, 0, 9);
          } else {
            SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
          }
        }
        else {
          SensorManager.remapCoordinateSystem(this.zzd, 129, 130, this.zze);
        }
      }
      else {
        SensorManager.remapCoordinateSystem(this.zzd, 2, 129, this.zze);
      }
      ??? = this.zze;
      float f = ???[1];
      ???[1] = ???[3];
      ???[3] = f;
      f = ???[2];
      ???[2] = ???[6];
      ???[6] = f;
      f = ???[5];
      ???[5] = ???[7];
      ???[7] = f;
      synchronized (this.zzb)
      {
        System.arraycopy(this.zze, 0, this.zzf, 0, 9);
        ??? = this.zzh;
        if (??? != null) {
          ???.zza();
        }
        return;
      }
    }
  }
  
  final void zza(zzcby paramzzcby)
  {
    this.zzh = paramzzcby;
  }
  
  final void zzb()
  {
    if (this.zzg != null) {
      return;
    }
    Sensor localSensor = this.zza.getDefaultSensor(11);
    if (localSensor == null)
    {
      zzbzt.zzg("No Sensor of TYPE_ROTATION_VECTOR");
      return;
    }
    Object localObject = new HandlerThread("OrientationMonitor");
    ((HandlerThread)localObject).start();
    localObject = new zzflv(((HandlerThread)localObject).getLooper());
    this.zzg = ((Handler)localObject);
    if (!this.zza.registerListener(this, localSensor, 0, (Handler)localObject))
    {
      zzbzt.zzg("SensorManager.registerListener failed.");
      zzc();
    }
  }
  
  final void zzc()
  {
    if (this.zzg == null) {
      return;
    }
    this.zza.unregisterListener(this);
    this.zzg.post(new zzcbx(this));
    this.zzg = null;
  }
  
  final boolean zzd(float[] paramArrayOfFloat)
  {
    synchronized (this.zzb)
    {
      float[] arrayOfFloat = this.zzf;
      if (arrayOfFloat == null) {
        return false;
      }
      System.arraycopy(arrayOfFloat, 0, paramArrayOfFloat, 0, 9);
      return true;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */