package com.google.android.gms.internal.ads;

final class zzpl
{
  public final zzam zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final int zzf;
  public final int zzg;
  public final int zzh;
  public final zzdo zzi;
  public final boolean zzj;
  
  public zzpl(zzam paramzzam, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, zzdo paramzzdo, boolean paramBoolean)
  {
    this.zza = paramzzam;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramInt3;
    this.zze = paramInt4;
    this.zzf = paramInt5;
    this.zzg = paramInt6;
    this.zzh = paramInt7;
    this.zzi = paramzzdo;
    this.zzj = false;
  }
  
  public final long zza(long paramLong)
  {
    return paramLong * 1000000L / this.zze;
  }
  
  /* Error */
  public final android.media.AudioTrack zzb(boolean paramBoolean, zzk paramzzk, int paramInt)
    throws zzov
  {
    // Byte code:
    //   0: getstatic 60	com/google/android/gms/internal/ads/zzfn:zza	I
    //   3: bipush 29
    //   5: if_icmplt +91 -> 96
    //   8: aload_0
    //   9: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   12: aload_0
    //   13: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   16: aload_0
    //   17: getfield 37	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   20: invokestatic 66	com/google/android/gms/internal/ads/zzpw:zzA	(III)Landroid/media/AudioFormat;
    //   23: astore 5
    //   25: aload_2
    //   26: invokevirtual 71	com/google/android/gms/internal/ads/zzk:zza	()Lcom/google/android/gms/internal/ads/zzi;
    //   29: getfield 76	com/google/android/gms/internal/ads/zzi:zza	Landroid/media/AudioAttributes;
    //   32: astore 6
    //   34: new 78	android/media/AudioTrack$Builder
    //   37: astore_2
    //   38: aload_2
    //   39: invokespecial 79	android/media/AudioTrack$Builder:<init>	()V
    //   42: aload_2
    //   43: aload 6
    //   45: invokevirtual 83	android/media/AudioTrack$Builder:setAudioAttributes	(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;
    //   48: aload 5
    //   50: invokevirtual 87	android/media/AudioTrack$Builder:setAudioFormat	(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;
    //   53: iconst_1
    //   54: invokevirtual 91	android/media/AudioTrack$Builder:setTransferMode	(I)Landroid/media/AudioTrack$Builder;
    //   57: aload_0
    //   58: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   61: invokevirtual 94	android/media/AudioTrack$Builder:setBufferSizeInBytes	(I)Landroid/media/AudioTrack$Builder;
    //   64: iload_3
    //   65: invokevirtual 97	android/media/AudioTrack$Builder:setSessionId	(I)Landroid/media/AudioTrack$Builder;
    //   68: astore_2
    //   69: aload_0
    //   70: getfield 29	com/google/android/gms/internal/ads/zzpl:zzc	I
    //   73: iconst_1
    //   74: if_icmpne +8 -> 82
    //   77: iconst_1
    //   78: istore_1
    //   79: goto +5 -> 84
    //   82: iconst_0
    //   83: istore_1
    //   84: aload_2
    //   85: iload_1
    //   86: invokevirtual 101	android/media/AudioTrack$Builder:setOffloadedPlayback	(Z)Landroid/media/AudioTrack$Builder;
    //   89: invokevirtual 105	android/media/AudioTrack$Builder:build	()Landroid/media/AudioTrack;
    //   92: astore_2
    //   93: goto +116 -> 209
    //   96: getstatic 60	com/google/android/gms/internal/ads/zzfn:zza	I
    //   99: bipush 21
    //   101: if_icmpge +72 -> 173
    //   104: aload_2
    //   105: getfield 106	com/google/android/gms/internal/ads/zzk:zzc	I
    //   108: istore 4
    //   110: iload_3
    //   111: ifne +32 -> 143
    //   114: new 108	android/media/AudioTrack
    //   117: dup
    //   118: iconst_3
    //   119: aload_0
    //   120: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   123: aload_0
    //   124: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   127: aload_0
    //   128: getfield 37	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   131: aload_0
    //   132: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   135: iconst_1
    //   136: invokespecial 111	android/media/AudioTrack:<init>	(IIIIII)V
    //   139: astore_2
    //   140: goto +69 -> 209
    //   143: new 108	android/media/AudioTrack
    //   146: dup
    //   147: iconst_3
    //   148: aload_0
    //   149: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   152: aload_0
    //   153: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   156: aload_0
    //   157: getfield 37	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   160: aload_0
    //   161: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   164: iconst_1
    //   165: iload_3
    //   166: invokespecial 114	android/media/AudioTrack:<init>	(IIIIIII)V
    //   169: astore_2
    //   170: goto +39 -> 209
    //   173: new 108	android/media/AudioTrack
    //   176: dup
    //   177: aload_2
    //   178: invokevirtual 71	com/google/android/gms/internal/ads/zzk:zza	()Lcom/google/android/gms/internal/ads/zzi;
    //   181: getfield 76	com/google/android/gms/internal/ads/zzi:zza	Landroid/media/AudioAttributes;
    //   184: aload_0
    //   185: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   188: aload_0
    //   189: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   192: aload_0
    //   193: getfield 37	com/google/android/gms/internal/ads/zzpl:zzg	I
    //   196: invokestatic 66	com/google/android/gms/internal/ads/zzpw:zzA	(III)Landroid/media/AudioFormat;
    //   199: aload_0
    //   200: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   203: iconst_1
    //   204: iload_3
    //   205: invokespecial 117	android/media/AudioTrack:<init>	(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V
    //   208: astore_2
    //   209: aload_2
    //   210: invokevirtual 121	android/media/AudioTrack:getState	()I
    //   213: istore_3
    //   214: iload_3
    //   215: iconst_1
    //   216: if_icmpne +5 -> 221
    //   219: aload_2
    //   220: areturn
    //   221: aload_2
    //   222: invokevirtual 124	android/media/AudioTrack:release	()V
    //   225: new 50	com/google/android/gms/internal/ads/zzov
    //   228: dup
    //   229: iload_3
    //   230: aload_0
    //   231: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   234: aload_0
    //   235: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   238: aload_0
    //   239: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   242: aload_0
    //   243: getfield 25	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   246: aload_0
    //   247: invokevirtual 127	com/google/android/gms/internal/ads/zzpl:zzc	()Z
    //   250: aconst_null
    //   251: invokespecial 130	com/google/android/gms/internal/ads/zzov:<init>	(IIIILcom/google/android/gms/internal/ads/zzam;ZLjava/lang/Exception;)V
    //   254: athrow
    //   255: astore_2
    //   256: goto +4 -> 260
    //   259: astore_2
    //   260: new 50	com/google/android/gms/internal/ads/zzov
    //   263: dup
    //   264: iconst_0
    //   265: aload_0
    //   266: getfield 33	com/google/android/gms/internal/ads/zzpl:zze	I
    //   269: aload_0
    //   270: getfield 35	com/google/android/gms/internal/ads/zzpl:zzf	I
    //   273: aload_0
    //   274: getfield 39	com/google/android/gms/internal/ads/zzpl:zzh	I
    //   277: aload_0
    //   278: getfield 25	com/google/android/gms/internal/ads/zzpl:zza	Lcom/google/android/gms/internal/ads/zzam;
    //   281: aload_0
    //   282: invokevirtual 127	com/google/android/gms/internal/ads/zzpl:zzc	()Z
    //   285: aload_2
    //   286: invokespecial 130	com/google/android/gms/internal/ads/zzov:<init>	(IIIILcom/google/android/gms/internal/ads/zzam;ZLjava/lang/Exception;)V
    //   289: athrow
    //   290: astore_2
    //   291: goto -66 -> 225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	this	zzpl
    //   0	294	1	paramBoolean	boolean
    //   0	294	2	paramzzk	zzk
    //   0	294	3	paramInt	int
    //   108	1	4	i	int
    //   23	26	5	localAudioFormat	android.media.AudioFormat
    //   32	12	6	localAudioAttributes	android.media.AudioAttributes
    // Exception table:
    //   from	to	target	type
    //   0	77	255	java/lang/IllegalArgumentException
    //   84	93	255	java/lang/IllegalArgumentException
    //   96	110	255	java/lang/IllegalArgumentException
    //   114	140	255	java/lang/IllegalArgumentException
    //   143	170	255	java/lang/IllegalArgumentException
    //   173	209	255	java/lang/IllegalArgumentException
    //   0	77	259	java/lang/UnsupportedOperationException
    //   84	93	259	java/lang/UnsupportedOperationException
    //   96	110	259	java/lang/UnsupportedOperationException
    //   114	140	259	java/lang/UnsupportedOperationException
    //   143	170	259	java/lang/UnsupportedOperationException
    //   173	209	259	java/lang/UnsupportedOperationException
    //   221	225	290	java/lang/Exception
  }
  
  public final boolean zzc()
  {
    return this.zzc == 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */