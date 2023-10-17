.class final Lcom/google/android/gms/internal/ads/zzfss;
.super Lcom/google/android/gms/internal/ads/zzfsr;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfst;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfst;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfss;->zza:Lcom/google/android/gms/internal/ads/zzfst;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfsr;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfsc;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfss;->zza:Lcom/google/android/gms/internal/ads/zzfst;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfst;->zza()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfsq;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfsq;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfsw;

    .line 2
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfsw;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzfpp;)V

    return-object v2
.end method
