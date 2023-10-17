.class public final Lcom/google/android/gms/internal/ads/zzdnm;
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

.field private final zzf:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzf:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzg:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzh:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 10

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcfn;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcfn;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaqq;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/zzbcm;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzchn;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchn;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zza;->zza()Lcom/google/android/gms/ads/internal/zza;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzg:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/android/gms/internal/ads/zzawx;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdnm;->zzh:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/internal/ads/zzcxx;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzdnk;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzdnk;-><init>(Lcom/google/android/gms/internal/ads/zzcfn;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaqq;Lcom/google/android/gms/internal/ads/zzbcm;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzawx;Lcom/google/android/gms/internal/ads/zzcxx;)V

    return-object v9
.end method
