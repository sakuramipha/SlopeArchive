.class public final Lcom/google/android/gms/internal/ads/zzfeu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfeu;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfeu;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfeu;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfeu;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfek;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfex;

    .line 2
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfex;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfeu;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzfew;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfew;->zza()Lcom/google/android/gms/internal/ads/zzfev;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfet;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfet;-><init>(Lcom/google/android/gms/internal/ads/zzfek;Lcom/google/android/gms/internal/ads/zzfex;Lcom/google/android/gms/internal/ads/zzfev;)V

    return-object v3
.end method
