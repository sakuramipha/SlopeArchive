.class public final Lcom/google/android/gms/internal/ads/zzcpt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcpk;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcpk;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcpt;->zza:Lcom/google/android/gms/internal/ads/zzcpk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcpt;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcpt;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcqs;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcpk;->zzh(Lcom/google/android/gms/internal/ads/zzcqs;)Lcom/google/android/gms/internal/ads/zzdco;

    move-result-object v0

    return-object v0
.end method
