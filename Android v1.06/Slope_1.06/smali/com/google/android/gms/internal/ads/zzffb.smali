.class public final Lcom/google/android/gms/internal/ads/zzffb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffb;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzffb;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfex;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfex;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzffb;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfew;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfew;->zza()Lcom/google/android/gms/internal/ads/zzfev;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzffa;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzffa;-><init>(Lcom/google/android/gms/internal/ads/zzfex;Lcom/google/android/gms/internal/ads/zzfev;)V

    return-object v2
.end method
