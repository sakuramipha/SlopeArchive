.class public final Lcom/google/android/gms/internal/ads/zzcqx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcxx;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdae;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcxx;Lcom/google/android/gms/internal/ads/zzdae;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqx;->zza:Lcom/google/android/gms/internal/ads/zzcxx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcqx;->zzb:Lcom/google/android/gms/internal/ads/zzdae;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcxx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqx;->zza:Lcom/google/android/gms/internal/ads/zzcxx;

    return-object v0
.end method

.method final zzb()Lcom/google/android/gms/internal/ads/zzdae;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqx;->zzb:Lcom/google/android/gms/internal/ads/zzdae;

    return-object v0
.end method

.method final zzc()Lcom/google/android/gms/internal/ads/zzdco;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqx;->zzb:Lcom/google/android/gms/internal/ads/zzdae;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdco;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdco;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcqw;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzcqw;-><init>(Lcom/google/android/gms/internal/ads/zzcqx;)V

    .line 2
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
