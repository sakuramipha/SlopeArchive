.class final Lcom/google/android/gms/internal/ads/zzblz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcap;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbmj;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfff;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzbmk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbmk;Lcom/google/android/gms/internal/ads/zzbmj;Lcom/google/android/gms/internal/ads/zzfff;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzblz;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzblf;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbmk;->zzf(Lcom/google/android/gms/internal/ads/zzbmk;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbmk;->zzh(Lcom/google/android/gms/internal/ads/zzbmk;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zzc(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzbmj;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzblz;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zzc(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzbmj;

    move-result-object v0

    if-eq v1, v0, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zzc(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzbmj;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbmj;->zzb()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzblz;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbmk;->zzg(Lcom/google/android/gms/internal/ads/zzbmk;Lcom/google/android/gms/internal/ads/zzbmj;)V

    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcw;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzc:Lcom/google/android/gms/internal/ads/zzbmk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zze(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbmk;->zze(Lcom/google/android/gms/internal/ads/zzbmk;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzblz;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    const/4 v2, 0x1

    .line 7
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzfff;->zzl()Lcom/google/android/gms/internal/ads/zzffj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfft;->zzb(Lcom/google/android/gms/internal/ads/zzffj;)V

    .line 8
    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
