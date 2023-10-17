.class public final Lcom/google/android/gms/internal/ads/zzdqh;
.super Lcom/google/android/gms/internal/ads/zzdqj;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final zzf:Lcom/google/android/gms/internal/ads/zzfev;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzbzy;Lcom/google/android/gms/internal/ads/zzfev;Lcom/google/android/gms/internal/ads/zzfex;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/ads/zzdqj;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzbzy;Lcom/google/android/gms/internal/ads/zzfex;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdqh;->zzf:Lcom/google/android/gms/internal/ads/zzfev;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqh;->zzb:Ljava/util/Map;

    .line 2
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzfev;->zza(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdqh;->zzb:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
