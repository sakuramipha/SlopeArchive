.class public final Lcom/google/android/gms/internal/ads/zzddf;
.super Lcom/google/android/gms/internal/ads/zzdas;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbix;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdas;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbvi;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzddc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzddc;-><init>(Lcom/google/android/gms/internal/ads/zzbvi;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdde;->zza:Lcom/google/android/gms/internal/ads/zzdde;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzdas;->zzp(Lcom/google/android/gms/internal/ads/zzdar;)V

    return-void
.end method

.method public final declared-synchronized zzc()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzddd;->zza:Lcom/google/android/gms/internal/ads/zzddd;

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
