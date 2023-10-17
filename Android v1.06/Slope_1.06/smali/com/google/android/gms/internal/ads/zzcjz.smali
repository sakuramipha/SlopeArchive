.class final Lcom/google/android/gms/internal/ads/zzcjz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdrl;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbjf;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcir;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcjz;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbjf;Lcom/google/android/gms/internal/ads/zzcjy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzd:Lcom/google/android/gms/internal/ads/zzcjz;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzc:Lcom/google/android/gms/internal/ads/zzcir;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zza:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzb:Lcom/google/android/gms/internal/ads/zzbjf;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 2
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzf:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzdrh;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/zzdrh;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzg:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdrj;

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/ads/zzdrj;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V

    .line 3
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgvn;->zzc(Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgwb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzh:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzcjz;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zza:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzcjz;)Lcom/google/android/gms/internal/ads/zzdrg;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzb:Lcom/google/android/gms/internal/ads/zzbjf;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdrh;->zzc(Lcom/google/android/gms/internal/ads/zzbjf;)Lcom/google/android/gms/internal/ads/zzdrg;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zzb()Lcom/google/android/gms/internal/ads/zzdrc;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcjt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzc:Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzd:Lcom/google/android/gms/internal/ads/zzcjz;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcjt;-><init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcjz;Lcom/google/android/gms/internal/ads/zzcjs;)V

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzdri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjz;->zzh:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdri;

    return-object v0
.end method
