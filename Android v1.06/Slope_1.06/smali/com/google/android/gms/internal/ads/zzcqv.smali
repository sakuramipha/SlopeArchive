.class public final Lcom/google/android/gms/internal/ads/zzcqv;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcrv;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrv;->zza()Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 2
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzcwa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqv;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzcxf;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcqu;

    .line 3
    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcqu;-><init>(Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzcwa;Lcom/google/android/gms/internal/ads/zzcxf;)V

    return-object v3
.end method
