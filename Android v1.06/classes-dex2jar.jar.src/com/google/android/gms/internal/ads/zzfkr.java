package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public final class zzfkr
{
  private static final HashMap zza = new HashMap();
  private final Context zzb;
  private final zzfks zzc;
  private final zzfit zzd;
  private final zzfio zze;
  private zzfkg zzf;
  private final Object zzg = new Object();
  
  public zzfkr(Context paramContext, zzfks paramzzfks, zzfit paramzzfit, zzfio paramzzfio)
  {
    this.zzb = paramContext;
    this.zzc = paramzzfks;
    this.zzd = paramzzfit;
    this.zze = paramzzfio;
  }
  
  /* Error */
  private final Class zzd(zzfkh paramzzfkh)
    throws zzfkq
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 56	com/google/android/gms/internal/ads/zzfkh:zza	()Lcom/google/android/gms/internal/ads/zzatn;
    //   6: invokevirtual 62	com/google/android/gms/internal/ads/zzatn:zzk	()Ljava/lang/String;
    //   9: astore 4
    //   11: getstatic 27	com/google/android/gms/internal/ads/zzfkr:zza	Ljava/util/HashMap;
    //   14: astore_3
    //   15: aload_3
    //   16: aload 4
    //   18: invokevirtual 66	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 68	java/lang/Class
    //   24: astore 5
    //   26: aload 5
    //   28: ifnull +8 -> 36
    //   31: aload_0
    //   32: monitorexit
    //   33: aload 5
    //   35: areturn
    //   36: aload_0
    //   37: getfield 40	com/google/android/gms/internal/ads/zzfkr:zze	Lcom/google/android/gms/internal/ads/zzfio;
    //   40: aload_1
    //   41: invokevirtual 71	com/google/android/gms/internal/ads/zzfkh:zzc	()Ljava/io/File;
    //   44: invokevirtual 76	com/google/android/gms/internal/ads/zzfio:zza	(Ljava/io/File;)Z
    //   47: istore_2
    //   48: iload_2
    //   49: ifeq +96 -> 145
    //   52: aload_1
    //   53: invokevirtual 78	com/google/android/gms/internal/ads/zzfkh:zzb	()Ljava/io/File;
    //   56: astore 5
    //   58: aload 5
    //   60: invokevirtual 84	java/io/File:exists	()Z
    //   63: ifne +9 -> 72
    //   66: aload 5
    //   68: invokevirtual 87	java/io/File:mkdirs	()Z
    //   71: pop
    //   72: new 89	dalvik/system/DexClassLoader
    //   75: astore 6
    //   77: aload 6
    //   79: aload_1
    //   80: invokevirtual 71	com/google/android/gms/internal/ads/zzfkh:zzc	()Ljava/io/File;
    //   83: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   86: aload 5
    //   88: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   91: aconst_null
    //   92: aload_0
    //   93: getfield 34	com/google/android/gms/internal/ads/zzfkr:zzb	Landroid/content/Context;
    //   96: invokevirtual 98	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   99: invokespecial 101	dalvik/system/DexClassLoader:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   102: aload 6
    //   104: ldc 103
    //   106: invokevirtual 107	dalvik/system/DexClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   109: astore_1
    //   110: aload_3
    //   111: aload 4
    //   113: aload_1
    //   114: invokevirtual 111	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: areturn
    //   122: astore_1
    //   123: goto +8 -> 131
    //   126: astore_1
    //   127: goto +4 -> 131
    //   130: astore_1
    //   131: new 43	com/google/android/gms/internal/ads/zzfkq
    //   134: astore_3
    //   135: aload_3
    //   136: sipush 2008
    //   139: aload_1
    //   140: invokespecial 114	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   143: aload_3
    //   144: athrow
    //   145: new 43	com/google/android/gms/internal/ads/zzfkq
    //   148: astore_1
    //   149: aload_1
    //   150: sipush 2026
    //   153: ldc 116
    //   155: invokespecial 119	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/String;)V
    //   158: aload_1
    //   159: athrow
    //   160: astore_3
    //   161: new 43	com/google/android/gms/internal/ads/zzfkq
    //   164: astore_1
    //   165: aload_1
    //   166: sipush 2026
    //   169: aload_3
    //   170: invokespecial 114	com/google/android/gms/internal/ads/zzfkq:<init>	(ILjava/lang/Throwable;)V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: aload_0
    //   177: monitorexit
    //   178: aload_1
    //   179: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	this	zzfkr
    //   0	180	1	paramzzfkh	zzfkh
    //   47	2	2	bool	boolean
    //   14	130	3	localObject1	Object
    //   160	10	3	localGeneralSecurityException	java.security.GeneralSecurityException
    //   9	103	4	str	String
    //   24	63	5	localObject2	Object
    //   75	28	6	localDexClassLoader	dalvik.system.DexClassLoader
    // Exception table:
    //   from	to	target	type
    //   52	72	122	java/lang/IllegalArgumentException
    //   72	110	122	java/lang/IllegalArgumentException
    //   52	72	126	java/lang/SecurityException
    //   72	110	126	java/lang/SecurityException
    //   52	72	130	java/lang/ClassNotFoundException
    //   72	110	130	java/lang/ClassNotFoundException
    //   36	48	160	java/security/GeneralSecurityException
    //   145	160	160	java/security/GeneralSecurityException
    //   2	26	175	finally
    //   36	48	175	finally
    //   52	72	175	finally
    //   72	110	175	finally
    //   110	118	175	finally
    //   131	145	175	finally
    //   145	160	175	finally
    //   161	175	175	finally
  }
  
  public final zzfiw zza()
  {
    synchronized (this.zzg)
    {
      zzfkg localzzfkg = this.zzf;
      return localzzfkg;
    }
  }
  
  public final zzfkh zzb()
  {
    synchronized (this.zzg)
    {
      Object localObject2 = this.zzf;
      if (localObject2 != null)
      {
        localObject2 = ((zzfkg)localObject2).zzf();
        return (zzfkh)localObject2;
      }
      return null;
    }
  }
  
  public final boolean zzc(zzfkh arg1)
  {
    long l = System.currentTimeMillis();
    try
    {
      Object localObject1 = zzd(???);
      try
      {
        localObject1 = ((Class)localObject1).getDeclaredConstructor(new Class[] { Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE });
        Context localContext = this.zzb;
        byte[] arrayOfByte = ???.zze();
        Object localObject4 = new android/os/Bundle;
        ((Bundle)localObject4).<init>();
        localObject4 = ((Constructor)localObject1).newInstance(new Object[] { localContext, "msa-r", arrayOfByte, null, localObject4, Integer.valueOf(2) });
        localObject1 = new com/google/android/gms/internal/ads/zzfkg;
        ((zzfkg)localObject1).<init>(localObject4, ???, this.zzc, this.zzd);
        if (((zzfkg)localObject1).zzh())
        {
          int i = ((zzfkg)localObject1).zze();
          if (i == 0) {
            synchronized (this.zzg)
            {
              localObject4 = this.zzf;
              if (localObject4 != null) {
                try
                {
                  ((zzfkg)localObject4).zzg();
                }
                catch (zzfkq localzzfkq)
                {
                  this.zzd.zzc(localzzfkq.zza(), -1L, localzzfkq);
                }
              }
              this.zzf = ((zzfkg)localObject1);
              this.zzd.zzd(3000, System.currentTimeMillis() - l);
              return true;
            }
          }
          ??? = new com/google/android/gms/internal/ads/zzfkq;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("ci: ");
          ((StringBuilder)localObject3).append(i);
          ???.<init>(4001, ((StringBuilder)localObject3).toString());
          throw ???;
        }
        ??? = new com/google/android/gms/internal/ads/zzfkq;
        ???.<init>(4000, "init failed");
        throw ???;
      }
      catch (Exception ???)
      {
        Object localObject3 = new com/google/android/gms/internal/ads/zzfkq;
        ((zzfkq)localObject3).<init>(2004, ???);
        throw ((Throwable)localObject3);
      }
      return false;
    }
    catch (Exception ???)
    {
      this.zzd.zzc(4010, System.currentTimeMillis() - l, ???);
    }
    catch (zzfkq ???)
    {
      this.zzd.zzc(???.zza(), System.currentTimeMillis() - l, ???);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */