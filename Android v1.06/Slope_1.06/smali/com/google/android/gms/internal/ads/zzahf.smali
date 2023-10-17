.class final Lcom/google/android/gms/internal/ads/zzahf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzabn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzahg;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzahg;Lcom/google/android/gms/internal/ads/zzahe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahf;->zza:Lcom/google/android/gms/internal/ads/zzahg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahf;->zza:Lcom/google/android/gms/internal/ads/zzahg;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzf(Lcom/google/android/gms/internal/ads/zzahg;)Lcom/google/android/gms/internal/ads/zzahs;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzc(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzahs;->zzf(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/ads/zzabl;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahf;->zza:Lcom/google/android/gms/internal/ads/zzahg;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzf(Lcom/google/android/gms/internal/ads/zzahg;)Lcom/google/android/gms/internal/ads/zzahs;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzahs;->zzg(J)J

    move-result-wide v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzb(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zza(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v5

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzb(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v7

    sub-long/2addr v5, v7

    mul-long v1, v1, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzc(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v5

    div-long/2addr v1, v5

    add-long/2addr v3, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzb(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zza(Lcom/google/android/gms/internal/ads/zzahg;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    add-long/2addr v5, v7

    const-wide/16 v7, -0x7530

    add-long/2addr v3, v7

    .line 2
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    new-instance v2, Lcom/google/android/gms/internal/ads/zzabl;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzabo;

    .line 3
    invoke-direct {v3, p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzabo;-><init>(JJ)V

    invoke-direct {v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    return-object v2
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
