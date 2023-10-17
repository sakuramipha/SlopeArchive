package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;

public final class zzdth
  implements zzo, zzcgm
{
  private final Context zza;
  private final zzbzz zzb;
  private zzdsz zzc;
  private zzcfb zzd;
  private boolean zze;
  private boolean zzf;
  private long zzg;
  private zzda zzh;
  private boolean zzi;
  
  zzdth(Context paramContext, zzbzz paramzzbzz)
  {
    this.zza = paramContext;
    this.zzb = paramzzbzz;
  }
  
  /* Error */
  private final boolean zzl(zzda paramzzda)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 44	com/google/android/gms/internal/ads/zzbbk:zzir	Lcom/google/android/gms/internal/ads/zzbbc;
    //   5: astore 7
    //   7: invokestatic 49	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   10: aload 7
    //   12: invokevirtual 54	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   15: checkcast 56	java/lang/Boolean
    //   18: invokevirtual 60	java/lang/Boolean:booleanValue	()Z
    //   21: ifne +25 -> 46
    //   24: ldc 62
    //   26: invokestatic 68	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   29: aload_1
    //   30: bipush 16
    //   32: aconst_null
    //   33: aconst_null
    //   34: invokestatic 73	com/google/android/gms/internal/ads/zzfba:zzd	(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;
    //   37: invokeinterface 78 2 0
    //   42: aload_0
    //   43: monitorexit
    //   44: iconst_0
    //   45: ireturn
    //   46: aload_0
    //   47: getfield 80	com/google/android/gms/internal/ads/zzdth:zzc	Lcom/google/android/gms/internal/ads/zzdsz;
    //   50: ifnonnull +25 -> 75
    //   53: ldc 62
    //   55: invokestatic 68	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   58: aload_1
    //   59: bipush 16
    //   61: aconst_null
    //   62: aconst_null
    //   63: invokestatic 73	com/google/android/gms/internal/ads/zzfba:zzd	(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;
    //   66: invokeinterface 78 2 0
    //   71: aload_0
    //   72: monitorexit
    //   73: iconst_0
    //   74: ireturn
    //   75: aload_0
    //   76: getfield 82	com/google/android/gms/internal/ads/zzdth:zze	Z
    //   79: ifne +62 -> 141
    //   82: aload_0
    //   83: getfield 84	com/google/android/gms/internal/ads/zzdth:zzf	Z
    //   86: ifne +55 -> 141
    //   89: invokestatic 90	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   92: invokeinterface 96 1 0
    //   97: lstore 5
    //   99: aload_0
    //   100: getfield 98	com/google/android/gms/internal/ads/zzdth:zzg	J
    //   103: lstore_3
    //   104: getstatic 101	com/google/android/gms/internal/ads/zzbbk:zziu	Lcom/google/android/gms/internal/ads/zzbbc;
    //   107: astore 7
    //   109: invokestatic 49	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   112: aload 7
    //   114: invokevirtual 54	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   117: checkcast 103	java/lang/Integer
    //   120: invokevirtual 107	java/lang/Integer:intValue	()I
    //   123: istore_2
    //   124: lload 5
    //   126: lload_3
    //   127: iload_2
    //   128: i2l
    //   129: ladd
    //   130: lcmp
    //   131: ifge +6 -> 137
    //   134: goto +7 -> 141
    //   137: aload_0
    //   138: monitorexit
    //   139: iconst_1
    //   140: ireturn
    //   141: ldc 109
    //   143: invokestatic 68	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   146: aload_1
    //   147: bipush 19
    //   149: aconst_null
    //   150: aconst_null
    //   151: invokestatic 73	com/google/android/gms/internal/ads/zzfba:zzd	(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;
    //   154: invokeinterface 78 2 0
    //   159: aload_0
    //   160: monitorexit
    //   161: iconst_0
    //   162: ireturn
    //   163: astore_1
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_1
    //   167: athrow
    //   168: astore_1
    //   169: goto -127 -> 42
    //   172: astore_1
    //   173: goto -102 -> 71
    //   176: astore_1
    //   177: goto -18 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	this	zzdth
    //   0	180	1	paramzzda	zzda
    //   123	5	2	i	int
    //   103	24	3	l1	long
    //   97	28	5	l2	long
    //   5	108	7	localzzbbc	zzbbc
    // Exception table:
    //   from	to	target	type
    //   2	29	163	finally
    //   29	42	163	finally
    //   46	58	163	finally
    //   58	71	163	finally
    //   75	124	163	finally
    //   141	146	163	finally
    //   146	159	163	finally
    //   29	42	168	android/os/RemoteException
    //   58	71	172	android/os/RemoteException
    //   146	159	176	android/os/RemoteException
  }
  
  public final void zza(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      zze.zza("Ad inspector loaded.");
      this.zze = true;
      zzk("");
      return;
    }
    finally {}
    zzbzt.zzj("Ad inspector failed to load.");
    try
    {
      zzda localzzda = this.zzh;
      if (localzzda != null) {
        localzzda.zze(zzfba.zzd(17, null, null));
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    this.zzi = true;
    this.zzd.destroy();
  }
  
  public final void zzb()
  {
    try
    {
      this.zzf = true;
      zzk("");
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzbF() {}
  
  public final void zzbo() {}
  
  public final void zzby() {}
  
  public final void zze() {}
  
  /* Error */
  public final void zzf(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 129	com/google/android/gms/internal/ads/zzdth:zzd	Lcom/google/android/gms/internal/ads/zzcfb;
    //   6: invokeinterface 134 1 0
    //   11: aload_0
    //   12: getfield 127	com/google/android/gms/internal/ads/zzdth:zzi	Z
    //   15: ifne +24 -> 39
    //   18: ldc -116
    //   20: invokestatic 116	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   23: aload_0
    //   24: getfield 125	com/google/android/gms/internal/ads/zzdth:zzh	Lcom/google/android/gms/ads/internal/client/zzda;
    //   27: astore_2
    //   28: aload_2
    //   29: ifnull +10 -> 39
    //   32: aload_2
    //   33: aconst_null
    //   34: invokeinterface 78 2 0
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield 84	com/google/android/gms/internal/ads/zzdth:zzf	Z
    //   44: aload_0
    //   45: iconst_0
    //   46: putfield 82	com/google/android/gms/internal/ads/zzdth:zze	Z
    //   49: aload_0
    //   50: lconst_0
    //   51: putfield 98	com/google/android/gms/internal/ads/zzdth:zzg	J
    //   54: aload_0
    //   55: iconst_0
    //   56: putfield 127	com/google/android/gms/internal/ads/zzdth:zzi	Z
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 125	com/google/android/gms/internal/ads/zzdth:zzh	Lcom/google/android/gms/ads/internal/client/zzda;
    //   64: aload_0
    //   65: monitorexit
    //   66: return
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: goto -34 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	zzdth
    //   0	76	1	paramInt	int
    //   27	6	2	localzzda	zzda
    //   67	4	2	localObject	Object
    //   72	1	2	localRemoteException	RemoteException
    // Exception table:
    //   from	to	target	type
    //   2	28	67	finally
    //   32	39	67	finally
    //   39	64	67	finally
    //   32	39	72	android/os/RemoteException
  }
  
  public final Activity zzg()
  {
    zzcfb localzzcfb = this.zzd;
    if ((localzzcfb != null) && (!localzzcfb.zzaz())) {
      return this.zzd.zzi();
    }
    return null;
  }
  
  public final void zzh(zzdsz paramzzdsz)
  {
    this.zzc = paramzzdsz;
  }
  
  /* Error */
  public final void zzj(zzda paramzzda, zzbja paramzzbja, zzbit paramzzbit)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 182	com/google/android/gms/internal/ads/zzdth:zzl	(Lcom/google/android/gms/ads/internal/client/zzda;)Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifne +6 -> 17
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 186	com/google/android/gms/ads/internal/zzt:zzz	()Lcom/google/android/gms/internal/ads/zzcfn;
    //   20: pop
    //   21: aload_0
    //   22: getfield 31	com/google/android/gms/internal/ads/zzdth:zza	Landroid/content/Context;
    //   25: astore 5
    //   27: aload_0
    //   28: getfield 33	com/google/android/gms/internal/ads/zzdth:zzb	Lcom/google/android/gms/internal/ads/zzbzz;
    //   31: astore 6
    //   33: aload 5
    //   35: invokestatic 191	com/google/android/gms/internal/ads/zzcgq:zza	()Lcom/google/android/gms/internal/ads/zzcgq;
    //   38: ldc 118
    //   40: iconst_0
    //   41: iconst_0
    //   42: aconst_null
    //   43: aconst_null
    //   44: aload 6
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: invokestatic 196	com/google/android/gms/internal/ads/zzawx:zza	()Lcom/google/android/gms/internal/ads/zzawx;
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokestatic 201	com/google/android/gms/internal/ads/zzcfn:zza	(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcgq;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzaqq;Lcom/google/android/gms/internal/ads/zzbcm;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzbcc;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzawx;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)Lcom/google/android/gms/internal/ads/zzcfb;
    //   57: astore 5
    //   59: aload_0
    //   60: aload 5
    //   62: putfield 129	com/google/android/gms/internal/ads/zzdth:zzd	Lcom/google/android/gms/internal/ads/zzcfb;
    //   65: aload 5
    //   67: invokeinterface 205 1 0
    //   72: astore 5
    //   74: aload 5
    //   76: ifnonnull +29 -> 105
    //   79: ldc -49
    //   81: invokestatic 68	com/google/android/gms/internal/ads/zzbzt:zzj	(Ljava/lang/String;)V
    //   84: aload_1
    //   85: bipush 17
    //   87: ldc -49
    //   89: aconst_null
    //   90: invokestatic 73	com/google/android/gms/internal/ads/zzfba:zzd	(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;
    //   93: invokeinterface 78 2 0
    //   98: aload_0
    //   99: monitorexit
    //   100: return
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: return
    //   105: aload_0
    //   106: aload_1
    //   107: putfield 125	com/google/android/gms/internal/ads/zzdth:zzh	Lcom/google/android/gms/ads/internal/client/zzda;
    //   110: new 209	com/google/android/gms/internal/ads/zzbiz
    //   113: astore_1
    //   114: aload_1
    //   115: aload_0
    //   116: getfield 31	com/google/android/gms/internal/ads/zzdth:zza	Landroid/content/Context;
    //   119: invokespecial 212	com/google/android/gms/internal/ads/zzbiz:<init>	(Landroid/content/Context;)V
    //   122: aload 5
    //   124: aconst_null
    //   125: aconst_null
    //   126: aconst_null
    //   127: aconst_null
    //   128: aconst_null
    //   129: iconst_0
    //   130: aconst_null
    //   131: aconst_null
    //   132: aconst_null
    //   133: aconst_null
    //   134: aconst_null
    //   135: aconst_null
    //   136: aconst_null
    //   137: aconst_null
    //   138: aload_2
    //   139: aconst_null
    //   140: aload_1
    //   141: aload_3
    //   142: invokeinterface 218 19 0
    //   147: aload 5
    //   149: aload_0
    //   150: invokeinterface 222 2 0
    //   155: aload_0
    //   156: getfield 129	com/google/android/gms/internal/ads/zzdth:zzd	Lcom/google/android/gms/internal/ads/zzcfb;
    //   159: astore_2
    //   160: getstatic 225	com/google/android/gms/internal/ads/zzbbk:zzis	Lcom/google/android/gms/internal/ads/zzbbc;
    //   163: astore_1
    //   164: aload_2
    //   165: invokestatic 49	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   168: aload_1
    //   169: invokevirtual 54	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   172: checkcast 227	java/lang/String
    //   175: invokeinterface 230 2 0
    //   180: invokestatic 233	com/google/android/gms/ads/internal/zzt:zzi	()Lcom/google/android/gms/ads/internal/overlay/zzm;
    //   183: pop
    //   184: aload_0
    //   185: getfield 31	com/google/android/gms/internal/ads/zzdth:zza	Landroid/content/Context;
    //   188: astore_1
    //   189: new 235	com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel
    //   192: astore_2
    //   193: aload_2
    //   194: aload_0
    //   195: aload_0
    //   196: getfield 129	com/google/android/gms/internal/ads/zzdth:zzd	Lcom/google/android/gms/internal/ads/zzcfb;
    //   199: iconst_1
    //   200: aload_0
    //   201: getfield 33	com/google/android/gms/internal/ads/zzdth:zzb	Lcom/google/android/gms/internal/ads/zzbzz;
    //   204: invokespecial 238	com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel:<init>	(Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/internal/ads/zzcfb;ILcom/google/android/gms/internal/ads/zzbzz;)V
    //   207: aload_1
    //   208: aload_2
    //   209: iconst_1
    //   210: invokestatic 243	com/google/android/gms/ads/internal/overlay/zzm:zza	(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V
    //   213: aload_0
    //   214: invokestatic 90	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   217: invokeinterface 96 1 0
    //   222: putfield 98	com/google/android/gms/internal/ads/zzdth:zzg	J
    //   225: aload_0
    //   226: monitorexit
    //   227: return
    //   228: astore_2
    //   229: ldc -49
    //   231: aload_2
    //   232: invokestatic 246	com/google/android/gms/internal/ads/zzbzt:zzk	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   235: aload_1
    //   236: bipush 17
    //   238: ldc -49
    //   240: aconst_null
    //   241: invokestatic 73	com/google/android/gms/internal/ads/zzfba:zzd	(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;
    //   244: invokeinterface 78 2 0
    //   249: aload_0
    //   250: monitorexit
    //   251: return
    //   252: astore_1
    //   253: aload_0
    //   254: monitorexit
    //   255: return
    //   256: astore_1
    //   257: aload_0
    //   258: monitorexit
    //   259: aload_1
    //   260: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	zzdth
    //   0	261	1	paramzzda	zzda
    //   0	261	2	paramzzbja	zzbja
    //   0	261	3	paramzzbit	zzbit
    //   7	3	4	bool	boolean
    //   25	123	5	localObject	Object
    //   31	14	6	localzzbzz	zzbzz
    // Exception table:
    //   from	to	target	type
    //   84	98	101	android/os/RemoteException
    //   17	65	228	com/google/android/gms/internal/ads/zzcfm
    //   235	249	252	android/os/RemoteException
    //   2	9	256	finally
    //   17	65	256	finally
    //   65	74	256	finally
    //   79	84	256	finally
    //   84	98	256	finally
    //   105	225	256	finally
    //   229	235	256	finally
    //   235	249	256	finally
  }
  
  public final void zzk(String paramString)
  {
    try
    {
      if ((this.zze) && (this.zzf))
      {
        zzfwc localzzfwc = zzcag.zze;
        zzdtg localzzdtg = new com/google/android/gms/internal/ads/zzdtg;
        localzzdtg.<init>(this, paramString);
        localzzfwc.execute(localzzdtg);
        return;
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */