.class public final Lcom/google/android/gms/internal/ads/zzaxc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzaxd;

.field private final zzb:[B

.field private zzc:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaxd;[BLcom/google/android/gms/internal/ads/zzaxb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zzb:[B

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/ads/zzaxc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaxc;->zzd()V

    return-void
.end method

.method private final declared-synchronized zzd()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zzb:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zza:Lcom/google/android/gms/internal/ads/zzatt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zzb:[B

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzatt;->zzj([B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zza:Lcom/google/android/gms/internal/ads/zzatt;

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzatt;->zzi(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zza:Lcom/google/android/gms/internal/ads/zzatt;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zzc:I

    .line 3
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzatt;->zzg(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zza:Lcom/google/android/gms/internal/ads/zzatt;

    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzatt;->zzh([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaxd;->zza:Lcom/google/android/gms/internal/ads/zzatt;

    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzatt;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Clearcut log failed"

    .line 6
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzf(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/ads/zzaxc;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zzc:I

    return-object p0
.end method

.method public final declared-synchronized zzc()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxc;->zza:Lcom/google/android/gms/internal/ads/zzaxd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaxd;->zza(Lcom/google/android/gms/internal/ads/zzaxd;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaxa;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzaxa;-><init>(Lcom/google/android/gms/internal/ads/zzaxc;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
