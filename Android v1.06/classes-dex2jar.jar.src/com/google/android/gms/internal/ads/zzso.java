package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

public final class zzso
  implements zzue
{
  private final zzaav zza;
  private zzaao zzb;
  private zzaap zzc;
  
  public zzso(zzaav paramzzaav)
  {
    this.zza = paramzzaav;
  }
  
  public final int zza(zzabk paramzzabk)
    throws IOException
  {
    zzaao localzzaao = this.zzb;
    Objects.requireNonNull(localzzaao);
    zzaap localzzaap = this.zzc;
    Objects.requireNonNull(localzzaap);
    return localzzaao.zza(localzzaap, paramzzabk);
  }
  
  public final long zzb()
  {
    zzaap localzzaap = this.zzc;
    if (localzzaap != null) {
      return localzzaap.zzf();
    }
    return -1L;
  }
  
  public final void zzc()
  {
    zzaao localzzaao = this.zzb;
    if ((localzzaao instanceof zzafv)) {
      ((zzafv)localzzaao).zze();
    }
  }
  
  /* Error */
  public final void zzd(zzt paramzzt, android.net.Uri paramUri, java.util.Map paramMap, long paramLong1, long paramLong2, zzaar paramzzaar)
    throws IOException
  {
    // Byte code:
    //   0: new 58	com/google/android/gms/internal/ads/zzaae
    //   3: dup
    //   4: aload_1
    //   5: lload 4
    //   7: lload 6
    //   9: invokespecial 61	com/google/android/gms/internal/ads/zzaae:<init>	(Lcom/google/android/gms/internal/ads/zzt;JJ)V
    //   12: astore_1
    //   13: aload_0
    //   14: aload_1
    //   15: putfield 33	com/google/android/gms/internal/ads/zzso:zzc	Lcom/google/android/gms/internal/ads/zzaap;
    //   18: aload_0
    //   19: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   22: ifnull +4 -> 26
    //   25: return
    //   26: aload_0
    //   27: getfield 19	com/google/android/gms/internal/ads/zzso:zza	Lcom/google/android/gms/internal/ads/zzaav;
    //   30: aload_2
    //   31: aload_3
    //   32: invokeinterface 66 3 0
    //   37: astore_3
    //   38: aload_3
    //   39: arraylength
    //   40: istore 11
    //   42: iconst_0
    //   43: istore 10
    //   45: iconst_0
    //   46: istore 14
    //   48: iconst_1
    //   49: istore 13
    //   51: iload 11
    //   53: iconst_1
    //   54: if_icmpne +13 -> 67
    //   57: aload_0
    //   58: aload_3
    //   59: iconst_0
    //   60: aaload
    //   61: putfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   64: goto +306 -> 370
    //   67: iconst_0
    //   68: istore 9
    //   70: iload 9
    //   72: iload 11
    //   74: if_icmpge +183 -> 257
    //   77: aload_3
    //   78: iload 9
    //   80: aaload
    //   81: astore 15
    //   83: aload 15
    //   85: aload_1
    //   86: invokeinterface 69 2 0
    //   91: ifeq +54 -> 145
    //   94: aload_0
    //   95: aload 15
    //   97: putfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   100: iload 13
    //   102: istore 12
    //   104: aload 15
    //   106: ifnonnull +25 -> 131
    //   109: aload_1
    //   110: invokeinterface 45 1 0
    //   115: lload 4
    //   117: lcmp
    //   118: ifne +10 -> 128
    //   121: iload 13
    //   123: istore 12
    //   125: goto +6 -> 131
    //   128: iconst_0
    //   129: istore 12
    //   131: iload 12
    //   133: invokestatic 74	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   136: aload_1
    //   137: invokeinterface 77 1 0
    //   142: goto +115 -> 257
    //   145: aload_0
    //   146: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   149: ifnonnull +88 -> 237
    //   152: aload_1
    //   153: invokeinterface 45 1 0
    //   158: lload 4
    //   160: lcmp
    //   161: ifne +70 -> 231
    //   164: goto +73 -> 237
    //   167: astore_2
    //   168: aload_0
    //   169: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   172: ifnonnull +19 -> 191
    //   175: iload 14
    //   177: istore 12
    //   179: aload_1
    //   180: invokeinterface 45 1 0
    //   185: lload 4
    //   187: lcmp
    //   188: ifne +6 -> 194
    //   191: iconst_1
    //   192: istore 12
    //   194: iload 12
    //   196: invokestatic 74	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   199: aload_1
    //   200: invokeinterface 77 1 0
    //   205: aload_2
    //   206: athrow
    //   207: astore 15
    //   209: aload_0
    //   210: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   213: ifnonnull +24 -> 237
    //   216: aload_1
    //   217: invokeinterface 45 1 0
    //   222: lload 4
    //   224: lcmp
    //   225: ifne +6 -> 231
    //   228: goto +9 -> 237
    //   231: iconst_0
    //   232: istore 12
    //   234: goto +6 -> 240
    //   237: iconst_1
    //   238: istore 12
    //   240: iload 12
    //   242: invokestatic 74	com/google/android/gms/internal/ads/zzdy:zzf	(Z)V
    //   245: aload_1
    //   246: invokeinterface 77 1 0
    //   251: iinc 9 1
    //   254: goto -184 -> 70
    //   257: aload_0
    //   258: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   261: ifnonnull +109 -> 370
    //   264: new 79	java/lang/StringBuilder
    //   267: dup
    //   268: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   271: astore_1
    //   272: iload 10
    //   274: istore 9
    //   276: aload_3
    //   277: arraylength
    //   278: istore 10
    //   280: iload 9
    //   282: iload 10
    //   284: if_icmpge +40 -> 324
    //   287: aload_1
    //   288: aload_3
    //   289: iload 9
    //   291: aaload
    //   292: invokevirtual 84	java/lang/Object:getClass	()Ljava/lang/Class;
    //   295: invokevirtual 90	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   298: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: iload 9
    //   304: iload 10
    //   306: iconst_1
    //   307: isub
    //   308: if_icmpge +10 -> 318
    //   311: aload_1
    //   312: ldc 96
    //   314: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: iinc 9 1
    //   321: goto -45 -> 276
    //   324: aload_1
    //   325: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: astore_1
    //   329: new 79	java/lang/StringBuilder
    //   332: dup
    //   333: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   336: astore_3
    //   337: aload_3
    //   338: ldc 101
    //   340: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload_3
    //   345: aload_1
    //   346: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: aload_3
    //   351: ldc 103
    //   353: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: new 105	com/google/android/gms/internal/ads/zzvl
    //   360: dup
    //   361: aload_3
    //   362: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: aload_2
    //   366: invokespecial 108	com/google/android/gms/internal/ads/zzvl:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   369: athrow
    //   370: aload_0
    //   371: getfield 25	com/google/android/gms/internal/ads/zzso:zzb	Lcom/google/android/gms/internal/ads/zzaao;
    //   374: aload 8
    //   376: invokeinterface 111 2 0
    //   381: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	382	0	this	zzso
    //   0	382	1	paramzzt	zzt
    //   0	382	2	paramUri	android.net.Uri
    //   0	382	3	paramMap	java.util.Map
    //   0	382	4	paramLong1	long
    //   0	382	6	paramLong2	long
    //   0	382	8	paramzzaar	zzaar
    //   68	251	9	i	int
    //   43	265	10	j	int
    //   40	35	11	k	int
    //   102	139	12	bool1	boolean
    //   49	73	13	bool2	boolean
    //   46	130	14	bool3	boolean
    //   81	24	15	localzzaao	zzaao
    //   207	1	15	localEOFException	java.io.EOFException
    // Exception table:
    //   from	to	target	type
    //   83	100	167	finally
    //   83	100	207	java/io/EOFException
  }
  
  public final void zze()
  {
    if (this.zzb != null) {
      this.zzb = null;
    }
    this.zzc = null;
  }
  
  public final void zzf(long paramLong1, long paramLong2)
  {
    zzaao localzzaao = this.zzb;
    Objects.requireNonNull(localzzaao);
    localzzaao.zzc(paramLong1, paramLong2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */