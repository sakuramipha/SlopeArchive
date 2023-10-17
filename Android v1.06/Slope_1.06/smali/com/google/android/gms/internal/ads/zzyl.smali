.class final Lcom/google/android/gms/internal/ads/zzyl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzyx;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzym;

.field private final zzc:Ljava/util/ArrayDeque;

.field private final zzd:Ljava/util/ArrayDeque;

.field private zze:Landroid/os/Handler;

.field private zzf:Lcom/google/android/gms/internal/ads/zzdl;

.field private zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private zzh:Lcom/google/android/gms/internal/ads/zzam;

.field private zzi:Landroid/util/Pair;

.field private zzj:Landroid/util/Pair;

.field private zzk:I

.field private zzl:Z

.field private zzm:Z

.field private final zzn:Lcom/google/android/gms/internal/ads/zzdn;

.field private zzo:J

.field private zzp:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzyx;Lcom/google/android/gms/internal/ads/zzym;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zza:Lcom/google/android/gms/internal/ads/zzyx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 2
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzd:Ljava/util/ArrayDeque;

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzk:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzl:Z

    .line 3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzdn;->zza:Lcom/google/android/gms/internal/ads/zzdn;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzn:Lcom/google/android/gms/internal/ads/zzdn;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzo:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzp:J

    return-void
.end method

.method private final zzp(JZ)V
    .locals 4

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 2
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzdl;->zzf()V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-static {p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzym;->zzaC(Lcom/google/android/gms/internal/ads/zzym;J)V

    const-wide/16 v0, -0x2

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzym;->zzaE()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(JJ)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzp:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    add-long/2addr p1, p3

    iget-wide p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzp:J

    sub-long/2addr p1, p3

    return-wide p1
.end method

.method public final zzb(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 2

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzym;->zzaA(Lcom/google/android/gms/internal/ads/zzym;)Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    const-string v1, "allow-frame-drop"

    .line 3
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    return-object p1
.end method

.method public final zzc()Landroid/view/Surface;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zzb()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zzh()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    return-void
.end method

.method public final zze()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zzc()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zze:Landroid/os/Handler;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    :cond_0
    return-void
.end method

.method public final zzf(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzym;->zzaA(Lcom/google/android/gms/internal/ads/zzym;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/4 v2, 0x1

    const/16 v3, 0x1d

    if-lt v1, v3, :cond_2

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    if-ge v0, v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfof;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "OMX."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x5

    goto :goto_0

    :cond_1
    const v2, 0x7fffffff

    .line 2
    :cond_2
    :goto_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzk:I

    return-void
.end method

.method public final zzg(JJ)V
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v11, p1

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhr;->zzbc()I

    move-result v1

    const/4 v2, 0x2

    const/4 v13, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_1

    :cond_0
    const/4 v14, 0x0

    :goto_1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 18
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzp:J

    add-long v8, v1, v3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v15, 0x3e8

    mul-long v6, v2, v15

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v17, v8

    move v10, v14

    invoke-static/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/zzym;->zzaz(Lcom/google/android/gms/internal/ads/zzym;JJJJZ)J

    move-result-wide v1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    .line 5
    invoke-static {v3, v11, v12, v1, v2}, Lcom/google/android/gms/internal/ads/zzym;->zzaK(Lcom/google/android/gms/internal/ads/zzym;JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    const-wide/16 v1, -0x1

    .line 17
    invoke-direct {v0, v1, v2, v13}, Lcom/google/android/gms/internal/ads/zzyl;->zzp(JZ)V

    return-void

    :cond_1
    if-eqz v14, :cond_7

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzym;->zzad(Lcom/google/android/gms/internal/ads/zzym;)J

    move-result-wide v3

    cmp-long v5, v11, v3

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-wide/32 v3, 0xc350

    cmp-long v5, v1, v3

    if-lez v5, :cond_3

    goto :goto_2

    :cond_3
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zza:Lcom/google/android/gms/internal/ads/zzyx;

    move-wide/from16 v4, v17

    .line 6
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzyx;->zzd(J)V

    mul-long v1, v1, v15

    .line 7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    add-long/2addr v6, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyl;->zza:Lcom/google/android/gms/internal/ads/zzyx;

    .line 8
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzyx;->zza(J)J

    move-result-wide v1

    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v6, v1, v6

    div-long/2addr v6, v15

    move-wide/from16 v8, p3

    invoke-static {v6, v7, v8, v9, v13}, Lcom/google/android/gms/internal/ads/zzym;->zzaN(JJZ)Z

    move-result v3

    if-eqz v3, :cond_4

    const-wide/16 v1, -0x2

    .line 10
    invoke-direct {v0, v1, v2, v13}, Lcom/google/android/gms/internal/ads/zzyl;->zzp(JZ)V

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzd:Ljava/util/ArrayDeque;

    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzd:Ljava/util/ArrayDeque;

    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-lez v3, :cond_5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzd:Ljava/util/ArrayDeque;

    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzi:Landroid/util/Pair;

    :cond_5
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzi:Landroid/util/Pair;

    .line 14
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzam;

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzo:J

    cmp-long v3, v6, v4

    if-ltz v3, :cond_6

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzo:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzyl;->zzn:Lcom/google/android/gms/internal/ads/zzdn;

    .line 15
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzym;->zzaD(Lcom/google/android/gms/internal/ads/zzym;Lcom/google/android/gms/internal/ads/zzdn;)V

    .line 16
    :cond_6
    invoke-direct {v0, v1, v2, v13}, Lcom/google/android/gms/internal/ads/zzyl;->zzp(JZ)V

    goto/16 :goto_0

    :cond_7
    :goto_2
    return-void
.end method

.method public final zzh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zze()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zze:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzc:Ljava/util/ArrayDeque;

    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzl:Z

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzam;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 5
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzan;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzan;-><init>(II)V

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzv:F

    .line 2
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzan;->zza(F)Lcom/google/android/gms/internal/ads/zzan;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzan;->zzb()Lcom/google/android/gms/internal/ads/zzap;

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zzg()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzh:Lcom/google/android/gms/internal/ads/zzam;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    :cond_0
    return-void
.end method

.method public final zzj(Landroid/view/Surface;Lcom/google/android/gms/internal/ads/zzff;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzff;

    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzff;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzyl;->zzl()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzff;->zzb()I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzff;->zza()I

    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdl;->zzh()V

    :cond_2
    return-void
.end method

.method public final zzk(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final zzl()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzm()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzff;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzff;->zza:Lcom/google/android/gms/internal/ads/zzff;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzff;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final zzn(Lcom/google/android/gms/internal/ads/zzam;J)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzyl;->zzl()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzl:Z

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzl:Z

    return v2

    :cond_1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzs(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zze:Landroid/os/Handler;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzs;

    .line 4
    sget-object v3, Lcom/google/android/gms/internal/ads/zzs;->zza:Lcom/google/android/gms/internal/ads/zzs;

    if-eqz v0, :cond_3

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzs;->zzf:I

    const/4 v4, 0x7

    const/4 v5, 0x6

    if-eq v3, v4, :cond_2

    if-ne v3, v5, :cond_3

    .line 8
    invoke-static {v0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzs;->zzc()Lcom/google/android/gms/internal/ads/zzr;

    move-result-object v3

    .line 5
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzr;->zzc(I)Lcom/google/android/gms/internal/ads/zzr;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzr;->zzd()Lcom/google/android/gms/internal/ads/zzs;

    move-result-object v3

    .line 6
    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    goto :goto_0

    .line 22
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzs;->zza:Lcom/google/android/gms/internal/ads/zzs;

    .line 7
    invoke-static {v0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 9
    :goto_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzym;->zzaL()Z

    move-result v3

    if-nez v3, :cond_4

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzam;->zzu:I

    if-eqz v3, :cond_4

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;

    int-to-float v3, v3

    .line 10
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzyk;->zza(F)Lcom/google/android/gms/internal/ads/zzae;

    move-result-object v3

    .line 11
    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(ILjava/lang/Object;)V

    .line 12
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzyk;->zzb()Lcom/google/android/gms/internal/ads/zzdk;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzg:Ljava/util/concurrent/CopyOnWriteArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    :try_start_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzv;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzs;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zze:Landroid/os/Handler;

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzdk;->zza()Lcom/google/android/gms/internal/ads/zzdl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzp:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    if-eqz p2, :cond_5

    .line 16
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/gms/internal/ads/zzff;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzj:Landroid/util/Pair;

    .line 17
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/view/Surface;

    .line 18
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzff;->zzb()I

    .line 19
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzff;->zza()I

    .line 17
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzdl;->zzh()V

    .line 20
    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzyl;->zzi(Lcom/google/android/gms/internal/ads/zzam;)V

    return v1

    :catch_0
    move-exception p2

    .line 21
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzym;

    const/16 v0, 0x1b58

    .line 22
    invoke-static {p3, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzym;->zzaB(Lcom/google/android/gms/internal/ads/zzym;Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;I)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object p1

    throw p1
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzam;JZ)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzk:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    xor-int/2addr v0, v2

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zza()I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzk:I

    if-ge v0, v3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzf:Lcom/google/android/gms/internal/ads/zzdl;

    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdl;->zzd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzi:Landroid/util/Pair;

    if-nez v0, :cond_1

    .line 6
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzi:Landroid/util/Pair;

    goto :goto_1

    .line 7
    :cond_1
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzd:Ljava/util/ArrayDeque;

    .line 8
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    if-eqz p4, :cond_3

    .line 6
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzm:Z

    :cond_3
    return v2

    :cond_4
    return v1
.end method
