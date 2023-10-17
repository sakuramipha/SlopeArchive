package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class zzcca
  extends Thread
  implements SurfaceTexture.OnFrameAvailableListener, zzcby
{
  private static final float[] zza = { -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, -1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F };
  private volatile boolean zzA;
  private volatile boolean zzB;
  private final zzcbz zzb;
  private final float[] zzc;
  private final float[] zzd;
  private final float[] zze;
  private final float[] zzf;
  private final float[] zzg;
  private final float[] zzh;
  private final float[] zzi;
  private float zzj;
  private float zzk;
  private float zzl;
  private int zzm;
  private int zzn;
  private SurfaceTexture zzo;
  private SurfaceTexture zzp;
  private int zzq;
  private int zzr;
  private int zzs;
  private final FloatBuffer zzt;
  private final CountDownLatch zzu;
  private final Object zzv;
  private EGL10 zzw;
  private EGLDisplay zzx;
  private EGLContext zzy;
  private EGLSurface zzz;
  
  public zzcca(Context paramContext)
  {
    super("SphericalVideoProcessor");
    float[] arrayOfFloat = zza;
    int i = arrayOfFloat.length;
    FloatBuffer localFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.zzt = localFloatBuffer;
    localFloatBuffer.put(arrayOfFloat).position(0);
    this.zzc = new float[9];
    this.zzd = new float[9];
    this.zze = new float[9];
    this.zzf = new float[9];
    this.zzg = new float[9];
    this.zzh = new float[9];
    this.zzi = new float[9];
    this.zzj = NaN.0F;
    paramContext = new zzcbz(paramContext);
    this.zzb = paramContext;
    paramContext.zza(this);
    this.zzu = new CountDownLatch(1);
    this.zzv = new Object();
  }
  
  private static final void zzh(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(": glError ");
      localStringBuilder.append(i);
      Log.e("SphericalVideoRenderer", localStringBuilder.toString());
    }
  }
  
  private static final void zzi(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[1] * paramArrayOfFloat3[3] + paramArrayOfFloat2[2] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[1] + paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[2] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[2] + paramArrayOfFloat2[1] * paramArrayOfFloat3[5] + paramArrayOfFloat2[2] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[3] + paramArrayOfFloat2[5] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[1] + paramArrayOfFloat2[4] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[2] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[5] * paramArrayOfFloat3[8]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[3] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[7] * paramArrayOfFloat3[4] + paramArrayOfFloat2[8] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[6] * paramArrayOfFloat3[2] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[8]);
  }
  
  private static final void zzj(float[] paramArrayOfFloat, float paramFloat)
  {
    paramArrayOfFloat[0] = 1.0F;
    paramArrayOfFloat[1] = 0.0F;
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = 0.0F;
    double d = paramFloat;
    paramArrayOfFloat[4] = ((float)Math.cos(d));
    paramArrayOfFloat[5] = ((float)-Math.sin(d));
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = ((float)Math.sin(d));
    paramArrayOfFloat[8] = ((float)Math.cos(d));
  }
  
  private static final void zzk(float[] paramArrayOfFloat, float paramFloat)
  {
    double d = paramFloat;
    paramArrayOfFloat[0] = ((float)Math.cos(d));
    paramArrayOfFloat[1] = ((float)-Math.sin(d));
    paramArrayOfFloat[2] = 0.0F;
    paramArrayOfFloat[3] = ((float)Math.sin(d));
    paramArrayOfFloat[4] = ((float)Math.cos(d));
    paramArrayOfFloat[5] = 0.0F;
    paramArrayOfFloat[6] = 0.0F;
    paramArrayOfFloat[7] = 0.0F;
    paramArrayOfFloat[8] = 1.0F;
  }
  
  private static final int zzl(int paramInt, String paramString)
  {
    int i = GLES20.glCreateShader(paramInt);
    zzh("createShader");
    if (i != 0)
    {
      GLES20.glShaderSource(i, paramString);
      zzh("shaderSource");
      GLES20.glCompileShader(i);
      zzh("compileShader");
      paramString = new int[1];
      GLES20.glGetShaderiv(i, 35713, paramString, 0);
      zzh("getShaderiv");
      if (paramString[0] == 0)
      {
        paramString = new StringBuilder();
        paramString.append("Could not compile shader ");
        paramString.append(paramInt);
        paramString.append(":");
        Log.e("SphericalVideoRenderer", paramString.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(i));
        GLES20.glDeleteShader(i);
        zzh("deleteShader");
        return 0;
      }
    }
    return i;
  }
  
  public final void onFrameAvailable(SurfaceTexture arg1)
  {
    this.zzs += 1;
    synchronized (this.zzv)
    {
      this.zzv.notifyAll();
      return;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 228	com/google/android/gms/internal/ads/zzcca:zzp	Landroid/graphics/SurfaceTexture;
    //   4: ifnull +1670 -> 1674
    //   7: invokestatic 234	javax/microedition/khronos/egl/EGLContext:getEGL	()Ljavax/microedition/khronos/egl/EGL;
    //   10: checkcast 236	javax/microedition/khronos/egl/EGL10
    //   13: astore 12
    //   15: aload_0
    //   16: aload 12
    //   18: putfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   21: aload 12
    //   23: getstatic 241	javax/microedition/khronos/egl/EGL10:EGL_DEFAULT_DISPLAY	Ljava/lang/Object;
    //   26: invokeinterface 245 2 0
    //   31: astore 12
    //   33: aload_0
    //   34: aload 12
    //   36: putfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   39: aload 12
    //   41: getstatic 250	javax/microedition/khronos/egl/EGL10:EGL_NO_DISPLAY	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   44: if_acmpne +9 -> 53
    //   47: iconst_0
    //   48: istore 7
    //   50: goto +306 -> 356
    //   53: iconst_2
    //   54: newarray <illegal type>
    //   56: astore 12
    //   58: aload_0
    //   59: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   62: aload_0
    //   63: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   66: aload 12
    //   68: invokeinterface 254 3 0
    //   73: ifne +6 -> 79
    //   76: goto -29 -> 47
    //   79: iconst_1
    //   80: newarray <illegal type>
    //   82: astore 12
    //   84: iconst_1
    //   85: anewarray 256	javax/microedition/khronos/egl/EGLConfig
    //   88: astore 13
    //   90: aload_0
    //   91: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   94: aload_0
    //   95: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   98: bipush 11
    //   100: newarray <illegal type>
    //   102: dup
    //   103: iconst_0
    //   104: sipush 12352
    //   107: iastore
    //   108: dup
    //   109: iconst_1
    //   110: iconst_4
    //   111: iastore
    //   112: dup
    //   113: iconst_2
    //   114: sipush 12324
    //   117: iastore
    //   118: dup
    //   119: iconst_3
    //   120: bipush 8
    //   122: iastore
    //   123: dup
    //   124: iconst_4
    //   125: sipush 12323
    //   128: iastore
    //   129: dup
    //   130: iconst_5
    //   131: bipush 8
    //   133: iastore
    //   134: dup
    //   135: bipush 6
    //   137: sipush 12322
    //   140: iastore
    //   141: dup
    //   142: bipush 7
    //   144: bipush 8
    //   146: iastore
    //   147: dup
    //   148: bipush 8
    //   150: sipush 12325
    //   153: iastore
    //   154: dup
    //   155: bipush 9
    //   157: bipush 16
    //   159: iastore
    //   160: dup
    //   161: bipush 10
    //   163: sipush 12344
    //   166: iastore
    //   167: aload 13
    //   169: iconst_1
    //   170: aload 12
    //   172: invokeinterface 260 6 0
    //   177: ifne +9 -> 186
    //   180: aconst_null
    //   181: astore 12
    //   183: goto +16 -> 199
    //   186: aload 12
    //   188: iconst_0
    //   189: iaload
    //   190: ifle -10 -> 180
    //   193: aload 13
    //   195: iconst_0
    //   196: aaload
    //   197: astore 12
    //   199: aload 12
    //   201: ifnonnull +6 -> 207
    //   204: goto -157 -> 47
    //   207: aload_0
    //   208: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   211: aload_0
    //   212: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   215: aload 12
    //   217: getstatic 263	javax/microedition/khronos/egl/EGL10:EGL_NO_CONTEXT	Ljavax/microedition/khronos/egl/EGLContext;
    //   220: iconst_3
    //   221: newarray <illegal type>
    //   223: dup
    //   224: iconst_0
    //   225: sipush 12440
    //   228: iastore
    //   229: dup
    //   230: iconst_1
    //   231: iconst_2
    //   232: iastore
    //   233: dup
    //   234: iconst_2
    //   235: sipush 12344
    //   238: iastore
    //   239: invokeinterface 267 5 0
    //   244: astore 13
    //   246: aload_0
    //   247: aload 13
    //   249: putfield 269	com/google/android/gms/internal/ads/zzcca:zzy	Ljavax/microedition/khronos/egl/EGLContext;
    //   252: aload 13
    //   254: ifnull -207 -> 47
    //   257: aload 13
    //   259: getstatic 263	javax/microedition/khronos/egl/EGL10:EGL_NO_CONTEXT	Ljavax/microedition/khronos/egl/EGLContext;
    //   262: if_acmpne +6 -> 268
    //   265: goto -218 -> 47
    //   268: aload_0
    //   269: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   272: aload_0
    //   273: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   276: aload 12
    //   278: aload_0
    //   279: getfield 228	com/google/android/gms/internal/ads/zzcca:zzp	Landroid/graphics/SurfaceTexture;
    //   282: aconst_null
    //   283: invokeinterface 273 5 0
    //   288: astore 12
    //   290: aload_0
    //   291: aload 12
    //   293: putfield 275	com/google/android/gms/internal/ads/zzcca:zzz	Ljavax/microedition/khronos/egl/EGLSurface;
    //   296: aload 12
    //   298: ifnull -251 -> 47
    //   301: aload 12
    //   303: getstatic 278	javax/microedition/khronos/egl/EGL10:EGL_NO_SURFACE	Ljavax/microedition/khronos/egl/EGLSurface;
    //   306: if_acmpne +6 -> 312
    //   309: goto -262 -> 47
    //   312: aload_0
    //   313: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   316: astore 14
    //   318: aload_0
    //   319: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   322: astore 12
    //   324: aload_0
    //   325: getfield 275	com/google/android/gms/internal/ads/zzcca:zzz	Ljavax/microedition/khronos/egl/EGLSurface;
    //   328: astore 13
    //   330: aload 14
    //   332: aload 12
    //   334: aload 13
    //   336: aload 13
    //   338: aload_0
    //   339: getfield 269	com/google/android/gms/internal/ads/zzcca:zzy	Ljavax/microedition/khronos/egl/EGLContext;
    //   342: invokeinterface 282 5 0
    //   347: ifne +6 -> 353
    //   350: goto -303 -> 47
    //   353: iconst_1
    //   354: istore 7
    //   356: getstatic 288	com/google/android/gms/internal/ads/zzbbk:zzbf	Lcom/google/android/gms/internal/ads/zzbbc;
    //   359: astore 12
    //   361: invokestatic 293	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   364: aload 12
    //   366: invokevirtual 298	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   369: checkcast 300	java/lang/String
    //   372: aload 12
    //   374: invokevirtual 305	com/google/android/gms/internal/ads/zzbbc:zzm	()Ljava/lang/Object;
    //   377: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   380: ifne +19 -> 399
    //   383: invokestatic 293	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   386: aload 12
    //   388: invokevirtual 298	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   391: checkcast 300	java/lang/String
    //   394: astore 12
    //   396: goto +8 -> 404
    //   399: ldc_w 311
    //   402: astore 12
    //   404: ldc_w 312
    //   407: aload 12
    //   409: invokestatic 314	com/google/android/gms/internal/ads/zzcca:zzl	(ILjava/lang/String;)I
    //   412: istore 10
    //   414: iload 10
    //   416: ifne +9 -> 425
    //   419: iconst_0
    //   420: istore 8
    //   422: goto +205 -> 627
    //   425: getstatic 317	com/google/android/gms/internal/ads/zzbbk:zzbg	Lcom/google/android/gms/internal/ads/zzbbc;
    //   428: astore 12
    //   430: invokestatic 293	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   433: aload 12
    //   435: invokevirtual 298	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   438: checkcast 300	java/lang/String
    //   441: aload 12
    //   443: invokevirtual 305	com/google/android/gms/internal/ads/zzbbc:zzm	()Ljava/lang/Object;
    //   446: invokevirtual 309	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   449: ifne +19 -> 468
    //   452: invokestatic 293	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   455: aload 12
    //   457: invokevirtual 298	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   460: checkcast 300	java/lang/String
    //   463: astore 12
    //   465: goto +8 -> 473
    //   468: ldc_w 319
    //   471: astore 12
    //   473: ldc_w 320
    //   476: aload 12
    //   478: invokestatic 314	com/google/android/gms/internal/ads/zzcca:zzl	(ILjava/lang/String;)I
    //   481: istore 11
    //   483: iload 11
    //   485: ifne +6 -> 491
    //   488: goto -69 -> 419
    //   491: invokestatic 323	android/opengl/GLES20:glCreateProgram	()I
    //   494: istore 9
    //   496: ldc_w 325
    //   499: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   502: iload 9
    //   504: istore 8
    //   506: iload 9
    //   508: ifeq +119 -> 627
    //   511: iload 9
    //   513: iload 10
    //   515: invokestatic 329	android/opengl/GLES20:glAttachShader	(II)V
    //   518: ldc_w 331
    //   521: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   524: iload 9
    //   526: iload 11
    //   528: invokestatic 329	android/opengl/GLES20:glAttachShader	(II)V
    //   531: ldc_w 331
    //   534: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   537: iload 9
    //   539: invokestatic 334	android/opengl/GLES20:glLinkProgram	(I)V
    //   542: ldc_w 336
    //   545: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   548: iconst_1
    //   549: newarray <illegal type>
    //   551: astore 12
    //   553: iload 9
    //   555: ldc_w 337
    //   558: aload 12
    //   560: iconst_0
    //   561: invokestatic 340	android/opengl/GLES20:glGetProgramiv	(II[II)V
    //   564: ldc_w 342
    //   567: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   570: aload 12
    //   572: iconst_0
    //   573: iaload
    //   574: iconst_1
    //   575: if_icmpeq +37 -> 612
    //   578: ldc -103
    //   580: ldc_w 344
    //   583: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   586: pop
    //   587: ldc -103
    //   589: iload 9
    //   591: invokestatic 347	android/opengl/GLES20:glGetProgramInfoLog	(I)Ljava/lang/String;
    //   594: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   597: pop
    //   598: iload 9
    //   600: invokestatic 350	android/opengl/GLES20:glDeleteProgram	(I)V
    //   603: ldc_w 352
    //   606: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   609: goto -190 -> 419
    //   612: iload 9
    //   614: invokestatic 355	android/opengl/GLES20:glValidateProgram	(I)V
    //   617: ldc_w 357
    //   620: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   623: iload 9
    //   625: istore 8
    //   627: aload_0
    //   628: iload 8
    //   630: putfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   633: iload 8
    //   635: invokestatic 362	android/opengl/GLES20:glUseProgram	(I)V
    //   638: ldc_w 364
    //   641: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   644: aload_0
    //   645: getfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   648: ldc_w 366
    //   651: invokestatic 369	android/opengl/GLES20:glGetAttribLocation	(ILjava/lang/String;)I
    //   654: istore 8
    //   656: iload 8
    //   658: iconst_3
    //   659: sipush 5126
    //   662: iconst_0
    //   663: bipush 12
    //   665: aload_0
    //   666: getfield 84	com/google/android/gms/internal/ads/zzcca:zzt	Ljava/nio/FloatBuffer;
    //   669: invokestatic 373	android/opengl/GLES20:glVertexAttribPointer	(IIIZILjava/nio/Buffer;)V
    //   672: ldc_w 375
    //   675: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   678: iload 8
    //   680: invokestatic 378	android/opengl/GLES20:glEnableVertexAttribArray	(I)V
    //   683: ldc_w 380
    //   686: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   689: iconst_1
    //   690: newarray <illegal type>
    //   692: astore 12
    //   694: iconst_1
    //   695: aload 12
    //   697: iconst_0
    //   698: invokestatic 384	android/opengl/GLES20:glGenTextures	(I[II)V
    //   701: ldc_w 386
    //   704: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   707: aload 12
    //   709: iconst_0
    //   710: iaload
    //   711: istore 8
    //   713: ldc_w 387
    //   716: iload 8
    //   718: invokestatic 390	android/opengl/GLES20:glBindTexture	(II)V
    //   721: ldc_w 392
    //   724: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   727: ldc_w 387
    //   730: sipush 10240
    //   733: sipush 9729
    //   736: invokestatic 396	android/opengl/GLES20:glTexParameteri	(III)V
    //   739: ldc_w 398
    //   742: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   745: ldc_w 387
    //   748: sipush 10241
    //   751: sipush 9729
    //   754: invokestatic 396	android/opengl/GLES20:glTexParameteri	(III)V
    //   757: ldc_w 398
    //   760: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   763: ldc_w 387
    //   766: sipush 10242
    //   769: ldc_w 399
    //   772: invokestatic 396	android/opengl/GLES20:glTexParameteri	(III)V
    //   775: ldc_w 398
    //   778: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   781: ldc_w 387
    //   784: sipush 10243
    //   787: ldc_w 399
    //   790: invokestatic 396	android/opengl/GLES20:glTexParameteri	(III)V
    //   793: ldc_w 398
    //   796: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   799: aload_0
    //   800: getfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   803: ldc_w 401
    //   806: invokestatic 404	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   809: istore 9
    //   811: aload_0
    //   812: iload 9
    //   814: putfield 406	com/google/android/gms/internal/ads/zzcca:zzr	I
    //   817: iload 9
    //   819: iconst_1
    //   820: iconst_0
    //   821: bipush 9
    //   823: newarray <illegal type>
    //   825: dup
    //   826: iconst_0
    //   827: fconst_1
    //   828: fastore
    //   829: dup
    //   830: iconst_1
    //   831: fconst_0
    //   832: fastore
    //   833: dup
    //   834: iconst_2
    //   835: fconst_0
    //   836: fastore
    //   837: dup
    //   838: iconst_3
    //   839: fconst_0
    //   840: fastore
    //   841: dup
    //   842: iconst_4
    //   843: fconst_1
    //   844: fastore
    //   845: dup
    //   846: iconst_5
    //   847: fconst_0
    //   848: fastore
    //   849: dup
    //   850: bipush 6
    //   852: fconst_0
    //   853: fastore
    //   854: dup
    //   855: bipush 7
    //   857: fconst_0
    //   858: fastore
    //   859: dup
    //   860: bipush 8
    //   862: fconst_1
    //   863: fastore
    //   864: iconst_0
    //   865: invokestatic 410	android/opengl/GLES20:glUniformMatrix3fv	(IIZ[FI)V
    //   868: aload_0
    //   869: getfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   872: istore 9
    //   874: iload 7
    //   876: ifeq +739 -> 1615
    //   879: iload 9
    //   881: ifne +6 -> 887
    //   884: goto +731 -> 1615
    //   887: new 412	android/graphics/SurfaceTexture
    //   890: dup
    //   891: iload 8
    //   893: invokespecial 413	android/graphics/SurfaceTexture:<init>	(I)V
    //   896: astore 12
    //   898: aload_0
    //   899: aload 12
    //   901: putfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   904: aload 12
    //   906: aload_0
    //   907: invokevirtual 419	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   910: aload_0
    //   911: getfield 127	com/google/android/gms/internal/ads/zzcca:zzu	Ljava/util/concurrent/CountDownLatch;
    //   914: invokevirtual 422	java/util/concurrent/CountDownLatch:countDown	()V
    //   917: aload_0
    //   918: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   921: invokevirtual 424	com/google/android/gms/internal/ads/zzcbz:zzb	()V
    //   924: aload_0
    //   925: iconst_1
    //   926: putfield 426	com/google/android/gms/internal/ads/zzcca:zzA	Z
    //   929: aload_0
    //   930: getfield 428	com/google/android/gms/internal/ads/zzcca:zzB	Z
    //   933: ifne +545 -> 1478
    //   936: aload_0
    //   937: getfield 218	com/google/android/gms/internal/ads/zzcca:zzs	I
    //   940: ifle +23 -> 963
    //   943: aload_0
    //   944: getfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   947: invokevirtual 431	android/graphics/SurfaceTexture:updateTexImage	()V
    //   950: aload_0
    //   951: aload_0
    //   952: getfield 218	com/google/android/gms/internal/ads/zzcca:zzs	I
    //   955: iconst_1
    //   956: isub
    //   957: putfield 218	com/google/android/gms/internal/ads/zzcca:zzs	I
    //   960: goto -24 -> 936
    //   963: aload_0
    //   964: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   967: aload_0
    //   968: getfield 96	com/google/android/gms/internal/ads/zzcca:zzc	[F
    //   971: invokevirtual 434	com/google/android/gms/internal/ads/zzcbz:zzd	([F)Z
    //   974: ifeq +190 -> 1164
    //   977: aload_0
    //   978: getfield 111	com/google/android/gms/internal/ads/zzcca:zzj	F
    //   981: invokestatic 440	java/lang/Float:isNaN	(F)Z
    //   984: ifeq +161 -> 1145
    //   987: aload_0
    //   988: getfield 96	com/google/android/gms/internal/ads/zzcca:zzc	[F
    //   991: astore 13
    //   993: iconst_3
    //   994: newarray <illegal type>
    //   996: astore 12
    //   998: aload 12
    //   1000: iconst_0
    //   1001: fconst_0
    //   1002: fastore
    //   1003: aload 12
    //   1005: iconst_1
    //   1006: fconst_1
    //   1007: fastore
    //   1008: aload 12
    //   1010: iconst_2
    //   1011: fconst_0
    //   1012: fastore
    //   1013: iconst_3
    //   1014: newarray <illegal type>
    //   1016: astore 14
    //   1018: aload 13
    //   1020: iconst_0
    //   1021: faload
    //   1022: fstore 6
    //   1024: aload 12
    //   1026: iconst_0
    //   1027: faload
    //   1028: fstore_3
    //   1029: aload 13
    //   1031: iconst_1
    //   1032: faload
    //   1033: fstore 4
    //   1035: aload 12
    //   1037: iconst_1
    //   1038: faload
    //   1039: fstore_2
    //   1040: aload 13
    //   1042: iconst_2
    //   1043: faload
    //   1044: fstore_1
    //   1045: aload 12
    //   1047: iconst_2
    //   1048: faload
    //   1049: fstore 5
    //   1051: aload 14
    //   1053: iconst_0
    //   1054: fload 6
    //   1056: fload_3
    //   1057: fmul
    //   1058: fload 4
    //   1060: fload_2
    //   1061: fmul
    //   1062: fadd
    //   1063: fload_1
    //   1064: fload 5
    //   1066: fmul
    //   1067: fadd
    //   1068: fastore
    //   1069: aload 14
    //   1071: iconst_1
    //   1072: aload 13
    //   1074: iconst_3
    //   1075: faload
    //   1076: fload_3
    //   1077: fmul
    //   1078: aload 13
    //   1080: iconst_4
    //   1081: faload
    //   1082: fload_2
    //   1083: fmul
    //   1084: fadd
    //   1085: aload 13
    //   1087: iconst_5
    //   1088: faload
    //   1089: fload 5
    //   1091: fmul
    //   1092: fadd
    //   1093: fastore
    //   1094: aload 14
    //   1096: iconst_2
    //   1097: aload 13
    //   1099: bipush 6
    //   1101: faload
    //   1102: fload_3
    //   1103: fmul
    //   1104: aload 13
    //   1106: bipush 7
    //   1108: faload
    //   1109: fload_2
    //   1110: fmul
    //   1111: fadd
    //   1112: aload 13
    //   1114: bipush 8
    //   1116: faload
    //   1117: fload 5
    //   1119: fmul
    //   1120: fadd
    //   1121: fastore
    //   1122: aload_0
    //   1123: aload 14
    //   1125: iconst_1
    //   1126: faload
    //   1127: f2d
    //   1128: aload 14
    //   1130: iconst_0
    //   1131: faload
    //   1132: f2d
    //   1133: invokestatic 444	java/lang/Math:atan2	(DD)D
    //   1136: d2f
    //   1137: ldc_w 445
    //   1140: fsub
    //   1141: fneg
    //   1142: putfield 111	com/google/android/gms/internal/ads/zzcca:zzj	F
    //   1145: aload_0
    //   1146: getfield 106	com/google/android/gms/internal/ads/zzcca:zzh	[F
    //   1149: aload_0
    //   1150: getfield 111	com/google/android/gms/internal/ads/zzcca:zzj	F
    //   1153: aload_0
    //   1154: getfield 447	com/google/android/gms/internal/ads/zzcca:zzk	F
    //   1157: fadd
    //   1158: invokestatic 449	com/google/android/gms/internal/ads/zzcca:zzk	([FF)V
    //   1161: goto +24 -> 1185
    //   1164: aload_0
    //   1165: getfield 96	com/google/android/gms/internal/ads/zzcca:zzc	[F
    //   1168: ldc_w 450
    //   1171: invokestatic 452	com/google/android/gms/internal/ads/zzcca:zzj	([FF)V
    //   1174: aload_0
    //   1175: getfield 106	com/google/android/gms/internal/ads/zzcca:zzh	[F
    //   1178: aload_0
    //   1179: getfield 447	com/google/android/gms/internal/ads/zzcca:zzk	F
    //   1182: invokestatic 449	com/google/android/gms/internal/ads/zzcca:zzk	([FF)V
    //   1185: aload_0
    //   1186: getfield 98	com/google/android/gms/internal/ads/zzcca:zzd	[F
    //   1189: ldc_w 445
    //   1192: invokestatic 452	com/google/android/gms/internal/ads/zzcca:zzj	([FF)V
    //   1195: aload_0
    //   1196: getfield 100	com/google/android/gms/internal/ads/zzcca:zze	[F
    //   1199: aload_0
    //   1200: getfield 106	com/google/android/gms/internal/ads/zzcca:zzh	[F
    //   1203: aload_0
    //   1204: getfield 98	com/google/android/gms/internal/ads/zzcca:zzd	[F
    //   1207: invokestatic 454	com/google/android/gms/internal/ads/zzcca:zzi	([F[F[F)V
    //   1210: aload_0
    //   1211: getfield 102	com/google/android/gms/internal/ads/zzcca:zzf	[F
    //   1214: aload_0
    //   1215: getfield 96	com/google/android/gms/internal/ads/zzcca:zzc	[F
    //   1218: aload_0
    //   1219: getfield 100	com/google/android/gms/internal/ads/zzcca:zze	[F
    //   1222: invokestatic 454	com/google/android/gms/internal/ads/zzcca:zzi	([F[F[F)V
    //   1225: aload_0
    //   1226: getfield 104	com/google/android/gms/internal/ads/zzcca:zzg	[F
    //   1229: aload_0
    //   1230: getfield 456	com/google/android/gms/internal/ads/zzcca:zzl	F
    //   1233: invokestatic 452	com/google/android/gms/internal/ads/zzcca:zzj	([FF)V
    //   1236: aload_0
    //   1237: getfield 108	com/google/android/gms/internal/ads/zzcca:zzi	[F
    //   1240: aload_0
    //   1241: getfield 104	com/google/android/gms/internal/ads/zzcca:zzg	[F
    //   1244: aload_0
    //   1245: getfield 102	com/google/android/gms/internal/ads/zzcca:zzf	[F
    //   1248: invokestatic 454	com/google/android/gms/internal/ads/zzcca:zzi	([F[F[F)V
    //   1251: aload_0
    //   1252: getfield 406	com/google/android/gms/internal/ads/zzcca:zzr	I
    //   1255: iconst_1
    //   1256: iconst_0
    //   1257: aload_0
    //   1258: getfield 108	com/google/android/gms/internal/ads/zzcca:zzi	[F
    //   1261: iconst_0
    //   1262: invokestatic 410	android/opengl/GLES20:glUniformMatrix3fv	(IIZ[FI)V
    //   1265: iconst_5
    //   1266: iconst_0
    //   1267: iconst_4
    //   1268: invokestatic 459	android/opengl/GLES20:glDrawArrays	(III)V
    //   1271: ldc_w 461
    //   1274: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   1277: invokestatic 464	android/opengl/GLES20:glFinish	()V
    //   1280: aload_0
    //   1281: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   1284: aload_0
    //   1285: getfield 247	com/google/android/gms/internal/ads/zzcca:zzx	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1288: aload_0
    //   1289: getfield 275	com/google/android/gms/internal/ads/zzcca:zzz	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1292: invokeinterface 468 3 0
    //   1297: pop
    //   1298: aload_0
    //   1299: getfield 426	com/google/android/gms/internal/ads/zzcca:zzA	Z
    //   1302: ifeq +125 -> 1427
    //   1305: iconst_0
    //   1306: iconst_0
    //   1307: aload_0
    //   1308: getfield 470	com/google/android/gms/internal/ads/zzcca:zzn	I
    //   1311: aload_0
    //   1312: getfield 472	com/google/android/gms/internal/ads/zzcca:zzm	I
    //   1315: invokestatic 476	android/opengl/GLES20:glViewport	(IIII)V
    //   1318: ldc_w 478
    //   1321: invokestatic 183	com/google/android/gms/internal/ads/zzcca:zzh	(Ljava/lang/String;)V
    //   1324: aload_0
    //   1325: getfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   1328: ldc_w 480
    //   1331: invokestatic 404	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   1334: istore 10
    //   1336: aload_0
    //   1337: getfield 359	com/google/android/gms/internal/ads/zzcca:zzq	I
    //   1340: ldc_w 482
    //   1343: invokestatic 404	android/opengl/GLES20:glGetUniformLocation	(ILjava/lang/String;)I
    //   1346: istore 8
    //   1348: aload_0
    //   1349: getfield 470	com/google/android/gms/internal/ads/zzcca:zzn	I
    //   1352: istore 9
    //   1354: aload_0
    //   1355: getfield 472	com/google/android/gms/internal/ads/zzcca:zzm	I
    //   1358: istore 7
    //   1360: iload 9
    //   1362: iload 7
    //   1364: if_icmple +34 -> 1398
    //   1367: iload 10
    //   1369: ldc_w 483
    //   1372: invokestatic 487	android/opengl/GLES20:glUniform1f	(IF)V
    //   1375: iload 8
    //   1377: aload_0
    //   1378: getfield 472	com/google/android/gms/internal/ads/zzcca:zzm	I
    //   1381: i2f
    //   1382: ldc_w 483
    //   1385: fmul
    //   1386: aload_0
    //   1387: getfield 470	com/google/android/gms/internal/ads/zzcca:zzn	I
    //   1390: i2f
    //   1391: fdiv
    //   1392: invokestatic 487	android/opengl/GLES20:glUniform1f	(IF)V
    //   1395: goto +27 -> 1422
    //   1398: iload 10
    //   1400: iload 9
    //   1402: i2f
    //   1403: ldc_w 483
    //   1406: fmul
    //   1407: iload 7
    //   1409: i2f
    //   1410: fdiv
    //   1411: invokestatic 487	android/opengl/GLES20:glUniform1f	(IF)V
    //   1414: iload 8
    //   1416: ldc_w 483
    //   1419: invokestatic 487	android/opengl/GLES20:glUniform1f	(IF)V
    //   1422: aload_0
    //   1423: iconst_0
    //   1424: putfield 426	com/google/android/gms/internal/ads/zzcca:zzA	Z
    //   1427: aload_0
    //   1428: getfield 133	com/google/android/gms/internal/ads/zzcca:zzv	Ljava/lang/Object;
    //   1431: astore 12
    //   1433: aload 12
    //   1435: monitorenter
    //   1436: aload_0
    //   1437: getfield 428	com/google/android/gms/internal/ads/zzcca:zzB	Z
    //   1440: ifne +24 -> 1464
    //   1443: aload_0
    //   1444: getfield 426	com/google/android/gms/internal/ads/zzcca:zzA	Z
    //   1447: ifne +17 -> 1464
    //   1450: aload_0
    //   1451: getfield 218	com/google/android/gms/internal/ads/zzcca:zzs	I
    //   1454: ifne +10 -> 1464
    //   1457: aload_0
    //   1458: getfield 133	com/google/android/gms/internal/ads/zzcca:zzv	Ljava/lang/Object;
    //   1461: invokevirtual 490	java/lang/Object:wait	()V
    //   1464: aload 12
    //   1466: monitorexit
    //   1467: goto -538 -> 929
    //   1470: astore 13
    //   1472: aload 12
    //   1474: monitorexit
    //   1475: aload 13
    //   1477: athrow
    //   1478: aload_0
    //   1479: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   1482: invokevirtual 492	com/google/android/gms/internal/ads/zzcbz:zzc	()V
    //   1485: aload_0
    //   1486: getfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1489: aconst_null
    //   1490: invokevirtual 419	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1493: aload_0
    //   1494: aconst_null
    //   1495: putfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1498: aload_0
    //   1499: invokevirtual 495	com/google/android/gms/internal/ads/zzcca:zzg	()Z
    //   1502: pop
    //   1503: return
    //   1504: astore 12
    //   1506: ldc_w 497
    //   1509: aload 12
    //   1511: invokestatic 502	com/google/android/gms/internal/ads/zzbzt:zzh	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1514: invokestatic 507	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   1517: aload 12
    //   1519: ldc_w 509
    //   1522: invokevirtual 514	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   1525: aload_0
    //   1526: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   1529: invokevirtual 492	com/google/android/gms/internal/ads/zzcbz:zzc	()V
    //   1532: aload_0
    //   1533: getfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1536: aconst_null
    //   1537: invokevirtual 419	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1540: aload_0
    //   1541: aconst_null
    //   1542: putfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1545: aload_0
    //   1546: invokevirtual 495	com/google/android/gms/internal/ads/zzcca:zzg	()Z
    //   1549: pop
    //   1550: return
    //   1551: astore 12
    //   1553: ldc_w 516
    //   1556: invokestatic 518	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   1559: aload_0
    //   1560: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   1563: invokevirtual 492	com/google/android/gms/internal/ads/zzcbz:zzc	()V
    //   1566: aload_0
    //   1567: getfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1570: aconst_null
    //   1571: invokevirtual 419	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1574: aload_0
    //   1575: aconst_null
    //   1576: putfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1579: aload_0
    //   1580: invokevirtual 495	com/google/android/gms/internal/ads/zzcca:zzg	()Z
    //   1583: pop
    //   1584: return
    //   1585: astore 12
    //   1587: aload_0
    //   1588: getfield 117	com/google/android/gms/internal/ads/zzcca:zzb	Lcom/google/android/gms/internal/ads/zzcbz;
    //   1591: invokevirtual 492	com/google/android/gms/internal/ads/zzcbz:zzc	()V
    //   1594: aload_0
    //   1595: getfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1598: aconst_null
    //   1599: invokevirtual 419	android/graphics/SurfaceTexture:setOnFrameAvailableListener	(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   1602: aload_0
    //   1603: aconst_null
    //   1604: putfield 415	com/google/android/gms/internal/ads/zzcca:zzo	Landroid/graphics/SurfaceTexture;
    //   1607: aload_0
    //   1608: invokevirtual 495	com/google/android/gms/internal/ads/zzcca:zzg	()Z
    //   1611: pop
    //   1612: aload 12
    //   1614: athrow
    //   1615: ldc_w 520
    //   1618: aload_0
    //   1619: getfield 238	com/google/android/gms/internal/ads/zzcca:zzw	Ljavax/microedition/khronos/egl/EGL10;
    //   1622: invokeinterface 523 1 0
    //   1627: invokestatic 528	android/opengl/GLUtils:getEGLErrorString	(I)Ljava/lang/String;
    //   1630: invokestatic 532	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1633: invokevirtual 536	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1636: astore 12
    //   1638: aload 12
    //   1640: invokestatic 538	com/google/android/gms/internal/ads/zzbzt:zzg	(Ljava/lang/String;)V
    //   1643: invokestatic 507	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   1646: new 540	java/lang/Throwable
    //   1649: dup
    //   1650: aload 12
    //   1652: invokespecial 541	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   1655: ldc_w 543
    //   1658: invokevirtual 514	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   1661: aload_0
    //   1662: invokevirtual 495	com/google/android/gms/internal/ads/zzcca:zzg	()Z
    //   1665: pop
    //   1666: aload_0
    //   1667: getfield 127	com/google/android/gms/internal/ads/zzcca:zzu	Ljava/util/concurrent/CountDownLatch;
    //   1670: invokevirtual 422	java/util/concurrent/CountDownLatch:countDown	()V
    //   1673: return
    //   1674: ldc_w 545
    //   1677: invokestatic 538	com/google/android/gms/internal/ads/zzbzt:zzg	(Ljava/lang/String;)V
    //   1680: aload_0
    //   1681: getfield 127	com/google/android/gms/internal/ads/zzcca:zzu	Ljava/util/concurrent/CountDownLatch;
    //   1684: invokevirtual 422	java/util/concurrent/CountDownLatch:countDown	()V
    //   1687: return
    //   1688: astore 12
    //   1690: goto -761 -> 929
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1693	0	this	zzcca
    //   1044	20	1	f1	float
    //   1039	71	2	f2	float
    //   1028	75	3	f3	float
    //   1033	26	4	f4	float
    //   1049	69	5	f5	float
    //   1022	33	6	f6	float
    //   48	1360	7	i	int
    //   420	995	8	j	int
    //   494	907	9	k	int
    //   412	987	10	m	int
    //   481	46	11	n	int
    //   1504	14	12	localThrowable	Throwable
    //   1551	1	12	localIllegalStateException	IllegalStateException
    //   1585	28	12	localObject2	Object
    //   1636	15	12	str	String
    //   1688	1	12	localInterruptedException	InterruptedException
    //   88	1025	13	localObject3	Object
    //   1470	6	13	localObject4	Object
    //   316	813	14	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   1436	1464	1470	finally
    //   1464	1467	1470	finally
    //   1472	1475	1470	finally
    //   924	929	1504	finally
    //   929	936	1504	finally
    //   936	960	1504	finally
    //   963	998	1504	finally
    //   1013	1018	1504	finally
    //   1122	1145	1504	finally
    //   1145	1161	1504	finally
    //   1164	1185	1504	finally
    //   1185	1360	1504	finally
    //   1367	1395	1504	finally
    //   1398	1422	1504	finally
    //   1422	1427	1504	finally
    //   1427	1436	1504	finally
    //   1475	1478	1504	finally
    //   924	929	1551	java/lang/IllegalStateException
    //   929	936	1551	java/lang/IllegalStateException
    //   936	960	1551	java/lang/IllegalStateException
    //   963	998	1551	java/lang/IllegalStateException
    //   1013	1018	1551	java/lang/IllegalStateException
    //   1122	1145	1551	java/lang/IllegalStateException
    //   1145	1161	1551	java/lang/IllegalStateException
    //   1164	1185	1551	java/lang/IllegalStateException
    //   1185	1360	1551	java/lang/IllegalStateException
    //   1367	1395	1551	java/lang/IllegalStateException
    //   1398	1422	1551	java/lang/IllegalStateException
    //   1422	1427	1551	java/lang/IllegalStateException
    //   1427	1436	1551	java/lang/IllegalStateException
    //   1475	1478	1551	java/lang/IllegalStateException
    //   1506	1525	1585	finally
    //   1553	1559	1585	finally
    //   1427	1436	1688	java/lang/InterruptedException
    //   1475	1478	1688	java/lang/InterruptedException
  }
  
  public final void zza()
  {
    synchronized (this.zzv)
    {
      this.zzv.notifyAll();
      return;
    }
  }
  
  public final SurfaceTexture zzb()
  {
    if (this.zzp == null) {
      return null;
    }
    try
    {
      this.zzu.await();
      return this.zzo;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final void zzc(int paramInt1, int paramInt2)
  {
    synchronized (this.zzv)
    {
      this.zzn = paramInt1;
      this.zzm = paramInt2;
      this.zzA = true;
      this.zzv.notifyAll();
      return;
    }
  }
  
  public final void zzd(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this.zzn = paramInt1;
    this.zzm = paramInt2;
    this.zzp = paramSurfaceTexture;
  }
  
  public final void zze()
  {
    synchronized (this.zzv)
    {
      this.zzB = true;
      this.zzp = null;
      this.zzv.notifyAll();
      return;
    }
  }
  
  public final void zzf(float paramFloat1, float paramFloat2)
  {
    int j = this.zzn;
    int i = this.zzm;
    float f;
    if (j > i) {
      f = j;
    } else {
      f = i;
    }
    paramFloat2 = paramFloat2 * 1.7453293F / f;
    paramFloat1 = paramFloat1 * 1.7453293F / f;
    this.zzk -= paramFloat1;
    paramFloat2 = this.zzl - paramFloat2;
    this.zzl = paramFloat2;
    paramFloat1 = paramFloat2;
    if (paramFloat2 < -1.5707964F)
    {
      this.zzl = -1.5707964F;
      paramFloat1 = -1.5707964F;
    }
    if (paramFloat1 > 1.5707964F) {
      this.zzl = 1.5707964F;
    }
  }
  
  final boolean zzg()
  {
    Object localObject = this.zzz;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (localObject != null)
    {
      bool1 = bool2;
      if (localObject != EGL10.EGL_NO_SURFACE)
      {
        bool1 = this.zzw.eglMakeCurrent(this.zzx, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        bool1 = this.zzw.eglDestroySurface(this.zzx, this.zzz) | bool1;
        this.zzz = null;
      }
    }
    localObject = this.zzy;
    bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1 | this.zzw.eglDestroyContext(this.zzx, (EGLContext)localObject);
      this.zzy = null;
    }
    localObject = this.zzx;
    if (localObject != null)
    {
      bool1 = this.zzw.eglTerminate((EGLDisplay)localObject);
      this.zzx = null;
      return bool1 | bool2;
    }
    return bool2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */