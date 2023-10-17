.class final Lcom/google/android/gms/internal/ads/zzevk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeju;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzevl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzevl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzevl;->zza:Lcom/google/android/gms/internal/ads/zzcox;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcox;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzevl;->zza:Lcom/google/android/gms/internal/ads/zzcox;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzb()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    iput-object p1, v1, Lcom/google/android/gms/internal/ads/zzevl;->zza:Lcom/google/android/gms/internal/ads/zzcox;

    .line 3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzcox;->zzc(Lcom/google/android/gms/internal/ads/zzavl;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevk;->zza:Lcom/google/android/gms/internal/ads/zzevl;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevl;->zzm(Lcom/google/android/gms/internal/ads/zzevl;)Lcom/google/android/gms/internal/ads/zzevd;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcoy;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevl;->zzm(Lcom/google/android/gms/internal/ads/zzevl;)Lcom/google/android/gms/internal/ads/zzevd;

    move-result-object v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevl;->zzh(Lcom/google/android/gms/internal/ads/zzevl;)Lcom/google/android/gms/internal/ads/zzdqc;

    move-result-object v5

    .line 4
    invoke-direct {v3, p1, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzcoy;-><init>(Lcom/google/android/gms/internal/ads/zzcox;Lcom/google/android/gms/ads/internal/client/zzbu;Lcom/google/android/gms/internal/ads/zzevd;Lcom/google/android/gms/internal/ads/zzdqc;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzevd;->zzl(Lcom/google/android/gms/internal/ads/zzavr;)V

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzj()V

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
