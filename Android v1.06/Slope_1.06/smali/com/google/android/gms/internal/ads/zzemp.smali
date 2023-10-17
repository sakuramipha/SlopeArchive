.class public final Lcom/google/android/gms/internal/ads/zzemp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeqq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfwc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfwc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemp;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x37

    return v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzemp;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzemo;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzemo;-><init>(Lcom/google/android/gms/internal/ads/zzemp;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfwc;->zzb(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method
