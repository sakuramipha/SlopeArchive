.class public final Lcom/google/android/gms/internal/ads/zzehg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzf;


# instance fields
.field final zza:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcvg;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcwa;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzdcy;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdcq;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzcnz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcvg;Lcom/google/android/gms/internal/ads/zzcwa;Lcom/google/android/gms/internal/ads/zzdcy;Lcom/google/android/gms/internal/ads/zzdcq;Lcom/google/android/gms/internal/ads/zzcnz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzb:Lcom/google/android/gms/internal/ads/zzcvg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzc:Lcom/google/android/gms/internal/ads/zzcwa;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzd:Lcom/google/android/gms/internal/ads/zzdcy;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzehg;->zze:Lcom/google/android/gms/internal/ads/zzdcq;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzf:Lcom/google/android/gms/internal/ads/zzcnz;

    return-void
.end method


# virtual methods
.method public final declared-synchronized zza(Landroid/view/View;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzf:Lcom/google/android/gms/internal/ads/zzcnz;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zzl()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zze:Lcom/google/android/gms/internal/ads/zzdcq;

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdcq;->zza(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzb:Lcom/google/android/gms/internal/ads/zzcvg;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcvg;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zza:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzc:Lcom/google/android/gms/internal/ads/zzcwa;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcwa;->zza()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehg;->zzd:Lcom/google/android/gms/internal/ads/zzdcy;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdcy;->zza()V

    :cond_0
    return-void
.end method
