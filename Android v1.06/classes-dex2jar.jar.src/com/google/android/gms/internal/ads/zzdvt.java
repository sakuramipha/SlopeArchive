package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzdvt
  extends zzdvn
{
  private String zzg;
  private int zzh = 1;
  
  zzdvt(Context paramContext)
  {
    this.zzf = new zzbtg(paramContext, zzt.zzt().zzb(), this, this);
  }
  
  /* Error */
  public final void onConnected(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	com/google/android/gms/internal/ads/zzdvt:zzb	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 50	com/google/android/gms/internal/ads/zzdvt:zzd	Z
    //   11: ifne +182 -> 193
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 50	com/google/android/gms/internal/ads/zzdvt:zzd	Z
    //   19: aload_0
    //   20: getfield 15	com/google/android/gms/internal/ads/zzdvt:zzh	I
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_2
    //   26: if_icmpne +40 -> 66
    //   29: aload_0
    //   30: getfield 36	com/google/android/gms/internal/ads/zzdvt:zzf	Lcom/google/android/gms/internal/ads/zzbtg;
    //   33: invokevirtual 54	com/google/android/gms/internal/ads/zzbtg:zzp	()Lcom/google/android/gms/internal/ads/zzbts;
    //   36: astore 5
    //   38: aload_0
    //   39: getfield 58	com/google/android/gms/internal/ads/zzdvt:zze	Lcom/google/android/gms/internal/ads/zzbug;
    //   42: astore 4
    //   44: new 60	com/google/android/gms/internal/ads/zzdvm
    //   47: astore_3
    //   48: aload_3
    //   49: aload_0
    //   50: invokespecial 63	com/google/android/gms/internal/ads/zzdvm:<init>	(Lcom/google/android/gms/internal/ads/zzdvn;)V
    //   53: aload 5
    //   55: aload 4
    //   57: aload_3
    //   58: invokeinterface 68 3 0
    //   63: goto +130 -> 193
    //   66: iload_2
    //   67: iconst_3
    //   68: if_icmpne +41 -> 109
    //   71: aload_0
    //   72: getfield 36	com/google/android/gms/internal/ads/zzdvt:zzf	Lcom/google/android/gms/internal/ads/zzbtg;
    //   75: invokevirtual 54	com/google/android/gms/internal/ads/zzbtg:zzp	()Lcom/google/android/gms/internal/ads/zzbts;
    //   78: astore 4
    //   80: aload_0
    //   81: getfield 70	com/google/android/gms/internal/ads/zzdvt:zzg	Ljava/lang/String;
    //   84: astore_3
    //   85: new 60	com/google/android/gms/internal/ads/zzdvm
    //   88: astore 5
    //   90: aload 5
    //   92: aload_0
    //   93: invokespecial 63	com/google/android/gms/internal/ads/zzdvm:<init>	(Lcom/google/android/gms/internal/ads/zzdvn;)V
    //   96: aload 4
    //   98: aload_3
    //   99: aload 5
    //   101: invokeinterface 73 3 0
    //   106: goto +87 -> 193
    //   109: aload_0
    //   110: getfield 77	com/google/android/gms/internal/ads/zzdvt:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   113: astore 4
    //   115: new 79	com/google/android/gms/internal/ads/zzdwc
    //   118: astore_3
    //   119: aload_3
    //   120: iconst_1
    //   121: invokespecial 82	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   124: aload 4
    //   126: aload_3
    //   127: invokevirtual 87	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   130: pop
    //   131: goto +62 -> 193
    //   134: astore_3
    //   135: invokestatic 91	com/google/android/gms/ads/internal/zzt:zzo	()Lcom/google/android/gms/internal/ads/zzbzc;
    //   138: aload_3
    //   139: ldc 93
    //   141: invokevirtual 99	com/google/android/gms/internal/ads/zzbzc:zzu	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   144: aload_0
    //   145: getfield 77	com/google/android/gms/internal/ads/zzdvt:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   148: astore_3
    //   149: new 79	com/google/android/gms/internal/ads/zzdwc
    //   152: astore 4
    //   154: aload 4
    //   156: iconst_1
    //   157: invokespecial 82	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   160: aload_3
    //   161: aload 4
    //   163: invokevirtual 87	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   166: pop
    //   167: goto +26 -> 193
    //   170: astore_3
    //   171: aload_0
    //   172: getfield 77	com/google/android/gms/internal/ads/zzdvt:zza	Lcom/google/android/gms/internal/ads/zzcal;
    //   175: astore 4
    //   177: new 79	com/google/android/gms/internal/ads/zzdwc
    //   180: astore_3
    //   181: aload_3
    //   182: iconst_1
    //   183: invokespecial 82	com/google/android/gms/internal/ads/zzdwc:<init>	(I)V
    //   186: aload 4
    //   188: aload_3
    //   189: invokevirtual 87	com/google/android/gms/internal/ads/zzcal:zze	(Ljava/lang/Throwable;)Z
    //   192: pop
    //   193: aload_1
    //   194: monitorexit
    //   195: return
    //   196: astore_3
    //   197: aload_1
    //   198: monitorexit
    //   199: aload_3
    //   200: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	zzdvt
    //   0	201	1	paramBundle	android.os.Bundle
    //   23	46	2	i	int
    //   47	80	3	localObject1	Object
    //   134	5	3	localThrowable	Throwable
    //   148	13	3	localzzcal	zzcal
    //   170	1	3	localRemoteException	android.os.RemoteException
    //   180	9	3	localzzdwc	zzdwc
    //   196	4	3	localObject2	Object
    //   42	145	4	localObject3	Object
    //   36	64	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   19	24	134	finally
    //   29	63	134	finally
    //   71	106	134	finally
    //   109	131	134	finally
    //   19	24	170	android/os/RemoteException
    //   19	24	170	java/lang/IllegalArgumentException
    //   29	63	170	android/os/RemoteException
    //   29	63	170	java/lang/IllegalArgumentException
    //   71	106	170	android/os/RemoteException
    //   71	106	170	java/lang/IllegalArgumentException
    //   109	131	170	android/os/RemoteException
    //   109	131	170	java/lang/IllegalArgumentException
    //   7	19	196	finally
    //   135	167	196	finally
    //   171	193	196	finally
    //   193	195	196	finally
    //   197	199	196	finally
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzbzt.zze("Cannot connect to remote service, fallback to local instance.");
    this.zza.zze(new zzdwc(1));
  }
  
  public final zzfwb zzb(zzbug paramzzbug)
  {
    synchronized (this.zzb)
    {
      int i = this.zzh;
      if ((i != 1) && (i != 2))
      {
        paramzzbug = new com/google/android/gms/internal/ads/zzdwc;
        paramzzbug.<init>(2);
        paramzzbug = zzfvr.zzg(paramzzbug);
        return paramzzbug;
      }
      if (this.zzc)
      {
        paramzzbug = this.zza;
        return paramzzbug;
      }
      this.zzh = 2;
      this.zzc = true;
      this.zze = paramzzbug;
      this.zzf.checkAvailabilityAndConnect();
      zzcal localzzcal = this.zza;
      paramzzbug = new com/google/android/gms/internal/ads/zzdvs;
      paramzzbug.<init>(this);
      localzzcal.zzc(paramzzbug, zzcag.zzf);
      paramzzbug = this.zza;
      return paramzzbug;
    }
  }
  
  public final zzfwb zzc(String paramString)
  {
    synchronized (this.zzb)
    {
      int i = this.zzh;
      if ((i != 1) && (i != 3))
      {
        paramString = new com/google/android/gms/internal/ads/zzdwc;
        paramString.<init>(2);
        paramString = zzfvr.zzg(paramString);
        return paramString;
      }
      if (this.zzc)
      {
        paramString = this.zza;
        return paramString;
      }
      this.zzh = 3;
      this.zzc = true;
      this.zzg = paramString;
      this.zzf.checkAvailabilityAndConnect();
      zzcal localzzcal = this.zza;
      paramString = new com/google/android/gms/internal/ads/zzdvr;
      paramString.<init>(this);
      localzzcal.zzc(paramString, zzcag.zzf);
      paramString = this.zza;
      return paramString;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */