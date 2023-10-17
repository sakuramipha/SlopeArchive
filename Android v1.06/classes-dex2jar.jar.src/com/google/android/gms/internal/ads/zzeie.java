package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeie
  extends zzbpx
{
  private final String zza;
  private final zzbpv zzb;
  private final zzcal zzc;
  private final JSONObject zzd;
  private final long zze;
  private boolean zzf;
  
  public zzeie(String paramString, zzbpv paramzzbpv, zzcal paramzzcal, long paramLong)
  {
    JSONObject localJSONObject = new JSONObject();
    this.zzd = localJSONObject;
    this.zzf = false;
    this.zzc = paramzzcal;
    this.zza = paramString;
    this.zzb = paramzzbpv;
    this.zze = paramLong;
    try
    {
      localJSONObject.put("adapter_version", paramzzbpv.zzf().toString());
      localJSONObject.put("sdk_version", paramzzbpv.zzg().toString());
      localJSONObject.put("name", paramString);
      return;
    }
    catch (JSONException|NullPointerException|RemoteException paramString)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static void zzb(String paramString, zzcal paramzzcal)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 29	org/json/JSONObject
    //   6: astore_2
    //   7: aload_2
    //   8: invokespecial 30	org/json/JSONObject:<init>	()V
    //   11: aload_2
    //   12: ldc 66
    //   14: aload_0
    //   15: invokevirtual 59	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   18: pop
    //   19: aload_2
    //   20: ldc 70
    //   22: ldc 72
    //   24: invokevirtual 59	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   27: pop
    //   28: getstatic 78	com/google/android/gms/internal/ads/zzbbk:zzbw	Lcom/google/android/gms/internal/ads/zzbbc;
    //   31: astore_0
    //   32: invokestatic 83	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   35: aload_0
    //   36: invokevirtual 88	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   39: checkcast 90	java/lang/Boolean
    //   42: invokevirtual 94	java/lang/Boolean:booleanValue	()Z
    //   45: ifeq +11 -> 56
    //   48: aload_2
    //   49: ldc 96
    //   51: iconst_1
    //   52: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_1
    //   57: aload_2
    //   58: invokevirtual 104	com/google/android/gms/internal/ads/zzcal:zzd	(Ljava/lang/Object;)Z
    //   61: pop
    //   62: ldc 2
    //   64: monitorexit
    //   65: return
    //   66: astore_0
    //   67: ldc 2
    //   69: monitorexit
    //   70: return
    //   71: astore_0
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload_0
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	paramString	String
    //   0	77	1	paramzzcal	zzcal
    //   6	52	2	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   11	56	66	org/json/JSONException
    //   56	62	66	org/json/JSONException
    //   3	11	71	finally
    //   11	56	71	finally
    //   56	62	71	finally
  }
  
  private final void zzh(String paramString, int paramInt)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.zzf;
        if (bool) {
          return;
        }
      }
      finally {}
      try
      {
        this.zzd.put("signal_error", paramString);
        paramString = zzbbk.zzbx;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          this.zzd.put("latency", zzt.zzB().elapsedRealtime() - this.zze);
        }
        paramString = zzbbk.zzbw;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          this.zzd.put("signal_error_code", paramInt);
        }
      }
      catch (JSONException paramString) {}
    }
    this.zzc.zzd(this.zzd);
    this.zzf = true;
  }
  
  public final void zzc()
  {
    try
    {
      zzh("Signal collection timeout.", 3);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void zzd()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/google/android/gms/internal/ads/zzeie:zzf	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: getstatic 78	com/google/android/gms/internal/ads/zzbbk:zzbw	Lcom/google/android/gms/internal/ads/zzbbc;
    //   17: astore_2
    //   18: invokestatic 83	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   21: aload_2
    //   22: invokevirtual 88	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   25: checkcast 90	java/lang/Boolean
    //   28: invokevirtual 94	java/lang/Boolean:booleanValue	()Z
    //   31: ifeq +14 -> 45
    //   34: aload_0
    //   35: getfield 32	com/google/android/gms/internal/ads/zzeie:zzd	Lorg/json/JSONObject;
    //   38: ldc 96
    //   40: iconst_0
    //   41: invokevirtual 99	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   44: pop
    //   45: aload_0
    //   46: getfield 36	com/google/android/gms/internal/ads/zzeie:zzc	Lcom/google/android/gms/internal/ads/zzcal;
    //   49: aload_0
    //   50: getfield 32	com/google/android/gms/internal/ads/zzeie:zzd	Lorg/json/JSONObject;
    //   53: invokevirtual 104	com/google/android/gms/internal/ads/zzcal:zzd	(Ljava/lang/Object;)Z
    //   56: pop
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield 34	com/google/android/gms/internal/ads/zzeie:zzf	Z
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_2
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_2
    //   69: athrow
    //   70: astore_2
    //   71: goto -26 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	zzeie
    //   6	2	1	bool	boolean
    //   17	5	2	localzzbbc	zzbbc
    //   65	4	2	localObject	Object
    //   70	1	2	localJSONException	JSONException
    // Exception table:
    //   from	to	target	type
    //   2	7	65	finally
    //   14	45	65	finally
    //   45	62	65	finally
    //   14	45	70	org/json/JSONException
  }
  
  public final void zze(String paramString)
    throws RemoteException
  {
    for (;;)
    {
      try
      {
        boolean bool = this.zzf;
        if (bool) {
          return;
        }
        if (paramString == null)
        {
          zzf("Adapter returned null signals");
          return;
        }
      }
      finally {}
      try
      {
        this.zzd.put("signals", paramString);
        paramString = zzbbk.zzbx;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          this.zzd.put("latency", zzt.zzB().elapsedRealtime() - this.zze);
        }
        paramString = zzbbk.zzbw;
        if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          this.zzd.put("signal_error_code", 0);
        }
      }
      catch (JSONException paramString) {}
    }
    this.zzc.zzd(this.zzd);
    this.zzf = true;
  }
  
  public final void zzf(String paramString)
    throws RemoteException
  {
    try
    {
      zzh(paramString, 2);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void zzg(zze paramzze)
    throws RemoteException
  {
    try
    {
      zzh(paramzze.zzb, 2);
      return;
    }
    finally
    {
      paramzze = finally;
      throw paramzze;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */