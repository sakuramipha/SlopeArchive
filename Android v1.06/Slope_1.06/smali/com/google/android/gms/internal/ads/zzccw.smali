.class public final Lcom/google/android/gms/internal/ads/zzccw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfx;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfx;

.field private final zzc:Ljava/lang/String;

.field private final zzd:I

.field private final zze:Z

.field private zzf:Ljava/io/InputStream;

.field private zzg:Z

.field private zzh:Landroid/net/Uri;

.field private volatile zzi:Lcom/google/android/gms/internal/ads/zzawj;

.field private zzj:Z

.field private zzk:Z

.field private final zzl:Ljava/util/concurrent/atomic/AtomicLong;

.field private zzm:Lcom/google/android/gms/internal/ads/zzgc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfx;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzgz;Lcom/google/android/gms/internal/ads/zzccv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzb:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzc:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzd:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzj:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzk:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, -0x1

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzl:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbJ:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zze:Z

    return-void
.end method

.method private final zzg()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zze:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzeb:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzj:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzec:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzk:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    return v1
.end method


# virtual methods
.method public final zza([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzg:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzf:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzb:Lcom/google/android/gms/internal/ads/zzfx;

    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfx;->zza([BII)I

    move-result p1

    :goto_0
    return p1

    .line 1
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Attempt to read closed CacheDataSource."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzgc;)J
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzg:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzg:Z

    .line 2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzgc;->zza:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzh:Landroid/net/Uri;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzm:Lcom/google/android/gms/internal/ads/zzgc;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzgc;->zza:Landroid/net/Uri;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawj;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzawj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzdY:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    .line 6
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzf:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzawj;->zzh:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzc:Ljava/lang/String;

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfpo;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/zzawj;->zzi:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzd:I

    .line 8
    iput v0, p1, Lcom/google/android/gms/internal/ads/zzawj;->zzj:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    .line 9
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/zzawj;->zzg:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzea:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Long;

    goto :goto_0

    .line 36
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzdZ:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Long;

    .line 9
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 14
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzd()Lcom/google/android/gms/internal/ads/zzawu;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zza:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzawu;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzawj;)Ljava/util/concurrent/Future;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 16
    invoke-interface {p1, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzawv;

    .line 17
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzawv;->zzd()Z

    .line 18
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzawv;->zzf()Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzj:Z

    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzawv;->zze()Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzk:Z

    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzawv;->zza()J

    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzccw;->zzg()Z

    move-result v3

    if-nez v3, :cond_1

    .line 22
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzawv;->zzc()Ljava/io/InputStream;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzf:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 26
    throw v1

    .line 25
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 26
    throw v1

    .line 23
    :catch_0
    :try_start_1
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 26
    throw v1

    .line 27
    :catch_1
    :try_start_2
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 26
    throw v1

    .line 25
    :catchall_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    .line 26
    throw v1

    .line 35
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    .line 28
    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzf:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzawj;->zzh:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzc:Ljava/lang/String;

    .line 29
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfpo;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzawj;->zzi:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzd:I

    .line 30
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzawj;->zzj:I

    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/internal/ads/zzawf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzawf;->zzb(Lcom/google/android/gms/internal/ads/zzawj;)Lcom/google/android/gms/internal/ads/zzawg;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzawg;->zze()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzg()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzj:Z

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzf()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzk:Z

    .line 32
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzccw;->zzg()Z

    move-result v0

    if-nez v0, :cond_4

    .line 36
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzc()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzf:Ljava/io/InputStream;

    const-wide/16 v0, -0x1

    return-wide v0

    .line 26
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzi:Lcom/google/android/gms/internal/ads/zzawj;

    .line 33
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzawj;->zza:Ljava/lang/String;

    .line 34
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzc:[B

    const/4 v3, 0x0

    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzgc;->zze:J

    iget-wide v6, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzf:J

    iget-wide v8, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzg:J

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzh:Ljava/lang/String;

    const/4 v10, 0x0

    iget v11, p1, Lcom/google/android/gms/internal/ads/zzgc;->zzi:I

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzgc;-><init>(Landroid/net/Uri;[BJJJLjava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzm:Lcom/google/android/gms/internal/ads/zzgc;

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzb:Lcom/google/android/gms/internal/ads/zzfx;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzm:Lcom/google/android/gms/internal/ads/zzgc;

    .line 35
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzfx;->zzb(Lcom/google/android/gms/internal/ads/zzgc;)J

    move-result-wide v0

    return-wide v0

    .line 1
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Attempt to open an already open CacheDataSource."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzh:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzd()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzg:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzg:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzh:Landroid/net/Uri;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzf:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 2
    invoke-static {v1}, Lcom/google/android/gms/common/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzf:Ljava/io/InputStream;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzccw;->zzb:Lcom/google/android/gms/internal/ads/zzfx;

    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfx;->zzd()V

    return-void

    .line 1
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Attempt to close an already closed CacheDataSource."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic zze()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzgz;)V
    .locals 0

    return-void
.end method
