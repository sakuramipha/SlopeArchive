.class final Lcom/google/android/gms/internal/ads/zzdsc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzdse;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdse;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzdse;->zzi(Lcom/google/android/gms/internal/ads/zzdse;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    const-string v0, "com.google.android.gms.ads.MobileAds"

    const/4 v1, 0x0

    const-string v2, "Internal Error."

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v3

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzdse;->zza(Lcom/google/android/gms/internal/ads/zzdse;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    long-to-int v4, v3

    .line 3
    invoke-static {p1, v0, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzdse;->zzk(Lcom/google/android/gms/internal/ads/zzdse;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdse;->zzb(Lcom/google/android/gms/internal/ads/zzdse;)Lcom/google/android/gms/internal/ads/zzcal;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    .line 4
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    check-cast p1, Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    const/4 v1, 0x1

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzdse;->zzi(Lcom/google/android/gms/internal/ads/zzdse;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    const-string v2, "com.google.android.gms.ads.MobileAds"

    const-string v3, ""

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzdse;->zza(Lcom/google/android/gms/internal/ads/zzdse;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-int v5, v4

    .line 4
    invoke-static {v0, v2, v1, v3, v5}, Lcom/google/android/gms/internal/ads/zzdse;->zzk(Lcom/google/android/gms/internal/ads/zzdse;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsc;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdse;->zzh(Lcom/google/android/gms/internal/ads/zzdse;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdsb;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzdsb;-><init>(Lcom/google/android/gms/internal/ads/zzdsc;Ljava/lang/String;)V

    .line 5
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method