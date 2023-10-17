.class public final Lcom/google/android/gms/internal/ads/zzddm;
.super Lcom/google/android/gms/internal/ads/zzdas;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zzb:Z


# direct methods
.method protected constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdas;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzddi;->zza:Lcom/google/android/gms/internal/ads/zzddi;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzddk;->zza:Lcom/google/android/gms/internal/ads/zzddk;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    return-void
.end method

.method public final declared-synchronized zzc()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzddm;->zzb:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzddj;->zza:Lcom/google/android/gms/internal/ads/zzddj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzddm;->zzb:Z

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzddl;->zza:Lcom/google/android/gms/internal/ads/zzddl;

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzd()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzddj;->zza:Lcom/google/android/gms/internal/ads/zzddj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzddm;->zzb:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
