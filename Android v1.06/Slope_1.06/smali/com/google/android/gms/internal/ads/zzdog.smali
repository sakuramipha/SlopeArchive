.class public final Lcom/google/android/gms/internal/ads/zzdog;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdog;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdog;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdog;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchc;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchc;->zza()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzdur;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdur;->zza()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzchn;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchn;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdog;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 4
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaxh;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdog;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzawx;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzaxd;

    .line 5
    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/zzaxd;-><init>(Landroid/content/Context;)V

    invoke-direct {v5, v6}, Lcom/google/android/gms/internal/ads/zzawx;-><init>(Lcom/google/android/gms/internal/ads/zzaxd;)V

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzazx;->zza()Lcom/google/android/gms/internal/ads/zzazw;

    move-result-object v0

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbzz;->zzb:I

    .line 7
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzazw;->zza(I)Lcom/google/android/gms/internal/ads/zzazw;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:I

    .line 8
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzazw;->zzc(I)Lcom/google/android/gms/internal/ads/zzazw;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzbzz;->zzd:Z

    const/4 v6, 0x1

    if-eq v6, v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 9
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzazw;->zzb(I)Lcom/google/android/gms/internal/ads/zzazw;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzazx;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdof;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/google/android/gms/internal/ads/zzdof;-><init>(Lcom/google/android/gms/internal/ads/zzaxh;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzazx;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzawx;->zzb(Lcom/google/android/gms/internal/ads/zzaww;)V

    return-object v5
.end method
