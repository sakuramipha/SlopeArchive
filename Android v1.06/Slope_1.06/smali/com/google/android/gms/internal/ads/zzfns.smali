.class final Lcom/google/android/gms/internal/ads/zzfns;
.super Lcom/google/android/gms/internal/ads/zzfnp;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfnp;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfnz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfnz;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/ads/zzfnp;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfns;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzb:Lcom/google/android/gms/internal/ads/zzfnp;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzfnp;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfnz;->zzg(Lcom/google/android/gms/internal/ads/zzfnz;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfns;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfnz;->zzn(Lcom/google/android/gms/internal/ads/zzfnz;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfnz;->zzi(Lcom/google/android/gms/internal/ads/zzfnz;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfnz;->zzf(Lcom/google/android/gms/internal/ads/zzfnz;)Lcom/google/android/gms/internal/ads/zzfno;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfno;->zzc(Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzc:Lcom/google/android/gms/internal/ads/zzfnz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfns;->zzb:Lcom/google/android/gms/internal/ads/zzfnp;

    .line 4
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfnz;->zzp(Lcom/google/android/gms/internal/ads/zzfnz;Lcom/google/android/gms/internal/ads/zzfnp;)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
