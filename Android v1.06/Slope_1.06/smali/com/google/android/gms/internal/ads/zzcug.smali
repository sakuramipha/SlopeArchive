.class public final Lcom/google/android/gms/internal/ads/zzcug;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcug;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcug;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcug;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcug;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcug;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcwa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcug;->zzb:Lcom/google/android/gms/internal/ads/zzgwb;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzcrv;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcrv;->zza()Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcug;->zzc:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 1
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 4
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgvw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzcuf;

    .line 5
    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcuf;-><init>(Lcom/google/android/gms/internal/ads/zzcwa;Lcom/google/android/gms/internal/ads/zzezf;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v4
.end method