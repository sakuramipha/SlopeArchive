.class public final Lcom/google/android/gms/internal/ads/zzdli;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdli;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdli;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchc;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchc;->zza()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzdhv;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhv;->zza()Lcom/google/android/gms/internal/ads/zzdhc;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzdid;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdid;->zza()Lcom/google/android/gms/internal/ads/zzdic;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdli;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 4
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzdgx;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzdlh;

    .line 5
    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzdlh;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdhc;Lcom/google/android/gms/internal/ads/zzdic;Lcom/google/android/gms/internal/ads/zzdgx;)V

    return-object v4
.end method
