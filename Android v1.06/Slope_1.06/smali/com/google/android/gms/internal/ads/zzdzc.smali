.class public final Lcom/google/android/gms/internal/ads/zzdzc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzdzb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchw;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchw;->zza()Lcom/google/android/gms/internal/ads/zzbur;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdzb;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzdzb;-><init>(Lcom/google/android/gms/internal/ads/zzbur;)V

    return-object v1
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdzc;->zza()Lcom/google/android/gms/internal/ads/zzdzb;

    move-result-object v0

    return-object v0
.end method