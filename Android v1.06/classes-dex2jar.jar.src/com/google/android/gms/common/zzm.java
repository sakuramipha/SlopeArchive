package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;

final class zzm
{
  static final zzk zza = new zze(zzi.zze("0\005È0\003° \003\002\001\002\002\024\020e\bsù/Qí"));
  static final zzk zzb = new zzf(zzi.zze("0\006\0040\003ì \003\002\001\002\002\024\003£²­×árÊkì"));
  static final zzk zzc = new zzg(zzi.zze("0\004C0\003+ \003\002\001\002\002\t\000ÂàFdJ00"));
  static final zzk zzd = new zzh(zzi.zze("0\004¨0\003 \003\002\001\002\002\t\000Õ¸l}ÓNõ0"));
  private static volatile zzaf zze;
  private static final Object zzf = new Object();
  private static Context zzg;
  
  static zzw zza(String paramString, zzi paramzzi, boolean paramBoolean1, boolean paramBoolean2)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      paramString = zzf(paramString, paramzzi, paramBoolean1, paramBoolean2);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  static zzw zzb(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      Preconditions.checkNotNull(zzg);
      try
      {
        zzg();
        Object localObject = new com/google/android/gms/common/zzn;
        ((zzn)localObject).<init>(paramString, paramBoolean1, false, ObjectWrapper.wrap(zzg), false);
        try
        {
          zzq localzzq = zze.zze((zzn)localObject);
          if (localzzq.zzb())
          {
            paramString = zzw.zzb();
          }
          else
          {
            localObject = localzzq.zza();
            paramString = (String)localObject;
            if (localObject == null) {
              paramString = "error checking package certificate";
            }
            if (localzzq.zzc() == 4)
            {
              localObject = new android/content/pm/PackageManager$NameNotFoundException;
              ((PackageManager.NameNotFoundException)localObject).<init>();
              paramString = zzw.zzd(paramString, (Throwable)localObject);
            }
            else
            {
              paramString = zzw.zzc(paramString);
            }
          }
        }
        catch (RemoteException paramString)
        {
          Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
          paramString = zzw.zzd("module call", paramString);
        }
      }
      catch (DynamiteModule.LoadingException localLoadingException)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", localLoadingException);
        paramString = String.valueOf(localLoadingException.getMessage());
        if (paramString.length() != 0) {
          paramString = "module init: ".concat(paramString);
        } else {
          paramString = new String("module init: ");
        }
        paramString = zzw.zzd(paramString, localLoadingException);
      }
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  static void zzd(Context paramContext)
  {
    try
    {
      if (zzg == null)
      {
        if (paramContext != null)
        {
          zzg = paramContext.getApplicationContext();
          return;
        }
        return;
      }
      Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
      return;
    }
    finally {}
  }
  
  /* Error */
  static boolean zze()
  {
    // Byte code:
    //   0: invokestatic 65	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: invokestatic 86	com/google/android/gms/common/zzm:zzg	()V
    //   7: getstatic 99	com/google/android/gms/common/zzm:zze	Lcom/google/android/gms/common/internal/zzaf;
    //   10: invokeinterface 225 1 0
    //   15: istore_0
    //   16: aload_2
    //   17: invokestatic 71	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   20: iload_0
    //   21: ireturn
    //   22: astore_1
    //   23: goto +23 -> 46
    //   26: astore_1
    //   27: goto +4 -> 31
    //   30: astore_1
    //   31: ldc -123
    //   33: ldc -121
    //   35: aload_1
    //   36: invokestatic 141	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   39: pop
    //   40: aload_2
    //   41: invokestatic 71	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   44: iconst_0
    //   45: ireturn
    //   46: aload_2
    //   47: invokestatic 71	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   50: aload_1
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	6	0	bool	boolean
    //   22	1	1	localObject	Object
    //   26	1	1	localRemoteException	RemoteException
    //   30	21	1	localLoadingException	DynamiteModule.LoadingException
    //   3	44	2	localThreadPolicy	StrictMode.ThreadPolicy
    // Exception table:
    //   from	to	target	type
    //   4	16	22	finally
    //   31	40	22	finally
    //   4	16	26	android/os/RemoteException
    //   4	16	30	com/google/android/gms/dynamite/DynamiteModule$LoadingException
  }
  
  private static zzw zzf(String paramString, zzi paramzzi, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      zzg();
      Preconditions.checkNotNull(zzg);
      zzs localzzs = new zzs(paramString, paramzzi, paramBoolean1, paramBoolean2);
      try
      {
        paramBoolean2 = zze.zzf(localzzs, ObjectWrapper.wrap(zzg.getPackageManager()));
        if (paramBoolean2) {
          return zzw.zzb();
        }
        return new zzv(new zzd(paramBoolean1, paramString, paramzzi), null);
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
        return zzw.zzd("module call", paramString);
      }
      return zzw.zzd(paramString, paramzzi);
    }
    catch (DynamiteModule.LoadingException paramzzi)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramzzi);
      paramString = String.valueOf(paramzzi.getMessage());
      if (paramString.length() != 0) {
        paramString = "module init: ".concat(paramString);
      } else {
        paramString = new String("module init: ");
      }
    }
  }
  
  private static void zzg()
    throws DynamiteModule.LoadingException
  {
    if (zze != null) {
      return;
    }
    Preconditions.checkNotNull(zzg);
    synchronized (zzf)
    {
      if (zze == null) {
        zze = zzae.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */