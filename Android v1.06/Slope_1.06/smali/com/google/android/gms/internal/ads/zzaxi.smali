.class public final Lcom/google/android/gms/internal/ads/zzaxi;
.super Lcom/google/android/gms/internal/ads/zzgos;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxj;->zza()Lcom/google/android/gms/internal/ads/zzaxj;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaxe;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxj;->zza()Lcom/google/android/gms/internal/ads/zzaxj;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaxh;)Lcom/google/android/gms/internal/ads/zzaxi;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxi;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxj;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxj;->zze(Lcom/google/android/gms/internal/ads/zzaxj;Lcom/google/android/gms/internal/ads/zzaxh;)V

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaya;)Lcom/google/android/gms/internal/ads/zzaxi;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxi;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzayb;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxj;->zzf(Lcom/google/android/gms/internal/ads/zzaxj;Lcom/google/android/gms/internal/ads/zzayb;)V

    return-object p0
.end method
