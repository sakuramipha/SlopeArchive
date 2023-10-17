package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class zzyk
{
  private static Constructor zza;
  private static Method zzb;
  private static Method zzc;
  private static Constructor zzd;
  private static Method zze;
  
  public static zzae zza(float paramFloat)
    throws Exception
  {
    zzc();
    Object localObject = zza.newInstance(new Object[0]);
    zzb.invoke(localObject, new Object[] { Float.valueOf(paramFloat) });
    localObject = zzc.invoke(localObject, new Object[0]);
    Objects.requireNonNull(localObject);
    return (zzae)localObject;
  }
  
  public static zzdk zzb()
    throws Exception
  {
    zzc();
    Object localObject = zzd.newInstance(new Object[0]);
    localObject = zze.invoke(localObject, new Object[0]);
    Objects.requireNonNull(localObject);
    return (zzdk)localObject;
  }
  
  @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
  private static void zzc()
    throws Exception
  {
    if ((zza == null) || (zzb == null) || (zzc == null))
    {
      localClass = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
      zza = localClass.getConstructor(new Class[0]);
      zzb = localClass.getMethod("setRotationDegrees", new Class[] { Float.TYPE });
      zzc = localClass.getMethod("build", new Class[0]);
    }
    if ((zzd != null) && (zze != null)) {
      return;
    }
    Class localClass = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
    zzd = localClass.getConstructor(new Class[0]);
    zze = localClass.getMethod("build", new Class[0]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */