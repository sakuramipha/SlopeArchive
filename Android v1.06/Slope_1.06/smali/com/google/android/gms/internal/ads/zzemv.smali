.class public final Lcom/google/android/gms/internal/ads/zzemv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemv;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgvw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 3
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzdoc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzcuz;

    .line 4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcuz;->zza()Lcom/google/android/gms/internal/ads/zzfaa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzemv;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 3
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzemt;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzemt;-><init>(Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzdoc;Lcom/google/android/gms/internal/ads/zzfaa;Ljava/lang/String;)V

    return-object v4
.end method
