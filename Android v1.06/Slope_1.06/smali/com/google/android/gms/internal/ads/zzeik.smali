.class final Lcom/google/android/gms/internal/ads/zzeik;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeju;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzeil;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzeil;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzeil;->zzc(Lcom/google/android/gms/internal/ads/zzeil;Lcom/google/android/gms/internal/ads/zzcpd;)V

    .line 2
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
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcpd;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeil;->zzb(Lcom/google/android/gms/internal/ads/zzeil;)Lcom/google/android/gms/internal/ads/zzcpd;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeil;->zzb(Lcom/google/android/gms/internal/ads/zzeil;)Lcom/google/android/gms/internal/ads/zzcpd;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzb()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    .line 3
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzeil;->zzc(Lcom/google/android/gms/internal/ads/zzeil;Lcom/google/android/gms/internal/ads/zzcpd;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeik;->zza:Lcom/google/android/gms/internal/ads/zzeil;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzeil;->zzb(Lcom/google/android/gms/internal/ads/zzeil;)Lcom/google/android/gms/internal/ads/zzcpd;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzj()V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
