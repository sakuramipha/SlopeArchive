.class public final Lcom/google/android/gms/internal/ads/zzcve;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcvd;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcvd;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcve;->zza:Lcom/google/android/gms/internal/ads/zzcvd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcve;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchn;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchn;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcve;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcrv;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrv;->zza()Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object v0

    new-instance v6, Lcom/google/android/gms/internal/ads/zzbwq;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzbwq;-><init>()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzB:Lcom/google/android/gms/internal/ads/zzbwr;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    if-nez v1, :cond_0

    move-object v5, v4

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    move-object v5, v1

    :goto_0
    new-instance v7, Lcom/google/android/gms/internal/ads/zzbwp;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzB:Lcom/google/android/gms/internal/ads/zzbwr;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzbwp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzbwr;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbwq;)V

    move-object v4, v7

    :cond_1
    return-object v4
.end method
