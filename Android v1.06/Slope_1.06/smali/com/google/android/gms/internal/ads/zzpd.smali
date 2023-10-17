.class final Lcom/google/android/gms/internal/ads/zzpd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:J

.field private zzD:J

.field private zzE:Z

.field private zzF:J

.field private zzG:J

.field private final zza:Lcom/google/android/gms/internal/ads/zzpc;

.field private final zzb:[J

.field private zzc:Landroid/media/AudioTrack;

.field private zzd:I

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/ads/zzpb;

.field private zzg:I

.field private zzh:Z

.field private zzi:J

.field private zzj:F

.field private zzk:Z

.field private zzl:J

.field private zzm:J

.field private zzn:Ljava/lang/reflect/Method;

.field private zzo:J

.field private zzp:Z

.field private zzq:Z

.field private zzr:J

.field private zzs:J

.field private zzt:J

.field private zzu:J

.field private zzv:J

.field private zzw:I

.field private zzx:I

.field private zzy:J

.field private zzz:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzpc;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zza:Lcom/google/android/gms/internal/ads/zzpc;

    sget p1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v0, "getLatency"

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzn:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzb:[J

    return-void
.end method

.method private final zzl(J)J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzg:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    return-wide p1
.end method

.method private final zzm(J)J
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzg:I

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long p1, p1, v2

    div-long/2addr p1, v0

    return-wide p1
.end method

.method private final zzn()J
    .locals 12

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzy:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    sub-long/2addr v0, v2

    .line 2
    invoke-static {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzfn;->zzm(JF)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzpd;->zzl(J)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzB:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzA:J

    add-long/2addr v4, v0

    .line 3
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzs:J

    sub-long v2, v0, v2

    const-wide/16 v6, 0x5

    cmp-long v8, v2, v6

    if-ltz v8, :cond_a

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    .line 7
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v3

    const/4 v6, 0x1

    if-ne v3, v6, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v2

    int-to-long v6, v2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzh:Z

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    const-wide/16 v8, 0x0

    if-eqz v2, :cond_4

    const/4 v2, 0x2

    if-ne v3, v2, :cond_3

    cmp-long v3, v6, v8

    if-nez v3, :cond_2

    iget-wide v10, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    iput-wide v10, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzv:J

    :cond_2
    const/4 v3, 0x2

    :cond_3
    iget-wide v10, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzv:J

    add-long/2addr v6, v10

    .line 6
    :cond_4
    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v10, 0x1d

    if-gt v2, v10, :cond_7

    cmp-long v2, v6, v8

    if-nez v2, :cond_5

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    cmp-long v2, v6, v8

    if-lez v2, :cond_6

    const/4 v2, 0x3

    if-ne v3, v2, :cond_6

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_9

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    goto :goto_0

    :cond_5
    move-wide v8, v6

    :cond_6
    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    move-wide v6, v8

    :cond_7
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    cmp-long v4, v2, v6

    if-lez v4, :cond_8

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzu:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzu:J

    :cond_8
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    .line 4
    :cond_9
    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzs:J

    :cond_a
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzu:J

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final zzo()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzl:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzx:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzw:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzm:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzD:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzG:J

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzk:Z

    return-void
.end method


# virtual methods
.method public final zza(J)I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v0

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzd:I

    int-to-long v2, v2

    mul-long v0, v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zze:I

    sub-long/2addr p1, v0

    long-to-int p2, p1

    sub-int/2addr v2, p2

    return v2
.end method

.method public final zzb(Z)J
    .locals 20

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    .line 38
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x3e8

    if-ne v1, v2, :cond_7

    .line 2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    div-long/2addr v1, v6

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzm:J

    sub-long v8, v1, v8

    const-wide/16 v10, 0x7530

    cmp-long v13, v8, v10

    if-ltz v13, :cond_2

    .line 3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v8

    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide v8

    cmp-long v10, v8, v4

    if-nez v10, :cond_0

    goto/16 :goto_4

    .line 29
    :cond_0
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzb:[J

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzw:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    .line 4
    invoke-static {v8, v9, v13}, Lcom/google/android/gms/internal/ads/zzfn;->zzn(JF)J

    move-result-wide v8

    sub-long/2addr v8, v1

    aput-wide v8, v10, v11

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzw:I

    add-int/2addr v8, v3

    const/16 v9, 0xa

    rem-int/2addr v8, v9

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzw:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzx:I

    if-ge v8, v9, :cond_1

    add-int/2addr v8, v3

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzx:I

    :cond_1
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzm:J

    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzl:J

    const/4 v8, 0x0

    :goto_0
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzx:I

    if-ge v8, v9, :cond_2

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzl:J

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzb:[J

    .line 5
    aget-wide v14, v13, v8

    int-to-long v3, v9

    div-long/2addr v14, v3

    add-long/2addr v10, v14

    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzl:J

    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_2
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzh:Z

    if-nez v3, :cond_7

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    .line 37
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzpb;->zzg(J)Z

    move-result v4

    const-string v5, "DefaultAudioSink"

    const-wide/32 v8, 0x4c4b40

    if-nez v4, :cond_3

    goto/16 :goto_2

    .line 7
    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzpb;->zzb()J

    move-result-wide v10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzpb;->zza()J

    move-result-wide v14

    .line 8
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v6

    invoke-direct {v0, v6, v7}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide v6

    sub-long v16, v10, v1

    .line 9
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(J)J

    move-result-wide v16

    const-string v4, ", "

    cmp-long v18, v16, v8

    if-lez v18, :cond_4

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzpd;->zza:Lcom/google/android/gms/internal/ads/zzpc;

    check-cast v13, Lcom/google/android/gms/internal/ads/zzpr;

    iget-object v12, v13, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    .line 10
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzpw;->zzy(Lcom/google/android/gms/internal/ads/zzpw;)J

    move-result-wide v8

    iget-object v12, v13, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    .line 11
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzpw;->zzz(Lcom/google/android/gms/internal/ads/zzpw;)J

    move-result-wide v12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v3

    const-string v3, "Spurious audio timestamp (system clock mismatch): "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/ads/zzpb;->zzd()V

    :goto_1
    move-object/from16 v0, p0

    goto :goto_2

    :cond_4
    move-object/from16 v19, v3

    .line 14
    invoke-direct {v0, v14, v15}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide v8

    sub-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    const-wide/32 v12, 0x4c4b40

    cmp-long v3, v8, v12

    if-lez v3, :cond_5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zza:Lcom/google/android/gms/internal/ads/zzpc;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzpr;

    iget-object v8, v3, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    .line 15
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzpw;->zzy(Lcom/google/android/gms/internal/ads/zzpw;)J

    move-result-wide v8

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    .line 16
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzpw;->zzz(Lcom/google/android/gms/internal/ads/zzpw;)J

    move-result-wide v12

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Spurious audio timestamp (frame position mismatch): "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/ads/zzpb;->zzd()V

    goto :goto_1

    .line 19
    :cond_5
    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/ads/zzpb;->zzc()V

    goto :goto_1

    .line 6
    :goto_2
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzq:Z

    if-eqz v3, :cond_7

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzn:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_7

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzr:J

    sub-long v6, v1, v6

    const-wide/32 v8, 0x7a120

    cmp-long v4, v6, v8

    if-ltz v4, :cond_7

    :try_start_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    :try_start_1
    new-array v6, v6, [Ljava/lang/Object;

    .line 20
    invoke-virtual {v3, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    sget v4, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzi:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {v3, v4}, Ljava/lang/Long;->signum(J)I

    const-wide/16 v8, 0x3e8

    mul-long v3, v3, v8

    sub-long/2addr v3, v6

    :try_start_2
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzo:J

    const-wide/16 v6, 0x0

    .line 21
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzo:J

    const-wide/32 v6, 0x4c4b40

    cmp-long v8, v3, v6

    if-lez v8, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    .line 22
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Ignoring impossibly large audio latency: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzo:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    const/4 v3, 0x0

    .line 23
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzn:Ljava/lang/reflect/Method;

    .line 22
    :cond_6
    :goto_3
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzr:J

    .line 24
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    .line 36
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzpb;->zzf()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzpb;->zza()J

    move-result-wide v5

    .line 25
    invoke-direct {v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide v5

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzpb;->zzb()J

    move-result-wide v7

    sub-long v7, v1, v7

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    .line 27
    invoke-static {v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzm(JF)J

    move-result-wide v7

    add-long/2addr v5, v7

    goto :goto_6

    .line 35
    :cond_8
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzx:I

    if-nez v3, :cond_9

    .line 28
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v5

    invoke-direct {v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide v5

    goto :goto_5

    .line 30
    :cond_9
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzl:J

    add-long/2addr v5, v1

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    .line 29
    invoke-static {v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzm(JF)J

    move-result-wide v5

    :goto_5
    if-nez p1, :cond_a

    .line 28
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzo:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    .line 30
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    .line 27
    :cond_a
    :goto_6
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzE:Z

    if-eq v3, v4, :cond_b

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzD:J

    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzG:J

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzC:J

    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzF:J

    :cond_b
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzG:J

    sub-long v7, v1, v7

    const-wide/32 v9, 0xf4240

    cmp-long v3, v7, v9

    if-gez v3, :cond_c

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzF:J

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    .line 31
    invoke-static {v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzm(JF)J

    move-result-wide v13

    add-long/2addr v11, v13

    const-wide/16 v13, 0x3e8

    mul-long v7, v7, v13

    div-long/2addr v7, v9

    mul-long v5, v5, v7

    sub-long v7, v13, v7

    mul-long v7, v7, v11

    add-long/2addr v5, v7

    div-long/2addr v5, v13

    :cond_c
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzk:Z

    if-nez v3, :cond_d

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzC:J

    cmp-long v3, v5, v7

    if-lez v3, :cond_d

    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzk:Z

    .line 32
    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    sub-long v7, v5, v7

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v7

    .line 33
    invoke-static {v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzn(JF)J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v7

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v7

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpd;->zza:Lcom/google/android/gms/internal/ads/zzpc;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzpr;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzpw;->zzC(Lcom/google/android/gms/internal/ads/zzpw;)Lcom/google/android/gms/internal/ads/zzow;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzpw;->zzC(Lcom/google/android/gms/internal/ads/zzpw;)Lcom/google/android/gms/internal/ads/zzow;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzqb;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzqb;->zza:Lcom/google/android/gms/internal/ads/zzqc;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzqc;->zzW(Lcom/google/android/gms/internal/ads/zzqc;)Lcom/google/android/gms/internal/ads/zzos;

    move-result-object v3

    .line 35
    invoke-virtual {v3, v9, v10}, Lcom/google/android/gms/internal/ads/zzos;->zzr(J)V

    :cond_d
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzD:J

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzC:J

    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzpd;->zzE:Z

    return-wide v5
.end method

.method public final zzc(J)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzA:J

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzy:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzB:J

    return-void
.end method

.method public final zzd()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzo()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    return-void
.end method

.method public final zze(Landroid/media/AudioTrack;ZIII)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzd:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzpd;->zze:I

    new-instance v0, Lcom/google/android/gms/internal/ads/zzpb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzpb;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    .line 2
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzg:I

    const/4 p1, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 3
    sget p2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v2, 0x17

    if-ge p2, v2, :cond_0

    const/4 p2, 0x5

    if-eq p3, p2, :cond_1

    if-ne p3, p1, :cond_0

    const/4 p3, 0x6

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzh:Z

    .line 4
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzfn;->zzC(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzq:Z

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_2

    .line 5
    div-int/2addr p5, p4

    int-to-long p4, p5

    invoke-direct {p0, p4, p5}, Lcom/google/android/gms/internal/ads/zzpd;->zzm(J)J

    move-result-wide p4

    goto :goto_1

    :cond_2
    move-wide p4, p2

    :goto_1
    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzi:J

    const-wide/16 p4, 0x0

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzt:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzu:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzv:J

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzp:Z

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzy:J

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzr:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzo:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzj:F

    return-void
.end method

.method public final zzf()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpb;->zze()V

    return-void
.end method

.method public final zzg(J)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzpd;->zzb(Z)J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpd;->zzl(J)J

    move-result-wide v1

    cmp-long v3, p1, v1

    if-gtz v3, :cond_1

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzh:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide p1

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final zzh()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    .line 2
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzi(J)Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzz:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0xc8

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zzj(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzc:Landroid/media/AudioTrack;

    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzh:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzp:Z

    return v3

    :cond_0
    if-ne v0, v2, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzn()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    :goto_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzp:Z

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzpd;->zzg(J)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzp:Z

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    if-eq v0, v2, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpd;->zza:Lcom/google/android/gms/internal/ads/zzpc;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzpd;->zze:I

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzi:J

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v5

    check-cast p1, Lcom/google/android/gms/internal/ads/zzpr;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzpw;->zzC(Lcom/google/android/gms/internal/ads/zzpw;)Lcom/google/android/gms/internal/ads/zzow;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpr;->zza:Lcom/google/android/gms/internal/ads/zzpw;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzpw;->zzx(Lcom/google/android/gms/internal/ads/zzpw;)J

    move-result-wide v7

    sub-long v7, v0, v7

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzpw;->zzC(Lcom/google/android/gms/internal/ads/zzpw;)Lcom/google/android/gms/internal/ads/zzow;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzqb;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqb;->zza:Lcom/google/android/gms/internal/ads/zzqc;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzqc;->zzW(Lcom/google/android/gms/internal/ads/zzqc;)Lcom/google/android/gms/internal/ads/zzos;

    move-result-object v3

    .line 6
    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzos;->zzt(IJJ)V

    :cond_3
    return v2
.end method

.method public final zzk()Z
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpd;->zzo()V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzy:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpd;->zzf:Lcom/google/android/gms/internal/ads/zzpb;

    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpb;->zze()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
