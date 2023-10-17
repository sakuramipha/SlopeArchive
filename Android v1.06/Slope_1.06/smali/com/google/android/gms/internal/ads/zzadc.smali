.class final Lcom/google/android/gms/internal/ads/zzadc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzabn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzabn;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzadd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzadd;Lcom/google/android/gms/internal/ads/zzabn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzadc;->zzb:Lcom/google/android/gms/internal/ads/zzadd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzadc;->zza:Lcom/google/android/gms/internal/ads/zzabn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadc;->zza:Lcom/google/android/gms/internal/ads/zzabn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzabn;->zze()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/ads/zzabl;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadc;->zza:Lcom/google/android/gms/internal/ads/zzabn;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzabn;->zzg(J)Lcom/google/android/gms/internal/ads/zzabl;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzabl;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzabo;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzabl;->zza:Lcom/google/android/gms/internal/ads/zzabo;

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzabo;->zzb:J

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzabo;->zzc:J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzadc;->zzb:Lcom/google/android/gms/internal/ads/zzadd;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzadd;->zza(Lcom/google/android/gms/internal/ads/zzadd;)J

    move-result-wide v6

    add-long/2addr v4, v6

    .line 2
    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzabo;-><init>(JJ)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzabo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzabl;->zzb:Lcom/google/android/gms/internal/ads/zzabo;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzabo;->zzb:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzabo;->zzc:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzadc;->zzb:Lcom/google/android/gms/internal/ads/zzadd;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzadd;->zza(Lcom/google/android/gms/internal/ads/zzadd;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzabo;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    return-object p2
.end method

.method public final zzh()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadc;->zza:Lcom/google/android/gms/internal/ads/zzabn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzabn;->zzh()Z

    move-result v0

    return v0
.end method
