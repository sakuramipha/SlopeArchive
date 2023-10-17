package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;
import java.util.Objects;

public final class zzee
  implements SurfaceTexture.OnFrameAvailableListener, Runnable
{
  private static final int[] zza = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
  private final Handler zzb;
  private final int[] zzc;
  private EGLDisplay zzd;
  private EGLContext zze;
  private EGLSurface zzf;
  private SurfaceTexture zzg;
  
  public zzee(Handler paramHandler, zzed paramzzed)
  {
    this.zzb = paramHandler;
    this.zzc = new int[1];
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    this.zzb.post(this);
  }
  
  public final void run()
  {
    SurfaceTexture localSurfaceTexture = this.zzg;
    if (localSurfaceTexture != null) {}
    try
    {
      localSurfaceTexture.updateTexImage();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
  }
  
  public final SurfaceTexture zza()
  {
    SurfaceTexture localSurfaceTexture = this.zzg;
    Objects.requireNonNull(localSurfaceTexture);
    return localSurfaceTexture;
  }
  
  public final void zzb(int paramInt)
    throws zzef
  {
    Object localObject1 = EGL14.eglGetDisplay(0);
    boolean bool1;
    if (localObject1 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzeg.zza(bool1, "eglGetDisplay failed");
    Object localObject2 = new int[2];
    zzeg.zza(EGL14.eglInitialize((EGLDisplay)localObject1, (int[])localObject2, 0, (int[])localObject2, 1), "eglInitialize failed");
    this.zzd = ((EGLDisplay)localObject1);
    localObject2 = new EGLConfig[1];
    Object localObject3 = new int[1];
    boolean bool2 = EGL14.eglChooseConfig((EGLDisplay)localObject1, zza, 0, (EGLConfig[])localObject2, 0, 1, (int[])localObject3, 0);
    if ((bool2) && (localObject3[0] > 0) && (localObject2[0] != null)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    int i = localObject3[0];
    localObject1 = localObject2[0];
    zzeg.zza(bool1, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i), localObject1 }));
    localObject2 = localObject2[0];
    localObject3 = this.zzd;
    if (paramInt == 0)
    {
      localObject1 = new int[3];
      Object tmp176_174 = localObject1;
      tmp176_174[0] = '゘';
      Object tmp182_176 = tmp176_174;
      tmp182_176[1] = 2;
      Object tmp186_182 = tmp182_176;
      tmp186_182[2] = '〸';
      tmp186_182;
    }
    else
    {
      localObject1 = new int[5];
      Object tmp203_201 = localObject1;
      tmp203_201[0] = '゘';
      Object tmp209_203 = tmp203_201;
      tmp209_203[1] = 2;
      Object tmp213_209 = tmp209_203;
      tmp213_209[2] = '㋀';
      Object tmp219_213 = tmp213_209;
      tmp219_213[3] = 1;
      Object tmp223_219 = tmp219_213;
      tmp223_219[4] = '〸';
      tmp223_219;
    }
    EGLContext localEGLContext = EGL14.eglCreateContext((EGLDisplay)localObject3, (EGLConfig)localObject2, EGL14.EGL_NO_CONTEXT, (int[])localObject1, 0);
    if (localEGLContext != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzeg.zza(bool1, "eglCreateContext failed");
    this.zze = localEGLContext;
    localObject3 = this.zzd;
    if (paramInt == 1)
    {
      localObject1 = EGL14.EGL_NO_SURFACE;
    }
    else
    {
      if (paramInt == 2)
      {
        localObject1 = new int[7];
        Object tmp301_299 = localObject1;
        tmp301_299[0] = 'し';
        Object tmp307_301 = tmp301_299;
        tmp307_301[1] = 1;
        Object tmp311_307 = tmp307_301;
        tmp311_307[2] = 'ざ';
        Object tmp317_311 = tmp311_307;
        tmp317_311[3] = 1;
        Object tmp321_317 = tmp317_311;
        tmp321_317[4] = '㋀';
        Object tmp327_321 = tmp321_317;
        tmp327_321[5] = 1;
        Object tmp331_327 = tmp327_321;
        tmp331_327[6] = '〸';
        tmp331_327;
      }
      else
      {
        localObject1 = new int[5];
        Object tmp349_347 = localObject1;
        tmp349_347[0] = 'し';
        Object tmp355_349 = tmp349_347;
        tmp355_349[1] = 1;
        Object tmp359_355 = tmp355_349;
        tmp359_355[2] = 'ざ';
        Object tmp365_359 = tmp359_355;
        tmp365_359[3] = 1;
        Object tmp369_365 = tmp365_359;
        tmp369_365[4] = '〸';
        tmp369_365;
      }
      localObject1 = EGL14.eglCreatePbufferSurface((EGLDisplay)localObject3, (EGLConfig)localObject2, (int[])localObject1, 0);
      if (localObject1 != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      zzeg.zza(bool1, "eglCreatePbufferSurface failed");
    }
    zzeg.zza(EGL14.eglMakeCurrent((EGLDisplay)localObject3, (EGLSurface)localObject1, (EGLSurface)localObject1, localEGLContext), "eglMakeCurrent failed");
    this.zzf = ((EGLSurface)localObject1);
    GLES20.glGenTextures(1, this.zzc, 0);
    localObject1 = new StringBuilder();
    for (paramInt = 0;; paramInt = 1)
    {
      i = GLES20.glGetError();
      if (i == 0) {
        break;
      }
      if (paramInt != 0) {
        ((StringBuilder)localObject1).append('\n');
      }
      ((StringBuilder)localObject1).append("glError: ");
      ((StringBuilder)localObject1).append(GLU.gluErrorString(i));
    }
    if (paramInt == 0)
    {
      localObject1 = new SurfaceTexture(this.zzc[0]);
      this.zzg = ((SurfaceTexture)localObject1);
      ((SurfaceTexture)localObject1).setOnFrameAvailableListener(this);
      return;
    }
    throw new zzef(((StringBuilder)localObject1).toString());
  }
  
  public final void zzc()
  {
    this.zzb.removeCallbacks(this);
    try
    {
      Object localObject1 = this.zzg;
      if (localObject1 != null)
      {
        ((SurfaceTexture)localObject1).release();
        GLES20.glDeleteTextures(1, this.zzc, 0);
      }
      localObject1 = this.zzd;
      if ((localObject1 != null) && (!((EGLDisplay)localObject1).equals(EGL14.EGL_NO_DISPLAY))) {
        EGL14.eglMakeCurrent(this.zzd, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
      }
      localObject1 = this.zzf;
      if ((localObject1 != null) && (!((EGLSurface)localObject1).equals(EGL14.EGL_NO_SURFACE))) {
        EGL14.eglDestroySurface(this.zzd, this.zzf);
      }
      localObject1 = this.zze;
      if (localObject1 != null) {
        EGL14.eglDestroyContext(this.zzd, (EGLContext)localObject1);
      }
      i = zzfn.zza;
      EGL14.eglReleaseThread();
      localObject1 = this.zzd;
      if ((localObject1 != null) && (!((EGLDisplay)localObject1).equals(EGL14.EGL_NO_DISPLAY))) {
        EGL14.eglTerminate(this.zzd);
      }
      this.zzd = null;
      this.zze = null;
      this.zzf = null;
      this.zzg = null;
      return;
    }
    finally
    {
      Object localObject3 = this.zzd;
      if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY))) {
        EGL14.eglMakeCurrent(this.zzd, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
      }
      localObject3 = this.zzf;
      if ((localObject3 != null) && (!((EGLSurface)localObject3).equals(EGL14.EGL_NO_SURFACE))) {
        EGL14.eglDestroySurface(this.zzd, this.zzf);
      }
      localObject3 = this.zze;
      if (localObject3 != null) {
        EGL14.eglDestroyContext(this.zzd, (EGLContext)localObject3);
      }
      int i = zzfn.zza;
      EGL14.eglReleaseThread();
      localObject3 = this.zzd;
      if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY))) {
        EGL14.eglTerminate(this.zzd);
      }
      this.zzd = null;
      this.zze = null;
      this.zzf = null;
      this.zzg = null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */