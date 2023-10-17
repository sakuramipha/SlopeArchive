.class public final synthetic Lcom/google/android/gms/internal/ads/zzdos;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaww;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzezr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzezr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdos;->zza:Lcom/google/android/gms/internal/ads/zzezr;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaym;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdos;->zza:Lcom/google/android/gms/internal/ads/zzezr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaym;->zza()Lcom/google/android/gms/internal/ads/zzaxj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaB()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaxi;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaym;->zza()Lcom/google/android/gms/internal/ads/zzaxj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaxj;->zzd()Lcom/google/android/gms/internal/ads/zzayb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgow;->zzaB()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaya;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezq;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezi;->zzb:Ljava/lang/String;

    .line 3
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzaya;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaya;

    .line 4
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzaxi;->zzb(Lcom/google/android/gms/internal/ads/zzaya;)Lcom/google/android/gms/internal/ads/zzaxi;

    .line 5
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzaym;->zze(Lcom/google/android/gms/internal/ads/zzaxi;)Lcom/google/android/gms/internal/ads/zzaym;

    return-void
.end method
