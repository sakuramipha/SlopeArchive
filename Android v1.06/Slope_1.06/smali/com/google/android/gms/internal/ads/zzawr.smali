.class final Lcom/google/android/gms/internal/ads/zzawr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/common/internal/BaseGmsClient$BaseConnectionCallbacks;


# static fields
.field public static final synthetic zzd:I


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzawj;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcal;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzawt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzawt;Lcom/google/android/gms/internal/ads/zzawj;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzc:Lcom/google/android/gms/internal/ads/zzawt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzawr;->zza:Lcom/google/android/gms/internal/ads/zzawj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzb:Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzc:Lcom/google/android/gms/internal/ads/zzawt;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzb(Lcom/google/android/gms/internal/ads/zzawt;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzc:Lcom/google/android/gms/internal/ads/zzawt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawt;->zzf(Lcom/google/android/gms/internal/ads/zzawt;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzawt;->zzd(Lcom/google/android/gms/internal/ads/zzawt;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzc:Lcom/google/android/gms/internal/ads/zzawt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawt;->zza(Lcom/google/android/gms/internal/ads/zzawt;)Lcom/google/android/gms/internal/ads/zzawi;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p1

    return-void

    .line 3
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzawr;->zza:Lcom/google/android/gms/internal/ads/zzawj;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzb:Lcom/google/android/gms/internal/ads/zzcal;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzawo;

    invoke-direct {v4, p0, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzawo;-><init>(Lcom/google/android/gms/internal/ads/zzawr;Lcom/google/android/gms/internal/ads/zzawi;Lcom/google/android/gms/internal/ads/zzawj;Lcom/google/android/gms/internal/ads/zzcal;)V

    .line 4
    invoke-interface {v1, v4}, Lcom/google/android/gms/internal/ads/zzfwc;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzawr;->zzb:Lcom/google/android/gms/internal/ads/zzcal;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzawp;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzawp;-><init>(Lcom/google/android/gms/internal/ads/zzcal;Ljava/util/concurrent/Future;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 5
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcal;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 6
    monitor-exit p1

    return-void

    .line 7
    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    .line 6
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
