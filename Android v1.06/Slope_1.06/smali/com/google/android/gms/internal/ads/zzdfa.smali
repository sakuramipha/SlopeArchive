.class public final Lcom/google/android/gms/internal/ads/zzdfa;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchc;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchc;->zza()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdel;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdel;->zza()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcrv;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrv;->zza()Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchn;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchn;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdfa;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/ads/zzaxh;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdez;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdez;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzaxh;)V

    return-object v0
.end method
