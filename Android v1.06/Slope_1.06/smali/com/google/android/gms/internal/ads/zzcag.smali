.class public final Lcom/google/android/gms/internal/ads/zzcag;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzfwc;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzfwc;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzfwc;

.field public static final zzd:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzfwc;

.field public static final zzf:Lcom/google/android/gms/internal/ads/zzfwc;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/util/ClientLibraryUtils;->isPackageSide()Z

    move-result v0

    const-string v1, "Default"

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzflu;->zza()Lcom/google/android/gms/internal/ads/zzflr;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcac;

    .line 3
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x2

    const v3, 0x7fffffff

    const-wide/16 v4, 0xa

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/ads/zzcac;

    .line 6
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    .line 7
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 4
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcaf;

    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcaf;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcae;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 9
    invoke-static {}, Lcom/google/android/gms/common/util/ClientLibraryUtils;->isPackageSide()Z

    move-result v0

    const-string v1, "Loader"

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzflu;->zza()Lcom/google/android/gms/internal/ads/zzflr;

    move-result-object v0

    const/4 v4, 0x5

    new-instance v5, Lcom/google/android/gms/internal/ads/zzcac;

    .line 11
    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-interface {v0, v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzflr;->zzc(ILjava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_1

    .line 25
    :cond_1
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v5, 0x5

    const/4 v6, 0x5

    const-wide/16 v7, 0xa

    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 13
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzcac;

    .line 14
    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 15
    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 16
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 12
    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcaf;

    .line 17
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcaf;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcae;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 18
    invoke-static {}, Lcom/google/android/gms/common/util/ClientLibraryUtils;->isPackageSide()Z

    move-result v0

    const-string v1, "Activeview"

    if-eqz v0, :cond_2

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzflu;->zza()Lcom/google/android/gms/internal/ads/zzflr;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/internal/ads/zzcac;

    .line 20
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-interface {v0, v4, v3}, Lcom/google/android/gms/internal/ads/zzflr;->zzb(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_2

    .line 33
    :cond_2
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v5, 0x1

    const/4 v6, 0x1

    const-wide/16 v7, 0xa

    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 22
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzcac;

    .line 23
    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 24
    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 25
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 21
    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcaf;

    .line 26
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcaf;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcae;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zzc:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 27
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcab;

    const/4 v1, 0x3

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcac;

    const-string v4, "Schedule"

    .line 28
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzcac;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzcab;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcad;

    .line 30
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcad;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcaf;

    .line 31
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcaf;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcae;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zze:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfwi;->zzb()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcaf;

    .line 33
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcaf;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcae;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    return-void
.end method
