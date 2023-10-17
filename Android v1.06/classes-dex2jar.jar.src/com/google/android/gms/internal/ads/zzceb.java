package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

public final class zzceb
  extends zzfr
{
  private final Context zza;
  private final zzfx zzb;
  private final String zzc;
  private final int zzd;
  private final boolean zze;
  private InputStream zzf;
  private boolean zzg;
  private Uri zzh;
  private volatile zzawj zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  private boolean zzm;
  private long zzn;
  private zzfwb zzo;
  private final AtomicLong zzp;
  private final zzcee zzq;
  
  public zzceb(Context paramContext, zzfx paramzzfx, String paramString, int paramInt, zzgz paramzzgz, zzcee paramzzcee)
  {
    super(false);
    this.zza = paramContext;
    this.zzb = paramzzfx;
    this.zzq = paramzzcee;
    this.zzc = paramString;
    this.zzd = paramInt;
    this.zzj = false;
    this.zzk = false;
    this.zzl = false;
    this.zzm = false;
    this.zzn = 0L;
    this.zzp = new AtomicLong(-1L);
    this.zzo = null;
    paramContext = zzbbk.zzbJ;
    this.zze = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
    zzf(paramzzgz);
  }
  
  private final boolean zzr()
  {
    if (!this.zze) {
      return false;
    }
    zzbbc localzzbbc = zzbbk.zzeb;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!this.zzl)) {
      return true;
    }
    localzzbbc = zzbbk.zzec;
    return (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!this.zzm);
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.zzg)
    {
      InputStream localInputStream = this.zzf;
      if (localInputStream != null) {
        paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      } else {
        paramInt1 = this.zzb.zza(paramArrayOfByte, paramInt1, paramInt2);
      }
      if ((!this.zze) || (this.zzf != null)) {
        zzg(paramInt1);
      }
      return paramInt1;
    }
    throw new IOException("Attempt to read closed GcacheDataSource.");
  }
  
  /* Error */
  public final long zzb(zzgc paramzzgc)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	com/google/android/gms/internal/ads/zzceb:zzg	Z
    //   4: ifne +909 -> 913
    //   7: iconst_1
    //   8: istore 8
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 109	com/google/android/gms/internal/ads/zzceb:zzg	Z
    //   15: aload_0
    //   16: aload_1
    //   17: getfield 140	com/google/android/gms/internal/ads/zzgc:zza	Landroid/net/Uri;
    //   20: putfield 142	com/google/android/gms/internal/ads/zzceb:zzh	Landroid/net/Uri;
    //   23: aload_0
    //   24: getfield 93	com/google/android/gms/internal/ads/zzceb:zze	Z
    //   27: ifne +8 -> 35
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual 145	com/google/android/gms/internal/ads/zzfr:zzj	(Lcom/google/android/gms/internal/ads/zzgc;)V
    //   35: aload_0
    //   36: aload_1
    //   37: getfield 140	com/google/android/gms/internal/ads/zzgc:zza	Landroid/net/Uri;
    //   40: invokestatic 150	com/google/android/gms/internal/ads/zzawj:zza	(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzawj;
    //   43: putfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   46: getstatic 155	com/google/android/gms/internal/ads/zzbbk:zzdY	Lcom/google/android/gms/internal/ads/zzbbc;
    //   49: astore 10
    //   51: invokestatic 80	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   54: aload 10
    //   56: invokevirtual 85	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   59: checkcast 87	java/lang/Boolean
    //   62: invokevirtual 91	java/lang/Boolean:booleanValue	()Z
    //   65: ifeq +611 -> 676
    //   68: aload_0
    //   69: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   72: ifnull +751 -> 823
    //   75: aload_0
    //   76: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   79: aload_1
    //   80: getfield 157	com/google/android/gms/internal/ads/zzgc:zzf	J
    //   83: putfield 159	com/google/android/gms/internal/ads/zzawj:zzh	J
    //   86: aload_0
    //   87: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   90: aload_0
    //   91: getfield 46	com/google/android/gms/internal/ads/zzceb:zzc	Ljava/lang/String;
    //   94: invokestatic 164	com/google/android/gms/internal/ads/zzfpo:zzc	(Ljava/lang/String;)Ljava/lang/String;
    //   97: putfield 166	com/google/android/gms/internal/ads/zzawj:zzi	Ljava/lang/String;
    //   100: aload_0
    //   101: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   104: aload_0
    //   105: getfield 48	com/google/android/gms/internal/ads/zzceb:zzd	I
    //   108: putfield 168	com/google/android/gms/internal/ads/zzawj:zzj	I
    //   111: aload_0
    //   112: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   115: getfield 169	com/google/android/gms/internal/ads/zzawj:zzg	Z
    //   118: ifeq +24 -> 142
    //   121: getstatic 172	com/google/android/gms/internal/ads/zzbbk:zzea	Lcom/google/android/gms/internal/ads/zzbbc;
    //   124: astore 10
    //   126: invokestatic 80	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   129: aload 10
    //   131: invokevirtual 85	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   134: checkcast 174	java/lang/Long
    //   137: astore 10
    //   139: goto +21 -> 160
    //   142: getstatic 177	com/google/android/gms/internal/ads/zzbbk:zzdZ	Lcom/google/android/gms/internal/ads/zzbbc;
    //   145: astore 10
    //   147: invokestatic 80	com/google/android/gms/ads/internal/client/zzba:zzc	()Lcom/google/android/gms/internal/ads/zzbbi;
    //   150: aload 10
    //   152: invokevirtual 85	com/google/android/gms/internal/ads/zzbbi:zzb	(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;
    //   155: checkcast 174	java/lang/Long
    //   158: astore 10
    //   160: aload 10
    //   162: invokevirtual 181	java/lang/Long:longValue	()J
    //   165: lstore 4
    //   167: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   170: invokeinterface 192 1 0
    //   175: lstore_2
    //   176: invokestatic 195	com/google/android/gms/ads/internal/zzt:zzd	()Lcom/google/android/gms/internal/ads/zzawu;
    //   179: pop
    //   180: aload_0
    //   181: getfield 40	com/google/android/gms/internal/ads/zzceb:zza	Landroid/content/Context;
    //   184: aload_0
    //   185: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   188: invokestatic 200	com/google/android/gms/internal/ads/zzawu:zza	(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzawj;)Ljava/util/concurrent/Future;
    //   191: astore 10
    //   193: aload 10
    //   195: lload 4
    //   197: getstatic 206	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   200: invokeinterface 212 4 0
    //   205: checkcast 214	com/google/android/gms/internal/ads/zzawv
    //   208: astore 11
    //   210: aload_0
    //   211: aload 11
    //   213: invokevirtual 216	com/google/android/gms/internal/ads/zzawv:zzd	()Z
    //   216: putfield 50	com/google/android/gms/internal/ads/zzceb:zzj	Z
    //   219: aload_0
    //   220: aload 11
    //   222: invokevirtual 218	com/google/android/gms/internal/ads/zzawv:zzf	()Z
    //   225: putfield 54	com/google/android/gms/internal/ads/zzceb:zzl	Z
    //   228: aload_0
    //   229: aload 11
    //   231: invokevirtual 220	com/google/android/gms/internal/ads/zzawv:zze	()Z
    //   234: putfield 56	com/google/android/gms/internal/ads/zzceb:zzm	Z
    //   237: aload_0
    //   238: aload 11
    //   240: invokevirtual 222	com/google/android/gms/internal/ads/zzawv:zza	()J
    //   243: putfield 58	com/google/android/gms/internal/ads/zzceb:zzn	J
    //   246: aload_0
    //   247: invokespecial 224	com/google/android/gms/internal/ads/zzceb:zzr	()Z
    //   250: ifne +91 -> 341
    //   253: aload_0
    //   254: aload 11
    //   256: invokevirtual 227	com/google/android/gms/internal/ads/zzawv:zzc	()Ljava/io/InputStream;
    //   259: putfield 111	com/google/android/gms/internal/ads/zzceb:zzf	Ljava/io/InputStream;
    //   262: aload_0
    //   263: getfield 93	com/google/android/gms/internal/ads/zzceb:zze	Z
    //   266: ifeq +8 -> 274
    //   269: aload_0
    //   270: aload_1
    //   271: invokevirtual 145	com/google/android/gms/internal/ads/zzfr:zzj	(Lcom/google/android/gms/internal/ads/zzgc;)V
    //   274: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   277: invokeinterface 192 1 0
    //   282: lload_2
    //   283: lsub
    //   284: lstore_2
    //   285: aload_0
    //   286: getfield 44	com/google/android/gms/internal/ads/zzceb:zzq	Lcom/google/android/gms/internal/ads/zzcee;
    //   289: getfield 232	com/google/android/gms/internal/ads/zzcee:zza	Lcom/google/android/gms/internal/ads/zzceo;
    //   292: iconst_1
    //   293: lload_2
    //   294: invokevirtual 238	com/google/android/gms/internal/ads/zzceo:zzab	(ZJ)V
    //   297: aload_0
    //   298: iconst_1
    //   299: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   302: new 240	java/lang/StringBuilder
    //   305: dup
    //   306: invokespecial 243	java/lang/StringBuilder:<init>	()V
    //   309: astore_1
    //   310: aload_1
    //   311: ldc -11
    //   313: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload_1
    //   318: lload_2
    //   319: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload_1
    //   324: ldc -2
    //   326: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: aload_1
    //   331: invokevirtual 258	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   334: invokestatic 262	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   337: ldc2_w 61
    //   340: lreturn
    //   341: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   344: invokeinterface 192 1 0
    //   349: lload_2
    //   350: lsub
    //   351: lstore_2
    //   352: aload_0
    //   353: getfield 44	com/google/android/gms/internal/ads/zzceb:zzq	Lcom/google/android/gms/internal/ads/zzcee;
    //   356: getfield 232	com/google/android/gms/internal/ads/zzcee:zza	Lcom/google/android/gms/internal/ads/zzceo;
    //   359: iconst_1
    //   360: lload_2
    //   361: invokevirtual 238	com/google/android/gms/internal/ads/zzceo:zzab	(ZJ)V
    //   364: aload_0
    //   365: iconst_1
    //   366: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   369: new 240	java/lang/StringBuilder
    //   372: dup
    //   373: invokespecial 243	java/lang/StringBuilder:<init>	()V
    //   376: astore 10
    //   378: aload 10
    //   380: ldc -11
    //   382: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: aload 10
    //   388: lload_2
    //   389: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   392: pop
    //   393: aload 10
    //   395: ldc -2
    //   397: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload 10
    //   403: invokevirtual 258	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: astore 10
    //   408: goto +187 -> 595
    //   411: astore_1
    //   412: goto +192 -> 604
    //   415: astore 11
    //   417: iconst_1
    //   418: istore 9
    //   420: goto +23 -> 443
    //   423: astore 11
    //   425: iconst_1
    //   426: istore 9
    //   428: goto +85 -> 513
    //   431: astore_1
    //   432: iconst_0
    //   433: istore 8
    //   435: goto +169 -> 604
    //   438: astore 11
    //   440: iconst_0
    //   441: istore 9
    //   443: iload 9
    //   445: istore 8
    //   447: aload 10
    //   449: iconst_1
    //   450: invokeinterface 266 2 0
    //   455: pop
    //   456: iload 9
    //   458: istore 8
    //   460: invokestatic 272	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   463: invokevirtual 275	java/lang/Thread:interrupt	()V
    //   466: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   469: invokeinterface 192 1 0
    //   474: lload_2
    //   475: lsub
    //   476: lstore_2
    //   477: aload_0
    //   478: getfield 44	com/google/android/gms/internal/ads/zzceb:zzq	Lcom/google/android/gms/internal/ads/zzcee;
    //   481: getfield 232	com/google/android/gms/internal/ads/zzcee:zza	Lcom/google/android/gms/internal/ads/zzceo;
    //   484: iload 9
    //   486: lload_2
    //   487: invokevirtual 238	com/google/android/gms/internal/ads/zzceo:zzab	(ZJ)V
    //   490: aload_0
    //   491: iload 9
    //   493: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   496: new 240	java/lang/StringBuilder
    //   499: dup
    //   500: invokespecial 243	java/lang/StringBuilder:<init>	()V
    //   503: astore 10
    //   505: goto +60 -> 565
    //   508: astore 11
    //   510: iconst_0
    //   511: istore 9
    //   513: iload 9
    //   515: istore 8
    //   517: aload 10
    //   519: iconst_1
    //   520: invokeinterface 266 2 0
    //   525: pop
    //   526: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   529: invokeinterface 192 1 0
    //   534: lload_2
    //   535: lsub
    //   536: lstore_2
    //   537: aload_0
    //   538: getfield 44	com/google/android/gms/internal/ads/zzceb:zzq	Lcom/google/android/gms/internal/ads/zzcee;
    //   541: getfield 232	com/google/android/gms/internal/ads/zzcee:zza	Lcom/google/android/gms/internal/ads/zzceo;
    //   544: iload 9
    //   546: lload_2
    //   547: invokevirtual 238	com/google/android/gms/internal/ads/zzceo:zzab	(ZJ)V
    //   550: aload_0
    //   551: iload 9
    //   553: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   556: new 240	java/lang/StringBuilder
    //   559: dup
    //   560: invokespecial 243	java/lang/StringBuilder:<init>	()V
    //   563: astore 10
    //   565: aload 10
    //   567: ldc -11
    //   569: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: pop
    //   573: aload 10
    //   575: lload_2
    //   576: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   579: pop
    //   580: aload 10
    //   582: ldc -2
    //   584: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: pop
    //   588: aload 10
    //   590: invokevirtual 258	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   593: astore 10
    //   595: aload 10
    //   597: invokestatic 262	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   600: goto +223 -> 823
    //   603: astore_1
    //   604: invokestatic 187	com/google/android/gms/ads/internal/zzt:zzB	()Lcom/google/android/gms/common/util/Clock;
    //   607: invokeinterface 192 1 0
    //   612: lload_2
    //   613: lsub
    //   614: lstore_2
    //   615: aload_0
    //   616: getfield 44	com/google/android/gms/internal/ads/zzceb:zzq	Lcom/google/android/gms/internal/ads/zzcee;
    //   619: getfield 232	com/google/android/gms/internal/ads/zzcee:zza	Lcom/google/android/gms/internal/ads/zzceo;
    //   622: iload 8
    //   624: lload_2
    //   625: invokevirtual 238	com/google/android/gms/internal/ads/zzceo:zzab	(ZJ)V
    //   628: aload_0
    //   629: iload 8
    //   631: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   634: new 240	java/lang/StringBuilder
    //   637: dup
    //   638: invokespecial 243	java/lang/StringBuilder:<init>	()V
    //   641: astore 10
    //   643: aload 10
    //   645: ldc -11
    //   647: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: pop
    //   651: aload 10
    //   653: lload_2
    //   654: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   657: pop
    //   658: aload 10
    //   660: ldc -2
    //   662: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: pop
    //   666: aload 10
    //   668: invokevirtual 258	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   671: invokestatic 262	com/google/android/gms/ads/internal/util/zze:zza	(Ljava/lang/String;)V
    //   674: aload_1
    //   675: athrow
    //   676: aload_0
    //   677: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   680: ifnull +54 -> 734
    //   683: aload_0
    //   684: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   687: aload_1
    //   688: getfield 157	com/google/android/gms/internal/ads/zzgc:zzf	J
    //   691: putfield 159	com/google/android/gms/internal/ads/zzawj:zzh	J
    //   694: aload_0
    //   695: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   698: aload_0
    //   699: getfield 46	com/google/android/gms/internal/ads/zzceb:zzc	Ljava/lang/String;
    //   702: invokestatic 164	com/google/android/gms/internal/ads/zzfpo:zzc	(Ljava/lang/String;)Ljava/lang/String;
    //   705: putfield 166	com/google/android/gms/internal/ads/zzawj:zzi	Ljava/lang/String;
    //   708: aload_0
    //   709: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   712: aload_0
    //   713: getfield 48	com/google/android/gms/internal/ads/zzceb:zzd	I
    //   716: putfield 168	com/google/android/gms/internal/ads/zzawj:zzj	I
    //   719: invokestatic 278	com/google/android/gms/ads/internal/zzt:zzc	()Lcom/google/android/gms/internal/ads/zzawf;
    //   722: aload_0
    //   723: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   726: invokevirtual 283	com/google/android/gms/internal/ads/zzawf:zzb	(Lcom/google/android/gms/internal/ads/zzawj;)Lcom/google/android/gms/internal/ads/zzawg;
    //   729: astore 10
    //   731: goto +6 -> 737
    //   734: aconst_null
    //   735: astore 10
    //   737: aload 10
    //   739: ifnull +84 -> 823
    //   742: aload 10
    //   744: invokevirtual 286	com/google/android/gms/internal/ads/zzawg:zze	()Z
    //   747: ifeq +76 -> 823
    //   750: aload_0
    //   751: aload 10
    //   753: invokevirtual 287	com/google/android/gms/internal/ads/zzawg:zzd	()Z
    //   756: putfield 50	com/google/android/gms/internal/ads/zzceb:zzj	Z
    //   759: aload_0
    //   760: aload 10
    //   762: invokevirtual 289	com/google/android/gms/internal/ads/zzawg:zzg	()Z
    //   765: putfield 54	com/google/android/gms/internal/ads/zzceb:zzl	Z
    //   768: aload_0
    //   769: aload 10
    //   771: invokevirtual 290	com/google/android/gms/internal/ads/zzawg:zzf	()Z
    //   774: putfield 56	com/google/android/gms/internal/ads/zzceb:zzm	Z
    //   777: aload_0
    //   778: aload 10
    //   780: invokevirtual 291	com/google/android/gms/internal/ads/zzawg:zza	()J
    //   783: putfield 58	com/google/android/gms/internal/ads/zzceb:zzn	J
    //   786: aload_0
    //   787: iconst_1
    //   788: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   791: aload_0
    //   792: invokespecial 224	com/google/android/gms/internal/ads/zzceb:zzr	()Z
    //   795: ifne +28 -> 823
    //   798: aload_0
    //   799: aload 10
    //   801: invokevirtual 292	com/google/android/gms/internal/ads/zzawg:zzc	()Ljava/io/InputStream;
    //   804: putfield 111	com/google/android/gms/internal/ads/zzceb:zzf	Ljava/io/InputStream;
    //   807: aload_0
    //   808: getfield 93	com/google/android/gms/internal/ads/zzceb:zze	Z
    //   811: ifeq +8 -> 819
    //   814: aload_0
    //   815: aload_1
    //   816: invokevirtual 145	com/google/android/gms/internal/ads/zzfr:zzj	(Lcom/google/android/gms/internal/ads/zzgc;)V
    //   819: ldc2_w 61
    //   822: lreturn
    //   823: aload_0
    //   824: iconst_0
    //   825: putfield 52	com/google/android/gms/internal/ads/zzceb:zzk	Z
    //   828: aload_1
    //   829: astore 10
    //   831: aload_0
    //   832: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   835: ifnull +66 -> 901
    //   838: aload_0
    //   839: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   842: getfield 294	com/google/android/gms/internal/ads/zzawj:zza	Ljava/lang/String;
    //   845: invokestatic 300	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   848: astore 10
    //   850: aload_1
    //   851: getfield 303	com/google/android/gms/internal/ads/zzgc:zzc	[B
    //   854: astore 11
    //   856: aload_1
    //   857: getfield 305	com/google/android/gms/internal/ads/zzgc:zze	J
    //   860: lstore 4
    //   862: aload_1
    //   863: getfield 157	com/google/android/gms/internal/ads/zzgc:zzf	J
    //   866: lstore_2
    //   867: aload_1
    //   868: getfield 307	com/google/android/gms/internal/ads/zzgc:zzg	J
    //   871: lstore 6
    //   873: aload_1
    //   874: getfield 309	com/google/android/gms/internal/ads/zzgc:zzh	Ljava/lang/String;
    //   877: astore 11
    //   879: new 138	com/google/android/gms/internal/ads/zzgc
    //   882: dup
    //   883: aload 10
    //   885: aconst_null
    //   886: lload 4
    //   888: lload_2
    //   889: lload 6
    //   891: aconst_null
    //   892: aload_1
    //   893: getfield 311	com/google/android/gms/internal/ads/zzgc:zzi	I
    //   896: invokespecial 314	com/google/android/gms/internal/ads/zzgc:<init>	(Landroid/net/Uri;[BJJJLjava/lang/String;I)V
    //   899: astore 10
    //   901: aload_0
    //   902: getfield 42	com/google/android/gms/internal/ads/zzceb:zzb	Lcom/google/android/gms/internal/ads/zzfx;
    //   905: aload 10
    //   907: invokeinterface 316 2 0
    //   912: lreturn
    //   913: new 107	java/io/IOException
    //   916: dup
    //   917: ldc_w 318
    //   920: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   923: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	924	0	this	zzceb
    //   0	924	1	paramzzgc	zzgc
    //   175	714	2	l1	long
    //   165	722	4	l2	long
    //   871	19	6	l3	long
    //   8	622	8	bool1	boolean
    //   418	134	9	bool2	boolean
    //   49	857	10	localObject1	Object
    //   208	47	11	localzzawv	zzawv
    //   415	1	11	localInterruptedException1	InterruptedException
    //   423	1	11	localExecutionException1	java.util.concurrent.ExecutionException
    //   438	1	11	localInterruptedException2	InterruptedException
    //   508	1	11	localExecutionException2	java.util.concurrent.ExecutionException
    //   854	24	11	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   210	274	411	finally
    //   210	274	415	java/lang/InterruptedException
    //   210	274	423	java/util/concurrent/ExecutionException
    //   210	274	423	java/util/concurrent/TimeoutException
    //   193	210	431	finally
    //   193	210	438	java/lang/InterruptedException
    //   193	210	508	java/util/concurrent/ExecutionException
    //   193	210	508	java/util/concurrent/TimeoutException
    //   447	456	603	finally
    //   460	466	603	finally
    //   517	526	603	finally
  }
  
  public final Uri zzc()
  {
    return this.zzh;
  }
  
  public final void zzd()
    throws IOException
  {
    if (this.zzg)
    {
      int i = 0;
      this.zzg = false;
      this.zzh = null;
      if ((!this.zze) || (this.zzf != null)) {
        i = 1;
      }
      InputStream localInputStream = this.zzf;
      if (localInputStream != null)
      {
        IOUtils.closeQuietly(localInputStream);
        this.zzf = null;
      }
      else
      {
        this.zzb.zzd();
      }
      if (i != 0) {
        zzh();
      }
      return;
    }
    throw new IOException("Attempt to close an already closed GcacheDataSource.");
  }
  
  public final long zzk()
  {
    return this.zzn;
  }
  
  /* Error */
  public final long zzl()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 152	com/google/android/gms/internal/ads/zzceb:zzi	Lcom/google/android/gms/internal/ads/zzawj;
    //   4: ifnonnull +7 -> 11
    //   7: ldc2_w 61
    //   10: lreturn
    //   11: aload_0
    //   12: getfield 67	com/google/android/gms/internal/ads/zzceb:zzp	Ljava/util/concurrent/atomic/AtomicLong;
    //   15: invokevirtual 333	java/util/concurrent/atomic/AtomicLong:get	()J
    //   18: ldc2_w 61
    //   21: lcmp
    //   22: ifeq +11 -> 33
    //   25: aload_0
    //   26: getfield 67	com/google/android/gms/internal/ads/zzceb:zzp	Ljava/util/concurrent/atomic/AtomicLong;
    //   29: invokevirtual 333	java/util/concurrent/atomic/AtomicLong:get	()J
    //   32: lreturn
    //   33: aload_0
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield 69	com/google/android/gms/internal/ads/zzceb:zzo	Lcom/google/android/gms/internal/ads/zzfwb;
    //   39: ifnonnull +27 -> 66
    //   42: getstatic 338	com/google/android/gms/internal/ads/zzcag:zza	Lcom/google/android/gms/internal/ads/zzfwc;
    //   45: astore_1
    //   46: new 340	com/google/android/gms/internal/ads/zzcea
    //   49: astore_2
    //   50: aload_2
    //   51: aload_0
    //   52: invokespecial 343	com/google/android/gms/internal/ads/zzcea:<init>	(Lcom/google/android/gms/internal/ads/zzceb;)V
    //   55: aload_0
    //   56: aload_1
    //   57: aload_2
    //   58: invokeinterface 348 2 0
    //   63: putfield 69	com/google/android/gms/internal/ads/zzceb:zzo	Lcom/google/android/gms/internal/ads/zzfwb;
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_0
    //   69: getfield 69	com/google/android/gms/internal/ads/zzceb:zzo	Lcom/google/android/gms/internal/ads/zzfwb;
    //   72: invokeinterface 353 1 0
    //   77: ifne +7 -> 84
    //   80: ldc2_w 61
    //   83: lreturn
    //   84: aload_0
    //   85: getfield 67	com/google/android/gms/internal/ads/zzceb:zzp	Ljava/util/concurrent/atomic/AtomicLong;
    //   88: ldc2_w 61
    //   91: aload_0
    //   92: getfield 69	com/google/android/gms/internal/ads/zzceb:zzo	Lcom/google/android/gms/internal/ads/zzfwb;
    //   95: invokeinterface 356 1 0
    //   100: checkcast 174	java/lang/Long
    //   103: invokevirtual 181	java/lang/Long:longValue	()J
    //   106: invokevirtual 360	java/util/concurrent/atomic/AtomicLong:compareAndSet	(JJ)Z
    //   109: pop
    //   110: aload_0
    //   111: getfield 67	com/google/android/gms/internal/ads/zzceb:zzp	Ljava/util/concurrent/atomic/AtomicLong;
    //   114: invokevirtual 333	java/util/concurrent/atomic/AtomicLong:get	()J
    //   117: lreturn
    //   118: astore_1
    //   119: ldc2_w 61
    //   122: lreturn
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	zzceb
    //   45	12	1	localzzfwc	zzfwc
    //   118	1	1	localExecutionException	java.util.concurrent.ExecutionException
    //   123	4	1	localObject	Object
    //   49	9	2	localzzcea	zzcea
    // Exception table:
    //   from	to	target	type
    //   84	110	118	java/util/concurrent/ExecutionException
    //   84	110	118	java/lang/InterruptedException
    //   35	66	123	finally
    //   66	68	123	finally
    //   124	126	123	finally
  }
  
  public final boolean zzn()
  {
    return this.zzj;
  }
  
  public final boolean zzo()
  {
    return this.zzm;
  }
  
  public final boolean zzp()
  {
    return this.zzl;
  }
  
  public final boolean zzq()
  {
    return this.zzk;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzceb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */