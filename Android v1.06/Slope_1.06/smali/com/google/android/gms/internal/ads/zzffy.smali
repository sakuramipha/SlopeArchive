.class public final Lcom/google/android/gms/internal/ads/zzffy;
.super Lcom/google/android/gms/internal/ads/zzgos;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfgb;->zzd()Lcom/google/android/gms/internal/ads/zzfgb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzffx;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfgb;->zzd()Lcom/google/android/gms/internal/ads/zzfgb;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffy;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfgb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfgb;->zza()I

    move-result v0

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzffz;)Lcom/google/android/gms/internal/ads/zzffy;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffy;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfgb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfga;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzfgb;->zzf(Lcom/google/android/gms/internal/ads/zzfgb;Lcom/google/android/gms/internal/ads/zzfga;)V

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzffy;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffy;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfgb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfgb;->zze(Lcom/google/android/gms/internal/ads/zzfgb;)V

    return-object p0
.end method
