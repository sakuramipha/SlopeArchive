.class final Lcom/google/android/gms/internal/ads/zzbma;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcan;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbmj;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfff;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzbmk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbmk;Lcom/google/android/gms/internal/ads/zzbmj;Lcom/google/android/gms/internal/ads/zzfff;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zzf(Lcom/google/android/gms/internal/ads/zzbmk;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzbmk;->zzh(Lcom/google/android/gms/internal/ads/zzbmk;I)V

    const-string v1, "Failed loading new engine. Marking new engine destroyable."

    .line 2
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbmj;->zzb()V

    .line 4
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbcw;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbmk;->zze(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbmk;->zze(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    const-string v3, "Failed loading new engine"

    .line 5
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzfff;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfff;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzfff;->zzl()Lcom/google/android/gms/internal/ads/zzffj;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfft;->zzb(Lcom/google/android/gms/internal/ads/zzffj;)V

    .line 7
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
